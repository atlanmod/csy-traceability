/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BxmlPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.AttrTypeImpl#getAnyElement <em>Any Element</em>}</li>
 *   <li>{@link bxml.impl.AttrTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttrTypeImpl extends MinimalEObjectImpl.Container implements AttrType {
  /**
   * The cached value of the '{@link #getAnyElement() <em>Any Element</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnyElement()
   * @generated
   * @ordered
   */
  protected FeatureMap anyElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttrTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getAttrType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getAnyElement() {
    if (anyElement == null) {
      anyElement = new BasicFeatureMap(this, BxmlPackage.ATTR_TYPE__ANY_ELEMENT);
    }
    return anyElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getAny() {
    return (FeatureMap)getAnyElement().<FeatureMap.Entry>list(BxmlPackage.eINSTANCE.getAttrType_Any());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.ATTR_TYPE__ANY_ELEMENT:
        return ((InternalEList<?>)getAnyElement()).basicRemove(otherEnd, msgs);
      case BxmlPackage.ATTR_TYPE__ANY:
        return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
      case BxmlPackage.ATTR_TYPE__ANY_ELEMENT:
        if (coreType) return getAnyElement();
        return ((FeatureMap.Internal)getAnyElement()).getWrapper();
      case BxmlPackage.ATTR_TYPE__ANY:
        if (coreType) return getAny();
        return ((FeatureMap.Internal)getAny()).getWrapper();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case BxmlPackage.ATTR_TYPE__ANY_ELEMENT:
        ((FeatureMap.Internal)getAnyElement()).set(newValue);
        return;
      case BxmlPackage.ATTR_TYPE__ANY:
        ((FeatureMap.Internal)getAny()).set(newValue);
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
      case BxmlPackage.ATTR_TYPE__ANY_ELEMENT:
        getAnyElement().clear();
        return;
      case BxmlPackage.ATTR_TYPE__ANY:
        getAny().clear();
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
      case BxmlPackage.ATTR_TYPE__ANY_ELEMENT:
        return anyElement != null && !anyElement.isEmpty();
      case BxmlPackage.ATTR_TYPE__ANY:
        return !getAny().isEmpty();
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
    result.append(" (anyElement: ");
    result.append(anyElement);
    result.append(')');
    return result.toString();
  }

} //AttrTypeImpl
