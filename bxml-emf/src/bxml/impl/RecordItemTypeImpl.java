/**
 */
package bxml.impl;

import bxml.BinaryExpressionType;
import bxml.BxmlPackage;
import bxml.IdentifierType;
import bxml.LiteralType;
import bxml.NaryExpType;
import bxml.PredicateType;
import bxml.QuantifiedExpType;
import bxml.QuantifiedSetType;
import bxml.RecordItemType;
import bxml.RecordType;
import bxml.StringLiteralType;
import bxml.StructType;
import bxml.TerminalType;
import bxml.UnaryExpressionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.impl.RecordItemTypeImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordItemTypeImpl extends MinimalEObjectImpl.Container implements RecordItemType {
  /**
   * The cached value of the '{@link #getBinaryExp() <em>Binary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryExp()
   * @generated
   * @ordered
   */
  protected BinaryExpressionType binaryExp;

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
  protected IdentifierType booleanLiteral;

  /**
   * The cached value of the '{@link #getBooleanExp() <em>Boolean Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanExp()
   * @generated
   * @ordered
   */
  protected PredicateType booleanExp;

  /**
   * The cached value of the '{@link #getEmptySet() <em>Empty Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptySet()
   * @generated
   * @ordered
   */
  protected TerminalType emptySet;

  /**
   * The cached value of the '{@link #getEmptySeq() <em>Empty Seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptySeq()
   * @generated
   * @ordered
   */
  protected TerminalType emptySeq;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected IdentifierType id;

  /**
   * The cached value of the '{@link #getIntegerLiteral() <em>Integer Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerLiteral()
   * @generated
   * @ordered
   */
  protected LiteralType integerLiteral;

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
  protected StringLiteralType sTRINGLiteral;

  /**
   * The cached value of the '{@link #getUnaryExp() <em>Unary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryExp()
   * @generated
   * @ordered
   */
  protected UnaryExpressionType unaryExp;

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
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordItemTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getRecordItemType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpressionType getBinaryExp() {
    return binaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryExp(BinaryExpressionType newBinaryExp, NotificationChain msgs) {
    BinaryExpressionType oldBinaryExp = binaryExp;
    binaryExp = newBinaryExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__BINARY_EXP, oldBinaryExp, newBinaryExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryExp(BinaryExpressionType newBinaryExp) {
    if (newBinaryExp != binaryExp) {
      NotificationChain msgs = null;
      if (binaryExp != null)
        msgs = ((InternalEObject)binaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__BINARY_EXP, null, msgs);
      if (newBinaryExp != null)
        msgs = ((InternalEObject)newBinaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__BINARY_EXP, null, msgs);
      msgs = basicSetBinaryExp(newBinaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__BINARY_EXP, newBinaryExp, newBinaryExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__NARY_EXP, oldNaryExp, newNaryExp);
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
        msgs = ((InternalEObject)naryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__NARY_EXP, null, msgs);
      if (newNaryExp != null)
        msgs = ((InternalEObject)newNaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__NARY_EXP, null, msgs);
      msgs = basicSetNaryExp(newNaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__NARY_EXP, newNaryExp, newNaryExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierType getBooleanLiteral() {
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBooleanLiteral(IdentifierType newBooleanLiteral, NotificationChain msgs) {
    IdentifierType oldBooleanLiteral = booleanLiteral;
    booleanLiteral = newBooleanLiteral;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_LITERAL, oldBooleanLiteral, newBooleanLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanLiteral(IdentifierType newBooleanLiteral) {
    if (newBooleanLiteral != booleanLiteral) {
      NotificationChain msgs = null;
      if (booleanLiteral != null)
        msgs = ((InternalEObject)booleanLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_LITERAL, null, msgs);
      if (newBooleanLiteral != null)
        msgs = ((InternalEObject)newBooleanLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_LITERAL, null, msgs);
      msgs = basicSetBooleanLiteral(newBooleanLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_LITERAL, newBooleanLiteral, newBooleanLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateType getBooleanExp() {
    return booleanExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBooleanExp(PredicateType newBooleanExp, NotificationChain msgs) {
    PredicateType oldBooleanExp = booleanExp;
    booleanExp = newBooleanExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_EXP, oldBooleanExp, newBooleanExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanExp(PredicateType newBooleanExp) {
    if (newBooleanExp != booleanExp) {
      NotificationChain msgs = null;
      if (booleanExp != null)
        msgs = ((InternalEObject)booleanExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_EXP, null, msgs);
      if (newBooleanExp != null)
        msgs = ((InternalEObject)newBooleanExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_EXP, null, msgs);
      msgs = basicSetBooleanExp(newBooleanExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_EXP, newBooleanExp, newBooleanExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalType getEmptySet() {
    return emptySet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmptySet(TerminalType newEmptySet, NotificationChain msgs) {
    TerminalType oldEmptySet = emptySet;
    emptySet = newEmptySet;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SET, oldEmptySet, newEmptySet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptySet(TerminalType newEmptySet) {
    if (newEmptySet != emptySet) {
      NotificationChain msgs = null;
      if (emptySet != null)
        msgs = ((InternalEObject)emptySet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SET, null, msgs);
      if (newEmptySet != null)
        msgs = ((InternalEObject)newEmptySet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SET, null, msgs);
      msgs = basicSetEmptySet(newEmptySet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SET, newEmptySet, newEmptySet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalType getEmptySeq() {
    return emptySeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmptySeq(TerminalType newEmptySeq, NotificationChain msgs) {
    TerminalType oldEmptySeq = emptySeq;
    emptySeq = newEmptySeq;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SEQ, oldEmptySeq, newEmptySeq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptySeq(TerminalType newEmptySeq) {
    if (newEmptySeq != emptySeq) {
      NotificationChain msgs = null;
      if (emptySeq != null)
        msgs = ((InternalEObject)emptySeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SEQ, null, msgs);
      if (newEmptySeq != null)
        msgs = ((InternalEObject)newEmptySeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SEQ, null, msgs);
      msgs = basicSetEmptySeq(newEmptySeq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SEQ, newEmptySeq, newEmptySeq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierType getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(IdentifierType newId, NotificationChain msgs) {
    IdentifierType oldId = id;
    id = newId;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(IdentifierType newId) {
    if (newId != id) {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__ID, newId, newId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralType getIntegerLiteral() {
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntegerLiteral(LiteralType newIntegerLiteral, NotificationChain msgs) {
    LiteralType oldIntegerLiteral = integerLiteral;
    integerLiteral = newIntegerLiteral;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__INTEGER_LITERAL, oldIntegerLiteral, newIntegerLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntegerLiteral(LiteralType newIntegerLiteral) {
    if (newIntegerLiteral != integerLiteral) {
      NotificationChain msgs = null;
      if (integerLiteral != null)
        msgs = ((InternalEObject)integerLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__INTEGER_LITERAL, null, msgs);
      if (newIntegerLiteral != null)
        msgs = ((InternalEObject)newIntegerLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__INTEGER_LITERAL, null, msgs);
      msgs = basicSetIntegerLiteral(newIntegerLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__INTEGER_LITERAL, newIntegerLiteral, newIntegerLiteral));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_EXP, oldQuantifiedExp, newQuantifiedExp);
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
        msgs = ((InternalEObject)quantifiedExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_EXP, null, msgs);
      if (newQuantifiedExp != null)
        msgs = ((InternalEObject)newQuantifiedExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_EXP, null, msgs);
      msgs = basicSetQuantifiedExp(newQuantifiedExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_EXP, newQuantifiedExp, newQuantifiedExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_SET, oldQuantifiedSet, newQuantifiedSet);
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
        msgs = ((InternalEObject)quantifiedSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_SET, null, msgs);
      if (newQuantifiedSet != null)
        msgs = ((InternalEObject)newQuantifiedSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_SET, null, msgs);
      msgs = basicSetQuantifiedSet(newQuantifiedSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_SET, newQuantifiedSet, newQuantifiedSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteralType getSTRINGLiteral() {
    return sTRINGLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSTRINGLiteral(StringLiteralType newSTRINGLiteral, NotificationChain msgs) {
    StringLiteralType oldSTRINGLiteral = sTRINGLiteral;
    sTRINGLiteral = newSTRINGLiteral;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__STRING_LITERAL, oldSTRINGLiteral, newSTRINGLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSTRINGLiteral(StringLiteralType newSTRINGLiteral) {
    if (newSTRINGLiteral != sTRINGLiteral) {
      NotificationChain msgs = null;
      if (sTRINGLiteral != null)
        msgs = ((InternalEObject)sTRINGLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__STRING_LITERAL, null, msgs);
      if (newSTRINGLiteral != null)
        msgs = ((InternalEObject)newSTRINGLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__STRING_LITERAL, null, msgs);
      msgs = basicSetSTRINGLiteral(newSTRINGLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__STRING_LITERAL, newSTRINGLiteral, newSTRINGLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpressionType getUnaryExp() {
    return unaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryExp(UnaryExpressionType newUnaryExp, NotificationChain msgs) {
    UnaryExpressionType oldUnaryExp = unaryExp;
    unaryExp = newUnaryExp;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__UNARY_EXP, oldUnaryExp, newUnaryExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryExp(UnaryExpressionType newUnaryExp) {
    if (newUnaryExp != unaryExp) {
      NotificationChain msgs = null;
      if (unaryExp != null)
        msgs = ((InternalEObject)unaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__UNARY_EXP, null, msgs);
      if (newUnaryExp != null)
        msgs = ((InternalEObject)newUnaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__UNARY_EXP, null, msgs);
      msgs = basicSetUnaryExp(newUnaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__UNARY_EXP, newUnaryExp, newUnaryExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__STRUCT, oldStruct, newStruct);
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
        msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__STRUCT, null, msgs);
      if (newStruct != null)
        msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__STRUCT, null, msgs);
      msgs = basicSetStruct(newStruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__STRUCT, newStruct, newStruct));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__RECORD, oldRecord, newRecord);
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
        msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__RECORD, null, msgs);
      if (newRecord != null)
        msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.RECORD_ITEM_TYPE__RECORD, null, msgs);
      msgs = basicSetRecord(newRecord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__RECORD, newRecord, newRecord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel() {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel) {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.RECORD_ITEM_TYPE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.RECORD_ITEM_TYPE__BINARY_EXP:
        return basicSetBinaryExp(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__NARY_EXP:
        return basicSetNaryExp(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_LITERAL:
        return basicSetBooleanLiteral(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_EXP:
        return basicSetBooleanExp(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SET:
        return basicSetEmptySet(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SEQ:
        return basicSetEmptySeq(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__ID:
        return basicSetId(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__INTEGER_LITERAL:
        return basicSetIntegerLiteral(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_EXP:
        return basicSetQuantifiedExp(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_SET:
        return basicSetQuantifiedSet(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__STRING_LITERAL:
        return basicSetSTRINGLiteral(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__UNARY_EXP:
        return basicSetUnaryExp(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__STRUCT:
        return basicSetStruct(null, msgs);
      case BxmlPackage.RECORD_ITEM_TYPE__RECORD:
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
      case BxmlPackage.RECORD_ITEM_TYPE__BINARY_EXP:
        return getBinaryExp();
      case BxmlPackage.RECORD_ITEM_TYPE__NARY_EXP:
        return getNaryExp();
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_LITERAL:
        return getBooleanLiteral();
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_EXP:
        return getBooleanExp();
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SET:
        return getEmptySet();
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SEQ:
        return getEmptySeq();
      case BxmlPackage.RECORD_ITEM_TYPE__ID:
        return getId();
      case BxmlPackage.RECORD_ITEM_TYPE__INTEGER_LITERAL:
        return getIntegerLiteral();
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_EXP:
        return getQuantifiedExp();
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_SET:
        return getQuantifiedSet();
      case BxmlPackage.RECORD_ITEM_TYPE__STRING_LITERAL:
        return getSTRINGLiteral();
      case BxmlPackage.RECORD_ITEM_TYPE__UNARY_EXP:
        return getUnaryExp();
      case BxmlPackage.RECORD_ITEM_TYPE__STRUCT:
        return getStruct();
      case BxmlPackage.RECORD_ITEM_TYPE__RECORD:
        return getRecord();
      case BxmlPackage.RECORD_ITEM_TYPE__LABEL:
        return getLabel();
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
      case BxmlPackage.RECORD_ITEM_TYPE__BINARY_EXP:
        setBinaryExp((BinaryExpressionType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__NARY_EXP:
        setNaryExp((NaryExpType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_LITERAL:
        setBooleanLiteral((IdentifierType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_EXP:
        setBooleanExp((PredicateType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SET:
        setEmptySet((TerminalType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SEQ:
        setEmptySeq((TerminalType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__ID:
        setId((IdentifierType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__INTEGER_LITERAL:
        setIntegerLiteral((LiteralType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_EXP:
        setQuantifiedExp((QuantifiedExpType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_SET:
        setQuantifiedSet((QuantifiedSetType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__STRING_LITERAL:
        setSTRINGLiteral((StringLiteralType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__UNARY_EXP:
        setUnaryExp((UnaryExpressionType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__STRUCT:
        setStruct((StructType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__RECORD:
        setRecord((RecordType)newValue);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__LABEL:
        setLabel((String)newValue);
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
      case BxmlPackage.RECORD_ITEM_TYPE__BINARY_EXP:
        setBinaryExp((BinaryExpressionType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__NARY_EXP:
        setNaryExp((NaryExpType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_LITERAL:
        setBooleanLiteral((IdentifierType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_EXP:
        setBooleanExp((PredicateType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SET:
        setEmptySet((TerminalType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SEQ:
        setEmptySeq((TerminalType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__ID:
        setId((IdentifierType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__INTEGER_LITERAL:
        setIntegerLiteral((LiteralType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_EXP:
        setQuantifiedExp((QuantifiedExpType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_SET:
        setQuantifiedSet((QuantifiedSetType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__STRING_LITERAL:
        setSTRINGLiteral((StringLiteralType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__UNARY_EXP:
        setUnaryExp((UnaryExpressionType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__STRUCT:
        setStruct((StructType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__RECORD:
        setRecord((RecordType)null);
        return;
      case BxmlPackage.RECORD_ITEM_TYPE__LABEL:
        setLabel(LABEL_EDEFAULT);
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
      case BxmlPackage.RECORD_ITEM_TYPE__BINARY_EXP:
        return binaryExp != null;
      case BxmlPackage.RECORD_ITEM_TYPE__NARY_EXP:
        return naryExp != null;
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_LITERAL:
        return booleanLiteral != null;
      case BxmlPackage.RECORD_ITEM_TYPE__BOOLEAN_EXP:
        return booleanExp != null;
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SET:
        return emptySet != null;
      case BxmlPackage.RECORD_ITEM_TYPE__EMPTY_SEQ:
        return emptySeq != null;
      case BxmlPackage.RECORD_ITEM_TYPE__ID:
        return id != null;
      case BxmlPackage.RECORD_ITEM_TYPE__INTEGER_LITERAL:
        return integerLiteral != null;
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_EXP:
        return quantifiedExp != null;
      case BxmlPackage.RECORD_ITEM_TYPE__QUANTIFIED_SET:
        return quantifiedSet != null;
      case BxmlPackage.RECORD_ITEM_TYPE__STRING_LITERAL:
        return sTRINGLiteral != null;
      case BxmlPackage.RECORD_ITEM_TYPE__UNARY_EXP:
        return unaryExp != null;
      case BxmlPackage.RECORD_ITEM_TYPE__STRUCT:
        return struct != null;
      case BxmlPackage.RECORD_ITEM_TYPE__RECORD:
        return record != null;
      case BxmlPackage.RECORD_ITEM_TYPE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
    result.append(" (label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //RecordItemTypeImpl
