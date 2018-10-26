/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attr Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.AttrType#getAnyElement <em>Any Element</em>}</li>
 *   <li>{@link bxml.AttrType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getAttrType()
 * @model extendedMetaData="name='Attr_._type' kind='elementOnly'"
 * @generated
 */
public interface AttrType extends EObject {
  /**
   * Returns the value of the '<em><b>Any Element</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any Element</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any Element</em>' attribute list.
   * @see bxml.BxmlPackage#getAttrType_AnyElement()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='AnyElement:0'"
   * @generated
   */
  FeatureMap getAnyElement();

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
   * @see bxml.BxmlPackage#getAttrType_Any()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':1' processing='skip' group='AnyElement:0'"
   * @generated
   */
  FeatureMap getAny();

} // AttrType
