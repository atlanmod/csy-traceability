/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.AssertionsType#getPred <em>Pred</em>}</li>
 *   <li>{@link bxml.AssertionsType#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.AssertionsType#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.AssertionsType#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.AssertionsType#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.AssertionsType#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.AssertionsType#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getAssertionsType()
 * @model extendedMetaData="name='Assertions_._type' kind='elementOnly'"
 * @generated
 */
public interface AssertionsType extends EObject {
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
   * @see bxml.BxmlPackage#getAssertionsType_Pred()
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
   * @see bxml.BxmlPackage#getAssertionsType_BinaryPred()
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
   * @see bxml.BxmlPackage#getAssertionsType_ExpComparison()
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
   * @see bxml.BxmlPackage#getAssertionsType_QuantifiedPred()
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
   * @see bxml.BxmlPackage#getAssertionsType_UnaryPred()
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
   * @see bxml.BxmlPackage#getAssertionsType_NaryPred()
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
   * @see bxml.BxmlPackage#getAssertionsType_Set()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace' group='Pred:0'"
   * @generated
   */
  EList<SetType> getSet();

} // AssertionsType
