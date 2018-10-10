/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.StructType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.StructType#getRecordItem <em>Record Item</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getStructType()
 * @model extendedMetaData="name='Struct_._type' kind='elementOnly'"
 * @generated
 */
public interface StructType extends EObject {
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
   * @see bxml.BxmlPackage#getStructType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.StructType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

  /**
   * Returns the value of the '<em><b>Record Item</b></em>' containment reference list.
   * The list contents are of type {@link bxml.RecordItemType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Item</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Item</em>' containment reference list.
   * @see bxml.BxmlPackage#getStructType_RecordItem()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Record_Item' namespace='##targetNamespace'"
   * @generated
   */
  EList<RecordItemType> getRecordItem();

} // StructType
