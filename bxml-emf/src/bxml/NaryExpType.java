/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nary Exp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.NaryExpType#getExp <em>Exp</em>}</li>
 *   <li>{@link bxml.NaryExpType#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.NaryExpType#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.NaryExpType#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.NaryExpType#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.NaryExpType#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.NaryExpType#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.NaryExpType#getId <em>Id</em>}</li>
 *   <li>{@link bxml.NaryExpType#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.NaryExpType#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.NaryExpType#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.NaryExpType#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.NaryExpType#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.NaryExpType#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.NaryExpType#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.NaryExpType#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getNaryExpType()
 * @model extendedMetaData="name='Nary_Exp_._type' kind='elementOnly'"
 * @generated
 */
public interface NaryExpType extends EObject {
  /**
   * Returns the value of the '<em><b>Exp</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' attribute list.
   * @see bxml.BxmlPackage#getNaryExpType_Exp()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='Exp:0'"
   * @generated
   */
  FeatureMap getExp();

  /**
   * Returns the value of the '<em><b>Binary Exp</b></em>' containment reference list.
   * The list contents are of type {@link bxml.BinaryExpressionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Exp</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryExpType_BinaryExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<BinaryExpressionType> getBinaryExp();

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
   * @see bxml.BxmlPackage#getNaryExpType_NaryExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<NaryExpType> getNaryExp();

  /**
   * Returns the value of the '<em><b>Boolean Literal</b></em>' containment reference list.
   * The list contents are of type {@link bxml.IdentifierType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Literal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Literal</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryExpType_BooleanLiteral()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<IdentifierType> getBooleanLiteral();

  /**
   * Returns the value of the '<em><b>Boolean Exp</b></em>' containment reference list.
   * The list contents are of type {@link bxml.PredicateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Exp</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryExpType_BooleanExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<PredicateType> getBooleanExp();

  /**
   * Returns the value of the '<em><b>Empty Set</b></em>' containment reference list.
   * The list contents are of type {@link bxml.TerminalType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Set</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Set</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryExpType_EmptySet()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<TerminalType> getEmptySet();

  /**
   * Returns the value of the '<em><b>Empty Seq</b></em>' containment reference list.
   * The list contents are of type {@link bxml.TerminalType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Seq</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Seq</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryExpType_EmptySeq()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<TerminalType> getEmptySeq();

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference list.
   * The list contents are of type {@link bxml.IdentifierType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryExpType_Id()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<IdentifierType> getId();

  /**
   * Returns the value of the '<em><b>Integer Literal</b></em>' containment reference list.
   * The list contents are of type {@link bxml.LiteralType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer Literal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer Literal</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryExpType_IntegerLiteral()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<LiteralType> getIntegerLiteral();

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
   * @see bxml.BxmlPackage#getNaryExpType_QuantifiedExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace' group='Exp:0'"
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
   * @see bxml.BxmlPackage#getNaryExpType_QuantifiedSet()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<QuantifiedSetType> getQuantifiedSet();

  /**
   * Returns the value of the '<em><b>STRING Literal</b></em>' containment reference list.
   * The list contents are of type {@link bxml.StringLiteralType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STRING Literal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STRING Literal</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryExpType_STRINGLiteral()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<StringLiteralType> getSTRINGLiteral();

  /**
   * Returns the value of the '<em><b>Unary Exp</b></em>' containment reference list.
   * The list contents are of type {@link bxml.UnaryExpressionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Exp</em>' containment reference list.
   * @see bxml.BxmlPackage#getNaryExpType_UnaryExp()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<UnaryExpressionType> getUnaryExp();

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
   * @see bxml.BxmlPackage#getNaryExpType_Struct()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace' group='Exp:0'"
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
   * @see bxml.BxmlPackage#getNaryExpType_Record()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace' group='Exp:0'"
   * @generated
   */
  EList<RecordType> getRecord();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.NaryExpOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.NaryExpOp
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(NaryExpOp)
   * @see bxml.BxmlPackage#getNaryExpType_Op()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpOp getOp();

  /**
   * Sets the value of the '{@link bxml.NaryExpType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.NaryExpOp
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(NaryExpOp value);

  /**
   * Unsets the value of the '{@link bxml.NaryExpType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(NaryExpOp)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.NaryExpType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(NaryExpOp)
   * @generated
   */
  boolean isSetOp();

} // NaryExpType
