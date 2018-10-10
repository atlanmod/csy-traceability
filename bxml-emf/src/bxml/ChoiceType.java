/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ChoiceType#getValue <em>Value</em>}</li>
 *   <li>{@link bxml.ChoiceType#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getChoiceType()
 * @model extendedMetaData="name='Choice_._type' kind='elementOnly'"
 * @generated
 */
public interface ChoiceType extends EObject {
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link bxml.ExpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see bxml.BxmlPackage#getChoiceType_Value()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
   * @generated
   */
  EList<ExpType> getValue();

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(SubstitutionType)
   * @see bxml.BxmlPackage#getChoiceType_Then()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Then' namespace='##targetNamespace'"
   * @generated
   */
  SubstitutionType getThen();

  /**
   * Sets the value of the '{@link bxml.ChoiceType#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(SubstitutionType value);

} // ChoiceType
