/**
 */
package bxml.impl;

import bxml.ANYSubType;
import bxml.AbstractConstantsType;
import bxml.AbstractVariablesType;
import bxml.AbstractionType;
import bxml.AssertSubType;
import bxml.AssertionsType;
import bxml.AssignementSubType;
import bxml.AttrType;
import bxml.BecomesInType;
import bxml.BecomesSuchThatType;
import bxml.BinaryPredType;
import bxml.BlocSubType;
import bxml.BodyType3;
import bxml.BooleanExpType;
import bxml.BooleanLiteralType;
import bxml.BxmlPackage;
import bxml.CaseSubType;
import bxml.ChoicesType;
import bxml.ConcreteConstantsType;
import bxml.ConcreteVariablesType;
import bxml.ConditionType;
import bxml.ConstraintsType;
import bxml.DocumentRoot;
import bxml.EmptySeqType;
import bxml.EmptySetType;
import bxml.EnumeratedValuesType;
import bxml.ExpComparisonType;
import bxml.ExtendsType;
import bxml.GuardType;
import bxml.IfSubType;
import bxml.ImportsType;
import bxml.IncludesType;
import bxml.InitialisationType;
import bxml.IntegerLiteralType;
import bxml.InvariantType;
import bxml.LETSubType;
import bxml.LocalOperationsType;
import bxml.MachineType;
import bxml.NaryExpType;
import bxml.NaryPredType;
import bxml.NarySubType;
import bxml.OperationCallType;
import bxml.OperationType;
import bxml.OperationsType;
import bxml.PreconditionType;
import bxml.PredType;
import bxml.PromotedOperationType;
import bxml.PromotesType;
import bxml.PropertiesType;
import bxml.QuantifiedExpType;
import bxml.QuantifiedPredType;
import bxml.QuantifiedSetType;
import bxml.RecordItemType;
import bxml.RecordType;
import bxml.ReferencedMachineType;
import bxml.RefinesType;
import bxml.STRINGLiteralType;
import bxml.SeesType;
import bxml.SelectType;
import bxml.SetType1;
import bxml.SetsType;
import bxml.SkipType;
import bxml.StructType;
import bxml.ThenType;
import bxml.TypeInfo;
import bxml.TypeInfosType;
import bxml.UnaryPredType;
import bxml.UsesType;
import bxml.VARINType;
import bxml.ValueType;
import bxml.VariablesType1;
import bxml.VariantType;
import bxml.WhenClausesType;
import bxml.WhenType;
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
 *   <li>{@link bxml.impl.DocumentRootImpl#getAbstractConstants <em>Abstract Constants</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getAbstractVariables <em>Abstract Variables</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getANYSub <em>ANY Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getAssertSub <em>Assert Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getAssignementSub <em>Assignement Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getBecomesIn <em>Becomes In</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getBecomesSuchThat <em>Becomes Such That</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getBlocSub <em>Bloc Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getCaseSub <em>Case Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getConcreteConstants <em>Concrete Constants</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getConcreteVariables <em>Concrete Variables</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getEnumeratedValues <em>Enumerated Values</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getIfSub <em>If Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getInitialisation <em>Initialisation</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getLETSub <em>LET Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getLocalOperations <em>Local Operations</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getNarySub <em>Nary Sub</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getPromotedOperation <em>Promoted Operation</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getPromotes <em>Promotes</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getRecordItem <em>Record Item</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getReferencedMachine <em>Referenced Machine</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getSees <em>Sees</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getSkip <em>Skip</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getThen <em>Then</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getTypeInfos <em>Type Infos</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getVARIN <em>VARIN</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getWhen <em>When</em>}</li>
 *   <li>{@link bxml.impl.DocumentRootImpl#getWhenClauses <em>When Clauses</em>}</li>
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
   * The default value of the '{@link #getGenericType() <em>Generic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenericType()
   * @generated
   * @ordered
   */
  protected static final String GENERIC_TYPE_EDEFAULT = null;

  /**
   * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance()
   * @generated
   * @ordered
   */
  protected static final String INSTANCE_EDEFAULT = null;

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
  public AbstractConstantsType getAbstractConstants() {
    return (AbstractConstantsType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_AbstractConstants(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstractConstants(AbstractConstantsType newAbstractConstants, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_AbstractConstants(), newAbstractConstants, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstractConstants(AbstractConstantsType newAbstractConstants) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_AbstractConstants(), newAbstractConstants);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractVariablesType getAbstractVariables() {
    return (AbstractVariablesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_AbstractVariables(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstractVariables(AbstractVariablesType newAbstractVariables, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_AbstractVariables(), newAbstractVariables, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstractVariables(AbstractVariablesType newAbstractVariables) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_AbstractVariables(), newAbstractVariables);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractionType getAbstraction() {
    return (AbstractionType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Abstraction(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstraction(AbstractionType newAbstraction, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Abstraction(), newAbstraction, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstraction(AbstractionType newAbstraction) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Abstraction(), newAbstraction);
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
  public AssertSubType getAssertSub() {
    return (AssertSubType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_AssertSub(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertSub(AssertSubType newAssertSub, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_AssertSub(), newAssertSub, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertSub(AssertSubType newAssertSub) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_AssertSub(), newAssertSub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionsType getAssertions() {
    return (AssertionsType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Assertions(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertions(AssertionsType newAssertions, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Assertions(), newAssertions, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertions(AssertionsType newAssertions) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Assertions(), newAssertions);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignementSubType getAssignementSub() {
    return (AssignementSubType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_AssignementSub(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignementSub(AssignementSubType newAssignementSub, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_AssignementSub(), newAssignementSub, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignementSub(AssignementSubType newAssignementSub) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_AssignementSub(), newAssignementSub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrType getAttr() {
    return (AttrType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Attr(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttr(AttrType newAttr, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Attr(), newAttr, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(AttrType newAttr) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Attr(), newAttr);
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
  public BecomesSuchThatType getBecomesSuchThat() {
    return (BecomesSuchThatType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_BecomesSuchThat(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBecomesSuchThat(BecomesSuchThatType newBecomesSuchThat, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_BecomesSuchThat(), newBecomesSuchThat, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBecomesSuchThat(BecomesSuchThatType newBecomesSuchThat) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_BecomesSuchThat(), newBecomesSuchThat);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryPredType getBinaryPred() {
    return (BinaryPredType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_BinaryPred(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinaryPred(BinaryPredType newBinaryPred, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_BinaryPred(), newBinaryPred, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinaryPred(BinaryPredType newBinaryPred) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_BinaryPred(), newBinaryPred);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlocSubType getBlocSub() {
    return (BlocSubType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_BlocSub(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlocSub(BlocSubType newBlocSub, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_BlocSub(), newBlocSub, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlocSub(BlocSubType newBlocSub) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_BlocSub(), newBlocSub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType3 getBody() {
    return (BodyType3)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Body(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(BodyType3 newBody, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Body(), newBody, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(BodyType3 newBody) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Body(), newBody);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpType getBooleanExp() {
    return (BooleanExpType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_BooleanExp(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBooleanExp(BooleanExpType newBooleanExp, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_BooleanExp(), newBooleanExp, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanExp(BooleanExpType newBooleanExp) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_BooleanExp(), newBooleanExp);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteralType getBooleanLiteral() {
    return (BooleanLiteralType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_BooleanLiteral(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBooleanLiteral(BooleanLiteralType newBooleanLiteral, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_BooleanLiteral(), newBooleanLiteral, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanLiteral(BooleanLiteralType newBooleanLiteral) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_BooleanLiteral(), newBooleanLiteral);
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
  public ChoicesType getChoices() {
    return (ChoicesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Choices(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChoices(ChoicesType newChoices, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Choices(), newChoices, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChoices(ChoicesType newChoices) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Choices(), newChoices);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteConstantsType getConcreteConstants() {
    return (ConcreteConstantsType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_ConcreteConstants(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcreteConstants(ConcreteConstantsType newConcreteConstants, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_ConcreteConstants(), newConcreteConstants, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcreteConstants(ConcreteConstantsType newConcreteConstants) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_ConcreteConstants(), newConcreteConstants);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteVariablesType getConcreteVariables() {
    return (ConcreteVariablesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_ConcreteVariables(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcreteVariables(ConcreteVariablesType newConcreteVariables, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_ConcreteVariables(), newConcreteVariables, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcreteVariables(ConcreteVariablesType newConcreteVariables) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_ConcreteVariables(), newConcreteVariables);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionType getCondition() {
    return (ConditionType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Condition(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(ConditionType newCondition, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Condition(), newCondition, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(ConditionType newCondition) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Condition(), newCondition);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintsType getConstraints() {
    return (ConstraintsType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Constraints(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraints(ConstraintsType newConstraints, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Constraints(), newConstraints, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraints(ConstraintsType newConstraints) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Constraints(), newConstraints);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptySeqType getEmptySeq() {
    return (EmptySeqType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_EmptySeq(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmptySeq(EmptySeqType newEmptySeq, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_EmptySeq(), newEmptySeq, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptySeq(EmptySeqType newEmptySeq) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_EmptySeq(), newEmptySeq);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptySetType getEmptySet() {
    return (EmptySetType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_EmptySet(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmptySet(EmptySetType newEmptySet, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_EmptySet(), newEmptySet, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptySet(EmptySetType newEmptySet) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_EmptySet(), newEmptySet);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumeratedValuesType getEnumeratedValues() {
    return (EnumeratedValuesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_EnumeratedValues(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumeratedValues(EnumeratedValuesType newEnumeratedValues, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_EnumeratedValues(), newEnumeratedValues, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumeratedValues(EnumeratedValuesType newEnumeratedValues) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_EnumeratedValues(), newEnumeratedValues);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpComparisonType getExpComparison() {
    return (ExpComparisonType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_ExpComparison(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpComparison(ExpComparisonType newExpComparison, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_ExpComparison(), newExpComparison, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpComparison(ExpComparisonType newExpComparison) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_ExpComparison(), newExpComparison);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsType getExtends() {
    return (ExtendsType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Extends(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(ExtendsType newExtends, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Extends(), newExtends, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(ExtendsType newExtends) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Extends(), newExtends);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGenericType() {
    return (String)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_GenericType(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericType(String newGenericType) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_GenericType(), newGenericType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardType getGuard() {
    return (GuardType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Guard(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(GuardType newGuard, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Guard(), newGuard, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(GuardType newGuard) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Guard(), newGuard);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSubType getIfSub() {
    return (IfSubType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_IfSub(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfSub(IfSubType newIfSub, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_IfSub(), newIfSub, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfSub(IfSubType newIfSub) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_IfSub(), newIfSub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportsType getImports() {
    return (ImportsType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Imports(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImports(ImportsType newImports, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Imports(), newImports, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImports(ImportsType newImports) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Imports(), newImports);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludesType getIncludes() {
    return (IncludesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Includes(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncludes(IncludesType newIncludes, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Includes(), newIncludes, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludes(IncludesType newIncludes) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Includes(), newIncludes);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialisationType getInitialisation() {
    return (InitialisationType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Initialisation(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialisation(InitialisationType newInitialisation, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Initialisation(), newInitialisation, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialisation(InitialisationType newInitialisation) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Initialisation(), newInitialisation);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInstance() {
    return (String)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Instance(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance(String newInstance) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Instance(), newInstance);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteralType getIntegerLiteral() {
    return (IntegerLiteralType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_IntegerLiteral(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntegerLiteral(IntegerLiteralType newIntegerLiteral, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_IntegerLiteral(), newIntegerLiteral, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntegerLiteral(IntegerLiteralType newIntegerLiteral) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_IntegerLiteral(), newIntegerLiteral);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvariantType getInvariant() {
    return (InvariantType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Invariant(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvariant(InvariantType newInvariant, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Invariant(), newInvariant, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvariant(InvariantType newInvariant) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Invariant(), newInvariant);
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
  public LocalOperationsType getLocalOperations() {
    return (LocalOperationsType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_LocalOperations(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocalOperations(LocalOperationsType newLocalOperations, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_LocalOperations(), newLocalOperations, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalOperations(LocalOperationsType newLocalOperations) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_LocalOperations(), newLocalOperations);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineType getMachine() {
    return (MachineType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Machine(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMachine(MachineType newMachine, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Machine(), newMachine, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachine(MachineType newMachine) {
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
  public NaryPredType getNaryPred() {
    return (NaryPredType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_NaryPred(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNaryPred(NaryPredType newNaryPred, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_NaryPred(), newNaryPred, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNaryPred(NaryPredType newNaryPred) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_NaryPred(), newNaryPred);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NarySubType getNarySub() {
    return (NarySubType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_NarySub(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNarySub(NarySubType newNarySub, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_NarySub(), newNarySub, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNarySub(NarySubType newNarySub) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_NarySub(), newNarySub);
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
  public OperationCallType getOperationCall() {
    return (OperationCallType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_OperationCall(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperationCall(OperationCallType newOperationCall, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_OperationCall(), newOperationCall, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperationCall(OperationCallType newOperationCall) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_OperationCall(), newOperationCall);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationsType getOperations() {
    return (OperationsType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Operations(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperations(OperationsType newOperations, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Operations(), newOperations, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperations(OperationsType newOperations) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Operations(), newOperations);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreconditionType getPrecondition() {
    return (PreconditionType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Precondition(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrecondition(PreconditionType newPrecondition, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Precondition(), newPrecondition, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecondition(PreconditionType newPrecondition) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Precondition(), newPrecondition);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredType getPred() {
    return (PredType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Pred(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPred(PredType newPred, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Pred(), newPred, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPred(PredType newPred) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Pred(), newPred);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PromotedOperationType getPromotedOperation() {
    return (PromotedOperationType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_PromotedOperation(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPromotedOperation(PromotedOperationType newPromotedOperation, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_PromotedOperation(), newPromotedOperation, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPromotedOperation(PromotedOperationType newPromotedOperation) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_PromotedOperation(), newPromotedOperation);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PromotesType getPromotes() {
    return (PromotesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Promotes(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPromotes(PromotesType newPromotes, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Promotes(), newPromotes, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPromotes(PromotesType newPromotes) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Promotes(), newPromotes);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertiesType getProperties() {
    return (PropertiesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Properties(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Properties(), newProperties, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperties(PropertiesType newProperties) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Properties(), newProperties);
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
  public RecordItemType getRecordItem() {
    return (RecordItemType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_RecordItem(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordItem(RecordItemType newRecordItem, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_RecordItem(), newRecordItem, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordItem(RecordItemType newRecordItem) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_RecordItem(), newRecordItem);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedMachineType getReferencedMachine() {
    return (ReferencedMachineType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_ReferencedMachine(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferencedMachine(ReferencedMachineType newReferencedMachine, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_ReferencedMachine(), newReferencedMachine, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedMachine(ReferencedMachineType newReferencedMachine) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_ReferencedMachine(), newReferencedMachine);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefinesType getRefines() {
    return (RefinesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Refines(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRefines(RefinesType newRefines, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Refines(), newRefines, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefines(RefinesType newRefines) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Refines(), newRefines);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeesType getSees() {
    return (SeesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Sees(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSees(SeesType newSees, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Sees(), newSees, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSees(SeesType newSees) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Sees(), newSees);
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
  public SetType1 getSet() {
    return (SetType1)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Set(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(SetType1 newSet, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Set(), newSet, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(SetType1 newSet) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Set(), newSet);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetsType getSets() {
    return (SetsType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Sets(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSets(SetsType newSets, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Sets(), newSets, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSets(SetsType newSets) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Sets(), newSets);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SkipType getSkip() {
    return (SkipType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Skip(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSkip(SkipType newSkip, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Skip(), newSkip, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSkip(SkipType newSkip) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Skip(), newSkip);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRINGLiteralType getSTRINGLiteral() {
    return (STRINGLiteralType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_STRINGLiteral(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSTRINGLiteral(STRINGLiteralType newSTRINGLiteral, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_STRINGLiteral(), newSTRINGLiteral, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSTRINGLiteral(STRINGLiteralType newSTRINGLiteral) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_STRINGLiteral(), newSTRINGLiteral);
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
  public ThenType getThen() {
    return (ThenType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Then(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(ThenType newThen, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Then(), newThen, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(ThenType newThen) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Then(), newThen);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInfo getType() {
    return (TypeInfo)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Type(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeInfo newType, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Type(), newType, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeInfo newType) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Type(), newType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInfosType getTypeInfos() {
    return (TypeInfosType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_TypeInfos(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeInfos(TypeInfosType newTypeInfos, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_TypeInfos(), newTypeInfos, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeInfos(TypeInfosType newTypeInfos) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_TypeInfos(), newTypeInfos);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPredType getUnaryPred() {
    return (UnaryPredType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_UnaryPred(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryPred(UnaryPredType newUnaryPred, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_UnaryPred(), newUnaryPred, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryPred(UnaryPredType newUnaryPred) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_UnaryPred(), newUnaryPred);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsesType getUses() {
    return (UsesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Uses(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUses(UsesType newUses, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Uses(), newUses, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUses(UsesType newUses) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Uses(), newUses);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getValue() {
    return (ValueType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Value(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(ValueType newValue, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Value(), newValue, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ValueType newValue) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Value(), newValue);
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
  public VariablesType1 getVariables() {
    return (VariablesType1)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Variables(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariables(VariablesType1 newVariables, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Variables(), newVariables, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariables(VariablesType1 newVariables) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Variables(), newVariables);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantType getVariant() {
    return (VariantType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_Variant(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariant(VariantType newVariant, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_Variant(), newVariant, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariant(VariantType newVariant) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_Variant(), newVariant);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenType getWhen() {
    return (WhenType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_When(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhen(WhenType newWhen, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_When(), newWhen, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhen(WhenType newWhen) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_When(), newWhen);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenClausesType getWhenClauses() {
    return (WhenClausesType)getMixed().get(BxmlPackage.eINSTANCE.getDocumentRoot_WhenClauses(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhenClauses(WhenClausesType newWhenClauses, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(BxmlPackage.eINSTANCE.getDocumentRoot_WhenClauses(), newWhenClauses, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhenClauses(WhenClausesType newWhenClauses) {
    ((FeatureMap.Internal)getMixed()).set(BxmlPackage.eINSTANCE.getDocumentRoot_WhenClauses(), newWhenClauses);
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
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_CONSTANTS:
        return basicSetAbstractConstants(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_VARIABLES:
        return basicSetAbstractVariables(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACTION:
        return basicSetAbstraction(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        return basicSetANYSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__ASSERT_SUB:
        return basicSetAssertSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__ASSERTIONS:
        return basicSetAssertions(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__ASSIGNEMENT_SUB:
        return basicSetAssignementSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        return basicSetBecomesIn(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_SUCH_THAT:
        return basicSetBecomesSuchThat(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__BINARY_PRED:
        return basicSetBinaryPred(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__BLOC_SUB:
        return basicSetBlocSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__BODY:
        return basicSetBody(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_EXP:
        return basicSetBooleanExp(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_LITERAL:
        return basicSetBooleanLiteral(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        return basicSetCaseSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__CHOICES:
        return basicSetChoices(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_CONSTANTS:
        return basicSetConcreteConstants(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_VARIABLES:
        return basicSetConcreteVariables(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__CONDITION:
        return basicSetCondition(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__CONSTRAINTS:
        return basicSetConstraints(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SEQ:
        return basicSetEmptySeq(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SET:
        return basicSetEmptySet(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__ENUMERATED_VALUES:
        return basicSetEnumeratedValues(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__EXP_COMPARISON:
        return basicSetExpComparison(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__EXTENDS:
        return basicSetExtends(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__GUARD:
        return basicSetGuard(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__IF_SUB:
        return basicSetIfSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__IMPORTS:
        return basicSetImports(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__INCLUDES:
        return basicSetIncludes(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__INITIALISATION:
        return basicSetInitialisation(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__INTEGER_LITERAL:
        return basicSetIntegerLiteral(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__INVARIANT:
        return basicSetInvariant(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        return basicSetLETSub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__LOCAL_OPERATIONS:
        return basicSetLocalOperations(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        return basicSetMachine(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        return basicSetNaryExp(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__NARY_PRED:
        return basicSetNaryPred(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__NARY_SUB:
        return basicSetNarySub(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        return basicSetOperation(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__OPERATION_CALL:
        return basicSetOperationCall(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__OPERATIONS:
        return basicSetOperations(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__PRECONDITION:
        return basicSetPrecondition(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__PRED:
        return basicSetPred(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__PROMOTED_OPERATION:
        return basicSetPromotedOperation(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__PROMOTES:
        return basicSetPromotes(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__PROPERTIES:
        return basicSetProperties(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_EXP:
        return basicSetQuantifiedExp(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_PRED:
        return basicSetQuantifiedPred(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_SET:
        return basicSetQuantifiedSet(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__RECORD:
        return basicSetRecord(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__RECORD_ITEM:
        return basicSetRecordItem(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__REFERENCED_MACHINE:
        return basicSetReferencedMachine(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__REFINES:
        return basicSetRefines(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__SEES:
        return basicSetSees(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        return basicSetSelect(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__SET:
        return basicSetSet(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__SETS:
        return basicSetSets(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__SKIP:
        return basicSetSkip(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__STRING_LITERAL:
        return basicSetSTRINGLiteral(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        return basicSetStruct(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__THEN:
        return basicSetThen(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__TYPE:
        return basicSetType(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__TYPE_INFOS:
        return basicSetTypeInfos(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__UNARY_PRED:
        return basicSetUnaryPred(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__USES:
        return basicSetUses(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__VALUE:
        return basicSetValue(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        return basicSetVARIN(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__VARIABLES:
        return basicSetVariables(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__VARIANT:
        return basicSetVariant(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__WHEN:
        return basicSetWhen(null, msgs);
      case BxmlPackage.DOCUMENT_ROOT__WHEN_CLAUSES:
        return basicSetWhenClauses(null, msgs);
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
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_CONSTANTS:
        return getAbstractConstants();
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_VARIABLES:
        return getAbstractVariables();
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACTION:
        return getAbstraction();
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        return getANYSub();
      case BxmlPackage.DOCUMENT_ROOT__ASSERT_SUB:
        return getAssertSub();
      case BxmlPackage.DOCUMENT_ROOT__ASSERTIONS:
        return getAssertions();
      case BxmlPackage.DOCUMENT_ROOT__ASSIGNEMENT_SUB:
        return getAssignementSub();
      case BxmlPackage.DOCUMENT_ROOT__ATTR:
        return getAttr();
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        return getBecomesIn();
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_SUCH_THAT:
        return getBecomesSuchThat();
      case BxmlPackage.DOCUMENT_ROOT__BINARY_PRED:
        return getBinaryPred();
      case BxmlPackage.DOCUMENT_ROOT__BLOC_SUB:
        return getBlocSub();
      case BxmlPackage.DOCUMENT_ROOT__BODY:
        return getBody();
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_EXP:
        return getBooleanExp();
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_LITERAL:
        return getBooleanLiteral();
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        return getCaseSub();
      case BxmlPackage.DOCUMENT_ROOT__CHOICES:
        return getChoices();
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_CONSTANTS:
        return getConcreteConstants();
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_VARIABLES:
        return getConcreteVariables();
      case BxmlPackage.DOCUMENT_ROOT__CONDITION:
        return getCondition();
      case BxmlPackage.DOCUMENT_ROOT__CONSTRAINTS:
        return getConstraints();
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SEQ:
        return getEmptySeq();
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SET:
        return getEmptySet();
      case BxmlPackage.DOCUMENT_ROOT__ENUMERATED_VALUES:
        return getEnumeratedValues();
      case BxmlPackage.DOCUMENT_ROOT__EXP_COMPARISON:
        return getExpComparison();
      case BxmlPackage.DOCUMENT_ROOT__EXTENDS:
        return getExtends();
      case BxmlPackage.DOCUMENT_ROOT__GENERIC_TYPE:
        return getGenericType();
      case BxmlPackage.DOCUMENT_ROOT__GUARD:
        return getGuard();
      case BxmlPackage.DOCUMENT_ROOT__IF_SUB:
        return getIfSub();
      case BxmlPackage.DOCUMENT_ROOT__IMPORTS:
        return getImports();
      case BxmlPackage.DOCUMENT_ROOT__INCLUDES:
        return getIncludes();
      case BxmlPackage.DOCUMENT_ROOT__INITIALISATION:
        return getInitialisation();
      case BxmlPackage.DOCUMENT_ROOT__INSTANCE:
        return getInstance();
      case BxmlPackage.DOCUMENT_ROOT__INTEGER_LITERAL:
        return getIntegerLiteral();
      case BxmlPackage.DOCUMENT_ROOT__INVARIANT:
        return getInvariant();
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        return getLETSub();
      case BxmlPackage.DOCUMENT_ROOT__LOCAL_OPERATIONS:
        return getLocalOperations();
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        return getMachine();
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        return getNaryExp();
      case BxmlPackage.DOCUMENT_ROOT__NARY_PRED:
        return getNaryPred();
      case BxmlPackage.DOCUMENT_ROOT__NARY_SUB:
        return getNarySub();
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        return getOperation();
      case BxmlPackage.DOCUMENT_ROOT__OPERATION_CALL:
        return getOperationCall();
      case BxmlPackage.DOCUMENT_ROOT__OPERATIONS:
        return getOperations();
      case BxmlPackage.DOCUMENT_ROOT__PRECONDITION:
        return getPrecondition();
      case BxmlPackage.DOCUMENT_ROOT__PRED:
        return getPred();
      case BxmlPackage.DOCUMENT_ROOT__PROMOTED_OPERATION:
        return getPromotedOperation();
      case BxmlPackage.DOCUMENT_ROOT__PROMOTES:
        return getPromotes();
      case BxmlPackage.DOCUMENT_ROOT__PROPERTIES:
        return getProperties();
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_EXP:
        return getQuantifiedExp();
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_PRED:
        return getQuantifiedPred();
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_SET:
        return getQuantifiedSet();
      case BxmlPackage.DOCUMENT_ROOT__RECORD:
        return getRecord();
      case BxmlPackage.DOCUMENT_ROOT__RECORD_ITEM:
        return getRecordItem();
      case BxmlPackage.DOCUMENT_ROOT__REFERENCED_MACHINE:
        return getReferencedMachine();
      case BxmlPackage.DOCUMENT_ROOT__REFINES:
        return getRefines();
      case BxmlPackage.DOCUMENT_ROOT__SEES:
        return getSees();
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        return getSelect();
      case BxmlPackage.DOCUMENT_ROOT__SET:
        return getSet();
      case BxmlPackage.DOCUMENT_ROOT__SETS:
        return getSets();
      case BxmlPackage.DOCUMENT_ROOT__SKIP:
        return getSkip();
      case BxmlPackage.DOCUMENT_ROOT__STRING_LITERAL:
        return getSTRINGLiteral();
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        return getStruct();
      case BxmlPackage.DOCUMENT_ROOT__THEN:
        return getThen();
      case BxmlPackage.DOCUMENT_ROOT__TYPE:
        return getType();
      case BxmlPackage.DOCUMENT_ROOT__TYPE_INFOS:
        return getTypeInfos();
      case BxmlPackage.DOCUMENT_ROOT__UNARY_PRED:
        return getUnaryPred();
      case BxmlPackage.DOCUMENT_ROOT__USES:
        return getUses();
      case BxmlPackage.DOCUMENT_ROOT__VALUE:
        return getValue();
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        return getVARIN();
      case BxmlPackage.DOCUMENT_ROOT__VARIABLES:
        return getVariables();
      case BxmlPackage.DOCUMENT_ROOT__VARIANT:
        return getVariant();
      case BxmlPackage.DOCUMENT_ROOT__WHEN:
        return getWhen();
      case BxmlPackage.DOCUMENT_ROOT__WHEN_CLAUSES:
        return getWhenClauses();
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
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_CONSTANTS:
        setAbstractConstants((AbstractConstantsType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_VARIABLES:
        setAbstractVariables((AbstractVariablesType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACTION:
        setAbstraction((AbstractionType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        setANYSub((ANYSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ASSERT_SUB:
        setAssertSub((AssertSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ASSERTIONS:
        setAssertions((AssertionsType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ASSIGNEMENT_SUB:
        setAssignementSub((AssignementSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        setBecomesIn((BecomesInType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_SUCH_THAT:
        setBecomesSuchThat((BecomesSuchThatType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BINARY_PRED:
        setBinaryPred((BinaryPredType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BLOC_SUB:
        setBlocSub((BlocSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BODY:
        setBody((BodyType3)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_EXP:
        setBooleanExp((BooleanExpType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_LITERAL:
        setBooleanLiteral((BooleanLiteralType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        setCaseSub((CaseSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CHOICES:
        setChoices((ChoicesType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_CONSTANTS:
        setConcreteConstants((ConcreteConstantsType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_VARIABLES:
        setConcreteVariables((ConcreteVariablesType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CONDITION:
        setCondition((ConditionType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CONSTRAINTS:
        setConstraints((ConstraintsType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SEQ:
        setEmptySeq((EmptySeqType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SET:
        setEmptySet((EmptySetType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ENUMERATED_VALUES:
        setEnumeratedValues((EnumeratedValuesType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__EXP_COMPARISON:
        setExpComparison((ExpComparisonType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__EXTENDS:
        setExtends((ExtendsType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__GENERIC_TYPE:
        setGenericType((String)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__GUARD:
        setGuard((GuardType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__IF_SUB:
        setIfSub((IfSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__IMPORTS:
        setImports((ImportsType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INCLUDES:
        setIncludes((IncludesType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INITIALISATION:
        setInitialisation((InitialisationType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INSTANCE:
        setInstance((String)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INTEGER_LITERAL:
        setIntegerLiteral((IntegerLiteralType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INVARIANT:
        setInvariant((InvariantType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        setLETSub((LETSubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__LOCAL_OPERATIONS:
        setLocalOperations((LocalOperationsType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        setMachine((MachineType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        setNaryExp((NaryExpType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__NARY_PRED:
        setNaryPred((NaryPredType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__NARY_SUB:
        setNarySub((NarySubType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        setOperation((OperationType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__OPERATION_CALL:
        setOperationCall((OperationCallType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__OPERATIONS:
        setOperations((OperationsType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PRECONDITION:
        setPrecondition((PreconditionType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PRED:
        setPred((PredType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PROMOTED_OPERATION:
        setPromotedOperation((PromotedOperationType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PROMOTES:
        setPromotes((PromotesType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PROPERTIES:
        setProperties((PropertiesType)newValue);
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
      case BxmlPackage.DOCUMENT_ROOT__RECORD_ITEM:
        setRecordItem((RecordItemType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__REFERENCED_MACHINE:
        setReferencedMachine((ReferencedMachineType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__REFINES:
        setRefines((RefinesType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SEES:
        setSees((SeesType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        setSelect((SelectType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SET:
        setSet((SetType1)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SETS:
        setSets((SetsType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SKIP:
        setSkip((SkipType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__STRING_LITERAL:
        setSTRINGLiteral((STRINGLiteralType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        setStruct((StructType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__THEN:
        setThen((ThenType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__TYPE:
        setType((TypeInfo)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__TYPE_INFOS:
        setTypeInfos((TypeInfosType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__UNARY_PRED:
        setUnaryPred((UnaryPredType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__USES:
        setUses((UsesType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VALUE:
        setValue((ValueType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        setVARIN((VARINType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VARIABLES:
        setVariables((VariablesType1)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VARIANT:
        setVariant((VariantType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__WHEN:
        setWhen((WhenType)newValue);
        return;
      case BxmlPackage.DOCUMENT_ROOT__WHEN_CLAUSES:
        setWhenClauses((WhenClausesType)newValue);
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
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_CONSTANTS:
        setAbstractConstants((AbstractConstantsType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_VARIABLES:
        setAbstractVariables((AbstractVariablesType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACTION:
        setAbstraction((AbstractionType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        setANYSub((ANYSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ASSERT_SUB:
        setAssertSub((AssertSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ASSERTIONS:
        setAssertions((AssertionsType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ASSIGNEMENT_SUB:
        setAssignementSub((AssignementSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        setBecomesIn((BecomesInType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_SUCH_THAT:
        setBecomesSuchThat((BecomesSuchThatType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BINARY_PRED:
        setBinaryPred((BinaryPredType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BLOC_SUB:
        setBlocSub((BlocSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BODY:
        setBody((BodyType3)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_EXP:
        setBooleanExp((BooleanExpType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_LITERAL:
        setBooleanLiteral((BooleanLiteralType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        setCaseSub((CaseSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CHOICES:
        setChoices((ChoicesType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_CONSTANTS:
        setConcreteConstants((ConcreteConstantsType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_VARIABLES:
        setConcreteVariables((ConcreteVariablesType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CONDITION:
        setCondition((ConditionType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__CONSTRAINTS:
        setConstraints((ConstraintsType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SEQ:
        setEmptySeq((EmptySeqType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SET:
        setEmptySet((EmptySetType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__ENUMERATED_VALUES:
        setEnumeratedValues((EnumeratedValuesType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__EXP_COMPARISON:
        setExpComparison((ExpComparisonType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__EXTENDS:
        setExtends((ExtendsType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__GENERIC_TYPE:
        setGenericType(GENERIC_TYPE_EDEFAULT);
        return;
      case BxmlPackage.DOCUMENT_ROOT__GUARD:
        setGuard((GuardType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__IF_SUB:
        setIfSub((IfSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__IMPORTS:
        setImports((ImportsType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INCLUDES:
        setIncludes((IncludesType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INITIALISATION:
        setInitialisation((InitialisationType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INSTANCE:
        setInstance(INSTANCE_EDEFAULT);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INTEGER_LITERAL:
        setIntegerLiteral((IntegerLiteralType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__INVARIANT:
        setInvariant((InvariantType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        setLETSub((LETSubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__LOCAL_OPERATIONS:
        setLocalOperations((LocalOperationsType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        setMachine((MachineType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        setNaryExp((NaryExpType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__NARY_PRED:
        setNaryPred((NaryPredType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__NARY_SUB:
        setNarySub((NarySubType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        setOperation((OperationType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__OPERATION_CALL:
        setOperationCall((OperationCallType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__OPERATIONS:
        setOperations((OperationsType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PRECONDITION:
        setPrecondition((PreconditionType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PRED:
        setPred((PredType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PROMOTED_OPERATION:
        setPromotedOperation((PromotedOperationType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PROMOTES:
        setPromotes((PromotesType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__PROPERTIES:
        setProperties((PropertiesType)null);
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
      case BxmlPackage.DOCUMENT_ROOT__RECORD_ITEM:
        setRecordItem((RecordItemType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__REFERENCED_MACHINE:
        setReferencedMachine((ReferencedMachineType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__REFINES:
        setRefines((RefinesType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SEES:
        setSees((SeesType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        setSelect((SelectType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SET:
        setSet((SetType1)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SETS:
        setSets((SetsType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__SKIP:
        setSkip((SkipType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__STRING_LITERAL:
        setSTRINGLiteral((STRINGLiteralType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        setStruct((StructType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__THEN:
        setThen((ThenType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__TYPE:
        setType((TypeInfo)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__TYPE_INFOS:
        setTypeInfos((TypeInfosType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__UNARY_PRED:
        setUnaryPred((UnaryPredType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__USES:
        setUses((UsesType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VALUE:
        setValue((ValueType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        setVARIN((VARINType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VARIABLES:
        setVariables((VariablesType1)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__VARIANT:
        setVariant((VariantType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__WHEN:
        setWhen((WhenType)null);
        return;
      case BxmlPackage.DOCUMENT_ROOT__WHEN_CLAUSES:
        setWhenClauses((WhenClausesType)null);
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
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_CONSTANTS:
        return getAbstractConstants() != null;
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACT_VARIABLES:
        return getAbstractVariables() != null;
      case BxmlPackage.DOCUMENT_ROOT__ABSTRACTION:
        return getAbstraction() != null;
      case BxmlPackage.DOCUMENT_ROOT__ANY_SUB:
        return getANYSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__ASSERT_SUB:
        return getAssertSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__ASSERTIONS:
        return getAssertions() != null;
      case BxmlPackage.DOCUMENT_ROOT__ASSIGNEMENT_SUB:
        return getAssignementSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__ATTR:
        return getAttr() != null;
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_IN:
        return getBecomesIn() != null;
      case BxmlPackage.DOCUMENT_ROOT__BECOMES_SUCH_THAT:
        return getBecomesSuchThat() != null;
      case BxmlPackage.DOCUMENT_ROOT__BINARY_PRED:
        return getBinaryPred() != null;
      case BxmlPackage.DOCUMENT_ROOT__BLOC_SUB:
        return getBlocSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__BODY:
        return getBody() != null;
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_EXP:
        return getBooleanExp() != null;
      case BxmlPackage.DOCUMENT_ROOT__BOOLEAN_LITERAL:
        return getBooleanLiteral() != null;
      case BxmlPackage.DOCUMENT_ROOT__CASE_SUB:
        return getCaseSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__CHOICES:
        return getChoices() != null;
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_CONSTANTS:
        return getConcreteConstants() != null;
      case BxmlPackage.DOCUMENT_ROOT__CONCRETE_VARIABLES:
        return getConcreteVariables() != null;
      case BxmlPackage.DOCUMENT_ROOT__CONDITION:
        return getCondition() != null;
      case BxmlPackage.DOCUMENT_ROOT__CONSTRAINTS:
        return getConstraints() != null;
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SEQ:
        return getEmptySeq() != null;
      case BxmlPackage.DOCUMENT_ROOT__EMPTY_SET:
        return getEmptySet() != null;
      case BxmlPackage.DOCUMENT_ROOT__ENUMERATED_VALUES:
        return getEnumeratedValues() != null;
      case BxmlPackage.DOCUMENT_ROOT__EXP_COMPARISON:
        return getExpComparison() != null;
      case BxmlPackage.DOCUMENT_ROOT__EXTENDS:
        return getExtends() != null;
      case BxmlPackage.DOCUMENT_ROOT__GENERIC_TYPE:
        return GENERIC_TYPE_EDEFAULT == null ? getGenericType() != null : !GENERIC_TYPE_EDEFAULT.equals(getGenericType());
      case BxmlPackage.DOCUMENT_ROOT__GUARD:
        return getGuard() != null;
      case BxmlPackage.DOCUMENT_ROOT__IF_SUB:
        return getIfSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__IMPORTS:
        return getImports() != null;
      case BxmlPackage.DOCUMENT_ROOT__INCLUDES:
        return getIncludes() != null;
      case BxmlPackage.DOCUMENT_ROOT__INITIALISATION:
        return getInitialisation() != null;
      case BxmlPackage.DOCUMENT_ROOT__INSTANCE:
        return INSTANCE_EDEFAULT == null ? getInstance() != null : !INSTANCE_EDEFAULT.equals(getInstance());
      case BxmlPackage.DOCUMENT_ROOT__INTEGER_LITERAL:
        return getIntegerLiteral() != null;
      case BxmlPackage.DOCUMENT_ROOT__INVARIANT:
        return getInvariant() != null;
      case BxmlPackage.DOCUMENT_ROOT__LET_SUB:
        return getLETSub() != null;
      case BxmlPackage.DOCUMENT_ROOT__LOCAL_OPERATIONS:
        return getLocalOperations() != null;
      case BxmlPackage.DOCUMENT_ROOT__MACHINE:
        return getMachine() != null;
      case BxmlPackage.DOCUMENT_ROOT__NARY_EXP:
        return getNaryExp() != null;
      case BxmlPackage.DOCUMENT_ROOT__NARY_PRED:
        return getNaryPred() != null;
      case BxmlPackage.DOCUMENT_ROOT__NARY_SUB:
        return getNarySub() != null;
      case BxmlPackage.DOCUMENT_ROOT__OPERATION:
        return getOperation() != null;
      case BxmlPackage.DOCUMENT_ROOT__OPERATION_CALL:
        return getOperationCall() != null;
      case BxmlPackage.DOCUMENT_ROOT__OPERATIONS:
        return getOperations() != null;
      case BxmlPackage.DOCUMENT_ROOT__PRECONDITION:
        return getPrecondition() != null;
      case BxmlPackage.DOCUMENT_ROOT__PRED:
        return getPred() != null;
      case BxmlPackage.DOCUMENT_ROOT__PROMOTED_OPERATION:
        return getPromotedOperation() != null;
      case BxmlPackage.DOCUMENT_ROOT__PROMOTES:
        return getPromotes() != null;
      case BxmlPackage.DOCUMENT_ROOT__PROPERTIES:
        return getProperties() != null;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_EXP:
        return getQuantifiedExp() != null;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_PRED:
        return getQuantifiedPred() != null;
      case BxmlPackage.DOCUMENT_ROOT__QUANTIFIED_SET:
        return getQuantifiedSet() != null;
      case BxmlPackage.DOCUMENT_ROOT__RECORD:
        return getRecord() != null;
      case BxmlPackage.DOCUMENT_ROOT__RECORD_ITEM:
        return getRecordItem() != null;
      case BxmlPackage.DOCUMENT_ROOT__REFERENCED_MACHINE:
        return getReferencedMachine() != null;
      case BxmlPackage.DOCUMENT_ROOT__REFINES:
        return getRefines() != null;
      case BxmlPackage.DOCUMENT_ROOT__SEES:
        return getSees() != null;
      case BxmlPackage.DOCUMENT_ROOT__SELECT:
        return getSelect() != null;
      case BxmlPackage.DOCUMENT_ROOT__SET:
        return getSet() != null;
      case BxmlPackage.DOCUMENT_ROOT__SETS:
        return getSets() != null;
      case BxmlPackage.DOCUMENT_ROOT__SKIP:
        return getSkip() != null;
      case BxmlPackage.DOCUMENT_ROOT__STRING_LITERAL:
        return getSTRINGLiteral() != null;
      case BxmlPackage.DOCUMENT_ROOT__STRUCT:
        return getStruct() != null;
      case BxmlPackage.DOCUMENT_ROOT__THEN:
        return getThen() != null;
      case BxmlPackage.DOCUMENT_ROOT__TYPE:
        return getType() != null;
      case BxmlPackage.DOCUMENT_ROOT__TYPE_INFOS:
        return getTypeInfos() != null;
      case BxmlPackage.DOCUMENT_ROOT__UNARY_PRED:
        return getUnaryPred() != null;
      case BxmlPackage.DOCUMENT_ROOT__USES:
        return getUses() != null;
      case BxmlPackage.DOCUMENT_ROOT__VALUE:
        return getValue() != null;
      case BxmlPackage.DOCUMENT_ROOT__VARIN:
        return getVARIN() != null;
      case BxmlPackage.DOCUMENT_ROOT__VARIABLES:
        return getVariables() != null;
      case BxmlPackage.DOCUMENT_ROOT__VARIANT:
        return getVariant() != null;
      case BxmlPackage.DOCUMENT_ROOT__WHEN:
        return getWhen() != null;
      case BxmlPackage.DOCUMENT_ROOT__WHEN_CLAUSES:
        return getWhenClauses() != null;
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
