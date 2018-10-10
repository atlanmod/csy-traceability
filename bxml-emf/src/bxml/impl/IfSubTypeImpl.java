/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BxmlPackage;
import bxml.IfSubType;
import bxml.PredicateType;
import bxml.SubstitutionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Sub Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.IfSubTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.IfSubTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link bxml.impl.IfSubTypeImpl#getThen <em>Then</em>}</li>
 *   <li>{@link bxml.impl.IfSubTypeImpl#getElse <em>Else</em>}</li>
 *   <li>{@link bxml.impl.IfSubTypeImpl#getElseif <em>Elseif</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfSubTypeImpl extends MinimalEObjectImpl.Container implements IfSubType {
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
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected SubstitutionType then;

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
   * The default value of the '{@link #getElseif() <em>Elseif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseif()
   * @generated
   * @ordered
   */
  protected static final String ELSEIF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElseif() <em>Elseif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseif()
   * @generated
   * @ordered
   */
  protected String elseif = ELSEIF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfSubTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getIfSubType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.IF_SUB_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.IF_SUB_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__ATTR, newAttr, newAttr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__CONDITION, oldCondition, newCondition);
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
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.IF_SUB_TYPE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.IF_SUB_TYPE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstitutionType getThen() {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(SubstitutionType newThen, NotificationChain msgs) {
    SubstitutionType oldThen = then;
    then = newThen;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(SubstitutionType newThen) {
    if (newThen != then) {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.IF_SUB_TYPE__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.IF_SUB_TYPE__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__THEN, newThen, newThen));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__ELSE, oldElse, newElse);
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
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.IF_SUB_TYPE__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.IF_SUB_TYPE__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__ELSE, newElse, newElse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElseif() {
    return elseif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseif(String newElseif) {
    String oldElseif = elseif;
    elseif = newElseif;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__ELSEIF, oldElseif, elseif));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.IF_SUB_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.IF_SUB_TYPE__CONDITION:
        return basicSetCondition(null, msgs);
      case BxmlPackage.IF_SUB_TYPE__THEN:
        return basicSetThen(null, msgs);
      case BxmlPackage.IF_SUB_TYPE__ELSE:
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
      case BxmlPackage.IF_SUB_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.IF_SUB_TYPE__CONDITION:
        return getCondition();
      case BxmlPackage.IF_SUB_TYPE__THEN:
        return getThen();
      case BxmlPackage.IF_SUB_TYPE__ELSE:
        return getElse();
      case BxmlPackage.IF_SUB_TYPE__ELSEIF:
        return getElseif();
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
      case BxmlPackage.IF_SUB_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.IF_SUB_TYPE__CONDITION:
        setCondition((PredicateType)newValue);
        return;
      case BxmlPackage.IF_SUB_TYPE__THEN:
        setThen((SubstitutionType)newValue);
        return;
      case BxmlPackage.IF_SUB_TYPE__ELSE:
        setElse((SubstitutionType)newValue);
        return;
      case BxmlPackage.IF_SUB_TYPE__ELSEIF:
        setElseif((String)newValue);
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
      case BxmlPackage.IF_SUB_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.IF_SUB_TYPE__CONDITION:
        setCondition((PredicateType)null);
        return;
      case BxmlPackage.IF_SUB_TYPE__THEN:
        setThen((SubstitutionType)null);
        return;
      case BxmlPackage.IF_SUB_TYPE__ELSE:
        setElse((SubstitutionType)null);
        return;
      case BxmlPackage.IF_SUB_TYPE__ELSEIF:
        setElseif(ELSEIF_EDEFAULT);
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
      case BxmlPackage.IF_SUB_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.IF_SUB_TYPE__CONDITION:
        return condition != null;
      case BxmlPackage.IF_SUB_TYPE__THEN:
        return then != null;
      case BxmlPackage.IF_SUB_TYPE__ELSE:
        return else_ != null;
      case BxmlPackage.IF_SUB_TYPE__ELSEIF:
        return ELSEIF_EDEFAULT == null ? elseif != null : !ELSEIF_EDEFAULT.equals(elseif);
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
    result.append(" (elseif: ");
    result.append(elseif);
    result.append(')');
    return result.toString();
  }

} //IfSubTypeImpl
