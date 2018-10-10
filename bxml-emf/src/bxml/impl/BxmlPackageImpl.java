/**
 */
package bxml.impl;

import bxml.BxmlFactory;
import bxml.BxmlPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BxmlPackageImpl extends EPackageImpl implements BxmlPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "bxml.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractConstantsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractVariablesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anySubTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertionsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertSubTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignementSubstitutionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass becomesInTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass becomesSuchThatTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryExpressionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryPredicateTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binarySubTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callParamatersTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseSubTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choicesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choiceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concreteConstantsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concreteVariablesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumeratedValuesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expComparisonTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifSubTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infoTypeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputParametersTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass letSubTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localOperationsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass machineType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naryExpTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naryPredicateTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass narySubstitutionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationCallTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputParametersTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parametersTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parametersType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass promotesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedExpTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedPredTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedSetTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordItemTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referencedMachineTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referencedMachineType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referencedMachineType2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refinesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass substitutionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminalTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeInfosTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryPredicateTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuationType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuesType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuesType2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablesType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varinTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenClausesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binaryExpOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binaryPredOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binarySubOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum comparisonOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum machineTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum naryExpOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum naryOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opVarSubEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum quantifiedExpOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum quantifiedPredOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unaryExpOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unaryPredOpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType binaryExpOpObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType binaryPredOpObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType binarySubOpObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType comparisonOpObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType machineTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType naryExpOpObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType naryOpObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opVarSubObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType quantifiedExpOpObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType quantifiedPredOpObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType unaryExpOpObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType unaryPredOpObjectEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see bxml.BxmlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BxmlPackageImpl() {
    super(eNS_URI, BxmlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link BxmlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static BxmlPackage init() {
    if (isInited) return (BxmlPackage)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredBxmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    BxmlPackageImpl theBxmlPackage = registeredBxmlPackage instanceof BxmlPackageImpl ? (BxmlPackageImpl)registeredBxmlPackage : new BxmlPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Load packages
    theBxmlPackage.loadPackage();

    // Fix loaded packages
    theBxmlPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theBxmlPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BxmlPackage.eNS_URI, theBxmlPackage);
    return theBxmlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractConstantsType() {
    if (abstractConstantsTypeEClass == null) {
      abstractConstantsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(0);
    }
    return abstractConstantsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractConstantsType_Attr() {
        return (EReference)getAbstractConstantsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractConstantsType_Id() {
        return (EReference)getAbstractConstantsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractionType() {
    if (abstractionTypeEClass == null) {
      abstractionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(1);
    }
    return abstractionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractionType_Value() {
        return (EAttribute)getAbstractionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractionType_Path() {
        return (EAttribute)getAbstractionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractVariablesType() {
    if (abstractVariablesTypeEClass == null) {
      abstractVariablesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(2);
    }
    return abstractVariablesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractVariablesType_Attr() {
        return (EReference)getAbstractVariablesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractVariablesType_Id() {
        return (EReference)getAbstractVariablesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getANYSubType() {
    if (anySubTypeEClass == null) {
      anySubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(3);
    }
    return anySubTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getANYSubType_Attr() {
        return (EReference)getANYSubType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getANYSubType_Variables() {
        return (EReference)getANYSubType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getANYSubType_Pred() {
        return (EReference)getANYSubType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getANYSubType_Then() {
        return (EReference)getANYSubType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertionsType() {
    if (assertionsTypeEClass == null) {
      assertionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(4);
    }
    return assertionsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssertionsType_Pred() {
        return (EAttribute)getAssertionsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_BinaryPred() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_ExpComparison() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_QuantifiedPred() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_UnaryPred() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_NaryPred() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_Set() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertSubType() {
    if (assertSubTypeEClass == null) {
      assertSubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(5);
    }
    return assertSubTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertSubType_Attr() {
        return (EReference)getAssertSubType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertSubType_Guard() {
        return (EReference)getAssertSubType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertSubType_Body() {
        return (EReference)getAssertSubType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignementSubstitutionType() {
    if (assignementSubstitutionTypeEClass == null) {
      assignementSubstitutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(6);
    }
    return assignementSubstitutionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignementSubstitutionType_Attr() {
        return (EReference)getAssignementSubstitutionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignementSubstitutionType_Variables() {
        return (EReference)getAssignementSubstitutionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignementSubstitutionType_Values() {
        return (EReference)getAssignementSubstitutionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributesType() {
    if (attributesTypeEClass == null) {
      attributesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(7);
    }
    return attributesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributesType_Any() {
        return (EAttribute)getAttributesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBecomesInType() {
    if (becomesInTypeEClass == null) {
      becomesInTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(8);
    }
    return becomesInTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBecomesInType_Attr() {
        return (EReference)getBecomesInType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBecomesInType_Variables() {
        return (EReference)getBecomesInType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBecomesInType_Value() {
        return (EReference)getBecomesInType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBecomesSuchThatType() {
    if (becomesSuchThatTypeEClass == null) {
      becomesSuchThatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(9);
    }
    return becomesSuchThatTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBecomesSuchThatType_Attr() {
        return (EReference)getBecomesSuchThatType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBecomesSuchThatType_Variables() {
        return (EReference)getBecomesSuchThatType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBecomesSuchThatType_Pred() {
        return (EReference)getBecomesSuchThatType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryExpressionType() {
    if (binaryExpressionTypeEClass == null) {
      binaryExpressionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(12);
    }
    return binaryExpressionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_Attr() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_BinaryExp() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_NaryExp() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_BooleanLiteral() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_BooleanExp() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_EmptySet() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_EmptySeq() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_Id() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_IntegerLiteral() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_QuantifiedExp() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_QuantifiedSet() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_STRINGLiteral() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_UnaryExp() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_Struct() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_Record() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_BinaryExp1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_NaryExp1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_BooleanLiteral1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_BooleanExp1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_EmptySet1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_EmptySeq1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_Id1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_IntegerLiteral1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_QuantifiedExp1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_QuantifiedSet1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_STRINGLiteral1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_UnaryExp1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_Struct1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpressionType_Record1() {
        return (EReference)getBinaryExpressionType().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryExpressionType_Op() {
        return (EAttribute)getBinaryExpressionType().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryPredicateType() {
    if (binaryPredicateTypeEClass == null) {
      binaryPredicateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(13);
    }
    return binaryPredicateTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredicateType_Attr() {
        return (EReference)getBinaryPredicateType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryPredicateType_Pred() {
        return (EAttribute)getBinaryPredicateType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredicateType_BinaryPred() {
        return (EReference)getBinaryPredicateType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredicateType_ExpComparison() {
        return (EReference)getBinaryPredicateType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredicateType_QuantifiedPred() {
        return (EReference)getBinaryPredicateType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredicateType_UnaryPred() {
        return (EReference)getBinaryPredicateType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredicateType_NaryPred() {
        return (EReference)getBinaryPredicateType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredicateType_Set() {
        return (EReference)getBinaryPredicateType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryPredicateType_Op() {
        return (EAttribute)getBinaryPredicateType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinarySubType() {
    if (binarySubTypeEClass == null) {
      binarySubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(18);
    }
    return binarySubTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_Attr() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinarySubType_Sub() {
        return (EAttribute)getBinarySubType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_BlocSub() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_Skip() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_AssertSub() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_IfSub() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_BecomesSuchThat() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_AssignementSub() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_Select() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_CaseSub() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_ANYSub() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_LETSub() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_BecomesIn() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_VARIN() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_BinarySub() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_NarySub() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_OperationCall() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySubType_While() {
        return (EReference)getBinarySubType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinarySubType_Op() {
        return (EAttribute)getBinarySubType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallParamatersType() {
    if (callParamatersTypeEClass == null) {
      callParamatersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(19);
    }
    return callParamatersTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCallParamatersType_Exp() {
        return (EAttribute)getCallParamatersType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_BinaryExp() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_NaryExp() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_BooleanLiteral() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_BooleanExp() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_EmptySet() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_EmptySeq() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_Id() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_IntegerLiteral() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_QuantifiedExp() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_QuantifiedSet() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_STRINGLiteral() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_UnaryExp() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_Struct() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallParamatersType_Record() {
        return (EReference)getCallParamatersType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseSubType() {
    if (caseSubTypeEClass == null) {
      caseSubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(20);
    }
    return caseSubTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseSubType_Attr() {
        return (EReference)getCaseSubType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseSubType_Value() {
        return (EReference)getCaseSubType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseSubType_Choices() {
        return (EReference)getCaseSubType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseSubType_Else() {
        return (EReference)getCaseSubType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoicesType() {
    if (choicesTypeEClass == null) {
      choicesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(21);
    }
    return choicesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoicesType_Choice() {
        return (EReference)getChoicesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoiceType() {
    if (choiceTypeEClass == null) {
      choiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(22);
    }
    return choiceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoiceType_Value() {
        return (EReference)getChoiceType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoiceType_Then() {
        return (EReference)getChoiceType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcreteConstantsType() {
    if (concreteConstantsTypeEClass == null) {
      concreteConstantsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(25);
    }
    return concreteConstantsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcreteConstantsType_Attr() {
        return (EReference)getConcreteConstantsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcreteConstantsType_Id() {
        return (EReference)getConcreteConstantsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcreteVariablesType() {
    if (concreteVariablesTypeEClass == null) {
      concreteVariablesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(26);
    }
    return concreteVariablesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcreteVariablesType_Attr() {
        return (EReference)getConcreteVariablesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcreteVariablesType_Id() {
        return (EReference)getConcreteVariablesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot() {
    if (documentRootEClass == null) {
      documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(27);
    }
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ANYSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_BecomesIn() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_BinarySub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CaseSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_LETSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Machine() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_NaryExp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Operation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_QuantifiedExp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_QuantifiedPred() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_QuantifiedSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Record() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Select() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Struct() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_VARIN() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_While() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeratedValuesType() {
    if (enumeratedValuesTypeEClass == null) {
      enumeratedValuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(28);
    }
    return enumeratedValuesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumeratedValuesType_Id() {
        return (EReference)getEnumeratedValuesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpComparisonType() {
    if (expComparisonTypeEClass == null) {
      expComparisonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(29);
    }
    return expComparisonTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_Attr() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_BinaryExp() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_NaryExp() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_BooleanLiteral() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_BooleanExp() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_EmptySet() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_EmptySeq() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_Id() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_IntegerLiteral() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_QuantifiedExp() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_QuantifiedSet() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_STRINGLiteral() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_UnaryExp() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_Struct() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_Record() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_BinaryExp1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_NaryExp1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_BooleanLiteral1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_BooleanExp1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_EmptySet1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_EmptySeq1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_Id1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_IntegerLiteral1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_QuantifiedExp1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_QuantifiedSet1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_STRINGLiteral1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_UnaryExp1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_Struct1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpComparisonType_Record1() {
        return (EReference)getExpComparisonType().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpComparisonType_Op() {
        return (EAttribute)getExpComparisonType().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpType() {
    if (expTypeEClass == null) {
      expTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(30);
    }
    return expTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_Attr() {
        return (EReference)getExpType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_BinaryExp() {
        return (EReference)getExpType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_NaryExp() {
        return (EReference)getExpType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_BooleanLiteral() {
        return (EReference)getExpType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_BooleanExp() {
        return (EReference)getExpType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_EmptySet() {
        return (EReference)getExpType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_EmptySeq() {
        return (EReference)getExpType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_Id() {
        return (EReference)getExpType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_IntegerLiteral() {
        return (EReference)getExpType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_QuantifiedExp() {
        return (EReference)getExpType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_QuantifiedSet() {
        return (EReference)getExpType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_STRINGLiteral() {
        return (EReference)getExpType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_UnaryExp() {
        return (EReference)getExpType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_Struct() {
        return (EReference)getExpType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpType_Record() {
        return (EReference)getExpType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifierType() {
    if (identifierTypeEClass == null) {
      identifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(31);
    }
    return identifierTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentifierType_Attr() {
        return (EReference)getIdentifierType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifierType_Suffix() {
        return (EAttribute)getIdentifierType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifierType_Typref() {
        return (EAttribute)getIdentifierType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifierType_Value() {
        return (EAttribute)getIdentifierType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSubType() {
    if (ifSubTypeEClass == null) {
      ifSubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(32);
    }
    return ifSubTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSubType_Attr() {
        return (EReference)getIfSubType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSubType_Condition() {
        return (EReference)getIfSubType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSubType_Then() {
        return (EReference)getIfSubType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfSubType_Else() {
        return (EReference)getIfSubType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfSubType_Elseif() {
        return (EAttribute)getIfSubType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfoTypeType() {
    if (infoTypeTypeEClass == null) {
      infoTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(33);
    }
    return infoTypeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfoTypeType_Any() {
        return (EAttribute)getInfoTypeType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfoTypeType_Id() {
        return (EAttribute)getInfoTypeType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputParametersType() {
    if (inputParametersTypeEClass == null) {
      inputParametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(34);
    }
    return inputParametersTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType_Id() {
        return (EReference)getInputParametersType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLETSubType() {
    if (letSubTypeEClass == null) {
      letSubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(35);
    }
    return letSubTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLETSubType_Attr() {
        return (EReference)getLETSubType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLETSubType_Variables() {
        return (EReference)getLETSubType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLETSubType_Values() {
        return (EReference)getLETSubType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLETSubType_Then() {
        return (EReference)getLETSubType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralType() {
    if (literalTypeEClass == null) {
      literalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(36);
    }
    return literalTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteralType_Attr() {
        return (EReference)getLiteralType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralType_Typref() {
        return (EAttribute)getLiteralType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralType_Value() {
        return (EAttribute)getLiteralType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalOperationsType() {
    if (localOperationsTypeEClass == null) {
      localOperationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(37);
    }
    return localOperationsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalOperationsType_Operation() {
        return (EReference)getLocalOperationsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMachineType1() {
    if (machineType1EClass == null) {
      machineType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(39);
    }
    return machineType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Abstraction() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Parameters() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Constraints() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Includes() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Imports() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Extends() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Uses() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Sees() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Promotes() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Values() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Sets() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_AbstractConstants() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_ConcreteConstants() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_AbstractVariables() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_ConcreteVariables() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Properties() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Invariant() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Initialisation() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Assertions() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_LocalOperations() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_Operations() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType1_TypeInfos() {
        return (EReference)getMachineType1().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMachineType1_Name() {
        return (EAttribute)getMachineType1().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMachineType1_Type() {
        return (EAttribute)getMachineType1().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameType() {
    if (nameTypeEClass == null) {
      nameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(41);
    }
    return nameTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameType_Id() {
        return (EReference)getNameType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaryExpType() {
    if (naryExpTypeEClass == null) {
      naryExpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(44);
    }
    return naryExpTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaryExpType_Exp() {
        return (EAttribute)getNaryExpType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_BinaryExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_NaryExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_BooleanLiteral() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_BooleanExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_EmptySet() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_EmptySeq() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_Id() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_IntegerLiteral() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_QuantifiedExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_QuantifiedSet() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_STRINGLiteral() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_UnaryExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_Struct() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_Record() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaryExpType_Op() {
        return (EAttribute)getNaryExpType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaryPredicateType() {
    if (naryPredicateTypeEClass == null) {
      naryPredicateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(47);
    }
    return naryPredicateTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaryPredicateType_Pred() {
        return (EAttribute)getNaryPredicateType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredicateType_BinaryPred() {
        return (EReference)getNaryPredicateType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredicateType_ExpComparison() {
        return (EReference)getNaryPredicateType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredicateType_QuantifiedPred() {
        return (EReference)getNaryPredicateType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredicateType_UnaryPred() {
        return (EReference)getNaryPredicateType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredicateType_NaryPred() {
        return (EReference)getNaryPredicateType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredicateType_Set() {
        return (EReference)getNaryPredicateType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaryPredicateType_Op() {
        return (EAttribute)getNaryPredicateType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNarySubstitutionType() {
    if (narySubstitutionTypeEClass == null) {
      narySubstitutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(48);
    }
    return narySubstitutionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_Attr() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNarySubstitutionType_Sub() {
        return (EAttribute)getNarySubstitutionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_BlocSub() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_Skip() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_AssertSub() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_IfSub() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_BecomesSuchThat() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_AssignementSub() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_Select() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_CaseSub() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_ANYSub() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_LETSub() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_BecomesIn() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_VARIN() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_BinarySub() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_NarySub() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_OperationCall() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubstitutionType_While() {
        return (EReference)getNarySubstitutionType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNarySubstitutionType_Op() {
        return (EAttribute)getNarySubstitutionType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationCallType() {
    if (operationCallTypeEClass == null) {
      operationCallTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(49);
    }
    return operationCallTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCallType_Attr() {
        return (EReference)getOperationCallType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCallType_Name() {
        return (EReference)getOperationCallType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCallType_InputParameters() {
        return (EReference)getOperationCallType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCallType_OutputParameters() {
        return (EReference)getOperationCallType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCallType_Operation() {
        return (EReference)getOperationCallType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationsType() {
    if (operationsTypeEClass == null) {
      operationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(50);
    }
    return operationsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationsType_Operation() {
        return (EReference)getOperationsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationType() {
    if (operationTypeEClass == null) {
      operationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(51);
    }
    return operationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationType_Attr() {
        return (EReference)getOperationType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationType_Refines() {
        return (EReference)getOperationType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationType_OutputParameters() {
        return (EReference)getOperationType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationType_InputParameters() {
        return (EReference)getOperationType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationType_Precondition() {
        return (EReference)getOperationType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationType_Body() {
        return (EReference)getOperationType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationType_Name() {
        return (EAttribute)getOperationType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputParametersType() {
    if (outputParametersTypeEClass == null) {
      outputParametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(54);
    }
    return outputParametersTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType_Id() {
        return (EReference)getOutputParametersType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParametersType() {
    if (parametersTypeEClass == null) {
      parametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(55);
    }
    return parametersTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParametersType_Exp() {
        return (EAttribute)getParametersType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_BinaryExp() {
        return (EReference)getParametersType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_NaryExp() {
        return (EReference)getParametersType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_BooleanLiteral() {
        return (EReference)getParametersType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_BooleanExp() {
        return (EReference)getParametersType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_EmptySet() {
        return (EReference)getParametersType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_EmptySeq() {
        return (EReference)getParametersType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_Id() {
        return (EReference)getParametersType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_IntegerLiteral() {
        return (EReference)getParametersType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_QuantifiedExp() {
        return (EReference)getParametersType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_QuantifiedSet() {
        return (EReference)getParametersType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_STRINGLiteral() {
        return (EReference)getParametersType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_UnaryExp() {
        return (EReference)getParametersType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_Struct() {
        return (EReference)getParametersType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_Record() {
        return (EReference)getParametersType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParametersType1() {
    if (parametersType1EClass == null) {
      parametersType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(56);
    }
    return parametersType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_Attr() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_Id() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateType() {
    if (predicateTypeEClass == null) {
      predicateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(57);
    }
    return predicateTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateType_Attr() {
        return (EReference)getPredicateType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateType_BinaryPred() {
        return (EReference)getPredicateType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateType_ExpComparison() {
        return (EReference)getPredicateType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateType_QuantifiedPred() {
        return (EReference)getPredicateType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateType_UnaryPred() {
        return (EReference)getPredicateType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateType_NaryPred() {
        return (EReference)getPredicateType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredicateType_Set() {
        return (EReference)getPredicateType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPromotesType() {
    if (promotesTypeEClass == null) {
      promotesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(58);
    }
    return promotesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPromotesType_PromotedOperation() {
        return (EAttribute)getPromotesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedExpType() {
    if (quantifiedExpTypeEClass == null) {
      quantifiedExpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(61);
    }
    return quantifiedExpTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedExpType_Attr() {
        return (EReference)getQuantifiedExpType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedExpType_Variables() {
        return (EReference)getQuantifiedExpType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedExpType_Pred() {
        return (EReference)getQuantifiedExpType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedExpType_Body() {
        return (EReference)getQuantifiedExpType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantifiedExpType_Type() {
        return (EAttribute)getQuantifiedExpType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedPredType() {
    if (quantifiedPredTypeEClass == null) {
      quantifiedPredTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(64);
    }
    return quantifiedPredTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedPredType_Attr() {
        return (EReference)getQuantifiedPredType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedPredType_Variables() {
        return (EReference)getQuantifiedPredType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedPredType_Body() {
        return (EReference)getQuantifiedPredType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuantifiedPredType_Type() {
        return (EAttribute)getQuantifiedPredType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedSetType() {
    if (quantifiedSetTypeEClass == null) {
      quantifiedSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(65);
    }
    return quantifiedSetTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedSetType_Attr() {
        return (EReference)getQuantifiedSetType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedSetType_Variables() {
        return (EReference)getQuantifiedSetType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedSetType_Body() {
        return (EReference)getQuantifiedSetType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordItemType() {
    if (recordItemTypeEClass == null) {
      recordItemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(66);
    }
    return recordItemTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_BinaryExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_NaryExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_BooleanLiteral() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_BooleanExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_EmptySet() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_EmptySeq() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_Id() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_IntegerLiteral() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_QuantifiedExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_QuantifiedSet() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_STRINGLiteral() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_UnaryExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_Struct() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_Record() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecordItemType_Label() {
        return (EAttribute)getRecordItemType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordType() {
    if (recordTypeEClass == null) {
      recordTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(67);
    }
    return recordTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordType_Attr() {
        return (EReference)getRecordType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordType_RecordItem() {
        return (EReference)getRecordType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferencedMachineType() {
    if (referencedMachineTypeEClass == null) {
      referencedMachineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(68);
    }
    return referencedMachineTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferencedMachineType_Name() {
        return (EAttribute)getReferencedMachineType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferencedMachineType_Instance() {
        return (EAttribute)getReferencedMachineType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferencedMachineType_Parameters() {
        return (EReference)getReferencedMachineType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferencedMachineType_Path() {
        return (EAttribute)getReferencedMachineType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferencedMachineType1() {
    if (referencedMachineType1EClass == null) {
      referencedMachineType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(69);
    }
    return referencedMachineType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferencedMachineType1_Attr() {
        return (EReference)getReferencedMachineType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferencedMachineType1_Name() {
        return (EAttribute)getReferencedMachineType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferencedMachineType1_Rename() {
        return (EAttribute)getReferencedMachineType1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferencedMachineType1_Path() {
        return (EAttribute)getReferencedMachineType1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferencedMachineType2() {
    if (referencedMachineType2EClass == null) {
      referencedMachineType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(70);
    }
    return referencedMachineType2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferencedMachineType2_ReferencedMachine() {
        return (EReference)getReferencedMachineType2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefinesType() {
    if (refinesTypeEClass == null) {
      refinesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(71);
    }
    return refinesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefinesType_Attr() {
        return (EReference)getRefinesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefinesType_Id() {
        return (EReference)getRefinesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeesType() {
    if (seesTypeEClass == null) {
      seesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(72);
    }
    return seesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSeesType_Attr() {
        return (EReference)getSeesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSeesType_ReferencedMachine() {
        return (EReference)getSeesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectType() {
    if (selectTypeEClass == null) {
      selectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(73);
    }
    return selectTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectType_Attr() {
        return (EReference)getSelectType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectType_WhenClauses() {
        return (EReference)getSelectType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectType_Else() {
        return (EReference)getSelectType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetsType() {
    if (setsTypeEClass == null) {
      setsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(74);
    }
    return setsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetsType_Attr() {
        return (EReference)getSetsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetsType_Set() {
        return (EReference)getSetsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetType() {
    if (setTypeEClass == null) {
      setTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(75);
    }
    return setTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetType_Attr() {
        return (EReference)getSetType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetType_Id() {
        return (EReference)getSetType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetType_EnumeratedValues() {
        return (EReference)getSetType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteralType() {
    if (stringLiteralTypeEClass == null) {
      stringLiteralTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(76);
    }
    return stringLiteralTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringLiteralType_Attr() {
        return (EReference)getStringLiteralType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteralType_Typref() {
        return (EAttribute)getStringLiteralType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteralType_Value() {
        return (EAttribute)getStringLiteralType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructType() {
    if (structTypeEClass == null) {
      structTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(77);
    }
    return structTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructType_Attr() {
        return (EReference)getStructType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructType_RecordItem() {
        return (EReference)getStructType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubstitutionType() {
    if (substitutionTypeEClass == null) {
      substitutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(78);
    }
    return substitutionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_Attr() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_BlocSub() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_Skip() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_AssertSub() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_IfSub() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_BecomesSuchThat() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_AssignementSub() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_Select() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_CaseSub() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_ANYSub() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_LETSub() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_BecomesIn() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_VARIN() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_BinarySub() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_NarySub() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_OperationCall() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitutionType_While() {
        return (EReference)getSubstitutionType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminalType() {
    if (terminalTypeEClass == null) {
      terminalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(79);
    }
    return terminalTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalType_Attr() {
        return (EReference)getTerminalType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeInfosType() {
    if (typeInfosTypeEClass == null) {
      typeInfosTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(80);
    }
    return typeInfosTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeInfosType_Type() {
        return (EReference)getTypeInfosType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpressionType() {
    if (unaryExpressionTypeEClass == null) {
      unaryExpressionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(83);
    }
    return unaryExpressionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_Attr() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_BinaryExp() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_NaryExp() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_BooleanLiteral() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_BooleanExp() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_EmptySet() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_EmptySeq() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_Id() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_IntegerLiteral() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_QuantifiedExp() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_QuantifiedSet() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_STRINGLiteral() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_UnaryExp() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_Struct() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpressionType_Record() {
        return (EReference)getUnaryExpressionType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpressionType_Op() {
        return (EAttribute)getUnaryExpressionType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryPredicateType() {
    if (unaryPredicateTypeEClass == null) {
      unaryPredicateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(84);
    }
    return unaryPredicateTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredicateType_BinaryPred() {
        return (EReference)getUnaryPredicateType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredicateType_ExpComparison() {
        return (EReference)getUnaryPredicateType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredicateType_QuantifiedPred() {
        return (EReference)getUnaryPredicateType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredicateType_UnaryPred() {
        return (EReference)getUnaryPredicateType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredicateType_NaryPred() {
        return (EReference)getUnaryPredicateType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredicateType_Set() {
        return (EReference)getUnaryPredicateType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryPredicateType_Op() {
        return (EAttribute)getUnaryPredicateType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuationType() {
    if (valuationTypeEClass == null) {
      valuationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(87);
    }
    return valuationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_BinaryExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_NaryExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_BooleanLiteral() {
        return (EReference)getValuationType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_BooleanExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_EmptySet() {
        return (EReference)getValuationType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_EmptySeq() {
        return (EReference)getValuationType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_Id() {
        return (EReference)getValuationType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_IntegerLiteral() {
        return (EReference)getValuationType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_QuantifiedExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_QuantifiedSet() {
        return (EReference)getValuationType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_STRINGLiteral() {
        return (EReference)getValuationType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_UnaryExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_Struct() {
        return (EReference)getValuationType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_Record() {
        return (EReference)getValuationType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuationType_Ident() {
        return (EAttribute)getValuationType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuationType1() {
    if (valuationType1EClass == null) {
      valuationType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(88);
    }
    return valuationType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_BinaryExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_NaryExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_BooleanLiteral() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_BooleanExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_EmptySet() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_EmptySeq() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_Id() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_IntegerLiteral() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_QuantifiedExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_QuantifiedSet() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_STRINGLiteral() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_UnaryExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_Struct() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_Record() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuationType1_Ident() {
        return (EAttribute)getValuationType1().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuesType() {
    if (valuesTypeEClass == null) {
      valuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(89);
    }
    return valuesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType_Valuation() {
        return (EReference)getValuesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuesType1() {
    if (valuesType1EClass == null) {
      valuesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(90);
    }
    return valuesType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType1_Valuation() {
        return (EReference)getValuesType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuesType2() {
    if (valuesType2EClass == null) {
      valuesType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(91);
    }
    return valuesType2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuesType2_Exp() {
        return (EAttribute)getValuesType2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_BinaryExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_NaryExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_BooleanLiteral() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_BooleanExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_EmptySet() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_EmptySeq() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_Id() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_IntegerLiteral() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_QuantifiedExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_QuantifiedSet() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_STRINGLiteral() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_UnaryExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_Struct() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_Record() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariablesType() {
    if (variablesTypeEClass == null) {
      variablesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(92);
    }
    return variablesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariablesType_Exp() {
        return (EAttribute)getVariablesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_BinaryExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_NaryExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_BooleanLiteral() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_BooleanExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_EmptySet() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_EmptySeq() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_Id() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_IntegerLiteral() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_QuantifiedExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_QuantifiedSet() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_STRINGLiteral() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_UnaryExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_Struct() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_Record() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariablesType1() {
    if (variablesType1EClass == null) {
      variablesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(93);
    }
    return variablesType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType1_Attr() {
        return (EReference)getVariablesType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType1_Id() {
        return (EReference)getVariablesType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVARINType() {
    if (varinTypeEClass == null) {
      varinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(94);
    }
    return varinTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVARINType_Attr() {
        return (EReference)getVARINType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVARINType_Variables() {
        return (EReference)getVARINType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVARINType_Body() {
        return (EReference)getVARINType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVARINType_Op() {
        return (EAttribute)getVARINType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenClausesType() {
    if (whenClausesTypeEClass == null) {
      whenClausesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(95);
    }
    return whenClausesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenClausesType_When() {
        return (EReference)getWhenClausesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenType() {
    if (whenTypeEClass == null) {
      whenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(96);
    }
    return whenTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenType_Condition() {
        return (EReference)getWhenType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenType_Then() {
        return (EReference)getWhenType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileType() {
    if (whileTypeEClass == null) {
      whileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(97);
    }
    return whileTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileType_Attr() {
        return (EReference)getWhileType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileType_Condition() {
        return (EReference)getWhileType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileType_Body() {
        return (EReference)getWhileType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileType_Invariant() {
        return (EReference)getWhileType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileType_Variant() {
        return (EReference)getWhileType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBinaryExpOp() {
    if (binaryExpOpEEnum == null) {
      binaryExpOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(10);
    }
    return binaryExpOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBinaryPredOp() {
    if (binaryPredOpEEnum == null) {
      binaryPredOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(14);
    }
    return binaryPredOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBinarySubOp() {
    if (binarySubOpEEnum == null) {
      binarySubOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(16);
    }
    return binarySubOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getComparisonOp() {
    if (comparisonOpEEnum == null) {
      comparisonOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(23);
    }
    return comparisonOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMachineType() {
    if (machineTypeEEnum == null) {
      machineTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(38);
    }
    return machineTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNaryExpOp() {
    if (naryExpOpEEnum == null) {
      naryExpOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(42);
    }
    return naryExpOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNaryOp() {
    if (naryOpEEnum == null) {
      naryOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(45);
    }
    return naryOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpVarSub() {
    if (opVarSubEEnum == null) {
      opVarSubEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(52);
    }
    return opVarSubEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getQuantifiedExpOp() {
    if (quantifiedExpOpEEnum == null) {
      quantifiedExpOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(59);
    }
    return quantifiedExpOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getQuantifiedPredOp() {
    if (quantifiedPredOpEEnum == null) {
      quantifiedPredOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(62);
    }
    return quantifiedPredOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnaryExpOp() {
    if (unaryExpOpEEnum == null) {
      unaryExpOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(81);
    }
    return unaryExpOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnaryPredOp() {
    if (unaryPredOpEEnum == null) {
      unaryPredOpEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(85);
    }
    return unaryPredOpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getBinaryExpOpObject() {
    if (binaryExpOpObjectEDataType == null) {
      binaryExpOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(11);
    }
    return binaryExpOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getBinaryPredOpObject() {
    if (binaryPredOpObjectEDataType == null) {
      binaryPredOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(15);
    }
    return binaryPredOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getBinarySubOpObject() {
    if (binarySubOpObjectEDataType == null) {
      binarySubOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(17);
    }
    return binarySubOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getComparisonOpObject() {
    if (comparisonOpObjectEDataType == null) {
      comparisonOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(24);
    }
    return comparisonOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getMachineTypeObject() {
    if (machineTypeObjectEDataType == null) {
      machineTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(40);
    }
    return machineTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getNaryExpOpObject() {
    if (naryExpOpObjectEDataType == null) {
      naryExpOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(43);
    }
    return naryExpOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getNaryOpObject() {
    if (naryOpObjectEDataType == null) {
      naryOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(46);
    }
    return naryOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpVarSubObject() {
    if (opVarSubObjectEDataType == null) {
      opVarSubObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(53);
    }
    return opVarSubObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getQuantifiedExpOpObject() {
    if (quantifiedExpOpObjectEDataType == null) {
      quantifiedExpOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(60);
    }
    return quantifiedExpOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getQuantifiedPredOpObject() {
    if (quantifiedPredOpObjectEDataType == null) {
      quantifiedPredOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(63);
    }
    return quantifiedPredOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getUnaryExpOpObject() {
    if (unaryExpOpObjectEDataType == null) {
      unaryExpOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(82);
    }
    return unaryExpOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getUnaryPredOpObject() {
    if (unaryPredOpObjectEDataType == null) {
      unaryPredOpObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(86);
    }
    return unaryPredOpObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BxmlFactory getBxmlFactory() {
    return (BxmlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage() {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null) {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try {
      resource.load(null);
    }
    catch (IOException exception) {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents() {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier) {
    if (eClassifier.getInstanceClassName() == null) {
      eClassifier.setInstanceClassName("bxml." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //BxmlPackageImpl
