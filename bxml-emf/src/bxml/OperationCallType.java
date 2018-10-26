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
 * </ul>
 *
 * @see bxml.BxmlPackage#getOperationCallType()
 * @model extendedMetaData="name='Operation_Call_._type' kind='elementOnly'"
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
   * @see #setAttr(AttrType)
   * @see bxml.BxmlPackage#getOperationCallType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.OperationCallType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

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
   * @see #setInputParameters(InputParametersType1)
   * @see bxml.BxmlPackage#getOperationCallType_InputParameters()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Input_Parameters' namespace='##targetNamespace'"
   * @generated
   */
  InputParametersType1 getInputParameters();

  /**
   * Sets the value of the '{@link bxml.OperationCallType#getInputParameters <em>Input Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Parameters</em>' containment reference.
   * @see #getInputParameters()
   * @generated
   */
  void setInputParameters(InputParametersType1 value);

  /**
   * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Parameters</em>' containment reference.
   * @see #setOutputParameters(OutputParametersType1)
   * @see bxml.BxmlPackage#getOperationCallType_OutputParameters()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Output_Parameters' namespace='##targetNamespace'"
   * @generated
   */
  OutputParametersType1 getOutputParameters();

  /**
   * Sets the value of the '{@link bxml.OperationCallType#getOutputParameters <em>Output Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Parameters</em>' containment reference.
   * @see #getOutputParameters()
   * @generated
   */
  void setOutputParameters(OutputParametersType1 value);

} // OperationCallType
