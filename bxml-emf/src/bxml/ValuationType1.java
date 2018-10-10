/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valuation Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ValuationType1#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.ValuationType1#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.ValuationType1#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.ValuationType1#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.ValuationType1#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.ValuationType1#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.ValuationType1#getId <em>Id</em>}</li>
 *   <li>{@link bxml.ValuationType1#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.ValuationType1#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.ValuationType1#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.ValuationType1#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.ValuationType1#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.ValuationType1#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.ValuationType1#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.ValuationType1#getIdent <em>Ident</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getValuationType1()
 * @model extendedMetaData="name='Valuation_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ValuationType1 extends EObject {
  /**
   * Returns the value of the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Exp</em>' containment reference.
   * @see #setBinaryExp(BinaryExpressionType)
   * @see bxml.BxmlPackage#getValuationType1_BinaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BinaryExpressionType getBinaryExp();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getBinaryExp <em>Binary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Exp</em>' containment reference.
   * @see #getBinaryExp()
   * @generated
   */
  void setBinaryExp(BinaryExpressionType value);

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
   * @see bxml.BxmlPackage#getValuationType1_NaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpType getNaryExp();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getNaryExp <em>Nary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nary Exp</em>' containment reference.
   * @see #getNaryExp()
   * @generated
   */
  void setNaryExp(NaryExpType value);

  /**
   * Returns the value of the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Literal</em>' containment reference.
   * @see #setBooleanLiteral(IdentifierType)
   * @see bxml.BxmlPackage#getValuationType1_BooleanLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace'"
   * @generated
   */
  IdentifierType getBooleanLiteral();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getBooleanLiteral <em>Boolean Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Literal</em>' containment reference.
   * @see #getBooleanLiteral()
   * @generated
   */
  void setBooleanLiteral(IdentifierType value);

  /**
   * Returns the value of the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Exp</em>' containment reference.
   * @see #setBooleanExp(PredicateType)
   * @see bxml.BxmlPackage#getValuationType1_BooleanExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getBooleanExp();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getBooleanExp <em>Boolean Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Exp</em>' containment reference.
   * @see #getBooleanExp()
   * @generated
   */
  void setBooleanExp(PredicateType value);

  /**
   * Returns the value of the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Set</em>' containment reference.
   * @see #setEmptySet(TerminalType)
   * @see bxml.BxmlPackage#getValuationType1_EmptySet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace'"
   * @generated
   */
  TerminalType getEmptySet();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getEmptySet <em>Empty Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Set</em>' containment reference.
   * @see #getEmptySet()
   * @generated
   */
  void setEmptySet(TerminalType value);

  /**
   * Returns the value of the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Seq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Seq</em>' containment reference.
   * @see #setEmptySeq(TerminalType)
   * @see bxml.BxmlPackage#getValuationType1_EmptySeq()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace'"
   * @generated
   */
  TerminalType getEmptySeq();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getEmptySeq <em>Empty Seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Seq</em>' containment reference.
   * @see #getEmptySeq()
   * @generated
   */
  void setEmptySeq(TerminalType value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(IdentifierType)
   * @see bxml.BxmlPackage#getValuationType1_Id()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  IdentifierType getId();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(IdentifierType value);

  /**
   * Returns the value of the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer Literal</em>' containment reference.
   * @see #setIntegerLiteral(LiteralType)
   * @see bxml.BxmlPackage#getValuationType1_IntegerLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace'"
   * @generated
   */
  LiteralType getIntegerLiteral();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getIntegerLiteral <em>Integer Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer Literal</em>' containment reference.
   * @see #getIntegerLiteral()
   * @generated
   */
  void setIntegerLiteral(LiteralType value);

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
   * @see bxml.BxmlPackage#getValuationType1_QuantifiedExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpType getQuantifiedExp();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getQuantifiedExp <em>Quantified Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Exp</em>' containment reference.
   * @see #getQuantifiedExp()
   * @generated
   */
  void setQuantifiedExp(QuantifiedExpType value);

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
   * @see bxml.BxmlPackage#getValuationType1_QuantifiedSet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedSetType getQuantifiedSet();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getQuantifiedSet <em>Quantified Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Set</em>' containment reference.
   * @see #getQuantifiedSet()
   * @generated
   */
  void setQuantifiedSet(QuantifiedSetType value);

  /**
   * Returns the value of the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STRING Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STRING Literal</em>' containment reference.
   * @see #setSTRINGLiteral(StringLiteralType)
   * @see bxml.BxmlPackage#getValuationType1_STRINGLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace'"
   * @generated
   */
  StringLiteralType getSTRINGLiteral();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getSTRINGLiteral <em>STRING Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>STRING Literal</em>' containment reference.
   * @see #getSTRINGLiteral()
   * @generated
   */
  void setSTRINGLiteral(StringLiteralType value);

  /**
   * Returns the value of the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Exp</em>' containment reference.
   * @see #setUnaryExp(UnaryExpressionType)
   * @see bxml.BxmlPackage#getValuationType1_UnaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpressionType getUnaryExp();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getUnaryExp <em>Unary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Exp</em>' containment reference.
   * @see #getUnaryExp()
   * @generated
   */
  void setUnaryExp(UnaryExpressionType value);

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
   * @see bxml.BxmlPackage#getValuationType1_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
  void setStruct(StructType value);

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
   * @see bxml.BxmlPackage#getValuationType1_Record()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  RecordType getRecord();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getRecord <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' containment reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(RecordType value);

  /**
   * Returns the value of the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' attribute.
   * @see #setIdent(String)
   * @see bxml.BxmlPackage#getValuationType1_Ident()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='ident' namespace='##targetNamespace'"
   * @generated
   */
  String getIdent();

  /**
   * Sets the value of the '{@link bxml.ValuationType1#getIdent <em>Ident</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' attribute.
   * @see #getIdent()
   * @generated
   */
  void setIdent(String value);

} // ValuationType1
