/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Values Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.EnumeratedValuesType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getEnumeratedValuesType()
 * @model extendedMetaData="name='Enumerated_Values_._type' kind='elementOnly'"
 * @generated
 */
public interface EnumeratedValuesType extends EObject {
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference list.
   * The list contents are of type {@link bxml.IdentifierType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference list.
   * @see bxml.BxmlPackage#getEnumeratedValuesType_Id()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  EList<IdentifierType> getId();

} // EnumeratedValuesType