/**
 */
package bxml.impl;

import bxml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BxmlFactoryImpl extends EFactoryImpl implements BxmlFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BxmlFactory init() {
    try {
      BxmlFactory theBxmlFactory = (BxmlFactory)EPackage.Registry.INSTANCE.getEFactory(BxmlPackage.eNS_URI);
      if (theBxmlFactory != null) {
        return theBxmlFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BxmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BxmlFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case BxmlPackage.ABSTRACT_CONSTANTS_TYPE: return createAbstractConstantsType();
      case BxmlPackage.ABSTRACTION_TYPE: return createAbstractionType();
      case BxmlPackage.ABSTRACT_VARIABLES_TYPE: return createAbstractVariablesType();
      case BxmlPackage.ANY_SUB_TYPE: return createANYSubType();
      case BxmlPackage.ASSERTIONS_TYPE: return createAssertionsType();
      case BxmlPackage.ASSERT_SUB_TYPE: return createAssertSubType();
      case BxmlPackage.ASSIGNEMENT_SUBSTITUTION_TYPE: return createAssignementSubstitutionType();
      case BxmlPackage.ATTRIBUTES_TYPE: return createAttributesType();
      case BxmlPackage.BECOMES_IN_TYPE: return createBecomesInType();
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE: return createBecomesSuchThatType();
      case BxmlPackage.BINARY_EXPRESSION_TYPE: return createBinaryExpressionType();
      case BxmlPackage.BINARY_PREDICATE_TYPE: return createBinaryPredicateType();
      case BxmlPackage.BINARY_SUB_TYPE: return createBinarySubType();
      case BxmlPackage.CALL_PARAMATERS_TYPE: return createCallParamatersType();
      case BxmlPackage.CASE_SUB_TYPE: return createCaseSubType();
      case BxmlPackage.CHOICES_TYPE: return createChoicesType();
      case BxmlPackage.CHOICE_TYPE: return createChoiceType();
      case BxmlPackage.CONCRETE_CONSTANTS_TYPE: return createConcreteConstantsType();
      case BxmlPackage.CONCRETE_VARIABLES_TYPE: return createConcreteVariablesType();
      case BxmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case BxmlPackage.ENUMERATED_VALUES_TYPE: return createEnumeratedValuesType();
      case BxmlPackage.EXP_COMPARISON_TYPE: return createExpComparisonType();
      case BxmlPackage.EXP_TYPE: return createExpType();
      case BxmlPackage.IDENTIFIER_TYPE: return createIdentifierType();
      case BxmlPackage.IF_SUB_TYPE: return createIfSubType();
      case BxmlPackage.INFO_TYPE_TYPE: return createInfoTypeType();
      case BxmlPackage.INPUT_PARAMETERS_TYPE: return createInputParametersType();
      case BxmlPackage.LET_SUB_TYPE: return createLETSubType();
      case BxmlPackage.LITERAL_TYPE: return createLiteralType();
      case BxmlPackage.LOCAL_OPERATIONS_TYPE: return createLocalOperationsType();
      case BxmlPackage.MACHINE_TYPE1: return createMachineType1();
      case BxmlPackage.NAME_TYPE: return createNameType();
      case BxmlPackage.NARY_EXP_TYPE: return createNaryExpType();
      case BxmlPackage.NARY_PREDICATE_TYPE: return createNaryPredicateType();
      case BxmlPackage.NARY_SUBSTITUTION_TYPE: return createNarySubstitutionType();
      case BxmlPackage.OPERATION_CALL_TYPE: return createOperationCallType();
      case BxmlPackage.OPERATIONS_TYPE: return createOperationsType();
      case BxmlPackage.OPERATION_TYPE: return createOperationType();
      case BxmlPackage.OUTPUT_PARAMETERS_TYPE: return createOutputParametersType();
      case BxmlPackage.PARAMETERS_TYPE: return createParametersType();
      case BxmlPackage.PARAMETERS_TYPE1: return createParametersType1();
      case BxmlPackage.PREDICATE_TYPE: return createPredicateType();
      case BxmlPackage.PROMOTES_TYPE: return createPromotesType();
      case BxmlPackage.QUANTIFIED_EXP_TYPE: return createQuantifiedExpType();
      case BxmlPackage.QUANTIFIED_PRED_TYPE: return createQuantifiedPredType();
      case BxmlPackage.QUANTIFIED_SET_TYPE: return createQuantifiedSetType();
      case BxmlPackage.RECORD_ITEM_TYPE: return createRecordItemType();
      case BxmlPackage.RECORD_TYPE: return createRecordType();
      case BxmlPackage.REFERENCED_MACHINE_TYPE: return createReferencedMachineType();
      case BxmlPackage.REFERENCED_MACHINE_TYPE1: return createReferencedMachineType1();
      case BxmlPackage.REFERENCED_MACHINE_TYPE2: return createReferencedMachineType2();
      case BxmlPackage.REFINES_TYPE: return createRefinesType();
      case BxmlPackage.SEES_TYPE: return createSeesType();
      case BxmlPackage.SELECT_TYPE: return createSelectType();
      case BxmlPackage.SETS_TYPE: return createSetsType();
      case BxmlPackage.SET_TYPE: return createSetType();
      case BxmlPackage.STRING_LITERAL_TYPE: return createStringLiteralType();
      case BxmlPackage.STRUCT_TYPE: return createStructType();
      case BxmlPackage.SUBSTITUTION_TYPE: return createSubstitutionType();
      case BxmlPackage.TERMINAL_TYPE: return createTerminalType();
      case BxmlPackage.TYPE_INFOS_TYPE: return createTypeInfosType();
      case BxmlPackage.UNARY_EXPRESSION_TYPE: return createUnaryExpressionType();
      case BxmlPackage.UNARY_PREDICATE_TYPE: return createUnaryPredicateType();
      case BxmlPackage.VALUATION_TYPE: return createValuationType();
      case BxmlPackage.VALUATION_TYPE1: return createValuationType1();
      case BxmlPackage.VALUES_TYPE: return createValuesType();
      case BxmlPackage.VALUES_TYPE1: return createValuesType1();
      case BxmlPackage.VALUES_TYPE2: return createValuesType2();
      case BxmlPackage.VARIABLES_TYPE: return createVariablesType();
      case BxmlPackage.VARIABLES_TYPE1: return createVariablesType1();
      case BxmlPackage.VARIN_TYPE: return createVARINType();
      case BxmlPackage.WHEN_CLAUSES_TYPE: return createWhenClausesType();
      case BxmlPackage.WHEN_TYPE: return createWhenType();
      case BxmlPackage.WHILE_TYPE: return createWhileType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case BxmlPackage.BINARY_EXP_OP:
        return createBinaryExpOpFromString(eDataType, initialValue);
      case BxmlPackage.BINARY_PRED_OP:
        return createBinaryPredOpFromString(eDataType, initialValue);
      case BxmlPackage.BINARY_SUB_OP:
        return createBinarySubOpFromString(eDataType, initialValue);
      case BxmlPackage.COMPARISON_OP:
        return createComparisonOpFromString(eDataType, initialValue);
      case BxmlPackage.MACHINE_TYPE:
        return createMachineTypeFromString(eDataType, initialValue);
      case BxmlPackage.NARY_EXP_OP:
        return createNaryExpOpFromString(eDataType, initialValue);
      case BxmlPackage.NARY_OP:
        return createNaryOpFromString(eDataType, initialValue);
      case BxmlPackage.OP_VAR_SUB:
        return createOpVarSubFromString(eDataType, initialValue);
      case BxmlPackage.QUANTIFIED_EXP_OP:
        return createQuantifiedExpOpFromString(eDataType, initialValue);
      case BxmlPackage.QUANTIFIED_PRED_OP:
        return createQuantifiedPredOpFromString(eDataType, initialValue);
      case BxmlPackage.UNARY_EXP_OP:
        return createUnaryExpOpFromString(eDataType, initialValue);
      case BxmlPackage.UNARY_PRED_OP:
        return createUnaryPredOpFromString(eDataType, initialValue);
      case BxmlPackage.BINARY_EXP_OP_OBJECT:
        return createBinaryExpOpObjectFromString(eDataType, initialValue);
      case BxmlPackage.BINARY_PRED_OP_OBJECT:
        return createBinaryPredOpObjectFromString(eDataType, initialValue);
      case BxmlPackage.BINARY_SUB_OP_OBJECT:
        return createBinarySubOpObjectFromString(eDataType, initialValue);
      case BxmlPackage.COMPARISON_OP_OBJECT:
        return createComparisonOpObjectFromString(eDataType, initialValue);
      case BxmlPackage.MACHINE_TYPE_OBJECT:
        return createMachineTypeObjectFromString(eDataType, initialValue);
      case BxmlPackage.NARY_EXP_OP_OBJECT:
        return createNaryExpOpObjectFromString(eDataType, initialValue);
      case BxmlPackage.NARY_OP_OBJECT:
        return createNaryOpObjectFromString(eDataType, initialValue);
      case BxmlPackage.OP_VAR_SUB_OBJECT:
        return createOpVarSubObjectFromString(eDataType, initialValue);
      case BxmlPackage.QUANTIFIED_EXP_OP_OBJECT:
        return createQuantifiedExpOpObjectFromString(eDataType, initialValue);
      case BxmlPackage.QUANTIFIED_PRED_OP_OBJECT:
        return createQuantifiedPredOpObjectFromString(eDataType, initialValue);
      case BxmlPackage.UNARY_EXP_OP_OBJECT:
        return createUnaryExpOpObjectFromString(eDataType, initialValue);
      case BxmlPackage.UNARY_PRED_OP_OBJECT:
        return createUnaryPredOpObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case BxmlPackage.BINARY_EXP_OP:
        return convertBinaryExpOpToString(eDataType, instanceValue);
      case BxmlPackage.BINARY_PRED_OP:
        return convertBinaryPredOpToString(eDataType, instanceValue);
      case BxmlPackage.BINARY_SUB_OP:
        return convertBinarySubOpToString(eDataType, instanceValue);
      case BxmlPackage.COMPARISON_OP:
        return convertComparisonOpToString(eDataType, instanceValue);
      case BxmlPackage.MACHINE_TYPE:
        return convertMachineTypeToString(eDataType, instanceValue);
      case BxmlPackage.NARY_EXP_OP:
        return convertNaryExpOpToString(eDataType, instanceValue);
      case BxmlPackage.NARY_OP:
        return convertNaryOpToString(eDataType, instanceValue);
      case BxmlPackage.OP_VAR_SUB:
        return convertOpVarSubToString(eDataType, instanceValue);
      case BxmlPackage.QUANTIFIED_EXP_OP:
        return convertQuantifiedExpOpToString(eDataType, instanceValue);
      case BxmlPackage.QUANTIFIED_PRED_OP:
        return convertQuantifiedPredOpToString(eDataType, instanceValue);
      case BxmlPackage.UNARY_EXP_OP:
        return convertUnaryExpOpToString(eDataType, instanceValue);
      case BxmlPackage.UNARY_PRED_OP:
        return convertUnaryPredOpToString(eDataType, instanceValue);
      case BxmlPackage.BINARY_EXP_OP_OBJECT:
        return convertBinaryExpOpObjectToString(eDataType, instanceValue);
      case BxmlPackage.BINARY_PRED_OP_OBJECT:
        return convertBinaryPredOpObjectToString(eDataType, instanceValue);
      case BxmlPackage.BINARY_SUB_OP_OBJECT:
        return convertBinarySubOpObjectToString(eDataType, instanceValue);
      case BxmlPackage.COMPARISON_OP_OBJECT:
        return convertComparisonOpObjectToString(eDataType, instanceValue);
      case BxmlPackage.MACHINE_TYPE_OBJECT:
        return convertMachineTypeObjectToString(eDataType, instanceValue);
      case BxmlPackage.NARY_EXP_OP_OBJECT:
        return convertNaryExpOpObjectToString(eDataType, instanceValue);
      case BxmlPackage.NARY_OP_OBJECT:
        return convertNaryOpObjectToString(eDataType, instanceValue);
      case BxmlPackage.OP_VAR_SUB_OBJECT:
        return convertOpVarSubObjectToString(eDataType, instanceValue);
      case BxmlPackage.QUANTIFIED_EXP_OP_OBJECT:
        return convertQuantifiedExpOpObjectToString(eDataType, instanceValue);
      case BxmlPackage.QUANTIFIED_PRED_OP_OBJECT:
        return convertQuantifiedPredOpObjectToString(eDataType, instanceValue);
      case BxmlPackage.UNARY_EXP_OP_OBJECT:
        return convertUnaryExpOpObjectToString(eDataType, instanceValue);
      case BxmlPackage.UNARY_PRED_OP_OBJECT:
        return convertUnaryPredOpObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractConstantsType createAbstractConstantsType() {
    AbstractConstantsTypeImpl abstractConstantsType = new AbstractConstantsTypeImpl();
    return abstractConstantsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractionType createAbstractionType() {
    AbstractionTypeImpl abstractionType = new AbstractionTypeImpl();
    return abstractionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractVariablesType createAbstractVariablesType() {
    AbstractVariablesTypeImpl abstractVariablesType = new AbstractVariablesTypeImpl();
    return abstractVariablesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ANYSubType createANYSubType() {
    ANYSubTypeImpl anySubType = new ANYSubTypeImpl();
    return anySubType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionsType createAssertionsType() {
    AssertionsTypeImpl assertionsType = new AssertionsTypeImpl();
    return assertionsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertSubType createAssertSubType() {
    AssertSubTypeImpl assertSubType = new AssertSubTypeImpl();
    return assertSubType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignementSubstitutionType createAssignementSubstitutionType() {
    AssignementSubstitutionTypeImpl assignementSubstitutionType = new AssignementSubstitutionTypeImpl();
    return assignementSubstitutionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributesType createAttributesType() {
    AttributesTypeImpl attributesType = new AttributesTypeImpl();
    return attributesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecomesInType createBecomesInType() {
    BecomesInTypeImpl becomesInType = new BecomesInTypeImpl();
    return becomesInType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecomesSuchThatType createBecomesSuchThatType() {
    BecomesSuchThatTypeImpl becomesSuchThatType = new BecomesSuchThatTypeImpl();
    return becomesSuchThatType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpressionType createBinaryExpressionType() {
    BinaryExpressionTypeImpl binaryExpressionType = new BinaryExpressionTypeImpl();
    return binaryExpressionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryPredicateType createBinaryPredicateType() {
    BinaryPredicateTypeImpl binaryPredicateType = new BinaryPredicateTypeImpl();
    return binaryPredicateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinarySubType createBinarySubType() {
    BinarySubTypeImpl binarySubType = new BinarySubTypeImpl();
    return binarySubType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallParamatersType createCallParamatersType() {
    CallParamatersTypeImpl callParamatersType = new CallParamatersTypeImpl();
    return callParamatersType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseSubType createCaseSubType() {
    CaseSubTypeImpl caseSubType = new CaseSubTypeImpl();
    return caseSubType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoicesType createChoicesType() {
    ChoicesTypeImpl choicesType = new ChoicesTypeImpl();
    return choicesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoiceType createChoiceType() {
    ChoiceTypeImpl choiceType = new ChoiceTypeImpl();
    return choiceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteConstantsType createConcreteConstantsType() {
    ConcreteConstantsTypeImpl concreteConstantsType = new ConcreteConstantsTypeImpl();
    return concreteConstantsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteVariablesType createConcreteVariablesType() {
    ConcreteVariablesTypeImpl concreteVariablesType = new ConcreteVariablesTypeImpl();
    return concreteVariablesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumeratedValuesType createEnumeratedValuesType() {
    EnumeratedValuesTypeImpl enumeratedValuesType = new EnumeratedValuesTypeImpl();
    return enumeratedValuesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpComparisonType createExpComparisonType() {
    ExpComparisonTypeImpl expComparisonType = new ExpComparisonTypeImpl();
    return expComparisonType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpType createExpType() {
    ExpTypeImpl expType = new ExpTypeImpl();
    return expType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierType createIdentifierType() {
    IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
    return identifierType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSubType createIfSubType() {
    IfSubTypeImpl ifSubType = new IfSubTypeImpl();
    return ifSubType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfoTypeType createInfoTypeType() {
    InfoTypeTypeImpl infoTypeType = new InfoTypeTypeImpl();
    return infoTypeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputParametersType createInputParametersType() {
    InputParametersTypeImpl inputParametersType = new InputParametersTypeImpl();
    return inputParametersType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LETSubType createLETSubType() {
    LETSubTypeImpl letSubType = new LETSubTypeImpl();
    return letSubType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralType createLiteralType() {
    LiteralTypeImpl literalType = new LiteralTypeImpl();
    return literalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalOperationsType createLocalOperationsType() {
    LocalOperationsTypeImpl localOperationsType = new LocalOperationsTypeImpl();
    return localOperationsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineType1 createMachineType1() {
    MachineType1Impl machineType1 = new MachineType1Impl();
    return machineType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameType createNameType() {
    NameTypeImpl nameType = new NameTypeImpl();
    return nameType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryExpType createNaryExpType() {
    NaryExpTypeImpl naryExpType = new NaryExpTypeImpl();
    return naryExpType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryPredicateType createNaryPredicateType() {
    NaryPredicateTypeImpl naryPredicateType = new NaryPredicateTypeImpl();
    return naryPredicateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NarySubstitutionType createNarySubstitutionType() {
    NarySubstitutionTypeImpl narySubstitutionType = new NarySubstitutionTypeImpl();
    return narySubstitutionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationCallType createOperationCallType() {
    OperationCallTypeImpl operationCallType = new OperationCallTypeImpl();
    return operationCallType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationsType createOperationsType() {
    OperationsTypeImpl operationsType = new OperationsTypeImpl();
    return operationsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType createOperationType() {
    OperationTypeImpl operationType = new OperationTypeImpl();
    return operationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputParametersType createOutputParametersType() {
    OutputParametersTypeImpl outputParametersType = new OutputParametersTypeImpl();
    return outputParametersType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParametersType createParametersType() {
    ParametersTypeImpl parametersType = new ParametersTypeImpl();
    return parametersType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParametersType1 createParametersType1() {
    ParametersType1Impl parametersType1 = new ParametersType1Impl();
    return parametersType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateType createPredicateType() {
    PredicateTypeImpl predicateType = new PredicateTypeImpl();
    return predicateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PromotesType createPromotesType() {
    PromotesTypeImpl promotesType = new PromotesTypeImpl();
    return promotesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedExpType createQuantifiedExpType() {
    QuantifiedExpTypeImpl quantifiedExpType = new QuantifiedExpTypeImpl();
    return quantifiedExpType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedPredType createQuantifiedPredType() {
    QuantifiedPredTypeImpl quantifiedPredType = new QuantifiedPredTypeImpl();
    return quantifiedPredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedSetType createQuantifiedSetType() {
    QuantifiedSetTypeImpl quantifiedSetType = new QuantifiedSetTypeImpl();
    return quantifiedSetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordItemType createRecordItemType() {
    RecordItemTypeImpl recordItemType = new RecordItemTypeImpl();
    return recordItemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType createRecordType() {
    RecordTypeImpl recordType = new RecordTypeImpl();
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedMachineType createReferencedMachineType() {
    ReferencedMachineTypeImpl referencedMachineType = new ReferencedMachineTypeImpl();
    return referencedMachineType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedMachineType1 createReferencedMachineType1() {
    ReferencedMachineType1Impl referencedMachineType1 = new ReferencedMachineType1Impl();
    return referencedMachineType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedMachineType2 createReferencedMachineType2() {
    ReferencedMachineType2Impl referencedMachineType2 = new ReferencedMachineType2Impl();
    return referencedMachineType2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefinesType createRefinesType() {
    RefinesTypeImpl refinesType = new RefinesTypeImpl();
    return refinesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeesType createSeesType() {
    SeesTypeImpl seesType = new SeesTypeImpl();
    return seesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectType createSelectType() {
    SelectTypeImpl selectType = new SelectTypeImpl();
    return selectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetsType createSetsType() {
    SetsTypeImpl setsType = new SetsTypeImpl();
    return setsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetType createSetType() {
    SetTypeImpl setType = new SetTypeImpl();
    return setType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteralType createStringLiteralType() {
    StringLiteralTypeImpl stringLiteralType = new StringLiteralTypeImpl();
    return stringLiteralType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructType createStructType() {
    StructTypeImpl structType = new StructTypeImpl();
    return structType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstitutionType createSubstitutionType() {
    SubstitutionTypeImpl substitutionType = new SubstitutionTypeImpl();
    return substitutionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalType createTerminalType() {
    TerminalTypeImpl terminalType = new TerminalTypeImpl();
    return terminalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInfosType createTypeInfosType() {
    TypeInfosTypeImpl typeInfosType = new TypeInfosTypeImpl();
    return typeInfosType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpressionType createUnaryExpressionType() {
    UnaryExpressionTypeImpl unaryExpressionType = new UnaryExpressionTypeImpl();
    return unaryExpressionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPredicateType createUnaryPredicateType() {
    UnaryPredicateTypeImpl unaryPredicateType = new UnaryPredicateTypeImpl();
    return unaryPredicateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuationType createValuationType() {
    ValuationTypeImpl valuationType = new ValuationTypeImpl();
    return valuationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuationType1 createValuationType1() {
    ValuationType1Impl valuationType1 = new ValuationType1Impl();
    return valuationType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesType createValuesType() {
    ValuesTypeImpl valuesType = new ValuesTypeImpl();
    return valuesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesType1 createValuesType1() {
    ValuesType1Impl valuesType1 = new ValuesType1Impl();
    return valuesType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesType2 createValuesType2() {
    ValuesType2Impl valuesType2 = new ValuesType2Impl();
    return valuesType2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablesType createVariablesType() {
    VariablesTypeImpl variablesType = new VariablesTypeImpl();
    return variablesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablesType1 createVariablesType1() {
    VariablesType1Impl variablesType1 = new VariablesType1Impl();
    return variablesType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARINType createVARINType() {
    VARINTypeImpl varinType = new VARINTypeImpl();
    return varinType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenClausesType createWhenClausesType() {
    WhenClausesTypeImpl whenClausesType = new WhenClausesTypeImpl();
    return whenClausesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenType createWhenType() {
    WhenTypeImpl whenType = new WhenTypeImpl();
    return whenType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileType createWhileType() {
    WhileTypeImpl whileType = new WhileTypeImpl();
    return whileType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpOp createBinaryExpOpFromString(EDataType eDataType, String initialValue) {
    BinaryExpOp result = BinaryExpOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryExpOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryPredOp createBinaryPredOpFromString(EDataType eDataType, String initialValue) {
    BinaryPredOp result = BinaryPredOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryPredOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinarySubOp createBinarySubOpFromString(EDataType eDataType, String initialValue) {
    BinarySubOp result = BinarySubOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinarySubOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonOp createComparisonOpFromString(EDataType eDataType, String initialValue) {
    ComparisonOp result = ComparisonOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComparisonOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineType createMachineTypeFromString(EDataType eDataType, String initialValue) {
    MachineType result = MachineType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMachineTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryExpOp createNaryExpOpFromString(EDataType eDataType, String initialValue) {
    NaryExpOp result = NaryExpOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNaryExpOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryOp createNaryOpFromString(EDataType eDataType, String initialValue) {
    NaryOp result = NaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNaryOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpVarSub createOpVarSubFromString(EDataType eDataType, String initialValue) {
    OpVarSub result = OpVarSub.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpVarSubToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedExpOp createQuantifiedExpOpFromString(EDataType eDataType, String initialValue) {
    QuantifiedExpOp result = QuantifiedExpOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQuantifiedExpOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedPredOp createQuantifiedPredOpFromString(EDataType eDataType, String initialValue) {
    QuantifiedPredOp result = QuantifiedPredOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQuantifiedPredOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpOp createUnaryExpOpFromString(EDataType eDataType, String initialValue) {
    UnaryExpOp result = UnaryExpOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryExpOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPredOp createUnaryPredOpFromString(EDataType eDataType, String initialValue) {
    UnaryPredOp result = UnaryPredOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryPredOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpOp createBinaryExpOpObjectFromString(EDataType eDataType, String initialValue) {
    return createBinaryExpOpFromString(BxmlPackage.eINSTANCE.getBinaryExpOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryExpOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertBinaryExpOpToString(BxmlPackage.eINSTANCE.getBinaryExpOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryPredOp createBinaryPredOpObjectFromString(EDataType eDataType, String initialValue) {
    return createBinaryPredOpFromString(BxmlPackage.eINSTANCE.getBinaryPredOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryPredOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertBinaryPredOpToString(BxmlPackage.eINSTANCE.getBinaryPredOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinarySubOp createBinarySubOpObjectFromString(EDataType eDataType, String initialValue) {
    return createBinarySubOpFromString(BxmlPackage.eINSTANCE.getBinarySubOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinarySubOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertBinarySubOpToString(BxmlPackage.eINSTANCE.getBinarySubOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonOp createComparisonOpObjectFromString(EDataType eDataType, String initialValue) {
    return createComparisonOpFromString(BxmlPackage.eINSTANCE.getComparisonOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComparisonOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertComparisonOpToString(BxmlPackage.eINSTANCE.getComparisonOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineType createMachineTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createMachineTypeFromString(BxmlPackage.eINSTANCE.getMachineType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMachineTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertMachineTypeToString(BxmlPackage.eINSTANCE.getMachineType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryExpOp createNaryExpOpObjectFromString(EDataType eDataType, String initialValue) {
    return createNaryExpOpFromString(BxmlPackage.eINSTANCE.getNaryExpOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNaryExpOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertNaryExpOpToString(BxmlPackage.eINSTANCE.getNaryExpOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaryOp createNaryOpObjectFromString(EDataType eDataType, String initialValue) {
    return createNaryOpFromString(BxmlPackage.eINSTANCE.getNaryOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNaryOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertNaryOpToString(BxmlPackage.eINSTANCE.getNaryOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpVarSub createOpVarSubObjectFromString(EDataType eDataType, String initialValue) {
    return createOpVarSubFromString(BxmlPackage.eINSTANCE.getOpVarSub(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpVarSubObjectToString(EDataType eDataType, Object instanceValue) {
    return convertOpVarSubToString(BxmlPackage.eINSTANCE.getOpVarSub(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedExpOp createQuantifiedExpOpObjectFromString(EDataType eDataType, String initialValue) {
    return createQuantifiedExpOpFromString(BxmlPackage.eINSTANCE.getQuantifiedExpOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQuantifiedExpOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertQuantifiedExpOpToString(BxmlPackage.eINSTANCE.getQuantifiedExpOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedPredOp createQuantifiedPredOpObjectFromString(EDataType eDataType, String initialValue) {
    return createQuantifiedPredOpFromString(BxmlPackage.eINSTANCE.getQuantifiedPredOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQuantifiedPredOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertQuantifiedPredOpToString(BxmlPackage.eINSTANCE.getQuantifiedPredOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpOp createUnaryExpOpObjectFromString(EDataType eDataType, String initialValue) {
    return createUnaryExpOpFromString(BxmlPackage.eINSTANCE.getUnaryExpOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryExpOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertUnaryExpOpToString(BxmlPackage.eINSTANCE.getUnaryExpOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPredOp createUnaryPredOpObjectFromString(EDataType eDataType, String initialValue) {
    return createUnaryPredOpFromString(BxmlPackage.eINSTANCE.getUnaryPredOp(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryPredOpObjectToString(EDataType eDataType, Object instanceValue) {
    return convertUnaryPredOpToString(BxmlPackage.eINSTANCE.getUnaryPredOp(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BxmlPackage getBxmlPackage() {
    return (BxmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BxmlPackage getPackage() {
    return BxmlPackage.eINSTANCE;
  }

} //BxmlFactoryImpl
