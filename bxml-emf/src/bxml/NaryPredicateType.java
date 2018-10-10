/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nary Predicate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.NaryPredicateType#getPred <em>Pred</em>}</li>
 *   <li>{@link bxml.NaryPredicateType#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.NaryPredicateType#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.NaryPredicateType#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.NaryPredicateType#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.NaryPredicateType#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.NaryPredicateType#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.NaryPredicateType#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getNaryPredicateType()
 * @model extendedMetaData="name='Nary_Predicate_type' kind='elementOnly'"
 * @generated
 */
public interface NaryPredicateType extends EObject {
  /**
   * Returns the value of the '<em><b>Pred</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' attribute list.
   * @see bxml.BxmlPackage#getNaryPredicateType_Pred()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='Pred:0'"
   * @generated
   */
  FeatureMap getPred();

  /**
   * Returns the value of the '<em><b>Binary Pred</b></em>' containment reference list.
   * The list contents are of type {@link bxml.BinaryPredicateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Pred</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Pred</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredicateType_BinaryPred()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Binary_Pred' namespace='##targetNamespace' group='Pred:0'"
   * @generated
   */
  EList<BinaryPredicateType> getBinaryPred();

  /**
   * Returns the value of the '<em><b>Exp Comparison</b></em>' containment reference list.
   * The list contents are of type {@link bxml.ExpComparisonType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Comparison</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Comparison</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredicateType_ExpComparison()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Exp_Comparison' namespace='##targetNamespace' group='Pred:0'"
   * @generated
   */
  EList<ExpComparisonType> getExpComparison();

  /**
   * Returns the value of the '<em><b>Quantified Pred</b></em>' containment reference list.
   * The list contents are of type {@link bxml.QuantifiedPredType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Pred</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Pred</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredicateType_QuantifiedPred()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Quantified_Pred' namespace='##targetNamespace' group='Pred:0'"
   * @generated
   */
  EList<QuantifiedPredType> getQuantifiedPred();

  /**
   * Returns the value of the '<em><b>Unary Pred</b></em>' containment reference list.
   * The list contents are of type {@link bxml.UnaryPredicateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Pred</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Pred</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredicateType_UnaryPred()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Unary_Pred' namespace='##targetNamespace' group='Pred:0'"
   * @generated
   */
  EList<UnaryPredicateType> getUnaryPred();

  /**
   * Returns the value of the '<em><b>Nary Pred</b></em>' containment reference list.
   * The list contents are of type {@link bxml.NaryPredicateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Pred</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Pred</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredicateType_NaryPred()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Nary_Pred' namespace='##targetNamespace' group='Pred:0'"
   * @generated
   */
  EList<NaryPredicateType> getNaryPred();

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference list.
   * The list contents are of type {@link bxml.SetType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredicateType_Set()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace' group='Pred:0'"
   * @generated
   */
  EList<SetType> getSet();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.NaryOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.NaryOp
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(NaryOp)
   * @see bxml.BxmlPackage#getNaryPredicateType_Op()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  NaryOp getOp();

  /**
   * Sets the value of the '{@link bxml.NaryPredicateType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.NaryOp
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(NaryOp value);

  /**
   * Unsets the value of the '{@link bxml.NaryPredicateType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(NaryOp)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.NaryPredicateType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(NaryOp)
   * @generated
   */
  boolean isSetOp();

} // NaryPredicateType
