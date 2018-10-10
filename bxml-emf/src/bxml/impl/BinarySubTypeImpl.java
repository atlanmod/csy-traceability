/**
 */
package bxml.impl;

import bxml.ANYSubType;
import bxml.AssertSubType;
import bxml.AssignementSubstitutionType;
import bxml.AttributesType;
import bxml.BecomesInType;
import bxml.BecomesSuchThatType;
import bxml.BinarySubOp;
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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Sub Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getBlocSub <em>Bloc Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getSkip <em>Skip</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getAssertSub <em>Assert Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getIfSub <em>If Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getBecomesSuchThat <em>Becomes Such That</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getAssignementSub <em>Assignement Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getCaseSub <em>Case Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getANYSub <em>ANY Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getLETSub <em>LET Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getBecomesIn <em>Becomes In</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getVARIN <em>VARIN</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getBinarySub <em>Binary Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getNarySub <em>Nary Sub</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getWhile <em>While</em>}</li>
 *   <li>{@link bxml.impl.BinarySubTypeImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinarySubTypeImpl extends MinimalEObjectImpl.Container implements BinarySubType {
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
   * The cached value of the '{@link #getSub() <em>Sub</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSub()
   * @generated
   * @ordered
   */
  protected FeatureMap sub;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final BinarySubOp OP_EDEFAULT = BinarySubOp.__;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected BinarySubOp op = OP_EDEFAULT;

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
  protected BinarySubTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getBinarySubType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_SUB_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_SUB_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.BINARY_SUB_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_SUB_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getSub() {
    if (sub == null) {
      sub = new BasicFeatureMap(this, BxmlPackage.BINARY_SUB_TYPE__SUB);
    }
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubstitutionType> getBlocSub() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_BlocSub());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TerminalType> getSkip() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_Skip());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AssertSubType> getAssertSub() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_AssertSub());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IfSubType> getIfSub() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_IfSub());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BecomesSuchThatType> getBecomesSuchThat() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_BecomesSuchThat());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AssignementSubstitutionType> getAssignementSub() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_AssignementSub());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SelectType> getSelect() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_Select());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CaseSubType> getCaseSub() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_CaseSub());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ANYSubType> getANYSub() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_ANYSub());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LETSubType> getLETSub() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_LETSub());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BecomesInType> getBecomesIn() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_BecomesIn());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VARINType> getVARIN() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_VARIN());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BinarySubType> getBinarySub() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_BinarySub());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NarySubstitutionType> getNarySub() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_NarySub());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperationCallType> getOperationCall() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_OperationCall());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WhileType> getWhile() {
    return getSub().list(BxmlPackage.eINSTANCE.getBinarySubType_While());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinarySubOp getOp() {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(BinarySubOp newOp) {
    BinarySubOp oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    boolean oldOpESet = opESet;
    opESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.BINARY_SUB_TYPE__OP, oldOp, op, !oldOpESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetOp() {
    BinarySubOp oldOp = op;
    boolean oldOpESet = opESet;
    op = OP_EDEFAULT;
    opESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.BINARY_SUB_TYPE__OP, oldOp, OP_EDEFAULT, oldOpESet));
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
      case BxmlPackage.BINARY_SUB_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__SUB:
        return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__BLOC_SUB:
        return ((InternalEList<?>)getBlocSub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__SKIP:
        return ((InternalEList<?>)getSkip()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__ASSERT_SUB:
        return ((InternalEList<?>)getAssertSub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__IF_SUB:
        return ((InternalEList<?>)getIfSub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_SUCH_THAT:
        return ((InternalEList<?>)getBecomesSuchThat()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__ASSIGNEMENT_SUB:
        return ((InternalEList<?>)getAssignementSub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__SELECT:
        return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__CASE_SUB:
        return ((InternalEList<?>)getCaseSub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__ANY_SUB:
        return ((InternalEList<?>)getANYSub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__LET_SUB:
        return ((InternalEList<?>)getLETSub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_IN:
        return ((InternalEList<?>)getBecomesIn()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__VARIN:
        return ((InternalEList<?>)getVARIN()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__BINARY_SUB:
        return ((InternalEList<?>)getBinarySub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__NARY_SUB:
        return ((InternalEList<?>)getNarySub()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__OPERATION_CALL:
        return ((InternalEList<?>)getOperationCall()).basicRemove(otherEnd, msgs);
      case BxmlPackage.BINARY_SUB_TYPE__WHILE:
        return ((InternalEList<?>)getWhile()).basicRemove(otherEnd, msgs);
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
      case BxmlPackage.BINARY_SUB_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.BINARY_SUB_TYPE__SUB:
        if (coreType) return getSub();
        return ((FeatureMap.Internal)getSub()).getWrapper();
      case BxmlPackage.BINARY_SUB_TYPE__BLOC_SUB:
        return getBlocSub();
      case BxmlPackage.BINARY_SUB_TYPE__SKIP:
        return getSkip();
      case BxmlPackage.BINARY_SUB_TYPE__ASSERT_SUB:
        return getAssertSub();
      case BxmlPackage.BINARY_SUB_TYPE__IF_SUB:
        return getIfSub();
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_SUCH_THAT:
        return getBecomesSuchThat();
      case BxmlPackage.BINARY_SUB_TYPE__ASSIGNEMENT_SUB:
        return getAssignementSub();
      case BxmlPackage.BINARY_SUB_TYPE__SELECT:
        return getSelect();
      case BxmlPackage.BINARY_SUB_TYPE__CASE_SUB:
        return getCaseSub();
      case BxmlPackage.BINARY_SUB_TYPE__ANY_SUB:
        return getANYSub();
      case BxmlPackage.BINARY_SUB_TYPE__LET_SUB:
        return getLETSub();
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_IN:
        return getBecomesIn();
      case BxmlPackage.BINARY_SUB_TYPE__VARIN:
        return getVARIN();
      case BxmlPackage.BINARY_SUB_TYPE__BINARY_SUB:
        return getBinarySub();
      case BxmlPackage.BINARY_SUB_TYPE__NARY_SUB:
        return getNarySub();
      case BxmlPackage.BINARY_SUB_TYPE__OPERATION_CALL:
        return getOperationCall();
      case BxmlPackage.BINARY_SUB_TYPE__WHILE:
        return getWhile();
      case BxmlPackage.BINARY_SUB_TYPE__OP:
        return getOp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case BxmlPackage.BINARY_SUB_TYPE__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__SUB:
        ((FeatureMap.Internal)getSub()).set(newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__BLOC_SUB:
        getBlocSub().clear();
        getBlocSub().addAll((Collection<? extends SubstitutionType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__SKIP:
        getSkip().clear();
        getSkip().addAll((Collection<? extends TerminalType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__ASSERT_SUB:
        getAssertSub().clear();
        getAssertSub().addAll((Collection<? extends AssertSubType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__IF_SUB:
        getIfSub().clear();
        getIfSub().addAll((Collection<? extends IfSubType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_SUCH_THAT:
        getBecomesSuchThat().clear();
        getBecomesSuchThat().addAll((Collection<? extends BecomesSuchThatType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__ASSIGNEMENT_SUB:
        getAssignementSub().clear();
        getAssignementSub().addAll((Collection<? extends AssignementSubstitutionType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__SELECT:
        getSelect().clear();
        getSelect().addAll((Collection<? extends SelectType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__CASE_SUB:
        getCaseSub().clear();
        getCaseSub().addAll((Collection<? extends CaseSubType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__ANY_SUB:
        getANYSub().clear();
        getANYSub().addAll((Collection<? extends ANYSubType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__LET_SUB:
        getLETSub().clear();
        getLETSub().addAll((Collection<? extends LETSubType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_IN:
        getBecomesIn().clear();
        getBecomesIn().addAll((Collection<? extends BecomesInType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__VARIN:
        getVARIN().clear();
        getVARIN().addAll((Collection<? extends VARINType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__BINARY_SUB:
        getBinarySub().clear();
        getBinarySub().addAll((Collection<? extends BinarySubType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__NARY_SUB:
        getNarySub().clear();
        getNarySub().addAll((Collection<? extends NarySubstitutionType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__OPERATION_CALL:
        getOperationCall().clear();
        getOperationCall().addAll((Collection<? extends OperationCallType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__WHILE:
        getWhile().clear();
        getWhile().addAll((Collection<? extends WhileType>)newValue);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__OP:
        setOp((BinarySubOp)newValue);
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
      case BxmlPackage.BINARY_SUB_TYPE__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.BINARY_SUB_TYPE__SUB:
        getSub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__BLOC_SUB:
        getBlocSub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__SKIP:
        getSkip().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__ASSERT_SUB:
        getAssertSub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__IF_SUB:
        getIfSub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_SUCH_THAT:
        getBecomesSuchThat().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__ASSIGNEMENT_SUB:
        getAssignementSub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__SELECT:
        getSelect().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__CASE_SUB:
        getCaseSub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__ANY_SUB:
        getANYSub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__LET_SUB:
        getLETSub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_IN:
        getBecomesIn().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__VARIN:
        getVARIN().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__BINARY_SUB:
        getBinarySub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__NARY_SUB:
        getNarySub().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__OPERATION_CALL:
        getOperationCall().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__WHILE:
        getWhile().clear();
        return;
      case BxmlPackage.BINARY_SUB_TYPE__OP:
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
      case BxmlPackage.BINARY_SUB_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.BINARY_SUB_TYPE__SUB:
        return sub != null && !sub.isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__BLOC_SUB:
        return !getBlocSub().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__SKIP:
        return !getSkip().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__ASSERT_SUB:
        return !getAssertSub().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__IF_SUB:
        return !getIfSub().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_SUCH_THAT:
        return !getBecomesSuchThat().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__ASSIGNEMENT_SUB:
        return !getAssignementSub().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__SELECT:
        return !getSelect().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__CASE_SUB:
        return !getCaseSub().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__ANY_SUB:
        return !getANYSub().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__LET_SUB:
        return !getLETSub().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__BECOMES_IN:
        return !getBecomesIn().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__VARIN:
        return !getVARIN().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__BINARY_SUB:
        return !getBinarySub().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__NARY_SUB:
        return !getNarySub().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__OPERATION_CALL:
        return !getOperationCall().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__WHILE:
        return !getWhile().isEmpty();
      case BxmlPackage.BINARY_SUB_TYPE__OP:
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
    result.append(" (sub: ");
    result.append(sub);
    result.append(", op: ");
    if (opESet) result.append(op); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //BinarySubTypeImpl
