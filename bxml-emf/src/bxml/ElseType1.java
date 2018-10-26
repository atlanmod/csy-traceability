/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ElseType1#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.ElseType1#getChoice <em>Choice</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getElseType1()
 * @model extendedMetaData="name='Else_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ElseType1 extends EObject {
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
   * @see bxml.BxmlPackage#getElseType1_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.ElseType1#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Choice</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choice</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choice</em>' containment reference.
   * @see #setChoice(ChoiceType)
   * @see bxml.BxmlPackage#getElseType1_Choice()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Choice' namespace='##targetNamespace'"
   * @generated
   */
  ChoiceType getChoice();

  /**
   * Sets the value of the '{@link bxml.ElseType1#getChoice <em>Choice</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choice</em>' containment reference.
   * @see #getChoice()
   * @generated
   */
  void setChoice(ChoiceType value);

} // ElseType1
