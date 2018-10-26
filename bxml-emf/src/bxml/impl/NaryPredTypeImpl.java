/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BinaryPredType;
import bxml.BxmlPackage;
import bxml.ExpComparisonType;
import bxml.NaryPredType;
import bxml.OpType6;
import bxml.QuantifiedPredType;
import bxml.SetType1;
import bxml.UnaryPredType;

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
 * An implementation of the model object '<em><b>Nary Pred Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.NaryPredTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.NaryPredTypeImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link bxml.impl.NaryPredTypeImpl#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.impl.NaryPredTypeImpl#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.impl.NaryPredTypeImpl#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.impl.NaryPredTypeImpl#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.impl.NaryPredTypeImpl#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.impl.NaryPredTypeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.impl.NaryPredTypeImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NaryPredTypeImpl extends MinimalEObjectImpl.Container implements NaryPredType {
  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected AttrType attr;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected FeatureMap predicate;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final OpType6 OP_EDEFAULT = OpType6.__;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected OpType6 op = OP_EDEFAULT;

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
  protected NaryPredTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getNaryPredType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrType getAttr() {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttr(AttrType newAttr, NotificationChain msgs) {
    AttrType oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.NARY_PRED_TYPE__ATTR, oldAttr, newAttr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(AttrType newAttr) {
    if (newAttr != attr) {
      NotificationChain msgs = null;
      if (attr != null)
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.NARY_PRED_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.NARY_PRED_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.NARY_PRED_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getPredicate() {
    if (predicate == null) {
      predicate = new BasicFeatureMap(this, BxmlPackage.NARY_PRED_TYPE__PREDICATE);
    }
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BinaryPredType> getBinaryPred() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getNaryPredType_BinaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NaryPredType> getNaryPred() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getNaryPredType_NaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnaryPredType> getUnaryPred() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getNaryPredType_UnaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QuantifiedPredType> getQuantifiedPred() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getNaryPredType_QuantifiedPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpComparisonType> getExpComparison() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getNaryPredType_ExpComparison());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SetType1> getSet() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getNaryPredType_Set());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType6 getOp() {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(OpType6 newOp) {
    OpType6 oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    boolean oldOpESet = opESet;
    opESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.NARY_PRED_TYPE__OP, oldOp, op, !oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetOp() {
    OpType6 oldOp = op;
    boolean oldOpESet = opESet;
    op = OP_EDEFAULT;
    opESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.NARY_PRED_TYPE__OP, oldOp, OP_EDEFAULT, oldOpESet));
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
      case BxmlPackage.NARY_PRED_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.NARY_PRED_TYPE__PREDICATE:
        return ((InternalEList<?>)getPredicate()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PRED_TYPE__BINARY_PRED:
        return ((InternalEList<?>)getBinaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PRED_TYPE__NARY_PRED:
        return ((InternalEList<?>)getNaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PRED_TYPE__UNARY_PRED:
        return ((InternalEList<?>)getUnaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PRED_TYPE__QUANTIFIED_PRED:
        return ((InternalEList<?>)getQuantifiedPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PRED_TYPE__EXP_COMPARISON:
        return ((InternalEList<?>)getExpComparison()).basicRemove(otherEnd, msgs);
      case BxmlPackage.NARY_PRED_TYPE__SET:
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
      case BxmlPackage.NARY_PRED_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.NARY_PRED_TYPE__PREDICATE:
        if (coreType) return getPredicate();
        return ((FeatureMap.Internal)getPredicate()).getWrapper();
      case BxmlPackage.NARY_PRED_TYPE__BINARY_PRED:
        return getBinaryPred();
      case BxmlPackage.NARY_PRED_TYPE__NARY_PRED:
        return getNaryPred();
      case BxmlPackage.NARY_PRED_TYPE__UNARY_PRED:
        return getUnaryPred();
      case BxmlPackage.NARY_PRED_TYPE__QUANTIFIED_PRED:
        return getQuantifiedPred();
      case BxmlPackage.NARY_PRED_TYPE__EXP_COMPARISON:
        return getExpComparison();
      case BxmlPackage.NARY_PRED_TYPE__SET:
        return getSet();
      case BxmlPackage.NARY_PRED_TYPE__OP:
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
      case BxmlPackage.NARY_PRED_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.NARY_PRED_TYPE__PREDICATE:
        ((FeatureMap.Internal)getPredicate()).set(newValue);
        return;
      case BxmlPackage.NARY_PRED_TYPE__BINARY_PRED:
        getBinaryPred().clear();
        getBinaryPred().addAll((Collection<? extends BinaryPredType>)newValue);
        return;
      case BxmlPackage.NARY_PRED_TYPE__NARY_PRED:
        getNaryPred().clear();
        getNaryPred().addAll((Collection<? extends NaryPredType>)newValue);
        return;
      case BxmlPackage.NARY_PRED_TYPE__UNARY_PRED:
        getUnaryPred().clear();
        getUnaryPred().addAll((Collection<? extends UnaryPredType>)newValue);
        return;
      case BxmlPackage.NARY_PRED_TYPE__QUANTIFIED_PRED:
        getQuantifiedPred().clear();
        getQuantifiedPred().addAll((Collection<? extends QuantifiedPredType>)newValue);
        return;
      case BxmlPackage.NARY_PRED_TYPE__EXP_COMPARISON:
        getExpComparison().clear();
        getExpComparison().addAll((Collection<? extends ExpComparisonType>)newValue);
        return;
      case BxmlPackage.NARY_PRED_TYPE__SET:
        getSet().clear();
        getSet().addAll((Collection<? extends SetType1>)newValue);
        return;
      case BxmlPackage.NARY_PRED_TYPE__OP:
        setOp((OpType6)newValue);
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
      case BxmlPackage.NARY_PRED_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.NARY_PRED_TYPE__PREDICATE:
        getPredicate().clear();
        return;
      case BxmlPackage.NARY_PRED_TYPE__BINARY_PRED:
        getBinaryPred().clear();
        return;
      case BxmlPackage.NARY_PRED_TYPE__NARY_PRED:
        getNaryPred().clear();
        return;
      case BxmlPackage.NARY_PRED_TYPE__UNARY_PRED:
        getUnaryPred().clear();
        return;
      case BxmlPackage.NARY_PRED_TYPE__QUANTIFIED_PRED:
        getQuantifiedPred().clear();
        return;
      case BxmlPackage.NARY_PRED_TYPE__EXP_COMPARISON:
        getExpComparison().clear();
        return;
      case BxmlPackage.NARY_PRED_TYPE__SET:
        getSet().clear();
        return;
      case BxmlPackage.NARY_PRED_TYPE__OP:
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
      case BxmlPackage.NARY_PRED_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.NARY_PRED_TYPE__PREDICATE:
        return predicate != null && !predicate.isEmpty();
      case BxmlPackage.NARY_PRED_TYPE__BINARY_PRED:
        return !getBinaryPred().isEmpty();
      case BxmlPackage.NARY_PRED_TYPE__NARY_PRED:
        return !getNaryPred().isEmpty();
      case BxmlPackage.NARY_PRED_TYPE__UNARY_PRED:
        return !getUnaryPred().isEmpty();
      case BxmlPackage.NARY_PRED_TYPE__QUANTIFIED_PRED:
        return !getQuantifiedPred().isEmpty();
      case BxmlPackage.NARY_PRED_TYPE__EXP_COMPARISON:
        return !getExpComparison().isEmpty();
      case BxmlPackage.NARY_PRED_TYPE__SET:
        return !getSet().isEmpty();
      case BxmlPackage.NARY_PRED_TYPE__OP:
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
    result.append(" (predicate: ");
    result.append(predicate);
    result.append(", op: ");
    if (opESet) result.append(op); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //NaryPredTypeImpl
