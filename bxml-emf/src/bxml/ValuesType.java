/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Values Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ValuesType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.ValuesType#getValuation <em>Valuation</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getValuesType()
 * @model extendedMetaData="name='Values_._type' kind='elementOnly'"
 * @generated
 */
public interface ValuesType extends EObject {
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
   * @see bxml.BxmlPackage#getValuesType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.ValuesType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Valuation</b></em>' containment reference list.
   * The list contents are of type {@link bxml.ValuationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valuation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valuation</em>' containment reference list.
   * @see bxml.BxmlPackage#getValuesType_Valuation()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Valuation' namespace='##targetNamespace'"
   * @generated
   */
  EList<ValuationType> getValuation();

} // ValuesType
