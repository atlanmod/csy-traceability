/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.WhenType#getCondition <em>Condition</em>}</li>
 *   <li>{@link bxml.WhenType#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getWhenType()
 * @model extendedMetaData="name='When_._type' kind='elementOnly'"
 * @generated
 */
public interface WhenType extends EObject {
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(PredicateType)
   * @see bxml.BxmlPackage#getWhenType_Condition()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getCondition();

  /**
   * Sets the value of the '{@link bxml.WhenType#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(PredicateType value);

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
   * @see bxml.BxmlPackage#getWhenType_Then()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Then' namespace='##targetNamespace'"
   * @generated
   */
  SubstitutionType getThen();

  /**
   * Sets the value of the '{@link bxml.WhenType#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(SubstitutionType value);

} // WhenType
