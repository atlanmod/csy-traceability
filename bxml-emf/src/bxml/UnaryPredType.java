/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Pred Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.UnaryPredType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.UnaryPredType#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.UnaryPredType#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.UnaryPredType#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.UnaryPredType#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.UnaryPredType#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.UnaryPredType#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.UnaryPredType#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getUnaryPredType()
 * @model extendedMetaData="name='Unary_Pred_._type' kind='elementOnly'"
 * @generated
 */
public interface UnaryPredType extends EObject {
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
   * @see bxml.BxmlPackage#getUnaryPredType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.UnaryPredType#getAttr <em>Attr</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryPredType_BinaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  BinaryPredType getBinaryPred();

  /**
   * Sets the value of the '{@link bxml.UnaryPredType#getBinaryPred <em>Binary Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryPredType_NaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  NaryPredType getNaryPred();

  /**
   * Sets the value of the '{@link bxml.UnaryPredType#getNaryPred <em>Nary Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryPredType_UnaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  UnaryPredType getUnaryPred();

  /**
   * Sets the value of the '{@link bxml.UnaryPredType#getUnaryPred <em>Unary Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryPredType_QuantifiedPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Pred' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedPredType getQuantifiedPred();

  /**
   * Sets the value of the '{@link bxml.UnaryPredType#getQuantifiedPred <em>Quantified Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryPredType_ExpComparison()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exp_Comparison' namespace='##targetNamespace'"
   * @generated
   */
  ExpComparisonType getExpComparison();

  /**
   * Sets the value of the '{@link bxml.UnaryPredType#getExpComparison <em>Exp Comparison</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryPredType_Set()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace'"
   * @generated
   */
  SetType1 getSet();

  /**
   * Sets the value of the '{@link bxml.UnaryPredType#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(SetType1 value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.OpType5}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.OpType5
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(OpType5)
   * @see bxml.BxmlPackage#getUnaryPredType_Op()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  OpType5 getOp();

  /**
   * Sets the value of the '{@link bxml.UnaryPredType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.OpType5
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(OpType5 value);

  /**
   * Unsets the value of the '{@link bxml.UnaryPredType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(OpType5)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.UnaryPredType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(OpType5)
   * @generated
   */
  boolean isSetOp();

} // UnaryPredType
