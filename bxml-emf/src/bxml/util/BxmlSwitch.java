/**
 */
package bxml.util;

import bxml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bxml.BxmlPackage
 * @generated
 */
public class BxmlSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BxmlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BxmlSwitch() {
    if (modelPackage == null) {
      modelPackage = BxmlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case BxmlPackage.ABSTRACT_CONSTANTS_TYPE: {
        AbstractConstantsType abstractConstantsType = (AbstractConstantsType)theEObject;
        T result = caseAbstractConstantsType(abstractConstantsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ABSTRACTION_TYPE: {
        AbstractionType abstractionType = (AbstractionType)theEObject;
        T result = caseAbstractionType(abstractionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ABSTRACT_VARIABLES_TYPE: {
        AbstractVariablesType abstractVariablesType = (AbstractVariablesType)theEObject;
        T result = caseAbstractVariablesType(abstractVariablesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ANY_SUB_TYPE: {
        ANYSubType anySubType = (ANYSubType)theEObject;
        T result = caseANYSubType(anySubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ASSERTIONS_TYPE: {
        AssertionsType assertionsType = (AssertionsType)theEObject;
        T result = caseAssertionsType(assertionsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ASSERT_SUB_TYPE: {
        AssertSubType assertSubType = (AssertSubType)theEObject;
        T result = caseAssertSubType(assertSubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ASSIGNEMENT_SUB_TYPE: {
        AssignementSubType assignementSubType = (AssignementSubType)theEObject;
        T result = caseAssignementSubType(assignementSubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ATTR_TYPE: {
        AttrType attrType = (AttrType)theEObject;
        T result = caseAttrType(attrType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BECOMES_IN_TYPE: {
        BecomesInType becomesInType = (BecomesInType)theEObject;
        T result = caseBecomesInType(becomesInType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BECOMES_SUCH_THAT_TYPE: {
        BecomesSuchThatType becomesSuchThatType = (BecomesSuchThatType)theEObject;
        T result = caseBecomesSuchThatType(becomesSuchThatType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BINARY_EXP_TYPE2: {
        BinaryExpType2 binaryExpType2 = (BinaryExpType2)theEObject;
        T result = caseBinaryExpType2(binaryExpType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BINARY_PRED_TYPE: {
        BinaryPredType binaryPredType = (BinaryPredType)theEObject;
        T result = caseBinaryPredType(binaryPredType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BLOC_SUB_TYPE: {
        BlocSubType blocSubType = (BlocSubType)theEObject;
        T result = caseBlocSubType(blocSubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BODY_TYPE: {
        BodyType bodyType = (BodyType)theEObject;
        T result = caseBodyType(bodyType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BODY_TYPE1: {
        BodyType1 bodyType1 = (BodyType1)theEObject;
        T result = caseBodyType1(bodyType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BODY_TYPE2: {
        BodyType2 bodyType2 = (BodyType2)theEObject;
        T result = caseBodyType2(bodyType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BODY_TYPE3: {
        BodyType3 bodyType3 = (BodyType3)theEObject;
        T result = caseBodyType3(bodyType3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BODY_TYPE4: {
        BodyType4 bodyType4 = (BodyType4)theEObject;
        T result = caseBodyType4(bodyType4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BODY_TYPE5: {
        BodyType5 bodyType5 = (BodyType5)theEObject;
        T result = caseBodyType5(bodyType5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BODY_TYPE6: {
        BodyType6 bodyType6 = (BodyType6)theEObject;
        T result = caseBodyType6(bodyType6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BOOLEAN_EXP_TYPE: {
        BooleanExpType booleanExpType = (BooleanExpType)theEObject;
        T result = caseBooleanExpType(booleanExpType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BOOLEAN_LITERAL_TYPE: {
        BooleanLiteralType booleanLiteralType = (BooleanLiteralType)theEObject;
        T result = caseBooleanLiteralType(booleanLiteralType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BYNARY_EXP_TYPE: {
        BynaryExpType bynaryExpType = (BynaryExpType)theEObject;
        T result = caseBynaryExpType(bynaryExpType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.CASE_SUB_TYPE: {
        CaseSubType caseSubType = (CaseSubType)theEObject;
        T result = caseCaseSubType(caseSubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.CHOICES_TYPE: {
        ChoicesType choicesType = (ChoicesType)theEObject;
        T result = caseChoicesType(choicesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.CHOICE_TYPE: {
        ChoiceType choiceType = (ChoiceType)theEObject;
        T result = caseChoiceType(choiceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.CHOICE_TYPE1: {
        ChoiceType1 choiceType1 = (ChoiceType1)theEObject;
        T result = caseChoiceType1(choiceType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.CONCRETE_CONSTANTS_TYPE: {
        ConcreteConstantsType concreteConstantsType = (ConcreteConstantsType)theEObject;
        T result = caseConcreteConstantsType(concreteConstantsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.CONCRETE_VARIABLES_TYPE: {
        ConcreteVariablesType concreteVariablesType = (ConcreteVariablesType)theEObject;
        T result = caseConcreteVariablesType(concreteVariablesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.CONDITION_TYPE: {
        ConditionType conditionType = (ConditionType)theEObject;
        T result = caseConditionType(conditionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.CONSTRAINTS_TYPE: {
        ConstraintsType constraintsType = (ConstraintsType)theEObject;
        T result = caseConstraintsType(constraintsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.DOCUMENT_ROOT: {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ELSE_TYPE: {
        ElseType elseType = (ElseType)theEObject;
        T result = caseElseType(elseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ELSE_TYPE1: {
        ElseType1 elseType1 = (ElseType1)theEObject;
        T result = caseElseType1(elseType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ELSE_TYPE2: {
        ElseType2 elseType2 = (ElseType2)theEObject;
        T result = caseElseType2(elseType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.EMPTY_SEQ_TYPE: {
        EmptySeqType emptySeqType = (EmptySeqType)theEObject;
        T result = caseEmptySeqType(emptySeqType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.EMPTY_SET_TYPE: {
        EmptySetType emptySetType = (EmptySetType)theEObject;
        T result = caseEmptySetType(emptySetType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ENUMERATED_VALUES_TYPE: {
        EnumeratedValuesType enumeratedValuesType = (EnumeratedValuesType)theEObject;
        T result = caseEnumeratedValuesType(enumeratedValuesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.EXP_COMPARISON_TYPE: {
        ExpComparisonType expComparisonType = (ExpComparisonType)theEObject;
        T result = caseExpComparisonType(expComparisonType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.EXTENDS_TYPE: {
        ExtendsType extendsType = (ExtendsType)theEObject;
        T result = caseExtendsType(extendsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.GUARD_TYPE: {
        GuardType guardType = (GuardType)theEObject;
        T result = caseGuardType(guardType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.IDENTIFIER: {
        Identifier identifier = (Identifier)theEObject;
        T result = caseIdentifier(identifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ID_TYPE: {
        IdType idType = (IdType)theEObject;
        T result = caseIdType(idType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.IF_SUB_TYPE: {
        IfSubType ifSubType = (IfSubType)theEObject;
        T result = caseIfSubType(ifSubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.IMPORTS_TYPE: {
        ImportsType importsType = (ImportsType)theEObject;
        T result = caseImportsType(importsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.INCLUDES_TYPE: {
        IncludesType includesType = (IncludesType)theEObject;
        T result = caseIncludesType(includesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.INITIALISATION_TYPE: {
        InitialisationType initialisationType = (InitialisationType)theEObject;
        T result = caseInitialisationType(initialisationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.INPUT_PARAMETERS_TYPE: {
        InputParametersType inputParametersType = (InputParametersType)theEObject;
        T result = caseInputParametersType(inputParametersType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.INPUT_PARAMETERS_TYPE1: {
        InputParametersType1 inputParametersType1 = (InputParametersType1)theEObject;
        T result = caseInputParametersType1(inputParametersType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.INTEGER_LITERAL_TYPE: {
        IntegerLiteralType integerLiteralType = (IntegerLiteralType)theEObject;
        T result = caseIntegerLiteralType(integerLiteralType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.INVARIANT_TYPE: {
        InvariantType invariantType = (InvariantType)theEObject;
        T result = caseInvariantType(invariantType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.LET_SUB_TYPE: {
        LETSubType letSubType = (LETSubType)theEObject;
        T result = caseLETSubType(letSubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.LOCAL_OPERATIONS_TYPE: {
        LocalOperationsType localOperationsType = (LocalOperationsType)theEObject;
        T result = caseLocalOperationsType(localOperationsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.MACHINE_TYPE: {
        MachineType machineType = (MachineType)theEObject;
        T result = caseMachineType(machineType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.NAME_TYPE: {
        NameType nameType = (NameType)theEObject;
        T result = caseNameType(nameType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.NARY_EXP_TYPE: {
        NaryExpType naryExpType = (NaryExpType)theEObject;
        T result = caseNaryExpType(naryExpType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.NARY_PRED_TYPE: {
        NaryPredType naryPredType = (NaryPredType)theEObject;
        T result = caseNaryPredType(naryPredType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.NARY_SUB_TYPE: {
        NarySubType narySubType = (NarySubType)theEObject;
        T result = caseNarySubType(narySubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.OPERATION_CALL_TYPE: {
        OperationCallType operationCallType = (OperationCallType)theEObject;
        T result = caseOperationCallType(operationCallType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.OPERATIONS_TYPE: {
        OperationsType operationsType = (OperationsType)theEObject;
        T result = caseOperationsType(operationsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.OPERATION_TYPE: {
        OperationType operationType = (OperationType)theEObject;
        T result = caseOperationType(operationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.OUTPUT_PARAMETERS_TYPE: {
        OutputParametersType outputParametersType = (OutputParametersType)theEObject;
        T result = caseOutputParametersType(outputParametersType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.OUTPUT_PARAMETERS_TYPE1: {
        OutputParametersType1 outputParametersType1 = (OutputParametersType1)theEObject;
        T result = caseOutputParametersType1(outputParametersType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.PARAMETERS_TYPE: {
        ParametersType parametersType = (ParametersType)theEObject;
        T result = caseParametersType(parametersType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.PARAMETERS_TYPE1: {
        ParametersType1 parametersType1 = (ParametersType1)theEObject;
        T result = caseParametersType1(parametersType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.PRECONDITION_TYPE: {
        PreconditionType preconditionType = (PreconditionType)theEObject;
        T result = casePreconditionType(preconditionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.PRED_TYPE: {
        PredType predType = (PredType)theEObject;
        T result = casePredType(predType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.PROMOTED_OPERATION_TYPE: {
        PromotedOperationType promotedOperationType = (PromotedOperationType)theEObject;
        T result = casePromotedOperationType(promotedOperationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.PROMOTES_TYPE: {
        PromotesType promotesType = (PromotesType)theEObject;
        T result = casePromotesType(promotesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.PROPERTIES_TYPE: {
        PropertiesType propertiesType = (PropertiesType)theEObject;
        T result = casePropertiesType(propertiesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.QUANTIFIED_EXP_TYPE: {
        QuantifiedExpType quantifiedExpType = (QuantifiedExpType)theEObject;
        T result = caseQuantifiedExpType(quantifiedExpType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.QUANTIFIED_PRED_TYPE: {
        QuantifiedPredType quantifiedPredType = (QuantifiedPredType)theEObject;
        T result = caseQuantifiedPredType(quantifiedPredType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.QUANTIFIED_SET_TYPE: {
        QuantifiedSetType quantifiedSetType = (QuantifiedSetType)theEObject;
        T result = caseQuantifiedSetType(quantifiedSetType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.RECORD_ITEM_TYPE: {
        RecordItemType recordItemType = (RecordItemType)theEObject;
        T result = caseRecordItemType(recordItemType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.RECORD_TYPE: {
        RecordType recordType = (RecordType)theEObject;
        T result = caseRecordType(recordType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.REFERENCED_MACHINE_TYPE: {
        ReferencedMachineType referencedMachineType = (ReferencedMachineType)theEObject;
        T result = caseReferencedMachineType(referencedMachineType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.REFINES_TYPE: {
        RefinesType refinesType = (RefinesType)theEObject;
        T result = caseRefinesType(refinesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.SEES_TYPE: {
        SeesType seesType = (SeesType)theEObject;
        T result = caseSeesType(seesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.SELECT_TYPE: {
        SelectType selectType = (SelectType)theEObject;
        T result = caseSelectType(selectType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.SETS_TYPE: {
        SetsType setsType = (SetsType)theEObject;
        T result = caseSetsType(setsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.SET_TYPE: {
        SetType setType = (SetType)theEObject;
        T result = caseSetType(setType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.SET_TYPE1: {
        SetType1 setType1 = (SetType1)theEObject;
        T result = caseSetType1(setType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.SKIP_TYPE: {
        SkipType skipType = (SkipType)theEObject;
        T result = caseSkipType(skipType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.STRING_LITERAL_TYPE: {
        STRINGLiteralType stringLiteralType = (STRINGLiteralType)theEObject;
        T result = caseSTRINGLiteralType(stringLiteralType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.STRUCT_TYPE: {
        StructType structType = (StructType)theEObject;
        T result = caseStructType(structType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.THEN_TYPE: {
        ThenType thenType = (ThenType)theEObject;
        T result = caseThenType(thenType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.TYPE_INFO: {
        TypeInfo typeInfo = (TypeInfo)theEObject;
        T result = caseTypeInfo(typeInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.TYPE_INFOS_TYPE: {
        TypeInfosType typeInfosType = (TypeInfosType)theEObject;
        T result = caseTypeInfosType(typeInfosType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.UNARY_EXP_TYPE: {
        UnaryExpType unaryExpType = (UnaryExpType)theEObject;
        T result = caseUnaryExpType(unaryExpType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.UNARY_EXP_TYPE2: {
        UnaryExpType2 unaryExpType2 = (UnaryExpType2)theEObject;
        T result = caseUnaryExpType2(unaryExpType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.UNARY_PRED_TYPE: {
        UnaryPredType unaryPredType = (UnaryPredType)theEObject;
        T result = caseUnaryPredType(unaryPredType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.USES_TYPE: {
        UsesType usesType = (UsesType)theEObject;
        T result = caseUsesType(usesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VALUATION_TYPE: {
        ValuationType valuationType = (ValuationType)theEObject;
        T result = caseValuationType(valuationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VALUATION_TYPE1: {
        ValuationType1 valuationType1 = (ValuationType1)theEObject;
        T result = caseValuationType1(valuationType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VALUES_TYPE: {
        ValuesType valuesType = (ValuesType)theEObject;
        T result = caseValuesType(valuesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VALUES_TYPE1: {
        ValuesType1 valuesType1 = (ValuesType1)theEObject;
        T result = caseValuesType1(valuesType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VALUES_TYPE2: {
        ValuesType2 valuesType2 = (ValuesType2)theEObject;
        T result = caseValuesType2(valuesType2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VALUE_TYPE: {
        ValueType valueType = (ValueType)theEObject;
        T result = caseValueType(valueType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VARIABLES_TYPE: {
        VariablesType variablesType = (VariablesType)theEObject;
        T result = caseVariablesType(variablesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VARIABLES_TYPE1: {
        VariablesType1 variablesType1 = (VariablesType1)theEObject;
        T result = caseVariablesType1(variablesType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VARIANT_TYPE: {
        VariantType variantType = (VariantType)theEObject;
        T result = caseVariantType(variantType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.VARIN_TYPE: {
        VARINType varinType = (VARINType)theEObject;
        T result = caseVARINType(varinType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.WHEN_CLAUSES_TYPE: {
        WhenClausesType whenClausesType = (WhenClausesType)theEObject;
        T result = caseWhenClausesType(whenClausesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.WHEN_TYPE: {
        WhenType whenType = (WhenType)theEObject;
        T result = caseWhenType(whenType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.WHILE_TYPE: {
        WhileType whileType = (WhileType)theEObject;
        T result = caseWhileType(whileType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Constants Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Constants Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractConstantsType(AbstractConstantsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstraction Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstraction Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractionType(AbstractionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Variables Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Variables Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractVariablesType(AbstractVariablesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ANY Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ANY Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseANYSubType(ANYSubType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assertions Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assertions Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertionsType(AssertionsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertSubType(AssertSubType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignement Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignement Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignementSubType(AssignementSubType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttrType(AttrType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Becomes In Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Becomes In Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBecomesInType(BecomesInType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Becomes Such That Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Becomes Such That Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBecomesSuchThatType(BecomesSuchThatType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Exp Type2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Exp Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpType2(BinaryExpType2 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Pred Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Pred Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryPredType(BinaryPredType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bloc Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bloc Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlocSubType(BlocSubType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyType(BodyType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyType1(BodyType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Type2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyType2(BodyType2 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Type3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Type3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyType3(BodyType3 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Type4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Type4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyType4(BodyType4 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Type5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Type5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyType5(BodyType5 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Type6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Type6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyType6(BodyType6 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Exp Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Exp Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpType(BooleanExpType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteralType(BooleanLiteralType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bynary Exp Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bynary Exp Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBynaryExpType(BynaryExpType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseSubType(CaseSubType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choices Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choices Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoicesType(ChoicesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoiceType(ChoiceType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoiceType1(ChoiceType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concrete Constants Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concrete Constants Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcreteConstantsType(ConcreteConstantsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concrete Variables Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concrete Variables Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcreteVariablesType(ConcreteVariablesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionType(ConditionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraintsType(ConstraintsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElseType(ElseType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElseType1(ElseType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Type2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElseType2(ElseType2 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Seq Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Seq Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptySeqType(EmptySeqType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Set Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Set Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptySetType(EmptySetType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumerated Values Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumerated Values Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeratedValuesType(EnumeratedValuesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp Comparison Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp Comparison Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpComparisonType(ExpComparisonType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extends Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extends Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendsType(ExtendsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Guard Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Guard Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGuardType(GuardType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifier(Identifier object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdType(IdType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfSubType(IfSubType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imports Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imports Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportsType(ImportsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Includes Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Includes Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludesType(IncludesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initialisation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initialisation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialisationType(InitialisationType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Parameters Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Parameters Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputParametersType(InputParametersType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Parameters Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Parameters Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputParametersType1(InputParametersType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteralType(IntegerLiteralType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invariant Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invariant Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvariantType(InvariantType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LET Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LET Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLETSubType(LETSubType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Operations Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Operations Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalOperationsType(LocalOperationsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Machine Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Machine Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMachineType(MachineType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameType(NameType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nary Exp Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nary Exp Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNaryExpType(NaryExpType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nary Pred Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nary Pred Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNaryPredType(NaryPredType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nary Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nary Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNarySubType(NarySubType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Call Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Call Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationCallType(OperationCallType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operations Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operations Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationsType(OperationsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationType(OperationType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Parameters Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Parameters Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputParametersType(OutputParametersType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Parameters Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Parameters Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputParametersType1(OutputParametersType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParametersType(ParametersType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameters Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameters Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParametersType1(ParametersType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precondition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precondition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreconditionType(PreconditionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pred Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pred Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredType(PredType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Promoted Operation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Promoted Operation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePromotedOperationType(PromotedOperationType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Promotes Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Promotes Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePromotesType(PromotesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertiesType(PropertiesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Exp Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Exp Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedExpType(QuantifiedExpType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Pred Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Pred Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedPredType(QuantifiedPredType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Set Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Set Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedSetType(QuantifiedSetType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Item Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Item Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordItemType(RecordItemType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordType(RecordType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Machine Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Machine Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedMachineType(ReferencedMachineType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refines Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refines Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefinesType(RefinesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sees Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sees Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeesType(SeesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectType(SelectType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sets Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sets Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetsType(SetsType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetType(SetType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetType1(SetType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Skip Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skip Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSkipType(SkipType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STRING Literal Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STRING Literal Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTRINGLiteralType(STRINGLiteralType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructType(StructType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Then Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Then Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThenType(ThenType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeInfo(TypeInfo object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Infos Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Infos Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeInfosType(TypeInfosType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Exp Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Exp Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpType(UnaryExpType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Exp Type2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Exp Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpType2(UnaryExpType2 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Pred Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Pred Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryPredType(UnaryPredType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uses Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uses Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsesType(UsesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Valuation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Valuation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValuationType(ValuationType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Valuation Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Valuation Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValuationType1(ValuationType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Values Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Values Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValuesType(ValuesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Values Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Values Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValuesType1(ValuesType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Values Type2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Values Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValuesType2(ValuesType2 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueType(ValueType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variables Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variables Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariablesType(VariablesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variables Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variables Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariablesType1(VariablesType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariantType(VariantType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VARIN Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VARIN Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVARINType(VARINType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Clauses Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Clauses Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenClausesType(WhenClausesType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenType(WhenType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileType(WhileType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //BxmlSwitch
