/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignement Substitution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.AssignementSubstitutionType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.AssignementSubstitutionType#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.AssignementSubstitutionType#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getAssignementSubstitutionType()
 * @model extendedMetaData="name='Assignement_Substitution_type' kind='elementOnly'"
 * @generated
 */
public interface AssignementSubstitutionType extends EObject {
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
   * @see bxml.BxmlPackage#getAssignementSubstitutionType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.AssignementSubstitutionType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(VariablesType)
   * @see bxml.BxmlPackage#getAssignementSubstitutionType_Variables()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Variables' namespace='##targetNamespace'"
   * @generated
   */
  VariablesType getVariables();

  /**
   * Sets the value of the '{@link bxml.AssignementSubstitutionType#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(VariablesType value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference.
   * @see #setValues(ValuesType2)
   * @see bxml.BxmlPackage#getAssignementSubstitutionType_Values()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Values' namespace='##targetNamespace'"
   * @generated
   */
  ValuesType2 getValues();

  /**
   * Sets the value of the '{@link bxml.AssignementSubstitutionType#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(ValuesType2 value);

} // AssignementSubstitutionType
