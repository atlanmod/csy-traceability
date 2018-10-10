/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Pred Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.QuantifiedPredType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.QuantifiedPredType#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.QuantifiedPredType#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.QuantifiedPredType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getQuantifiedPredType()
 * @model extendedMetaData="name='Quantified_Pred_._type' kind='elementOnly'"
 * @generated
 */
public interface QuantifiedPredType extends EObject {
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
   * @see bxml.BxmlPackage#getQuantifiedPredType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.QuantifiedPredType#getAttr <em>Attr</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getQuantifiedPredType_Variables()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Variables' namespace='##targetNamespace'"
   * @generated
   */
  VariablesType1 getVariables();

  /**
   * Sets the value of the '{@link bxml.QuantifiedPredType#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(VariablesType1 value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(PredicateType)
   * @see bxml.BxmlPackage#getQuantifiedPredType_Body()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getBody();

  /**
   * Sets the value of the '{@link bxml.QuantifiedPredType#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(PredicateType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.QuantifiedPredOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see bxml.QuantifiedPredOp
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(QuantifiedPredOp)
   * @see bxml.BxmlPackage#getQuantifiedPredType_Type()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedPredOp getType();

  /**
   * Sets the value of the '{@link bxml.QuantifiedPredType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see bxml.QuantifiedPredOp
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(QuantifiedPredOp value);

  /**
   * Unsets the value of the '{@link bxml.QuantifiedPredType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(QuantifiedPredOp)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link bxml.QuantifiedPredType#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(QuantifiedPredOp)
   * @generated
   */
  boolean isSetType();

} // QuantifiedPredType
