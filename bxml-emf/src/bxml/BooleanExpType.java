/**
 */
package bxml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Exp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.BooleanExpType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.BooleanExpType#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.BooleanExpType#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.BooleanExpType#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.BooleanExpType#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.BooleanExpType#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.BooleanExpType#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.BooleanExpType#getTypref <em>Typref</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getBooleanExpType()
 * @model extendedMetaData="name='Boolean_Exp_._type' kind='elementOnly'"
 * @generated
 */
public interface BooleanExpType extends EObject {
  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(AttrType)
   * @see bxml.BxmlPackage#getBooleanExpType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.BooleanExpType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Pred</em>' containment reference.
   * @see #setBinaryPred(BinaryPredType)
   * @see bxml.BxmlPackage#getBooleanExpType_BinaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  BinaryPredType getBinaryPred();

  /**
   * Sets the value of the '{@link bxml.BooleanExpType#getBinaryPred <em>Binary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Pred</em>' containment reference.
   * @see #getBinaryPred()
   * @generated
   */
  void setBinaryPred(BinaryPredType value);

  /**
   * Returns the value of the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Pred</em>' containment reference.
   * @see #setNaryPred(NaryPredType)
   * @see bxml.BxmlPackage#getBooleanExpType_NaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  NaryPredType getNaryPred();

  /**
   * Sets the value of the '{@link bxml.BooleanExpType#getNaryPred <em>Nary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nary Pred</em>' containment reference.
   * @see #getNaryPred()
   * @generated
   */
  void setNaryPred(NaryPredType value);

  /**
   * Returns the value of the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Pred</em>' containment reference.
   * @see #setUnaryPred(UnaryPredType)
   * @see bxml.BxmlPackage#getBooleanExpType_UnaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  UnaryPredType getUnaryPred();

  /**
   * Sets the value of the '{@link bxml.BooleanExpType#getUnaryPred <em>Unary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Pred</em>' containment reference.
   * @see #getUnaryPred()
   * @generated
   */
  void setUnaryPred(UnaryPredType value);

  /**
   * Returns the value of the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Pred</em>' containment reference.
   * @see #setQuantifiedPred(QuantifiedPredType)
   * @see bxml.BxmlPackage#getBooleanExpType_QuantifiedPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Pred' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedPredType getQuantifiedPred();

  /**
   * Sets the value of the '{@link bxml.BooleanExpType#getQuantifiedPred <em>Quantified Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Pred</em>' containment reference.
   * @see #getQuantifiedPred()
   * @generated
   */
  void setQuantifiedPred(QuantifiedPredType value);

  /**
   * Returns the value of the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Comparison</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Comparison</em>' containment reference.
   * @see #setExpComparison(ExpComparisonType)
   * @see bxml.BxmlPackage#getBooleanExpType_ExpComparison()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exp_Comparison' namespace='##targetNamespace'"
   * @generated
   */
  ExpComparisonType getExpComparison();

  /**
   * Sets the value of the '{@link bxml.BooleanExpType#getExpComparison <em>Exp Comparison</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Comparison</em>' containment reference.
   * @see #getExpComparison()
   * @generated
   */
  void setExpComparison(ExpComparisonType value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(SetType1)
   * @see bxml.BxmlPackage#getBooleanExpType_Set()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace'"
   * @generated
   */
  SetType1 getSet();

  /**
   * Sets the value of the '{@link bxml.BooleanExpType#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(SetType1 value);

  /**
   * Returns the value of the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typref</em>' attribute.
   * @see #setTypref(BigInteger)
   * @see bxml.BxmlPackage#getBooleanExpType_Typref()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='typref' namespace='##targetNamespace'"
   * @generated
   */
  BigInteger getTypref();

  /**
   * Sets the value of the '{@link bxml.BooleanExpType#getTypref <em>Typref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typref</em>' attribute.
   * @see #getTypref()
   * @generated
   */
  void setTypref(BigInteger value);

} // BooleanExpType
