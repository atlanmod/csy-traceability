/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Exp Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.UnaryExpType2#getId <em>Id</em>}</li>
 *   <li>{@link bxml.UnaryExpType2#getUnaryExp <em>Unary Exp</em>}</li>
 *   <li>{@link bxml.UnaryExpType2#getBinaryExp <em>Binary Exp</em>}</li>
 *   <li>{@link bxml.UnaryExpType2#getStruct <em>Struct</em>}</li>
 *   <li>{@link bxml.UnaryExpType2#getGenericType <em>Generic Type</em>}</li>
 *   <li>{@link bxml.UnaryExpType2#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getUnaryExpType2()
 * @model extendedMetaData="name='Unary_Exp_type2' kind='elementOnly'"
 * @generated
 */
public interface UnaryExpType2 extends EObject {
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
   * @see bxml.BxmlPackage#getUnaryExpType2_Id()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  IdType getId();

  /**
   * Sets the value of the '{@link bxml.UnaryExpType2#getId <em>Id</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryExpType2_UnaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Unary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  UnaryExpType2 getUnaryExp();

  /**
   * Sets the value of the '{@link bxml.UnaryExpType2#getUnaryExp <em>Unary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryExpType2_BinaryExp()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Binary_Exp' namespace='##targetNamespace'"
   * @generated
   */
  BinaryExpType2 getBinaryExp();

  /**
   * Sets the value of the '{@link bxml.UnaryExpType2#getBinaryExp <em>Binary Exp</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryExpType2_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Struct' namespace='##targetNamespace'"
   * @generated
   */
  StructType getStruct();

  /**
   * Sets the value of the '{@link bxml.UnaryExpType2#getStruct <em>Struct</em>}' containment reference.
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
   * @see bxml.BxmlPackage#getUnaryExpType2_GenericType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='Generic_Type' namespace='##targetNamespace'"
   * @generated
   */
  String getGenericType();

  /**
   * Sets the value of the '{@link bxml.UnaryExpType2#getGenericType <em>Generic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Type</em>' attribute.
   * @see #getGenericType()
   * @generated
   */
  void setGenericType(String value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.OpType2}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.OpType2
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(OpType2)
   * @see bxml.BxmlPackage#getUnaryExpType2_Op()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  OpType2 getOp();

  /**
   * Sets the value of the '{@link bxml.UnaryExpType2#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.OpType2
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(OpType2 value);

  /**
   * Unsets the value of the '{@link bxml.UnaryExpType2#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(OpType2)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.UnaryExpType2#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(OpType2)
   * @generated
   */
  boolean isSetOp();

} // UnaryExpType2
