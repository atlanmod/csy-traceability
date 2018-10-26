/**
 */
package bxml.impl;

import bxml.BinaryExpType2;
import bxml.BxmlPackage;
import bxml.IdType;
import bxml.StructType;
import bxml.TypeInfo;
import bxml.UnaryExpType2;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.TypeInfoImpl#getId <em>Id</em>}</li>
 *   <li>{@link bxml.impl.TypeInfoImpl#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.impl.TypeInfoImpl#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.impl.TypeInfoImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.impl.TypeInfoImpl#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link bxml.impl.TypeInfoImpl#getId1 <em>Id1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeInfoImpl extends MinimalEObjectImpl.Container implements TypeInfo {
  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected IdType id;

  /**
   * The cached value of the '{@link #getUnaryExp() <em>Unary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryExp()
   * @generated
   * @ordered
   */
  protected UnaryExpType2 unaryExp;

  /**
   * The cached value of the '{@link #getBinaryExp() <em>Binary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryExp()
   * @generated
   * @ordered
   */
  protected BinaryExpType2 binaryExp;

  /**
   * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct()
   * @generated
   * @ordered
   */
  protected StructType struct;

  /**
   * The default value of the '{@link #getGenericType() <em>Generic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType()
   * @generated
   * @ordered
   */
  protected static final String GENERIC_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenericType() <em>Generic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType()
   * @generated
   * @ordered
   */
  protected String genericType = GENERIC_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getId1() <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected static final BigInteger ID1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId1() <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected BigInteger id1 = ID1_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeInfoImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getTypeInfo();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdType getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(IdType newId, NotificationChain msgs) {
    IdType oldId = id;
    id = newId;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(IdType newId) {
    if (newId != id) {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.TYPE_INFO__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.TYPE_INFO__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__ID, newId, newId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpType2 getUnaryExp() {
    return unaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryExp(UnaryExpType2 newUnaryExp, NotificationChain msgs) {
    UnaryExpType2 oldUnaryExp = unaryExp;
    unaryExp = newUnaryExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__UNARY_EXP, oldUnaryExp, newUnaryExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryExp(UnaryExpType2 newUnaryExp) {
    if (newUnaryExp != unaryExp) {
      NotificationChain msgs = null;
      if (unaryExp != null)
        msgs = ((InternalEObject)unaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.TYPE_INFO__UNARY_EXP, null, msgs);
      if (newUnaryExp != null)
        msgs = ((InternalEObject)newUnaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.TYPE_INFO__UNARY_EXP, null, msgs);
      msgs = basicSetUnaryExp(newUnaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__UNARY_EXP, newUnaryExp, newUnaryExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpType2 getBinaryExp() {
    return binaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryExp(BinaryExpType2 newBinaryExp, NotificationChain msgs) {
    BinaryExpType2 oldBinaryExp = binaryExp;
    binaryExp = newBinaryExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__BINARY_EXP, oldBinaryExp, newBinaryExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryExp(BinaryExpType2 newBinaryExp) {
    if (newBinaryExp != binaryExp) {
      NotificationChain msgs = null;
      if (binaryExp != null)
        msgs = ((InternalEObject)binaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.TYPE_INFO__BINARY_EXP, null, msgs);
      if (newBinaryExp != null)
        msgs = ((InternalEObject)newBinaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.TYPE_INFO__BINARY_EXP, null, msgs);
      msgs = basicSetBinaryExp(newBinaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__BINARY_EXP, newBinaryExp, newBinaryExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructType getStruct() {
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct(StructType newStruct, NotificationChain msgs) {
    StructType oldStruct = struct;
    struct = newStruct;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__STRUCT, oldStruct, newStruct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct(StructType newStruct) {
    if (newStruct != struct) {
      NotificationChain msgs = null;
      if (struct != null)
        msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.TYPE_INFO__STRUCT, null, msgs);
      if (newStruct != null)
        msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.TYPE_INFO__STRUCT, null, msgs);
      msgs = basicSetStruct(newStruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__STRUCT, newStruct, newStruct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGenericType() {
    return genericType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericType(String newGenericType) {
    String oldGenericType = genericType;
    genericType = newGenericType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__GENERIC_TYPE, oldGenericType, genericType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getId1() {
    return id1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId1(BigInteger newId1) {
    BigInteger oldId1 = id1;
    id1 = newId1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.TYPE_INFO__ID1, oldId1, id1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.TYPE_INFO__ID:
        return basicSetId(null, msgs);
      case BxmlPackage.TYPE_INFO__UNARY_EXP:
        return basicSetUnaryExp(null, msgs);
      case BxmlPackage.TYPE_INFO__BINARY_EXP:
        return basicSetBinaryExp(null, msgs);
      case BxmlPackage.TYPE_INFO__STRUCT:
        return basicSetStruct(null, msgs);
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
      case BxmlPackage.TYPE_INFO__ID:
        return getId();
      case BxmlPackage.TYPE_INFO__UNARY_EXP:
        return getUnaryExp();
      case BxmlPackage.TYPE_INFO__BINARY_EXP:
        return getBinaryExp();
      case BxmlPackage.TYPE_INFO__STRUCT:
        return getStruct();
      case BxmlPackage.TYPE_INFO__GENERIC_TYPE:
        return getGenericType();
      case BxmlPackage.TYPE_INFO__ID1:
        return getId1();
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
      case BxmlPackage.TYPE_INFO__ID:
        setId((IdType)newValue);
        return;
      case BxmlPackage.TYPE_INFO__UNARY_EXP:
        setUnaryExp((UnaryExpType2)newValue);
        return;
      case BxmlPackage.TYPE_INFO__BINARY_EXP:
        setBinaryExp((BinaryExpType2)newValue);
        return;
      case BxmlPackage.TYPE_INFO__STRUCT:
        setStruct((StructType)newValue);
        return;
      case BxmlPackage.TYPE_INFO__GENERIC_TYPE:
        setGenericType((String)newValue);
        return;
      case BxmlPackage.TYPE_INFO__ID1:
        setId1((BigInteger)newValue);
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
      case BxmlPackage.TYPE_INFO__ID:
        setId((IdType)null);
        return;
      case BxmlPackage.TYPE_INFO__UNARY_EXP:
        setUnaryExp((UnaryExpType2)null);
        return;
      case BxmlPackage.TYPE_INFO__BINARY_EXP:
        setBinaryExp((BinaryExpType2)null);
        return;
      case BxmlPackage.TYPE_INFO__STRUCT:
        setStruct((StructType)null);
        return;
      case BxmlPackage.TYPE_INFO__GENERIC_TYPE:
        setGenericType(GENERIC_TYPE_EDEFAULT);
        return;
      case BxmlPackage.TYPE_INFO__ID1:
        setId1(ID1_EDEFAULT);
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
      case BxmlPackage.TYPE_INFO__ID:
        return id != null;
      case BxmlPackage.TYPE_INFO__UNARY_EXP:
        return unaryExp != null;
      case BxmlPackage.TYPE_INFO__BINARY_EXP:
        return binaryExp != null;
      case BxmlPackage.TYPE_INFO__STRUCT:
        return struct != null;
      case BxmlPackage.TYPE_INFO__GENERIC_TYPE:
        return GENERIC_TYPE_EDEFAULT == null ? genericType != null : !GENERIC_TYPE_EDEFAULT.equals(genericType);
      case BxmlPackage.TYPE_INFO__ID1:
        return ID1_EDEFAULT == null ? id1 != null : !ID1_EDEFAULT.equals(id1);
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
    result.append(" (genericType: ");
    result.append(genericType);
    result.append(", id1: ");
    result.append(id1);
    result.append(')');
    return result.toString();
  }

} //TypeInfoImpl
