/**
 */
package bxml.impl;

import bxml.BinaryPredicateType;
import bxml.BxmlPackage;
import bxml.ExpComparisonType;
import bxml.NaryOp;
import bxml.NaryPredicateType;
import bxml.QuantifiedPredType;
import bxml.SetType;
import bxml.UnaryPredicateType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nary Predicate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.NaryPredicateTypeImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link bxml.impl.NaryPredicateTypeImpl#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.impl.NaryPredicateTypeImpl#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.impl.NaryPredicateTypeImpl#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.impl.NaryPredicateTypeImpl#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.impl.NaryPredicateTypeImpl#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.impl.NaryPredicateTypeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.impl.NaryPredicateTypeImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NaryPredicateTypeImpl extends MinimalEObjectImpl.Container implements NaryPredicateType {
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
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final NaryOp OP_EDEFAULT = NaryOp.__;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected NaryOp op = OP_EDEFAULT;

  /**
   * This is true if the Op attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean opESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NaryPredicateTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getNaryPredicateType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getPred() {
    if (pred == null) {
      pred = new BasicFeatureMap(this, BxmlPackage.NARY_PREDICATE_TYPE__PRED);
    }
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BinaryPredicateType> getBinaryPred() {
    return getPred().list(BxmlPackage.eINSTANCE.getNaryPredicateType_BinaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpComparisonType> getExpComparison() {
    return getPred().list(BxmlPackage.eINSTANCE.getNaryPredicateType_ExpComparison());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QuantifiedPredType> getQuantifiedPred() {
    return getPred().list(BxmlPackage.eINSTANCE.getNaryPredicateType_QuantifiedPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnaryPredicateType> getUnaryPred() {
    return getPred().list(BxmlPackage.eINSTANCE.getNaryPredicateType_UnaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NaryPredicateType> getNaryPred() {
    return getPred().list(BxmlPackage.eINSTANCE.getNaryPredicateType_NaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SetType> getSet() {
    return getPred().list(BxmlPackage.eINSTANCE.getNaryPredicateType_Set());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryOp getOp() {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(NaryOp newOp) {
    NaryOp oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    boolean oldOpESet = opESet;
    opESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.NARY_PREDICATE_TYPE__OP, oldOp, op, !oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetOp() {
    NaryOp oldOp = op;
    boolean oldOpESet = opESet;
    op = OP_EDEFAULT;
    opESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.NARY_PREDICATE_TYPE__OP, oldOp, OP_EDEFAULT, oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOp() {
    return opESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.NARY_PREDICATE_TYPE__PRED:
        return ((InternalEList<?>)getPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PREDICATE_TYPE__BINARY_PRED:
        return ((InternalEList<?>)getBinaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PREDICATE_TYPE__EXP_COMPARISON:
        return ((InternalEList<?>)getExpComparison()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        return ((InternalEList<?>)getQuantifiedPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PREDICATE_TYPE__UNARY_PRED:
        return ((InternalEList<?>)getUnaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PREDICATE_TYPE__NARY_PRED:
        return ((InternalEList<?>)getNaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PREDICATE_TYPE__SET:
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
      case BxmlPackage.NARY_PREDICATE_TYPE__PRED:
        if (coreType) return getPred();
        return ((FeatureMap.Internal)getPred()).getWrapper();
      case BxmlPackage.NARY_PREDICATE_TYPE__BINARY_PRED:
        return getBinaryPred();
      case BxmlPackage.NARY_PREDICATE_TYPE__EXP_COMPARISON:
        return getExpComparison();
      case BxmlPackage.NARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        return getQuantifiedPred();
      case BxmlPackage.NARY_PREDICATE_TYPE__UNARY_PRED:
        return getUnaryPred();
      case BxmlPackage.NARY_PREDICATE_TYPE__NARY_PRED:
        return getNaryPred();
      case BxmlPackage.NARY_PREDICATE_TYPE__SET:
        return getSet();
      case BxmlPackage.NARY_PREDICATE_TYPE__OP:
        return getOp();
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
      case BxmlPackage.NARY_PREDICATE_TYPE__PRED:
        ((FeatureMap.Internal)getPred()).set(newValue);
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__BINARY_PRED:
        getBinaryPred().clear();
        getBinaryPred().addAll((Collection<? extends BinaryPredicateType>)newValue);
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__EXP_COMPARISON:
        getExpComparison().clear();
        getExpComparison().addAll((Collection<? extends ExpComparisonType>)newValue);
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        getQuantifiedPred().clear();
        getQuantifiedPred().addAll((Collection<? extends QuantifiedPredType>)newValue);
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__UNARY_PRED:
        getUnaryPred().clear();
        getUnaryPred().addAll((Collection<? extends UnaryPredicateType>)newValue);
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__NARY_PRED:
        getNaryPred().clear();
        getNaryPred().addAll((Collection<? extends NaryPredicateType>)newValue);
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__SET:
        getSet().clear();
        getSet().addAll((Collection<? extends SetType>)newValue);
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__OP:
        setOp((NaryOp)newValue);
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
      case BxmlPackage.NARY_PREDICATE_TYPE__PRED:
        getPred().clear();
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__BINARY_PRED:
        getBinaryPred().clear();
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__EXP_COMPARISON:
        getExpComparison().clear();
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        getQuantifiedPred().clear();
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__UNARY_PRED:
        getUnaryPred().clear();
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__NARY_PRED:
        getNaryPred().clear();
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__SET:
        getSet().clear();
        return;
      case BxmlPackage.NARY_PREDICATE_TYPE__OP:
        unsetOp();
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
      case BxmlPackage.NARY_PREDICATE_TYPE__PRED:
        return pred != null && !pred.isEmpty();
      case BxmlPackage.NARY_PREDICATE_TYPE__BINARY_PRED:
        return !getBinaryPred().isEmpty();
      case BxmlPackage.NARY_PREDICATE_TYPE__EXP_COMPARISON:
        return !getExpComparison().isEmpty();
      case BxmlPackage.NARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        return !getQuantifiedPred().isEmpty();
      case BxmlPackage.NARY_PREDICATE_TYPE__UNARY_PRED:
        return !getUnaryPred().isEmpty();
      case BxmlPackage.NARY_PREDICATE_TYPE__NARY_PRED:
        return !getNaryPred().isEmpty();
      case BxmlPackage.NARY_PREDICATE_TYPE__SET:
        return !getSet().isEmpty();
      case BxmlPackage.NARY_PREDICATE_TYPE__OP:
        return isSetOp();
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
    result.append(", op: ");
    if (opESet) result.append(op); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //NaryPredicateTypeImpl