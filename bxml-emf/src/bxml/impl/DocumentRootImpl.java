/**
 */
package bxml.impl;

import bxml.ANYSubType;
import bxml.BecomesInType;
import bxml.BinarySubType;
import bxml.BxmlPackage;
import bxml.CaseSubType;
import bxml.DocumentRoot;
import bxml.LETSubType;
import bxml.MachineType1;
import bxml.NaryExpType;
import bxml.OperationType;
import bxml.QuantifiedExpType;
import bxml.QuantifiedPredType;
import bxml.QuantifiedSetType;
import bxml.RecordType;
import bxml.SelectType;
import bxml.StructType;
import bxml.VARINType;
import bxml.WhileType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getANYSub <em>ANY Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getBecomesIn <em>Becomes In</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getBinarySub <em>Binary Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getCaseSub <em>Case Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getLETSub <em>LET Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getVARIN <em>VARIN</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getWhile <em>While</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected FeatureMap mixed;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xMLNSPrefixMap;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xSISchemaLocation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getDocumentRoot();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getMixed() {
    if (mixed == null) {
      mixed = new BasicFeatureMap(this, BxmlPackage.DOCUMENT_ROOT__MIXED);
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXMLNSPrefixMap() {
    if (xMLNSPrefixMap == null) {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BxmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXSISchemaLocation() {
    if (xSISchemaLocation == null) {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BxmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ANYSubType getANYSub() {
    return (ANYSubType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_ANYSub(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetANYSub(ANYSubType newANYSub, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_ANYSub(), newANYSub, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setANYSub(ANYSubType newANYSub) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_ANYSub(), newANYSub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecomesInType getBecomesIn() {
    return (BecomesInType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_BecomesIn(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecomesIn(BecomesInType newBecomesIn, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_BecomesIn(), newBecomesIn, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBecomesIn(BecomesInType newBecomesIn) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_BecomesIn(), newBecomesIn);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinarySubType getBinarySub() {
    return (BinarySubType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_BinarySub(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinarySub(BinarySubType newBinarySub, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_BinarySub(), newBinarySub, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinarySub(BinarySubType newBinarySub) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_BinarySub(), newBinarySub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseSubType getCaseSub() {
    return (CaseSubType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_CaseSub(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseSub(CaseSubType newCaseSub, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_CaseSub(), newCaseSub, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseSub(CaseSubType newCaseSub) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_CaseSub(), newCaseSub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LETSubType getLETSub() {
    return (LETSubType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_LETSub(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLETSub(LETSubType newLETSub, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_LETSub(), newLETSub, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLETSub(LETSubType newLETSub) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_LETSub(), newLETSub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineType1 getMachine() {
    return (MachineType1)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Machine(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMachine(MachineType1 newMachine, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Machine(), newMachine, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachine(MachineType1 newMachine) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Machine(), newMachine);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryExpType getNaryExp() {
    return (NaryExpType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_NaryExp(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNaryExp(NaryExpType newNaryExp, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_NaryExp(), newNaryExp, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNaryExp(NaryExpType newNaryExp) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_NaryExp(), newNaryExp);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType getOperation() {
    return (OperationType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Operation(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(OperationType newOperation, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Operation(), newOperation, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(OperationType newOperation) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Operation(), newOperation);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedExpType getQuantifiedExp() {
    return (QuantifiedExpType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_QuantifiedExp(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedExp(QuantifiedExpType newQuantifiedExp, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_QuantifiedExp(), newQuantifiedExp, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifiedExp(QuantifiedExpType newQuantifiedExp) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_QuantifiedExp(), newQuantifiedExp);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedPredType getQuantifiedPred() {
    return (QuantifiedPredType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_QuantifiedPred(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedPred(QuantifiedPredType newQuantifiedPred, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_QuantifiedPred(), newQuantifiedPred, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifiedPred(QuantifiedPredType newQuantifiedPred) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_QuantifiedPred(), newQuantifiedPred);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedSetType getQuantifiedSet() {
    return (QuantifiedSetType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_QuantifiedSet(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifiedSet(QuantifiedSetType newQuantifiedSet, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_QuantifiedSet(), newQuantifiedSet, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifiedSet(QuantifiedSetType newQuantifiedSet) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_QuantifiedSet(), newQuantifiedSet);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType getRecord() {
    return (RecordType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Record(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecord(RecordType newRecord, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Record(), newRecord, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecord(RecordType newRecord) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Record(), newRecord);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectType getSelect() {
    return (SelectType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Select(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelect(SelectType newSelect, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Select(), newSelect, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelect(SelectType newSelect) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Select(), newSelect);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructType getStruct() {
    return (StructType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Struct(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct(StructType newStruct, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Struct(), newStruct, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct(StructType newStruct) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Struct(), newStruct);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARINType getVARIN() {
    return (VARINType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_VARIN(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVARIN(VARINType newVARIN, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_VARIN(), newVARIN, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVARIN(VARINType newVARIN) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_VARIN(), newVARIN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileType getWhile() {
    return (WhileType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_While(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhile(WhileType newWhile, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_While(), newWhile, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhile(WhileType newWhile) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_While(), newWhile);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
      case BxmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case BxmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        return basicSetANYSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        return basicSetBecomesIn(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__BINARY_SUB:
        return basicSetBinarySub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        return basicSetCaseSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        return basicSetLETSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        return basicSetMachine(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        return basicSetNaryExp(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        return basicSetOperation(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_EXP:
        return basicSetQuantifiedExp(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_PRED:
        return basicSetQuantifiedPred(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_SET:
        return basicSetQuantifiedSet(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__RECORD:
        return basicSetRecord(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        return basicSetSelect(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        return basicSetStruct(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        return basicSetVARIN(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__WHILE:
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
      case BxmlPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return getMixed();
        return ((FeatureMap.Internal)getMixed()).getWrapper();
      case BxmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case BxmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        return getANYSub();
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        return getBecomesIn();
      case BxmlPackage.DOCUMENT_ROOT__BINARY_SUB:
        return getBinarySub();
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        return getCaseSub();
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        return getLETSub();
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        return getMachine();
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        return getNaryExp();
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        return getOperation();
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_EXP:
        return getQuantifiedExp();
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_PRED:
        return getQuantifiedPred();
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_SET:
        return getQuantifiedSet();
      case BxmlPackage.DOCUMENT_ROOT__RECORD:
        return getRecord();
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        return getSelect();
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        return getStruct();
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        return getVARIN();
      case BxmlPackage.DOCUMENT_ROOT__WHILE:
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
      case BxmlPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)getMixed()).set(newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        setANYSub((ANYSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        setBecomesIn((BecomesInType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BINARY_SUB:
        setBinarySub((BinarySubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        setCaseSub((CaseSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        setLETSub((LETSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        setMachine((MachineType1)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        setNaryExp((NaryExpType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        setOperation((OperationType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_EXP:
        setQuantifiedExp((QuantifiedExpType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_PRED:
        setQuantifiedPred((QuantifiedPredType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_SET:
        setQuantifiedSet((QuantifiedSetType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__RECORD:
        setRecord((RecordType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        setSelect((SelectType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        setStruct((StructType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        setVARIN((VARINType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__WHILE:
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
      case BxmlPackage.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        return;
      case BxmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case BxmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        setANYSub((ANYSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        setBecomesIn((BecomesInType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BINARY_SUB:
        setBinarySub((BinarySubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        setCaseSub((CaseSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        setLETSub((LETSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        setMachine((MachineType1)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        setNaryExp((NaryExpType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        setOperation((OperationType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_EXP:
        setQuantifiedExp((QuantifiedExpType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_PRED:
        setQuantifiedPred((QuantifiedPredType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_SET:
        setQuantifiedSet((QuantifiedSetType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__RECORD:
        setRecord((RecordType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        setSelect((SelectType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        setStruct((StructType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        setVARIN((VARINType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__WHILE:
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
      case BxmlPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.isEmpty();
      case BxmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case BxmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        return getANYSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        return getBecomesIn() != null;
      case BxmlPackage.DOCUMENT_ROOT__BINARY_SUB:
        return getBinarySub() != null;
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        return getCaseSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        return getLETSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        return getMachine() != null;
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        return getNaryExp() != null;
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        return getOperation() != null;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_EXP:
        return getQuantifiedExp() != null;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_PRED:
        return getQuantifiedPred() != null;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_SET:
        return getQuantifiedSet() != null;
      case BxmlPackage.DOCUMENT_ROOT__RECORD:
        return getRecord() != null;
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        return getSelect() != null;
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        return getStruct() != null;
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        return getVARIN() != null;
      case BxmlPackage.DOCUMENT_ROOT__WHILE:
        return getWhile() != null;
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
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
