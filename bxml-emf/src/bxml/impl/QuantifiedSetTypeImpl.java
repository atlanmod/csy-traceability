/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BodyType;
import bxml.BxmlPackage;
import bxml.QuantifiedSetType;
import bxml.VariablesType1;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantified Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.QuantifiedSetTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.QuantifiedSetTypeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.impl.QuantifiedSetTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.impl.QuantifiedSetTypeImpl#getTypref <em>Typref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifiedSetTypeImpl extends MinimalEObjectImpl.Container implements QuantifiedSetType {
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
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected VariablesType1 variables;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected BodyType body;

  /**
   * The default value of the '{@link #getTypref() <em>Typref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypref()
   * @generated
   * @ordered
   */
  protected static final BigInteger TYPREF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypref() <em>Typref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypref()
   * @generated
   * @ordered
   */
  protected BigInteger typref = TYPREF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantifiedSetTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getQuantifiedSetType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_SET_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_SET_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_SET_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_SET_TYPE__ATTR, newAttr, newAttr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_SET_TYPE__VARIABLES, oldVariables, newVariables);
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
        msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_SET_TYPE__VARIABLES, null, msgs);
      if (newVariables != null)
        msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_SET_TYPE__VARIABLES, null, msgs);
      msgs = basicSetVariables(newVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_SET_TYPE__VARIABLES, newVariables, newVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType getBody() {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(BodyType newBody, NotificationChain msgs) {
    BodyType oldBody = body;
    body = newBody;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_SET_TYPE__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(BodyType newBody) {
    if (newBody != body) {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_SET_TYPE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_SET_TYPE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_SET_TYPE__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getTypref() {
    return typref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypref(BigInteger newTypref) {
    BigInteger oldTypref = typref;
    typref = newTypref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_SET_TYPE__TYPREF, oldTypref, typref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.QUANTIFIED_SET_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.QUANTIFIED_SET_TYPE__VARIABLES:
        return basicSetVariables(null, msgs);
      case BxmlPackage.QUANTIFIED_SET_TYPE__BODY:
        return basicSetBody(null, msgs);
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
      case BxmlPackage.QUANTIFIED_SET_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.QUANTIFIED_SET_TYPE__VARIABLES:
        return getVariables();
      case BxmlPackage.QUANTIFIED_SET_TYPE__BODY:
        return getBody();
      case BxmlPackage.QUANTIFIED_SET_TYPE__TYPREF:
        return getTypref();
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
      case BxmlPackage.QUANTIFIED_SET_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.QUANTIFIED_SET_TYPE__VARIABLES:
        setVariables((VariablesType1)newValue);
        return;
      case BxmlPackage.QUANTIFIED_SET_TYPE__BODY:
        setBody((BodyType)newValue);
        return;
      case BxmlPackage.QUANTIFIED_SET_TYPE__TYPREF:
        setTypref((BigInteger)newValue);
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
      case BxmlPackage.QUANTIFIED_SET_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.QUANTIFIED_SET_TYPE__VARIABLES:
        setVariables((VariablesType1)null);
        return;
      case BxmlPackage.QUANTIFIED_SET_TYPE__BODY:
        setBody((BodyType)null);
        return;
      case BxmlPackage.QUANTIFIED_SET_TYPE__TYPREF:
        setTypref(TYPREF_EDEFAULT);
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
      case BxmlPackage.QUANTIFIED_SET_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.QUANTIFIED_SET_TYPE__VARIABLES:
        return variables != null;
      case BxmlPackage.QUANTIFIED_SET_TYPE__BODY:
        return body != null;
      case BxmlPackage.QUANTIFIED_SET_TYPE__TYPREF:
        return TYPREF_EDEFAULT == null ? typref != null : !TYPREF_EDEFAULT.equals(typref);
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
    result.append(" (typref: ");
    result.append(typref);
    result.append(')');
    return result.toString();
  }

} //QuantifiedSetTypeImpl
