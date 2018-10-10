/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Machine Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.ReferencedMachineType#getName <em>Name</em>}</li>
 *   <li>{@link bxml.ReferencedMachineType#getInstance <em>Instance</em>}</li>
 *   <li>{@link bxml.ReferencedMachineType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link bxml.ReferencedMachineType#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getReferencedMachineType()
 * @model extendedMetaData="name='Referenced_Machine_._type' kind='elementOnly'"
 * @generated
 */
public interface ReferencedMachineType extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see bxml.BxmlPackage#getReferencedMachineType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link bxml.ReferencedMachineType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' attribute.
   * @see #setInstance(String)
   * @see bxml.BxmlPackage#getReferencedMachineType_Instance()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='Instance' namespace='##targetNamespace'"
   * @generated
   */
  String getInstance();

  /**
   * Sets the value of the '{@link bxml.ReferencedMachineType#getInstance <em>Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' attribute.
   * @see #getInstance()
   * @generated
   */
  void setInstance(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(ParametersType)
   * @see bxml.BxmlPackage#getReferencedMachineType_Parameters()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
   * @generated
   */
  ParametersType getParameters();

  /**
   * Sets the value of the '{@link bxml.ReferencedMachineType#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(ParametersType value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see bxml.BxmlPackage#getReferencedMachineType_Path()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='path' namespace='##targetNamespace'"
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link bxml.ReferencedMachineType#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // ReferencedMachineType
