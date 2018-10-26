/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Exp Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.BinaryExpType2#getId <em>Id</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getId1 <em>Id1</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getUnaryExp1 <em>Unary Exp1</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getBinaryExp1 <em>Binary Exp1</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getStruct1 <em>Struct1</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getGenericType1 <em>Generic Type1</em>}</li>
 *   <li>{@link bxml.BinaryExpType2#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getBinaryExpType2()
 * @model extendedMetaData="name='Binary_Exp_type2' kind='elementOnly'"
 * @generated
 */
public interface BinaryExpType2 extends EObject {
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(IdType)
   * @see bxml.BxmlPackage#getBinaryExpType2_Id()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  IdType getId();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(IdType value);

  /**
   * Returns the value of the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Exp</em>' containment reference.
   * @see #setUnaryExp(UnaryExpType2)
   * @see bxml.BxmlPackage#getBinaryExpType2_UnaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpType2 getUnaryExp();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getUnaryExp <em>Unary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Exp</em>' containment reference.
   * @see #getUnaryExp()
   * @generated
   */
  void setUnaryExp(UnaryExpType2 value);

  /**
   * Returns the value of the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Exp</em>' containment reference.
   * @see #setBinaryExp(BinaryExpType2)
   * @see bxml.BxmlPackage#getBinaryExpType2_BinaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BinaryExpType2 getBinaryExp();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getBinaryExp <em>Binary Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Exp</em>' containment reference.
   * @see #getBinaryExp()
   * @generated
   */
  void setBinaryExp(BinaryExpType2 value);

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
   * @see bxml.BxmlPackage#getBinaryExpType2_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
  void setStruct(StructType value);

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
   * @see bxml.BxmlPackage#getBinaryExpType2_GenericType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='Generic_Type' namespace='##targetNamespace'"
   * @generated
   */
  String getGenericType();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getGenericType <em>Generic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Type</em>' attribute.
   * @see #getGenericType()
   * @generated
   */
  void setGenericType(String value);

  /**
   * Returns the value of the '<em><b>Id1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id1</em>' containment reference.
   * @see #setId1(IdType)
   * @see bxml.BxmlPackage#getBinaryExpType2_Id1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  IdType getId1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getId1 <em>Id1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id1</em>' containment reference.
   * @see #getId1()
   * @generated
   */
  void setId1(IdType value);

  /**
   * Returns the value of the '<em><b>Unary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Exp1</em>' containment reference.
   * @see #setUnaryExp1(UnaryExpType2)
   * @see bxml.BxmlPackage#getBinaryExpType2_UnaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpType2 getUnaryExp1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getUnaryExp1 <em>Unary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Exp1</em>' containment reference.
   * @see #getUnaryExp1()
   * @generated
   */
  void setUnaryExp1(UnaryExpType2 value);

  /**
   * Returns the value of the '<em><b>Binary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binary Exp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binary Exp1</em>' containment reference.
   * @see #setBinaryExp1(BinaryExpType2)
   * @see bxml.BxmlPackage#getBinaryExpType2_BinaryExp1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BinaryExpType2 getBinaryExp1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getBinaryExp1 <em>Binary Exp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binary Exp1</em>' containment reference.
   * @see #getBinaryExp1()
   * @generated
   */
  void setBinaryExp1(BinaryExpType2 value);

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
   * @see bxml.BxmlPackage#getBinaryExpType2_Struct1()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getStruct1 <em>Struct1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct1</em>' containment reference.
   * @see #getStruct1()
   * @generated
   */
  void setStruct1(StructType value);

  /**
   * Returns the value of the '<em><b>Generic Type1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Type1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Type1</em>' attribute.
   * @see #setGenericType1(String)
   * @see bxml.BxmlPackage#getBinaryExpType2_GenericType1()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='Generic_Type' namespace='##targetNamespace'"
   * @generated
   */
  String getGenericType1();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getGenericType1 <em>Generic Type1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Type1</em>' attribute.
   * @see #getGenericType1()
   * @generated
   */
  void setGenericType1(String value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.OpType1}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.OpType1
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(OpType1)
   * @see bxml.BxmlPackage#getBinaryExpType2_Op()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  OpType1 getOp();

  /**
   * Sets the value of the '{@link bxml.BinaryExpType2#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.OpType1
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(OpType1 value);

  /**
   * Unsets the value of the '{@link bxml.BinaryExpType2#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(OpType1)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.BinaryExpType2#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(OpType1)
   * @generated
   */
  boolean isSetOp();

} // BinaryExpType2
