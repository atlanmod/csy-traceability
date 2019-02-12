import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.atlanmod.emfviews.virtuallinks.ContributingModel;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;

public class BuildView {
  static String here = new File(".").getAbsolutePath();

  static URI resourceURI(String relativePath) {
    return URI.createFileURI(here + relativePath);
  }

  static Object eGet(EObject o, String featureName) {
    EStructuralFeature f = o.eClass().getEStructuralFeature(featureName);
    // Throw immediately rather than waiting for other objects to complain
    // about the missing feature
    if (f == null) {
      throw new NullPointerException();
    }
    return o.eGet(f);
  }

  static VirtualAssociation createLink(String name, EObject source, EObject target,
                                       Resource log,
                                       ContributingModel cmodel) {
    var factory = VirtualLinksFactory.eINSTANCE;

    var sourceConcept = factory.createConcreteConcept();
    cmodel.getConcreteElements().add(sourceConcept);
    sourceConcept.setPath(log.getURIFragment(source));

    var targetConcept = factory.createConcreteConcept();
    cmodel.getConcreteElements().add(targetConcept);
    targetConcept.setPath(log.getURIFragment(target));

    var va = factory.createVirtualAssociation();
    va.setName(name);
    va.setSource(sourceConcept);
    va.setTarget(targetConcept);

    return va;
  }

  static Optional<VirtualAssociation> getLastSensor(String sensor,
                                                    List<EObject> events,
                                                    EObject fallbackTrace,
                                                    Resource log,
                                                    ContributingModel cmodel) {
    var current = events.indexOf(fallbackTrace.eContainer());

    var last_sensors = events.stream()
      .limit(current)
      .flatMap(event -> ((EList<EObject>) eGet(event, "traces")).stream())
      .filter(trace -> sensor.equals(eGet(trace, "sensor"))
                    && "Position".equals(eGet(trace, "variable")))
      .collect(Collectors.toList());

    // Take the last one
    if (last_sensors.size() > 0) {
      var last = last_sensors.get(last_sensors.size() - 1);

      // Add it to the weaving model
      var link = createLink(sensor, fallbackTrace, last, log, cmodel);

      return Optional.of(link);
    }

    return Optional.empty();
  }

  public static void main(String[] args) throws IOException {
    Map<String, Object> map = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    map.put("ecore", new EcoreResourceFactoryImpl());
    map.put("xmi", new XMIResourceFactoryImpl());

    // Load Log metamodel and register it
    var LogResource = new ResourceSetImpl()
      .getResource(resourceURI("/../../logs-metamodel/metamodels/Log.ecore"), true);
    var Log = (EPackage) LogResource.getContents().get(0);
    EPackage.Registry.INSTANCE.put(Log.getNsURI(), Log);

    // Load log model
    var log = new ResourceSetImpl()
      .getResource(resourceURI("/../../logs-metamodel/models/shortoutputs.xmi"), true);

    // Create weaving model
    var factory = VirtualLinksFactory.eINSTANCE;
    var wm = factory.createWeavingModel();
    var out = new ResourceSetImpl().createResource(resourceURI("/fallback-weaving.xmi"));
    out.getContents().add(wm);

    // For each trace that has 'fallback', add a virtual link to the nearest M24 and M21 traces
    var root = log.getContents().get(0);
    var events = (EList<EObject>) eGet(root, "events");

    var fallbacks = events.stream()
      .flatMap(event -> ((EList<EObject>) eGet(event, "traces")).stream())
      .filter(trace -> "fallback".equals(eGet(trace, "variable")))
      .collect(Collectors.toList());

    var cmodel = factory.createContributingModel();
    cmodel.setURI("Log");
    wm.getContributingModels().add(cmodel);

    for (var f : fallbacks) {
      // Add a link to this fallback trace to the root element so we can find it easily
      wm.getVirtualLinks().add(createLink("fallbacks", root, f, log, cmodel));

      // Find the nearest M24 sensor trace and add it to the weaving model
      getLastSensor("M24", events, f, log, cmodel)
        .ifPresent(va ->  wm.getVirtualLinks().add(va));

      // Same for M21
      getLastSensor("M21", events, f, log, cmodel)
        .ifPresent(va ->  wm.getVirtualLinks().add(va));
    }

    out.save(null);
  }
}
