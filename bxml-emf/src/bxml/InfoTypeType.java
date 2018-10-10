/**
 */
package bxml;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.InfoTypeType#getAny <em>Any</em>}</li>
 *   <li>{@link bxml.InfoTypeType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getInfoTypeType()
 * @model extendedMetaData="name='InfoType_type' kind='elementOnly'"
 * @generated
 */
public interface InfoTypeType extends EObject {
  /**
   * Returns the value of the '<em><b>Any</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any</em>' attribute list.
   * @see bxml.BxmlPackage#getInfoTypeType_Any()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='skip'"
   * @generated
   */
  FeatureMap getAny();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(BigInteger)
   * @see bxml.BxmlPackage#getInfoTypeType_Id()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
   * @generated
   */
  BigInteger getId();

  /**
   * Sets the value of the '{@link bxml.InfoTypeType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(BigInteger value);

} // InfoTypeType
