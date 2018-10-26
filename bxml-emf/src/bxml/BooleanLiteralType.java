/**
 */
package bxml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.BooleanLiteralType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.BooleanLiteralType#getTypref <em>Typref</em>}</li>
 *   <li>{@link bxml.BooleanLiteralType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getBooleanLiteralType()
 * @model extendedMetaData="name='Boolean_Literal_._type' kind='elementOnly'"
 * @generated
 */
public interface BooleanLiteralType extends EObject {
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
   * @see bxml.BxmlPackage#getBooleanLiteralType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.BooleanLiteralType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

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
   * @see bxml.BxmlPackage#getBooleanLiteralType_Typref()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='typref' namespace='##targetNamespace'"
   * @generated
   */
  BigInteger getTypref();

  /**
   * Sets the value of the '{@link bxml.BooleanLiteralType#getTypref <em>Typref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typref</em>' attribute.
   * @see #getTypref()
   * @generated
   */
  void setTypref(BigInteger value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.ValueType1}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see bxml.ValueType1
   * @see #isSetValue()
   * @see #unsetValue()
   * @see #setValue(ValueType1)
   * @see bxml.BxmlPackage#getBooleanLiteralType_Value()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
   * @generated
   */
  ValueType1 getValue();

  /**
   * Sets the value of the '{@link bxml.BooleanLiteralType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see bxml.ValueType1
   * @see #isSetValue()
   * @see #unsetValue()
   * @see #getValue()
   * @generated
   */
  void setValue(ValueType1 value);

  /**
   * Unsets the value of the '{@link bxml.BooleanLiteralType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetValue()
   * @see #getValue()
   * @see #setValue(ValueType1)
   * @generated
   */
  void unsetValue();

  /**
   * Returns whether the value of the '{@link bxml.BooleanLiteralType#getValue <em>Value</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Value</em>' attribute is set.
   * @see #unsetValue()
   * @see #getValue()
   * @see #setValue(ValueType1)
   * @generated
   */
  boolean isSetValue();

} // BooleanLiteralType
