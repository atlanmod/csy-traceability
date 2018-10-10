/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Becomes In Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.BecomesInType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.BecomesInType#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.BecomesInType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getBecomesInType()
 * @model extendedMetaData="name='Becomes_In_._type' kind='elementOnly'"
 * @generated
 */
public interface BecomesInType extends EObject {
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
   * @see bxml.BxmlPackage#getBecomesInType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.BecomesInType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(VariablesType1)
   * @see bxml.BxmlPackage#getBecomesInType_Variables()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Variables' namespace='##targetNamespace'"
   * @generated
   */
  VariablesType1 getVariables();

  /**
   * Sets the value of the '{@link bxml.BecomesInType#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(VariablesType1 value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ExpType)
   * @see bxml.BxmlPackage#getBecomesInType_Value()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
   * @generated
   */
  ExpType getValue();

  /**
   * Sets the value of the '{@link bxml.BecomesInType#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ExpType value);

} // BecomesInType
