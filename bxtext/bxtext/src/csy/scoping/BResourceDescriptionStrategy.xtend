package csy.scoping

import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor
import csy.b.Operation
import csy.b.Definition
import org.eclipse.xtext.EcoreUtil2
import csy.b.Variable
import csy.b.Var

@Singleton
class BResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  override createEObjectDescriptions(EObject e, IAcceptor<IEObjectDescription> acceptor) {
    // Don't index local variables
    if (e instanceof Variable && 
        (EcoreUtil2.getContainerOfType(e, Operation) !== null)
        || (EcoreUtil2.getContainerOfType(e, Definition) !== null)
        || (EcoreUtil2.getContainerOfType(e, Var) !== null)) {
      false
    } else {
      super.createEObjectDescriptions(e, acceptor)
    }
  }
}
