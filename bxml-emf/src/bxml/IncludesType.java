/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Includes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.IncludesType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.IncludesType#getReferencedMachine <em>Referenced Machine</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getIncludesType()
 * @model extendedMetaData="name='Includes_._type' kind='elementOnly'"
 * @generated
 */
public interface IncludesType extends EObject {
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
   * @see bxml.BxmlPackage#getIncludesType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.IncludesType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Referenced Machine</b></em>' containment reference list.
   * The list contents are of type {@link bxml.ReferencedMachineType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Machine</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Machine</em>' containment reference list.
   * @see bxml.BxmlPackage#getIncludesType_ReferencedMachine()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Referenced_Machine' namespace='##targetNamespace'"
   * @generated
   */
  EList<ReferencedMachineType> getReferencedMachine();

} // IncludesType
