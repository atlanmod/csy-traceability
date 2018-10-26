/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Clauses Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.WhenClausesType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.WhenClausesType#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getWhenClausesType()
 * @model extendedMetaData="name='When_Clauses_._type' kind='elementOnly'"
 * @generated
 */
public interface WhenClausesType extends EObject {
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
   * @see bxml.BxmlPackage#getWhenClausesType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.WhenClausesType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference list.
   * The list contents are of type {@link bxml.WhenType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference list.
   * @see bxml.BxmlPackage#getWhenClausesType_When()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='When' namespace='##targetNamespace'"
   * @generated
   */
  EList<WhenType> getWhen();

} // WhenClausesType
