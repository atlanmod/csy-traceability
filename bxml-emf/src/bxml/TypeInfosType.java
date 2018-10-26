/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Infos Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.TypeInfosType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getTypeInfosType()
 * @model extendedMetaData="name='TypeInfos_._type' kind='elementOnly'"
 * @generated
 */
public interface TypeInfosType extends EObject {
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link bxml.TypeInfo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see bxml.BxmlPackage#getTypeInfosType_Type()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
   * @generated
   */
  EList<TypeInfo> getType();

} // TypeInfosType
