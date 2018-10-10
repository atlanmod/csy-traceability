/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.MachineType1#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link bxml.MachineType1#getParameters <em>Parameters</em>}</li>
 *   <li>{@link bxml.MachineType1#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link bxml.MachineType1#getIncludes <em>Includes</em>}</li>
 *   <li>{@link bxml.MachineType1#getImports <em>Imports</em>}</li>
 *   <li>{@link bxml.MachineType1#getExtends <em>Extends</em>}</li>
 *   <li>{@link bxml.MachineType1#getUses <em>Uses</em>}</li>
 *   <li>{@link bxml.MachineType1#getSees <em>Sees</em>}</li>
 *   <li>{@link bxml.MachineType1#getPromotes <em>Promotes</em>}</li>
 *   <li>{@link bxml.MachineType1#getValues <em>Values</em>}</li>
 *   <li>{@link bxml.MachineType1#getSets <em>Sets</em>}</li>
 *   <li>{@link bxml.MachineType1#getAbstractConstants <em>Abstract Constants</em>}</li>
 *   <li>{@link bxml.MachineType1#getConcreteConstants <em>Concrete Constants</em>}</li>
 *   <li>{@link bxml.MachineType1#getAbstractVariables <em>Abstract Variables</em>}</li>
 *   <li>{@link bxml.MachineType1#getConcreteVariables <em>Concrete Variables</em>}</li>
 *   <li>{@link bxml.MachineType1#getProperties <em>Properties</em>}</li>
 *   <li>{@link bxml.MachineType1#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link bxml.MachineType1#getInitialisation <em>Initialisation</em>}</li>
 *   <li>{@link bxml.MachineType1#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link bxml.MachineType1#getLocalOperations <em>Local Operations</em>}</li>
 *   <li>{@link bxml.MachineType1#getOperations <em>Operations</em>}</li>
 *   <li>{@link bxml.MachineType1#getTypeInfos <em>Type Infos</em>}</li>
 *   <li>{@link bxml.MachineType1#getName <em>Name</em>}</li>
 *   <li>{@link bxml.MachineType1#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getMachineType1()
 * @model extendedMetaData="name='Machine_._type' kind='elementOnly'"
 * @generated
 */
public interface MachineType1 extends EObject {
  /**
   * Returns the value of the '<em><b>Abstraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstraction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstraction</em>' containment reference.
   * @see #setAbstraction(AbstractionType)
   * @see bxml.BxmlPackage#getMachineType1_Abstraction()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Abstraction' namespace='##targetNamespace'"
   * @generated
   */
  AbstractionType getAbstraction();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getAbstraction <em>Abstraction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstraction</em>' containment reference.
   * @see #getAbstraction()
   * @generated
   */
  void setAbstraction(AbstractionType value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ParametersType1)
   * @see bxml.BxmlPackage#getMachineType1_Parameters()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
   * @generated
   */
  ParametersType1 getParameters();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParametersType1 value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference.
   * @see #setConstraints(PredicateType)
   * @see bxml.BxmlPackage#getMachineType1_Constraints()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Constraints' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getConstraints();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getConstraints <em>Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraints</em>' containment reference.
   * @see #getConstraints()
   * @generated
   */
  void setConstraints(PredicateType value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference.
   * @see #setIncludes(ReferencedMachineType2)
   * @see bxml.BxmlPackage#getMachineType1_Includes()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Includes' namespace='##targetNamespace'"
   * @generated
   */
  ReferencedMachineType2 getIncludes();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getIncludes <em>Includes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Includes</em>' containment reference.
   * @see #getIncludes()
   * @generated
   */
  void setIncludes(ReferencedMachineType2 value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference.
   * @see #setImports(ReferencedMachineType2)
   * @see bxml.BxmlPackage#getMachineType1_Imports()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Imports' namespace='##targetNamespace'"
   * @generated
   */
  ReferencedMachineType2 getImports();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getImports <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imports</em>' containment reference.
   * @see #getImports()
   * @generated
   */
  void setImports(ReferencedMachineType2 value);

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(ReferencedMachineType2)
   * @see bxml.BxmlPackage#getMachineType1_Extends()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Extends' namespace='##targetNamespace'"
   * @generated
   */
  ReferencedMachineType2 getExtends();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(ReferencedMachineType2 value);

  /**
   * Returns the value of the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uses</em>' containment reference.
   * @see #setUses(ReferencedMachineType2)
   * @see bxml.BxmlPackage#getMachineType1_Uses()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Uses' namespace='##targetNamespace'"
   * @generated
   */
  ReferencedMachineType2 getUses();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getUses <em>Uses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uses</em>' containment reference.
   * @see #getUses()
   * @generated
   */
  void setUses(ReferencedMachineType2 value);

  /**
   * Returns the value of the '<em><b>Sees</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sees</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sees</em>' containment reference.
   * @see #setSees(SeesType)
   * @see bxml.BxmlPackage#getMachineType1_Sees()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Sees' namespace='##targetNamespace'"
   * @generated
   */
  SeesType getSees();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getSees <em>Sees</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sees</em>' containment reference.
   * @see #getSees()
   * @generated
   */
  void setSees(SeesType value);

  /**
   * Returns the value of the '<em><b>Promotes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promotes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promotes</em>' containment reference.
   * @see #setPromotes(PromotesType)
   * @see bxml.BxmlPackage#getMachineType1_Promotes()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Promotes' namespace='##targetNamespace'"
   * @generated
   */
  PromotesType getPromotes();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getPromotes <em>Promotes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Promotes</em>' containment reference.
   * @see #getPromotes()
   * @generated
   */
  void setPromotes(PromotesType value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference.
   * @see #setValues(ValuesType)
   * @see bxml.BxmlPackage#getMachineType1_Values()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Values' namespace='##targetNamespace'"
   * @generated
   */
  ValuesType getValues();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(ValuesType value);

  /**
   * Returns the value of the '<em><b>Sets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sets</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sets</em>' containment reference.
   * @see #setSets(SetsType)
   * @see bxml.BxmlPackage#getMachineType1_Sets()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Sets' namespace='##targetNamespace'"
   * @generated
   */
  SetsType getSets();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getSets <em>Sets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sets</em>' containment reference.
   * @see #getSets()
   * @generated
   */
  void setSets(SetsType value);

  /**
   * Returns the value of the '<em><b>Abstract Constants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Constants</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Constants</em>' containment reference.
   * @see #setAbstractConstants(AbstractConstantsType)
   * @see bxml.BxmlPackage#getMachineType1_AbstractConstants()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Abstract_Constants' namespace='##targetNamespace'"
   * @generated
   */
  AbstractConstantsType getAbstractConstants();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getAbstractConstants <em>Abstract Constants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract Constants</em>' containment reference.
   * @see #getAbstractConstants()
   * @generated
   */
  void setAbstractConstants(AbstractConstantsType value);

  /**
   * Returns the value of the '<em><b>Concrete Constants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Constants</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Constants</em>' containment reference.
   * @see #setConcreteConstants(ConcreteConstantsType)
   * @see bxml.BxmlPackage#getMachineType1_ConcreteConstants()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Concrete_Constants' namespace='##targetNamespace'"
   * @generated
   */
  ConcreteConstantsType getConcreteConstants();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getConcreteConstants <em>Concrete Constants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete Constants</em>' containment reference.
   * @see #getConcreteConstants()
   * @generated
   */
  void setConcreteConstants(ConcreteConstantsType value);

  /**
   * Returns the value of the '<em><b>Abstract Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Variables</em>' containment reference.
   * @see #setAbstractVariables(AbstractVariablesType)
   * @see bxml.BxmlPackage#getMachineType1_AbstractVariables()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Abstract_Variables' namespace='##targetNamespace'"
   * @generated
   */
  AbstractVariablesType getAbstractVariables();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getAbstractVariables <em>Abstract Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract Variables</em>' containment reference.
   * @see #getAbstractVariables()
   * @generated
   */
  void setAbstractVariables(AbstractVariablesType value);

  /**
   * Returns the value of the '<em><b>Concrete Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Variables</em>' containment reference.
   * @see #setConcreteVariables(ConcreteVariablesType)
   * @see bxml.BxmlPackage#getMachineType1_ConcreteVariables()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Concrete_Variables' namespace='##targetNamespace'"
   * @generated
   */
  ConcreteVariablesType getConcreteVariables();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getConcreteVariables <em>Concrete Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete Variables</em>' containment reference.
   * @see #getConcreteVariables()
   * @generated
   */
  void setConcreteVariables(ConcreteVariablesType value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(PredicateType)
   * @see bxml.BxmlPackage#getMachineType1_Properties()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Properties' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getProperties();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(PredicateType value);

  /**
   * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invariant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariant</em>' containment reference.
   * @see #setInvariant(PredicateType)
   * @see bxml.BxmlPackage#getMachineType1_Invariant()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Invariant' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getInvariant();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getInvariant <em>Invariant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invariant</em>' containment reference.
   * @see #getInvariant()
   * @generated
   */
  void setInvariant(PredicateType value);

  /**
   * Returns the value of the '<em><b>Initialisation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialisation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialisation</em>' containment reference.
   * @see #setInitialisation(SubstitutionType)
   * @see bxml.BxmlPackage#getMachineType1_Initialisation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Initialisation' namespace='##targetNamespace'"
   * @generated
   */
  SubstitutionType getInitialisation();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getInitialisation <em>Initialisation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialisation</em>' containment reference.
   * @see #getInitialisation()
   * @generated
   */
  void setInitialisation(SubstitutionType value);

  /**
   * Returns the value of the '<em><b>Assertions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertions</em>' containment reference.
   * @see #setAssertions(AssertionsType)
   * @see bxml.BxmlPackage#getMachineType1_Assertions()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Assertions' namespace='##targetNamespace'"
   * @generated
   */
  AssertionsType getAssertions();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getAssertions <em>Assertions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assertions</em>' containment reference.
   * @see #getAssertions()
   * @generated
   */
  void setAssertions(AssertionsType value);

  /**
   * Returns the value of the '<em><b>Local Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Operations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Operations</em>' containment reference.
   * @see #setLocalOperations(LocalOperationsType)
   * @see bxml.BxmlPackage#getMachineType1_LocalOperations()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Local_Operations' namespace='##targetNamespace'"
   * @generated
   */
  LocalOperationsType getLocalOperations();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getLocalOperations <em>Local Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Operations</em>' containment reference.
   * @see #getLocalOperations()
   * @generated
   */
  void setLocalOperations(LocalOperationsType value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference.
   * @see #setOperations(OperationsType)
   * @see bxml.BxmlPackage#getMachineType1_Operations()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Operations' namespace='##targetNamespace'"
   * @generated
   */
  OperationsType getOperations();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getOperations <em>Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operations</em>' containment reference.
   * @see #getOperations()
   * @generated
   */
  void setOperations(OperationsType value);

  /**
   * Returns the value of the '<em><b>Type Infos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Infos</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Infos</em>' containment reference.
   * @see #setTypeInfos(TypeInfosType)
   * @see bxml.BxmlPackage#getMachineType1_TypeInfos()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='TypeInfos' namespace='##targetNamespace'"
   * @generated
   */
  TypeInfosType getTypeInfos();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getTypeInfos <em>Type Infos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Infos</em>' containment reference.
   * @see #getTypeInfos()
   * @generated
   */
  void setTypeInfos(TypeInfosType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see bxml.BxmlPackage#getMachineType1_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.MachineType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see bxml.MachineType
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(MachineType)
   * @see bxml.BxmlPackage#getMachineType1_Type()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
   * @generated
   */
  MachineType getType();

  /**
   * Sets the value of the '{@link bxml.MachineType1#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see bxml.MachineType
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(MachineType value);

  /**
   * Unsets the value of the '{@link bxml.MachineType1#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(MachineType)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link bxml.MachineType1#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(MachineType)
   * @generated
   */
  boolean isSetType();

} // MachineType1
