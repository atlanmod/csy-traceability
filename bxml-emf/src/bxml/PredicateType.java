/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.PredicateType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.PredicateType#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.PredicateType#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.PredicateType#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.PredicateType#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.PredicateType#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.PredicateType#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getPredicateType()
 * @model extendedMetaData="name='Predicate_type' kind='elementOnly'"
 * @generated
 */
public interface PredicateType extends EObject {
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
   * @see bxml.BxmlPackage#getPredicateType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.PredicateType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

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
   * @see bxml.BxmlPackage#getPredicateType_BinaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  BinaryPredicateType getBinaryPred();

  /**
   * Sets the value of the '{@link bxml.PredicateType#getBinaryPred <em>Binary Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getPredicateType_ExpComparison()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Exp_Comparison' namespace='##targetNamespace'"
   * @generated
   */
  ExpComparisonType getExpComparison();

  /**
   * Sets the value of the '{@link bxml.PredicateType#getExpComparison <em>Exp Comparison</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getPredicateType_QuantifiedPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Pred' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedPredType getQuantifiedPred();

  /**
   * Sets the value of the '{@link bxml.PredicateType#getQuantifiedPred <em>Quantified Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getPredicateType_UnaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  UnaryPredicateType getUnaryPred();

  /**
   * Sets the value of the '{@link bxml.PredicateType#getUnaryPred <em>Unary Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getPredicateType_NaryPred()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  NaryPredicateType getNaryPred();

  /**
   * Sets the value of the '{@link bxml.PredicateType#getNaryPred <em>Nary Pred</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getPredicateType_Set()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace'"
   * @generated
   */
  SetType getSet();

  /**
   * Sets the value of the '{@link bxml.PredicateType#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(SetType value);

} // PredicateType
