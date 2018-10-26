/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.IdType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getIdType()
 * @model extendedMetaData="name='Id_._type' kind='empty'"
 * @generated
 */
public interface IdType extends EObject {
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
   * @see bxml.BxmlPackage#getIdType_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
   * @generated
   */
  Object getValue();

  /**
   * Sets the value of the '{@link bxml.IdType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Object value);

} // IdType
