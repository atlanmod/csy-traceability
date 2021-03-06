/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Comparison Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ExpComparisonType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getId <em>Id</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getRecord <em>Record</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getBinaryExp1 <em>Binary Exp1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getNaryExp1 <em>Nary Exp1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getBooleanLiteral1 <em>Boolean Literal1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getBooleanExp1 <em>Boolean Exp1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getEmptySet1 <em>Empty Set1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getEmptySeq1 <em>Empty Seq1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getId1 <em>Id1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getIntegerLiteral1 <em>Integer Literal1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getQuantifiedExp1 <em>Quantified Exp1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getQuantifiedSet1 <em>Quantified Set1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getSTRINGLiteral1 <em>STRING Literal1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getUnaryExp1 <em>Unary Exp1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getStruct1 <em>Struct1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getRecord1 <em>Record1</em>}</li>
 *   <li>{@link bxml.ExpComparisonType#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getExpComparisonType()
 * @model extendedMetaData="name='Exp_Comparison_._type' kind='elementOnly'"
 * @generated
 */
public interface ExpComparisonType extends EObject {
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
   * @see bxml.BxmlPackage#getExpComparisonType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getAttr <em>Attr</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_BinaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BynaryExpType getBinaryExp();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getBinaryExp <em>Binary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_NaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpType getNaryExp();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getNaryExp <em>Nary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_BooleanLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace'"
   * @generated
   */
  BooleanLiteralType getBooleanLiteral();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getBooleanLiteral <em>Boolean Literal</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_BooleanExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BooleanExpType getBooleanExp();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getBooleanExp <em>Boolean Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_EmptySet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace'"
   * @generated
   */
  EmptySetType getEmptySet();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getEmptySet <em>Empty Set</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_EmptySeq()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace'"
   * @generated
   */
  EmptySeqType getEmptySeq();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getEmptySeq <em>Empty Seq</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_Id()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getId <em>Id</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_IntegerLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace'"
   * @generated
   */
  IntegerLiteralType getIntegerLiteral();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getIntegerLiteral <em>Integer Literal</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_QuantifiedExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpType getQuantifiedExp();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getQuantifiedExp <em>Quantified Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_QuantifiedSet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedSetType getQuantifiedSet();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getQuantifiedSet <em>Quantified Set</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_STRINGLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace'"
   * @generated
   */
  STRINGLiteralType getSTRINGLiteral();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getSTRINGLiteral <em>STRING Literal</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_UnaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpType getUnaryExp();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getUnaryExp <em>Unary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getStruct <em>Struct</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_Record()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  RecordType getRecord();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getRecord <em>Record</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_BinaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BynaryExpType getBinaryExp1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getBinaryExp1 <em>Binary Exp1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_NaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpType getNaryExp1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getNaryExp1 <em>Nary Exp1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_BooleanLiteral1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace'"
   * @generated
   */
  BooleanLiteralType getBooleanLiteral1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getBooleanLiteral1 <em>Boolean Literal1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_BooleanExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BooleanExpType getBooleanExp1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getBooleanExp1 <em>Boolean Exp1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_EmptySet1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace'"
   * @generated
   */
  EmptySetType getEmptySet1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getEmptySet1 <em>Empty Set1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_EmptySeq1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace'"
   * @generated
   */
  EmptySeqType getEmptySeq1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getEmptySeq1 <em>Empty Seq1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_Id1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  Identifier getId1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getId1 <em>Id1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_IntegerLiteral1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace'"
   * @generated
   */
  IntegerLiteralType getIntegerLiteral1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getIntegerLiteral1 <em>Integer Literal1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_QuantifiedExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpType getQuantifiedExp1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getQuantifiedExp1 <em>Quantified Exp1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_QuantifiedSet1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedSetType getQuantifiedSet1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getQuantifiedSet1 <em>Quantified Set1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_STRINGLiteral1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace'"
   * @generated
   */
  STRINGLiteralType getSTRINGLiteral1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getSTRINGLiteral1 <em>STRING Literal1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_UnaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpType getUnaryExp1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getUnaryExp1 <em>Unary Exp1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_Struct1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getStruct1 <em>Struct1</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getExpComparisonType_Record1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  RecordType getRecord1();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getRecord1 <em>Record1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record1</em>' containment reference.
   * @see #getRecord1()
   * @generated
   */
  void setRecord1(RecordType value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.OpType3}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.OpType3
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(OpType3)
   * @see bxml.BxmlPackage#getExpComparisonType_Op()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  OpType3 getOp();

  /**
   * Sets the value of the '{@link bxml.ExpComparisonType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.OpType3
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(OpType3 value);

  /**
   * Unsets the value of the '{@link bxml.ExpComparisonType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(OpType3)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.ExpComparisonType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(OpType3)
   * @generated
   */
  boolean isSetOp();

} // ExpComparisonType
