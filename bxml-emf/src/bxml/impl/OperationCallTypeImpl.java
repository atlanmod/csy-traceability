/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BxmlPackage;
import bxml.InputParametersType1;
import bxml.NameType;
import bxml.OperationCallType;
import bxml.OutputParametersType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.OperationCallTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.OperationCallTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link bxml.impl.OperationCallTypeImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link bxml.impl.OperationCallTypeImpl#getOutputParameters <em>Output Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallTypeImpl extends MinimalEObjectImpl.Container implements OperationCallType {
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
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected NameType name;

  /**
   * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputParameters()
   * @generated
   * @ordered
   */
  protected InputParametersType1 inputParameters;

  /**
   * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputParameters()
   * @generated
   * @ordered
   */
  protected OutputParametersType1 outputParameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationCallTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getOperationCallType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_CALL_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_CALL_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_CALL_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_CALL_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameType getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
    NameType oldName = name;
    name = newName;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_CALL_TYPE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(NameType newName) {
    if (newName != name) {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_CALL_TYPE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_CALL_TYPE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_CALL_TYPE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputParametersType1 getInputParameters() {
    return inputParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputParameters(InputParametersType1 newInputParameters, NotificationChain msgs) {
    InputParametersType1 oldInputParameters = inputParameters;
    inputParameters = newInputParameters;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_CALL_TYPE__INPUT_PARAMETERS, oldInputParameters, newInputParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputParameters(InputParametersType1 newInputParameters) {
    if (newInputParameters != inputParameters) {
      NotificationChain msgs = null;
      if (inputParameters != null)
        msgs = ((InternalEObject)inputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_CALL_TYPE__INPUT_PARAMETERS, null, msgs);
      if (newInputParameters != null)
        msgs = ((InternalEObject)newInputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_CALL_TYPE__INPUT_PARAMETERS, null, msgs);
      msgs = basicSetInputParameters(newInputParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_CALL_TYPE__INPUT_PARAMETERS, newInputParameters, newInputParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputParametersType1 getOutputParameters() {
    return outputParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputParameters(OutputParametersType1 newOutputParameters, NotificationChain msgs) {
    OutputParametersType1 oldOutputParameters = outputParameters;
    outputParameters = newOutputParameters;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_CALL_TYPE__OUTPUT_PARAMETERS, oldOutputParameters, newOutputParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputParameters(OutputParametersType1 newOutputParameters) {
    if (newOutputParameters != outputParameters) {
      NotificationChain msgs = null;
      if (outputParameters != null)
        msgs = ((InternalEObject)outputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_CALL_TYPE__OUTPUT_PARAMETERS, null, msgs);
      if (newOutputParameters != null)
        msgs = ((InternalEObject)newOutputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_CALL_TYPE__OUTPUT_PARAMETERS, null, msgs);
      msgs = basicSetOutputParameters(newOutputParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_CALL_TYPE__OUTPUT_PARAMETERS, newOutputParameters, newOutputParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.OPERATION_CALL_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.OPERATION_CALL_TYPE__NAME:
        return basicSetName(null, msgs);
      case BxmlPackage.OPERATION_CALL_TYPE__INPUT_PARAMETERS:
        return basicSetInputParameters(null, msgs);
      case BxmlPackage.OPERATION_CALL_TYPE__OUTPUT_PARAMETERS:
        return basicSetOutputParameters(null, msgs);
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
      case BxmlPackage.OPERATION_CALL_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.OPERATION_CALL_TYPE__NAME:
        return getName();
      case BxmlPackage.OPERATION_CALL_TYPE__INPUT_PARAMETERS:
        return getInputParameters();
      case BxmlPackage.OPERATION_CALL_TYPE__OUTPUT_PARAMETERS:
        return getOutputParameters();
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
      case BxmlPackage.OPERATION_CALL_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.OPERATION_CALL_TYPE__NAME:
        setName((NameType)newValue);
        return;
      case BxmlPackage.OPERATION_CALL_TYPE__INPUT_PARAMETERS:
        setInputParameters((InputParametersType1)newValue);
        return;
      case BxmlPackage.OPERATION_CALL_TYPE__OUTPUT_PARAMETERS:
        setOutputParameters((OutputParametersType1)newValue);
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
      case BxmlPackage.OPERATION_CALL_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.OPERATION_CALL_TYPE__NAME:
        setName((NameType)null);
        return;
      case BxmlPackage.OPERATION_CALL_TYPE__INPUT_PARAMETERS:
        setInputParameters((InputParametersType1)null);
        return;
      case BxmlPackage.OPERATION_CALL_TYPE__OUTPUT_PARAMETERS:
        setOutputParameters((OutputParametersType1)null);
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
      case BxmlPackage.OPERATION_CALL_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.OPERATION_CALL_TYPE__NAME:
        return name != null;
      case BxmlPackage.OPERATION_CALL_TYPE__INPUT_PARAMETERS:
        return inputParameters != null;
      case BxmlPackage.OPERATION_CALL_TYPE__OUTPUT_PARAMETERS:
        return outputParameters != null;
    }
    return super.eIsSet(featureID);
  }

} //OperationCallTypeImpl
