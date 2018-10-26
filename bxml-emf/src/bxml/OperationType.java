/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.OperationType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.OperationType#getRefines <em>Refines</em>}</li>
 *   <li>{@link bxml.OperationType#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link bxml.OperationType#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link bxml.OperationType#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link bxml.OperationType#getBody <em>Body</em>}</li>
 *   <li>{@link bxml.OperationType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getOperationType()
 * @model extendedMetaData="name='Operation_._type' kind='elementOnly'"
 * @generated
 */
public interface OperationType extends EObject {
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
   * @see bxml.BxmlPackage#getOperationType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.OperationType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Refines</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refines</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refines</em>' containment reference.
   * @see #setRefines(RefinesType)
   * @see bxml.BxmlPackage#getOperationType_Refines()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Refines' namespace='##targetNamespace'"
   * @generated
   */
  RefinesType getRefines();

  /**
   * Sets the value of the '{@link bxml.OperationType#getRefines <em>Refines</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refines</em>' containment reference.
   * @see #getRefines()
   * @generated
   */
  void setRefines(RefinesType value);

  /**
   * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Parameters</em>' containment reference.
   * @see #setOutputParameters(OutputParametersType)
   * @see bxml.BxmlPackage#getOperationType_OutputParameters()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Output_Parameters' namespace='##targetNamespace'"
   * @generated
   */
  OutputParametersType getOutputParameters();

  /**
   * Sets the value of the '{@link bxml.OperationType#getOutputParameters <em>Output Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Parameters</em>' containment reference.
   * @see #getOutputParameters()
   * @generated
   */
  void setOutputParameters(OutputParametersType value);

  /**
   * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Parameters</em>' containment reference.
   * @see #setInputParameters(InputParametersType)
   * @see bxml.BxmlPackage#getOperationType_InputParameters()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Input_Parameters' namespace='##targetNamespace'"
   * @generated
   */
  InputParametersType getInputParameters();

  /**
   * Sets the value of the '{@link bxml.OperationType#getInputParameters <em>Input Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Parameters</em>' containment reference.
   * @see #getInputParameters()
   * @generated
   */
  void setInputParameters(InputParametersType value);

  /**
   * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precondition</em>' containment reference.
   * @see #setPrecondition(PreconditionType)
   * @see bxml.BxmlPackage#getOperationType_Precondition()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Precondition' namespace='##targetNamespace'"
   * @generated
   */
  PreconditionType getPrecondition();

  /**
   * Sets the value of the '{@link bxml.OperationType#getPrecondition <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precondition</em>' containment reference.
   * @see #getPrecondition()
   * @generated
   */
  void setPrecondition(PreconditionType value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(BodyType1)
   * @see bxml.BxmlPackage#getOperationType_Body()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Body' namespace='##targetNamespace'"
   * @generated
   */
  BodyType1 getBody();

  /**
   * Sets the value of the '{@link bxml.OperationType#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BodyType1 value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(Object)
   * @see bxml.BxmlPackage#getOperationType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link bxml.OperationType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

} // OperationType
