/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Sub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.IfSubType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.IfSubType#getCondition <em>Condition</em>}</li>
 *   <li>{@link bxml.IfSubType#getThen <em>Then</em>}</li>
 *   <li>{@link bxml.IfSubType#getElse <em>Else</em>}</li>
 *   <li>{@link bxml.IfSubType#getElseif <em>Elseif</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getIfSubType()
 * @model extendedMetaData="name='If_Sub_._type' kind='elementOnly'"
 * @generated
 */
public interface IfSubType extends EObject {
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
   * @see bxml.BxmlPackage#getIfSubType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.IfSubType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(PredicateType)
   * @see bxml.BxmlPackage#getIfSubType_Condition()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
   * @generated
   */
  PredicateType getCondition();

  /**
   * Sets the value of the '{@link bxml.IfSubType#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(PredicateType value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(SubstitutionType)
   * @see bxml.BxmlPackage#getIfSubType_Then()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Then' namespace='##targetNamespace'"
   * @generated
   */
  SubstitutionType getThen();

  /**
   * Sets the value of the '{@link bxml.IfSubType#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(SubstitutionType value);

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
   * @see bxml.BxmlPackage#getIfSubType_Else()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Else' namespace='##targetNamespace'"
   * @generated
   */
  SubstitutionType getElse();

  /**
   * Sets the value of the '{@link bxml.IfSubType#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(SubstitutionType value);

  /**
   * Returns the value of the '<em><b>Elseif</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseif</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseif</em>' attribute.
   * @see #setElseif(String)
   * @see bxml.BxmlPackage#getIfSubType_Elseif()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='elseif' namespace='##targetNamespace'"
   * @generated
   */
  String getElseif();

  /**
   * Sets the value of the '{@link bxml.IfSubType#getElseif <em>Elseif</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elseif</em>' attribute.
   * @see #getElseif()
   * @generated
   */
  void setElseif(String value);

} // IfSubType
