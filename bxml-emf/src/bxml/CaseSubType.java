/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Sub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.CaseSubType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.CaseSubType#getValue <em>Value</em>}</li>
 *   <li>{@link bxml.CaseSubType#getChoices <em>Choices</em>}</li>
 *   <li>{@link bxml.CaseSubType#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getCaseSubType()
 * @model extendedMetaData="name='Case_Sub_._type' kind='elementOnly'"
 * @generated
 */
public interface CaseSubType extends EObject {
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
   * @see bxml.BxmlPackage#getCaseSubType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.CaseSubType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ExpType)
   * @see bxml.BxmlPackage#getCaseSubType_Value()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
   * @generated
   */
  ExpType getValue();

  /**
   * Sets the value of the '{@link bxml.CaseSubType#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ExpType value);

  /**
   * Returns the value of the '<em><b>Choices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choices</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choices</em>' containment reference.
   * @see #setChoices(ChoicesType)
   * @see bxml.BxmlPackage#getCaseSubType_Choices()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Choices' namespace='##targetNamespace'"
   * @generated
   */
  ChoicesType getChoices();

  /**
   * Sets the value of the '{@link bxml.CaseSubType#getChoices <em>Choices</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choices</em>' containment reference.
   * @see #getChoices()
   * @generated
   */
  void setChoices(ChoicesType value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(SubstitutionType)
   * @see bxml.BxmlPackage#getCaseSubType_Else()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Else' namespace='##targetNamespace'"
   * @generated
   */
  SubstitutionType getElse();

  /**
   * Sets the value of the '{@link bxml.CaseSubType#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(SubstitutionType value);

} // CaseSubType
