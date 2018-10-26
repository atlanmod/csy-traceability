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
  private EClass assignementSubTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attrTypeEClass = null;

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
  private EClass binaryExpType2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryPredTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blocSubTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyType2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyType3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyType4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyType5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyType6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bynaryExpTypeEClass = null;

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
  private EClass choiceType1EClass = null;

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
  private EClass conditionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintsTypeEClass = null;

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
  private EClass elseTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elseType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elseType2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptySeqTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptySetTypeEClass = null;

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
  private EClass extendsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guardTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idTypeEClass = null;

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
  private EClass importsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialisationTypeEClass = null;

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
  private EClass inputParametersType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerLiteralTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invariantTypeEClass = null;

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
  private EClass localOperationsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass machineTypeEClass = null;

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
  private EClass naryPredTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass narySubTypeEClass = null;

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
  private EClass outputParametersType1EClass = null;

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
  private EClass preconditionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass promotedOperationTypeEClass = null;

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
  private EClass propertiesTypeEClass = null;

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
  private EClass setType1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skipTypeEClass = null;

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
  private EClass thenTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeInfoEClass = null;

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
  private EClass unaryExpTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpType2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryPredTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usesTypeEClass = null;

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
  private EClass valueTypeEClass = null;

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
  private EClass variantTypeEClass = null;

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
  private EEnum elseifTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opType1EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opType2EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opType3EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opType4EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opType5EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opType6EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opType7EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opType8EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opType9EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeType1EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeType2EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum valueType1EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType elseifTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObject1EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObject2EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObject3EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObject4EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObject5EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObject6EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObject7EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObject8EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType opTypeObject9EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType typeTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType typeTypeObject1EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType typeTypeObject2EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType valueTypeObjectEDataType = null;

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
  public EAttribute getAbstractionType_Mixed() {
        return (EAttribute)getAbstractionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractionType_Attr() {
        return (EReference)getAbstractionType().getEStructuralFeatures().get(1);
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
  public EReference getAssertionsType_Attr() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssertionsType_Predicate() {
        return (EAttribute)getAssertionsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_BinaryPred() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_NaryPred() {
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
  public EReference getAssertionsType_QuantifiedPred() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_ExpComparison() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionsType_Set() {
        return (EReference)getAssertionsType().getEStructuralFeatures().get(7);
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
  public EClass getAssignementSubType() {
    if (assignementSubTypeEClass == null) {
      assignementSubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(6);
    }
    return assignementSubTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignementSubType_Attr() {
        return (EReference)getAssignementSubType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignementSubType_Variables() {
        return (EReference)getAssignementSubType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignementSubType_Values() {
        return (EReference)getAssignementSubType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttrType() {
    if (attrTypeEClass == null) {
      attrTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(7);
    }
    return attrTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrType_AnyElement() {
        return (EAttribute)getAttrType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrType_Any() {
        return (EAttribute)getAttrType().getEStructuralFeatures().get(1);
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
  public EClass getBinaryExpType2() {
    if (binaryExpType2EClass == null) {
      binaryExpType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(10);
    }
    return binaryExpType2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpType2_Id() {
        return (EReference)getBinaryExpType2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpType2_UnaryExp() {
        return (EReference)getBinaryExpType2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpType2_BinaryExp() {
        return (EReference)getBinaryExpType2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpType2_Struct() {
        return (EReference)getBinaryExpType2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryExpType2_GenericType() {
        return (EAttribute)getBinaryExpType2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpType2_Id1() {
        return (EReference)getBinaryExpType2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpType2_UnaryExp1() {
        return (EReference)getBinaryExpType2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpType2_BinaryExp1() {
        return (EReference)getBinaryExpType2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryExpType2_Struct1() {
        return (EReference)getBinaryExpType2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryExpType2_GenericType1() {
        return (EAttribute)getBinaryExpType2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryExpType2_Op() {
        return (EAttribute)getBinaryExpType2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryPredType() {
    if (binaryPredTypeEClass == null) {
      binaryPredTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(11);
    }
    return binaryPredTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_Attr() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_BinaryPred() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_NaryPred() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_UnaryPred() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_QuantifiedPred() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_ExpComparison() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_Set() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_BinaryPred1() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_NaryPred1() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_UnaryPred1() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_QuantifiedPred1() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_ExpComparison1() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryPredType_Set1() {
        return (EReference)getBinaryPredType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryPredType_Op() {
        return (EAttribute)getBinaryPredType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlocSubType() {
    if (blocSubTypeEClass == null) {
      blocSubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(12);
    }
    return blocSubTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_Attr() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_BlocSub() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_Skip() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_AssertSub() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_IfSub() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_BecomesSuchThat() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_AssignementSub() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_Select() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_CaseSub() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_ANYSub() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_LETSub() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_BecomesIn() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_VARIN() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_NarySub() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_OperationCall() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlocSubType_While() {
        return (EReference)getBlocSubType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyType() {
    if (bodyTypeEClass == null) {
      bodyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(13);
    }
    return bodyTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType_Attr() {
        return (EReference)getBodyType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType_BinaryPred() {
        return (EReference)getBodyType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType_NaryPred() {
        return (EReference)getBodyType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType_UnaryPred() {
        return (EReference)getBodyType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType_QuantifiedPred() {
        return (EReference)getBodyType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType_ExpComparison() {
        return (EReference)getBodyType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType_Set() {
        return (EReference)getBodyType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyType1() {
    if (bodyType1EClass == null) {
      bodyType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(14);
    }
    return bodyType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_BlocSub() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_Skip() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_AssertSub() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_IfSub() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_BecomesSuchThat() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_AssignementSub() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_Select() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_CaseSub() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_ANYSub() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_LETSub() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_BecomesIn() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_VARIN() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_NarySub() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_OperationCall() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType1_While() {
        return (EReference)getBodyType1().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyType2() {
    if (bodyType2EClass == null) {
      bodyType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(15);
    }
    return bodyType2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_Attr() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_BlocSub() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_Skip() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_AssertSub() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_IfSub() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_BecomesSuchThat() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_AssignementSub() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_Select() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_CaseSub() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_ANYSub() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_LETSub() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_BecomesIn() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_VARIN() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_NarySub() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_OperationCall() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType2_While() {
        return (EReference)getBodyType2().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyType3() {
    if (bodyType3EClass == null) {
      bodyType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(16);
    }
    return bodyType3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_Attr() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_BinaryExp() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_NaryExp() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_BooleanLiteral() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_BooleanExp() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_EmptySet() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_EmptySeq() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_Id() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_IntegerLiteral() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_QuantifiedExp() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_QuantifiedSet() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_STRINGLiteral() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_UnaryExp() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_Struct() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType3_Record() {
        return (EReference)getBodyType3().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyType4() {
    if (bodyType4EClass == null) {
      bodyType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(17);
    }
    return bodyType4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_Attr() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_BlocSub() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_Skip() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_AssertSub() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_IfSub() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_BecomesSuchThat() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_AssignementSub() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_Select() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_CaseSub() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_ANYSub() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_LETSub() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_BecomesIn() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_VARIN() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_NarySub() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_OperationCall() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType4_While() {
        return (EReference)getBodyType4().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyType5() {
    if (bodyType5EClass == null) {
      bodyType5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(18);
    }
    return bodyType5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_Attr() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_BlocSub() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_Skip() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_AssertSub() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_IfSub() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_BecomesSuchThat() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_AssignementSub() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_Select() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_CaseSub() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_ANYSub() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_LETSub() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_BecomesIn() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_VARIN() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_NarySub() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_OperationCall() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType5_While() {
        return (EReference)getBodyType5().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyType6() {
    if (bodyType6EClass == null) {
      bodyType6EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(19);
    }
    return bodyType6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType6_Attr() {
        return (EReference)getBodyType6().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType6_BinaryPred() {
        return (EReference)getBodyType6().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType6_NaryPred() {
        return (EReference)getBodyType6().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType6_UnaryPred() {
        return (EReference)getBodyType6().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType6_QuantifiedPred() {
        return (EReference)getBodyType6().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType6_ExpComparison() {
        return (EReference)getBodyType6().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyType6_Set() {
        return (EReference)getBodyType6().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpType() {
    if (booleanExpTypeEClass == null) {
      booleanExpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(20);
    }
    return booleanExpTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpType_Attr() {
        return (EReference)getBooleanExpType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpType_BinaryPred() {
        return (EReference)getBooleanExpType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpType_NaryPred() {
        return (EReference)getBooleanExpType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpType_UnaryPred() {
        return (EReference)getBooleanExpType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpType_QuantifiedPred() {
        return (EReference)getBooleanExpType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpType_ExpComparison() {
        return (EReference)getBooleanExpType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanExpType_Set() {
        return (EReference)getBooleanExpType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanExpType_Typref() {
        return (EAttribute)getBooleanExpType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteralType() {
    if (booleanLiteralTypeEClass == null) {
      booleanLiteralTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(21);
    }
    return booleanLiteralTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanLiteralType_Attr() {
        return (EReference)getBooleanLiteralType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteralType_Typref() {
        return (EAttribute)getBooleanLiteralType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteralType_Value() {
        return (EAttribute)getBooleanLiteralType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBynaryExpType() {
    if (bynaryExpTypeEClass == null) {
      bynaryExpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(22);
    }
    return bynaryExpTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_Attr() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_BinaryExp() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_NaryExp() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_BooleanLiteral() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_BooleanExp() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_EmptySet() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_EmptySeq() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_Id() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_IntegerLiteral() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_QuantifiedExp() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_QuantifiedSet() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_STRINGLiteral() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_UnaryExp() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_Struct() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_Record() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_BinaryExp1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_NaryExp1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_BooleanLiteral1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_BooleanExp1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_EmptySet1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_EmptySeq1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_Id1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_IntegerLiteral1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_QuantifiedExp1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_QuantifiedSet1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_STRINGLiteral1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_UnaryExp1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_Struct1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBynaryExpType_Record1() {
        return (EReference)getBynaryExpType().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBynaryExpType_Op() {
        return (EAttribute)getBynaryExpType().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBynaryExpType_Typref() {
        return (EAttribute)getBynaryExpType().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseSubType() {
    if (caseSubTypeEClass == null) {
      caseSubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(23);
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
      choicesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(24);
    }
    return choicesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoicesType_Attr() {
        return (EReference)getChoicesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoicesType_Choice() {
        return (EReference)getChoicesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoiceType() {
    if (choiceTypeEClass == null) {
      choiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(25);
    }
    return choiceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoiceType_Attr() {
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
  public EClass getChoiceType1() {
    if (choiceType1EClass == null) {
      choiceType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(26);
    }
    return choiceType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoiceType1_Attr() {
        return (EReference)getChoiceType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoiceType1_Value() {
        return (EReference)getChoiceType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoiceType1_Then() {
        return (EReference)getChoiceType1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcreteConstantsType() {
    if (concreteConstantsTypeEClass == null) {
      concreteConstantsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(27);
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
      concreteVariablesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(28);
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
  public EClass getConditionType() {
    if (conditionTypeEClass == null) {
      conditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(29);
    }
    return conditionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionType_Attr() {
        return (EReference)getConditionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionType_BinaryPred() {
        return (EReference)getConditionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionType_NaryPred() {
        return (EReference)getConditionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionType_UnaryPred() {
        return (EReference)getConditionType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionType_QuantifiedPred() {
        return (EReference)getConditionType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionType_ExpComparison() {
        return (EReference)getConditionType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionType_Set() {
        return (EReference)getConditionType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintsType() {
    if (constraintsTypeEClass == null) {
      constraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(30);
    }
    return constraintsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintsType_Attr() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintsType_BinaryPred() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintsType_NaryPred() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintsType_UnaryPred() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintsType_QuantifiedPred() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintsType_ExpComparison() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraintsType_Set() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot() {
    if (documentRootEClass == null) {
      documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(31);
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
  public EReference getDocumentRoot_AbstractConstants() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_AbstractVariables() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Abstraction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ANYSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_AssertSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Assertions() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_AssignementSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Attr() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_BecomesIn() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_BecomesSuchThat() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_BinaryPred() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_BlocSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Body() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_BooleanExp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_BooleanLiteral() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CaseSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Choices() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ConcreteConstants() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ConcreteVariables() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Condition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Constraints() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_EmptySeq() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_EmptySet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_EnumeratedValues() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ExpComparison() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Extends() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_GenericType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Guard() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_IfSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Imports() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Includes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Initialisation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Instance() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_IntegerLiteral() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Invariant() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_LETSub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_LocalOperations() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Machine() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_NaryExp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_NaryPred() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_NarySub() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Operation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_OperationCall() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Operations() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Precondition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Pred() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_PromotedOperation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Promotes() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Properties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_QuantifiedExp() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_QuantifiedPred() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_QuantifiedSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Record() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_RecordItem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ReferencedMachine() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Refines() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Sees() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Select() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Set() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Sets() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Skip() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_STRINGLiteral() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Struct() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Then() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Type() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_TypeInfos() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_UnaryPred() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Uses() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Value() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_VARIN() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Variables() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Variant() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_When() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_WhenClauses() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_While() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElseType() {
    if (elseTypeEClass == null) {
      elseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(34);
    }
    return elseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_Attr() {
        return (EReference)getElseType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_BlocSub() {
        return (EReference)getElseType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_Skip() {
        return (EReference)getElseType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_AssertSub() {
        return (EReference)getElseType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_IfSub() {
        return (EReference)getElseType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_BecomesSuchThat() {
        return (EReference)getElseType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_AssignementSub() {
        return (EReference)getElseType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_Select() {
        return (EReference)getElseType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_CaseSub() {
        return (EReference)getElseType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_ANYSub() {
        return (EReference)getElseType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_LETSub() {
        return (EReference)getElseType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_BecomesIn() {
        return (EReference)getElseType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_VARIN() {
        return (EReference)getElseType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_NarySub() {
        return (EReference)getElseType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_OperationCall() {
        return (EReference)getElseType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType_While() {
        return (EReference)getElseType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElseType1() {
    if (elseType1EClass == null) {
      elseType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(35);
    }
    return elseType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType1_Attr() {
        return (EReference)getElseType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType1_Choice() {
        return (EReference)getElseType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElseType2() {
    if (elseType2EClass == null) {
      elseType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(36);
    }
    return elseType2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_Attr() {
        return (EReference)getElseType2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_BlocSub() {
        return (EReference)getElseType2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_Skip() {
        return (EReference)getElseType2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_AssertSub() {
        return (EReference)getElseType2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_IfSub() {
        return (EReference)getElseType2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_BecomesSuchThat() {
        return (EReference)getElseType2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_AssignementSub() {
        return (EReference)getElseType2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_Select() {
        return (EReference)getElseType2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_CaseSub() {
        return (EReference)getElseType2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_ANYSub() {
        return (EReference)getElseType2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_LETSub() {
        return (EReference)getElseType2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_BecomesIn() {
        return (EReference)getElseType2().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_VARIN() {
        return (EReference)getElseType2().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_NarySub() {
        return (EReference)getElseType2().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_OperationCall() {
        return (EReference)getElseType2().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElseType2_While() {
        return (EReference)getElseType2().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmptySeqType() {
    if (emptySeqTypeEClass == null) {
      emptySeqTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(37);
    }
    return emptySeqTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmptySeqType_Attr() {
        return (EReference)getEmptySeqType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmptySeqType_Typref() {
        return (EAttribute)getEmptySeqType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmptySetType() {
    if (emptySetTypeEClass == null) {
      emptySetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(38);
    }
    return emptySetTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmptySetType_Attr() {
        return (EReference)getEmptySetType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmptySetType_Typref() {
        return (EAttribute)getEmptySetType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeratedValuesType() {
    if (enumeratedValuesTypeEClass == null) {
      enumeratedValuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(39);
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
      expComparisonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(40);
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
  public EClass getExtendsType() {
    if (extendsTypeEClass == null) {
      extendsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(41);
    }
    return extendsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendsType_Attr() {
        return (EReference)getExtendsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtendsType_ReferencedMachine() {
        return (EReference)getExtendsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGuardType() {
    if (guardTypeEClass == null) {
      guardTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(42);
    }
    return guardTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardType_Attr() {
        return (EReference)getGuardType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardType_BinaryPred() {
        return (EReference)getGuardType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardType_NaryPred() {
        return (EReference)getGuardType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardType_UnaryPred() {
        return (EReference)getGuardType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardType_QuantifiedPred() {
        return (EReference)getGuardType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardType_ExpComparison() {
        return (EReference)getGuardType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGuardType_Set() {
        return (EReference)getGuardType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifier() {
    if (identifierEClass == null) {
      identifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(43);
    }
    return identifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentifier_Attr() {
        return (EReference)getIdentifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Component() {
        return (EAttribute)getIdentifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Instance() {
        return (EAttribute)getIdentifier().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Suffix() {
        return (EAttribute)getIdentifier().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Typref() {
        return (EAttribute)getIdentifier().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Value() {
        return (EAttribute)getIdentifier().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdType() {
    if (idTypeEClass == null) {
      idTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(44);
    }
    return idTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdType_Value() {
        return (EAttribute)getIdType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfSubType() {
    if (ifSubTypeEClass == null) {
      ifSubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(45);
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
  public EClass getImportsType() {
    if (importsTypeEClass == null) {
      importsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(46);
    }
    return importsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportsType_Attr() {
        return (EReference)getImportsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportsType_ReferencedMachine() {
        return (EReference)getImportsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludesType() {
    if (includesTypeEClass == null) {
      includesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(47);
    }
    return includesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIncludesType_Attr() {
        return (EReference)getIncludesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIncludesType_ReferencedMachine() {
        return (EReference)getIncludesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitialisationType() {
    if (initialisationTypeEClass == null) {
      initialisationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(48);
    }
    return initialisationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_Attr() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_BlocSub() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_Skip() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_AssertSub() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_IfSub() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_BecomesSuchThat() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_AssignementSub() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_Select() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_CaseSub() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_ANYSub() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_LETSub() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_BecomesIn() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_VARIN() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_NarySub() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_OperationCall() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialisationType_While() {
        return (EReference)getInitialisationType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputParametersType() {
    if (inputParametersTypeEClass == null) {
      inputParametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(49);
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
  public EClass getInputParametersType1() {
    if (inputParametersType1EClass == null) {
      inputParametersType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(50);
    }
    return inputParametersType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_Attr() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputParametersType1_Expression() {
        return (EAttribute)getInputParametersType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_BinaryExp() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_NaryExp() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_BooleanLiteral() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_BooleanExp() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_EmptySet() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_EmptySeq() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_Id() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_IntegerLiteral() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_QuantifiedExp() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_QuantifiedSet() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_STRINGLiteral() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_UnaryExp() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_Struct() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputParametersType1_Record() {
        return (EReference)getInputParametersType1().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerLiteralType() {
    if (integerLiteralTypeEClass == null) {
      integerLiteralTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(51);
    }
    return integerLiteralTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerLiteralType_Attr() {
        return (EReference)getIntegerLiteralType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerLiteralType_Typref() {
        return (EAttribute)getIntegerLiteralType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerLiteralType_Value() {
        return (EAttribute)getIntegerLiteralType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvariantType() {
    if (invariantTypeEClass == null) {
      invariantTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(52);
    }
    return invariantTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvariantType_Attr() {
        return (EReference)getInvariantType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvariantType_BinaryPred() {
        return (EReference)getInvariantType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvariantType_NaryPred() {
        return (EReference)getInvariantType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvariantType_UnaryPred() {
        return (EReference)getInvariantType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvariantType_QuantifiedPred() {
        return (EReference)getInvariantType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvariantType_ExpComparison() {
        return (EReference)getInvariantType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvariantType_Set() {
        return (EReference)getInvariantType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLETSubType() {
    if (letSubTypeEClass == null) {
      letSubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(53);
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
  public EClass getLocalOperationsType() {
    if (localOperationsTypeEClass == null) {
      localOperationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(54);
    }
    return localOperationsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalOperationsType_Attr() {
        return (EReference)getLocalOperationsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalOperationsType_Operation() {
        return (EReference)getLocalOperationsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMachineType() {
    if (machineTypeEClass == null) {
      machineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(55);
    }
    return machineTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Attr() {
        return (EReference)getMachineType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Abstraction() {
        return (EReference)getMachineType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Parameters() {
        return (EReference)getMachineType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Constraints() {
        return (EReference)getMachineType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Includes() {
        return (EReference)getMachineType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Imports() {
        return (EReference)getMachineType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Sees() {
        return (EReference)getMachineType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Extends() {
        return (EReference)getMachineType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Uses() {
        return (EReference)getMachineType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Promotes() {
        return (EReference)getMachineType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Values() {
        return (EReference)getMachineType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Sets() {
        return (EReference)getMachineType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_AbstractConstants() {
        return (EReference)getMachineType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_ConcreteConstants() {
        return (EReference)getMachineType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_AbstractVariables() {
        return (EReference)getMachineType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_ConcreteVariables() {
        return (EReference)getMachineType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Variant() {
        return (EReference)getMachineType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Properties() {
        return (EReference)getMachineType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Invariant() {
        return (EReference)getMachineType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Initialisation() {
        return (EReference)getMachineType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Assertions() {
        return (EReference)getMachineType().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_LocalOperations() {
        return (EReference)getMachineType().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_Operations() {
        return (EReference)getMachineType().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMachineType_TypeInfos() {
        return (EReference)getMachineType().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMachineType_Name() {
        return (EAttribute)getMachineType().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMachineType_Type() {
        return (EAttribute)getMachineType().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameType() {
    if (nameTypeEClass == null) {
      nameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(56);
    }
    return nameTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameType_Attr() {
        return (EReference)getNameType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameType_Id() {
        return (EReference)getNameType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaryExpType() {
    if (naryExpTypeEClass == null) {
      naryExpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(57);
    }
    return naryExpTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_Attr() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaryExpType_Expression() {
        return (EAttribute)getNaryExpType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_BinaryExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_NaryExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_BooleanLiteral() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_BooleanExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_EmptySet() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_EmptySeq() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_Id() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_IntegerLiteral() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_QuantifiedExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_QuantifiedSet() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_STRINGLiteral() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_UnaryExp() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_Struct() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryExpType_Record() {
        return (EReference)getNaryExpType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaryExpType_Op() {
        return (EAttribute)getNaryExpType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaryExpType_Typref() {
        return (EAttribute)getNaryExpType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaryPredType() {
    if (naryPredTypeEClass == null) {
      naryPredTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(58);
    }
    return naryPredTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredType_Attr() {
        return (EReference)getNaryPredType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaryPredType_Predicate() {
        return (EAttribute)getNaryPredType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredType_BinaryPred() {
        return (EReference)getNaryPredType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredType_NaryPred() {
        return (EReference)getNaryPredType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredType_UnaryPred() {
        return (EReference)getNaryPredType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredType_QuantifiedPred() {
        return (EReference)getNaryPredType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredType_ExpComparison() {
        return (EReference)getNaryPredType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryPredType_Set() {
        return (EReference)getNaryPredType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaryPredType_Op() {
        return (EAttribute)getNaryPredType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNarySubType() {
    if (narySubTypeEClass == null) {
      narySubTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(59);
    }
    return narySubTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_Attr() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNarySubType_Substitution() {
        return (EAttribute)getNarySubType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_BlocSub() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_Skip() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_AssertSub() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_IfSub() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_BecomesSuchThat() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_AssignementSub() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_Select() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_CaseSub() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_ANYSub() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_LETSub() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_BecomesIn() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_VARIN() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_NarySub() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_OperationCall() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNarySubType_While() {
        return (EReference)getNarySubType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNarySubType_Op() {
        return (EAttribute)getNarySubType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationCallType() {
    if (operationCallTypeEClass == null) {
      operationCallTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(60);
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
  public EClass getOperationsType() {
    if (operationsTypeEClass == null) {
      operationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(61);
    }
    return operationsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationsType_Attr() {
        return (EReference)getOperationsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationsType_Operation() {
        return (EReference)getOperationsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationType() {
    if (operationTypeEClass == null) {
      operationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(62);
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
      outputParametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(83);
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
  public EClass getOutputParametersType1() {
    if (outputParametersType1EClass == null) {
      outputParametersType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(84);
    }
    return outputParametersType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_Attr() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputParametersType1_Expression() {
        return (EAttribute)getOutputParametersType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_BinaryExp() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_NaryExp() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_BooleanLiteral() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_BooleanExp() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_EmptySet() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_EmptySeq() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_Id() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_IntegerLiteral() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_QuantifiedExp() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_QuantifiedSet() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_STRINGLiteral() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_UnaryExp() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_Struct() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputParametersType1_Record() {
        return (EReference)getOutputParametersType1().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParametersType() {
    if (parametersTypeEClass == null) {
      parametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(85);
    }
    return parametersTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_Attr() {
        return (EReference)getParametersType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType_Id() {
        return (EReference)getParametersType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParametersType1() {
    if (parametersType1EClass == null) {
      parametersType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(86);
    }
    return parametersType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParametersType1_Expression() {
        return (EAttribute)getParametersType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_BinaryExp() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_NaryExp() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_BooleanLiteral() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_BooleanExp() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_EmptySet() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_EmptySeq() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_Id() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_IntegerLiteral() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_QuantifiedExp() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_QuantifiedSet() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_STRINGLiteral() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_UnaryExp() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_Struct() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersType1_Record() {
        return (EReference)getParametersType1().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreconditionType() {
    if (preconditionTypeEClass == null) {
      preconditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(87);
    }
    return preconditionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreconditionType_BinaryPred() {
        return (EReference)getPreconditionType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreconditionType_NaryPred() {
        return (EReference)getPreconditionType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreconditionType_UnaryPred() {
        return (EReference)getPreconditionType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreconditionType_QuantifiedPred() {
        return (EReference)getPreconditionType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreconditionType_ExpComparison() {
        return (EReference)getPreconditionType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPreconditionType_Set() {
        return (EReference)getPreconditionType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredType() {
    if (predTypeEClass == null) {
      predTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(88);
    }
    return predTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredType_Attr() {
        return (EReference)getPredType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredType_BinaryPred() {
        return (EReference)getPredType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredType_NaryPred() {
        return (EReference)getPredType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredType_UnaryPred() {
        return (EReference)getPredType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredType_QuantifiedPred() {
        return (EReference)getPredType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredType_ExpComparison() {
        return (EReference)getPredType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPredType_Set() {
        return (EReference)getPredType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPromotedOperationType() {
    if (promotedOperationTypeEClass == null) {
      promotedOperationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(89);
    }
    return promotedOperationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPromotedOperationType_Mixed() {
        return (EAttribute)getPromotedOperationType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPromotedOperationType_Attr() {
        return (EReference)getPromotedOperationType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPromotesType() {
    if (promotesTypeEClass == null) {
      promotesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(90);
    }
    return promotesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPromotesType_Attr() {
        return (EReference)getPromotesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPromotesType_PromotedOperation() {
        return (EReference)getPromotesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertiesType() {
    if (propertiesTypeEClass == null) {
      propertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(91);
    }
    return propertiesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertiesType_Attr() {
        return (EReference)getPropertiesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertiesType_BinaryPred() {
        return (EReference)getPropertiesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertiesType_NaryPred() {
        return (EReference)getPropertiesType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertiesType_UnaryPred() {
        return (EReference)getPropertiesType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertiesType_QuantifiedPred() {
        return (EReference)getPropertiesType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertiesType_ExpComparison() {
        return (EReference)getPropertiesType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertiesType_Set() {
        return (EReference)getPropertiesType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedExpType() {
    if (quantifiedExpTypeEClass == null) {
      quantifiedExpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(92);
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
  public EAttribute getQuantifiedExpType_Typref() {
        return (EAttribute)getQuantifiedExpType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedPredType() {
    if (quantifiedPredTypeEClass == null) {
      quantifiedPredTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(93);
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
      quantifiedSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(94);
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
  public EAttribute getQuantifiedSetType_Typref() {
        return (EAttribute)getQuantifiedSetType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordItemType() {
    if (recordItemTypeEClass == null) {
      recordItemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(95);
    }
    return recordItemTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_Attr() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_BinaryExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_NaryExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_BooleanLiteral() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_BooleanExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_EmptySet() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_EmptySeq() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_Id() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_IntegerLiteral() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_QuantifiedExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_QuantifiedSet() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_STRINGLiteral() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_UnaryExp() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_Struct() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordItemType_Record() {
        return (EReference)getRecordItemType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecordItemType_Label() {
        return (EAttribute)getRecordItemType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordType() {
    if (recordTypeEClass == null) {
      recordTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(96);
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
  public EAttribute getRecordType_Typref() {
        return (EAttribute)getRecordType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferencedMachineType() {
    if (referencedMachineTypeEClass == null) {
      referencedMachineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(97);
    }
    return referencedMachineTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferencedMachineType_Attr() {
        return (EReference)getReferencedMachineType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferencedMachineType_Name() {
        return (EAttribute)getReferencedMachineType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferencedMachineType_Instance() {
        return (EAttribute)getReferencedMachineType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferencedMachineType_Parameters() {
        return (EReference)getReferencedMachineType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefinesType() {
    if (refinesTypeEClass == null) {
      refinesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(98);
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
      seesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(99);
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
      selectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(100);
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
      setsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(101);
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
      setTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(102);
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
  public EClass getSetType1() {
    if (setType1EClass == null) {
      setType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(103);
    }
    return setType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetType1_Id() {
        return (EReference)getSetType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkipType() {
    if (skipTypeEClass == null) {
      skipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(104);
    }
    return skipTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkipType_Attr() {
        return (EReference)getSkipType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSTRINGLiteralType() {
    if (stringLiteralTypeEClass == null) {
      stringLiteralTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(105);
    }
    return stringLiteralTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSTRINGLiteralType_Attr() {
        return (EReference)getSTRINGLiteralType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSTRINGLiteralType_Typref() {
        return (EAttribute)getSTRINGLiteralType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSTRINGLiteralType_Value() {
        return (EAttribute)getSTRINGLiteralType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructType() {
    if (structTypeEClass == null) {
      structTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(106);
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
  public EAttribute getStructType_Typref() {
        return (EAttribute)getStructType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThenType() {
    if (thenTypeEClass == null) {
      thenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(107);
    }
    return thenTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_Attr() {
        return (EReference)getThenType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_BlocSub() {
        return (EReference)getThenType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_Skip() {
        return (EReference)getThenType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_AssertSub() {
        return (EReference)getThenType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_IfSub() {
        return (EReference)getThenType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_BecomesSuchThat() {
        return (EReference)getThenType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_AssignementSub() {
        return (EReference)getThenType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_Select() {
        return (EReference)getThenType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_CaseSub() {
        return (EReference)getThenType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_ANYSub() {
        return (EReference)getThenType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_LETSub() {
        return (EReference)getThenType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_BecomesIn() {
        return (EReference)getThenType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_VARIN() {
        return (EReference)getThenType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_NarySub() {
        return (EReference)getThenType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_OperationCall() {
        return (EReference)getThenType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThenType_While() {
        return (EReference)getThenType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeInfo() {
    if (typeInfoEClass == null) {
      typeInfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(108);
    }
    return typeInfoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeInfo_Id() {
        return (EReference)getTypeInfo().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeInfo_UnaryExp() {
        return (EReference)getTypeInfo().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeInfo_BinaryExp() {
        return (EReference)getTypeInfo().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeInfo_Struct() {
        return (EReference)getTypeInfo().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeInfo_GenericType() {
        return (EAttribute)getTypeInfo().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeInfo_Id1() {
        return (EAttribute)getTypeInfo().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeInfosType() {
    if (typeInfosTypeEClass == null) {
      typeInfosTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(109);
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
  public EClass getUnaryExpType() {
    if (unaryExpTypeEClass == null) {
      unaryExpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(116);
    }
    return unaryExpTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_Attr() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_BinaryExp() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_NaryExp() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_BooleanLiteral() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_BooleanExp() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_EmptySet() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_EmptySeq() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_Id() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_IntegerLiteral() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_QuantifiedExp() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_QuantifiedSet() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_STRINGLiteral() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_UnaryExp() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_Struct() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType_Record() {
        return (EReference)getUnaryExpType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpType_Op() {
        return (EAttribute)getUnaryExpType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpType_Typref() {
        return (EAttribute)getUnaryExpType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpType2() {
    if (unaryExpType2EClass == null) {
      unaryExpType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(117);
    }
    return unaryExpType2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType2_Id() {
        return (EReference)getUnaryExpType2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType2_UnaryExp() {
        return (EReference)getUnaryExpType2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType2_BinaryExp() {
        return (EReference)getUnaryExpType2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpType2_Struct() {
        return (EReference)getUnaryExpType2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpType2_GenericType() {
        return (EAttribute)getUnaryExpType2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpType2_Op() {
        return (EAttribute)getUnaryExpType2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryPredType() {
    if (unaryPredTypeEClass == null) {
      unaryPredTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(118);
    }
    return unaryPredTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredType_Attr() {
        return (EReference)getUnaryPredType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredType_BinaryPred() {
        return (EReference)getUnaryPredType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredType_NaryPred() {
        return (EReference)getUnaryPredType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredType_UnaryPred() {
        return (EReference)getUnaryPredType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredType_QuantifiedPred() {
        return (EReference)getUnaryPredType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredType_ExpComparison() {
        return (EReference)getUnaryPredType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryPredType_Set() {
        return (EReference)getUnaryPredType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryPredType_Op() {
        return (EAttribute)getUnaryPredType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsesType() {
    if (usesTypeEClass == null) {
      usesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(119);
    }
    return usesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsesType_Attr() {
        return (EReference)getUsesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsesType_ReferencedMachine() {
        return (EReference)getUsesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuationType() {
    if (valuationTypeEClass == null) {
      valuationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(120);
    }
    return valuationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_Attr() {
        return (EReference)getValuationType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_BinaryExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_NaryExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_BooleanLiteral() {
        return (EReference)getValuationType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_BooleanExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_EmptySet() {
        return (EReference)getValuationType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_EmptySeq() {
        return (EReference)getValuationType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_Id() {
        return (EReference)getValuationType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_IntegerLiteral() {
        return (EReference)getValuationType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_QuantifiedExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_QuantifiedSet() {
        return (EReference)getValuationType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_STRINGLiteral() {
        return (EReference)getValuationType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_UnaryExp() {
        return (EReference)getValuationType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_Struct() {
        return (EReference)getValuationType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType_Record() {
        return (EReference)getValuationType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuationType_Ident() {
        return (EAttribute)getValuationType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuationType_Typref() {
        return (EAttribute)getValuationType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuationType1() {
    if (valuationType1EClass == null) {
      valuationType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(121);
    }
    return valuationType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_Attr() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_BinaryExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_NaryExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_BooleanLiteral() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_BooleanExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_EmptySet() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_EmptySeq() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_Id() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_IntegerLiteral() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_QuantifiedExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_QuantifiedSet() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_STRINGLiteral() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_UnaryExp() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_Struct() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuationType1_Record() {
        return (EReference)getValuationType1().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuationType1_Ident() {
        return (EAttribute)getValuationType1().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuesType() {
    if (valuesTypeEClass == null) {
      valuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(122);
    }
    return valuesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType_Attr() {
        return (EReference)getValuesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType_Valuation() {
        return (EReference)getValuesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuesType1() {
    if (valuesType1EClass == null) {
      valuesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(123);
    }
    return valuesType1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType1_Attr() {
        return (EReference)getValuesType1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType1_Valuation() {
        return (EReference)getValuesType1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuesType2() {
    if (valuesType2EClass == null) {
      valuesType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(124);
    }
    return valuesType2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_Attr() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuesType2_Expression() {
        return (EAttribute)getValuesType2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_BinaryExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_NaryExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_BooleanLiteral() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_BooleanExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_EmptySet() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_EmptySeq() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_Id() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_IntegerLiteral() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_QuantifiedExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_QuantifiedSet() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_STRINGLiteral() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_UnaryExp() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_Struct() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesType2_Record() {
        return (EReference)getValuesType2().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueType() {
    if (valueTypeEClass == null) {
      valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(125);
    }
    return valueTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_Attr() {
        return (EReference)getValueType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_BinaryExp() {
        return (EReference)getValueType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_NaryExp() {
        return (EReference)getValueType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_BooleanLiteral() {
        return (EReference)getValueType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_BooleanExp() {
        return (EReference)getValueType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_EmptySet() {
        return (EReference)getValueType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_EmptySeq() {
        return (EReference)getValueType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_Id() {
        return (EReference)getValueType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_IntegerLiteral() {
        return (EReference)getValueType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_QuantifiedExp() {
        return (EReference)getValueType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_QuantifiedSet() {
        return (EReference)getValueType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_STRINGLiteral() {
        return (EReference)getValueType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_UnaryExp() {
        return (EReference)getValueType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_Struct() {
        return (EReference)getValueType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueType_Record() {
        return (EReference)getValueType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariablesType() {
    if (variablesTypeEClass == null) {
      variablesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(128);
    }
    return variablesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_Attr() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariablesType_Expression() {
        return (EAttribute)getVariablesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_BinaryExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_NaryExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_BooleanLiteral() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_BooleanExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_EmptySet() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_EmptySeq() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_Id() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_IntegerLiteral() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_QuantifiedExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_QuantifiedSet() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_STRINGLiteral() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_UnaryExp() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_Struct() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesType_Record() {
        return (EReference)getVariablesType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariablesType1() {
    if (variablesType1EClass == null) {
      variablesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(129);
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
  public EClass getVariantType() {
    if (variantTypeEClass == null) {
      variantTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(130);
    }
    return variantTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_Attr() {
        return (EReference)getVariantType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_BinaryExp() {
        return (EReference)getVariantType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_NaryExp() {
        return (EReference)getVariantType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_BooleanLiteral() {
        return (EReference)getVariantType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_BooleanExp() {
        return (EReference)getVariantType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_EmptySet() {
        return (EReference)getVariantType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_EmptySeq() {
        return (EReference)getVariantType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_Id() {
        return (EReference)getVariantType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_IntegerLiteral() {
        return (EReference)getVariantType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_QuantifiedExp() {
        return (EReference)getVariantType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_QuantifiedSet() {
        return (EReference)getVariantType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_STRINGLiteral() {
        return (EReference)getVariantType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_UnaryExp() {
        return (EReference)getVariantType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_Struct() {
        return (EReference)getVariantType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariantType_Record() {
        return (EReference)getVariantType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVARINType() {
    if (varinTypeEClass == null) {
      varinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(131);
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
  public EClass getWhenClausesType() {
    if (whenClausesTypeEClass == null) {
      whenClausesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(132);
    }
    return whenClausesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenClausesType_Attr() {
        return (EReference)getWhenClausesType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenClausesType_When() {
        return (EReference)getWhenClausesType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenType() {
    if (whenTypeEClass == null) {
      whenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(133);
    }
    return whenTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenType_Attr() {
        return (EReference)getWhenType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenType_Condition() {
        return (EReference)getWhenType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenType_Then() {
        return (EReference)getWhenType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileType() {
    if (whileTypeEClass == null) {
      whileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(134);
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
  public EEnum getElseifType() {
    if (elseifTypeEEnum == null) {
      elseifTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(32);
    }
    return elseifTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType() {
    if (opTypeEEnum == null) {
      opTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(63);
    }
    return opTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType1() {
    if (opType1EEnum == null) {
      opType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(64);
    }
    return opType1EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType2() {
    if (opType2EEnum == null) {
      opType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(65);
    }
    return opType2EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType3() {
    if (opType3EEnum == null) {
      opType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(66);
    }
    return opType3EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType4() {
    if (opType4EEnum == null) {
      opType4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(67);
    }
    return opType4EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType5() {
    if (opType5EEnum == null) {
      opType5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(68);
    }
    return opType5EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType6() {
    if (opType6EEnum == null) {
      opType6EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(69);
    }
    return opType6EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType7() {
    if (opType7EEnum == null) {
      opType7EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(70);
    }
    return opType7EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType8() {
    if (opType8EEnum == null) {
      opType8EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(71);
    }
    return opType8EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpType9() {
    if (opType9EEnum == null) {
      opType9EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(72);
    }
    return opType9EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeType() {
    if (typeTypeEEnum == null) {
      typeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(110);
    }
    return typeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeType1() {
    if (typeType1EEnum == null) {
      typeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(111);
    }
    return typeType1EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeType2() {
    if (typeType2EEnum == null) {
      typeType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(112);
    }
    return typeType2EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getValueType1() {
    if (valueType1EEnum == null) {
      valueType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(126);
    }
    return valueType1EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getElseifTypeObject() {
    if (elseifTypeObjectEDataType == null) {
      elseifTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(33);
    }
    return elseifTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject() {
    if (opTypeObjectEDataType == null) {
      opTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(73);
    }
    return opTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject1() {
    if (opTypeObject1EDataType == null) {
      opTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(74);
    }
    return opTypeObject1EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject2() {
    if (opTypeObject2EDataType == null) {
      opTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(75);
    }
    return opTypeObject2EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject3() {
    if (opTypeObject3EDataType == null) {
      opTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(76);
    }
    return opTypeObject3EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject4() {
    if (opTypeObject4EDataType == null) {
      opTypeObject4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(77);
    }
    return opTypeObject4EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject5() {
    if (opTypeObject5EDataType == null) {
      opTypeObject5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(78);
    }
    return opTypeObject5EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject6() {
    if (opTypeObject6EDataType == null) {
      opTypeObject6EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(79);
    }
    return opTypeObject6EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject7() {
    if (opTypeObject7EDataType == null) {
      opTypeObject7EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(80);
    }
    return opTypeObject7EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject8() {
    if (opTypeObject8EDataType == null) {
      opTypeObject8EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(81);
    }
    return opTypeObject8EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOpTypeObject9() {
    if (opTypeObject9EDataType == null) {
      opTypeObject9EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(82);
    }
    return opTypeObject9EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTypeTypeObject() {
    if (typeTypeObjectEDataType == null) {
      typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(113);
    }
    return typeTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTypeTypeObject1() {
    if (typeTypeObject1EDataType == null) {
      typeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(114);
    }
    return typeTypeObject1EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTypeTypeObject2() {
    if (typeTypeObject2EDataType == null) {
      typeTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(115);
    }
    return typeTypeObject2EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getValueTypeObject() {
    if (valueTypeObjectEDataType == null) {
      valueTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BxmlPackage.eNS_URI).getEClassifiers().get(127);
    }
    return valueTypeObjectEDataType;
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
