/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BodyType1;
import bxml.BxmlPackage;
import bxml.InputParametersType;
import bxml.OperationType;
import bxml.OutputParametersType;
import bxml.PreconditionType;
import bxml.RefinesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.OperationTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.OperationTypeImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link bxml.impl.OperationTypeImpl#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link bxml.impl.OperationTypeImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link bxml.impl.OperationTypeImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link bxml.impl.OperationTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.impl.OperationTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationTypeImpl extends MinimalEObjectImpl.Container implements OperationType {
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
   * The cached value of the '{@link #getRefines() <em>Refines</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefines()
   * @generated
   * @ordered
   */
  protected RefinesType refines;

  /**
   * The cached value of the '{@link #getOutputParameters() <em>Output Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputParameters()
   * @generated
   * @ordered
   */
  protected OutputParametersType outputParameters;

  /**
   * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputParameters()
   * @generated
   * @ordered
   */
  protected InputParametersType inputParameters;

  /**
   * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrecondition()
   * @generated
   * @ordered
   */
  protected PreconditionType precondition;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected BodyType1 body;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final Object NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Object name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getOperationType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefinesType getRefines() {
    return refines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefines(RefinesType newRefines, NotificationChain msgs) {
    RefinesType oldRefines = refines;
    refines = newRefines;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__REFINES, oldRefines, newRefines);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefines(RefinesType newRefines) {
    if (newRefines != refines) {
      NotificationChain msgs = null;
      if (refines != null)
        msgs = ((InternalEObject)refines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__REFINES, null, msgs);
      if (newRefines != null)
        msgs = ((InternalEObject)newRefines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__REFINES, null, msgs);
      msgs = basicSetRefines(newRefines, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__REFINES, newRefines, newRefines));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputParametersType getOutputParameters() {
    return outputParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputParameters(OutputParametersType newOutputParameters, NotificationChain msgs) {
    OutputParametersType oldOutputParameters = outputParameters;
    outputParameters = newOutputParameters;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__OUTPUT_PARAMETERS, oldOutputParameters, newOutputParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputParameters(OutputParametersType newOutputParameters) {
    if (newOutputParameters != outputParameters) {
      NotificationChain msgs = null;
      if (outputParameters != null)
        msgs = ((InternalEObject)outputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__OUTPUT_PARAMETERS, null, msgs);
      if (newOutputParameters != null)
        msgs = ((InternalEObject)newOutputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__OUTPUT_PARAMETERS, null, msgs);
      msgs = basicSetOutputParameters(newOutputParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__OUTPUT_PARAMETERS, newOutputParameters, newOutputParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputParametersType getInputParameters() {
    return inputParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputParameters(InputParametersType newInputParameters, NotificationChain msgs) {
    InputParametersType oldInputParameters = inputParameters;
    inputParameters = newInputParameters;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__INPUT_PARAMETERS, oldInputParameters, newInputParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputParameters(InputParametersType newInputParameters) {
    if (newInputParameters != inputParameters) {
      NotificationChain msgs = null;
      if (inputParameters != null)
        msgs = ((InternalEObject)inputParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__INPUT_PARAMETERS, null, msgs);
      if (newInputParameters != null)
        msgs = ((InternalEObject)newInputParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__INPUT_PARAMETERS, null, msgs);
      msgs = basicSetInputParameters(newInputParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__INPUT_PARAMETERS, newInputParameters, newInputParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreconditionType getPrecondition() {
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrecondition(PreconditionType newPrecondition, NotificationChain msgs) {
    PreconditionType oldPrecondition = precondition;
    precondition = newPrecondition;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__PRECONDITION, oldPrecondition, newPrecondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecondition(PreconditionType newPrecondition) {
    if (newPrecondition != precondition) {
      NotificationChain msgs = null;
      if (precondition != null)
        msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__PRECONDITION, null, msgs);
      if (newPrecondition != null)
        msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__PRECONDITION, null, msgs);
      msgs = basicSetPrecondition(newPrecondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__PRECONDITION, newPrecondition, newPrecondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType1 getBody() {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(BodyType1 newBody, NotificationChain msgs) {
    BodyType1 oldBody = body;
    body = newBody;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(BodyType1 newBody) {
    if (newBody != body) {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.OPERATION_TYPE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Object newName) {
    Object oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.OPERATION_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.OPERATION_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.OPERATION_TYPE__REFINES:
        return basicSetRefines(null, msgs);
      case BxmlPackage.OPERATION_TYPE__OUTPUT_PARAMETERS:
        return basicSetOutputParameters(null, msgs);
      case BxmlPackage.OPERATION_TYPE__INPUT_PARAMETERS:
        return basicSetInputParameters(null, msgs);
      case BxmlPackage.OPERATION_TYPE__PRECONDITION:
        return basicSetPrecondition(null, msgs);
      case BxmlPackage.OPERATION_TYPE__BODY:
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
      case BxmlPackage.OPERATION_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.OPERATION_TYPE__REFINES:
        return getRefines();
      case BxmlPackage.OPERATION_TYPE__OUTPUT_PARAMETERS:
        return getOutputParameters();
      case BxmlPackage.OPERATION_TYPE__INPUT_PARAMETERS:
        return getInputParameters();
      case BxmlPackage.OPERATION_TYPE__PRECONDITION:
        return getPrecondition();
      case BxmlPackage.OPERATION_TYPE__BODY:
        return getBody();
      case BxmlPackage.OPERATION_TYPE__NAME:
        return getName();
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
      case BxmlPackage.OPERATION_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.OPERATION_TYPE__REFINES:
        setRefines((RefinesType)newValue);
        return;
      case BxmlPackage.OPERATION_TYPE__OUTPUT_PARAMETERS:
        setOutputParameters((OutputParametersType)newValue);
        return;
      case BxmlPackage.OPERATION_TYPE__INPUT_PARAMETERS:
        setInputParameters((InputParametersType)newValue);
        return;
      case BxmlPackage.OPERATION_TYPE__PRECONDITION:
        setPrecondition((PreconditionType)newValue);
        return;
      case BxmlPackage.OPERATION_TYPE__BODY:
        setBody((BodyType1)newValue);
        return;
      case BxmlPackage.OPERATION_TYPE__NAME:
        setName(newValue);
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
      case BxmlPackage.OPERATION_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.OPERATION_TYPE__REFINES:
        setRefines((RefinesType)null);
        return;
      case BxmlPackage.OPERATION_TYPE__OUTPUT_PARAMETERS:
        setOutputParameters((OutputParametersType)null);
        return;
      case BxmlPackage.OPERATION_TYPE__INPUT_PARAMETERS:
        setInputParameters((InputParametersType)null);
        return;
      case BxmlPackage.OPERATION_TYPE__PRECONDITION:
        setPrecondition((PreconditionType)null);
        return;
      case BxmlPackage.OPERATION_TYPE__BODY:
        setBody((BodyType1)null);
        return;
      case BxmlPackage.OPERATION_TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case BxmlPackage.OPERATION_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.OPERATION_TYPE__REFINES:
        return refines != null;
      case BxmlPackage.OPERATION_TYPE__OUTPUT_PARAMETERS:
        return outputParameters != null;
      case BxmlPackage.OPERATION_TYPE__INPUT_PARAMETERS:
        return inputParameters != null;
      case BxmlPackage.OPERATION_TYPE__PRECONDITION:
        return precondition != null;
      case BxmlPackage.OPERATION_TYPE__BODY:
        return body != null;
      case BxmlPackage.OPERATION_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //OperationTypeImpl
