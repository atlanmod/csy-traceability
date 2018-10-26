/**
 */
package bxml.impl;

import bxml.BinaryExpType2;
import bxml.BxmlPackage;
import bxml.IdType;
import bxml.OpType1;
import bxml.StructType;
import bxml.UnaryExpType2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Exp Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getId <em>Id</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getId1 <em>Id1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getUnaryExp1 <em>Unary Exp1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getBinaryExp1 <em>Binary Exp1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getStruct1 <em>Struct1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getGenericType1 <em>Generic Type1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpType2Impl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpType2Impl extends MinimalEObjectImpl.Container implements BinaryExpType2 {
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
   * The cached value of the '{@link #getId1() <em>Id1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected IdType id1;

  /**
   * The cached value of the '{@link #getUnaryExp1() <em>Unary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryExp1()
   * @generated
   * @ordered
   */
  protected UnaryExpType2 unaryExp1;

  /**
   * The cached value of the '{@link #getBinaryExp1() <em>Binary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryExp1()
   * @generated
   * @ordered
   */
  protected BinaryExpType2 binaryExp1;

  /**
   * The cached value of the '{@link #getStruct1() <em>Struct1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct1()
   * @generated
   * @ordered
   */
  protected StructType struct1;

  /**
   * The default value of the '{@link #getGenericType1() <em>Generic Type1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType1()
   * @generated
   * @ordered
   */
  protected static final String GENERIC_TYPE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenericType1() <em>Generic Type1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType1()
   * @generated
   * @ordered
   */
  protected String genericType1 = GENERIC_TYPE1_EDEFAULT;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final OpType1 OP_EDEFAULT = OpType1.__;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected OpType1 op = OP_EDEFAULT;

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
  protected BinaryExpType2Impl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getBinaryExpType2();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__ID, oldId, newId);
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
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__ID, newId, newId));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP, oldUnaryExp, newUnaryExp);
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
        msgs = ((InternalEObject)unaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP, null, msgs);
      if (newUnaryExp != null)
        msgs = ((InternalEObject)newUnaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP, null, msgs);
      msgs = basicSetUnaryExp(newUnaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP, newUnaryExp, newUnaryExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP, oldBinaryExp, newBinaryExp);
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
        msgs = ((InternalEObject)binaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP, null, msgs);
      if (newBinaryExp != null)
        msgs = ((InternalEObject)newBinaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP, null, msgs);
      msgs = basicSetBinaryExp(newBinaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP, newBinaryExp, newBinaryExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__STRUCT, oldStruct, newStruct);
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
        msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__STRUCT, null, msgs);
      if (newStruct != null)
        msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__STRUCT, null, msgs);
      msgs = basicSetStruct(newStruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__STRUCT, newStruct, newStruct));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE, oldGenericType, genericType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdType getId1() {
    return id1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId1(IdType newId1, NotificationChain msgs) {
    IdType oldId1 = id1;
    id1 = newId1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__ID1, oldId1, newId1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId1(IdType newId1) {
    if (newId1 != id1) {
      NotificationChain msgs = null;
      if (id1 != null)
        msgs = ((InternalEObject)id1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__ID1, null, msgs);
      if (newId1 != null)
        msgs = ((InternalEObject)newId1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__ID1, null, msgs);
      msgs = basicSetId1(newId1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__ID1, newId1, newId1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpType2 getUnaryExp1() {
    return unaryExp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryExp1(UnaryExpType2 newUnaryExp1, NotificationChain msgs) {
    UnaryExpType2 oldUnaryExp1 = unaryExp1;
    unaryExp1 = newUnaryExp1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP1, oldUnaryExp1, newUnaryExp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryExp1(UnaryExpType2 newUnaryExp1) {
    if (newUnaryExp1 != unaryExp1) {
      NotificationChain msgs = null;
      if (unaryExp1 != null)
        msgs = ((InternalEObject)unaryExp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP1, null, msgs);
      if (newUnaryExp1 != null)
        msgs = ((InternalEObject)newUnaryExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP1, null, msgs);
      msgs = basicSetUnaryExp1(newUnaryExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP1, newUnaryExp1, newUnaryExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpType2 getBinaryExp1() {
    return binaryExp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryExp1(BinaryExpType2 newBinaryExp1, NotificationChain msgs) {
    BinaryExpType2 oldBinaryExp1 = binaryExp1;
    binaryExp1 = newBinaryExp1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP1, oldBinaryExp1, newBinaryExp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryExp1(BinaryExpType2 newBinaryExp1) {
    if (newBinaryExp1 != binaryExp1) {
      NotificationChain msgs = null;
      if (binaryExp1 != null)
        msgs = ((InternalEObject)binaryExp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP1, null, msgs);
      if (newBinaryExp1 != null)
        msgs = ((InternalEObject)newBinaryExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP1, null, msgs);
      msgs = basicSetBinaryExp1(newBinaryExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP1, newBinaryExp1, newBinaryExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructType getStruct1() {
    return struct1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct1(StructType newStruct1, NotificationChain msgs) {
    StructType oldStruct1 = struct1;
    struct1 = newStruct1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__STRUCT1, oldStruct1, newStruct1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct1(StructType newStruct1) {
    if (newStruct1 != struct1) {
      NotificationChain msgs = null;
      if (struct1 != null)
        msgs = ((InternalEObject)struct1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__STRUCT1, null, msgs);
      if (newStruct1 != null)
        msgs = ((InternalEObject)newStruct1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXP_TYPE2__STRUCT1, null, msgs);
      msgs = basicSetStruct1(newStruct1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__STRUCT1, newStruct1, newStruct1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGenericType1() {
    return genericType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericType1(String newGenericType1) {
    String oldGenericType1 = genericType1;
    genericType1 = newGenericType1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE1, oldGenericType1, genericType1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType1 getOp() {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(OpType1 newOp) {
    OpType1 oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    boolean oldOpESet = opESet;
    opESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXP_TYPE2__OP, oldOp, op, !oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetOp() {
    OpType1 oldOp = op;
    boolean oldOpESet = opESet;
    op = OP_EDEFAULT;
    opESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.BINARY_EXP_TYPE2__OP, oldOp, OP_EDEFAULT, oldOpESet));
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
      case BxmlPackage.BINARY_EXP_TYPE2__ID:
        return basicSetId(null, msgs);
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP:
        return basicSetUnaryExp(null, msgs);
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP:
        return basicSetBinaryExp(null, msgs);
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT:
        return basicSetStruct(null, msgs);
      case BxmlPackage.BINARY_EXP_TYPE2__ID1:
        return basicSetId1(null, msgs);
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP1:
        return basicSetUnaryExp1(null, msgs);
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP1:
        return basicSetBinaryExp1(null, msgs);
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT1:
        return basicSetStruct1(null, msgs);
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
      case BxmlPackage.BINARY_EXP_TYPE2__ID:
        return getId();
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP:
        return getUnaryExp();
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP:
        return getBinaryExp();
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT:
        return getStruct();
      case BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE:
        return getGenericType();
      case BxmlPackage.BINARY_EXP_TYPE2__ID1:
        return getId1();
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP1:
        return getUnaryExp1();
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP1:
        return getBinaryExp1();
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT1:
        return getStruct1();
      case BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE1:
        return getGenericType1();
      case BxmlPackage.BINARY_EXP_TYPE2__OP:
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
      case BxmlPackage.BINARY_EXP_TYPE2__ID:
        setId((IdType)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP:
        setUnaryExp((UnaryExpType2)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP:
        setBinaryExp((BinaryExpType2)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT:
        setStruct((StructType)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE:
        setGenericType((String)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__ID1:
        setId1((IdType)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP1:
        setUnaryExp1((UnaryExpType2)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP1:
        setBinaryExp1((BinaryExpType2)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT1:
        setStruct1((StructType)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE1:
        setGenericType1((String)newValue);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__OP:
        setOp((OpType1)newValue);
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
      case BxmlPackage.BINARY_EXP_TYPE2__ID:
        setId((IdType)null);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP:
        setUnaryExp((UnaryExpType2)null);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP:
        setBinaryExp((BinaryExpType2)null);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT:
        setStruct((StructType)null);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE:
        setGenericType(GENERIC_TYPE_EDEFAULT);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__ID1:
        setId1((IdType)null);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP1:
        setUnaryExp1((UnaryExpType2)null);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP1:
        setBinaryExp1((BinaryExpType2)null);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT1:
        setStruct1((StructType)null);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE1:
        setGenericType1(GENERIC_TYPE1_EDEFAULT);
        return;
      case BxmlPackage.BINARY_EXP_TYPE2__OP:
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
      case BxmlPackage.BINARY_EXP_TYPE2__ID:
        return id != null;
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP:
        return unaryExp != null;
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP:
        return binaryExp != null;
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT:
        return struct != null;
      case BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE:
        return GENERIC_TYPE_EDEFAULT == null ? genericType != null : !GENERIC_TYPE_EDEFAULT.equals(genericType);
      case BxmlPackage.BINARY_EXP_TYPE2__ID1:
        return id1 != null;
      case BxmlPackage.BINARY_EXP_TYPE2__UNARY_EXP1:
        return unaryExp1 != null;
      case BxmlPackage.BINARY_EXP_TYPE2__BINARY_EXP1:
        return binaryExp1 != null;
      case BxmlPackage.BINARY_EXP_TYPE2__STRUCT1:
        return struct1 != null;
      case BxmlPackage.BINARY_EXP_TYPE2__GENERIC_TYPE1:
        return GENERIC_TYPE1_EDEFAULT == null ? genericType1 != null : !GENERIC_TYPE1_EDEFAULT.equals(genericType1);
      case BxmlPackage.BINARY_EXP_TYPE2__OP:
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
    result.append(" (genericType: ");
    result.append(genericType);
    result.append(", genericType1: ");
    result.append(genericType1);
    result.append(", op: ");
    if (opESet) result.append(op); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //BinaryExpType2Impl
