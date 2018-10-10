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
 *   <li>{@link bxml.DocumentRoot#getANYSub <em>ANY Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getBecomesIn <em>Becomes In</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getBinarySub <em>Binary Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getCaseSub <em>Case Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getLETSub <em>LET Sub</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getMachine <em>Machine</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getOperation <em>Operation</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getQuantifiedPred <em>Quantified Pred</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getSelect <em>Select</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.DocumentRoot#getVARIN <em>VARIN</em>}</li>
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
   * Returns the value of the '<em><b>Binary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Sub</em>' containment reference.
   * @see #setBinarySub(BinarySubType)
   * @see bxml.BxmlPackage#getDocumentRoot_BinarySub()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Binary_Sub' namespace='##targetNamespace'"
   * @generated
   */
  BinarySubType getBinarySub();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getBinarySub <em>Binary Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Sub</em>' containment reference.
   * @see #getBinarySub()
   * @generated
   */
  void setBinarySub(BinarySubType value);

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
   * Returns the value of the '<em><b>Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine</em>' containment reference.
   * @see #setMachine(MachineType1)
   * @see bxml.BxmlPackage#getDocumentRoot_Machine()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Machine' namespace='##targetNamespace'"
   * @generated
   */
  MachineType1 getMachine();

  /**
   * Sets the value of the '{@link bxml.DocumentRoot#getMachine <em>Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine</em>' containment reference.
   * @see #getMachine()
   * @generated
   */
  void setMachine(MachineType1 value);

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
