# BXML EMF

Ecore metamodel for XML files created from B code.

With the bxml plugin loaded in Eclipse, you should be able to load a `bxml` file
in a model editor (e.g., the Sample Ecore Model Editor).

Alternatively, to load an XML file using Java:

```java
import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import bxml.impl.BxmlPackageImpl;
import bxml.util.BxmlResourceFactoryImpl;

public class LoadBBis {
  static String here = new File(".").getAbsolutePath();

  static URI resourceURI(String relativePath) {
    return URI.createFileURI(here + relativePath);
  }

  public static void main(String[] args) {
    // Load the Bxml package into the registry
    BxmlPackageImpl.eINSTANCE.eClass();

    // Associate the 'bxml' file extension with the adequate factory
    Map<String, Object> map = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    map.put("bxml", new BxmlResourceFactoryImpl());

    // Load the resource
    Resource r = new ResourceSetImpl().getResource(resourceURI("/xml/Treatment_i.bxml"), true);
    EList<EObject> c = r.getContents();

    // do something with the contents
  }

}

```
