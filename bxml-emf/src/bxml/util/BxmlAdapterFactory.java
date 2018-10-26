/**
 */
package bxml.util;

import bxml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bxml.BxmlPackage
 * @generated
 */
public class BxmlAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BxmlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BxmlAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = BxmlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BxmlSwitch<Adapter> modelSwitch =
    new BxmlSwitch<Adapter>() {
      @Override
      public Adapter caseAbstractConstantsType(AbstractConstantsType object) {
        return createAbstractConstantsTypeAdapter();
      }
      @Override
      public Adapter caseAbstractionType(AbstractionType object) {
        return createAbstractionTypeAdapter();
      }
      @Override
      public Adapter caseAbstractVariablesType(AbstractVariablesType object) {
        return createAbstractVariablesTypeAdapter();
      }
      @Override
      public Adapter caseANYSubType(ANYSubType object) {
        return createANYSubTypeAdapter();
      }
      @Override
      public Adapter caseAssertionsType(AssertionsType object) {
        return createAssertionsTypeAdapter();
      }
      @Override
      public Adapter caseAssertSubType(AssertSubType object) {
        return createAssertSubTypeAdapter();
      }
      @Override
      public Adapter caseAssignementSubType(AssignementSubType object) {
        return createAssignementSubTypeAdapter();
      }
      @Override
      public Adapter caseAttrType(AttrType object) {
        return createAttrTypeAdapter();
      }
      @Override
      public Adapter caseBecomesInType(BecomesInType object) {
        return createBecomesInTypeAdapter();
      }
      @Override
      public Adapter caseBecomesSuchThatType(BecomesSuchThatType object) {
        return createBecomesSuchThatTypeAdapter();
      }
      @Override
      public Adapter caseBinaryExpType2(BinaryExpType2 object) {
        return createBinaryExpType2Adapter();
      }
      @Override
      public Adapter caseBinaryPredType(BinaryPredType object) {
        return createBinaryPredTypeAdapter();
      }
      @Override
      public Adapter caseBlocSubType(BlocSubType object) {
        return createBlocSubTypeAdapter();
      }
      @Override
      public Adapter caseBodyType(BodyType object) {
        return createBodyTypeAdapter();
      }
      @Override
      public Adapter caseBodyType1(BodyType1 object) {
        return createBodyType1Adapter();
      }
      @Override
      public Adapter caseBodyType2(BodyType2 object) {
        return createBodyType2Adapter();
      }
      @Override
      public Adapter caseBodyType3(BodyType3 object) {
        return createBodyType3Adapter();
      }
      @Override
      public Adapter caseBodyType4(BodyType4 object) {
        return createBodyType4Adapter();
      }
      @Override
      public Adapter caseBodyType5(BodyType5 object) {
        return createBodyType5Adapter();
      }
      @Override
      public Adapter caseBodyType6(BodyType6 object) {
        return createBodyType6Adapter();
      }
      @Override
      public Adapter caseBooleanExpType(BooleanExpType object) {
        return createBooleanExpTypeAdapter();
      }
      @Override
      public Adapter caseBooleanLiteralType(BooleanLiteralType object) {
        return createBooleanLiteralTypeAdapter();
      }
      @Override
      public Adapter caseBynaryExpType(BynaryExpType object) {
        return createBynaryExpTypeAdapter();
      }
      @Override
      public Adapter caseCaseSubType(CaseSubType object) {
        return createCaseSubTypeAdapter();
      }
      @Override
      public Adapter caseChoicesType(ChoicesType object) {
        return createChoicesTypeAdapter();
      }
      @Override
      public Adapter caseChoiceType(ChoiceType object) {
        return createChoiceTypeAdapter();
      }
      @Override
      public Adapter caseChoiceType1(ChoiceType1 object) {
        return createChoiceType1Adapter();
      }
      @Override
      public Adapter caseConcreteConstantsType(ConcreteConstantsType object) {
        return createConcreteConstantsTypeAdapter();
      }
      @Override
      public Adapter caseConcreteVariablesType(ConcreteVariablesType object) {
        return createConcreteVariablesTypeAdapter();
      }
      @Override
      public Adapter caseConditionType(ConditionType object) {
        return createConditionTypeAdapter();
      }
      @Override
      public Adapter caseConstraintsType(ConstraintsType object) {
        return createConstraintsTypeAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object) {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseElseType(ElseType object) {
        return createElseTypeAdapter();
      }
      @Override
      public Adapter caseElseType1(ElseType1 object) {
        return createElseType1Adapter();
      }
      @Override
      public Adapter caseElseType2(ElseType2 object) {
        return createElseType2Adapter();
      }
      @Override
      public Adapter caseEmptySeqType(EmptySeqType object) {
        return createEmptySeqTypeAdapter();
      }
      @Override
      public Adapter caseEmptySetType(EmptySetType object) {
        return createEmptySetTypeAdapter();
      }
      @Override
      public Adapter caseEnumeratedValuesType(EnumeratedValuesType object) {
        return createEnumeratedValuesTypeAdapter();
      }
      @Override
      public Adapter caseExpComparisonType(ExpComparisonType object) {
        return createExpComparisonTypeAdapter();
      }
      @Override
      public Adapter caseExtendsType(ExtendsType object) {
        return createExtendsTypeAdapter();
      }
      @Override
      public Adapter caseGuardType(GuardType object) {
        return createGuardTypeAdapter();
      }
      @Override
      public Adapter caseIdentifier(Identifier object) {
        return createIdentifierAdapter();
      }
      @Override
      public Adapter caseIdType(IdType object) {
        return createIdTypeAdapter();
      }
      @Override
      public Adapter caseIfSubType(IfSubType object) {
        return createIfSubTypeAdapter();
      }
      @Override
      public Adapter caseImportsType(ImportsType object) {
        return createImportsTypeAdapter();
      }
      @Override
      public Adapter caseIncludesType(IncludesType object) {
        return createIncludesTypeAdapter();
      }
      @Override
      public Adapter caseInitialisationType(InitialisationType object) {
        return createInitialisationTypeAdapter();
      }
      @Override
      public Adapter caseInputParametersType(InputParametersType object) {
        return createInputParametersTypeAdapter();
      }
      @Override
      public Adapter caseInputParametersType1(InputParametersType1 object) {
        return createInputParametersType1Adapter();
      }
      @Override
      public Adapter caseIntegerLiteralType(IntegerLiteralType object) {
        return createIntegerLiteralTypeAdapter();
      }
      @Override
      public Adapter caseInvariantType(InvariantType object) {
        return createInvariantTypeAdapter();
      }
      @Override
      public Adapter caseLETSubType(LETSubType object) {
        return createLETSubTypeAdapter();
      }
      @Override
      public Adapter caseLocalOperationsType(LocalOperationsType object) {
        return createLocalOperationsTypeAdapter();
      }
      @Override
      public Adapter caseMachineType(MachineType object) {
        return createMachineTypeAdapter();
      }
      @Override
      public Adapter caseNameType(NameType object) {
        return createNameTypeAdapter();
      }
      @Override
      public Adapter caseNaryExpType(NaryExpType object) {
        return createNaryExpTypeAdapter();
      }
      @Override
      public Adapter caseNaryPredType(NaryPredType object) {
        return createNaryPredTypeAdapter();
      }
      @Override
      public Adapter caseNarySubType(NarySubType object) {
        return createNarySubTypeAdapter();
      }
      @Override
      public Adapter caseOperationCallType(OperationCallType object) {
        return createOperationCallTypeAdapter();
      }
      @Override
      public Adapter caseOperationsType(OperationsType object) {
        return createOperationsTypeAdapter();
      }
      @Override
      public Adapter caseOperationType(OperationType object) {
        return createOperationTypeAdapter();
      }
      @Override
      public Adapter caseOutputParametersType(OutputParametersType object) {
        return createOutputParametersTypeAdapter();
      }
      @Override
      public Adapter caseOutputParametersType1(OutputParametersType1 object) {
        return createOutputParametersType1Adapter();
      }
      @Override
      public Adapter caseParametersType(ParametersType object) {
        return createParametersTypeAdapter();
      }
      @Override
      public Adapter caseParametersType1(ParametersType1 object) {
        return createParametersType1Adapter();
      }
      @Override
      public Adapter casePreconditionType(PreconditionType object) {
        return createPreconditionTypeAdapter();
      }
      @Override
      public Adapter casePredType(PredType object) {
        return createPredTypeAdapter();
      }
      @Override
      public Adapter casePromotedOperationType(PromotedOperationType object) {
        return createPromotedOperationTypeAdapter();
      }
      @Override
      public Adapter casePromotesType(PromotesType object) {
        return createPromotesTypeAdapter();
      }
      @Override
      public Adapter casePropertiesType(PropertiesType object) {
        return createPropertiesTypeAdapter();
      }
      @Override
      public Adapter caseQuantifiedExpType(QuantifiedExpType object) {
        return createQuantifiedExpTypeAdapter();
      }
      @Override
      public Adapter caseQuantifiedPredType(QuantifiedPredType object) {
        return createQuantifiedPredTypeAdapter();
      }
      @Override
      public Adapter caseQuantifiedSetType(QuantifiedSetType object) {
        return createQuantifiedSetTypeAdapter();
      }
      @Override
      public Adapter caseRecordItemType(RecordItemType object) {
        return createRecordItemTypeAdapter();
      }
      @Override
      public Adapter caseRecordType(RecordType object) {
        return createRecordTypeAdapter();
      }
      @Override
      public Adapter caseReferencedMachineType(ReferencedMachineType object) {
        return createReferencedMachineTypeAdapter();
      }
      @Override
      public Adapter caseRefinesType(RefinesType object) {
        return createRefinesTypeAdapter();
      }
      @Override
      public Adapter caseSeesType(SeesType object) {
        return createSeesTypeAdapter();
      }
      @Override
      public Adapter caseSelectType(SelectType object) {
        return createSelectTypeAdapter();
      }
      @Override
      public Adapter caseSetsType(SetsType object) {
        return createSetsTypeAdapter();
      }
      @Override
      public Adapter caseSetType(SetType object) {
        return createSetTypeAdapter();
      }
      @Override
      public Adapter caseSetType1(SetType1 object) {
        return createSetType1Adapter();
      }
      @Override
      public Adapter caseSkipType(SkipType object) {
        return createSkipTypeAdapter();
      }
      @Override
      public Adapter caseSTRINGLiteralType(STRINGLiteralType object) {
        return createSTRINGLiteralTypeAdapter();
      }
      @Override
      public Adapter caseStructType(StructType object) {
        return createStructTypeAdapter();
      }
      @Override
      public Adapter caseThenType(ThenType object) {
        return createThenTypeAdapter();
      }
      @Override
      public Adapter caseTypeInfo(TypeInfo object) {
        return createTypeInfoAdapter();
      }
      @Override
      public Adapter caseTypeInfosType(TypeInfosType object) {
        return createTypeInfosTypeAdapter();
      }
      @Override
      public Adapter caseUnaryExpType(UnaryExpType object) {
        return createUnaryExpTypeAdapter();
      }
      @Override
      public Adapter caseUnaryExpType2(UnaryExpType2 object) {
        return createUnaryExpType2Adapter();
      }
      @Override
      public Adapter caseUnaryPredType(UnaryPredType object) {
        return createUnaryPredTypeAdapter();
      }
      @Override
      public Adapter caseUsesType(UsesType object) {
        return createUsesTypeAdapter();
      }
      @Override
      public Adapter caseValuationType(ValuationType object) {
        return createValuationTypeAdapter();
      }
      @Override
      public Adapter caseValuationType1(ValuationType1 object) {
        return createValuationType1Adapter();
      }
      @Override
      public Adapter caseValuesType(ValuesType object) {
        return createValuesTypeAdapter();
      }
      @Override
      public Adapter caseValuesType1(ValuesType1 object) {
        return createValuesType1Adapter();
      }
      @Override
      public Adapter caseValuesType2(ValuesType2 object) {
        return createValuesType2Adapter();
      }
      @Override
      public Adapter caseValueType(ValueType object) {
        return createValueTypeAdapter();
      }
      @Override
      public Adapter caseVariablesType(VariablesType object) {
        return createVariablesTypeAdapter();
      }
      @Override
      public Adapter caseVariablesType1(VariablesType1 object) {
        return createVariablesType1Adapter();
      }
      @Override
      public Adapter caseVariantType(VariantType object) {
        return createVariantTypeAdapter();
      }
      @Override
      public Adapter caseVARINType(VARINType object) {
        return createVARINTypeAdapter();
      }
      @Override
      public Adapter caseWhenClausesType(WhenClausesType object) {
        return createWhenClausesTypeAdapter();
      }
      @Override
      public Adapter caseWhenType(WhenType object) {
        return createWhenTypeAdapter();
      }
      @Override
      public Adapter caseWhileType(WhileType object) {
        return createWhileTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link bxml.AbstractConstantsType <em>Abstract Constants Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.AbstractConstantsType
   * @generated
   */
  public Adapter createAbstractConstantsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.AbstractionType <em>Abstraction Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.AbstractionType
   * @generated
   */
  public Adapter createAbstractionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.AbstractVariablesType <em>Abstract Variables Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.AbstractVariablesType
   * @generated
   */
  public Adapter createAbstractVariablesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ANYSubType <em>ANY Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ANYSubType
   * @generated
   */
  public Adapter createANYSubTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.AssertionsType <em>Assertions Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.AssertionsType
   * @generated
   */
  public Adapter createAssertionsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.AssertSubType <em>Assert Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.AssertSubType
   * @generated
   */
  public Adapter createAssertSubTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.AssignementSubType <em>Assignement Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.AssignementSubType
   * @generated
   */
  public Adapter createAssignementSubTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.AttrType <em>Attr Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.AttrType
   * @generated
   */
  public Adapter createAttrTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BecomesInType <em>Becomes In Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BecomesInType
   * @generated
   */
  public Adapter createBecomesInTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BecomesSuchThatType <em>Becomes Such That Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BecomesSuchThatType
   * @generated
   */
  public Adapter createBecomesSuchThatTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BinaryExpType2 <em>Binary Exp Type2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BinaryExpType2
   * @generated
   */
  public Adapter createBinaryExpType2Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BinaryPredType <em>Binary Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BinaryPredType
   * @generated
   */
  public Adapter createBinaryPredTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BlocSubType <em>Bloc Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BlocSubType
   * @generated
   */
  public Adapter createBlocSubTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BodyType <em>Body Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BodyType
   * @generated
   */
  public Adapter createBodyTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BodyType1 <em>Body Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BodyType1
   * @generated
   */
  public Adapter createBodyType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BodyType2 <em>Body Type2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BodyType2
   * @generated
   */
  public Adapter createBodyType2Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BodyType3 <em>Body Type3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BodyType3
   * @generated
   */
  public Adapter createBodyType3Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BodyType4 <em>Body Type4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BodyType4
   * @generated
   */
  public Adapter createBodyType4Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BodyType5 <em>Body Type5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BodyType5
   * @generated
   */
  public Adapter createBodyType5Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BodyType6 <em>Body Type6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BodyType6
   * @generated
   */
  public Adapter createBodyType6Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BooleanExpType <em>Boolean Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BooleanExpType
   * @generated
   */
  public Adapter createBooleanExpTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BooleanLiteralType <em>Boolean Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BooleanLiteralType
   * @generated
   */
  public Adapter createBooleanLiteralTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BynaryExpType <em>Bynary Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BynaryExpType
   * @generated
   */
  public Adapter createBynaryExpTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.CaseSubType <em>Case Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.CaseSubType
   * @generated
   */
  public Adapter createCaseSubTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ChoicesType <em>Choices Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ChoicesType
   * @generated
   */
  public Adapter createChoicesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ChoiceType <em>Choice Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ChoiceType
   * @generated
   */
  public Adapter createChoiceTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ChoiceType1 <em>Choice Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ChoiceType1
   * @generated
   */
  public Adapter createChoiceType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ConcreteConstantsType <em>Concrete Constants Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ConcreteConstantsType
   * @generated
   */
  public Adapter createConcreteConstantsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ConcreteVariablesType <em>Concrete Variables Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ConcreteVariablesType
   * @generated
   */
  public Adapter createConcreteVariablesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ConditionType <em>Condition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ConditionType
   * @generated
   */
  public Adapter createConditionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ConstraintsType <em>Constraints Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ConstraintsType
   * @generated
   */
  public Adapter createConstraintsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ElseType <em>Else Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ElseType
   * @generated
   */
  public Adapter createElseTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ElseType1 <em>Else Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ElseType1
   * @generated
   */
  public Adapter createElseType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ElseType2 <em>Else Type2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ElseType2
   * @generated
   */
  public Adapter createElseType2Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.EmptySeqType <em>Empty Seq Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.EmptySeqType
   * @generated
   */
  public Adapter createEmptySeqTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.EmptySetType <em>Empty Set Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.EmptySetType
   * @generated
   */
  public Adapter createEmptySetTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.EnumeratedValuesType <em>Enumerated Values Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.EnumeratedValuesType
   * @generated
   */
  public Adapter createEnumeratedValuesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ExpComparisonType <em>Exp Comparison Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ExpComparisonType
   * @generated
   */
  public Adapter createExpComparisonTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ExtendsType <em>Extends Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ExtendsType
   * @generated
   */
  public Adapter createExtendsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.GuardType <em>Guard Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.GuardType
   * @generated
   */
  public Adapter createGuardTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.Identifier
   * @generated
   */
  public Adapter createIdentifierAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.IdType <em>Id Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.IdType
   * @generated
   */
  public Adapter createIdTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.IfSubType <em>If Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.IfSubType
   * @generated
   */
  public Adapter createIfSubTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ImportsType <em>Imports Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ImportsType
   * @generated
   */
  public Adapter createImportsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.IncludesType <em>Includes Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.IncludesType
   * @generated
   */
  public Adapter createIncludesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.InitialisationType <em>Initialisation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.InitialisationType
   * @generated
   */
  public Adapter createInitialisationTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.InputParametersType <em>Input Parameters Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.InputParametersType
   * @generated
   */
  public Adapter createInputParametersTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.InputParametersType1 <em>Input Parameters Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.InputParametersType1
   * @generated
   */
  public Adapter createInputParametersType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.IntegerLiteralType <em>Integer Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.IntegerLiteralType
   * @generated
   */
  public Adapter createIntegerLiteralTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.InvariantType <em>Invariant Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.InvariantType
   * @generated
   */
  public Adapter createInvariantTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.LETSubType <em>LET Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.LETSubType
   * @generated
   */
  public Adapter createLETSubTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.LocalOperationsType <em>Local Operations Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.LocalOperationsType
   * @generated
   */
  public Adapter createLocalOperationsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.MachineType <em>Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.MachineType
   * @generated
   */
  public Adapter createMachineTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.NameType <em>Name Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.NameType
   * @generated
   */
  public Adapter createNameTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.NaryExpType <em>Nary Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.NaryExpType
   * @generated
   */
  public Adapter createNaryExpTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.NaryPredType <em>Nary Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.NaryPredType
   * @generated
   */
  public Adapter createNaryPredTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.NarySubType <em>Nary Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.NarySubType
   * @generated
   */
  public Adapter createNarySubTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.OperationCallType <em>Operation Call Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.OperationCallType
   * @generated
   */
  public Adapter createOperationCallTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.OperationsType <em>Operations Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.OperationsType
   * @generated
   */
  public Adapter createOperationsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.OperationType <em>Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.OperationType
   * @generated
   */
  public Adapter createOperationTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.OutputParametersType <em>Output Parameters Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.OutputParametersType
   * @generated
   */
  public Adapter createOutputParametersTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.OutputParametersType1 <em>Output Parameters Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.OutputParametersType1
   * @generated
   */
  public Adapter createOutputParametersType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ParametersType <em>Parameters Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ParametersType
   * @generated
   */
  public Adapter createParametersTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ParametersType1 <em>Parameters Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ParametersType1
   * @generated
   */
  public Adapter createParametersType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.PreconditionType <em>Precondition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.PreconditionType
   * @generated
   */
  public Adapter createPreconditionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.PredType <em>Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.PredType
   * @generated
   */
  public Adapter createPredTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.PromotedOperationType <em>Promoted Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.PromotedOperationType
   * @generated
   */
  public Adapter createPromotedOperationTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.PromotesType <em>Promotes Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.PromotesType
   * @generated
   */
  public Adapter createPromotesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.PropertiesType <em>Properties Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.PropertiesType
   * @generated
   */
  public Adapter createPropertiesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.QuantifiedExpType <em>Quantified Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.QuantifiedExpType
   * @generated
   */
  public Adapter createQuantifiedExpTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.QuantifiedPredType <em>Quantified Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.QuantifiedPredType
   * @generated
   */
  public Adapter createQuantifiedPredTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.QuantifiedSetType <em>Quantified Set Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.QuantifiedSetType
   * @generated
   */
  public Adapter createQuantifiedSetTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.RecordItemType <em>Record Item Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.RecordItemType
   * @generated
   */
  public Adapter createRecordItemTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.RecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.RecordType
   * @generated
   */
  public Adapter createRecordTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ReferencedMachineType <em>Referenced Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ReferencedMachineType
   * @generated
   */
  public Adapter createReferencedMachineTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.RefinesType <em>Refines Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.RefinesType
   * @generated
   */
  public Adapter createRefinesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.SeesType <em>Sees Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.SeesType
   * @generated
   */
  public Adapter createSeesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.SelectType <em>Select Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.SelectType
   * @generated
   */
  public Adapter createSelectTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.SetsType <em>Sets Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.SetsType
   * @generated
   */
  public Adapter createSetsTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.SetType <em>Set Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.SetType
   * @generated
   */
  public Adapter createSetTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.SetType1 <em>Set Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.SetType1
   * @generated
   */
  public Adapter createSetType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.SkipType <em>Skip Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.SkipType
   * @generated
   */
  public Adapter createSkipTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.STRINGLiteralType <em>STRING Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.STRINGLiteralType
   * @generated
   */
  public Adapter createSTRINGLiteralTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.StructType <em>Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.StructType
   * @generated
   */
  public Adapter createStructTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ThenType <em>Then Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ThenType
   * @generated
   */
  public Adapter createThenTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.TypeInfo <em>Type Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.TypeInfo
   * @generated
   */
  public Adapter createTypeInfoAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.TypeInfosType <em>Type Infos Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.TypeInfosType
   * @generated
   */
  public Adapter createTypeInfosTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.UnaryExpType <em>Unary Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.UnaryExpType
   * @generated
   */
  public Adapter createUnaryExpTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.UnaryExpType2 <em>Unary Exp Type2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.UnaryExpType2
   * @generated
   */
  public Adapter createUnaryExpType2Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.UnaryPredType <em>Unary Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.UnaryPredType
   * @generated
   */
  public Adapter createUnaryPredTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.UsesType <em>Uses Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.UsesType
   * @generated
   */
  public Adapter createUsesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ValuationType <em>Valuation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ValuationType
   * @generated
   */
  public Adapter createValuationTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ValuationType1 <em>Valuation Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ValuationType1
   * @generated
   */
  public Adapter createValuationType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ValuesType <em>Values Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ValuesType
   * @generated
   */
  public Adapter createValuesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ValuesType1 <em>Values Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ValuesType1
   * @generated
   */
  public Adapter createValuesType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ValuesType2 <em>Values Type2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ValuesType2
   * @generated
   */
  public Adapter createValuesType2Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ValueType
   * @generated
   */
  public Adapter createValueTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.VariablesType <em>Variables Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.VariablesType
   * @generated
   */
  public Adapter createVariablesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.VariablesType1 <em>Variables Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.VariablesType1
   * @generated
   */
  public Adapter createVariablesType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.VariantType <em>Variant Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.VariantType
   * @generated
   */
  public Adapter createVariantTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.VARINType <em>VARIN Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.VARINType
   * @generated
   */
  public Adapter createVARINTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.WhenClausesType <em>When Clauses Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.WhenClausesType
   * @generated
   */
  public Adapter createWhenClausesTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.WhenType <em>When Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.WhenType
   * @generated
   */
  public Adapter createWhenTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.WhileType <em>While Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.WhileType
   * @generated
   */
  public Adapter createWhileTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //BxmlAdapterFactory
