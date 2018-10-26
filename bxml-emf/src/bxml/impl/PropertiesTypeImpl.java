/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BinaryPredType;
import bxml.BxmlPackage;
import bxml.ExpComparisonType;
import bxml.NaryPredType;
import bxml.PropertiesType;
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
 * An implementation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.PropertiesTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.PropertiesTypeImpl#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.impl.PropertiesTypeImpl#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.impl.PropertiesTypeImpl#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.impl.PropertiesTypeImpl#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.impl.PropertiesTypeImpl#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.impl.PropertiesTypeImpl#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesTypeImpl extends MinimalEObjectImpl.Container implements PropertiesType {
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertiesTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getPropertiesType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__ATTR, newAttr, newAttr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__BINARY_PRED, oldBinaryPred, newBinaryPred);
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
        msgs = ((InternalEObject)binaryPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__BINARY_PRED, null, msgs);
      if (newBinaryPred != null)
        msgs = ((InternalEObject)newBinaryPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__BINARY_PRED, null, msgs);
      msgs = basicSetBinaryPred(newBinaryPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__BINARY_PRED, newBinaryPred, newBinaryPred));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__NARY_PRED, oldNaryPred, newNaryPred);
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
        msgs = ((InternalEObject)naryPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__NARY_PRED, null, msgs);
      if (newNaryPred != null)
        msgs = ((InternalEObject)newNaryPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__NARY_PRED, null, msgs);
      msgs = basicSetNaryPred(newNaryPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__NARY_PRED, newNaryPred, newNaryPred));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__UNARY_PRED, oldUnaryPred, newUnaryPred);
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
        msgs = ((InternalEObject)unaryPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__UNARY_PRED, null, msgs);
      if (newUnaryPred != null)
        msgs = ((InternalEObject)newUnaryPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__UNARY_PRED, null, msgs);
      msgs = basicSetUnaryPred(newUnaryPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__UNARY_PRED, newUnaryPred, newUnaryPred));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__QUANTIFIED_PRED, oldQuantifiedPred, newQuantifiedPred);
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
        msgs = ((InternalEObject)quantifiedPred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__QUANTIFIED_PRED, null, msgs);
      if (newQuantifiedPred != null)
        msgs = ((InternalEObject)newQuantifiedPred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__QUANTIFIED_PRED, null, msgs);
      msgs = basicSetQuantifiedPred(newQuantifiedPred, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__QUANTIFIED_PRED, newQuantifiedPred, newQuantifiedPred));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__EXP_COMPARISON, oldExpComparison, newExpComparison);
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
        msgs = ((InternalEObject)expComparison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__EXP_COMPARISON, null, msgs);
      if (newExpComparison != null)
        msgs = ((InternalEObject)newExpComparison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__EXP_COMPARISON, null, msgs);
      msgs = basicSetExpComparison(newExpComparison, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__EXP_COMPARISON, newExpComparison, newExpComparison));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__SET, oldSet, newSet);
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
        msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__SET, null, msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.PROPERTIES_TYPE__SET, null, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.PROPERTIES_TYPE__SET, newSet, newSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.PROPERTIES_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.PROPERTIES_TYPE__BINARY_PRED:
        return basicSetBinaryPred(null, msgs);
      case BxmlPackage.PROPERTIES_TYPE__NARY_PRED:
        return basicSetNaryPred(null, msgs);
      case BxmlPackage.PROPERTIES_TYPE__UNARY_PRED:
        return basicSetUnaryPred(null, msgs);
      case BxmlPackage.PROPERTIES_TYPE__QUANTIFIED_PRED:
        return basicSetQuantifiedPred(null, msgs);
      case BxmlPackage.PROPERTIES_TYPE__EXP_COMPARISON:
        return basicSetExpComparison(null, msgs);
      case BxmlPackage.PROPERTIES_TYPE__SET:
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
      case BxmlPackage.PROPERTIES_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.PROPERTIES_TYPE__BINARY_PRED:
        return getBinaryPred();
      case BxmlPackage.PROPERTIES_TYPE__NARY_PRED:
        return getNaryPred();
      case BxmlPackage.PROPERTIES_TYPE__UNARY_PRED:
        return getUnaryPred();
      case BxmlPackage.PROPERTIES_TYPE__QUANTIFIED_PRED:
        return getQuantifiedPred();
      case BxmlPackage.PROPERTIES_TYPE__EXP_COMPARISON:
        return getExpComparison();
      case BxmlPackage.PROPERTIES_TYPE__SET:
        return getSet();
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
      case BxmlPackage.PROPERTIES_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.PROPERTIES_TYPE__BINARY_PRED:
        setBinaryPred((BinaryPredType)newValue);
        return;
      case BxmlPackage.PROPERTIES_TYPE__NARY_PRED:
        setNaryPred((NaryPredType)newValue);
        return;
      case BxmlPackage.PROPERTIES_TYPE__UNARY_PRED:
        setUnaryPred((UnaryPredType)newValue);
        return;
      case BxmlPackage.PROPERTIES_TYPE__QUANTIFIED_PRED:
        setQuantifiedPred((QuantifiedPredType)newValue);
        return;
      case BxmlPackage.PROPERTIES_TYPE__EXP_COMPARISON:
        setExpComparison((ExpComparisonType)newValue);
        return;
      case BxmlPackage.PROPERTIES_TYPE__SET:
        setSet((SetType1)newValue);
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
      case BxmlPackage.PROPERTIES_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.PROPERTIES_TYPE__BINARY_PRED:
        setBinaryPred((BinaryPredType)null);
        return;
      case BxmlPackage.PROPERTIES_TYPE__NARY_PRED:
        setNaryPred((NaryPredType)null);
        return;
      case BxmlPackage.PROPERTIES_TYPE__UNARY_PRED:
        setUnaryPred((UnaryPredType)null);
        return;
      case BxmlPackage.PROPERTIES_TYPE__QUANTIFIED_PRED:
        setQuantifiedPred((QuantifiedPredType)null);
        return;
      case BxmlPackage.PROPERTIES_TYPE__EXP_COMPARISON:
        setExpComparison((ExpComparisonType)null);
        return;
      case BxmlPackage.PROPERTIES_TYPE__SET:
        setSet((SetType1)null);
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
      case BxmlPackage.PROPERTIES_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.PROPERTIES_TYPE__BINARY_PRED:
        return binaryPred != null;
      case BxmlPackage.PROPERTIES_TYPE__NARY_PRED:
        return naryPred != null;
      case BxmlPackage.PROPERTIES_TYPE__UNARY_PRED:
        return unaryPred != null;
      case BxmlPackage.PROPERTIES_TYPE__QUANTIFIED_PRED:
        return quantifiedPred != null;
      case BxmlPackage.PROPERTIES_TYPE__EXP_COMPARISON:
        return expComparison != null;
      case BxmlPackage.PROPERTIES_TYPE__SET:
        return set != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertiesTypeImpl
