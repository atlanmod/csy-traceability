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
      case BxmlPackage.ASSIGNEMENT_SUBSTITUTION_TYPE: {
        AssignementSubstitutionType assignementSubstitutionType = (AssignementSubstitutionType)theEObject;
        T result = caseAssignementSubstitutionType(assignementSubstitutionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.ATTRIBUTES_TYPE: {
        AttributesType attributesType = (AttributesType)theEObject;
        T result = caseAttributesType(attributesType);
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
      case BxmlPackage.BINARY_EXPRESSION_TYPE: {
        BinaryExpressionType binaryExpressionType = (BinaryExpressionType)theEObject;
        T result = caseBinaryExpressionType(binaryExpressionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BINARY_PREDICATE_TYPE: {
        BinaryPredicateType binaryPredicateType = (BinaryPredicateType)theEObject;
        T result = caseBinaryPredicateType(binaryPredicateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.BINARY_SUB_TYPE: {
        BinarySubType binarySubType = (BinarySubType)theEObject;
        T result = caseBinarySubType(binarySubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.CALL_PARAMATERS_TYPE: {
        CallParamatersType callParamatersType = (CallParamatersType)theEObject;
        T result = caseCallParamatersType(callParamatersType);
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
      case BxmlPackage.DOCUMENT_ROOT: {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
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
      case BxmlPackage.EXP_TYPE: {
        ExpType expType = (ExpType)theEObject;
        T result = caseExpType(expType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.IDENTIFIER_TYPE: {
        IdentifierType identifierType = (IdentifierType)theEObject;
        T result = caseIdentifierType(identifierType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.IF_SUB_TYPE: {
        IfSubType ifSubType = (IfSubType)theEObject;
        T result = caseIfSubType(ifSubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.INFO_TYPE_TYPE: {
        InfoTypeType infoTypeType = (InfoTypeType)theEObject;
        T result = caseInfoTypeType(infoTypeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.INPUT_PARAMETERS_TYPE: {
        InputParametersType inputParametersType = (InputParametersType)theEObject;
        T result = caseInputParametersType(inputParametersType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.LET_SUB_TYPE: {
        LETSubType letSubType = (LETSubType)theEObject;
        T result = caseLETSubType(letSubType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.LITERAL_TYPE: {
        LiteralType literalType = (LiteralType)theEObject;
        T result = caseLiteralType(literalType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.LOCAL_OPERATIONS_TYPE: {
        LocalOperationsType localOperationsType = (LocalOperationsType)theEObject;
        T result = caseLocalOperationsType(localOperationsType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.MACHINE_TYPE1: {
        MachineType1 machineType1 = (MachineType1)theEObject;
        T result = caseMachineType1(machineType1);
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
      case BxmlPackage.NARY_PREDICATE_TYPE: {
        NaryPredicateType naryPredicateType = (NaryPredicateType)theEObject;
        T result = caseNaryPredicateType(naryPredicateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.NARY_SUBSTITUTION_TYPE: {
        NarySubstitutionType narySubstitutionType = (NarySubstitutionType)theEObject;
        T result = caseNarySubstitutionType(narySubstitutionType);
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
      case BxmlPackage.PREDICATE_TYPE: {
        PredicateType predicateType = (PredicateType)theEObject;
        T result = casePredicateType(predicateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.PROMOTES_TYPE: {
        PromotesType promotesType = (PromotesType)theEObject;
        T result = casePromotesType(promotesType);
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
      case BxmlPackage.REFERENCED_MACHINE_TYPE1: {
        ReferencedMachineType1 referencedMachineType1 = (ReferencedMachineType1)theEObject;
        T result = caseReferencedMachineType1(referencedMachineType1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.REFERENCED_MACHINE_TYPE2: {
        ReferencedMachineType2 referencedMachineType2 = (ReferencedMachineType2)theEObject;
        T result = caseReferencedMachineType2(referencedMachineType2);
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
      case BxmlPackage.STRING_LITERAL_TYPE: {
        StringLiteralType stringLiteralType = (StringLiteralType)theEObject;
        T result = caseStringLiteralType(stringLiteralType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.STRUCT_TYPE: {
        StructType structType = (StructType)theEObject;
        T result = caseStructType(structType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.SUBSTITUTION_TYPE: {
        SubstitutionType substitutionType = (SubstitutionType)theEObject;
        T result = caseSubstitutionType(substitutionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.TERMINAL_TYPE: {
        TerminalType terminalType = (TerminalType)theEObject;
        T result = caseTerminalType(terminalType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.TYPE_INFOS_TYPE: {
        TypeInfosType typeInfosType = (TypeInfosType)theEObject;
        T result = caseTypeInfosType(typeInfosType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.UNARY_EXPRESSION_TYPE: {
        UnaryExpressionType unaryExpressionType = (UnaryExpressionType)theEObject;
        T result = caseUnaryExpressionType(unaryExpressionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BxmlPackage.UNARY_PREDICATE_TYPE: {
        UnaryPredicateType unaryPredicateType = (UnaryPredicateType)theEObject;
        T result = caseUnaryPredicateType(unaryPredicateType);
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
   * Returns the result of interpreting the object as an instance of '<em>Assignement Substitution Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignement Substitution Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignementSubstitutionType(AssignementSubstitutionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attributes Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attributes Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributesType(AttributesType object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Binary Expression Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Expression Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryExpressionType(BinaryExpressionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Predicate Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Predicate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryPredicateType(BinaryPredicateType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinarySubType(BinarySubType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Paramaters Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Paramaters Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallParamatersType(CallParamatersType object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Exp Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpType(ExpType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifierType(IdentifierType object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Info Type Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Info Type Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfoTypeType(InfoTypeType object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Literal Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralType(LiteralType object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Machine Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Machine Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMachineType1(MachineType1 object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Nary Predicate Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nary Predicate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNaryPredicateType(NaryPredicateType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nary Substitution Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nary Substitution Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNarySubstitutionType(NarySubstitutionType object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Predicate Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateType(PredicateType object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Referenced Machine Type1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Machine Type1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedMachineType1(ReferencedMachineType1 object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Machine Type2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Machine Type2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedMachineType2(ReferencedMachineType2 object) {
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
   * Returns the result of interpreting the object as an instance of '<em>String Literal Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteralType(StringLiteralType object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Substitution Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substitution Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstitutionType(SubstitutionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalType(TerminalType object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpressionType(UnaryExpressionType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Predicate Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Predicate Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryPredicateType(UnaryPredicateType object) {
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
