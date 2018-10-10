/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.WhileType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.WhileType#getCondition <em>Condition</em>}</li>
 *   <li>{@link bxml.WhileType#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.WhileType#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link bxml.WhileType#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getWhileType()
 * @model extendedMetaData="name='While_._type' kind='elementOnly'"
 * @generated
 */
public interface WhileType extends EObject {
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
   * @see bxml.BxmlPackage#getWhileType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.WhileType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

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
   * @see bxml.BxmlPackage#getWhileType_Condition()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getCondition();

  /**
   * Sets the value of the '{@link bxml.WhileType#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(PredicateType value);

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
   * @see bxml.BxmlPackage#getWhileType_Body()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
   * @generated
   */
  SubstitutionType getBody();

  /**
   * Sets the value of the '{@link bxml.WhileType#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(SubstitutionType value);

  /**
   * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invariant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariant</em>' containment reference.
   * @see #setInvariant(PredicateType)
   * @see bxml.BxmlPackage#getWhileType_Invariant()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Invariant' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getInvariant();

  /**
   * Sets the value of the '{@link bxml.WhileType#getInvariant <em>Invariant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invariant</em>' containment reference.
   * @see #getInvariant()
   * @generated
   */
  void setInvariant(PredicateType value);

  /**
   * Returns the value of the '<em><b>Variant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant</em>' containment reference.
   * @see #setVariant(ExpType)
   * @see bxml.BxmlPackage#getWhileType_Variant()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Variant' namespace='##targetNamespace'"
   * @generated
   */
  ExpType getVariant();

  /**
   * Sets the value of the '{@link bxml.WhileType#getVariant <em>Variant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' containment reference.
   * @see #getVariant()
   * @generated
   */
  void setVariant(ExpType value);

} // WhileType
