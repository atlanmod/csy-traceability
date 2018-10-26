/**
 */
package bxml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.TypeInfo#getId <em>Id</em>}</li>
 *   <li>{@link bxml.TypeInfo#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.TypeInfo#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.TypeInfo#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.TypeInfo#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link bxml.TypeInfo#getId1 <em>Id1</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getTypeInfo()
 * @model extendedMetaData="name='TypeInfo' kind='elementOnly'"
 * @generated
 */
public interface TypeInfo extends EObject {
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
   * @see bxml.BxmlPackage#getTypeInfo_Id()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  IdType getId();

  /**
   * Sets the value of the '{@link bxml.TypeInfo#getId <em>Id</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getTypeInfo_UnaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpType2 getUnaryExp();

  /**
   * Sets the value of the '{@link bxml.TypeInfo#getUnaryExp <em>Unary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getTypeInfo_BinaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BinaryExpType2 getBinaryExp();

  /**
   * Sets the value of the '{@link bxml.TypeInfo#getBinaryExp <em>Binary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getTypeInfo_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct();

  /**
   * Sets the value of the '{@link bxml.TypeInfo#getStruct <em>Struct</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getTypeInfo_GenericType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='Generic_Type' namespace='##targetNamespace'"
   * @generated
   */
  String getGenericType();

  /**
   * Sets the value of the '{@link bxml.TypeInfo#getGenericType <em>Generic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Type</em>' attribute.
   * @see #getGenericType()
   * @generated
   */
  void setGenericType(String value);

  /**
   * Returns the value of the '<em><b>Id1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id1</em>' attribute.
   * @see #setId1(BigInteger)
   * @see bxml.BxmlPackage#getTypeInfo_Id1()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
   *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
   * @generated
   */
  BigInteger getId1();

  /**
   * Sets the value of the '{@link bxml.TypeInfo#getId1 <em>Id1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id1</em>' attribute.
   * @see #getId1()
   * @generated
   */
  void setId1(BigInteger value);

} // TypeInfo
