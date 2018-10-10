/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Machine Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ReferencedMachineType2#getReferencedMachine <em>Referenced Machine</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getReferencedMachineType2()
 * @model extendedMetaData="name='referenced_machine_type' kind='elementOnly'"
 * @generated
 */
public interface ReferencedMachineType2 extends EObject {
  /**
   * Returns the value of the '<em><b>Referenced Machine</b></em>' containment reference list.
   * The list contents are of type {@link bxml.ReferencedMachineType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Machine</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Machine</em>' containment reference list.
   * @see bxml.BxmlPackage#getReferencedMachineType2_ReferencedMachine()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Referenced_Machine' namespace='##targetNamespace'"
   * @generated
   */
  EList<ReferencedMachineType> getReferencedMachine();

} // ReferencedMachineType2
