/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Pred Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.BinaryPredType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getBinaryPred1 <em>Binary Pred1</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getNaryPred1 <em>Nary Pred1</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getUnaryPred1 <em>Unary Pred1</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getQuantifiedPred1 <em>Quantified Pred1</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getExpComparison1 <em>Exp Comparison1</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getSet1 <em>Set1</em>}</li>
 *   <li>{@link bxml.BinaryPredType#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getBinaryPredType()
 * @model extendedMetaData="name='Binary_Pred_._type' kind='elementOnly'"
 * @generated
 */
public interface BinaryPredType extends EObject {
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
   * @see bxml.BxmlPackage#getBinaryPredType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getAttr <em>Attr</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryPredType_BinaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  BinaryPredType getBinaryPred();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getBinaryPred <em>Binary Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryPredType_NaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  NaryPredType getNaryPred();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getNaryPred <em>Nary Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryPredType_UnaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  UnaryPredType getUnaryPred();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getUnaryPred <em>Unary Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryPredType_QuantifiedPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Pred' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedPredType getQuantifiedPred();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getQuantifiedPred <em>Quantified Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryPredType_ExpComparison()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exp_Comparison' namespace='##targetNamespace'"
   * @generated
   */
  ExpComparisonType getExpComparison();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getExpComparison <em>Exp Comparison</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryPredType_Set()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace'"
   * @generated
   */
  SetType1 getSet();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(SetType1 value);

  /**
   * Returns the value of the '<em><b>Binary Pred1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Pred1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Pred1</em>' containment reference.
   * @see #setBinaryPred1(BinaryPredType)
   * @see bxml.BxmlPackage#getBinaryPredType_BinaryPred1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  BinaryPredType getBinaryPred1();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getBinaryPred1 <em>Binary Pred1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Pred1</em>' containment reference.
   * @see #getBinaryPred1()
   * @generated
   */
  void setBinaryPred1(BinaryPredType value);

  /**
   * Returns the value of the '<em><b>Nary Pred1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Pred1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Pred1</em>' containment reference.
   * @see #setNaryPred1(NaryPredType)
   * @see bxml.BxmlPackage#getBinaryPredType_NaryPred1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  NaryPredType getNaryPred1();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getNaryPred1 <em>Nary Pred1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nary Pred1</em>' containment reference.
   * @see #getNaryPred1()
   * @generated
   */
  void setNaryPred1(NaryPredType value);

  /**
   * Returns the value of the '<em><b>Unary Pred1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Pred1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Pred1</em>' containment reference.
   * @see #setUnaryPred1(UnaryPredType)
   * @see bxml.BxmlPackage#getBinaryPredType_UnaryPred1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  UnaryPredType getUnaryPred1();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getUnaryPred1 <em>Unary Pred1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Pred1</em>' containment reference.
   * @see #getUnaryPred1()
   * @generated
   */
  void setUnaryPred1(UnaryPredType value);

  /**
   * Returns the value of the '<em><b>Quantified Pred1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Pred1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Pred1</em>' containment reference.
   * @see #setQuantifiedPred1(QuantifiedPredType)
   * @see bxml.BxmlPackage#getBinaryPredType_QuantifiedPred1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Pred' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedPredType getQuantifiedPred1();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getQuantifiedPred1 <em>Quantified Pred1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Pred1</em>' containment reference.
   * @see #getQuantifiedPred1()
   * @generated
   */
  void setQuantifiedPred1(QuantifiedPredType value);

  /**
   * Returns the value of the '<em><b>Exp Comparison1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Comparison1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Comparison1</em>' containment reference.
   * @see #setExpComparison1(ExpComparisonType)
   * @see bxml.BxmlPackage#getBinaryPredType_ExpComparison1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exp_Comparison' namespace='##targetNamespace'"
   * @generated
   */
  ExpComparisonType getExpComparison1();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getExpComparison1 <em>Exp Comparison1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Comparison1</em>' containment reference.
   * @see #getExpComparison1()
   * @generated
   */
  void setExpComparison1(ExpComparisonType value);

  /**
   * Returns the value of the '<em><b>Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set1</em>' containment reference.
   * @see #setSet1(SetType1)
   * @see bxml.BxmlPackage#getBinaryPredType_Set1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace'"
   * @generated
   */
  SetType1 getSet1();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getSet1 <em>Set1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set1</em>' containment reference.
   * @see #getSet1()
   * @generated
   */
  void setSet1(SetType1 value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.OpType7}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.OpType7
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(OpType7)
   * @see bxml.BxmlPackage#getBinaryPredType_Op()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  OpType7 getOp();

  /**
   * Sets the value of the '{@link bxml.BinaryPredType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.OpType7
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(OpType7 value);

  /**
   * Unsets the value of the '{@link bxml.BinaryPredType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(OpType7)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.BinaryPredType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(OpType7)
   * @generated
   */
  boolean isSetOp();

} // BinaryPredType
