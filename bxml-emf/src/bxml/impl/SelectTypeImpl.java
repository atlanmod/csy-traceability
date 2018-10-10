/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BxmlPackage;
import bxml.SelectType;
import bxml.SubstitutionType;
import bxml.WhenClausesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.SelectTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.SelectTypeImpl#getWhenClauses <em>When Clauses</em>}</li>
 *   <li>{@link bxml.impl.SelectTypeImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectTypeImpl extends MinimalEObjectImpl.Container implements SelectType {
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
   * The cached value of the '{@link #getWhenClauses() <em>When Clauses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhenClauses()
   * @generated
   * @ordered
   */
  protected WhenClausesType whenClauses;

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
  protected SelectTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getSelectType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SELECT_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SELECT_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SELECT_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SELECT_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenClausesType getWhenClauses() {
    return whenClauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhenClauses(WhenClausesType newWhenClauses, NotificationChain msgs) {
    WhenClausesType oldWhenClauses = whenClauses;
    whenClauses = newWhenClauses;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SELECT_TYPE__WHEN_CLAUSES, oldWhenClauses, newWhenClauses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhenClauses(WhenClausesType newWhenClauses) {
    if (newWhenClauses != whenClauses) {
      NotificationChain msgs = null;
      if (whenClauses != null)
        msgs = ((InternalEObject)whenClauses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SELECT_TYPE__WHEN_CLAUSES, null, msgs);
      if (newWhenClauses != null)
        msgs = ((InternalEObject)newWhenClauses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SELECT_TYPE__WHEN_CLAUSES, null, msgs);
      msgs = basicSetWhenClauses(newWhenClauses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SELECT_TYPE__WHEN_CLAUSES, newWhenClauses, newWhenClauses));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SELECT_TYPE__ELSE, oldElse, newElse);
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
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SELECT_TYPE__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SELECT_TYPE__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SELECT_TYPE__ELSE, newElse, newElse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.SELECT_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.SELECT_TYPE__WHEN_CLAUSES:
        return basicSetWhenClauses(null, msgs);
      case BxmlPackage.SELECT_TYPE__ELSE:
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
      case BxmlPackage.SELECT_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.SELECT_TYPE__WHEN_CLAUSES:
        return getWhenClauses();
      case BxmlPackage.SELECT_TYPE__ELSE:
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
      case BxmlPackage.SELECT_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.SELECT_TYPE__WHEN_CLAUSES:
        setWhenClauses((WhenClausesType)newValue);
        return;
      case BxmlPackage.SELECT_TYPE__ELSE:
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
      case BxmlPackage.SELECT_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.SELECT_TYPE__WHEN_CLAUSES:
        setWhenClauses((WhenClausesType)null);
        return;
      case BxmlPackage.SELECT_TYPE__ELSE:
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
      case BxmlPackage.SELECT_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.SELECT_TYPE__WHEN_CLAUSES:
        return whenClauses != null;
      case BxmlPackage.SELECT_TYPE__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectTypeImpl
