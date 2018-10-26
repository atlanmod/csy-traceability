/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.BodyType3#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.BodyType3#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.BodyType3#getNaryExp <em>Nary Exp</em>}</li>
 *   <li>{@link bxml.BodyType3#getBooleanLiteral <em>Boolean Literal</em>}</li>
 *   <li>{@link bxml.BodyType3#getBooleanExp <em>Boolean Exp</em>}</li>
 *   <li>{@link bxml.BodyType3#getEmptySet <em>Empty Set</em>}</li>
 *   <li>{@link bxml.BodyType3#getEmptySeq <em>Empty Seq</em>}</li>
 *   <li>{@link bxml.BodyType3#getId <em>Id</em>}</li>
 *   <li>{@link bxml.BodyType3#getIntegerLiteral <em>Integer Literal</em>}</li>
 *   <li>{@link bxml.BodyType3#getQuantifiedExp <em>Quantified Exp</em>}</li>
 *   <li>{@link bxml.BodyType3#getQuantifiedSet <em>Quantified Set</em>}</li>
 *   <li>{@link bxml.BodyType3#getSTRINGLiteral <em>STRING Literal</em>}</li>
 *   <li>{@link bxml.BodyType3#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.BodyType3#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.BodyType3#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getBodyType3()
 * @model extendedMetaData="name='Body_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface BodyType3 extends EObject {
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
   * @see bxml.BxmlPackage#getBodyType3_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getAttr <em>Attr</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_BinaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BynaryExpType getBinaryExp();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getBinaryExp <em>Binary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_NaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  NaryExpType getNaryExp();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getNaryExp <em>Nary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_BooleanLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Literal' namespace='##targetNamespace'"
   * @generated
   */
  BooleanLiteralType getBooleanLiteral();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getBooleanLiteral <em>Boolean Literal</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_BooleanExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Boolean_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BooleanExpType getBooleanExp();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getBooleanExp <em>Boolean Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_EmptySet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySet' namespace='##targetNamespace'"
   * @generated
   */
  EmptySetType getEmptySet();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getEmptySet <em>Empty Set</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_EmptySeq()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='EmptySeq' namespace='##targetNamespace'"
   * @generated
   */
  EmptySeqType getEmptySeq();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getEmptySeq <em>Empty Seq</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_Id()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getId <em>Id</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_IntegerLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Integer_Literal' namespace='##targetNamespace'"
   * @generated
   */
  IntegerLiteralType getIntegerLiteral();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getIntegerLiteral <em>Integer Literal</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_QuantifiedExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Exp' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedExpType getQuantifiedExp();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getQuantifiedExp <em>Quantified Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_QuantifiedSet()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Quantified_Set' namespace='##targetNamespace'"
   * @generated
   */
  QuantifiedSetType getQuantifiedSet();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getQuantifiedSet <em>Quantified Set</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_STRINGLiteral()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='STRING_Literal' namespace='##targetNamespace'"
   * @generated
   */
  STRINGLiteralType getSTRINGLiteral();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getSTRINGLiteral <em>STRING Literal</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_UnaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpType getUnaryExp();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getUnaryExp <em>Unary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getStruct <em>Struct</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getBodyType3_Record()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  RecordType getRecord();

  /**
   * Sets the value of the '{@link bxml.BodyType3#getRecord <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' containment reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(RecordType value);

} // BodyType3
