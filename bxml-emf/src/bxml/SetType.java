/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.SetType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.SetType#getId <em>Id</em>}</li>
 *   <li>{@link bxml.SetType#getEnumeratedValues <em>Enumerated Values</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getSetType()
 * @model extendedMetaData="name='Set_._type' kind='elementOnly'"
 * @generated
 */
public interface SetType extends EObject {
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
   * @see bxml.BxmlPackage#getSetType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.SetType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Identifier)
   * @see bxml.BxmlPackage#getSetType_Id()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link bxml.SetType#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

  /**
   * Returns the value of the '<em><b>Enumerated Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerated Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerated Values</em>' containment reference.
   * @see #setEnumeratedValues(EnumeratedValuesType)
   * @see bxml.BxmlPackage#getSetType_EnumeratedValues()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Enumerated_Values' namespace='##targetNamespace'"
   * @generated
   */
  EnumeratedValuesType getEnumeratedValues();

  /**
   * Sets the value of the '{@link bxml.SetType#getEnumeratedValues <em>Enumerated Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerated Values</em>' containment reference.
   * @see #getEnumeratedValues()
   * @generated
   */
  void setEnumeratedValues(EnumeratedValuesType value);

} // SetType
