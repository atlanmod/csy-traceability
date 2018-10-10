/**
 */
package bxml.impl;

import bxml.AssertionsType;
import bxml.BinaryPredicateType;
import bxml.BxmlPackage;
import bxml.ExpComparisonType;
import bxml.NaryPredicateType;
import bxml.QuantifiedPredType;
import bxml.SetType;
import bxml.UnaryPredicateType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertionsTypeImpl extends MinimalEObjectImpl.Container implements AssertionsType {
  /**
   * The cached value of the '{@link #getPred() <em>Pred</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected FeatureMap pred;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionsTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getAssertionsType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getPred() {
    if (pred == null) {
      pred = new BasicFeatureMap(this, BxmlPackage.ASSERTIONS_TYPE__PRED);
    }
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BinaryPredicateType> getBinaryPred() {
    return getPred().list(BxmlPackage.eINSTANCE.getAssertionsType_BinaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpComparisonType> getExpComparison() {
    return getPred().list(BxmlPackage.eINSTANCE.getAssertionsType_ExpComparison());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QuantifiedPredType> getQuantifiedPred() {
    return getPred().list(BxmlPackage.eINSTANCE.getAssertionsType_QuantifiedPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnaryPredicateType> getUnaryPred() {
    return getPred().list(BxmlPackage.eINSTANCE.getAssertionsType_UnaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NaryPredicateType> getNaryPred() {
    return getPred().list(BxmlPackage.eINSTANCE.getAssertionsType_NaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SetType> getSet() {
    return getPred().list(BxmlPackage.eINSTANCE.getAssertionsType_Set());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.ASSERTIONS_TYPE__PRED:
        return ((InternalEList<?>)getPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        return ((InternalEList<?>)getBinaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        return ((InternalEList<?>)getExpComparison()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        return ((InternalEList<?>)getQuantifiedPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        return ((InternalEList<?>)getUnaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        return ((InternalEList<?>)getNaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__SET:
        return ((InternalEList<?>)getSet()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case BxmlPackage.ASSERTIONS_TYPE__PRED:
        if (coreType) return getPred();
        return ((FeatureMap.Internal)getPred()).getWrapper();
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        return getBinaryPred();
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        return getExpComparison();
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        return getQuantifiedPred();
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        return getUnaryPred();
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        return getNaryPred();
      case BxmlPackage.ASSERTIONS_TYPE__SET:
        return getSet();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case BxmlPackage.ASSERTIONS_TYPE__PRED:
        ((FeatureMap.Internal)getPred()).set(newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        getBinaryPred().clear();
        getBinaryPred().addAll((Collection<? extends BinaryPredicateType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        getExpComparison().clear();
        getExpComparison().addAll((Collection<? extends ExpComparisonType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        getQuantifiedPred().clear();
        getQuantifiedPred().addAll((Collection<? extends QuantifiedPredType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        getUnaryPred().clear();
        getUnaryPred().addAll((Collection<? extends UnaryPredicateType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        getNaryPred().clear();
        getNaryPred().addAll((Collection<? extends NaryPredicateType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__SET:
        getSet().clear();
        getSet().addAll((Collection<? extends SetType>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case BxmlPackage.ASSERTIONS_TYPE__PRED:
        getPred().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        getBinaryPred().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        getExpComparison().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        getQuantifiedPred().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        getUnaryPred().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        getNaryPred().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__SET:
        getSet().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case BxmlPackage.ASSERTIONS_TYPE__PRED:
        return pred != null && !pred.isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        return !getBinaryPred().isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        return !getExpComparison().isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        return !getQuantifiedPred().isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        return !getUnaryPred().isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        return !getNaryPred().isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__SET:
        return !getSet().isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (pred: ");
    result.append(pred);
    result.append(')');
    return result.toString();
  }

} //AssertionsTypeImpl
