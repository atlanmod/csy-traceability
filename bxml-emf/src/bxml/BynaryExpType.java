/**
 */
package bxml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bynary Exp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.BynaryExpType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getId <em>Id</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getBinaryExp1 <em>Binary Exp1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getNaryExp1 <em>Nary Exp1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getBooleanLiteral1 <em>Boolean Literal1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getBooleanExp1 <em>Boolean Exp1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getEmptySet1 <em>Empty Set1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getEmptySeq1 <em>Empty Seq1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getId1 <em>Id1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getIntegerLiteral1 <em>Integer Literal1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getQuantifiedExp1 <em>Quantified Exp1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getQuantifiedSet1 <em>Quantified Set1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getSTRINGLiteral1 <em>STRING Literal1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getUnaryExp1 <em>Unary Exp1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getStruct1 <em>Struct1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getRecord1 <em>Record1</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getOp <em>Op</em>}</li>
 *   <li>{@link bxml.BynaryExpType#getTypref <em>Typref</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getBynaryExpType()
 * @model extendedMetaData="name='Bynary_Exp_type' kind='elementOnly'"
 * @generated
 */
public interface BynaryExpType extends EObject {
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
   * @see bxml.BxmlPackage#getBynaryExpType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Exp</em>' containment reference.
   * @see #setBinaryExp(BynaryExpType)
   * @see bxml.BxmlPackage#getBynaryExpType_BinaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BynaryExpType getBinaryExp();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getBinaryExp <em>Binary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Exp</em>' containment reference.
   * @see #getBinaryExp()
   * @generated
   */
  void setBinaryExp(BynaryExpType value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_NaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpType getNaryExp();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getNaryExp <em>Nary Exp</em>}' containment reference.
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
   * @see #setBooleanLiteral(BooleanLiteralType)
   * @see bxml.BxmlPackage#getBynaryExpType_BooleanLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace'"
   * @generated
   */
  BooleanLiteralType getBooleanLiteral();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getBooleanLiteral <em>Boolean Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Literal</em>' containment reference.
   * @see #getBooleanLiteral()
   * @generated
   */
  void setBooleanLiteral(BooleanLiteralType value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_BooleanExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BooleanExpType getBooleanExp();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getBooleanExp <em>Boolean Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Exp</em>' containment reference.
   * @see #getBooleanExp()
   * @generated
   */
  void setBooleanExp(BooleanExpType value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_EmptySet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace'"
   * @generated
   */
  EmptySetType getEmptySet();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getEmptySet <em>Empty Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Set</em>' containment reference.
   * @see #getEmptySet()
   * @generated
   */
  void setEmptySet(EmptySetType value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_EmptySeq()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace'"
   * @generated
   */
  EmptySeqType getEmptySeq();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getEmptySeq <em>Empty Seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Seq</em>' containment reference.
   * @see #getEmptySeq()
   * @generated
   */
  void setEmptySeq(EmptySeqType value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Identifier)
   * @see bxml.BxmlPackage#getBynaryExpType_Id()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_IntegerLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace'"
   * @generated
   */
  IntegerLiteralType getIntegerLiteral();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getIntegerLiteral <em>Integer Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer Literal</em>' containment reference.
   * @see #getIntegerLiteral()
   * @generated
   */
  void setIntegerLiteral(IntegerLiteralType value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_QuantifiedExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpType getQuantifiedExp();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getQuantifiedExp <em>Quantified Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBynaryExpType_QuantifiedSet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedSetType getQuantifiedSet();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getQuantifiedSet <em>Quantified Set</em>}' containment reference.
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
   * @see #setSTRINGLiteral(STRINGLiteralType)
   * @see bxml.BxmlPackage#getBynaryExpType_STRINGLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace'"
   * @generated
   */
  STRINGLiteralType getSTRINGLiteral();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getSTRINGLiteral <em>STRING Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>STRING Literal</em>' containment reference.
   * @see #getSTRINGLiteral()
   * @generated
   */
  void setSTRINGLiteral(STRINGLiteralType value);

  /**
   * Returns the value of the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Exp</em>' containment reference.
   * @see #setUnaryExp(UnaryExpType)
   * @see bxml.BxmlPackage#getBynaryExpType_UnaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpType getUnaryExp();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getUnaryExp <em>Unary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Exp</em>' containment reference.
   * @see #getUnaryExp()
   * @generated
   */
  void setUnaryExp(UnaryExpType value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getStruct <em>Struct</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBynaryExpType_Record()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  RecordType getRecord();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getRecord <em>Record</em>}' containment reference.
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
   * @see #setBinaryExp1(BynaryExpType)
   * @see bxml.BxmlPackage#getBynaryExpType_BinaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BynaryExpType getBinaryExp1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getBinaryExp1 <em>Binary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Exp1</em>' containment reference.
   * @see #getBinaryExp1()
   * @generated
   */
  void setBinaryExp1(BynaryExpType value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_NaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpType getNaryExp1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getNaryExp1 <em>Nary Exp1</em>}' containment reference.
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
   * @see #setBooleanLiteral1(BooleanLiteralType)
   * @see bxml.BxmlPackage#getBynaryExpType_BooleanLiteral1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace'"
   * @generated
   */
  BooleanLiteralType getBooleanLiteral1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getBooleanLiteral1 <em>Boolean Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Literal1</em>' containment reference.
   * @see #getBooleanLiteral1()
   * @generated
   */
  void setBooleanLiteral1(BooleanLiteralType value);

  /**
   * Returns the value of the '<em><b>Boolean Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Exp1</em>' containment reference.
   * @see #setBooleanExp1(BooleanExpType)
   * @see bxml.BxmlPackage#getBynaryExpType_BooleanExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BooleanExpType getBooleanExp1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getBooleanExp1 <em>Boolean Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Exp1</em>' containment reference.
   * @see #getBooleanExp1()
   * @generated
   */
  void setBooleanExp1(BooleanExpType value);

  /**
   * Returns the value of the '<em><b>Empty Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Set1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Set1</em>' containment reference.
   * @see #setEmptySet1(EmptySetType)
   * @see bxml.BxmlPackage#getBynaryExpType_EmptySet1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace'"
   * @generated
   */
  EmptySetType getEmptySet1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getEmptySet1 <em>Empty Set1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Set1</em>' containment reference.
   * @see #getEmptySet1()
   * @generated
   */
  void setEmptySet1(EmptySetType value);

  /**
   * Returns the value of the '<em><b>Empty Seq1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Seq1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Seq1</em>' containment reference.
   * @see #setEmptySeq1(EmptySeqType)
   * @see bxml.BxmlPackage#getBynaryExpType_EmptySeq1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace'"
   * @generated
   */
  EmptySeqType getEmptySeq1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getEmptySeq1 <em>Empty Seq1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Seq1</em>' containment reference.
   * @see #getEmptySeq1()
   * @generated
   */
  void setEmptySeq1(EmptySeqType value);

  /**
   * Returns the value of the '<em><b>Id1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id1</em>' containment reference.
   * @see #setId1(Identifier)
   * @see bxml.BxmlPackage#getBynaryExpType_Id1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  Identifier getId1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getId1 <em>Id1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id1</em>' containment reference.
   * @see #getId1()
   * @generated
   */
  void setId1(Identifier value);

  /**
   * Returns the value of the '<em><b>Integer Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer Literal1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer Literal1</em>' containment reference.
   * @see #setIntegerLiteral1(IntegerLiteralType)
   * @see bxml.BxmlPackage#getBynaryExpType_IntegerLiteral1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace'"
   * @generated
   */
  IntegerLiteralType getIntegerLiteral1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getIntegerLiteral1 <em>Integer Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer Literal1</em>' containment reference.
   * @see #getIntegerLiteral1()
   * @generated
   */
  void setIntegerLiteral1(IntegerLiteralType value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_QuantifiedExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpType getQuantifiedExp1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getQuantifiedExp1 <em>Quantified Exp1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBynaryExpType_QuantifiedSet1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedSetType getQuantifiedSet1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getQuantifiedSet1 <em>Quantified Set1</em>}' containment reference.
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
   * @see #setSTRINGLiteral1(STRINGLiteralType)
   * @see bxml.BxmlPackage#getBynaryExpType_STRINGLiteral1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace'"
   * @generated
   */
  STRINGLiteralType getSTRINGLiteral1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getSTRINGLiteral1 <em>STRING Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>STRING Literal1</em>' containment reference.
   * @see #getSTRINGLiteral1()
   * @generated
   */
  void setSTRINGLiteral1(STRINGLiteralType value);

  /**
   * Returns the value of the '<em><b>Unary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Exp1</em>' containment reference.
   * @see #setUnaryExp1(UnaryExpType)
   * @see bxml.BxmlPackage#getBynaryExpType_UnaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpType getUnaryExp1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getUnaryExp1 <em>Unary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Exp1</em>' containment reference.
   * @see #getUnaryExp1()
   * @generated
   */
  void setUnaryExp1(UnaryExpType value);

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
   * @see bxml.BxmlPackage#getBynaryExpType_Struct1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getStruct1 <em>Struct1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBynaryExpType_Record1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  RecordType getRecord1();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getRecord1 <em>Record1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record1</em>' containment reference.
   * @see #getRecord1()
   * @generated
   */
  void setRecord1(RecordType value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.OpType8}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.OpType8
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(OpType8)
   * @see bxml.BxmlPackage#getBynaryExpType_Op()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  OpType8 getOp();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.OpType8
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(OpType8 value);

  /**
   * Unsets the value of the '{@link bxml.BynaryExpType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(OpType8)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.BynaryExpType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(OpType8)
   * @generated
   */
  boolean isSetOp();

  /**
   * Returns the value of the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typref</em>' attribute.
   * @see #setTypref(BigInteger)
   * @see bxml.BxmlPackage#getBynaryExpType_Typref()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='typref' namespace='##targetNamespace'"
   * @generated
   */
  BigInteger getTypref();

  /**
   * Sets the value of the '{@link bxml.BynaryExpType#getTypref <em>Typref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typref</em>' attribute.
   * @see #getTypref()
   * @generated
   */
  void setTypref(BigInteger value);

} // BynaryExpType
