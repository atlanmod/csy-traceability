/**
 */
package bxml.impl;

import bxml.BinaryPredicateType;
import bxml.BxmlPackage;
import bxml.ExpComparisonType;
import bxml.NaryPredicateType;
import bxml.QuantifiedPredType;
import bxml.SetType;
import bxml.UnaryPredOp;
import bxml.UnaryPredicateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Predicate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.UnaryPredicateTypeImpl#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.impl.UnaryPredicateTypeImpl#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.impl.UnaryPredicateTypeImpl#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.impl.UnaryPredicateTypeImpl#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.impl.UnaryPredicateTypeImpl#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.impl.UnaryPredicateTypeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.impl.UnaryPredicateTypeImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryPredicateTypeImpl extends MinimalEObjectImpl.Container implements UnaryPredicateType {
  /**
   * The cached value of the '{@link #getBinaryPred() <em>Binary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryPred()
   * @generated
   * @ordered
   */
  protected BinaryPredicateType binaryPred;

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
   * The cached value of the '{@link #getQuantifiedPred() <em>Quantified Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedPred()
   * @generated
   * @ordered
   */
  protected QuantifiedPredType quantifiedPred;

  /**
   * The cached value of the '{@link #getUnaryPred() <em>Unary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryPred()
   * @generated
   * @ordered
   */
  protected UnaryPredicateType unaryPred;

  /**
   * The cached value of the '{@link #getNaryPred() <em>Nary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNaryPred()
   * @generated
   * @ordered
   */
  protected NaryPredicateType naryPred;

  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected SetType set;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final UnaryPredOp OP_EDEFAULT = UnaryPredOp.NOT;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected UnaryPredOp op = OP_EDEFAULT;

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
  protected UnaryPredicateTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getUnaryPredicateType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryPredicateType getBinaryPred() {
    return binaryPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryPred(BinaryPredicateType newBinaryPred, NotificationChain msgs) {
    BinaryPredicateType oldBinaryPred = binaryPred;
    binaryPred = newBinaryPred;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__BINARY_PRED, oldBinaryPred, newBinaryPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryPred(BinaryPredicateType newBinaryPred) {
    if (newBinaryPred != binaryPred) {
      NotificationChain msgs = null;
      if (binaryPred != null)
        msgs = ((InternalEObject)binaryPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__BINARY_PRED, null, msgs);
      if (newBinaryPred != null)
        msgs = ((InternalEObject)newBinaryPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__BINARY_PRED, null, msgs);
      msgs = basicSetBinaryPred(newBinaryPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__BINARY_PRED, newBinaryPred, newBinaryPred));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__EXP_COMPARISON, oldExpComparison, newExpComparison);
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
        msgs = ((InternalEObject)expComparison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__EXP_COMPARISON, null, msgs);
      if (newExpComparison != null)
        msgs = ((InternalEObject)newExpComparison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__EXP_COMPARISON, null, msgs);
      msgs = basicSetExpComparison(newExpComparison, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__EXP_COMPARISON, newExpComparison, newExpComparison));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__QUANTIFIED_PRED, oldQuantifiedPred, newQuantifiedPred);
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
        msgs = ((InternalEObject)quantifiedPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__QUANTIFIED_PRED, null, msgs);
      if (newQuantifiedPred != null)
        msgs = ((InternalEObject)newQuantifiedPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__QUANTIFIED_PRED, null, msgs);
      msgs = basicSetQuantifiedPred(newQuantifiedPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__QUANTIFIED_PRED, newQuantifiedPred, newQuantifiedPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPredicateType getUnaryPred() {
    return unaryPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryPred(UnaryPredicateType newUnaryPred, NotificationChain msgs) {
    UnaryPredicateType oldUnaryPred = unaryPred;
    unaryPred = newUnaryPred;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__UNARY_PRED, oldUnaryPred, newUnaryPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryPred(UnaryPredicateType newUnaryPred) {
    if (newUnaryPred != unaryPred) {
      NotificationChain msgs = null;
      if (unaryPred != null)
        msgs = ((InternalEObject)unaryPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__UNARY_PRED, null, msgs);
      if (newUnaryPred != null)
        msgs = ((InternalEObject)newUnaryPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__UNARY_PRED, null, msgs);
      msgs = basicSetUnaryPred(newUnaryPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__UNARY_PRED, newUnaryPred, newUnaryPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryPredicateType getNaryPred() {
    return naryPred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNaryPred(NaryPredicateType newNaryPred, NotificationChain msgs) {
    NaryPredicateType oldNaryPred = naryPred;
    naryPred = newNaryPred;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__NARY_PRED, oldNaryPred, newNaryPred);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNaryPred(NaryPredicateType newNaryPred) {
    if (newNaryPred != naryPred) {
      NotificationChain msgs = null;
      if (naryPred != null)
        msgs = ((InternalEObject)naryPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__NARY_PRED, null, msgs);
      if (newNaryPred != null)
        msgs = ((InternalEObject)newNaryPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__NARY_PRED, null, msgs);
      msgs = basicSetNaryPred(newNaryPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__NARY_PRED, newNaryPred, newNaryPred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetType getSet() {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(SetType newSet, NotificationChain msgs) {
    SetType oldSet = set;
    set = newSet;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__SET, oldSet, newSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(SetType newSet) {
    if (newSet != set) {
      NotificationChain msgs = null;
      if (set != null)
        msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__SET, null, msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.UNARY_PREDICATE_TYPE__SET, null, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__SET, newSet, newSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPredOp getOp() {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(UnaryPredOp newOp) {
    UnaryPredOp oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    boolean oldOpESet = opESet;
    opESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.UNARY_PREDICATE_TYPE__OP, oldOp, op, !oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetOp() {
    UnaryPredOp oldOp = op;
    boolean oldOpESet = opESet;
    op = OP_EDEFAULT;
    opESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.UNARY_PREDICATE_TYPE__OP, oldOp, OP_EDEFAULT, oldOpESet));
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
      case BxmlPackage.UNARY_PREDICATE_TYPE__BINARY_PRED:
        return basicSetBinaryPred(null, msgs);
      case BxmlPackage.UNARY_PREDICATE_TYPE__EXP_COMPARISON:
        return basicSetExpComparison(null, msgs);
      case BxmlPackage.UNARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        return basicSetQuantifiedPred(null, msgs);
      case BxmlPackage.UNARY_PREDICATE_TYPE__UNARY_PRED:
        return basicSetUnaryPred(null, msgs);
      case BxmlPackage.UNARY_PREDICATE_TYPE__NARY_PRED:
        return basicSetNaryPred(null, msgs);
      case BxmlPackage.UNARY_PREDICATE_TYPE__SET:
        return basicSetSet(null, msgs);
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
      case BxmlPackage.UNARY_PREDICATE_TYPE__BINARY_PRED:
        return getBinaryPred();
      case BxmlPackage.UNARY_PREDICATE_TYPE__EXP_COMPARISON:
        return getExpComparison();
      case BxmlPackage.UNARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        return getQuantifiedPred();
      case BxmlPackage.UNARY_PREDICATE_TYPE__UNARY_PRED:
        return getUnaryPred();
      case BxmlPackage.UNARY_PREDICATE_TYPE__NARY_PRED:
        return getNaryPred();
      case BxmlPackage.UNARY_PREDICATE_TYPE__SET:
        return getSet();
      case BxmlPackage.UNARY_PREDICATE_TYPE__OP:
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
      case BxmlPackage.UNARY_PREDICATE_TYPE__BINARY_PRED:
        setBinaryPred((BinaryPredicateType)newValue);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__EXP_COMPARISON:
        setExpComparison((ExpComparisonType)newValue);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        setQuantifiedPred((QuantifiedPredType)newValue);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__UNARY_PRED:
        setUnaryPred((UnaryPredicateType)newValue);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__NARY_PRED:
        setNaryPred((NaryPredicateType)newValue);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__SET:
        setSet((SetType)newValue);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__OP:
        setOp((UnaryPredOp)newValue);
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
      case BxmlPackage.UNARY_PREDICATE_TYPE__BINARY_PRED:
        setBinaryPred((BinaryPredicateType)null);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__EXP_COMPARISON:
        setExpComparison((ExpComparisonType)null);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        setQuantifiedPred((QuantifiedPredType)null);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__UNARY_PRED:
        setUnaryPred((UnaryPredicateType)null);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__NARY_PRED:
        setNaryPred((NaryPredicateType)null);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__SET:
        setSet((SetType)null);
        return;
      case BxmlPackage.UNARY_PREDICATE_TYPE__OP:
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
      case BxmlPackage.UNARY_PREDICATE_TYPE__BINARY_PRED:
        return binaryPred != null;
      case BxmlPackage.UNARY_PREDICATE_TYPE__EXP_COMPARISON:
        return expComparison != null;
      case BxmlPackage.UNARY_PREDICATE_TYPE__QUANTIFIED_PRED:
        return quantifiedPred != null;
      case BxmlPackage.UNARY_PREDICATE_TYPE__UNARY_PRED:
        return unaryPred != null;
      case BxmlPackage.UNARY_PREDICATE_TYPE__NARY_PRED:
        return naryPred != null;
      case BxmlPackage.UNARY_PREDICATE_TYPE__SET:
        return set != null;
      case BxmlPackage.UNARY_PREDICATE_TYPE__OP:
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

} //UnaryPredicateTypeImpl
