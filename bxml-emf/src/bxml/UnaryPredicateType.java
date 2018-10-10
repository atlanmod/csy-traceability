/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Predicate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.UnaryPredicateType#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.UnaryPredicateType#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.UnaryPredicateType#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.UnaryPredicateType#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.UnaryPredicateType#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.UnaryPredicateType#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.UnaryPredicateType#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getUnaryPredicateType()
 * @model extendedMetaData="name='Unary_Predicate_type' kind='elementOnly'"
 * @generated
 */
public interface UnaryPredicateType extends EObject {
  /**
   * Returns the value of the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Pred</em>' containment reference.
   * @see #setBinaryPred(BinaryPredicateType)
   * @see bxml.BxmlPackage#getUnaryPredicateType_BinaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  BinaryPredicateType getBinaryPred();

  /**
   * Sets the value of the '{@link bxml.UnaryPredicateType#getBinaryPred <em>Binary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Pred</em>' containment reference.
   * @see #getBinaryPred()
   * @generated
   */
  void setBinaryPred(BinaryPredicateType value);

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
   * @see bxml.BxmlPackage#getUnaryPredicateType_ExpComparison()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exp_Comparison' namespace='##targetNamespace'"
   * @generated
   */
  ExpComparisonType getExpComparison();

  /**
   * Sets the value of the '{@link bxml.UnaryPredicateType#getExpComparison <em>Exp Comparison</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Comparison</em>' containment reference.
   * @see #getExpComparison()
   * @generated
   */
  void setExpComparison(ExpComparisonType value);

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
   * @see bxml.BxmlPackage#getUnaryPredicateType_QuantifiedPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Pred' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedPredType getQuantifiedPred();

  /**
   * Sets the value of the '{@link bxml.UnaryPredicateType#getQuantifiedPred <em>Quantified Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Pred</em>' containment reference.
   * @see #getQuantifiedPred()
   * @generated
   */
  void setQuantifiedPred(QuantifiedPredType value);

  /**
   * Returns the value of the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Pred</em>' containment reference.
   * @see #setUnaryPred(UnaryPredicateType)
   * @see bxml.BxmlPackage#getUnaryPredicateType_UnaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  UnaryPredicateType getUnaryPred();

  /**
   * Sets the value of the '{@link bxml.UnaryPredicateType#getUnaryPred <em>Unary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Pred</em>' containment reference.
   * @see #getUnaryPred()
   * @generated
   */
  void setUnaryPred(UnaryPredicateType value);

  /**
   * Returns the value of the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Pred</em>' containment reference.
   * @see #setNaryPred(NaryPredicateType)
   * @see bxml.BxmlPackage#getUnaryPredicateType_NaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  NaryPredicateType getNaryPred();

  /**
   * Sets the value of the '{@link bxml.UnaryPredicateType#getNaryPred <em>Nary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nary Pred</em>' containment reference.
   * @see #getNaryPred()
   * @generated
   */
  void setNaryPred(NaryPredicateType value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(SetType)
   * @see bxml.BxmlPackage#getUnaryPredicateType_Set()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace'"
   * @generated
   */
  SetType getSet();

  /**
   * Sets the value of the '{@link bxml.UnaryPredicateType#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(SetType value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.UnaryPredOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.UnaryPredOp
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(UnaryPredOp)
   * @see bxml.BxmlPackage#getUnaryPredicateType_Op()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  UnaryPredOp getOp();

  /**
   * Sets the value of the '{@link bxml.UnaryPredicateType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.UnaryPredOp
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(UnaryPredOp value);

  /**
   * Unsets the value of the '{@link bxml.UnaryPredicateType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(UnaryPredOp)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.UnaryPredicateType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(UnaryPredOp)
   * @generated
   */
  boolean isSetOp();

} // UnaryPredicateType
