/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BxmlPackage;
import bxml.OpVarSub;
import bxml.SubstitutionType;
import bxml.VARINType;
import bxml.VariablesType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VARIN Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.VARINTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.VARINTypeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.impl.VARINTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.impl.VARINTypeImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VARINTypeImpl extends MinimalEObjectImpl.Container implements VARINType {
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
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected SubstitutionType body;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final OpVarSub OP_EDEFAULT = OpVarSub.ANY;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected OpVarSub op = OP_EDEFAULT;

  /**
   * This is true if the Op attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean opESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VARINTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getVARINType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIN_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIN_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIN_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIN_TYPE__ATTR, newAttr, newAttr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIN_TYPE__VARIABLES, oldVariables, newVariables);
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
        msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIN_TYPE__VARIABLES, null, msgs);
      if (newVariables != null)
        msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIN_TYPE__VARIABLES, null, msgs);
      msgs = basicSetVariables(newVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIN_TYPE__VARIABLES, newVariables, newVariables));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIN_TYPE__BODY, oldBody, newBody);
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
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIN_TYPE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIN_TYPE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIN_TYPE__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpVarSub getOp() {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(OpVarSub newOp) {
    OpVarSub oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    boolean oldOpESet = opESet;
    opESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIN_TYPE__OP, oldOp, op, !oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetOp() {
    OpVarSub oldOp = op;
    boolean oldOpESet = opESet;
    op = OP_EDEFAULT;
    opESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.VARIN_TYPE__OP, oldOp, OP_EDEFAULT, oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetOp() {
    return opESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.VARIN_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.VARIN_TYPE__VARIABLES:
        return basicSetVariables(null, msgs);
      case BxmlPackage.VARIN_TYPE__BODY:
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
      case BxmlPackage.VARIN_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.VARIN_TYPE__VARIABLES:
        return getVariables();
      case BxmlPackage.VARIN_TYPE__BODY:
        return getBody();
      case BxmlPackage.VARIN_TYPE__OP:
        return getOp();
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
      case BxmlPackage.VARIN_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.VARIN_TYPE__VARIABLES:
        setVariables((VariablesType1)newValue);
        return;
      case BxmlPackage.VARIN_TYPE__BODY:
        setBody((SubstitutionType)newValue);
        return;
      case BxmlPackage.VARIN_TYPE__OP:
        setOp((OpVarSub)newValue);
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
      case BxmlPackage.VARIN_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.VARIN_TYPE__VARIABLES:
        setVariables((VariablesType1)null);
        return;
      case BxmlPackage.VARIN_TYPE__BODY:
        setBody((SubstitutionType)null);
        return;
      case BxmlPackage.VARIN_TYPE__OP:
        unsetOp();
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
      case BxmlPackage.VARIN_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.VARIN_TYPE__VARIABLES:
        return variables != null;
      case BxmlPackage.VARIN_TYPE__BODY:
        return body != null;
      case BxmlPackage.VARIN_TYPE__OP:
        return isSetOp();
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
    result.append(" (op: ");
    if (opESet) result.append(op); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //VARINTypeImpl
