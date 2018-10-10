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
      public Adapter caseAssignementSubstitutionType(AssignementSubstitutionType object) {
        return createAssignementSubstitutionTypeAdapter();
      }
      @Override
      public Adapter caseAttributesType(AttributesType object) {
        return createAttributesTypeAdapter();
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
      public Adapter caseBinaryExpressionType(BinaryExpressionType object) {
        return createBinaryExpressionTypeAdapter();
      }
      @Override
      public Adapter caseBinaryPredicateType(BinaryPredicateType object) {
        return createBinaryPredicateTypeAdapter();
      }
      @Override
      public Adapter caseBinarySubType(BinarySubType object) {
        return createBinarySubTypeAdapter();
      }
      @Override
      public Adapter caseCallParamatersType(CallParamatersType object) {
        return createCallParamatersTypeAdapter();
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
      public Adapter caseConcreteConstantsType(ConcreteConstantsType object) {
        return createConcreteConstantsTypeAdapter();
      }
      @Override
      public Adapter caseConcreteVariablesType(ConcreteVariablesType object) {
        return createConcreteVariablesTypeAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object) {
        return createDocumentRootAdapter();
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
      public Adapter caseExpType(ExpType object) {
        return createExpTypeAdapter();
      }
      @Override
      public Adapter caseIdentifierType(IdentifierType object) {
        return createIdentifierTypeAdapter();
      }
      @Override
      public Adapter caseIfSubType(IfSubType object) {
        return createIfSubTypeAdapter();
      }
      @Override
      public Adapter caseInfoTypeType(InfoTypeType object) {
        return createInfoTypeTypeAdapter();
      }
      @Override
      public Adapter caseInputParametersType(InputParametersType object) {
        return createInputParametersTypeAdapter();
      }
      @Override
      public Adapter caseLETSubType(LETSubType object) {
        return createLETSubTypeAdapter();
      }
      @Override
      public Adapter caseLiteralType(LiteralType object) {
        return createLiteralTypeAdapter();
      }
      @Override
      public Adapter caseLocalOperationsType(LocalOperationsType object) {
        return createLocalOperationsTypeAdapter();
      }
      @Override
      public Adapter caseMachineType1(MachineType1 object) {
        return createMachineType1Adapter();
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
      public Adapter caseNaryPredicateType(NaryPredicateType object) {
        return createNaryPredicateTypeAdapter();
      }
      @Override
      public Adapter caseNarySubstitutionType(NarySubstitutionType object) {
        return createNarySubstitutionTypeAdapter();
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
      public Adapter caseParametersType(ParametersType object) {
        return createParametersTypeAdapter();
      }
      @Override
      public Adapter caseParametersType1(ParametersType1 object) {
        return createParametersType1Adapter();
      }
      @Override
      public Adapter casePredicateType(PredicateType object) {
        return createPredicateTypeAdapter();
      }
      @Override
      public Adapter casePromotesType(PromotesType object) {
        return createPromotesTypeAdapter();
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
      public Adapter caseReferencedMachineType1(ReferencedMachineType1 object) {
        return createReferencedMachineType1Adapter();
      }
      @Override
      public Adapter caseReferencedMachineType2(ReferencedMachineType2 object) {
        return createReferencedMachineType2Adapter();
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
      public Adapter caseStringLiteralType(StringLiteralType object) {
        return createStringLiteralTypeAdapter();
      }
      @Override
      public Adapter caseStructType(StructType object) {
        return createStructTypeAdapter();
      }
      @Override
      public Adapter caseSubstitutionType(SubstitutionType object) {
        return createSubstitutionTypeAdapter();
      }
      @Override
      public Adapter caseTerminalType(TerminalType object) {
        return createTerminalTypeAdapter();
      }
      @Override
      public Adapter caseTypeInfosType(TypeInfosType object) {
        return createTypeInfosTypeAdapter();
      }
      @Override
      public Adapter caseUnaryExpressionType(UnaryExpressionType object) {
        return createUnaryExpressionTypeAdapter();
      }
      @Override
      public Adapter caseUnaryPredicateType(UnaryPredicateType object) {
        return createUnaryPredicateTypeAdapter();
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
      public Adapter caseVariablesType(VariablesType object) {
        return createVariablesTypeAdapter();
      }
      @Override
      public Adapter caseVariablesType1(VariablesType1 object) {
        return createVariablesType1Adapter();
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
   * Creates a new adapter for an object of class '{@link bxml.AssignementSubstitutionType <em>Assignement Substitution Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.AssignementSubstitutionType
   * @generated
   */
  public Adapter createAssignementSubstitutionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.AttributesType <em>Attributes Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.AttributesType
   * @generated
   */
  public Adapter createAttributesTypeAdapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.BinaryExpressionType <em>Binary Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BinaryExpressionType
   * @generated
   */
  public Adapter createBinaryExpressionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BinaryPredicateType <em>Binary Predicate Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BinaryPredicateType
   * @generated
   */
  public Adapter createBinaryPredicateTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.BinarySubType <em>Binary Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.BinarySubType
   * @generated
   */
  public Adapter createBinarySubTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.CallParamatersType <em>Call Paramaters Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.CallParamatersType
   * @generated
   */
  public Adapter createCallParamatersTypeAdapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.ExpType <em>Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ExpType
   * @generated
   */
  public Adapter createExpTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.IdentifierType <em>Identifier Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.IdentifierType
   * @generated
   */
  public Adapter createIdentifierTypeAdapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.InfoTypeType <em>Info Type Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.InfoTypeType
   * @generated
   */
  public Adapter createInfoTypeTypeAdapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.LiteralType <em>Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.LiteralType
   * @generated
   */
  public Adapter createLiteralTypeAdapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.MachineType1 <em>Machine Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.MachineType1
   * @generated
   */
  public Adapter createMachineType1Adapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.NaryPredicateType <em>Nary Predicate Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.NaryPredicateType
   * @generated
   */
  public Adapter createNaryPredicateTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.NarySubstitutionType <em>Nary Substitution Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.NarySubstitutionType
   * @generated
   */
  public Adapter createNarySubstitutionTypeAdapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.PredicateType <em>Predicate Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.PredicateType
   * @generated
   */
  public Adapter createPredicateTypeAdapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.ReferencedMachineType1 <em>Referenced Machine Type1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ReferencedMachineType1
   * @generated
   */
  public Adapter createReferencedMachineType1Adapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.ReferencedMachineType2 <em>Referenced Machine Type2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.ReferencedMachineType2
   * @generated
   */
  public Adapter createReferencedMachineType2Adapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.StringLiteralType <em>String Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.StringLiteralType
   * @generated
   */
  public Adapter createStringLiteralTypeAdapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.SubstitutionType <em>Substitution Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.SubstitutionType
   * @generated
   */
  public Adapter createSubstitutionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.TerminalType <em>Terminal Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.TerminalType
   * @generated
   */
  public Adapter createTerminalTypeAdapter() {
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
   * Creates a new adapter for an object of class '{@link bxml.UnaryExpressionType <em>Unary Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.UnaryExpressionType
   * @generated
   */
  public Adapter createUnaryExpressionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link bxml.UnaryPredicateType <em>Unary Predicate Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see bxml.UnaryPredicateType
   * @generated
   */
  public Adapter createUnaryPredicateTypeAdapter() {
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
