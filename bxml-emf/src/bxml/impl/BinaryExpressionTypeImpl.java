/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BinaryExpOp;
import bxml.BinaryExpressionType;
import bxml.BxmlPackage;
import bxml.IdentifierType;
import bxml.LiteralType;
import bxml.NaryExpType;
import bxml.PredicateType;
import bxml.QuantifiedExpType;
import bxml.QuantifiedSetType;
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
 * An implementation of the model object '<em><b>Binary Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getBinaryExp1 <em>Binary Exp1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getNaryExp1 <em>Nary Exp1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getBooleanLiteral1 <em>Boolean Literal1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getBooleanExp1 <em>Boolean Exp1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getEmptySet1 <em>Empty Set1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getEmptySeq1 <em>Empty Seq1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getId1 <em>Id1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getIntegerLiteral1 <em>Integer Literal1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getQuantifiedExp1 <em>Quantified Exp1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getQuantifiedSet1 <em>Quantified Set1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getSTRINGLiteral1 <em>STRING Literal1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getUnaryExp1 <em>Unary Exp1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getStruct1 <em>Struct1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getRecord1 <em>Record1</em>}</li>
 *   <li>{@link bxml.impl.BinaryExpressionTypeImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpressionTypeImpl extends MinimalEObjectImpl.Container implements BinaryExpressionType {
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
   * The cached value of the '{@link #getBinaryExp1() <em>Binary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinaryExp1()
   * @generated
   * @ordered
   */
  protected BinaryExpressionType binaryExp1;

  /**
   * The cached value of the '{@link #getNaryExp1() <em>Nary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNaryExp1()
   * @generated
   * @ordered
   */
  protected NaryExpType naryExp1;

  /**
   * The cached value of the '{@link #getBooleanLiteral1() <em>Boolean Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanLiteral1()
   * @generated
   * @ordered
   */
  protected IdentifierType booleanLiteral1;

  /**
   * The cached value of the '{@link #getBooleanExp1() <em>Boolean Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanExp1()
   * @generated
   * @ordered
   */
  protected PredicateType booleanExp1;

  /**
   * The cached value of the '{@link #getEmptySet1() <em>Empty Set1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptySet1()
   * @generated
   * @ordered
   */
  protected TerminalType emptySet1;

  /**
   * The cached value of the '{@link #getEmptySeq1() <em>Empty Seq1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmptySeq1()
   * @generated
   * @ordered
   */
  protected TerminalType emptySeq1;

  /**
   * The cached value of the '{@link #getId1() <em>Id1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId1()
   * @generated
   * @ordered
   */
  protected IdentifierType id1;

  /**
   * The cached value of the '{@link #getIntegerLiteral1() <em>Integer Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerLiteral1()
   * @generated
   * @ordered
   */
  protected LiteralType integerLiteral1;

  /**
   * The cached value of the '{@link #getQuantifiedExp1() <em>Quantified Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedExp1()
   * @generated
   * @ordered
   */
  protected QuantifiedExpType quantifiedExp1;

  /**
   * The cached value of the '{@link #getQuantifiedSet1() <em>Quantified Set1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifiedSet1()
   * @generated
   * @ordered
   */
  protected QuantifiedSetType quantifiedSet1;

  /**
   * The cached value of the '{@link #getSTRINGLiteral1() <em>STRING Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSTRINGLiteral1()
   * @generated
   * @ordered
   */
  protected StringLiteralType sTRINGLiteral1;

  /**
   * The cached value of the '{@link #getUnaryExp1() <em>Unary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryExp1()
   * @generated
   * @ordered
   */
  protected UnaryExpressionType unaryExp1;

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
   * The cached value of the '{@link #getRecord1() <em>Record1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecord1()
   * @generated
   * @ordered
   */
  protected RecordType record1;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final BinaryExpOp OP_EDEFAULT = BinaryExpOp.__;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected BinaryExpOp op = OP_EDEFAULT;

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
  protected BinaryExpressionTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getBinaryExpressionType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__ATTR, newAttr, newAttr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP, oldBinaryExp, newBinaryExp);
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
        msgs = ((InternalEObject)binaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP, null, msgs);
      if (newBinaryExp != null)
        msgs = ((InternalEObject)newBinaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP, null, msgs);
      msgs = basicSetBinaryExp(newBinaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP, newBinaryExp, newBinaryExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP, oldNaryExp, newNaryExp);
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
        msgs = ((InternalEObject)naryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP, null, msgs);
      if (newNaryExp != null)
        msgs = ((InternalEObject)newNaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP, null, msgs);
      msgs = basicSetNaryExp(newNaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP, newNaryExp, newNaryExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL, oldBooleanLiteral, newBooleanLiteral);
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
        msgs = ((InternalEObject)booleanLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL, null, msgs);
      if (newBooleanLiteral != null)
        msgs = ((InternalEObject)newBooleanLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL, null, msgs);
      msgs = basicSetBooleanLiteral(newBooleanLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL, newBooleanLiteral, newBooleanLiteral));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP, oldBooleanExp, newBooleanExp);
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
        msgs = ((InternalEObject)booleanExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP, null, msgs);
      if (newBooleanExp != null)
        msgs = ((InternalEObject)newBooleanExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP, null, msgs);
      msgs = basicSetBooleanExp(newBooleanExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP, newBooleanExp, newBooleanExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET, oldEmptySet, newEmptySet);
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
        msgs = ((InternalEObject)emptySet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET, null, msgs);
      if (newEmptySet != null)
        msgs = ((InternalEObject)newEmptySet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET, null, msgs);
      msgs = basicSetEmptySet(newEmptySet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET, newEmptySet, newEmptySet));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ, oldEmptySeq, newEmptySeq);
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
        msgs = ((InternalEObject)emptySeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ, null, msgs);
      if (newEmptySeq != null)
        msgs = ((InternalEObject)newEmptySeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ, null, msgs);
      msgs = basicSetEmptySeq(newEmptySeq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ, newEmptySeq, newEmptySeq));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__ID, oldId, newId);
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
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__ID, newId, newId));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL, oldIntegerLiteral, newIntegerLiteral);
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
        msgs = ((InternalEObject)integerLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL, null, msgs);
      if (newIntegerLiteral != null)
        msgs = ((InternalEObject)newIntegerLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL, null, msgs);
      msgs = basicSetIntegerLiteral(newIntegerLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL, newIntegerLiteral, newIntegerLiteral));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP, oldQuantifiedExp, newQuantifiedExp);
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
        msgs = ((InternalEObject)quantifiedExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP, null, msgs);
      if (newQuantifiedExp != null)
        msgs = ((InternalEObject)newQuantifiedExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP, null, msgs);
      msgs = basicSetQuantifiedExp(newQuantifiedExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP, newQuantifiedExp, newQuantifiedExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET, oldQuantifiedSet, newQuantifiedSet);
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
        msgs = ((InternalEObject)quantifiedSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET, null, msgs);
      if (newQuantifiedSet != null)
        msgs = ((InternalEObject)newQuantifiedSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET, null, msgs);
      msgs = basicSetQuantifiedSet(newQuantifiedSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET, newQuantifiedSet, newQuantifiedSet));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL, oldSTRINGLiteral, newSTRINGLiteral);
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
        msgs = ((InternalEObject)sTRINGLiteral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL, null, msgs);
      if (newSTRINGLiteral != null)
        msgs = ((InternalEObject)newSTRINGLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL, null, msgs);
      msgs = basicSetSTRINGLiteral(newSTRINGLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL, newSTRINGLiteral, newSTRINGLiteral));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP, oldUnaryExp, newUnaryExp);
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
        msgs = ((InternalEObject)unaryExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP, null, msgs);
      if (newUnaryExp != null)
        msgs = ((InternalEObject)newUnaryExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP, null, msgs);
      msgs = basicSetUnaryExp(newUnaryExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP, newUnaryExp, newUnaryExp));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT, oldStruct, newStruct);
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
        msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT, null, msgs);
      if (newStruct != null)
        msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT, null, msgs);
      msgs = basicSetStruct(newStruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT, newStruct, newStruct));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD, oldRecord, newRecord);
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
        msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD, null, msgs);
      if (newRecord != null)
        msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD, null, msgs);
      msgs = basicSetRecord(newRecord, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD, newRecord, newRecord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpressionType getBinaryExp1() {
    return binaryExp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryExp1(BinaryExpressionType newBinaryExp1, NotificationChain msgs) {
    BinaryExpressionType oldBinaryExp1 = binaryExp1;
    binaryExp1 = newBinaryExp1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP1, oldBinaryExp1, newBinaryExp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryExp1(BinaryExpressionType newBinaryExp1) {
    if (newBinaryExp1 != binaryExp1) {
      NotificationChain msgs = null;
      if (binaryExp1 != null)
        msgs = ((InternalEObject)binaryExp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP1, null, msgs);
      if (newBinaryExp1 != null)
        msgs = ((InternalEObject)newBinaryExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP1, null, msgs);
      msgs = basicSetBinaryExp1(newBinaryExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP1, newBinaryExp1, newBinaryExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryExpType getNaryExp1() {
    return naryExp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNaryExp1(NaryExpType newNaryExp1, NotificationChain msgs) {
    NaryExpType oldNaryExp1 = naryExp1;
    naryExp1 = newNaryExp1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP1, oldNaryExp1, newNaryExp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNaryExp1(NaryExpType newNaryExp1) {
    if (newNaryExp1 != naryExp1) {
      NotificationChain msgs = null;
      if (naryExp1 != null)
        msgs = ((InternalEObject)naryExp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP1, null, msgs);
      if (newNaryExp1 != null)
        msgs = ((InternalEObject)newNaryExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP1, null, msgs);
      msgs = basicSetNaryExp1(newNaryExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP1, newNaryExp1, newNaryExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierType getBooleanLiteral1() {
    return booleanLiteral1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBooleanLiteral1(IdentifierType newBooleanLiteral1, NotificationChain msgs) {
    IdentifierType oldBooleanLiteral1 = booleanLiteral1;
    booleanLiteral1 = newBooleanLiteral1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1, oldBooleanLiteral1, newBooleanLiteral1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanLiteral1(IdentifierType newBooleanLiteral1) {
    if (newBooleanLiteral1 != booleanLiteral1) {
      NotificationChain msgs = null;
      if (booleanLiteral1 != null)
        msgs = ((InternalEObject)booleanLiteral1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1, null, msgs);
      if (newBooleanLiteral1 != null)
        msgs = ((InternalEObject)newBooleanLiteral1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1, null, msgs);
      msgs = basicSetBooleanLiteral1(newBooleanLiteral1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1, newBooleanLiteral1, newBooleanLiteral1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateType getBooleanExp1() {
    return booleanExp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBooleanExp1(PredicateType newBooleanExp1, NotificationChain msgs) {
    PredicateType oldBooleanExp1 = booleanExp1;
    booleanExp1 = newBooleanExp1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1, oldBooleanExp1, newBooleanExp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanExp1(PredicateType newBooleanExp1) {
    if (newBooleanExp1 != booleanExp1) {
      NotificationChain msgs = null;
      if (booleanExp1 != null)
        msgs = ((InternalEObject)booleanExp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1, null, msgs);
      if (newBooleanExp1 != null)
        msgs = ((InternalEObject)newBooleanExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1, null, msgs);
      msgs = basicSetBooleanExp1(newBooleanExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1, newBooleanExp1, newBooleanExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalType getEmptySet1() {
    return emptySet1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmptySet1(TerminalType newEmptySet1, NotificationChain msgs) {
    TerminalType oldEmptySet1 = emptySet1;
    emptySet1 = newEmptySet1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET1, oldEmptySet1, newEmptySet1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptySet1(TerminalType newEmptySet1) {
    if (newEmptySet1 != emptySet1) {
      NotificationChain msgs = null;
      if (emptySet1 != null)
        msgs = ((InternalEObject)emptySet1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET1, null, msgs);
      if (newEmptySet1 != null)
        msgs = ((InternalEObject)newEmptySet1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET1, null, msgs);
      msgs = basicSetEmptySet1(newEmptySet1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET1, newEmptySet1, newEmptySet1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalType getEmptySeq1() {
    return emptySeq1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmptySeq1(TerminalType newEmptySeq1, NotificationChain msgs) {
    TerminalType oldEmptySeq1 = emptySeq1;
    emptySeq1 = newEmptySeq1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ1, oldEmptySeq1, newEmptySeq1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptySeq1(TerminalType newEmptySeq1) {
    if (newEmptySeq1 != emptySeq1) {
      NotificationChain msgs = null;
      if (emptySeq1 != null)
        msgs = ((InternalEObject)emptySeq1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ1, null, msgs);
      if (newEmptySeq1 != null)
        msgs = ((InternalEObject)newEmptySeq1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ1, null, msgs);
      msgs = basicSetEmptySeq1(newEmptySeq1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ1, newEmptySeq1, newEmptySeq1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierType getId1() {
    return id1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId1(IdentifierType newId1, NotificationChain msgs) {
    IdentifierType oldId1 = id1;
    id1 = newId1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__ID1, oldId1, newId1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId1(IdentifierType newId1) {
    if (newId1 != id1) {
      NotificationChain msgs = null;
      if (id1 != null)
        msgs = ((InternalEObject)id1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__ID1, null, msgs);
      if (newId1 != null)
        msgs = ((InternalEObject)newId1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__ID1, null, msgs);
      msgs = basicSetId1(newId1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__ID1, newId1, newId1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralType getIntegerLiteral1() {
    return integerLiteral1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntegerLiteral1(LiteralType newIntegerLiteral1, NotificationChain msgs) {
    LiteralType oldIntegerLiteral1 = integerLiteral1;
    integerLiteral1 = newIntegerLiteral1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1, oldIntegerLiteral1, newIntegerLiteral1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntegerLiteral1(LiteralType newIntegerLiteral1) {
    if (newIntegerLiteral1 != integerLiteral1) {
      NotificationChain msgs = null;
      if (integerLiteral1 != null)
        msgs = ((InternalEObject)integerLiteral1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1, null, msgs);
      if (newIntegerLiteral1 != null)
        msgs = ((InternalEObject)newIntegerLiteral1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1, null, msgs);
      msgs = basicSetIntegerLiteral1(newIntegerLiteral1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1, newIntegerLiteral1, newIntegerLiteral1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedExpType getQuantifiedExp1() {
    return quantifiedExp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedExp1(QuantifiedExpType newQuantifiedExp1, NotificationChain msgs) {
    QuantifiedExpType oldQuantifiedExp1 = quantifiedExp1;
    quantifiedExp1 = newQuantifiedExp1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1, oldQuantifiedExp1, newQuantifiedExp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifiedExp1(QuantifiedExpType newQuantifiedExp1) {
    if (newQuantifiedExp1 != quantifiedExp1) {
      NotificationChain msgs = null;
      if (quantifiedExp1 != null)
        msgs = ((InternalEObject)quantifiedExp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1, null, msgs);
      if (newQuantifiedExp1 != null)
        msgs = ((InternalEObject)newQuantifiedExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1, null, msgs);
      msgs = basicSetQuantifiedExp1(newQuantifiedExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1, newQuantifiedExp1, newQuantifiedExp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedSetType getQuantifiedSet1() {
    return quantifiedSet1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedSet1(QuantifiedSetType newQuantifiedSet1, NotificationChain msgs) {
    QuantifiedSetType oldQuantifiedSet1 = quantifiedSet1;
    quantifiedSet1 = newQuantifiedSet1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1, oldQuantifiedSet1, newQuantifiedSet1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifiedSet1(QuantifiedSetType newQuantifiedSet1) {
    if (newQuantifiedSet1 != quantifiedSet1) {
      NotificationChain msgs = null;
      if (quantifiedSet1 != null)
        msgs = ((InternalEObject)quantifiedSet1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1, null, msgs);
      if (newQuantifiedSet1 != null)
        msgs = ((InternalEObject)newQuantifiedSet1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1, null, msgs);
      msgs = basicSetQuantifiedSet1(newQuantifiedSet1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1, newQuantifiedSet1, newQuantifiedSet1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteralType getSTRINGLiteral1() {
    return sTRINGLiteral1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSTRINGLiteral1(StringLiteralType newSTRINGLiteral1, NotificationChain msgs) {
    StringLiteralType oldSTRINGLiteral1 = sTRINGLiteral1;
    sTRINGLiteral1 = newSTRINGLiteral1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL1, oldSTRINGLiteral1, newSTRINGLiteral1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSTRINGLiteral1(StringLiteralType newSTRINGLiteral1) {
    if (newSTRINGLiteral1 != sTRINGLiteral1) {
      NotificationChain msgs = null;
      if (sTRINGLiteral1 != null)
        msgs = ((InternalEObject)sTRINGLiteral1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL1, null, msgs);
      if (newSTRINGLiteral1 != null)
        msgs = ((InternalEObject)newSTRINGLiteral1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL1, null, msgs);
      msgs = basicSetSTRINGLiteral1(newSTRINGLiteral1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL1, newSTRINGLiteral1, newSTRINGLiteral1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpressionType getUnaryExp1() {
    return unaryExp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryExp1(UnaryExpressionType newUnaryExp1, NotificationChain msgs) {
    UnaryExpressionType oldUnaryExp1 = unaryExp1;
    unaryExp1 = newUnaryExp1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP1, oldUnaryExp1, newUnaryExp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryExp1(UnaryExpressionType newUnaryExp1) {
    if (newUnaryExp1 != unaryExp1) {
      NotificationChain msgs = null;
      if (unaryExp1 != null)
        msgs = ((InternalEObject)unaryExp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP1, null, msgs);
      if (newUnaryExp1 != null)
        msgs = ((InternalEObject)newUnaryExp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP1, null, msgs);
      msgs = basicSetUnaryExp1(newUnaryExp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP1, newUnaryExp1, newUnaryExp1));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT1, oldStruct1, newStruct1);
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
        msgs = ((InternalEObject)struct1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT1, null, msgs);
      if (newStruct1 != null)
        msgs = ((InternalEObject)newStruct1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT1, null, msgs);
      msgs = basicSetStruct1(newStruct1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT1, newStruct1, newStruct1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType getRecord1() {
    return record1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecord1(RecordType newRecord1, NotificationChain msgs) {
    RecordType oldRecord1 = record1;
    record1 = newRecord1;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD1, oldRecord1, newRecord1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecord1(RecordType newRecord1) {
    if (newRecord1 != record1) {
      NotificationChain msgs = null;
      if (record1 != null)
        msgs = ((InternalEObject)record1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD1, null, msgs);
      if (newRecord1 != null)
        msgs = ((InternalEObject)newRecord1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD1, null, msgs);
      msgs = basicSetRecord1(newRecord1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD1, newRecord1, newRecord1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpOp getOp() {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(BinaryExpOp newOp) {
    BinaryExpOp oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    boolean oldOpESet = opESet;
    opESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_EXPRESSION_TYPE__OP, oldOp, op, !oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetOp() {
    BinaryExpOp oldOp = op;
    boolean oldOpESet = opESet;
    op = OP_EDEFAULT;
    opESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.BINARY_EXPRESSION_TYPE__OP, oldOp, OP_EDEFAULT, oldOpESet));
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
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP:
        return basicSetBinaryExp(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP:
        return basicSetNaryExp(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL:
        return basicSetBooleanLiteral(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP:
        return basicSetBooleanExp(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET:
        return basicSetEmptySet(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ:
        return basicSetEmptySeq(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID:
        return basicSetId(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL:
        return basicSetIntegerLiteral(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP:
        return basicSetQuantifiedExp(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET:
        return basicSetQuantifiedSet(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL:
        return basicSetSTRINGLiteral(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP:
        return basicSetUnaryExp(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT:
        return basicSetStruct(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD:
        return basicSetRecord(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP1:
        return basicSetBinaryExp1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP1:
        return basicSetNaryExp1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1:
        return basicSetBooleanLiteral1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1:
        return basicSetBooleanExp1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET1:
        return basicSetEmptySet1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ1:
        return basicSetEmptySeq1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID1:
        return basicSetId1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1:
        return basicSetIntegerLiteral1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1:
        return basicSetQuantifiedExp1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1:
        return basicSetQuantifiedSet1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL1:
        return basicSetSTRINGLiteral1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP1:
        return basicSetUnaryExp1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT1:
        return basicSetStruct1(null, msgs);
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD1:
        return basicSetRecord1(null, msgs);
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
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP:
        return getBinaryExp();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP:
        return getNaryExp();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL:
        return getBooleanLiteral();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP:
        return getBooleanExp();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET:
        return getEmptySet();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ:
        return getEmptySeq();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID:
        return getId();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL:
        return getIntegerLiteral();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP:
        return getQuantifiedExp();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET:
        return getQuantifiedSet();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL:
        return getSTRINGLiteral();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP:
        return getUnaryExp();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT:
        return getStruct();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD:
        return getRecord();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP1:
        return getBinaryExp1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP1:
        return getNaryExp1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1:
        return getBooleanLiteral1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1:
        return getBooleanExp1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET1:
        return getEmptySet1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ1:
        return getEmptySeq1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID1:
        return getId1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1:
        return getIntegerLiteral1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1:
        return getQuantifiedExp1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1:
        return getQuantifiedSet1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL1:
        return getSTRINGLiteral1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP1:
        return getUnaryExp1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT1:
        return getStruct1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD1:
        return getRecord1();
      case BxmlPackage.BINARY_EXPRESSION_TYPE__OP:
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
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP:
        setBinaryExp((BinaryExpressionType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP:
        setNaryExp((NaryExpType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL:
        setBooleanLiteral((IdentifierType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP:
        setBooleanExp((PredicateType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET:
        setEmptySet((TerminalType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ:
        setEmptySeq((TerminalType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID:
        setId((IdentifierType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL:
        setIntegerLiteral((LiteralType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP:
        setQuantifiedExp((QuantifiedExpType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET:
        setQuantifiedSet((QuantifiedSetType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL:
        setSTRINGLiteral((StringLiteralType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP:
        setUnaryExp((UnaryExpressionType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT:
        setStruct((StructType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD:
        setRecord((RecordType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP1:
        setBinaryExp1((BinaryExpressionType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP1:
        setNaryExp1((NaryExpType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1:
        setBooleanLiteral1((IdentifierType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1:
        setBooleanExp1((PredicateType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET1:
        setEmptySet1((TerminalType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ1:
        setEmptySeq1((TerminalType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID1:
        setId1((IdentifierType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1:
        setIntegerLiteral1((LiteralType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1:
        setQuantifiedExp1((QuantifiedExpType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1:
        setQuantifiedSet1((QuantifiedSetType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL1:
        setSTRINGLiteral1((StringLiteralType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP1:
        setUnaryExp1((UnaryExpressionType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT1:
        setStruct1((StructType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD1:
        setRecord1((RecordType)newValue);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__OP:
        setOp((BinaryExpOp)newValue);
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
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP:
        setBinaryExp((BinaryExpressionType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP:
        setNaryExp((NaryExpType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL:
        setBooleanLiteral((IdentifierType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP:
        setBooleanExp((PredicateType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET:
        setEmptySet((TerminalType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ:
        setEmptySeq((TerminalType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID:
        setId((IdentifierType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL:
        setIntegerLiteral((LiteralType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP:
        setQuantifiedExp((QuantifiedExpType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET:
        setQuantifiedSet((QuantifiedSetType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL:
        setSTRINGLiteral((StringLiteralType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP:
        setUnaryExp((UnaryExpressionType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT:
        setStruct((StructType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD:
        setRecord((RecordType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP1:
        setBinaryExp1((BinaryExpressionType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP1:
        setNaryExp1((NaryExpType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1:
        setBooleanLiteral1((IdentifierType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1:
        setBooleanExp1((PredicateType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET1:
        setEmptySet1((TerminalType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ1:
        setEmptySeq1((TerminalType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID1:
        setId1((IdentifierType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1:
        setIntegerLiteral1((LiteralType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1:
        setQuantifiedExp1((QuantifiedExpType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1:
        setQuantifiedSet1((QuantifiedSetType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL1:
        setSTRINGLiteral1((StringLiteralType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP1:
        setUnaryExp1((UnaryExpressionType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT1:
        setStruct1((StructType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD1:
        setRecord1((RecordType)null);
        return;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__OP:
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
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP:
        return binaryExp != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP:
        return naryExp != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL:
        return booleanLiteral != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP:
        return booleanExp != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET:
        return emptySet != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ:
        return emptySeq != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID:
        return id != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL:
        return integerLiteral != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP:
        return quantifiedExp != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET:
        return quantifiedSet != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL:
        return sTRINGLiteral != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP:
        return unaryExp != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT:
        return struct != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD:
        return record != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BINARY_EXP1:
        return binaryExp1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__NARY_EXP1:
        return naryExp1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1:
        return booleanLiteral1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1:
        return booleanExp1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SET1:
        return emptySet1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__EMPTY_SEQ1:
        return emptySeq1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__ID1:
        return id1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1:
        return integerLiteral1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1:
        return quantifiedExp1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1:
        return quantifiedSet1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRING_LITERAL1:
        return sTRINGLiteral1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__UNARY_EXP1:
        return unaryExp1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__STRUCT1:
        return struct1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__RECORD1:
        return record1 != null;
      case BxmlPackage.BINARY_EXPRESSION_TYPE__OP:
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

} //BinaryExpressionTypeImpl
