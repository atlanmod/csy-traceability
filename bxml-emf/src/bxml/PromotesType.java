/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Promotes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.PromotesType#getPromotedOperation <em>Promoted Operation</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getPromotesType()
 * @model extendedMetaData="name='Promotes_._type' kind='elementOnly'"
 * @generated
 */
public interface PromotesType extends EObject {
  /**
   * Returns the value of the '<em><b>Promoted Operation</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promoted Operation</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promoted Operation</em>' attribute list.
   * @see bxml.BxmlPackage#getPromotesType_PromotedOperation()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='Promoted_Operation' namespace='##targetNamespace'"
   * @generated
   */
  EList<String> getPromotedOperation();

} // PromotesType
