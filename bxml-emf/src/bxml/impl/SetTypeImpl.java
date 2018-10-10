/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BxmlPackage;
import bxml.EnumeratedValuesType;
import bxml.IdentifierType;
import bxml.SetType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.SetTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.SetTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link bxml.impl.SetTypeImpl#getEnumeratedValues <em>Enumerated Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetTypeImpl extends MinimalEObjectImpl.Container implements SetType {
  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected AttributesType attr;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected IdentifierType id;

  /**
   * The cached value of the '{@link #getEnumeratedValues() <em>Enumerated Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumeratedValues()
   * @generated
   * @ordered
   */
  protected EnumeratedValuesType enumeratedValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getSetType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributesType getAttr() {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttr(AttributesType newAttr, NotificationChain msgs) {
    AttributesType oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SET_TYPE__ATTR, oldAttr, newAttr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(AttributesType newAttr) {
    if (newAttr != attr) {
      NotificationChain msgs = null;
      if (attr != null)
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SET_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SET_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SET_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierType getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(IdentifierType newId, NotificationChain msgs) {
    IdentifierType oldId = id;
    id = newId;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SET_TYPE__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(IdentifierType newId) {
    if (newId != id) {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SET_TYPE__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SET_TYPE__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SET_TYPE__ID, newId, newId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumeratedValuesType getEnumeratedValues() {
    return enumeratedValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumeratedValues(EnumeratedValuesType newEnumeratedValues, NotificationChain msgs) {
    EnumeratedValuesType oldEnumeratedValues = enumeratedValues;
    enumeratedValues = newEnumeratedValues;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SET_TYPE__ENUMERATED_VALUES, oldEnumeratedValues, newEnumeratedValues);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumeratedValues(EnumeratedValuesType newEnumeratedValues) {
    if (newEnumeratedValues != enumeratedValues) {
      NotificationChain msgs = null;
      if (enumeratedValues != null)
        msgs = ((InternalEObject)enumeratedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SET_TYPE__ENUMERATED_VALUES, null, msgs);
      if (newEnumeratedValues != null)
        msgs = ((InternalEObject)newEnumeratedValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SET_TYPE__ENUMERATED_VALUES, null, msgs);
      msgs = basicSetEnumeratedValues(newEnumeratedValues, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SET_TYPE__ENUMERATED_VALUES, newEnumeratedValues, newEnumeratedValues));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.SET_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.SET_TYPE__ID:
        return basicSetId(null, msgs);
      case BxmlPackage.SET_TYPE__ENUMERATED_VALUES:
        return basicSetEnumeratedValues(null, msgs);
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
      case BxmlPackage.SET_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.SET_TYPE__ID:
        return getId();
      case BxmlPackage.SET_TYPE__ENUMERATED_VALUES:
        return getEnumeratedValues();
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
      case BxmlPackage.SET_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.SET_TYPE__ID:
        setId((IdentifierType)newValue);
        return;
      case BxmlPackage.SET_TYPE__ENUMERATED_VALUES:
        setEnumeratedValues((EnumeratedValuesType)newValue);
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
      case BxmlPackage.SET_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.SET_TYPE__ID:
        setId((IdentifierType)null);
        return;
      case BxmlPackage.SET_TYPE__ENUMERATED_VALUES:
        setEnumeratedValues((EnumeratedValuesType)null);
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
      case BxmlPackage.SET_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.SET_TYPE__ID:
        return id != null;
      case BxmlPackage.SET_TYPE__ENUMERATED_VALUES:
        return enumeratedValues != null;
    }
    return super.eIsSet(featureID);
  }

} //SetTypeImpl
