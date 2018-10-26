/**
 */
package bxml.impl;

import bxml.AssertionsType;
import bxml.AttrType;
import bxml.BinaryPredType;
import bxml.BxmlPackage;
import bxml.ExpComparisonType;
import bxml.NaryPredType;
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
 * An implementation of the model object '<em><b>Assertions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.impl.AssertionsTypeImpl#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertionsTypeImpl extends MinimalEObjectImpl.Container implements AssertionsType {
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.ASSERTIONS_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.ASSERTIONS_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.ASSERTIONS_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.ASSERTIONS_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getPredicate() {
    if (predicate == null) {
      predicate = new BasicFeatureMap(this, BxmlPackage.ASSERTIONS_TYPE__PREDICATE);
    }
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BinaryPredType> getBinaryPred() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getAssertionsType_BinaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NaryPredType> getNaryPred() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getAssertionsType_NaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnaryPredType> getUnaryPred() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getAssertionsType_UnaryPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QuantifiedPredType> getQuantifiedPred() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getAssertionsType_QuantifiedPred());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpComparisonType> getExpComparison() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getAssertionsType_ExpComparison());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SetType1> getSet() {
    return getPredicate().list(BxmlPackage.eINSTANCE.getAssertionsType_Set());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.ASSERTIONS_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__PREDICATE:
        return ((InternalEList<?>)getPredicate()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        return ((InternalEList<?>)getBinaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        return ((InternalEList<?>)getNaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        return ((InternalEList<?>)getUnaryPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        return ((InternalEList<?>)getQuantifiedPred()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        return ((InternalEList<?>)getExpComparison()).basicRemove(otherEnd, msgs);
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
      case BxmlPackage.ASSERTIONS_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.ASSERTIONS_TYPE__PREDICATE:
        if (coreType) return getPredicate();
        return ((FeatureMap.Internal)getPredicate()).getWrapper();
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        return getBinaryPred();
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        return getNaryPred();
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        return getUnaryPred();
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        return getQuantifiedPred();
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        return getExpComparison();
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
      case BxmlPackage.ASSERTIONS_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__PREDICATE:
        ((FeatureMap.Internal)getPredicate()).set(newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        getBinaryPred().clear();
        getBinaryPred().addAll((Collection<? extends BinaryPredType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        getNaryPred().clear();
        getNaryPred().addAll((Collection<? extends NaryPredType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        getUnaryPred().clear();
        getUnaryPred().addAll((Collection<? extends UnaryPredType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        getQuantifiedPred().clear();
        getQuantifiedPred().addAll((Collection<? extends QuantifiedPredType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        getExpComparison().clear();
        getExpComparison().addAll((Collection<? extends ExpComparisonType>)newValue);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__SET:
        getSet().clear();
        getSet().addAll((Collection<? extends SetType1>)newValue);
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
      case BxmlPackage.ASSERTIONS_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.ASSERTIONS_TYPE__PREDICATE:
        getPredicate().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        getBinaryPred().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        getNaryPred().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        getUnaryPred().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        getQuantifiedPred().clear();
        return;
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        getExpComparison().clear();
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
      case BxmlPackage.ASSERTIONS_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.ASSERTIONS_TYPE__PREDICATE:
        return predicate != null && !predicate.isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__BINARY_PRED:
        return !getBinaryPred().isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__NARY_PRED:
        return !getNaryPred().isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__UNARY_PRED:
        return !getUnaryPred().isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__QUANTIFIED_PRED:
        return !getQuantifiedPred().isEmpty();
      case BxmlPackage.ASSERTIONS_TYPE__EXP_COMPARISON:
        return !getExpComparison().isEmpty();
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
    result.append(" (predicate: ");
    result.append(predicate);
    result.append(')');
    return result.toString();
  }

} //AssertionsTypeImpl
