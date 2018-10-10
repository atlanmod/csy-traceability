/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Values Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ValuesType1#getValuation <em>Valuation</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getValuesType1()
 * @model extendedMetaData="name='Values_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ValuesType1 extends EObject {
  /**
   * Returns the value of the '<em><b>Valuation</b></em>' containment reference list.
   * The list contents are of type {@link bxml.ValuationType1}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valuation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valuation</em>' containment reference list.
   * @see bxml.BxmlPackage#getValuesType1_Valuation()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Valuation' namespace='##targetNamespace'"
   * @generated
   */
  EList<ValuationType1> getValuation();

} // ValuesType1
