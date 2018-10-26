/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BooleanExpType;
import bxml.BooleanLiteralType;
import bxml.BxmlPackage;
import bxml.BynaryExpType;
import bxml.EmptySeqType;
import bxml.EmptySetType;
import bxml.Identifier;
import bxml.IntegerLiteralType;
import bxml.NaryExpType;
import bxml.QuantifiedExpType;
import bxml.QuantifiedSetType;
import bxml.RecordType;
import bxml.STRINGLiteralType;
import bxml.StructType;
import bxml.UnaryExpType;
import bxml.VariantType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.VariantTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.impl.VariantTypeImpl#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantTypeImpl extends MinimalEObjectImpl.Container implements VariantType {
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
   * The cached value of the '{@link #getBinaryExp() <em>Binary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryExp()
   * @generated
   * @ordered
   */
  protected BynaryExpType binaryExp;

  /**
   * The cached value of the '{@link #getNaryExp() <em>Nary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNaryExp()
   * @generated
   * @ordered
   */
  protected NaryExpType naryExp;

  /**
   * The cached value of the '{@link #getBooleanLiteral() <em>Boolean Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanLiteral()
   * @generated
   * @ordered
   */
  protected BooleanLiteralType booleanLiteral;

  /**
   * The cached value of the '{@link #getBooleanExp() <em>Boolean Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanExp()
   * @generated
   * @ordered
   */
  protected BooleanExpType booleanExp;

  /**
   * The cached value of the '{@link #getEmptySet() <em>Empty Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptySet()
   * @generated
   * @ordered
   */
  protected EmptySetType emptySet;

  /**
   * The cached value of the '{@link #getEmptySeq() <em>Empty Seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptySeq()
   * @generated
   * @ordered
   */
  protected EmptySeqType emptySeq;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected Identifier id;

  /**
   * The cached value of the '{@link #getIntegerLiteral() <em>Integer Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerLiteral()
   * @generated
   * @ordered
   */
  protected IntegerLiteralType integerLiteral;

  /**
   * The cached value of the '{@link #getQuantifiedExp() <em>Quantified Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedExp()
   * @generated
   * @ordered
   */
  protected QuantifiedExpType quantifiedExp;

  /**
   * The cached value of the '{@link #getQuantifiedSet() <em>Quantified Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedSet()
   * @generated
   * @ordered
   */
  protected QuantifiedSetType quantifiedSet;

  /**
   * The cached value of the '{@link #getSTRINGLiteral() <em>STRING Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSTRINGLiteral()
   * @generated
   * @ordered
   */
  protected STRINGLiteralType sTRINGLiteral;

  /**
   * The cached value of the '{@link #getUnaryExp() <em>Unary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryExp()
   * @generated
   * @ordered
   */
  protected UnaryExpType unaryExp;

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
   * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecord()
   * @generated
   * @ordered
   */
  protected RecordType record;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariantTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getVariantType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BynaryExpType getBinaryExp() {
    return binaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryExp(BynaryExpType newBinaryExp, NotificationChain msgs) {
    BynaryExpType oldBinaryExp = binaryExp;
    binaryExp = newBinaryExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__BINARY_EXP, oldBinaryExp, newBinaryExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryExp(BynaryExpType newBinaryExp) {
    if (newBinaryExp != binaryExp) {
      NotificationChain msgs = null;
      if (binaryExp != null)
        msgs = ((InternalEObject)binaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__BINARY_EXP, null, msgs);
      if (newBinaryExp != null)
        msgs = ((InternalEObject)newBinaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__BINARY_EXP, null, msgs);
      msgs = basicSetBinaryExp(newBinaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__BINARY_EXP, newBinaryExp, newBinaryExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryExpType getNaryExp() {
    return naryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNaryExp(NaryExpType newNaryExp, NotificationChain msgs) {
    NaryExpType oldNaryExp = naryExp;
    naryExp = newNaryExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__NARY_EXP, oldNaryExp, newNaryExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNaryExp(NaryExpType newNaryExp) {
    if (newNaryExp != naryExp) {
      NotificationChain msgs = null;
      if (naryExp != null)
        msgs = ((InternalEObject)naryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__NARY_EXP, null, msgs);
      if (newNaryExp != null)
        msgs = ((InternalEObject)newNaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__NARY_EXP, null, msgs);
      msgs = basicSetNaryExp(newNaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__NARY_EXP, newNaryExp, newNaryExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteralType getBooleanLiteral() {
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBooleanLiteral(BooleanLiteralType newBooleanLiteral, NotificationChain msgs) {
    BooleanLiteralType oldBooleanLiteral = booleanLiteral;
    booleanLiteral = newBooleanLiteral;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__BOOLEAN_LITERAL, oldBooleanLiteral, newBooleanLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanLiteral(BooleanLiteralType newBooleanLiteral) {
    if (newBooleanLiteral != booleanLiteral) {
      NotificationChain msgs = null;
      if (booleanLiteral != null)
        msgs = ((InternalEObject)booleanLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__BOOLEAN_LITERAL, null, msgs);
      if (newBooleanLiteral != null)
        msgs = ((InternalEObject)newBooleanLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__BOOLEAN_LITERAL, null, msgs);
      msgs = basicSetBooleanLiteral(newBooleanLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__BOOLEAN_LITERAL, newBooleanLiteral, newBooleanLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpType getBooleanExp() {
    return booleanExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBooleanExp(BooleanExpType newBooleanExp, NotificationChain msgs) {
    BooleanExpType oldBooleanExp = booleanExp;
    booleanExp = newBooleanExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__BOOLEAN_EXP, oldBooleanExp, newBooleanExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanExp(BooleanExpType newBooleanExp) {
    if (newBooleanExp != booleanExp) {
      NotificationChain msgs = null;
      if (booleanExp != null)
        msgs = ((InternalEObject)booleanExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__BOOLEAN_EXP, null, msgs);
      if (newBooleanExp != null)
        msgs = ((InternalEObject)newBooleanExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__BOOLEAN_EXP, null, msgs);
      msgs = basicSetBooleanExp(newBooleanExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__BOOLEAN_EXP, newBooleanExp, newBooleanExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptySetType getEmptySet() {
    return emptySet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmptySet(EmptySetType newEmptySet, NotificationChain msgs) {
    EmptySetType oldEmptySet = emptySet;
    emptySet = newEmptySet;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__EMPTY_SET, oldEmptySet, newEmptySet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptySet(EmptySetType newEmptySet) {
    if (newEmptySet != emptySet) {
      NotificationChain msgs = null;
      if (emptySet != null)
        msgs = ((InternalEObject)emptySet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__EMPTY_SET, null, msgs);
      if (newEmptySet != null)
        msgs = ((InternalEObject)newEmptySet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__EMPTY_SET, null, msgs);
      msgs = basicSetEmptySet(newEmptySet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__EMPTY_SET, newEmptySet, newEmptySet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptySeqType getEmptySeq() {
    return emptySeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmptySeq(EmptySeqType newEmptySeq, NotificationChain msgs) {
    EmptySeqType oldEmptySeq = emptySeq;
    emptySeq = newEmptySeq;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__EMPTY_SEQ, oldEmptySeq, newEmptySeq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptySeq(EmptySeqType newEmptySeq) {
    if (newEmptySeq != emptySeq) {
      NotificationChain msgs = null;
      if (emptySeq != null)
        msgs = ((InternalEObject)emptySeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__EMPTY_SEQ, null, msgs);
      if (newEmptySeq != null)
        msgs = ((InternalEObject)newEmptySeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__EMPTY_SEQ, null, msgs);
      msgs = basicSetEmptySeq(newEmptySeq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__EMPTY_SEQ, newEmptySeq, newEmptySeq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(Identifier newId, NotificationChain msgs) {
    Identifier oldId = id;
    id = newId;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(Identifier newId) {
    if (newId != id) {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__ID, newId, newId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteralType getIntegerLiteral() {
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntegerLiteral(IntegerLiteralType newIntegerLiteral, NotificationChain msgs) {
    IntegerLiteralType oldIntegerLiteral = integerLiteral;
    integerLiteral = newIntegerLiteral;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__INTEGER_LITERAL, oldIntegerLiteral, newIntegerLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntegerLiteral(IntegerLiteralType newIntegerLiteral) {
    if (newIntegerLiteral != integerLiteral) {
      NotificationChain msgs = null;
      if (integerLiteral != null)
        msgs = ((InternalEObject)integerLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__INTEGER_LITERAL, null, msgs);
      if (newIntegerLiteral != null)
        msgs = ((InternalEObject)newIntegerLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__INTEGER_LITERAL, null, msgs);
      msgs = basicSetIntegerLiteral(newIntegerLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__INTEGER_LITERAL, newIntegerLiteral, newIntegerLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedExpType getQuantifiedExp() {
    return quantifiedExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedExp(QuantifiedExpType newQuantifiedExp, NotificationChain msgs) {
    QuantifiedExpType oldQuantifiedExp = quantifiedExp;
    quantifiedExp = newQuantifiedExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__QUANTIFIED_EXP, oldQuantifiedExp, newQuantifiedExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifiedExp(QuantifiedExpType newQuantifiedExp) {
    if (newQuantifiedExp != quantifiedExp) {
      NotificationChain msgs = null;
      if (quantifiedExp != null)
        msgs = ((InternalEObject)quantifiedExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__QUANTIFIED_EXP, null, msgs);
      if (newQuantifiedExp != null)
        msgs = ((InternalEObject)newQuantifiedExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__QUANTIFIED_EXP, null, msgs);
      msgs = basicSetQuantifiedExp(newQuantifiedExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__QUANTIFIED_EXP, newQuantifiedExp, newQuantifiedExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedSetType getQuantifiedSet() {
    return quantifiedSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedSet(QuantifiedSetType newQuantifiedSet, NotificationChain msgs) {
    QuantifiedSetType oldQuantifiedSet = quantifiedSet;
    quantifiedSet = newQuantifiedSet;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__QUANTIFIED_SET, oldQuantifiedSet, newQuantifiedSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifiedSet(QuantifiedSetType newQuantifiedSet) {
    if (newQuantifiedSet != quantifiedSet) {
      NotificationChain msgs = null;
      if (quantifiedSet != null)
        msgs = ((InternalEObject)quantifiedSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__QUANTIFIED_SET, null, msgs);
      if (newQuantifiedSet != null)
        msgs = ((InternalEObject)newQuantifiedSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__QUANTIFIED_SET, null, msgs);
      msgs = basicSetQuantifiedSet(newQuantifiedSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__QUANTIFIED_SET, newQuantifiedSet, newQuantifiedSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRINGLiteralType getSTRINGLiteral() {
    return sTRINGLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSTRINGLiteral(STRINGLiteralType newSTRINGLiteral, NotificationChain msgs) {
    STRINGLiteralType oldSTRINGLiteral = sTRINGLiteral;
    sTRINGLiteral = newSTRINGLiteral;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__STRING_LITERAL, oldSTRINGLiteral, newSTRINGLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSTRINGLiteral(STRINGLiteralType newSTRINGLiteral) {
    if (newSTRINGLiteral != sTRINGLiteral) {
      NotificationChain msgs = null;
      if (sTRINGLiteral != null)
        msgs = ((InternalEObject)sTRINGLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__STRING_LITERAL, null, msgs);
      if (newSTRINGLiteral != null)
        msgs = ((InternalEObject)newSTRINGLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__STRING_LITERAL, null, msgs);
      msgs = basicSetSTRINGLiteral(newSTRINGLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__STRING_LITERAL, newSTRINGLiteral, newSTRINGLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpType getUnaryExp() {
    return unaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryExp(UnaryExpType newUnaryExp, NotificationChain msgs) {
    UnaryExpType oldUnaryExp = unaryExp;
    unaryExp = newUnaryExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__UNARY_EXP, oldUnaryExp, newUnaryExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryExp(UnaryExpType newUnaryExp) {
    if (newUnaryExp != unaryExp) {
      NotificationChain msgs = null;
      if (unaryExp != null)
        msgs = ((InternalEObject)unaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__UNARY_EXP, null, msgs);
      if (newUnaryExp != null)
        msgs = ((InternalEObject)newUnaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__UNARY_EXP, null, msgs);
      msgs = basicSetUnaryExp(newUnaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__UNARY_EXP, newUnaryExp, newUnaryExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__STRUCT, oldStruct, newStruct);
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
        msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__STRUCT, null, msgs);
      if (newStruct != null)
        msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__STRUCT, null, msgs);
      msgs = basicSetStruct(newStruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__STRUCT, newStruct, newStruct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType getRecord() {
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecord(RecordType newRecord, NotificationChain msgs) {
    RecordType oldRecord = record;
    record = newRecord;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__RECORD, oldRecord, newRecord);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecord(RecordType newRecord) {
    if (newRecord != record) {
      NotificationChain msgs = null;
      if (record != null)
        msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__RECORD, null, msgs);
      if (newRecord != null)
        msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIANT_TYPE__RECORD, null, msgs);
      msgs = basicSetRecord(newRecord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIANT_TYPE__RECORD, newRecord, newRecord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.VARIANT_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.VARIANT_TYPE__BINARY_EXP:
        return basicSetBinaryExp(null, msgs);
      case BxmlPackage.VARIANT_TYPE__NARY_EXP:
        return basicSetNaryExp(null, msgs);
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_LITERAL:
        return basicSetBooleanLiteral(null, msgs);
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_EXP:
        return basicSetBooleanExp(null, msgs);
      case BxmlPackage.VARIANT_TYPE__EMPTY_SET:
        return basicSetEmptySet(null, msgs);
      case BxmlPackage.VARIANT_TYPE__EMPTY_SEQ:
        return basicSetEmptySeq(null, msgs);
      case BxmlPackage.VARIANT_TYPE__ID:
        return basicSetId(null, msgs);
      case BxmlPackage.VARIANT_TYPE__INTEGER_LITERAL:
        return basicSetIntegerLiteral(null, msgs);
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_EXP:
        return basicSetQuantifiedExp(null, msgs);
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_SET:
        return basicSetQuantifiedSet(null, msgs);
      case BxmlPackage.VARIANT_TYPE__STRING_LITERAL:
        return basicSetSTRINGLiteral(null, msgs);
      case BxmlPackage.VARIANT_TYPE__UNARY_EXP:
        return basicSetUnaryExp(null, msgs);
      case BxmlPackage.VARIANT_TYPE__STRUCT:
        return basicSetStruct(null, msgs);
      case BxmlPackage.VARIANT_TYPE__RECORD:
        return basicSetRecord(null, msgs);
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
      case BxmlPackage.VARIANT_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.VARIANT_TYPE__BINARY_EXP:
        return getBinaryExp();
      case BxmlPackage.VARIANT_TYPE__NARY_EXP:
        return getNaryExp();
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_LITERAL:
        return getBooleanLiteral();
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_EXP:
        return getBooleanExp();
      case BxmlPackage.VARIANT_TYPE__EMPTY_SET:
        return getEmptySet();
      case BxmlPackage.VARIANT_TYPE__EMPTY_SEQ:
        return getEmptySeq();
      case BxmlPackage.VARIANT_TYPE__ID:
        return getId();
      case BxmlPackage.VARIANT_TYPE__INTEGER_LITERAL:
        return getIntegerLiteral();
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_EXP:
        return getQuantifiedExp();
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_SET:
        return getQuantifiedSet();
      case BxmlPackage.VARIANT_TYPE__STRING_LITERAL:
        return getSTRINGLiteral();
      case BxmlPackage.VARIANT_TYPE__UNARY_EXP:
        return getUnaryExp();
      case BxmlPackage.VARIANT_TYPE__STRUCT:
        return getStruct();
      case BxmlPackage.VARIANT_TYPE__RECORD:
        return getRecord();
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
      case BxmlPackage.VARIANT_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__BINARY_EXP:
        setBinaryExp((BynaryExpType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__NARY_EXP:
        setNaryExp((NaryExpType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_LITERAL:
        setBooleanLiteral((BooleanLiteralType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_EXP:
        setBooleanExp((BooleanExpType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__EMPTY_SET:
        setEmptySet((EmptySetType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__EMPTY_SEQ:
        setEmptySeq((EmptySeqType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__ID:
        setId((Identifier)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__INTEGER_LITERAL:
        setIntegerLiteral((IntegerLiteralType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_EXP:
        setQuantifiedExp((QuantifiedExpType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_SET:
        setQuantifiedSet((QuantifiedSetType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__STRING_LITERAL:
        setSTRINGLiteral((STRINGLiteralType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__UNARY_EXP:
        setUnaryExp((UnaryExpType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__STRUCT:
        setStruct((StructType)newValue);
        return;
      case BxmlPackage.VARIANT_TYPE__RECORD:
        setRecord((RecordType)newValue);
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
      case BxmlPackage.VARIANT_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__BINARY_EXP:
        setBinaryExp((BynaryExpType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__NARY_EXP:
        setNaryExp((NaryExpType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_LITERAL:
        setBooleanLiteral((BooleanLiteralType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_EXP:
        setBooleanExp((BooleanExpType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__EMPTY_SET:
        setEmptySet((EmptySetType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__EMPTY_SEQ:
        setEmptySeq((EmptySeqType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__ID:
        setId((Identifier)null);
        return;
      case BxmlPackage.VARIANT_TYPE__INTEGER_LITERAL:
        setIntegerLiteral((IntegerLiteralType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_EXP:
        setQuantifiedExp((QuantifiedExpType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_SET:
        setQuantifiedSet((QuantifiedSetType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__STRING_LITERAL:
        setSTRINGLiteral((STRINGLiteralType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__UNARY_EXP:
        setUnaryExp((UnaryExpType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__STRUCT:
        setStruct((StructType)null);
        return;
      case BxmlPackage.VARIANT_TYPE__RECORD:
        setRecord((RecordType)null);
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
      case BxmlPackage.VARIANT_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.VARIANT_TYPE__BINARY_EXP:
        return binaryExp != null;
      case BxmlPackage.VARIANT_TYPE__NARY_EXP:
        return naryExp != null;
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_LITERAL:
        return booleanLiteral != null;
      case BxmlPackage.VARIANT_TYPE__BOOLEAN_EXP:
        return booleanExp != null;
      case BxmlPackage.VARIANT_TYPE__EMPTY_SET:
        return emptySet != null;
      case BxmlPackage.VARIANT_TYPE__EMPTY_SEQ:
        return emptySeq != null;
      case BxmlPackage.VARIANT_TYPE__ID:
        return id != null;
      case BxmlPackage.VARIANT_TYPE__INTEGER_LITERAL:
        return integerLiteral != null;
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_EXP:
        return quantifiedExp != null;
      case BxmlPackage.VARIANT_TYPE__QUANTIFIED_SET:
        return quantifiedSet != null;
      case BxmlPackage.VARIANT_TYPE__STRING_LITERAL:
        return sTRINGLiteral != null;
      case BxmlPackage.VARIANT_TYPE__UNARY_EXP:
        return unaryExp != null;
      case BxmlPackage.VARIANT_TYPE__STRUCT:
        return struct != null;
      case BxmlPackage.VARIANT_TYPE__RECORD:
        return record != null;
    }
    return super.eIsSet(featureID);
  }

} //VariantTypeImpl
