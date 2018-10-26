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
      case BxmlPackage.ASSIGNEMENT_SUB_TYPE: return createAssignementSubType();
      case BxmlPackage.ATTR_TYPE: return createAttrType();
      case BxmlPackage.BECOMES_IN_TYPE: return createBecomesInType();
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE: return createBecomesSuchThatType();
      case BxmlPackage.BINARY_EXP_TYPE2: return createBinaryExpType2();
      case BxmlPackage.BINARY_PRED_TYPE: return createBinaryPredType();
      case BxmlPackage.BLOC_SUB_TYPE: return createBlocSubType();
      case BxmlPackage.BODY_TYPE: return createBodyType();
      case BxmlPackage.BODY_TYPE1: return createBodyType1();
      case BxmlPackage.BODY_TYPE2: return createBodyType2();
      case BxmlPackage.BODY_TYPE3: return createBodyType3();
      case BxmlPackage.BODY_TYPE4: return createBodyType4();
      case BxmlPackage.BODY_TYPE5: return createBodyType5();
      case BxmlPackage.BODY_TYPE6: return createBodyType6();
      case BxmlPackage.BOOLEAN_EXP_TYPE: return createBooleanExpType();
      case BxmlPackage.BOOLEAN_LITERAL_TYPE: return createBooleanLiteralType();
      case BxmlPackage.BYNARY_EXP_TYPE: return createBynaryExpType();
      case BxmlPackage.CASE_SUB_TYPE: return createCaseSubType();
      case BxmlPackage.CHOICES_TYPE: return createChoicesType();
      case BxmlPackage.CHOICE_TYPE: return createChoiceType();
      case BxmlPackage.CHOICE_TYPE1: return createChoiceType1();
      case BxmlPackage.CONCRETE_CONSTANTS_TYPE: return createConcreteConstantsType();
      case BxmlPackage.CONCRETE_VARIABLES_TYPE: return createConcreteVariablesType();
      case BxmlPackage.CONDITION_TYPE: return createConditionType();
      case BxmlPackage.CONSTRAINTS_TYPE: return createConstraintsType();
      case BxmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case BxmlPackage.ELSE_TYPE: return createElseType();
      case BxmlPackage.ELSE_TYPE1: return createElseType1();
      case BxmlPackage.ELSE_TYPE2: return createElseType2();
      case BxmlPackage.EMPTY_SEQ_TYPE: return createEmptySeqType();
      case BxmlPackage.EMPTY_SET_TYPE: return createEmptySetType();
      case BxmlPackage.ENUMERATED_VALUES_TYPE: return createEnumeratedValuesType();
      case BxmlPackage.EXP_COMPARISON_TYPE: return createExpComparisonType();
      case BxmlPackage.EXTENDS_TYPE: return createExtendsType();
      case BxmlPackage.GUARD_TYPE: return createGuardType();
      case BxmlPackage.IDENTIFIER: return createIdentifier();
      case BxmlPackage.ID_TYPE: return createIdType();
      case BxmlPackage.IF_SUB_TYPE: return createIfSubType();
      case BxmlPackage.IMPORTS_TYPE: return createImportsType();
      case BxmlPackage.INCLUDES_TYPE: return createIncludesType();
      case BxmlPackage.INITIALISATION_TYPE: return createInitialisationType();
      case BxmlPackage.INPUT_PARAMETERS_TYPE: return createInputParametersType();
      case BxmlPackage.INPUT_PARAMETERS_TYPE1: return createInputParametersType1();
      case BxmlPackage.INTEGER_LITERAL_TYPE: return createIntegerLiteralType();
      case BxmlPackage.INVARIANT_TYPE: return createInvariantType();
      case BxmlPackage.LET_SUB_TYPE: return createLETSubType();
      case BxmlPackage.LOCAL_OPERATIONS_TYPE: return createLocalOperationsType();
      case BxmlPackage.MACHINE_TYPE: return createMachineType();
      case BxmlPackage.NAME_TYPE: return createNameType();
      case BxmlPackage.NARY_EXP_TYPE: return createNaryExpType();
      case BxmlPackage.NARY_PRED_TYPE: return createNaryPredType();
      case BxmlPackage.NARY_SUB_TYPE: return createNarySubType();
      case BxmlPackage.OPERATION_CALL_TYPE: return createOperationCallType();
      case BxmlPackage.OPERATIONS_TYPE: return createOperationsType();
      case BxmlPackage.OPERATION_TYPE: return createOperationType();
      case BxmlPackage.OUTPUT_PARAMETERS_TYPE: return createOutputParametersType();
      case BxmlPackage.OUTPUT_PARAMETERS_TYPE1: return createOutputParametersType1();
      case BxmlPackage.PARAMETERS_TYPE: return createParametersType();
      case BxmlPackage.PARAMETERS_TYPE1: return createParametersType1();
      case BxmlPackage.PRECONDITION_TYPE: return createPreconditionType();
      case BxmlPackage.PRED_TYPE: return createPredType();
      case BxmlPackage.PROMOTED_OPERATION_TYPE: return createPromotedOperationType();
      case BxmlPackage.PROMOTES_TYPE: return createPromotesType();
      case BxmlPackage.PROPERTIES_TYPE: return createPropertiesType();
      case BxmlPackage.QUANTIFIED_EXP_TYPE: return createQuantifiedExpType();
      case BxmlPackage.QUANTIFIED_PRED_TYPE: return createQuantifiedPredType();
      case BxmlPackage.QUANTIFIED_SET_TYPE: return createQuantifiedSetType();
      case BxmlPackage.RECORD_ITEM_TYPE: return createRecordItemType();
      case BxmlPackage.RECORD_TYPE: return createRecordType();
      case BxmlPackage.REFERENCED_MACHINE_TYPE: return createReferencedMachineType();
      case BxmlPackage.REFINES_TYPE: return createRefinesType();
      case BxmlPackage.SEES_TYPE: return createSeesType();
      case BxmlPackage.SELECT_TYPE: return createSelectType();
      case BxmlPackage.SETS_TYPE: return createSetsType();
      case BxmlPackage.SET_TYPE: return createSetType();
      case BxmlPackage.SET_TYPE1: return createSetType1();
      case BxmlPackage.SKIP_TYPE: return createSkipType();
      case BxmlPackage.STRING_LITERAL_TYPE: return createSTRINGLiteralType();
      case BxmlPackage.STRUCT_TYPE: return createStructType();
      case BxmlPackage.THEN_TYPE: return createThenType();
      case BxmlPackage.TYPE_INFO: return createTypeInfo();
      case BxmlPackage.TYPE_INFOS_TYPE: return createTypeInfosType();
      case BxmlPackage.UNARY_EXP_TYPE: return createUnaryExpType();
      case BxmlPackage.UNARY_EXP_TYPE2: return createUnaryExpType2();
      case BxmlPackage.UNARY_PRED_TYPE: return createUnaryPredType();
      case BxmlPackage.USES_TYPE: return createUsesType();
      case BxmlPackage.VALUATION_TYPE: return createValuationType();
      case BxmlPackage.VALUATION_TYPE1: return createValuationType1();
      case BxmlPackage.VALUES_TYPE: return createValuesType();
      case BxmlPackage.VALUES_TYPE1: return createValuesType1();
      case BxmlPackage.VALUES_TYPE2: return createValuesType2();
      case BxmlPackage.VALUE_TYPE: return createValueType();
      case BxmlPackage.VARIABLES_TYPE: return createVariablesType();
      case BxmlPackage.VARIABLES_TYPE1: return createVariablesType1();
      case BxmlPackage.VARIANT_TYPE: return createVariantType();
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
      case BxmlPackage.ELSEIF_TYPE:
        return createElseifTypeFromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE:
        return createOpTypeFromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE1:
        return createOpType1FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE2:
        return createOpType2FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE3:
        return createOpType3FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE4:
        return createOpType4FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE5:
        return createOpType5FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE6:
        return createOpType6FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE7:
        return createOpType7FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE8:
        return createOpType8FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE9:
        return createOpType9FromString(eDataType, initialValue);
      case BxmlPackage.TYPE_TYPE:
        return createTypeTypeFromString(eDataType, initialValue);
      case BxmlPackage.TYPE_TYPE1:
        return createTypeType1FromString(eDataType, initialValue);
      case BxmlPackage.TYPE_TYPE2:
        return createTypeType2FromString(eDataType, initialValue);
      case BxmlPackage.VALUE_TYPE1:
        return createValueType1FromString(eDataType, initialValue);
      case BxmlPackage.ELSEIF_TYPE_OBJECT:
        return createElseifTypeObjectFromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT:
        return createOpTypeObjectFromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT1:
        return createOpTypeObject1FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT2:
        return createOpTypeObject2FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT3:
        return createOpTypeObject3FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT4:
        return createOpTypeObject4FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT5:
        return createOpTypeObject5FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT6:
        return createOpTypeObject6FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT7:
        return createOpTypeObject7FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT8:
        return createOpTypeObject8FromString(eDataType, initialValue);
      case BxmlPackage.OP_TYPE_OBJECT9:
        return createOpTypeObject9FromString(eDataType, initialValue);
      case BxmlPackage.TYPE_TYPE_OBJECT:
        return createTypeTypeObjectFromString(eDataType, initialValue);
      case BxmlPackage.TYPE_TYPE_OBJECT1:
        return createTypeTypeObject1FromString(eDataType, initialValue);
      case BxmlPackage.TYPE_TYPE_OBJECT2:
        return createTypeTypeObject2FromString(eDataType, initialValue);
      case BxmlPackage.VALUE_TYPE_OBJECT:
        return createValueTypeObjectFromString(eDataType, initialValue);
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
      case BxmlPackage.ELSEIF_TYPE:
        return convertElseifTypeToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE:
        return convertOpTypeToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE1:
        return convertOpType1ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE2:
        return convertOpType2ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE3:
        return convertOpType3ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE4:
        return convertOpType4ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE5:
        return convertOpType5ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE6:
        return convertOpType6ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE7:
        return convertOpType7ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE8:
        return convertOpType8ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE9:
        return convertOpType9ToString(eDataType, instanceValue);
      case BxmlPackage.TYPE_TYPE:
        return convertTypeTypeToString(eDataType, instanceValue);
      case BxmlPackage.TYPE_TYPE1:
        return convertTypeType1ToString(eDataType, instanceValue);
      case BxmlPackage.TYPE_TYPE2:
        return convertTypeType2ToString(eDataType, instanceValue);
      case BxmlPackage.VALUE_TYPE1:
        return convertValueType1ToString(eDataType, instanceValue);
      case BxmlPackage.ELSEIF_TYPE_OBJECT:
        return convertElseifTypeObjectToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT:
        return convertOpTypeObjectToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT1:
        return convertOpTypeObject1ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT2:
        return convertOpTypeObject2ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT3:
        return convertOpTypeObject3ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT4:
        return convertOpTypeObject4ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT5:
        return convertOpTypeObject5ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT6:
        return convertOpTypeObject6ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT7:
        return convertOpTypeObject7ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT8:
        return convertOpTypeObject8ToString(eDataType, instanceValue);
      case BxmlPackage.OP_TYPE_OBJECT9:
        return convertOpTypeObject9ToString(eDataType, instanceValue);
      case BxmlPackage.TYPE_TYPE_OBJECT:
        return convertTypeTypeObjectToString(eDataType, instanceValue);
      case BxmlPackage.TYPE_TYPE_OBJECT1:
        return convertTypeTypeObject1ToString(eDataType, instanceValue);
      case BxmlPackage.TYPE_TYPE_OBJECT2:
        return convertTypeTypeObject2ToString(eDataType, instanceValue);
      case BxmlPackage.VALUE_TYPE_OBJECT:
        return convertValueTypeObjectToString(eDataType, instanceValue);
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
  public AssignementSubType createAssignementSubType() {
    AssignementSubTypeImpl assignementSubType = new AssignementSubTypeImpl();
    return assignementSubType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrType createAttrType() {
    AttrTypeImpl attrType = new AttrTypeImpl();
    return attrType;
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
  public BinaryExpType2 createBinaryExpType2() {
    BinaryExpType2Impl binaryExpType2 = new BinaryExpType2Impl();
    return binaryExpType2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryPredType createBinaryPredType() {
    BinaryPredTypeImpl binaryPredType = new BinaryPredTypeImpl();
    return binaryPredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlocSubType createBlocSubType() {
    BlocSubTypeImpl blocSubType = new BlocSubTypeImpl();
    return blocSubType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType createBodyType() {
    BodyTypeImpl bodyType = new BodyTypeImpl();
    return bodyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType1 createBodyType1() {
    BodyType1Impl bodyType1 = new BodyType1Impl();
    return bodyType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType2 createBodyType2() {
    BodyType2Impl bodyType2 = new BodyType2Impl();
    return bodyType2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType3 createBodyType3() {
    BodyType3Impl bodyType3 = new BodyType3Impl();
    return bodyType3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType4 createBodyType4() {
    BodyType4Impl bodyType4 = new BodyType4Impl();
    return bodyType4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType5 createBodyType5() {
    BodyType5Impl bodyType5 = new BodyType5Impl();
    return bodyType5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyType6 createBodyType6() {
    BodyType6Impl bodyType6 = new BodyType6Impl();
    return bodyType6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpType createBooleanExpType() {
    BooleanExpTypeImpl booleanExpType = new BooleanExpTypeImpl();
    return booleanExpType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteralType createBooleanLiteralType() {
    BooleanLiteralTypeImpl booleanLiteralType = new BooleanLiteralTypeImpl();
    return booleanLiteralType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BynaryExpType createBynaryExpType() {
    BynaryExpTypeImpl bynaryExpType = new BynaryExpTypeImpl();
    return bynaryExpType;
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
  public ChoiceType1 createChoiceType1() {
    ChoiceType1Impl choiceType1 = new ChoiceType1Impl();
    return choiceType1;
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
  public ConditionType createConditionType() {
    ConditionTypeImpl conditionType = new ConditionTypeImpl();
    return conditionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintsType createConstraintsType() {
    ConstraintsTypeImpl constraintsType = new ConstraintsTypeImpl();
    return constraintsType;
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
  public ElseType createElseType() {
    ElseTypeImpl elseType = new ElseTypeImpl();
    return elseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseType1 createElseType1() {
    ElseType1Impl elseType1 = new ElseType1Impl();
    return elseType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseType2 createElseType2() {
    ElseType2Impl elseType2 = new ElseType2Impl();
    return elseType2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptySeqType createEmptySeqType() {
    EmptySeqTypeImpl emptySeqType = new EmptySeqTypeImpl();
    return emptySeqType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptySetType createEmptySetType() {
    EmptySetTypeImpl emptySetType = new EmptySetTypeImpl();
    return emptySetType;
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
  public ExtendsType createExtendsType() {
    ExtendsTypeImpl extendsType = new ExtendsTypeImpl();
    return extendsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardType createGuardType() {
    GuardTypeImpl guardType = new GuardTypeImpl();
    return guardType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier createIdentifier() {
    IdentifierImpl identifier = new IdentifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdType createIdType() {
    IdTypeImpl idType = new IdTypeImpl();
    return idType;
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
  public ImportsType createImportsType() {
    ImportsTypeImpl importsType = new ImportsTypeImpl();
    return importsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludesType createIncludesType() {
    IncludesTypeImpl includesType = new IncludesTypeImpl();
    return includesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialisationType createInitialisationType() {
    InitialisationTypeImpl initialisationType = new InitialisationTypeImpl();
    return initialisationType;
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
  public InputParametersType1 createInputParametersType1() {
    InputParametersType1Impl inputParametersType1 = new InputParametersType1Impl();
    return inputParametersType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteralType createIntegerLiteralType() {
    IntegerLiteralTypeImpl integerLiteralType = new IntegerLiteralTypeImpl();
    return integerLiteralType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvariantType createInvariantType() {
    InvariantTypeImpl invariantType = new InvariantTypeImpl();
    return invariantType;
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
  public LocalOperationsType createLocalOperationsType() {
    LocalOperationsTypeImpl localOperationsType = new LocalOperationsTypeImpl();
    return localOperationsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineType createMachineType() {
    MachineTypeImpl machineType = new MachineTypeImpl();
    return machineType;
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
  public NaryPredType createNaryPredType() {
    NaryPredTypeImpl naryPredType = new NaryPredTypeImpl();
    return naryPredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NarySubType createNarySubType() {
    NarySubTypeImpl narySubType = new NarySubTypeImpl();
    return narySubType;
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
  public OutputParametersType1 createOutputParametersType1() {
    OutputParametersType1Impl outputParametersType1 = new OutputParametersType1Impl();
    return outputParametersType1;
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
  public PreconditionType createPreconditionType() {
    PreconditionTypeImpl preconditionType = new PreconditionTypeImpl();
    return preconditionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredType createPredType() {
    PredTypeImpl predType = new PredTypeImpl();
    return predType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PromotedOperationType createPromotedOperationType() {
    PromotedOperationTypeImpl promotedOperationType = new PromotedOperationTypeImpl();
    return promotedOperationType;
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
  public PropertiesType createPropertiesType() {
    PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
    return propertiesType;
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
  public SetType1 createSetType1() {
    SetType1Impl setType1 = new SetType1Impl();
    return setType1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SkipType createSkipType() {
    SkipTypeImpl skipType = new SkipTypeImpl();
    return skipType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRINGLiteralType createSTRINGLiteralType() {
    STRINGLiteralTypeImpl stringLiteralType = new STRINGLiteralTypeImpl();
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
  public ThenType createThenType() {
    ThenTypeImpl thenType = new ThenTypeImpl();
    return thenType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInfo createTypeInfo() {
    TypeInfoImpl typeInfo = new TypeInfoImpl();
    return typeInfo;
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
  public UnaryExpType createUnaryExpType() {
    UnaryExpTypeImpl unaryExpType = new UnaryExpTypeImpl();
    return unaryExpType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpType2 createUnaryExpType2() {
    UnaryExpType2Impl unaryExpType2 = new UnaryExpType2Impl();
    return unaryExpType2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryPredType createUnaryPredType() {
    UnaryPredTypeImpl unaryPredType = new UnaryPredTypeImpl();
    return unaryPredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsesType createUsesType() {
    UsesTypeImpl usesType = new UsesTypeImpl();
    return usesType;
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
  public ValueType createValueType() {
    ValueTypeImpl valueType = new ValueTypeImpl();
    return valueType;
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
  public VariantType createVariantType() {
    VariantTypeImpl variantType = new VariantTypeImpl();
    return variantType;
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
  public ElseifType createElseifTypeFromString(EDataType eDataType, String initialValue) {
    ElseifType result = ElseifType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertElseifTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType createOpTypeFromString(EDataType eDataType, String initialValue) {
    OpType result = OpType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType1 createOpType1FromString(EDataType eDataType, String initialValue) {
    OpType1 result = OpType1.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpType1ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType2 createOpType2FromString(EDataType eDataType, String initialValue) {
    OpType2 result = OpType2.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpType2ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType3 createOpType3FromString(EDataType eDataType, String initialValue) {
    OpType3 result = OpType3.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpType3ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType4 createOpType4FromString(EDataType eDataType, String initialValue) {
    OpType4 result = OpType4.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpType4ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType5 createOpType5FromString(EDataType eDataType, String initialValue) {
    OpType5 result = OpType5.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpType5ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType6 createOpType6FromString(EDataType eDataType, String initialValue) {
    OpType6 result = OpType6.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpType6ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType7 createOpType7FromString(EDataType eDataType, String initialValue) {
    OpType7 result = OpType7.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpType7ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType8 createOpType8FromString(EDataType eDataType, String initialValue) {
    OpType8 result = OpType8.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpType8ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType9 createOpType9FromString(EDataType eDataType, String initialValue) {
    OpType9 result = OpType9.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpType9ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
    TypeType result = TypeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
    TypeType1 result = TypeType1.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType2 createTypeType2FromString(EDataType eDataType, String initialValue) {
    TypeType2 result = TypeType2.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeType2ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType1 createValueType1FromString(EDataType eDataType, String initialValue) {
    ValueType1 result = ValueType1.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValueType1ToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseifType createElseifTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createElseifTypeFromString(BxmlPackage.eINSTANCE.getElseifType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertElseifTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertElseifTypeToString(BxmlPackage.eINSTANCE.getElseifType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType1 createOpTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createOpType1FromString(BxmlPackage.eINSTANCE.getOpType1(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertOpType1ToString(BxmlPackage.eINSTANCE.getOpType1(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType8 createOpTypeObject1FromString(EDataType eDataType, String initialValue) {
    return createOpType8FromString(BxmlPackage.eINSTANCE.getOpType8(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObject1ToString(EDataType eDataType, Object instanceValue) {
    return convertOpType8ToString(BxmlPackage.eINSTANCE.getOpType8(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType5 createOpTypeObject2FromString(EDataType eDataType, String initialValue) {
    return createOpType5FromString(BxmlPackage.eINSTANCE.getOpType5(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObject2ToString(EDataType eDataType, Object instanceValue) {
    return convertOpType5ToString(BxmlPackage.eINSTANCE.getOpType5(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType4 createOpTypeObject3FromString(EDataType eDataType, String initialValue) {
    return createOpType4FromString(BxmlPackage.eINSTANCE.getOpType4(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObject3ToString(EDataType eDataType, Object instanceValue) {
    return convertOpType4ToString(BxmlPackage.eINSTANCE.getOpType4(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType3 createOpTypeObject4FromString(EDataType eDataType, String initialValue) {
    return createOpType3FromString(BxmlPackage.eINSTANCE.getOpType3(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObject4ToString(EDataType eDataType, Object instanceValue) {
    return convertOpType3ToString(BxmlPackage.eINSTANCE.getOpType3(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType createOpTypeObject5FromString(EDataType eDataType, String initialValue) {
    return createOpTypeFromString(BxmlPackage.eINSTANCE.getOpType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObject5ToString(EDataType eDataType, Object instanceValue) {
    return convertOpTypeToString(BxmlPackage.eINSTANCE.getOpType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType7 createOpTypeObject6FromString(EDataType eDataType, String initialValue) {
    return createOpType7FromString(BxmlPackage.eINSTANCE.getOpType7(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObject6ToString(EDataType eDataType, Object instanceValue) {
    return convertOpType7ToString(BxmlPackage.eINSTANCE.getOpType7(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType6 createOpTypeObject7FromString(EDataType eDataType, String initialValue) {
    return createOpType6FromString(BxmlPackage.eINSTANCE.getOpType6(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObject7ToString(EDataType eDataType, Object instanceValue) {
    return convertOpType6ToString(BxmlPackage.eINSTANCE.getOpType6(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType2 createOpTypeObject8FromString(EDataType eDataType, String initialValue) {
    return createOpType2FromString(BxmlPackage.eINSTANCE.getOpType2(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObject8ToString(EDataType eDataType, Object instanceValue) {
    return convertOpType2ToString(BxmlPackage.eINSTANCE.getOpType2(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpType9 createOpTypeObject9FromString(EDataType eDataType, String initialValue) {
    return createOpType9FromString(BxmlPackage.eINSTANCE.getOpType9(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpTypeObject9ToString(EDataType eDataType, Object instanceValue) {
    return convertOpType9ToString(BxmlPackage.eINSTANCE.getOpType9(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createTypeTypeFromString(BxmlPackage.eINSTANCE.getTypeType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertTypeTypeToString(BxmlPackage.eINSTANCE.getTypeType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType1 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
    return createTypeType1FromString(BxmlPackage.eINSTANCE.getTypeType1(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
    return convertTypeType1ToString(BxmlPackage.eINSTANCE.getTypeType1(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType2 createTypeTypeObject2FromString(EDataType eDataType, String initialValue) {
    return createTypeType2FromString(BxmlPackage.eINSTANCE.getTypeType2(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
    return convertTypeType2ToString(BxmlPackage.eINSTANCE.getTypeType2(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType1 createValueTypeObjectFromString(EDataType eDataType, String initialValue) {
    return createValueType1FromString(BxmlPackage.eINSTANCE.getValueType1(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return convertValueType1ToString(BxmlPackage.eINSTANCE.getValueType1(), instanceValue);
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
