/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.SelectType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.SelectType#getWhenClauses <em>When Clauses</em>}</li>
 *   <li>{@link bxml.SelectType#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getSelectType()
 * @model extendedMetaData="name='Select_._type' kind='elementOnly'"
 * @generated
 */
public interface SelectType extends EObject {
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
   * @see bxml.BxmlPackage#getSelectType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.SelectType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>When Clauses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Clauses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Clauses</em>' containment reference.
   * @see #setWhenClauses(WhenClausesType)
   * @see bxml.BxmlPackage#getSelectType_WhenClauses()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='When_Clauses' namespace='##targetNamespace'"
   * @generated
   */
  WhenClausesType getWhenClauses();

  /**
   * Sets the value of the '{@link bxml.SelectType#getWhenClauses <em>When Clauses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When Clauses</em>' containment reference.
   * @see #getWhenClauses()
   * @generated
   */
  void setWhenClauses(WhenClausesType value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(ElseType)
   * @see bxml.BxmlPackage#getSelectType_Else()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Else' namespace='##targetNamespace'"
   * @generated
   */
  ElseType getElse();

  /**
   * Sets the value of the '{@link bxml.SelectType#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(ElseType value);

} // SelectType
