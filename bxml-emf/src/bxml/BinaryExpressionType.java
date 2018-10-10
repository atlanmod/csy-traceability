/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.BinaryExpressionType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getId <em>Id</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getBinaryExp1 <em>Binary Exp1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getNaryExp1 <em>Nary Exp1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getBooleanLiteral1 <em>Boolean Literal1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getBooleanExp1 <em>Boolean Exp1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getEmptySet1 <em>Empty Set1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getEmptySeq1 <em>Empty Seq1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getId1 <em>Id1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getIntegerLiteral1 <em>Integer Literal1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getQuantifiedExp1 <em>Quantified Exp1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getQuantifiedSet1 <em>Quantified Set1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getSTRINGLiteral1 <em>STRING Literal1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getUnaryExp1 <em>Unary Exp1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getStruct1 <em>Struct1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getRecord1 <em>Record1</em>}</li>
 *   <li>{@link bxml.BinaryExpressionType#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getBinaryExpressionType()
 * @model extendedMetaData="name='Binary_Expression_type' kind='elementOnly'"
 * @generated
 */
public interface BinaryExpressionType extends EObject {
  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(AttributesType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

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
   * @see bxml.BxmlPackage#getBinaryExpressionType_BinaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BinaryExpressionType getBinaryExp();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getBinaryExp <em>Binary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_NaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpType getNaryExp();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getNaryExp <em>Nary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_BooleanLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace'"
   * @generated
   */
  IdentifierType getBooleanLiteral();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getBooleanLiteral <em>Boolean Literal</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_BooleanExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getBooleanExp();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getBooleanExp <em>Boolean Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_EmptySet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace'"
   * @generated
   */
  TerminalType getEmptySet();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getEmptySet <em>Empty Set</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_EmptySeq()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace'"
   * @generated
   */
  TerminalType getEmptySeq();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getEmptySeq <em>Empty Seq</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_Id()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  IdentifierType getId();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getId <em>Id</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_IntegerLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace'"
   * @generated
   */
  LiteralType getIntegerLiteral();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getIntegerLiteral <em>Integer Literal</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_QuantifiedExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpType getQuantifiedExp();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getQuantifiedExp <em>Quantified Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_QuantifiedSet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedSetType getQuantifiedSet();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getQuantifiedSet <em>Quantified Set</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_STRINGLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace'"
   * @generated
   */
  StringLiteralType getSTRINGLiteral();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getSTRINGLiteral <em>STRING Literal</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_UnaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpressionType getUnaryExp();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getUnaryExp <em>Unary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getStruct <em>Struct</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBinaryExpressionType_Record()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  RecordType getRecord();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getRecord <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' containment reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(RecordType value);

  /**
   * Returns the value of the '<em><b>Binary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Exp1</em>' containment reference.
   * @see #setBinaryExp1(BinaryExpressionType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_BinaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BinaryExpressionType getBinaryExp1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getBinaryExp1 <em>Binary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Exp1</em>' containment reference.
   * @see #getBinaryExp1()
   * @generated
   */
  void setBinaryExp1(BinaryExpressionType value);

  /**
   * Returns the value of the '<em><b>Nary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Exp1</em>' containment reference.
   * @see #setNaryExp1(NaryExpType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_NaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpType getNaryExp1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getNaryExp1 <em>Nary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nary Exp1</em>' containment reference.
   * @see #getNaryExp1()
   * @generated
   */
  void setNaryExp1(NaryExpType value);

  /**
   * Returns the value of the '<em><b>Boolean Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Literal1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Literal1</em>' containment reference.
   * @see #setBooleanLiteral1(IdentifierType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_BooleanLiteral1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace'"
   * @generated
   */
  IdentifierType getBooleanLiteral1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getBooleanLiteral1 <em>Boolean Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Literal1</em>' containment reference.
   * @see #getBooleanLiteral1()
   * @generated
   */
  void setBooleanLiteral1(IdentifierType value);

  /**
   * Returns the value of the '<em><b>Boolean Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Exp1</em>' containment reference.
   * @see #setBooleanExp1(PredicateType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_BooleanExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getBooleanExp1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getBooleanExp1 <em>Boolean Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Exp1</em>' containment reference.
   * @see #getBooleanExp1()
   * @generated
   */
  void setBooleanExp1(PredicateType value);

  /**
   * Returns the value of the '<em><b>Empty Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Set1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Set1</em>' containment reference.
   * @see #setEmptySet1(TerminalType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_EmptySet1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace'"
   * @generated
   */
  TerminalType getEmptySet1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getEmptySet1 <em>Empty Set1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Set1</em>' containment reference.
   * @see #getEmptySet1()
   * @generated
   */
  void setEmptySet1(TerminalType value);

  /**
   * Returns the value of the '<em><b>Empty Seq1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Seq1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Seq1</em>' containment reference.
   * @see #setEmptySeq1(TerminalType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_EmptySeq1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace'"
   * @generated
   */
  TerminalType getEmptySeq1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getEmptySeq1 <em>Empty Seq1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Seq1</em>' containment reference.
   * @see #getEmptySeq1()
   * @generated
   */
  void setEmptySeq1(TerminalType value);

  /**
   * Returns the value of the '<em><b>Id1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id1</em>' containment reference.
   * @see #setId1(IdentifierType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_Id1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  IdentifierType getId1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getId1 <em>Id1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id1</em>' containment reference.
   * @see #getId1()
   * @generated
   */
  void setId1(IdentifierType value);

  /**
   * Returns the value of the '<em><b>Integer Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer Literal1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer Literal1</em>' containment reference.
   * @see #setIntegerLiteral1(LiteralType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_IntegerLiteral1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace'"
   * @generated
   */
  LiteralType getIntegerLiteral1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getIntegerLiteral1 <em>Integer Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer Literal1</em>' containment reference.
   * @see #getIntegerLiteral1()
   * @generated
   */
  void setIntegerLiteral1(LiteralType value);

  /**
   * Returns the value of the '<em><b>Quantified Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Exp1</em>' containment reference.
   * @see #setQuantifiedExp1(QuantifiedExpType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_QuantifiedExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpType getQuantifiedExp1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getQuantifiedExp1 <em>Quantified Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Exp1</em>' containment reference.
   * @see #getQuantifiedExp1()
   * @generated
   */
  void setQuantifiedExp1(QuantifiedExpType value);

  /**
   * Returns the value of the '<em><b>Quantified Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantified Set1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantified Set1</em>' containment reference.
   * @see #setQuantifiedSet1(QuantifiedSetType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_QuantifiedSet1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedSetType getQuantifiedSet1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getQuantifiedSet1 <em>Quantified Set1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantified Set1</em>' containment reference.
   * @see #getQuantifiedSet1()
   * @generated
   */
  void setQuantifiedSet1(QuantifiedSetType value);

  /**
   * Returns the value of the '<em><b>STRING Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>STRING Literal1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>STRING Literal1</em>' containment reference.
   * @see #setSTRINGLiteral1(StringLiteralType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_STRINGLiteral1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace'"
   * @generated
   */
  StringLiteralType getSTRINGLiteral1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getSTRINGLiteral1 <em>STRING Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>STRING Literal1</em>' containment reference.
   * @see #getSTRINGLiteral1()
   * @generated
   */
  void setSTRINGLiteral1(StringLiteralType value);

  /**
   * Returns the value of the '<em><b>Unary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Exp1</em>' containment reference.
   * @see #setUnaryExp1(UnaryExpressionType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_UnaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpressionType getUnaryExp1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getUnaryExp1 <em>Unary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Exp1</em>' containment reference.
   * @see #getUnaryExp1()
   * @generated
   */
  void setUnaryExp1(UnaryExpressionType value);

  /**
   * Returns the value of the '<em><b>Struct1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct1</em>' containment reference.
   * @see #setStruct1(StructType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_Struct1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getStruct1 <em>Struct1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct1</em>' containment reference.
   * @see #getStruct1()
   * @generated
   */
  void setStruct1(StructType value);

  /**
   * Returns the value of the '<em><b>Record1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record1</em>' containment reference.
   * @see #setRecord1(RecordType)
   * @see bxml.BxmlPackage#getBinaryExpressionType_Record1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  RecordType getRecord1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getRecord1 <em>Record1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record1</em>' containment reference.
   * @see #getRecord1()
   * @generated
   */
  void setRecord1(RecordType value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.BinaryExpOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.BinaryExpOp
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(BinaryExpOp)
   * @see bxml.BxmlPackage#getBinaryExpressionType_Op()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  BinaryExpOp getOp();

  /**
   * Sets the value of the '{@link bxml.BinaryExpressionType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.BinaryExpOp
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(BinaryExpOp value);

  /**
   * Unsets the value of the '{@link bxml.BinaryExpressionType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(BinaryExpOp)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.BinaryExpressionType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(BinaryExpOp)
   * @generated
   */
  boolean isSetOp();

} // BinaryExpressionType
