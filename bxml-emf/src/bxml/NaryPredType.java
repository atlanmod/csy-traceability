/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nary Pred Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.NaryPredType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.NaryPredType#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link bxml.NaryPredType#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.NaryPredType#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.NaryPredType#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.NaryPredType#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.NaryPredType#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.NaryPredType#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.NaryPredType#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getNaryPredType()
 * @model extendedMetaData="name='Nary_Pred_._type' kind='elementOnly'"
 * @generated
 */
public interface NaryPredType extends EObject {
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
   * @see bxml.BxmlPackage#getNaryPredType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.NaryPredType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' attribute list.
   * @see bxml.BxmlPackage#getNaryPredType_Predicate()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='Predicate:1'"
   * @generated
   */
  FeatureMap getPredicate();

  /**
   * Returns the value of the '<em><b>Binary Pred</b></em>' containment reference list.
   * The list contents are of type {@link bxml.BinaryPredType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Pred</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Pred</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredType_BinaryPred()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Binary_Pred' namespace='##targetNamespace' group='Predicate:1'"
   * @generated
   */
  EList<BinaryPredType> getBinaryPred();

  /**
   * Returns the value of the '<em><b>Nary Pred</b></em>' containment reference list.
   * The list contents are of type {@link bxml.NaryPredType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Pred</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Pred</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredType_NaryPred()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Nary_Pred' namespace='##targetNamespace' group='Predicate:1'"
   * @generated
   */
  EList<NaryPredType> getNaryPred();

  /**
   * Returns the value of the '<em><b>Unary Pred</b></em>' containment reference list.
   * The list contents are of type {@link bxml.UnaryPredType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Pred</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Pred</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredType_UnaryPred()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Unary_Pred' namespace='##targetNamespace' group='Predicate:1'"
   * @generated
   */
  EList<UnaryPredType> getUnaryPred();

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
   * @see bxml.BxmlPackage#getNaryPredType_QuantifiedPred()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Quantified_Pred' namespace='##targetNamespace' group='Predicate:1'"
   * @generated
   */
  EList<QuantifiedPredType> getQuantifiedPred();

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
   * @see bxml.BxmlPackage#getNaryPredType_ExpComparison()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Exp_Comparison' namespace='##targetNamespace' group='Predicate:1'"
   * @generated
   */
  EList<ExpComparisonType> getExpComparison();

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference list.
   * The list contents are of type {@link bxml.SetType1}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryPredType_Set()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace' group='Predicate:1'"
   * @generated
   */
  EList<SetType1> getSet();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.OpType6}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.OpType6
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(OpType6)
   * @see bxml.BxmlPackage#getNaryPredType_Op()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  OpType6 getOp();

  /**
   * Sets the value of the '{@link bxml.NaryPredType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.OpType6
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(OpType6 value);

  /**
   * Unsets the value of the '{@link bxml.NaryPredType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(OpType6)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.NaryPredType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(OpType6)
   * @generated
   */
  boolean isSetOp();

} // NaryPredType
