/**
 */
package bxml;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getAbstractConstants <em>Abstract Constants</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getAbstractVariables <em>Abstract Variables</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getANYSub <em>ANY Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getAssertSub <em>Assert Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getAssignementSub <em>Assignement Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getBecomesIn <em>Becomes In</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getBecomesSuchThat <em>Becomes Such That</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getBinaryPred <em>Binary Pred</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getBlocSub <em>Bloc Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getCaseSub <em>Case Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getChoices <em>Choices</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getConcreteConstants <em>Concrete Constants</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getConcreteVariables <em>Concrete Variables</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getCondition <em>Condition</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getEnumeratedValues <em>Enumerated Values</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getExpComparison <em>Exp Comparison</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getExtends <em>Extends</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getGuard <em>Guard</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getIfSub <em>If Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getImports <em>Imports</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getIncludes <em>Includes</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getInitialisation <em>Initialisation</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getInstance <em>Instance</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getLETSub <em>LET Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getLocalOperations <em>Local Operations</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getMachine <em>Machine</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getNaryPred <em>Nary Pred</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getNarySub <em>Nary Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getOperation <em>Operation</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getOperations <em>Operations</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getPred <em>Pred</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getPromotedOperation <em>Promoted Operation</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getPromotes <em>Promotes</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getRecordItem <em>Record Item</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getReferencedMachine <em>Referenced Machine</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getRefines <em>Refines</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getSees <em>Sees</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getSelect <em>Select</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getSet <em>Set</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getSets <em>Sets</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getSkip <em>Skip</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getThen <em>Then</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getType <em>Type</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getTypeInfos <em>Type Infos</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getUnaryPred <em>Unary Pred</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getUses <em>Uses</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getVARIN <em>VARIN</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getVariant <em>Variant</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getWhen <em>When</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getWhenClauses <em>When Clauses</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getWhile <em>While</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
  /**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see bxml.BxmlPackage#getDocumentRoot_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' name=':mixed'"
   * @generated
   */
  FeatureMap getMixed();

  /**
   * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XMLNS Prefix Map</em>' map.
   * @see bxml.BxmlPackage#getDocumentRoot_XMLNSPrefixMap()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
   *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
   * @generated
   */
  EMap<String, String> getXMLNSPrefixMap();

  /**
   * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XSI Schema Location</em>' map.
   * @see bxml.BxmlPackage#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
   *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   * @generated
   */
  EMap<String, String> getXSISchemaLocation();

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
   * @see bxml.BxmlPackage#getDocumentRoot_AbstractConstants()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Abstract_Constants' namespace='##targetNamespace'"
   * @generated
   */
  AbstractConstantsType getAbstractConstants();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getAbstractConstants <em>Abstract Constants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract Constants</em>' containment reference.
   * @see #getAbstractConstants()
   * @generated
   */
  void setAbstractConstants(AbstractConstantsType value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_AbstractVariables()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Abstract_Variables' namespace='##targetNamespace'"
   * @generated
   */
  AbstractVariablesType getAbstractVariables();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getAbstractVariables <em>Abstract Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract Variables</em>' containment reference.
   * @see #getAbstractVariables()
   * @generated
   */
  void setAbstractVariables(AbstractVariablesType value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_Abstraction()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Abstraction' namespace='##targetNamespace'"
   * @generated
   */
  AbstractionType getAbstraction();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getAbstraction <em>Abstraction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstraction</em>' containment reference.
   * @see #getAbstraction()
   * @generated
   */
  void setAbstraction(AbstractionType value);

  /**
   * Returns the value of the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ANY Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ANY Sub</em>' containment reference.
   * @see #setANYSub(ANYSubType)
   * @see bxml.BxmlPackage#getDocumentRoot_ANYSub()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ANY_Sub' namespace='##targetNamespace'"
   * @generated
   */
  ANYSubType getANYSub();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getANYSub <em>ANY Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ANY Sub</em>' containment reference.
   * @see #getANYSub()
   * @generated
   */
  void setANYSub(ANYSubType value);

  /**
   * Returns the value of the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert Sub</em>' containment reference.
   * @see #setAssertSub(AssertSubType)
   * @see bxml.BxmlPackage#getDocumentRoot_AssertSub()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Assert_Sub' namespace='##targetNamespace'"
   * @generated
   */
  AssertSubType getAssertSub();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getAssertSub <em>Assert Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert Sub</em>' containment reference.
   * @see #getAssertSub()
   * @generated
   */
  void setAssertSub(AssertSubType value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_Assertions()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Assertions' namespace='##targetNamespace'"
   * @generated
   */
  AssertionsType getAssertions();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getAssertions <em>Assertions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assertions</em>' containment reference.
   * @see #getAssertions()
   * @generated
   */
  void setAssertions(AssertionsType value);

  /**
   * Returns the value of the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignement Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignement Sub</em>' containment reference.
   * @see #setAssignementSub(AssignementSubType)
   * @see bxml.BxmlPackage#getDocumentRoot_AssignementSub()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Assignement_Sub' namespace='##targetNamespace'"
   * @generated
   */
  AssignementSubType getAssignementSub();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getAssignementSub <em>Assignement Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignement Sub</em>' containment reference.
   * @see #getAssignementSub()
   * @generated
   */
  void setAssignementSub(AssignementSubType value);

  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(AttrType)
   * @see bxml.BxmlPackage#getDocumentRoot_Attr()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Becomes In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Becomes In</em>' containment reference.
   * @see #setBecomesIn(BecomesInType)
   * @see bxml.BxmlPackage#getDocumentRoot_BecomesIn()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Becomes_In' namespace='##targetNamespace'"
   * @generated
   */
  BecomesInType getBecomesIn();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getBecomesIn <em>Becomes In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Becomes In</em>' containment reference.
   * @see #getBecomesIn()
   * @generated
   */
  void setBecomesIn(BecomesInType value);

  /**
   * Returns the value of the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Becomes Such That</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Becomes Such That</em>' containment reference.
   * @see #setBecomesSuchThat(BecomesSuchThatType)
   * @see bxml.BxmlPackage#getDocumentRoot_BecomesSuchThat()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Becomes_Such_That' namespace='##targetNamespace'"
   * @generated
   */
  BecomesSuchThatType getBecomesSuchThat();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getBecomesSuchThat <em>Becomes Such That</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Becomes Such That</em>' containment reference.
   * @see #getBecomesSuchThat()
   * @generated
   */
  void setBecomesSuchThat(BecomesSuchThatType value);

  /**
   * Returns the value of the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Pred</em>' containment reference.
   * @see #setBinaryPred(BinaryPredType)
   * @see bxml.BxmlPackage#getDocumentRoot_BinaryPred()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Binary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  BinaryPredType getBinaryPred();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getBinaryPred <em>Binary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Pred</em>' containment reference.
   * @see #getBinaryPred()
   * @generated
   */
  void setBinaryPred(BinaryPredType value);

  /**
   * Returns the value of the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloc Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloc Sub</em>' containment reference.
   * @see #setBlocSub(BlocSubType)
   * @see bxml.BxmlPackage#getDocumentRoot_BlocSub()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Bloc_Sub' namespace='##targetNamespace'"
   * @generated
   */
  BlocSubType getBlocSub();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getBlocSub <em>Bloc Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloc Sub</em>' containment reference.
   * @see #getBlocSub()
   * @generated
   */
  void setBlocSub(BlocSubType value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(BodyType3)
   * @see bxml.BxmlPackage#getDocumentRoot_Body()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
   * @generated
   */
  BodyType3 getBody();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BodyType3 value);

  /**
   * Returns the value of the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Exp</em>' containment reference.
   * @see #setBooleanExp(BooleanExpType)
   * @see bxml.BxmlPackage#getDocumentRoot_BooleanExp()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BooleanExpType getBooleanExp();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getBooleanExp <em>Boolean Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Exp</em>' containment reference.
   * @see #getBooleanExp()
   * @generated
   */
  void setBooleanExp(BooleanExpType value);

  /**
   * Returns the value of the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Literal</em>' containment reference.
   * @see #setBooleanLiteral(BooleanLiteralType)
   * @see bxml.BxmlPackage#getDocumentRoot_BooleanLiteral()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace'"
   * @generated
   */
  BooleanLiteralType getBooleanLiteral();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getBooleanLiteral <em>Boolean Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Literal</em>' containment reference.
   * @see #getBooleanLiteral()
   * @generated
   */
  void setBooleanLiteral(BooleanLiteralType value);

  /**
   * Returns the value of the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Sub</em>' containment reference.
   * @see #setCaseSub(CaseSubType)
   * @see bxml.BxmlPackage#getDocumentRoot_CaseSub()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Case_Sub' namespace='##targetNamespace'"
   * @generated
   */
  CaseSubType getCaseSub();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getCaseSub <em>Case Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Sub</em>' containment reference.
   * @see #getCaseSub()
   * @generated
   */
  void setCaseSub(CaseSubType value);

  /**
   * Returns the value of the '<em><b>Choices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choices</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choices</em>' containment reference.
   * @see #setChoices(ChoicesType)
   * @see bxml.BxmlPackage#getDocumentRoot_Choices()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Choices' namespace='##targetNamespace'"
   * @generated
   */
  ChoicesType getChoices();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getChoices <em>Choices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choices</em>' containment reference.
   * @see #getChoices()
   * @generated
   */
  void setChoices(ChoicesType value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_ConcreteConstants()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Concrete_Constants' namespace='##targetNamespace'"
   * @generated
   */
  ConcreteConstantsType getConcreteConstants();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getConcreteConstants <em>Concrete Constants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete Constants</em>' containment reference.
   * @see #getConcreteConstants()
   * @generated
   */
  void setConcreteConstants(ConcreteConstantsType value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_ConcreteVariables()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Concrete_Variables' namespace='##targetNamespace'"
   * @generated
   */
  ConcreteVariablesType getConcreteVariables();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getConcreteVariables <em>Concrete Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete Variables</em>' containment reference.
   * @see #getConcreteVariables()
   * @generated
   */
  void setConcreteVariables(ConcreteVariablesType value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(ConditionType)
   * @see bxml.BxmlPackage#getDocumentRoot_Condition()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
   * @generated
   */
  ConditionType getCondition();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(ConditionType value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference.
   * @see #setConstraints(ConstraintsType)
   * @see bxml.BxmlPackage#getDocumentRoot_Constraints()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Constraints' namespace='##targetNamespace'"
   * @generated
   */
  ConstraintsType getConstraints();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getConstraints <em>Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraints</em>' containment reference.
   * @see #getConstraints()
   * @generated
   */
  void setConstraints(ConstraintsType value);

  /**
   * Returns the value of the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Seq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Seq</em>' containment reference.
   * @see #setEmptySeq(EmptySeqType)
   * @see bxml.BxmlPackage#getDocumentRoot_EmptySeq()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace'"
   * @generated
   */
  EmptySeqType getEmptySeq();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getEmptySeq <em>Empty Seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Seq</em>' containment reference.
   * @see #getEmptySeq()
   * @generated
   */
  void setEmptySeq(EmptySeqType value);

  /**
   * Returns the value of the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Set</em>' containment reference.
   * @see #setEmptySet(EmptySetType)
   * @see bxml.BxmlPackage#getDocumentRoot_EmptySet()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace'"
   * @generated
   */
  EmptySetType getEmptySet();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getEmptySet <em>Empty Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Set</em>' containment reference.
   * @see #getEmptySet()
   * @generated
   */
  void setEmptySet(EmptySetType value);

  /**
   * Returns the value of the '<em><b>Enumerated Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerated Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerated Values</em>' containment reference.
   * @see #setEnumeratedValues(EnumeratedValuesType)
   * @see bxml.BxmlPackage#getDocumentRoot_EnumeratedValues()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Enumerated_Values' namespace='##targetNamespace'"
   * @generated
   */
  EnumeratedValuesType getEnumeratedValues();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getEnumeratedValues <em>Enumerated Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerated Values</em>' containment reference.
   * @see #getEnumeratedValues()
   * @generated
   */
  void setEnumeratedValues(EnumeratedValuesType value);

  /**
   * Returns the value of the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Comparison</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Comparison</em>' containment reference.
   * @see #setExpComparison(ExpComparisonType)
   * @see bxml.BxmlPackage#getDocumentRoot_ExpComparison()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Exp_Comparison' namespace='##targetNamespace'"
   * @generated
   */
  ExpComparisonType getExpComparison();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getExpComparison <em>Exp Comparison</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Comparison</em>' containment reference.
   * @see #getExpComparison()
   * @generated
   */
  void setExpComparison(ExpComparisonType value);

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(ExtendsType)
   * @see bxml.BxmlPackage#getDocumentRoot_Extends()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Extends' namespace='##targetNamespace'"
   * @generated
   */
  ExtendsType getExtends();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(ExtendsType value);

  /**
   * Returns the value of the '<em><b>Generic Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Type</em>' attribute.
   * @see #setGenericType(String)
   * @see bxml.BxmlPackage#getDocumentRoot_GenericType()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Generic_Type' namespace='##targetNamespace'"
   * @generated
   */
  String getGenericType();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getGenericType <em>Generic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Type</em>' attribute.
   * @see #getGenericType()
   * @generated
   */
  void setGenericType(String value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(GuardType)
   * @see bxml.BxmlPackage#getDocumentRoot_Guard()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Guard' namespace='##targetNamespace'"
   * @generated
   */
  GuardType getGuard();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(GuardType value);

  /**
   * Returns the value of the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Sub</em>' containment reference.
   * @see #setIfSub(IfSubType)
   * @see bxml.BxmlPackage#getDocumentRoot_IfSub()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='If_Sub' namespace='##targetNamespace'"
   * @generated
   */
  IfSubType getIfSub();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getIfSub <em>If Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Sub</em>' containment reference.
   * @see #getIfSub()
   * @generated
   */
  void setIfSub(IfSubType value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference.
   * @see #setImports(ImportsType)
   * @see bxml.BxmlPackage#getDocumentRoot_Imports()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Imports' namespace='##targetNamespace'"
   * @generated
   */
  ImportsType getImports();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getImports <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imports</em>' containment reference.
   * @see #getImports()
   * @generated
   */
  void setImports(ImportsType value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference.
   * @see #setIncludes(IncludesType)
   * @see bxml.BxmlPackage#getDocumentRoot_Includes()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Includes' namespace='##targetNamespace'"
   * @generated
   */
  IncludesType getIncludes();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getIncludes <em>Includes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Includes</em>' containment reference.
   * @see #getIncludes()
   * @generated
   */
  void setIncludes(IncludesType value);

  /**
   * Returns the value of the '<em><b>Initialisation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialisation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialisation</em>' containment reference.
   * @see #setInitialisation(InitialisationType)
   * @see bxml.BxmlPackage#getDocumentRoot_Initialisation()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Initialisation' namespace='##targetNamespace'"
   * @generated
   */
  InitialisationType getInitialisation();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getInitialisation <em>Initialisation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialisation</em>' containment reference.
   * @see #getInitialisation()
   * @generated
   */
  void setInitialisation(InitialisationType value);

  /**
   * Returns the value of the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' attribute.
   * @see #setInstance(String)
   * @see bxml.BxmlPackage#getDocumentRoot_Instance()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Instance' namespace='##targetNamespace'"
   * @generated
   */
  String getInstance();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getInstance <em>Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' attribute.
   * @see #getInstance()
   * @generated
   */
  void setInstance(String value);

  /**
   * Returns the value of the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer Literal</em>' containment reference.
   * @see #setIntegerLiteral(IntegerLiteralType)
   * @see bxml.BxmlPackage#getDocumentRoot_IntegerLiteral()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace'"
   * @generated
   */
  IntegerLiteralType getIntegerLiteral();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getIntegerLiteral <em>Integer Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer Literal</em>' containment reference.
   * @see #getIntegerLiteral()
   * @generated
   */
  void setIntegerLiteral(IntegerLiteralType value);

  /**
   * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invariant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariant</em>' containment reference.
   * @see #setInvariant(InvariantType)
   * @see bxml.BxmlPackage#getDocumentRoot_Invariant()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Invariant' namespace='##targetNamespace'"
   * @generated
   */
  InvariantType getInvariant();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getInvariant <em>Invariant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invariant</em>' containment reference.
   * @see #getInvariant()
   * @generated
   */
  void setInvariant(InvariantType value);

  /**
   * Returns the value of the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LET Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LET Sub</em>' containment reference.
   * @see #setLETSub(LETSubType)
   * @see bxml.BxmlPackage#getDocumentRoot_LETSub()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='LET_Sub' namespace='##targetNamespace'"
   * @generated
   */
  LETSubType getLETSub();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getLETSub <em>LET Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LET Sub</em>' containment reference.
   * @see #getLETSub()
   * @generated
   */
  void setLETSub(LETSubType value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_LocalOperations()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Local_Operations' namespace='##targetNamespace'"
   * @generated
   */
  LocalOperationsType getLocalOperations();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getLocalOperations <em>Local Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Operations</em>' containment reference.
   * @see #getLocalOperations()
   * @generated
   */
  void setLocalOperations(LocalOperationsType value);

  /**
   * Returns the value of the '<em><b>Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine</em>' containment reference.
   * @see #setMachine(MachineType)
   * @see bxml.BxmlPackage#getDocumentRoot_Machine()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Machine' namespace='##targetNamespace'"
   * @generated
   */
  MachineType getMachine();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getMachine <em>Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine</em>' containment reference.
   * @see #getMachine()
   * @generated
   */
  void setMachine(MachineType value);

  /**
   * Returns the value of the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Exp</em>' containment reference.
   * @see #setNaryExp(NaryExpType)
   * @see bxml.BxmlPackage#getDocumentRoot_NaryExp()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpType getNaryExp();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getNaryExp <em>Nary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nary Exp</em>' containment reference.
   * @see #getNaryExp()
   * @generated
   */
  void setNaryExp(NaryExpType value);

  /**
   * Returns the value of the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Pred</em>' containment reference.
   * @see #setNaryPred(NaryPredType)
   * @see bxml.BxmlPackage#getDocumentRoot_NaryPred()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Nary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  NaryPredType getNaryPred();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getNaryPred <em>Nary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nary Pred</em>' containment reference.
   * @see #getNaryPred()
   * @generated
   */
  void setNaryPred(NaryPredType value);

  /**
   * Returns the value of the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Sub</em>' containment reference.
   * @see #setNarySub(NarySubType)
   * @see bxml.BxmlPackage#getDocumentRoot_NarySub()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Nary_Sub' namespace='##targetNamespace'"
   * @generated
   */
  NarySubType getNarySub();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getNarySub <em>Nary Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nary Sub</em>' containment reference.
   * @see #getNarySub()
   * @generated
   */
  void setNarySub(NarySubType value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference.
   * @see #setOperation(OperationType)
   * @see bxml.BxmlPackage#getDocumentRoot_Operation()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Operation' namespace='##targetNamespace'"
   * @generated
   */
  OperationType getOperation();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(OperationType value);

  /**
   * Returns the value of the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Call</em>' containment reference.
   * @see #setOperationCall(OperationCallType)
   * @see bxml.BxmlPackage#getDocumentRoot_OperationCall()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Operation_Call' namespace='##targetNamespace'"
   * @generated
   */
  OperationCallType getOperationCall();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getOperationCall <em>Operation Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Call</em>' containment reference.
   * @see #getOperationCall()
   * @generated
   */
  void setOperationCall(OperationCallType value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_Operations()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Operations' namespace='##targetNamespace'"
   * @generated
   */
  OperationsType getOperations();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getOperations <em>Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operations</em>' containment reference.
   * @see #getOperations()
   * @generated
   */
  void setOperations(OperationsType value);

  /**
   * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precondition</em>' containment reference.
   * @see #setPrecondition(PreconditionType)
   * @see bxml.BxmlPackage#getDocumentRoot_Precondition()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Precondition' namespace='##targetNamespace'"
   * @generated
   */
  PreconditionType getPrecondition();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getPrecondition <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precondition</em>' containment reference.
   * @see #getPrecondition()
   * @generated
   */
  void setPrecondition(PreconditionType value);

  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference.
   * @see #setPred(PredType)
   * @see bxml.BxmlPackage#getDocumentRoot_Pred()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Pred' namespace='##targetNamespace'"
   * @generated
   */
  PredType getPred();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getPred <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' containment reference.
   * @see #getPred()
   * @generated
   */
  void setPred(PredType value);

  /**
   * Returns the value of the '<em><b>Promoted Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promoted Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promoted Operation</em>' containment reference.
   * @see #setPromotedOperation(PromotedOperationType)
   * @see bxml.BxmlPackage#getDocumentRoot_PromotedOperation()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Promoted_Operation' namespace='##targetNamespace'"
   * @generated
   */
  PromotedOperationType getPromotedOperation();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getPromotedOperation <em>Promoted Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Promoted Operation</em>' containment reference.
   * @see #getPromotedOperation()
   * @generated
   */
  void setPromotedOperation(PromotedOperationType value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_Promotes()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Promotes' namespace='##targetNamespace'"
   * @generated
   */
  PromotesType getPromotes();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getPromotes <em>Promotes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Promotes</em>' containment reference.
   * @see #getPromotes()
   * @generated
   */
  void setPromotes(PromotesType value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(PropertiesType)
   * @see bxml.BxmlPackage#getDocumentRoot_Properties()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Properties' namespace='##targetNamespace'"
   * @generated
   */
  PropertiesType getProperties();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(PropertiesType value);

  /**
   * Returns the value of the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Exp</em>' containment reference.
   * @see #setQuantifiedExp(QuantifiedExpType)
   * @see bxml.BxmlPackage#getDocumentRoot_QuantifiedExp()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpType getQuantifiedExp();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getQuantifiedExp <em>Quantified Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Exp</em>' containment reference.
   * @see #getQuantifiedExp()
   * @generated
   */
  void setQuantifiedExp(QuantifiedExpType value);

  /**
   * Returns the value of the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Pred</em>' containment reference.
   * @see #setQuantifiedPred(QuantifiedPredType)
   * @see bxml.BxmlPackage#getDocumentRoot_QuantifiedPred()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Quantified_Pred' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedPredType getQuantifiedPred();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getQuantifiedPred <em>Quantified Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Pred</em>' containment reference.
   * @see #getQuantifiedPred()
   * @generated
   */
  void setQuantifiedPred(QuantifiedPredType value);

  /**
   * Returns the value of the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Set</em>' containment reference.
   * @see #setQuantifiedSet(QuantifiedSetType)
   * @see bxml.BxmlPackage#getDocumentRoot_QuantifiedSet()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedSetType getQuantifiedSet();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getQuantifiedSet <em>Quantified Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Set</em>' containment reference.
   * @see #getQuantifiedSet()
   * @generated
   */
  void setQuantifiedSet(QuantifiedSetType value);

  /**
   * Returns the value of the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' containment reference.
   * @see #setRecord(RecordType)
   * @see bxml.BxmlPackage#getDocumentRoot_Record()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  RecordType getRecord();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getRecord <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' containment reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(RecordType value);

  /**
   * Returns the value of the '<em><b>Record Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Item</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Item</em>' containment reference.
   * @see #setRecordItem(RecordItemType)
   * @see bxml.BxmlPackage#getDocumentRoot_RecordItem()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Record_Item' namespace='##targetNamespace'"
   * @generated
   */
  RecordItemType getRecordItem();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getRecordItem <em>Record Item</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Item</em>' containment reference.
   * @see #getRecordItem()
   * @generated
   */
  void setRecordItem(RecordItemType value);

  /**
   * Returns the value of the '<em><b>Referenced Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Machine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Machine</em>' containment reference.
   * @see #setReferencedMachine(ReferencedMachineType)
   * @see bxml.BxmlPackage#getDocumentRoot_ReferencedMachine()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Referenced_Machine' namespace='##targetNamespace'"
   * @generated
   */
  ReferencedMachineType getReferencedMachine();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getReferencedMachine <em>Referenced Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced Machine</em>' containment reference.
   * @see #getReferencedMachine()
   * @generated
   */
  void setReferencedMachine(ReferencedMachineType value);

  /**
   * Returns the value of the '<em><b>Refines</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refines</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refines</em>' containment reference.
   * @see #setRefines(RefinesType)
   * @see bxml.BxmlPackage#getDocumentRoot_Refines()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Refines' namespace='##targetNamespace'"
   * @generated
   */
  RefinesType getRefines();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getRefines <em>Refines</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refines</em>' containment reference.
   * @see #getRefines()
   * @generated
   */
  void setRefines(RefinesType value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_Sees()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Sees' namespace='##targetNamespace'"
   * @generated
   */
  SeesType getSees();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getSees <em>Sees</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sees</em>' containment reference.
   * @see #getSees()
   * @generated
   */
  void setSees(SeesType value);

  /**
   * Returns the value of the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' containment reference.
   * @see #setSelect(SelectType)
   * @see bxml.BxmlPackage#getDocumentRoot_Select()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Select' namespace='##targetNamespace'"
   * @generated
   */
  SelectType getSelect();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getSelect <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' containment reference.
   * @see #getSelect()
   * @generated
   */
  void setSelect(SelectType value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(SetType1)
   * @see bxml.BxmlPackage#getDocumentRoot_Set()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace'"
   * @generated
   */
  SetType1 getSet();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(SetType1 value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_Sets()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Sets' namespace='##targetNamespace'"
   * @generated
   */
  SetsType getSets();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getSets <em>Sets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sets</em>' containment reference.
   * @see #getSets()
   * @generated
   */
  void setSets(SetsType value);

  /**
   * Returns the value of the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip</em>' containment reference.
   * @see #setSkip(SkipType)
   * @see bxml.BxmlPackage#getDocumentRoot_Skip()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Skip' namespace='##targetNamespace'"
   * @generated
   */
  SkipType getSkip();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getSkip <em>Skip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip</em>' containment reference.
   * @see #getSkip()
   * @generated
   */
  void setSkip(SkipType value);

  /**
   * Returns the value of the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STRING Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STRING Literal</em>' containment reference.
   * @see #setSTRINGLiteral(STRINGLiteralType)
   * @see bxml.BxmlPackage#getDocumentRoot_STRINGLiteral()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace'"
   * @generated
   */
  STRINGLiteralType getSTRINGLiteral();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getSTRINGLiteral <em>STRING Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>STRING Literal</em>' containment reference.
   * @see #getSTRINGLiteral()
   * @generated
   */
  void setSTRINGLiteral(STRINGLiteralType value);

  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference.
   * @see #setStruct(StructType)
   * @see bxml.BxmlPackage#getDocumentRoot_Struct()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
  void setStruct(StructType value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(ThenType)
   * @see bxml.BxmlPackage#getDocumentRoot_Then()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Then' namespace='##targetNamespace'"
   * @generated
   */
  ThenType getThen();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(ThenType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeInfo)
   * @see bxml.BxmlPackage#getDocumentRoot_Type()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
   * @generated
   */
  TypeInfo getType();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeInfo value);

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
   * @see bxml.BxmlPackage#getDocumentRoot_TypeInfos()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='TypeInfos' namespace='##targetNamespace'"
   * @generated
   */
  TypeInfosType getTypeInfos();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getTypeInfos <em>Type Infos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Infos</em>' containment reference.
   * @see #getTypeInfos()
   * @generated
   */
  void setTypeInfos(TypeInfosType value);

  /**
   * Returns the value of the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Pred</em>' containment reference.
   * @see #setUnaryPred(UnaryPredType)
   * @see bxml.BxmlPackage#getDocumentRoot_UnaryPred()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Unary_Pred' namespace='##targetNamespace'"
   * @generated
   */
  UnaryPredType getUnaryPred();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getUnaryPred <em>Unary Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Pred</em>' containment reference.
   * @see #getUnaryPred()
   * @generated
   */
  void setUnaryPred(UnaryPredType value);

  /**
   * Returns the value of the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uses</em>' containment reference.
   * @see #setUses(UsesType)
   * @see bxml.BxmlPackage#getDocumentRoot_Uses()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Uses' namespace='##targetNamespace'"
   * @generated
   */
  UsesType getUses();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getUses <em>Uses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uses</em>' containment reference.
   * @see #getUses()
   * @generated
   */
  void setUses(UsesType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ValueType)
   * @see bxml.BxmlPackage#getDocumentRoot_Value()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
   * @generated
   */
  ValueType getValue();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueType value);

  /**
   * Returns the value of the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VARIN</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VARIN</em>' containment reference.
   * @see #setVARIN(VARINType)
   * @see bxml.BxmlPackage#getDocumentRoot_VARIN()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='VAR_IN' namespace='##targetNamespace'"
   * @generated
   */
  VARINType getVARIN();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getVARIN <em>VARIN</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VARIN</em>' containment reference.
   * @see #getVARIN()
   * @generated
   */
  void setVARIN(VARINType value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(VariablesType1)
   * @see bxml.BxmlPackage#getDocumentRoot_Variables()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Variables' namespace='##targetNamespace'"
   * @generated
   */
  VariablesType1 getVariables();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(VariablesType1 value);

  /**
   * Returns the value of the '<em><b>Variant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant</em>' containment reference.
   * @see #setVariant(VariantType)
   * @see bxml.BxmlPackage#getDocumentRoot_Variant()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Variant' namespace='##targetNamespace'"
   * @generated
   */
  VariantType getVariant();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getVariant <em>Variant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' containment reference.
   * @see #getVariant()
   * @generated
   */
  void setVariant(VariantType value);

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference.
   * @see #setWhen(WhenType)
   * @see bxml.BxmlPackage#getDocumentRoot_When()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='When' namespace='##targetNamespace'"
   * @generated
   */
  WhenType getWhen();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getWhen <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' containment reference.
   * @see #getWhen()
   * @generated
   */
  void setWhen(WhenType value);

  /**
   * Returns the value of the '<em><b>When Clauses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Clauses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Clauses</em>' containment reference.
   * @see #setWhenClauses(WhenClausesType)
   * @see bxml.BxmlPackage#getDocumentRoot_WhenClauses()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='When_Clauses' namespace='##targetNamespace'"
   * @generated
   */
  WhenClausesType getWhenClauses();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getWhenClauses <em>When Clauses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When Clauses</em>' containment reference.
   * @see #getWhenClauses()
   * @generated
   */
  void setWhenClauses(WhenClausesType value);

  /**
   * Returns the value of the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While</em>' containment reference.
   * @see #setWhile(WhileType)
   * @see bxml.BxmlPackage#getDocumentRoot_While()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='While' namespace='##targetNamespace'"
   * @generated
   */
  WhileType getWhile();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getWhile <em>While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While</em>' containment reference.
   * @see #getWhile()
   * @generated
   */
  void setWhile(WhileType value);

} // DocumentRoot
