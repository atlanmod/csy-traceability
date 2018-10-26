/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choices Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ChoicesType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.ChoicesType#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getChoicesType()
 * @model extendedMetaData="name='Choices_._type' kind='elementOnly'"
 * @generated
 */
public interface ChoicesType extends EObject {
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
   * @see bxml.BxmlPackage#getChoicesType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.ChoicesType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
   * The list contents are of type {@link bxml.ChoiceType1}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choice</em>' containment reference list.
   * @see bxml.BxmlPackage#getChoicesType_Choice()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Choice' namespace='##targetNamespace'"
   * @generated
   */
  EList<ChoiceType1> getChoice();

} // ChoicesType
