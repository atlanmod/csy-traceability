/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.OperationCallType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.OperationCallType#getName <em>Name</em>}</li>
 *   <li>{@link bxml.OperationCallType#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link bxml.OperationCallType#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link bxml.OperationCallType#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getOperationCallType()
 * @model extendedMetaData="name='Operation_Call_type' kind='elementOnly'"
 * @generated
 */
public interface OperationCallType extends EObject {
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
   * @see bxml.BxmlPackage#getOperationCallType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttributesType getAttr();

  /**
   * Sets the value of the '{@link bxml.OperationCallType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttributesType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(NameType)
   * @see bxml.BxmlPackage#getOperationCallType_Name()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
   * @generated
   */
  NameType getName();

  /**
   * Sets the value of the '{@link bxml.OperationCallType#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(NameType value);

  /**
   * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Parameters</em>' containment reference.
   * @see #setInputParameters(CallParamatersType)
   * @see bxml.BxmlPackage#getOperationCallType_InputParameters()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Input_Parameters' namespace='##targetNamespace'"
   * @generated
   */
  CallParamatersType getInputParameters();

  /**
   * Sets the value of the '{@link bxml.OperationCallType#getInputParameters <em>Input Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Parameters</em>' containment reference.
   * @see #getInputParameters()
   * @generated
   */
  void setInputParameters(CallParamatersType value);

  /**
   * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Parameters</em>' containment reference.
   * @see #setOutputParameters(CallParamatersType)
   * @see bxml.BxmlPackage#getOperationCallType_OutputParameters()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Output_Parameters' namespace='##targetNamespace'"
   * @generated
   */
  CallParamatersType getOutputParameters();

  /**
   * Sets the value of the '{@link bxml.OperationCallType#getOutputParameters <em>Output Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Parameters</em>' containment reference.
   * @see #getOutputParameters()
   * @generated
   */
  void setOutputParameters(CallParamatersType value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference.
   * @see #setOperation(OperationType)
   * @see bxml.BxmlPackage#getOperationCallType_Operation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Operation' namespace='##targetNamespace'"
   * @generated
   */
  OperationType getOperation();

  /**
   * Sets the value of the '{@link bxml.OperationCallType#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(OperationType value);

} // OperationCallType
