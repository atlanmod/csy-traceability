/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BxmlPackage;
import bxml.CaseSubType;
import bxml.ChoicesType;
import bxml.ExpType;
import bxml.SubstitutionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Sub Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.CaseSubTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.CaseSubTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link bxml.impl.CaseSubTypeImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link bxml.impl.CaseSubTypeImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseSubTypeImpl extends MinimalEObjectImpl.Container implements CaseSubType {
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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ExpType value;

  /**
   * The cached value of the '{@link #getChoices() <em>Choices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoices()
   * @generated
   * @ordered
   */
  protected ChoicesType choices;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected SubstitutionType else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseSubTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getCaseSubType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.CASE_SUB_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.CASE_SUB_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.CASE_SUB_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.CASE_SUB_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpType getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ExpType newValue, NotificationChain msgs) {
    ExpType oldValue = value;
    value = newValue;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.CASE_SUB_TYPE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ExpType newValue) {
    if (newValue != value) {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.CASE_SUB_TYPE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.CASE_SUB_TYPE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.CASE_SUB_TYPE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoicesType getChoices() {
    return choices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChoices(ChoicesType newChoices, NotificationChain msgs) {
    ChoicesType oldChoices = choices;
    choices = newChoices;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.CASE_SUB_TYPE__CHOICES, oldChoices, newChoices);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChoices(ChoicesType newChoices) {
    if (newChoices != choices) {
      NotificationChain msgs = null;
      if (choices != null)
        msgs = ((InternalEObject)choices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.CASE_SUB_TYPE__CHOICES, null, msgs);
      if (newChoices != null)
        msgs = ((InternalEObject)newChoices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.CASE_SUB_TYPE__CHOICES, null, msgs);
      msgs = basicSetChoices(newChoices, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.CASE_SUB_TYPE__CHOICES, newChoices, newChoices));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstitutionType getElse() {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(SubstitutionType newElse, NotificationChain msgs) {
    SubstitutionType oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.CASE_SUB_TYPE__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(SubstitutionType newElse) {
    if (newElse != else_) {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.CASE_SUB_TYPE__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.CASE_SUB_TYPE__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.CASE_SUB_TYPE__ELSE, newElse, newElse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.CASE_SUB_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.CASE_SUB_TYPE__VALUE:
        return basicSetValue(null, msgs);
      case BxmlPackage.CASE_SUB_TYPE__CHOICES:
        return basicSetChoices(null, msgs);
      case BxmlPackage.CASE_SUB_TYPE__ELSE:
        return basicSetElse(null, msgs);
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
      case BxmlPackage.CASE_SUB_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.CASE_SUB_TYPE__VALUE:
        return getValue();
      case BxmlPackage.CASE_SUB_TYPE__CHOICES:
        return getChoices();
      case BxmlPackage.CASE_SUB_TYPE__ELSE:
        return getElse();
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
      case BxmlPackage.CASE_SUB_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.CASE_SUB_TYPE__VALUE:
        setValue((ExpType)newValue);
        return;
      case BxmlPackage.CASE_SUB_TYPE__CHOICES:
        setChoices((ChoicesType)newValue);
        return;
      case BxmlPackage.CASE_SUB_TYPE__ELSE:
        setElse((SubstitutionType)newValue);
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
      case BxmlPackage.CASE_SUB_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.CASE_SUB_TYPE__VALUE:
        setValue((ExpType)null);
        return;
      case BxmlPackage.CASE_SUB_TYPE__CHOICES:
        setChoices((ChoicesType)null);
        return;
      case BxmlPackage.CASE_SUB_TYPE__ELSE:
        setElse((SubstitutionType)null);
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
      case BxmlPackage.CASE_SUB_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.CASE_SUB_TYPE__VALUE:
        return value != null;
      case BxmlPackage.CASE_SUB_TYPE__CHOICES:
        return choices != null;
      case BxmlPackage.CASE_SUB_TYPE__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

} //CaseSubTypeImpl
