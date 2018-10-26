/**
 */
package bxml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.Identifier#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.Identifier#getComponent <em>Component</em>}</li>
 *   <li>{@link bxml.Identifier#getInstance <em>Instance</em>}</li>
 *   <li>{@link bxml.Identifier#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link bxml.Identifier#getTypref <em>Typref</em>}</li>
 *   <li>{@link bxml.Identifier#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getIdentifier()
 * @model extendedMetaData="name='Identifier' kind='elementOnly'"
 * @generated
 */
public interface Identifier extends EObject {
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
   * @see bxml.BxmlPackage#getIdentifier_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.Identifier#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' attribute.
   * @see #setComponent(Object)
   * @see bxml.BxmlPackage#getIdentifier_Component()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   *        extendedMetaData="kind='attribute' name='component' namespace='##targetNamespace'"
   * @generated
   */
  Object getComponent();

  /**
   * Sets the value of the '{@link bxml.Identifier#getComponent <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' attribute.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Object value);

  /**
   * Returns the value of the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' attribute.
   * @see #setInstance(Object)
   * @see bxml.BxmlPackage#getIdentifier_Instance()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   *        extendedMetaData="kind='attribute' name='instance' namespace='##targetNamespace'"
   * @generated
   */
  Object getInstance();

  /**
   * Sets the value of the '{@link bxml.Identifier#getInstance <em>Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' attribute.
   * @see #getInstance()
   * @generated
   */
  void setInstance(Object value);

  /**
   * Returns the value of the '<em><b>Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suffix</em>' attribute.
   * @see #setSuffix(Object)
   * @see bxml.BxmlPackage#getIdentifier_Suffix()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   *        extendedMetaData="kind='attribute' name='suffix' namespace='##targetNamespace'"
   * @generated
   */
  Object getSuffix();

  /**
   * Sets the value of the '{@link bxml.Identifier#getSuffix <em>Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suffix</em>' attribute.
   * @see #getSuffix()
   * @generated
   */
  void setSuffix(Object value);

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
   * @see bxml.BxmlPackage#getIdentifier_Typref()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='typref' namespace='##targetNamespace'"
   * @generated
   */
  BigInteger getTypref();

  /**
   * Sets the value of the '{@link bxml.Identifier#getTypref <em>Typref</em>}' attribute.
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
   * @see #setValue(Object)
   * @see bxml.BxmlPackage#getIdentifier_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
   * @generated
   */
  Object getValue();

  /**
   * Sets the value of the '{@link bxml.Identifier#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Object value);

} // Identifier
