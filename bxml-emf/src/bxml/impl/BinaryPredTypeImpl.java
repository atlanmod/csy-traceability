/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BinaryPredType;
import bxml.BxmlPackage;
import bxml.ExpComparisonType;
import bxml.NaryPredType;
import bxml.OpType7;
import bxml.QuantifiedPredType;
import bxml.SetType1;
import bxml.UnaryPredType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Pred Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getBinaryPred1 <em>Binary Pred1</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getNaryPred1 <em>Nary Pred1</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getUnaryPred1 <em>Unary Pred1</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getQuantifiedPred1 <em>Quantified Pred1</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getExpComparison1 <em>Exp Comparison1</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getSet1 <em>Set1</em>}</li>
 *   <li>{@link bxml.impl.BinaryPredTypeImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryPredTypeImpl extends MinimalEObjectImpl.Container implements BinaryPredType {
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
   * The cached value of the '{@link #getBinaryPred() <em>Binary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryPred()
   * @generated
   * @ordered
   */
  protected BinaryPredType binaryPred;

  /**
   * The cached value of the '{@link #getNaryPred() <em>Nary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNaryPred()
   * @generated
   * @ordered
   */
  protected NaryPredType naryPred;

  /**
   * The cached value of the '{@link #getUnaryPred() <em>Unary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryPred()
   * @generated
   * @ordered
   */
  protected UnaryPredType unaryPred;

  /**
   * The cached value of the '{@link #getQuantifiedPred() <em>Quantified Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedPred()
   * @generated
   * @ordered
   */
  protected QuantifiedPredType quantifiedPred;

  /**
   * The cached value of the '{@link #getExpComparison() <em>Exp Comparison</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpComparison()
   * @generated
   * @ordered
   */
  protected ExpComparisonType expComparison;

  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected SetType1 set;

  /**
   * The cached value of the '{@link #getBinaryPred1() <em>Binary Pred1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryPred1()
   * @generated
   * @ordered
   */
  protected BinaryPredType binaryPred1;

  /**
   * The cached value of the '{@link #getNaryPred1() <em>Nary Pred1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNaryPred1()
   * @generated
   * @ordered
   */
  protected NaryPredType naryPred1;

  /**
   * The cached value of the '{@link #getUnaryPred1() <em>Unary Pred1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryPred1()
   * @generated
   * @ordered
   */
  protected UnaryPredType unaryPred1;

  /**
   * The cached value of the '{@link #getQuantifiedPred1() <em>Quantified Pred1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedPred1()
   * @generated
   * @ordered
   */
  protected QuantifiedPredType quantifiedPred1;

  /**
   * The cached value of the '{@link #getExpComparison1() <em>Exp Comparison1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpComparison1()
   * @generated
   * @ordered
   */
  protected ExpComparisonType expComparison1;

  /**
   * The cached value of the '{@link #getSet1() <em>Set1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet1()
   * @generated
   * @ordered
   */
  protected SetType1 set1;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final OpType7 OP_EDEFAULT = OpType7.__;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected OpType7 op = OP_EDEFAULT;

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
  protected BinaryPredTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getBinaryPredType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryPredType getBinaryPred() {
    return binaryPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryPred(BinaryPredType newBinaryPred, NotificationChain msgs) {
    BinaryPredType oldBinaryPred = binaryPred;
    binaryPred = newBinaryPred;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED, oldBinaryPred, newBinaryPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryPred(BinaryPredType newBinaryPred) {
    if (newBinaryPred != binaryPred) {
      NotificationChain msgs = null;
      if (binaryPred != null)
        msgs = ((InternalEObject)binaryPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED, null, msgs);
      if (newBinaryPred != null)
        msgs = ((InternalEObject)newBinaryPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED, null, msgs);
      msgs = basicSetBinaryPred(newBinaryPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED, newBinaryPred, newBinaryPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryPredType getNaryPred() {
    return naryPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNaryPred(NaryPredType newNaryPred, NotificationChain msgs) {
    NaryPredType oldNaryPred = naryPred;
    naryPred = newNaryPred;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__NARY_PRED, oldNaryPred, newNaryPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNaryPred(NaryPredType newNaryPred) {
    if (newNaryPred != naryPred) {
      NotificationChain msgs = null;
      if (naryPred != null)
        msgs = ((InternalEObject)naryPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__NARY_PRED, null, msgs);
      if (newNaryPred != null)
        msgs = ((InternalEObject)newNaryPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__NARY_PRED, null, msgs);
      msgs = basicSetNaryPred(newNaryPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__NARY_PRED, newNaryPred, newNaryPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPredType getUnaryPred() {
    return unaryPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryPred(UnaryPredType newUnaryPred, NotificationChain msgs) {
    UnaryPredType oldUnaryPred = unaryPred;
    unaryPred = newUnaryPred;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED, oldUnaryPred, newUnaryPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryPred(UnaryPredType newUnaryPred) {
    if (newUnaryPred != unaryPred) {
      NotificationChain msgs = null;
      if (unaryPred != null)
        msgs = ((InternalEObject)unaryPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED, null, msgs);
      if (newUnaryPred != null)
        msgs = ((InternalEObject)newUnaryPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED, null, msgs);
      msgs = basicSetUnaryPred(newUnaryPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED, newUnaryPred, newUnaryPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedPredType getQuantifiedPred() {
    return quantifiedPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedPred(QuantifiedPredType newQuantifiedPred, NotificationChain msgs) {
    QuantifiedPredType oldQuantifiedPred = quantifiedPred;
    quantifiedPred = newQuantifiedPred;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED, oldQuantifiedPred, newQuantifiedPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifiedPred(QuantifiedPredType newQuantifiedPred) {
    if (newQuantifiedPred != quantifiedPred) {
      NotificationChain msgs = null;
      if (quantifiedPred != null)
        msgs = ((InternalEObject)quantifiedPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED, null, msgs);
      if (newQuantifiedPred != null)
        msgs = ((InternalEObject)newQuantifiedPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED, null, msgs);
      msgs = basicSetQuantifiedPred(newQuantifiedPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED, newQuantifiedPred, newQuantifiedPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpComparisonType getExpComparison() {
    return expComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpComparison(ExpComparisonType newExpComparison, NotificationChain msgs) {
    ExpComparisonType oldExpComparison = expComparison;
    expComparison = newExpComparison;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON, oldExpComparison, newExpComparison);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpComparison(ExpComparisonType newExpComparison) {
    if (newExpComparison != expComparison) {
      NotificationChain msgs = null;
      if (expComparison != null)
        msgs = ((InternalEObject)expComparison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON, null, msgs);
      if (newExpComparison != null)
        msgs = ((InternalEObject)newExpComparison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON, null, msgs);
      msgs = basicSetExpComparison(newExpComparison, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON, newExpComparison, newExpComparison));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetType1 getSet() {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(SetType1 newSet, NotificationChain msgs) {
    SetType1 oldSet = set;
    set = newSet;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__SET, oldSet, newSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(SetType1 newSet) {
    if (newSet != set) {
      NotificationChain msgs = null;
      if (set != null)
        msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__SET, null, msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__SET, null, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__SET, newSet, newSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryPredType getBinaryPred1() {
    return binaryPred1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryPred1(BinaryPredType newBinaryPred1, NotificationChain msgs) {
    BinaryPredType oldBinaryPred1 = binaryPred1;
    binaryPred1 = newBinaryPred1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED1, oldBinaryPred1, newBinaryPred1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryPred1(BinaryPredType newBinaryPred1) {
    if (newBinaryPred1 != binaryPred1) {
      NotificationChain msgs = null;
      if (binaryPred1 != null)
        msgs = ((InternalEObject)binaryPred1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED1, null, msgs);
      if (newBinaryPred1 != null)
        msgs = ((InternalEObject)newBinaryPred1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED1, null, msgs);
      msgs = basicSetBinaryPred1(newBinaryPred1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED1, newBinaryPred1, newBinaryPred1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryPredType getNaryPred1() {
    return naryPred1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNaryPred1(NaryPredType newNaryPred1, NotificationChain msgs) {
    NaryPredType oldNaryPred1 = naryPred1;
    naryPred1 = newNaryPred1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__NARY_PRED1, oldNaryPred1, newNaryPred1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNaryPred1(NaryPredType newNaryPred1) {
    if (newNaryPred1 != naryPred1) {
      NotificationChain msgs = null;
      if (naryPred1 != null)
        msgs = ((InternalEObject)naryPred1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__NARY_PRED1, null, msgs);
      if (newNaryPred1 != null)
        msgs = ((InternalEObject)newNaryPred1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__NARY_PRED1, null, msgs);
      msgs = basicSetNaryPred1(newNaryPred1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__NARY_PRED1, newNaryPred1, newNaryPred1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPredType getUnaryPred1() {
    return unaryPred1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryPred1(UnaryPredType newUnaryPred1, NotificationChain msgs) {
    UnaryPredType oldUnaryPred1 = unaryPred1;
    unaryPred1 = newUnaryPred1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED1, oldUnaryPred1, newUnaryPred1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryPred1(UnaryPredType newUnaryPred1) {
    if (newUnaryPred1 != unaryPred1) {
      NotificationChain msgs = null;
      if (unaryPred1 != null)
        msgs = ((InternalEObject)unaryPred1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED1, null, msgs);
      if (newUnaryPred1 != null)
        msgs = ((InternalEObject)newUnaryPred1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED1, null, msgs);
      msgs = basicSetUnaryPred1(newUnaryPred1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED1, newUnaryPred1, newUnaryPred1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedPredType getQuantifiedPred1() {
    return quantifiedPred1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedPred1(QuantifiedPredType newQuantifiedPred1, NotificationChain msgs) {
    QuantifiedPredType oldQuantifiedPred1 = quantifiedPred1;
    quantifiedPred1 = newQuantifiedPred1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED1, oldQuantifiedPred1, newQuantifiedPred1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifiedPred1(QuantifiedPredType newQuantifiedPred1) {
    if (newQuantifiedPred1 != quantifiedPred1) {
      NotificationChain msgs = null;
      if (quantifiedPred1 != null)
        msgs = ((InternalEObject)quantifiedPred1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED1, null, msgs);
      if (newQuantifiedPred1 != null)
        msgs = ((InternalEObject)newQuantifiedPred1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED1, null, msgs);
      msgs = basicSetQuantifiedPred1(newQuantifiedPred1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED1, newQuantifiedPred1, newQuantifiedPred1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpComparisonType getExpComparison1() {
    return expComparison1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpComparison1(ExpComparisonType newExpComparison1, NotificationChain msgs) {
    ExpComparisonType oldExpComparison1 = expComparison1;
    expComparison1 = newExpComparison1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON1, oldExpComparison1, newExpComparison1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpComparison1(ExpComparisonType newExpComparison1) {
    if (newExpComparison1 != expComparison1) {
      NotificationChain msgs = null;
      if (expComparison1 != null)
        msgs = ((InternalEObject)expComparison1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON1, null, msgs);
      if (newExpComparison1 != null)
        msgs = ((InternalEObject)newExpComparison1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON1, null, msgs);
      msgs = basicSetExpComparison1(newExpComparison1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON1, newExpComparison1, newExpComparison1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetType1 getSet1() {
    return set1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet1(SetType1 newSet1, NotificationChain msgs) {
    SetType1 oldSet1 = set1;
    set1 = newSet1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__SET1, oldSet1, newSet1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet1(SetType1 newSet1) {
    if (newSet1 != set1) {
      NotificationChain msgs = null;
      if (set1 != null)
        msgs = ((InternalEObject)set1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__SET1, null, msgs);
      if (newSet1 != null)
        msgs = ((InternalEObject)newSet1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_PRED_TYPE__SET1, null, msgs);
      msgs = basicSetSet1(newSet1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__SET1, newSet1, newSet1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType7 getOp() {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(OpType7 newOp) {
    OpType7 oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    boolean oldOpESet = opESet;
    opESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_PRED_TYPE__OP, oldOp, op, !oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetOp() {
    OpType7 oldOp = op;
    boolean oldOpESet = opESet;
    op = OP_EDEFAULT;
    opESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.BINARY_PRED_TYPE__OP, oldOp, OP_EDEFAULT, oldOpESet));
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
      case BxmlPackage.BINARY_PRED_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED:
        return basicSetBinaryPred(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED:
        return basicSetNaryPred(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED:
        return basicSetUnaryPred(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED:
        return basicSetQuantifiedPred(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON:
        return basicSetExpComparison(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__SET:
        return basicSetSet(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED1:
        return basicSetBinaryPred1(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED1:
        return basicSetNaryPred1(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED1:
        return basicSetUnaryPred1(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED1:
        return basicSetQuantifiedPred1(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON1:
        return basicSetExpComparison1(null, msgs);
      case BxmlPackage.BINARY_PRED_TYPE__SET1:
        return basicSetSet1(null, msgs);
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
      case BxmlPackage.BINARY_PRED_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED:
        return getBinaryPred();
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED:
        return getNaryPred();
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED:
        return getUnaryPred();
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED:
        return getQuantifiedPred();
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON:
        return getExpComparison();
      case BxmlPackage.BINARY_PRED_TYPE__SET:
        return getSet();
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED1:
        return getBinaryPred1();
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED1:
        return getNaryPred1();
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED1:
        return getUnaryPred1();
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED1:
        return getQuantifiedPred1();
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON1:
        return getExpComparison1();
      case BxmlPackage.BINARY_PRED_TYPE__SET1:
        return getSet1();
      case BxmlPackage.BINARY_PRED_TYPE__OP:
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
      case BxmlPackage.BINARY_PRED_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED:
        setBinaryPred((BinaryPredType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED:
        setNaryPred((NaryPredType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED:
        setUnaryPred((UnaryPredType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED:
        setQuantifiedPred((QuantifiedPredType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON:
        setExpComparison((ExpComparisonType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__SET:
        setSet((SetType1)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED1:
        setBinaryPred1((BinaryPredType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED1:
        setNaryPred1((NaryPredType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED1:
        setUnaryPred1((UnaryPredType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED1:
        setQuantifiedPred1((QuantifiedPredType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON1:
        setExpComparison1((ExpComparisonType)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__SET1:
        setSet1((SetType1)newValue);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__OP:
        setOp((OpType7)newValue);
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
      case BxmlPackage.BINARY_PRED_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED:
        setBinaryPred((BinaryPredType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED:
        setNaryPred((NaryPredType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED:
        setUnaryPred((UnaryPredType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED:
        setQuantifiedPred((QuantifiedPredType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON:
        setExpComparison((ExpComparisonType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__SET:
        setSet((SetType1)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED1:
        setBinaryPred1((BinaryPredType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED1:
        setNaryPred1((NaryPredType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED1:
        setUnaryPred1((UnaryPredType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED1:
        setQuantifiedPred1((QuantifiedPredType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON1:
        setExpComparison1((ExpComparisonType)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__SET1:
        setSet1((SetType1)null);
        return;
      case BxmlPackage.BINARY_PRED_TYPE__OP:
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
      case BxmlPackage.BINARY_PRED_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED:
        return binaryPred != null;
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED:
        return naryPred != null;
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED:
        return unaryPred != null;
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED:
        return quantifiedPred != null;
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON:
        return expComparison != null;
      case BxmlPackage.BINARY_PRED_TYPE__SET:
        return set != null;
      case BxmlPackage.BINARY_PRED_TYPE__BINARY_PRED1:
        return binaryPred1 != null;
      case BxmlPackage.BINARY_PRED_TYPE__NARY_PRED1:
        return naryPred1 != null;
      case BxmlPackage.BINARY_PRED_TYPE__UNARY_PRED1:
        return unaryPred1 != null;
      case BxmlPackage.BINARY_PRED_TYPE__QUANTIFIED_PRED1:
        return quantifiedPred1 != null;
      case BxmlPackage.BINARY_PRED_TYPE__EXP_COMPARISON1:
        return expComparison1 != null;
      case BxmlPackage.BINARY_PRED_TYPE__SET1:
        return set1 != null;
      case BxmlPackage.BINARY_PRED_TYPE__OP:
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

} //BinaryPredTypeImpl
