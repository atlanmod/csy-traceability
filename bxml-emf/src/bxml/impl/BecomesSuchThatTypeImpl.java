/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BecomesSuchThatType;
import bxml.BxmlPackage;
import bxml.PredicateType;
import bxml.VariablesType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Becomes Such That Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.BecomesSuchThatTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.BecomesSuchThatTypeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.impl.BecomesSuchThatTypeImpl#getPred <em>Pred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BecomesSuchThatTypeImpl extends MinimalEObjectImpl.Container implements BecomesSuchThatType {
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
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected VariablesType1 variables;

  /**
   * The cached value of the '{@link #getPred() <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPred()
   * @generated
   * @ordered
   */
  protected PredicateType pred;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BecomesSuchThatTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getBecomesSuchThatType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BECOMES_SUCH_THAT_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BECOMES_SUCH_THAT_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BECOMES_SUCH_THAT_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BECOMES_SUCH_THAT_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablesType1 getVariables() {
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariables(VariablesType1 newVariables, NotificationChain msgs) {
    VariablesType1 oldVariables = variables;
    variables = newVariables;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BECOMES_SUCH_THAT_TYPE__VARIABLES, oldVariables, newVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariables(VariablesType1 newVariables) {
    if (newVariables != variables) {
      NotificationChain msgs = null;
      if (variables != null)
        msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BECOMES_SUCH_THAT_TYPE__VARIABLES, null, msgs);
      if (newVariables != null)
        msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BECOMES_SUCH_THAT_TYPE__VARIABLES, null, msgs);
      msgs = basicSetVariables(newVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BECOMES_SUCH_THAT_TYPE__VARIABLES, newVariables, newVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateType getPred() {
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPred(PredicateType newPred, NotificationChain msgs) {
    PredicateType oldPred = pred;
    pred = newPred;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BECOMES_SUCH_THAT_TYPE__PRED, oldPred, newPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPred(PredicateType newPred) {
    if (newPred != pred) {
      NotificationChain msgs = null;
      if (pred != null)
        msgs = ((InternalEObject)pred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BECOMES_SUCH_THAT_TYPE__PRED, null, msgs);
      if (newPred != null)
        msgs = ((InternalEObject)newPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BECOMES_SUCH_THAT_TYPE__PRED, null, msgs);
      msgs = basicSetPred(newPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BECOMES_SUCH_THAT_TYPE__PRED, newPred, newPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__VARIABLES:
        return basicSetVariables(null, msgs);
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__PRED:
        return basicSetPred(null, msgs);
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
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__VARIABLES:
        return getVariables();
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__PRED:
        return getPred();
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
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__VARIABLES:
        setVariables((VariablesType1)newValue);
        return;
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__PRED:
        setPred((PredicateType)newValue);
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
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__VARIABLES:
        setVariables((VariablesType1)null);
        return;
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__PRED:
        setPred((PredicateType)null);
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
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__VARIABLES:
        return variables != null;
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE__PRED:
        return pred != null;
    }
    return super.eIsSet(featureID);
  }

} //BecomesSuchThatTypeImpl
