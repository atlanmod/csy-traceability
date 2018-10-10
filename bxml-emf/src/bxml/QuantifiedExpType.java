/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Exp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.QuantifiedExpType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.QuantifiedExpType#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.QuantifiedExpType#getPred <em>Pred</em>}</li>
 *   <li>{@link bxml.QuantifiedExpType#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.QuantifiedExpType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getQuantifiedExpType()
 * @model extendedMetaData="name='Quantified_Exp_._type' kind='elementOnly'"
 * @generated
 */
public interface QuantifiedExpType extends EObject {
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
   * @see bxml.BxmlPackage#getQuantifiedExpType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.QuantifiedExpType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(VariablesType1)
   * @see bxml.BxmlPackage#getQuantifiedExpType_Variables()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Variables' namespace='##targetNamespace'"
   * @generated
   */
  VariablesType1 getVariables();

  /**
   * Sets the value of the '{@link bxml.QuantifiedExpType#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(VariablesType1 value);

  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference.
   * @see #setPred(PredicateType)
   * @see bxml.BxmlPackage#getQuantifiedExpType_Pred()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Pred' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getPred();

  /**
   * Sets the value of the '{@link bxml.QuantifiedExpType#getPred <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' containment reference.
   * @see #getPred()
   * @generated
   */
  void setPred(PredicateType value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ExpType)
   * @see bxml.BxmlPackage#getQuantifiedExpType_Body()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
   * @generated
   */
  ExpType getBody();

  /**
   * Sets the value of the '{@link bxml.QuantifiedExpType#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ExpType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.QuantifiedExpOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see bxml.QuantifiedExpOp
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(QuantifiedExpOp)
   * @see bxml.BxmlPackage#getQuantifiedExpType_Type()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpOp getType();

  /**
   * Sets the value of the '{@link bxml.QuantifiedExpType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see bxml.QuantifiedExpOp
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(QuantifiedExpOp value);

  /**
   * Unsets the value of the '{@link bxml.QuantifiedExpType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(QuantifiedExpOp)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link bxml.QuantifiedExpType#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(QuantifiedExpOp)
   * @generated
   */
  boolean isSetType();

} // QuantifiedExpType
