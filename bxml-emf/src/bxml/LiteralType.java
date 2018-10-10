/**
 */
package bxml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.LiteralType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.LiteralType#getTypref <em>Typref</em>}</li>
 *   <li>{@link bxml.LiteralType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getLiteralType()
 * @model extendedMetaData="name='Literal_type' kind='elementOnly'"
 * @generated
 */
public interface LiteralType extends EObject {
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
   * @see bxml.BxmlPackage#getLiteralType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.LiteralType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

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
   * @see bxml.BxmlPackage#getLiteralType_Typref()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='typref' namespace='##targetNamespace'"
   * @generated
   */
  BigInteger getTypref();

  /**
   * Sets the value of the '{@link bxml.LiteralType#getTypref <em>Typref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typref</em>' attribute.
   * @see #getTypref()
   * @generated
   */
  void setTypref(BigInteger value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(BigInteger)
   * @see bxml.BxmlPackage#getLiteralType_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
   * @generated
   */
  BigInteger getValue();

  /**
   * Sets the value of the '{@link bxml.LiteralType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(BigInteger value);

} // LiteralType
