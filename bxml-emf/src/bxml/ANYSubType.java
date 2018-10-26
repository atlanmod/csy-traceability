/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ANY Sub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ANYSubType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.ANYSubType#getVariables <em>Variables</em>}</li>
 *   <li>{@link bxml.ANYSubType#getPred <em>Pred</em>}</li>
 *   <li>{@link bxml.ANYSubType#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getANYSubType()
 * @model extendedMetaData="name='ANY_Sub_._type' kind='elementOnly'"
 * @generated
 */
public interface ANYSubType extends EObject {
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
   * @see bxml.BxmlPackage#getANYSubType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.ANYSubType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(VariablesType1)
   * @see bxml.BxmlPackage#getANYSubType_Variables()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Variables' namespace='##targetNamespace'"
   * @generated
   */
  VariablesType1 getVariables();

  /**
   * Sets the value of the '{@link bxml.ANYSubType#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(VariablesType1 value);

  /**
   * Returns the value of the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pred</em>' containment reference.
   * @see #setPred(PredType)
   * @see bxml.BxmlPackage#getANYSubType_Pred()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Pred' namespace='##targetNamespace'"
   * @generated
   */
  PredType getPred();

  /**
   * Sets the value of the '{@link bxml.ANYSubType#getPred <em>Pred</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pred</em>' containment reference.
   * @see #getPred()
   * @generated
   */
  void setPred(PredType value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(ThenType)
   * @see bxml.BxmlPackage#getANYSubType_Then()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Then' namespace='##targetNamespace'"
   * @generated
   */
  ThenType getThen();

  /**
   * Sets the value of the '{@link bxml.ANYSubType#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(ThenType value);

} // ANYSubType
