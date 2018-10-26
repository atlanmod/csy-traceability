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
 *   <li>{@link bxml.PromotesType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.PromotesType#getPromotedOperation <em>Promoted Operation</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getPromotesType()
 * @model extendedMetaData="name='Promotes_._type' kind='elementOnly'"
 * @generated
 */
public interface PromotesType extends EObject {
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
   * @see bxml.BxmlPackage#getPromotesType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.PromotesType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Promoted Operation</b></em>' containment reference list.
   * The list contents are of type {@link bxml.PromotedOperationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Promoted Operation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Promoted Operation</em>' containment reference list.
   * @see bxml.BxmlPackage#getPromotesType_PromotedOperation()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Promoted_Operation' namespace='##targetNamespace'"
   * @generated
   */
  EList<PromotedOperationType> getPromotedOperation();

} // PromotesType
