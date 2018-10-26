/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameters Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.InputParametersType1#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getExpression <em>Expression</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getId <em>Id</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.InputParametersType1#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getInputParametersType1()
 * @model extendedMetaData="name='Input_Parameters_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface InputParametersType1 extends EObject {
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
   * @see bxml.BxmlPackage#getInputParametersType1_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.InputParametersType1#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute list.
   * @see bxml.BxmlPackage#getInputParametersType1_Expression()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='Expression:1'"
   * @generated
   */
  FeatureMap getExpression();

  /**
   * Returns the value of the '<em><b>Binary Exp</b></em>' containment reference list.
   * The list contents are of type {@link bxml.BynaryExpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Exp</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_BinaryExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<BynaryExpType> getBinaryExp();

  /**
   * Returns the value of the '<em><b>Nary Exp</b></em>' containment reference list.
   * The list contents are of type {@link bxml.NaryExpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Exp</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_NaryExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<NaryExpType> getNaryExp();

  /**
   * Returns the value of the '<em><b>Boolean Literal</b></em>' containment reference list.
   * The list contents are of type {@link bxml.BooleanLiteralType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Literal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Literal</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_BooleanLiteral()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<BooleanLiteralType> getBooleanLiteral();

  /**
   * Returns the value of the '<em><b>Boolean Exp</b></em>' containment reference list.
   * The list contents are of type {@link bxml.BooleanExpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Exp</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_BooleanExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<BooleanExpType> getBooleanExp();

  /**
   * Returns the value of the '<em><b>Empty Set</b></em>' containment reference list.
   * The list contents are of type {@link bxml.EmptySetType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Set</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_EmptySet()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<EmptySetType> getEmptySet();

  /**
   * Returns the value of the '<em><b>Empty Seq</b></em>' containment reference list.
   * The list contents are of type {@link bxml.EmptySeqType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Seq</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Seq</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_EmptySeq()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<EmptySeqType> getEmptySeq();

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference list.
   * The list contents are of type {@link bxml.Identifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_Id()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<Identifier> getId();

  /**
   * Returns the value of the '<em><b>Integer Literal</b></em>' containment reference list.
   * The list contents are of type {@link bxml.IntegerLiteralType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer Literal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer Literal</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_IntegerLiteral()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<IntegerLiteralType> getIntegerLiteral();

  /**
   * Returns the value of the '<em><b>Quantified Exp</b></em>' containment reference list.
   * The list contents are of type {@link bxml.QuantifiedExpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Exp</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_QuantifiedExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<QuantifiedExpType> getQuantifiedExp();

  /**
   * Returns the value of the '<em><b>Quantified Set</b></em>' containment reference list.
   * The list contents are of type {@link bxml.QuantifiedSetType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Set</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_QuantifiedSet()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<QuantifiedSetType> getQuantifiedSet();

  /**
   * Returns the value of the '<em><b>STRING Literal</b></em>' containment reference list.
   * The list contents are of type {@link bxml.STRINGLiteralType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STRING Literal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STRING Literal</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_STRINGLiteral()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<STRINGLiteralType> getSTRINGLiteral();

  /**
   * Returns the value of the '<em><b>Unary Exp</b></em>' containment reference list.
   * The list contents are of type {@link bxml.UnaryExpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Exp</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_UnaryExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<UnaryExpType> getUnaryExp();

  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference list.
   * The list contents are of type {@link bxml.StructType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_Struct()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<StructType> getStruct();

  /**
   * Returns the value of the '<em><b>Record</b></em>' containment reference list.
   * The list contents are of type {@link bxml.RecordType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' containment reference list.
   * @see bxml.BxmlPackage#getInputParametersType1_Record()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace' group='Expression:1'"
   * @generated
   */
  EList<RecordType> getRecord();

} // InputParametersType1
