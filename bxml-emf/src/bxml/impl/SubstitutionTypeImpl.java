/**
 */
package bxml.impl;

import bxml.ANYSubType;
import bxml.AssertSubType;
import bxml.AssignementSubstitutionType;
import bxml.AttributesType;
import bxml.BecomesInType;
import bxml.BecomesSuchThatType;
import bxml.BinarySubType;
import bxml.BxmlPackage;
import bxml.CaseSubType;
import bxml.IfSubType;
import bxml.LETSubType;
import bxml.NarySubstitutionType;
import bxml.OperationCallType;
import bxml.SelectType;
import bxml.SubstitutionType;
import bxml.TerminalType;
import bxml.VARINType;
import bxml.WhileType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getBlocSub <em>Bloc Sub</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getSkip <em>Skip</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getAssertSub <em>Assert Sub</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getIfSub <em>If Sub</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getBecomesSuchThat <em>Becomes Such That</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getAssignementSub <em>Assignement Sub</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getCaseSub <em>Case Sub</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getANYSub <em>ANY Sub</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getLETSub <em>LET Sub</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getBecomesIn <em>Becomes In</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getVARIN <em>VARIN</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getBinarySub <em>Binary Sub</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getNarySub <em>Nary Sub</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link bxml.impl.SubstitutionTypeImpl#getWhile <em>While</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstitutionTypeImpl extends MinimalEObjectImpl.Container implements SubstitutionType {
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
   * The cached value of the '{@link #getBlocSub() <em>Bloc Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocSub()
   * @generated
   * @ordered
   */
  protected SubstitutionType blocSub;

  /**
   * The cached value of the '{@link #getSkip() <em>Skip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkip()
   * @generated
   * @ordered
   */
  protected TerminalType skip;

  /**
   * The cached value of the '{@link #getAssertSub() <em>Assert Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertSub()
   * @generated
   * @ordered
   */
  protected AssertSubType assertSub;

  /**
   * The cached value of the '{@link #getIfSub() <em>If Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfSub()
   * @generated
   * @ordered
   */
  protected IfSubType ifSub;

  /**
   * The cached value of the '{@link #getBecomesSuchThat() <em>Becomes Such That</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecomesSuchThat()
   * @generated
   * @ordered
   */
  protected BecomesSuchThatType becomesSuchThat;

  /**
   * The cached value of the '{@link #getAssignementSub() <em>Assignement Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignementSub()
   * @generated
   * @ordered
   */
  protected AssignementSubstitutionType assignementSub;

  /**
   * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected SelectType select;

  /**
   * The cached value of the '{@link #getCaseSub() <em>Case Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseSub()
   * @generated
   * @ordered
   */
  protected CaseSubType caseSub;

  /**
   * The cached value of the '{@link #getANYSub() <em>ANY Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getANYSub()
   * @generated
   * @ordered
   */
  protected ANYSubType aNYSub;

  /**
   * The cached value of the '{@link #getLETSub() <em>LET Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLETSub()
   * @generated
   * @ordered
   */
  protected LETSubType lETSub;

  /**
   * The cached value of the '{@link #getBecomesIn() <em>Becomes In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBecomesIn()
   * @generated
   * @ordered
   */
  protected BecomesInType becomesIn;

  /**
   * The cached value of the '{@link #getVARIN() <em>VARIN</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVARIN()
   * @generated
   * @ordered
   */
  protected VARINType vARIN;

  /**
   * The cached value of the '{@link #getBinarySub() <em>Binary Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinarySub()
   * @generated
   * @ordered
   */
  protected BinarySubType binarySub;

  /**
   * The cached value of the '{@link #getNarySub() <em>Nary Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNarySub()
   * @generated
   * @ordered
   */
  protected NarySubstitutionType narySub;

  /**
   * The cached value of the '{@link #getOperationCall() <em>Operation Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationCall()
   * @generated
   * @ordered
   */
  protected OperationCallType operationCall;

  /**
   * The cached value of the '{@link #getWhile() <em>While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhile()
   * @generated
   * @ordered
   */
  protected WhileType while_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubstitutionTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getSubstitutionType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstitutionType getBlocSub() {
    return blocSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocSub(SubstitutionType newBlocSub, NotificationChain msgs) {
    SubstitutionType oldBlocSub = blocSub;
    blocSub = newBlocSub;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__BLOC_SUB, oldBlocSub, newBlocSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocSub(SubstitutionType newBlocSub) {
    if (newBlocSub != blocSub) {
      NotificationChain msgs = null;
      if (blocSub != null)
        msgs = ((InternalEObject)blocSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__BLOC_SUB, null, msgs);
      if (newBlocSub != null)
        msgs = ((InternalEObject)newBlocSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__BLOC_SUB, null, msgs);
      msgs = basicSetBlocSub(newBlocSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__BLOC_SUB, newBlocSub, newBlocSub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalType getSkip() {
    return skip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSkip(TerminalType newSkip, NotificationChain msgs) {
    TerminalType oldSkip = skip;
    skip = newSkip;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__SKIP, oldSkip, newSkip);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSkip(TerminalType newSkip) {
    if (newSkip != skip) {
      NotificationChain msgs = null;
      if (skip != null)
        msgs = ((InternalEObject)skip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__SKIP, null, msgs);
      if (newSkip != null)
        msgs = ((InternalEObject)newSkip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__SKIP, null, msgs);
      msgs = basicSetSkip(newSkip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__SKIP, newSkip, newSkip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertSubType getAssertSub() {
    return assertSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertSub(AssertSubType newAssertSub, NotificationChain msgs) {
    AssertSubType oldAssertSub = assertSub;
    assertSub = newAssertSub;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__ASSERT_SUB, oldAssertSub, newAssertSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertSub(AssertSubType newAssertSub) {
    if (newAssertSub != assertSub) {
      NotificationChain msgs = null;
      if (assertSub != null)
        msgs = ((InternalEObject)assertSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__ASSERT_SUB, null, msgs);
      if (newAssertSub != null)
        msgs = ((InternalEObject)newAssertSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__ASSERT_SUB, null, msgs);
      msgs = basicSetAssertSub(newAssertSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__ASSERT_SUB, newAssertSub, newAssertSub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSubType getIfSub() {
    return ifSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfSub(IfSubType newIfSub, NotificationChain msgs) {
    IfSubType oldIfSub = ifSub;
    ifSub = newIfSub;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__IF_SUB, oldIfSub, newIfSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfSub(IfSubType newIfSub) {
    if (newIfSub != ifSub) {
      NotificationChain msgs = null;
      if (ifSub != null)
        msgs = ((InternalEObject)ifSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__IF_SUB, null, msgs);
      if (newIfSub != null)
        msgs = ((InternalEObject)newIfSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__IF_SUB, null, msgs);
      msgs = basicSetIfSub(newIfSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__IF_SUB, newIfSub, newIfSub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecomesSuchThatType getBecomesSuchThat() {
    return becomesSuchThat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecomesSuchThat(BecomesSuchThatType newBecomesSuchThat, NotificationChain msgs) {
    BecomesSuchThatType oldBecomesSuchThat = becomesSuchThat;
    becomesSuchThat = newBecomesSuchThat;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__BECOMES_SUCH_THAT, oldBecomesSuchThat, newBecomesSuchThat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBecomesSuchThat(BecomesSuchThatType newBecomesSuchThat) {
    if (newBecomesSuchThat != becomesSuchThat) {
      NotificationChain msgs = null;
      if (becomesSuchThat != null)
        msgs = ((InternalEObject)becomesSuchThat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__BECOMES_SUCH_THAT, null, msgs);
      if (newBecomesSuchThat != null)
        msgs = ((InternalEObject)newBecomesSuchThat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__BECOMES_SUCH_THAT, null, msgs);
      msgs = basicSetBecomesSuchThat(newBecomesSuchThat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__BECOMES_SUCH_THAT, newBecomesSuchThat, newBecomesSuchThat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignementSubstitutionType getAssignementSub() {
    return assignementSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignementSub(AssignementSubstitutionType newAssignementSub, NotificationChain msgs) {
    AssignementSubstitutionType oldAssignementSub = assignementSub;
    assignementSub = newAssignementSub;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__ASSIGNEMENT_SUB, oldAssignementSub, newAssignementSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignementSub(AssignementSubstitutionType newAssignementSub) {
    if (newAssignementSub != assignementSub) {
      NotificationChain msgs = null;
      if (assignementSub != null)
        msgs = ((InternalEObject)assignementSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__ASSIGNEMENT_SUB, null, msgs);
      if (newAssignementSub != null)
        msgs = ((InternalEObject)newAssignementSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__ASSIGNEMENT_SUB, null, msgs);
      msgs = basicSetAssignementSub(newAssignementSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__ASSIGNEMENT_SUB, newAssignementSub, newAssignementSub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectType getSelect() {
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelect(SelectType newSelect, NotificationChain msgs) {
    SelectType oldSelect = select;
    select = newSelect;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__SELECT, oldSelect, newSelect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelect(SelectType newSelect) {
    if (newSelect != select) {
      NotificationChain msgs = null;
      if (select != null)
        msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__SELECT, null, msgs);
      if (newSelect != null)
        msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__SELECT, null, msgs);
      msgs = basicSetSelect(newSelect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__SELECT, newSelect, newSelect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseSubType getCaseSub() {
    return caseSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseSub(CaseSubType newCaseSub, NotificationChain msgs) {
    CaseSubType oldCaseSub = caseSub;
    caseSub = newCaseSub;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__CASE_SUB, oldCaseSub, newCaseSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseSub(CaseSubType newCaseSub) {
    if (newCaseSub != caseSub) {
      NotificationChain msgs = null;
      if (caseSub != null)
        msgs = ((InternalEObject)caseSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__CASE_SUB, null, msgs);
      if (newCaseSub != null)
        msgs = ((InternalEObject)newCaseSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__CASE_SUB, null, msgs);
      msgs = basicSetCaseSub(newCaseSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__CASE_SUB, newCaseSub, newCaseSub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ANYSubType getANYSub() {
    return aNYSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetANYSub(ANYSubType newANYSub, NotificationChain msgs) {
    ANYSubType oldANYSub = aNYSub;
    aNYSub = newANYSub;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__ANY_SUB, oldANYSub, newANYSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setANYSub(ANYSubType newANYSub) {
    if (newANYSub != aNYSub) {
      NotificationChain msgs = null;
      if (aNYSub != null)
        msgs = ((InternalEObject)aNYSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__ANY_SUB, null, msgs);
      if (newANYSub != null)
        msgs = ((InternalEObject)newANYSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__ANY_SUB, null, msgs);
      msgs = basicSetANYSub(newANYSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__ANY_SUB, newANYSub, newANYSub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LETSubType getLETSub() {
    return lETSub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLETSub(LETSubType newLETSub, NotificationChain msgs) {
    LETSubType oldLETSub = lETSub;
    lETSub = newLETSub;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__LET_SUB, oldLETSub, newLETSub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLETSub(LETSubType newLETSub) {
    if (newLETSub != lETSub) {
      NotificationChain msgs = null;
      if (lETSub != null)
        msgs = ((InternalEObject)lETSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__LET_SUB, null, msgs);
      if (newLETSub != null)
        msgs = ((InternalEObject)newLETSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__LET_SUB, null, msgs);
      msgs = basicSetLETSub(newLETSub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__LET_SUB, newLETSub, newLETSub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecomesInType getBecomesIn() {
    return becomesIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecomesIn(BecomesInType newBecomesIn, NotificationChain msgs) {
    BecomesInType oldBecomesIn = becomesIn;
    becomesIn = newBecomesIn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__BECOMES_IN, oldBecomesIn, newBecomesIn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBecomesIn(BecomesInType newBecomesIn) {
    if (newBecomesIn != becomesIn) {
      NotificationChain msgs = null;
      if (becomesIn != null)
        msgs = ((InternalEObject)becomesIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__BECOMES_IN, null, msgs);
      if (newBecomesIn != null)
        msgs = ((InternalEObject)newBecomesIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__BECOMES_IN, null, msgs);
      msgs = basicSetBecomesIn(newBecomesIn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__BECOMES_IN, newBecomesIn, newBecomesIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARINType getVARIN() {
    return vARIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVARIN(VARINType newVARIN, NotificationChain msgs) {
    VARINType oldVARIN = vARIN;
    vARIN = newVARIN;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__VARIN, oldVARIN, newVARIN);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVARIN(VARINType newVARIN) {
    if (newVARIN != vARIN) {
      NotificationChain msgs = null;
      if (vARIN != null)
        msgs = ((InternalEObject)vARIN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__VARIN, null, msgs);
      if (newVARIN != null)
        msgs = ((InternalEObject)newVARIN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__VARIN, null, msgs);
      msgs = basicSetVARIN(newVARIN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__VARIN, newVARIN, newVARIN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinarySubType getBinarySub() {
    return binarySub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinarySub(BinarySubType newBinarySub, NotificationChain msgs) {
    BinarySubType oldBinarySub = binarySub;
    binarySub = newBinarySub;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__BINARY_SUB, oldBinarySub, newBinarySub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinarySub(BinarySubType newBinarySub) {
    if (newBinarySub != binarySub) {
      NotificationChain msgs = null;
      if (binarySub != null)
        msgs = ((InternalEObject)binarySub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__BINARY_SUB, null, msgs);
      if (newBinarySub != null)
        msgs = ((InternalEObject)newBinarySub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__BINARY_SUB, null, msgs);
      msgs = basicSetBinarySub(newBinarySub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__BINARY_SUB, newBinarySub, newBinarySub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NarySubstitutionType getNarySub() {
    return narySub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNarySub(NarySubstitutionType newNarySub, NotificationChain msgs) {
    NarySubstitutionType oldNarySub = narySub;
    narySub = newNarySub;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__NARY_SUB, oldNarySub, newNarySub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNarySub(NarySubstitutionType newNarySub) {
    if (newNarySub != narySub) {
      NotificationChain msgs = null;
      if (narySub != null)
        msgs = ((InternalEObject)narySub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__NARY_SUB, null, msgs);
      if (newNarySub != null)
        msgs = ((InternalEObject)newNarySub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__NARY_SUB, null, msgs);
      msgs = basicSetNarySub(newNarySub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__NARY_SUB, newNarySub, newNarySub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationCallType getOperationCall() {
    return operationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperationCall(OperationCallType newOperationCall, NotificationChain msgs) {
    OperationCallType oldOperationCall = operationCall;
    operationCall = newOperationCall;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__OPERATION_CALL, oldOperationCall, newOperationCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperationCall(OperationCallType newOperationCall) {
    if (newOperationCall != operationCall) {
      NotificationChain msgs = null;
      if (operationCall != null)
        msgs = ((InternalEObject)operationCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__OPERATION_CALL, null, msgs);
      if (newOperationCall != null)
        msgs = ((InternalEObject)newOperationCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__OPERATION_CALL, null, msgs);
      msgs = basicSetOperationCall(newOperationCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__OPERATION_CALL, newOperationCall, newOperationCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileType getWhile() {
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhile(WhileType newWhile, NotificationChain msgs) {
    WhileType oldWhile = while_;
    while_ = newWhile;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__WHILE, oldWhile, newWhile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhile(WhileType newWhile) {
    if (newWhile != while_) {
      NotificationChain msgs = null;
      if (while_ != null)
        msgs = ((InternalEObject)while_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__WHILE, null, msgs);
      if (newWhile != null)
        msgs = ((InternalEObject)newWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.SUBSTITUTION_TYPE__WHILE, null, msgs);
      msgs = basicSetWhile(newWhile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.SUBSTITUTION_TYPE__WHILE, newWhile, newWhile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.SUBSTITUTION_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__BLOC_SUB:
        return basicSetBlocSub(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__SKIP:
        return basicSetSkip(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__ASSERT_SUB:
        return basicSetAssertSub(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__IF_SUB:
        return basicSetIfSub(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_SUCH_THAT:
        return basicSetBecomesSuchThat(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__ASSIGNEMENT_SUB:
        return basicSetAssignementSub(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__SELECT:
        return basicSetSelect(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__CASE_SUB:
        return basicSetCaseSub(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__ANY_SUB:
        return basicSetANYSub(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__LET_SUB:
        return basicSetLETSub(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_IN:
        return basicSetBecomesIn(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__VARIN:
        return basicSetVARIN(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__BINARY_SUB:
        return basicSetBinarySub(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__NARY_SUB:
        return basicSetNarySub(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__OPERATION_CALL:
        return basicSetOperationCall(null, msgs);
      case BxmlPackage.SUBSTITUTION_TYPE__WHILE:
        return basicSetWhile(null, msgs);
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
      case BxmlPackage.SUBSTITUTION_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.SUBSTITUTION_TYPE__BLOC_SUB:
        return getBlocSub();
      case BxmlPackage.SUBSTITUTION_TYPE__SKIP:
        return getSkip();
      case BxmlPackage.SUBSTITUTION_TYPE__ASSERT_SUB:
        return getAssertSub();
      case BxmlPackage.SUBSTITUTION_TYPE__IF_SUB:
        return getIfSub();
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_SUCH_THAT:
        return getBecomesSuchThat();
      case BxmlPackage.SUBSTITUTION_TYPE__ASSIGNEMENT_SUB:
        return getAssignementSub();
      case BxmlPackage.SUBSTITUTION_TYPE__SELECT:
        return getSelect();
      case BxmlPackage.SUBSTITUTION_TYPE__CASE_SUB:
        return getCaseSub();
      case BxmlPackage.SUBSTITUTION_TYPE__ANY_SUB:
        return getANYSub();
      case BxmlPackage.SUBSTITUTION_TYPE__LET_SUB:
        return getLETSub();
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_IN:
        return getBecomesIn();
      case BxmlPackage.SUBSTITUTION_TYPE__VARIN:
        return getVARIN();
      case BxmlPackage.SUBSTITUTION_TYPE__BINARY_SUB:
        return getBinarySub();
      case BxmlPackage.SUBSTITUTION_TYPE__NARY_SUB:
        return getNarySub();
      case BxmlPackage.SUBSTITUTION_TYPE__OPERATION_CALL:
        return getOperationCall();
      case BxmlPackage.SUBSTITUTION_TYPE__WHILE:
        return getWhile();
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
      case BxmlPackage.SUBSTITUTION_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__BLOC_SUB:
        setBlocSub((SubstitutionType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__SKIP:
        setSkip((TerminalType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__ASSERT_SUB:
        setAssertSub((AssertSubType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__IF_SUB:
        setIfSub((IfSubType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_SUCH_THAT:
        setBecomesSuchThat((BecomesSuchThatType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__ASSIGNEMENT_SUB:
        setAssignementSub((AssignementSubstitutionType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__SELECT:
        setSelect((SelectType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__CASE_SUB:
        setCaseSub((CaseSubType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__ANY_SUB:
        setANYSub((ANYSubType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__LET_SUB:
        setLETSub((LETSubType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_IN:
        setBecomesIn((BecomesInType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__VARIN:
        setVARIN((VARINType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__BINARY_SUB:
        setBinarySub((BinarySubType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__NARY_SUB:
        setNarySub((NarySubstitutionType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__OPERATION_CALL:
        setOperationCall((OperationCallType)newValue);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__WHILE:
        setWhile((WhileType)newValue);
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
      case BxmlPackage.SUBSTITUTION_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__BLOC_SUB:
        setBlocSub((SubstitutionType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__SKIP:
        setSkip((TerminalType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__ASSERT_SUB:
        setAssertSub((AssertSubType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__IF_SUB:
        setIfSub((IfSubType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_SUCH_THAT:
        setBecomesSuchThat((BecomesSuchThatType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__ASSIGNEMENT_SUB:
        setAssignementSub((AssignementSubstitutionType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__SELECT:
        setSelect((SelectType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__CASE_SUB:
        setCaseSub((CaseSubType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__ANY_SUB:
        setANYSub((ANYSubType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__LET_SUB:
        setLETSub((LETSubType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_IN:
        setBecomesIn((BecomesInType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__VARIN:
        setVARIN((VARINType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__BINARY_SUB:
        setBinarySub((BinarySubType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__NARY_SUB:
        setNarySub((NarySubstitutionType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__OPERATION_CALL:
        setOperationCall((OperationCallType)null);
        return;
      case BxmlPackage.SUBSTITUTION_TYPE__WHILE:
        setWhile((WhileType)null);
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
      case BxmlPackage.SUBSTITUTION_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.SUBSTITUTION_TYPE__BLOC_SUB:
        return blocSub != null;
      case BxmlPackage.SUBSTITUTION_TYPE__SKIP:
        return skip != null;
      case BxmlPackage.SUBSTITUTION_TYPE__ASSERT_SUB:
        return assertSub != null;
      case BxmlPackage.SUBSTITUTION_TYPE__IF_SUB:
        return ifSub != null;
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_SUCH_THAT:
        return becomesSuchThat != null;
      case BxmlPackage.SUBSTITUTION_TYPE__ASSIGNEMENT_SUB:
        return assignementSub != null;
      case BxmlPackage.SUBSTITUTION_TYPE__SELECT:
        return select != null;
      case BxmlPackage.SUBSTITUTION_TYPE__CASE_SUB:
        return caseSub != null;
      case BxmlPackage.SUBSTITUTION_TYPE__ANY_SUB:
        return aNYSub != null;
      case BxmlPackage.SUBSTITUTION_TYPE__LET_SUB:
        return lETSub != null;
      case BxmlPackage.SUBSTITUTION_TYPE__BECOMES_IN:
        return becomesIn != null;
      case BxmlPackage.SUBSTITUTION_TYPE__VARIN:
        return vARIN != null;
      case BxmlPackage.SUBSTITUTION_TYPE__BINARY_SUB:
        return binarySub != null;
      case BxmlPackage.SUBSTITUTION_TYPE__NARY_SUB:
        return narySub != null;
      case BxmlPackage.SUBSTITUTION_TYPE__OPERATION_CALL:
        return operationCall != null;
      case BxmlPackage.SUBSTITUTION_TYPE__WHILE:
        return while_ != null;
    }
    return super.eIsSet(featureID);
  }

} //SubstitutionTypeImpl
