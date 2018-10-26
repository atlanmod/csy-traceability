/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BxmlPackage;
import bxml.ConditionType;
import bxml.ElseType2;
import bxml.ElseifType;
import bxml.IfSubType;
import bxml.ThenType;

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
  protected AttrType attr;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected ConditionType condition;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected ThenType then;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected ElseType2 else_;

  /**
   * The default value of the '{@link #getElseif() <em>Elseif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseif()
   * @generated
   * @ordered
   */
  protected static final ElseifType ELSEIF_EDEFAULT = ElseifType.YES;

  /**
   * The cached value of the '{@link #getElseif() <em>Elseif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseif()
   * @generated
   * @ordered
   */
  protected ElseifType elseif = ELSEIF_EDEFAULT;

  /**
   * This is true if the Elseif attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean elseifESet;

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
  public void setAttr(AttrType newAttr) {
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
  public ConditionType getCondition() {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(ConditionType newCondition, NotificationChain msgs) {
    ConditionType oldCondition = condition;
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
  public void setCondition(ConditionType newCondition) {
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
  public ThenType getThen() {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(ThenType newThen, NotificationChain msgs) {
    ThenType oldThen = then;
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
  public void setThen(ThenType newThen) {
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
  public ElseType2 getElse() {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(ElseType2 newElse, NotificationChain msgs) {
    ElseType2 oldElse = else_;
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
  public void setElse(ElseType2 newElse) {
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
  public ElseifType getElseif() {
    return elseif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseif(ElseifType newElseif) {
    ElseifType oldElseif = elseif;
    elseif = newElseif == null ? ELSEIF_EDEFAULT : newElseif;
    boolean oldElseifESet = elseifESet;
    elseifESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.IF_SUB_TYPE__ELSEIF, oldElseif, elseif, !oldElseifESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetElseif() {
    ElseifType oldElseif = elseif;
    boolean oldElseifESet = elseifESet;
    elseif = ELSEIF_EDEFAULT;
    elseifESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.IF_SUB_TYPE__ELSEIF, oldElseif, ELSEIF_EDEFAULT, oldElseifESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetElseif() {
    return elseifESet;
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
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.IF_SUB_TYPE__CONDITION:
        setCondition((ConditionType)newValue);
        return;
      case BxmlPackage.IF_SUB_TYPE__THEN:
        setThen((ThenType)newValue);
        return;
      case BxmlPackage.IF_SUB_TYPE__ELSE:
        setElse((ElseType2)newValue);
        return;
      case BxmlPackage.IF_SUB_TYPE__ELSEIF:
        setElseif((ElseifType)newValue);
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
        setAttr((AttrType)null);
        return;
      case BxmlPackage.IF_SUB_TYPE__CONDITION:
        setCondition((ConditionType)null);
        return;
      case BxmlPackage.IF_SUB_TYPE__THEN:
        setThen((ThenType)null);
        return;
      case BxmlPackage.IF_SUB_TYPE__ELSE:
        setElse((ElseType2)null);
        return;
      case BxmlPackage.IF_SUB_TYPE__ELSEIF:
        unsetElseif();
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
        return isSetElseif();
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
    if (elseifESet) result.append(elseif); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //IfSubTypeImpl
