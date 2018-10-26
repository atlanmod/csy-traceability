/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.OperationsType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.OperationsType#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getOperationsType()
 * @model extendedMetaData="name='Operations_._type' kind='elementOnly'"
 * @generated
 */
public interface OperationsType extends EObject {
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
   * @see bxml.BxmlPackage#getOperationsType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.OperationsType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
   * The list contents are of type {@link bxml.OperationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference list.
   * @see bxml.BxmlPackage#getOperationsType_Operation()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Operation' namespace='##targetNamespace'"
   * @generated
   */
  EList<OperationType> getOperation();

} // OperationsType
