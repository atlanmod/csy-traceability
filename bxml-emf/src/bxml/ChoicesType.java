/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choices Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ChoicesType#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getChoicesType()
 * @model extendedMetaData="name='Choices_._type' kind='elementOnly'"
 * @generated
 */
public interface ChoicesType extends EObject {
  /**
   * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
   * The list contents are of type {@link bxml.ChoiceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choice</em>' containment reference list.
   * @see bxml.BxmlPackage#getChoicesType_Choice()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Choice' namespace='##targetNamespace'"
   * @generated
   */
  EList<ChoiceType> getChoice();

} // ChoicesType
