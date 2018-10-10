/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BxmlPackage;
import bxml.ExpType;
import bxml.PredicateType;
import bxml.SubstitutionType;
import bxml.WhileType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.WhileTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.WhileTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link bxml.impl.WhileTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.impl.WhileTypeImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link bxml.impl.WhileTypeImpl#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileTypeImpl extends MinimalEObjectImpl.Container implements WhileType {
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
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected PredicateType condition;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected SubstitutionType body;

  /**
   * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariant()
   * @generated
   * @ordered
   */
  protected PredicateType invariant;

  /**
   * The cached value of the '{@link #getVariant() <em>Variant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant()
   * @generated
   * @ordered
   */
  protected ExpType variant;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getWhileType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateType getCondition() {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(PredicateType newCondition, NotificationChain msgs) {
    PredicateType oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(PredicateType newCondition) {
    if (newCondition != condition) {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstitutionType getBody() {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(SubstitutionType newBody, NotificationChain msgs) {
    SubstitutionType oldBody = body;
    body = newBody;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(SubstitutionType newBody) {
    if (newBody != body) {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateType getInvariant() {
    return invariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvariant(PredicateType newInvariant, NotificationChain msgs) {
    PredicateType oldInvariant = invariant;
    invariant = newInvariant;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__INVARIANT, oldInvariant, newInvariant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvariant(PredicateType newInvariant) {
    if (newInvariant != invariant) {
      NotificationChain msgs = null;
      if (invariant != null)
        msgs = ((InternalEObject)invariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__INVARIANT, null, msgs);
      if (newInvariant != null)
        msgs = ((InternalEObject)newInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__INVARIANT, null, msgs);
      msgs = basicSetInvariant(newInvariant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__INVARIANT, newInvariant, newInvariant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpType getVariant() {
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariant(ExpType newVariant, NotificationChain msgs) {
    ExpType oldVariant = variant;
    variant = newVariant;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__VARIANT, oldVariant, newVariant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariant(ExpType newVariant) {
    if (newVariant != variant) {
      NotificationChain msgs = null;
      if (variant != null)
        msgs = ((InternalEObject)variant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__VARIANT, null, msgs);
      if (newVariant != null)
        msgs = ((InternalEObject)newVariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.WHILE_TYPE__VARIANT, null, msgs);
      msgs = basicSetVariant(newVariant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.WHILE_TYPE__VARIANT, newVariant, newVariant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.WHILE_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.WHILE_TYPE__CONDITION:
        return basicSetCondition(null, msgs);
      case BxmlPackage.WHILE_TYPE__BODY:
        return basicSetBody(null, msgs);
      case BxmlPackage.WHILE_TYPE__INVARIANT:
        return basicSetInvariant(null, msgs);
      case BxmlPackage.WHILE_TYPE__VARIANT:
        return basicSetVariant(null, msgs);
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
      case BxmlPackage.WHILE_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.WHILE_TYPE__CONDITION:
        return getCondition();
      case BxmlPackage.WHILE_TYPE__BODY:
        return getBody();
      case BxmlPackage.WHILE_TYPE__INVARIANT:
        return getInvariant();
      case BxmlPackage.WHILE_TYPE__VARIANT:
        return getVariant();
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
      case BxmlPackage.WHILE_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.WHILE_TYPE__CONDITION:
        setCondition((PredicateType)newValue);
        return;
      case BxmlPackage.WHILE_TYPE__BODY:
        setBody((SubstitutionType)newValue);
        return;
      case BxmlPackage.WHILE_TYPE__INVARIANT:
        setInvariant((PredicateType)newValue);
        return;
      case BxmlPackage.WHILE_TYPE__VARIANT:
        setVariant((ExpType)newValue);
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
      case BxmlPackage.WHILE_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.WHILE_TYPE__CONDITION:
        setCondition((PredicateType)null);
        return;
      case BxmlPackage.WHILE_TYPE__BODY:
        setBody((SubstitutionType)null);
        return;
      case BxmlPackage.WHILE_TYPE__INVARIANT:
        setInvariant((PredicateType)null);
        return;
      case BxmlPackage.WHILE_TYPE__VARIANT:
        setVariant((ExpType)null);
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
      case BxmlPackage.WHILE_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.WHILE_TYPE__CONDITION:
        return condition != null;
      case BxmlPackage.WHILE_TYPE__BODY:
        return body != null;
      case BxmlPackage.WHILE_TYPE__INVARIANT:
        return invariant != null;
      case BxmlPackage.WHILE_TYPE__VARIANT:
        return variant != null;
    }
    return super.eIsSet(featureID);
  }

} //WhileTypeImpl
