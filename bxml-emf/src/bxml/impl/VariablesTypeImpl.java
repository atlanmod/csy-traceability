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
import bxml.VariablesType;

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
 * An implementation of the model object '<em><b>Variables Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.impl.VariablesTypeImpl#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariablesTypeImpl extends MinimalEObjectImpl.Container implements VariablesType {
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
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected FeatureMap expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariablesTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getVariablesType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIABLES_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIABLES_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.VARIABLES_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.VARIABLES_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getExpression() {
    if (expression == null) {
      expression = new BasicFeatureMap(this, BxmlPackage.VARIABLES_TYPE__EXPRESSION);
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BynaryExpType> getBinaryExp() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_BinaryExp());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NaryExpType> getNaryExp() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_NaryExp());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BooleanLiteralType> getBooleanLiteral() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_BooleanLiteral());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BooleanExpType> getBooleanExp() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_BooleanExp());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EmptySetType> getEmptySet() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_EmptySet());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EmptySeqType> getEmptySeq() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_EmptySeq());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Identifier> getId() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_Id());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerLiteralType> getIntegerLiteral() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_IntegerLiteral());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QuantifiedExpType> getQuantifiedExp() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_QuantifiedExp());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QuantifiedSetType> getQuantifiedSet() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_QuantifiedSet());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<STRINGLiteralType> getSTRINGLiteral() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_STRINGLiteral());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnaryExpType> getUnaryExp() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_UnaryExp());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StructType> getStruct() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_Struct());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RecordType> getRecord() {
    return getExpression().list(BxmlPackage.eINSTANCE.getVariablesType_Record());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.VARIABLES_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.VARIABLES_TYPE__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__BINARY_EXP:
        return ((InternalEList<?>)getBinaryExp()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__NARY_EXP:
        return ((InternalEList<?>)getNaryExp()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_LITERAL:
        return ((InternalEList<?>)getBooleanLiteral()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_EXP:
        return ((InternalEList<?>)getBooleanExp()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SET:
        return ((InternalEList<?>)getEmptySet()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SEQ:
        return ((InternalEList<?>)getEmptySeq()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__ID:
        return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__INTEGER_LITERAL:
        return ((InternalEList<?>)getIntegerLiteral()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_EXP:
        return ((InternalEList<?>)getQuantifiedExp()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_SET:
        return ((InternalEList<?>)getQuantifiedSet()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__STRING_LITERAL:
        return ((InternalEList<?>)getSTRINGLiteral()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__UNARY_EXP:
        return ((InternalEList<?>)getUnaryExp()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__STRUCT:
        return ((InternalEList<?>)getStruct()).basicRemove(otherEnd, msgs);
      case BxmlPackage.VARIABLES_TYPE__RECORD:
        return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
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
      case BxmlPackage.VARIABLES_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.VARIABLES_TYPE__EXPRESSION:
        if (coreType) return getExpression();
        return ((FeatureMap.Internal)getExpression()).getWrapper();
      case BxmlPackage.VARIABLES_TYPE__BINARY_EXP:
        return getBinaryExp();
      case BxmlPackage.VARIABLES_TYPE__NARY_EXP:
        return getNaryExp();
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_LITERAL:
        return getBooleanLiteral();
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_EXP:
        return getBooleanExp();
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SET:
        return getEmptySet();
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SEQ:
        return getEmptySeq();
      case BxmlPackage.VARIABLES_TYPE__ID:
        return getId();
      case BxmlPackage.VARIABLES_TYPE__INTEGER_LITERAL:
        return getIntegerLiteral();
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_EXP:
        return getQuantifiedExp();
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_SET:
        return getQuantifiedSet();
      case BxmlPackage.VARIABLES_TYPE__STRING_LITERAL:
        return getSTRINGLiteral();
      case BxmlPackage.VARIABLES_TYPE__UNARY_EXP:
        return getUnaryExp();
      case BxmlPackage.VARIABLES_TYPE__STRUCT:
        return getStruct();
      case BxmlPackage.VARIABLES_TYPE__RECORD:
        return getRecord();
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
      case BxmlPackage.VARIABLES_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__EXPRESSION:
        ((FeatureMap.Internal)getExpression()).set(newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__BINARY_EXP:
        getBinaryExp().clear();
        getBinaryExp().addAll((Collection<? extends BynaryExpType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__NARY_EXP:
        getNaryExp().clear();
        getNaryExp().addAll((Collection<? extends NaryExpType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_LITERAL:
        getBooleanLiteral().clear();
        getBooleanLiteral().addAll((Collection<? extends BooleanLiteralType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_EXP:
        getBooleanExp().clear();
        getBooleanExp().addAll((Collection<? extends BooleanExpType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SET:
        getEmptySet().clear();
        getEmptySet().addAll((Collection<? extends EmptySetType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SEQ:
        getEmptySeq().clear();
        getEmptySeq().addAll((Collection<? extends EmptySeqType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__ID:
        getId().clear();
        getId().addAll((Collection<? extends Identifier>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__INTEGER_LITERAL:
        getIntegerLiteral().clear();
        getIntegerLiteral().addAll((Collection<? extends IntegerLiteralType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_EXP:
        getQuantifiedExp().clear();
        getQuantifiedExp().addAll((Collection<? extends QuantifiedExpType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_SET:
        getQuantifiedSet().clear();
        getQuantifiedSet().addAll((Collection<? extends QuantifiedSetType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__STRING_LITERAL:
        getSTRINGLiteral().clear();
        getSTRINGLiteral().addAll((Collection<? extends STRINGLiteralType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__UNARY_EXP:
        getUnaryExp().clear();
        getUnaryExp().addAll((Collection<? extends UnaryExpType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__STRUCT:
        getStruct().clear();
        getStruct().addAll((Collection<? extends StructType>)newValue);
        return;
      case BxmlPackage.VARIABLES_TYPE__RECORD:
        getRecord().clear();
        getRecord().addAll((Collection<? extends RecordType>)newValue);
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
      case BxmlPackage.VARIABLES_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.VARIABLES_TYPE__EXPRESSION:
        getExpression().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__BINARY_EXP:
        getBinaryExp().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__NARY_EXP:
        getNaryExp().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_LITERAL:
        getBooleanLiteral().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_EXP:
        getBooleanExp().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SET:
        getEmptySet().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SEQ:
        getEmptySeq().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__ID:
        getId().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__INTEGER_LITERAL:
        getIntegerLiteral().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_EXP:
        getQuantifiedExp().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_SET:
        getQuantifiedSet().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__STRING_LITERAL:
        getSTRINGLiteral().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__UNARY_EXP:
        getUnaryExp().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__STRUCT:
        getStruct().clear();
        return;
      case BxmlPackage.VARIABLES_TYPE__RECORD:
        getRecord().clear();
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
      case BxmlPackage.VARIABLES_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.VARIABLES_TYPE__EXPRESSION:
        return expression != null && !expression.isEmpty();
      case BxmlPackage.VARIABLES_TYPE__BINARY_EXP:
        return !getBinaryExp().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__NARY_EXP:
        return !getNaryExp().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_LITERAL:
        return !getBooleanLiteral().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__BOOLEAN_EXP:
        return !getBooleanExp().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SET:
        return !getEmptySet().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__EMPTY_SEQ:
        return !getEmptySeq().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__ID:
        return !getId().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__INTEGER_LITERAL:
        return !getIntegerLiteral().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_EXP:
        return !getQuantifiedExp().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__QUANTIFIED_SET:
        return !getQuantifiedSet().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__STRING_LITERAL:
        return !getSTRINGLiteral().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__UNARY_EXP:
        return !getUnaryExp().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__STRUCT:
        return !getStruct().isEmpty();
      case BxmlPackage.VARIABLES_TYPE__RECORD:
        return !getRecord().isEmpty();
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
    result.append(" (expression: ");
    result.append(expression);
    result.append(')');
    return result.toString();
  }

} //VariablesTypeImpl
