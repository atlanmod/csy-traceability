/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Sub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.AssertSubType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.AssertSubType#getGuard <em>Guard</em>}</li>
 *   <li>{@link bxml.AssertSubType#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getAssertSubType()
 * @model extendedMetaData="name='Assert_Sub_._type' kind='elementOnly'"
 * @generated
 */
public interface AssertSubType extends EObject {
  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(AttributesType)
   * @see bxml.BxmlPackage#getAssertSubType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.AssertSubType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(PredicateType)
   * @see bxml.BxmlPackage#getAssertSubType_Guard()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Guard' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getGuard();

  /**
   * Sets the value of the '{@link bxml.AssertSubType#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(PredicateType value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(SubstitutionType)
   * @see bxml.BxmlPackage#getAssertSubType_Body()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
   * @generated
   */
  SubstitutionType getBody();

  /**
   * Sets the value of the '{@link bxml.AssertSubType#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(SubstitutionType value);

} // AssertSubType
