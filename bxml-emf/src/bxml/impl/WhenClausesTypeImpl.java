/**
 */
package bxml.impl;

import bxml.BxmlPackage;
import bxml.WhenClausesType;
import bxml.WhenType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Clauses Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.WhenClausesTypeImpl#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhenClausesTypeImpl extends MinimalEObjectImpl.Container implements WhenClausesType {
  /**
   * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected EList<WhenType> when;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenClausesTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getWhenClausesType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhenType> getWhen() {
    if (when == null) {
      when = new EObjectContainmentEList<WhenType>(WhenType.class, this, BxmlPackage.WHEN_CLAUSES_TYPE__WHEN);
    }
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.WHEN_CLAUSES_TYPE__WHEN:
        return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
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
      case BxmlPackage.WHEN_CLAUSES_TYPE__WHEN:
        return getWhen();
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
      case BxmlPackage.WHEN_CLAUSES_TYPE__WHEN:
        getWhen().clear();
        getWhen().addAll((Collection<? extends WhenType>)newValue);
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
      case BxmlPackage.WHEN_CLAUSES_TYPE__WHEN:
        getWhen().clear();
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
      case BxmlPackage.WHEN_CLAUSES_TYPE__WHEN:
        return when != null && !when.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhenClausesTypeImpl
