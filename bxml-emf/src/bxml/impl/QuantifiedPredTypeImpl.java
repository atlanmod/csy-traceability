/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BxmlPackage;
import bxml.PredicateType;
import bxml.QuantifiedPredOp;
import bxml.QuantifiedPredType;
import bxml.VariablesType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantified Pred Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.QuantifiedPredTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.QuantifiedPredTypeImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.impl.QuantifiedPredTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.impl.QuantifiedPredTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifiedPredTypeImpl extends MinimalEObjectImpl.Container implements QuantifiedPredType {
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
  protected PredicateType body;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final QuantifiedPredOp TYPE_EDEFAULT = QuantifiedPredOp.__;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected QuantifiedPredOp type = TYPE_EDEFAULT;

  /**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean typeESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantifiedPredTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getQuantifiedPredType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_PRED_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_PRED_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_PRED_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_PRED_TYPE__ATTR, newAttr, newAttr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_PRED_TYPE__VARIABLES, oldVariables, newVariables);
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
        msgs = ((InternalEObject)variables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_PRED_TYPE__VARIABLES, null, msgs);
      if (newVariables != null)
        msgs = ((InternalEObject)newVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_PRED_TYPE__VARIABLES, null, msgs);
      msgs = basicSetVariables(newVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_PRED_TYPE__VARIABLES, newVariables, newVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateType getBody() {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(PredicateType newBody, NotificationChain msgs) {
    PredicateType oldBody = body;
    body = newBody;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_PRED_TYPE__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(PredicateType newBody) {
    if (newBody != body) {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_PRED_TYPE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.QUANTIFIED_PRED_TYPE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_PRED_TYPE__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedPredOp getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(QuantifiedPredOp newType) {
    QuantifiedPredOp oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.QUANTIFIED_PRED_TYPE__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetType() {
    QuantifiedPredOp oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.QUANTIFIED_PRED_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetType() {
    return typeESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.QUANTIFIED_PRED_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.QUANTIFIED_PRED_TYPE__VARIABLES:
        return basicSetVariables(null, msgs);
      case BxmlPackage.QUANTIFIED_PRED_TYPE__BODY:
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
      case BxmlPackage.QUANTIFIED_PRED_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.QUANTIFIED_PRED_TYPE__VARIABLES:
        return getVariables();
      case BxmlPackage.QUANTIFIED_PRED_TYPE__BODY:
        return getBody();
      case BxmlPackage.QUANTIFIED_PRED_TYPE__TYPE:
        return getType();
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
      case BxmlPackage.QUANTIFIED_PRED_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.QUANTIFIED_PRED_TYPE__VARIABLES:
        setVariables((VariablesType1)newValue);
        return;
      case BxmlPackage.QUANTIFIED_PRED_TYPE__BODY:
        setBody((PredicateType)newValue);
        return;
      case BxmlPackage.QUANTIFIED_PRED_TYPE__TYPE:
        setType((QuantifiedPredOp)newValue);
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
      case BxmlPackage.QUANTIFIED_PRED_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.QUANTIFIED_PRED_TYPE__VARIABLES:
        setVariables((VariablesType1)null);
        return;
      case BxmlPackage.QUANTIFIED_PRED_TYPE__BODY:
        setBody((PredicateType)null);
        return;
      case BxmlPackage.QUANTIFIED_PRED_TYPE__TYPE:
        unsetType();
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
      case BxmlPackage.QUANTIFIED_PRED_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.QUANTIFIED_PRED_TYPE__VARIABLES:
        return variables != null;
      case BxmlPackage.QUANTIFIED_PRED_TYPE__BODY:
        return body != null;
      case BxmlPackage.QUANTIFIED_PRED_TYPE__TYPE:
        return isSetType();
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
    result.append(" (type: ");
    if (typeESet) result.append(type); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //QuantifiedPredTypeImpl
