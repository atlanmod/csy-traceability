/**
 */
package bxml.impl;

import bxml.BxmlPackage;
import bxml.PromotesType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Promotes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.PromotesTypeImpl#getPromotedOperation <em>Promoted Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PromotesTypeImpl extends MinimalEObjectImpl.Container implements PromotesType {
  /**
   * The cached value of the '{@link #getPromotedOperation() <em>Promoted Operation</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromotedOperation()
   * @generated
   * @ordered
   */
  protected EList<String> promotedOperation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PromotesTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getPromotesType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPromotedOperation() {
    if (promotedOperation == null) {
      promotedOperation = new EDataTypeEList<String>(String.class, this, BxmlPackage.PROMOTES_TYPE__PROMOTED_OPERATION);
    }
    return promotedOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case BxmlPackage.PROMOTES_TYPE__PROMOTED_OPERATION:
        return getPromotedOperation();
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
      case BxmlPackage.PROMOTES_TYPE__PROMOTED_OPERATION:
        getPromotedOperation().clear();
        getPromotedOperation().addAll((Collection<? extends String>)newValue);
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
      case BxmlPackage.PROMOTES_TYPE__PROMOTED_OPERATION:
        getPromotedOperation().clear();
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
      case BxmlPackage.PROMOTES_TYPE__PROMOTED_OPERATION:
        return promotedOperation != null && !promotedOperation.isEmpty();
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
    result.append(" (promotedOperation: ");
    result.append(promotedOperation);
    result.append(')');
    return result.toString();
  }

} //PromotesTypeImpl
