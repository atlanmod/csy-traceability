/**
 */
package bxml.impl;

import bxml.BxmlPackage;
import bxml.ReferencedMachineType;
import bxml.ReferencedMachineType2;

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
 * An implementation of the model object '<em><b>Referenced Machine Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.ReferencedMachineType2Impl#getReferencedMachine <em>Referenced Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencedMachineType2Impl extends MinimalEObjectImpl.Container implements ReferencedMachineType2 {
  /**
   * The cached value of the '{@link #getReferencedMachine() <em>Referenced Machine</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedMachine()
   * @generated
   * @ordered
   */
  protected EList<ReferencedMachineType> referencedMachine;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferencedMachineType2Impl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getReferencedMachineType2();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferencedMachineType> getReferencedMachine() {
    if (referencedMachine == null) {
      referencedMachine = new EObjectContainmentEList<ReferencedMachineType>(ReferencedMachineType.class, this, BxmlPackage.REFERENCED_MACHINE_TYPE2__REFERENCED_MACHINE);
    }
    return referencedMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.REFERENCED_MACHINE_TYPE2__REFERENCED_MACHINE:
        return ((InternalEList<?>)getReferencedMachine()).basicRemove(otherEnd, msgs);
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
      case BxmlPackage.REFERENCED_MACHINE_TYPE2__REFERENCED_MACHINE:
        return getReferencedMachine();
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
      case BxmlPackage.REFERENCED_MACHINE_TYPE2__REFERENCED_MACHINE:
        getReferencedMachine().clear();
        getReferencedMachine().addAll((Collection<? extends ReferencedMachineType>)newValue);
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
      case BxmlPackage.REFERENCED_MACHINE_TYPE2__REFERENCED_MACHINE:
        getReferencedMachine().clear();
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
      case BxmlPackage.REFERENCED_MACHINE_TYPE2__REFERENCED_MACHINE:
        return referencedMachine != null && !referencedMachine.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReferencedMachineType2Impl
