/**
 */
package bxml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nary Sub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.NarySubType#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.NarySubType#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link bxml.NarySubType#getBlocSub <em>Bloc Sub</em>}</li>
 *   <li>{@link bxml.NarySubType#getSkip <em>Skip</em>}</li>
 *   <li>{@link bxml.NarySubType#getAssertSub <em>Assert Sub</em>}</li>
 *   <li>{@link bxml.NarySubType#getIfSub <em>If Sub</em>}</li>
 *   <li>{@link bxml.NarySubType#getBecomesSuchThat <em>Becomes Such That</em>}</li>
 *   <li>{@link bxml.NarySubType#getAssignementSub <em>Assignement Sub</em>}</li>
 *   <li>{@link bxml.NarySubType#getSelect <em>Select</em>}</li>
 *   <li>{@link bxml.NarySubType#getCaseSub <em>Case Sub</em>}</li>
 *   <li>{@link bxml.NarySubType#getANYSub <em>ANY Sub</em>}</li>
 *   <li>{@link bxml.NarySubType#getLETSub <em>LET Sub</em>}</li>
 *   <li>{@link bxml.NarySubType#getBecomesIn <em>Becomes In</em>}</li>
 *   <li>{@link bxml.NarySubType#getVARIN <em>VARIN</em>}</li>
 *   <li>{@link bxml.NarySubType#getNarySub <em>Nary Sub</em>}</li>
 *   <li>{@link bxml.NarySubType#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link bxml.NarySubType#getWhile <em>While</em>}</li>
 *   <li>{@link bxml.NarySubType#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getNarySubType()
 * @model extendedMetaData="name='Nary_Sub_._type' kind='elementOnly'"
 * @generated
 */
public interface NarySubType extends EObject {
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
   * @see bxml.BxmlPackage#getNarySubType_Attr()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Attr' namespace='##targetNamespace'"
   * @generated
   */
  AttrType getAttr();

  /**
   * Sets the value of the '{@link bxml.NarySubType#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(AttrType value);

  /**
   * Returns the value of the '<em><b>Substitution</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Substitution</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Substitution</em>' attribute list.
   * @see bxml.BxmlPackage#getNarySubType_Substitution()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='Substitution:1'"
   * @generated
   */
  FeatureMap getSubstitution();

  /**
   * Returns the value of the '<em><b>Bloc Sub</b></em>' containment reference list.
   * The list contents are of type {@link bxml.BlocSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloc Sub</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloc Sub</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_BlocSub()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Bloc_Sub' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<BlocSubType> getBlocSub();

  /**
   * Returns the value of the '<em><b>Skip</b></em>' containment reference list.
   * The list contents are of type {@link bxml.SkipType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skip</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_Skip()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Skip' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<SkipType> getSkip();

  /**
   * Returns the value of the '<em><b>Assert Sub</b></em>' containment reference list.
   * The list contents are of type {@link bxml.AssertSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert Sub</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert Sub</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_AssertSub()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Assert_Sub' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<AssertSubType> getAssertSub();

  /**
   * Returns the value of the '<em><b>If Sub</b></em>' containment reference list.
   * The list contents are of type {@link bxml.IfSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Sub</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Sub</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_IfSub()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='If_Sub' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<IfSubType> getIfSub();

  /**
   * Returns the value of the '<em><b>Becomes Such That</b></em>' containment reference list.
   * The list contents are of type {@link bxml.BecomesSuchThatType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Becomes Such That</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Becomes Such That</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_BecomesSuchThat()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Becomes_Such_That' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<BecomesSuchThatType> getBecomesSuchThat();

  /**
   * Returns the value of the '<em><b>Assignement Sub</b></em>' containment reference list.
   * The list contents are of type {@link bxml.AssignementSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignement Sub</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignement Sub</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_AssignementSub()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Assignement_Sub' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<AssignementSubType> getAssignementSub();

  /**
   * Returns the value of the '<em><b>Select</b></em>' containment reference list.
   * The list contents are of type {@link bxml.SelectType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_Select()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Select' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<SelectType> getSelect();

  /**
   * Returns the value of the '<em><b>Case Sub</b></em>' containment reference list.
   * The list contents are of type {@link bxml.CaseSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Sub</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Sub</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_CaseSub()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Case_Sub' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<CaseSubType> getCaseSub();

  /**
   * Returns the value of the '<em><b>ANY Sub</b></em>' containment reference list.
   * The list contents are of type {@link bxml.ANYSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ANY Sub</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ANY Sub</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_ANYSub()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ANY_Sub' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<ANYSubType> getANYSub();

  /**
   * Returns the value of the '<em><b>LET Sub</b></em>' containment reference list.
   * The list contents are of type {@link bxml.LETSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LET Sub</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LET Sub</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_LETSub()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='LET_Sub' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<LETSubType> getLETSub();

  /**
   * Returns the value of the '<em><b>Becomes In</b></em>' containment reference list.
   * The list contents are of type {@link bxml.BecomesInType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Becomes In</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Becomes In</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_BecomesIn()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Becomes_In' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<BecomesInType> getBecomesIn();

  /**
   * Returns the value of the '<em><b>VARIN</b></em>' containment reference list.
   * The list contents are of type {@link bxml.VARINType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VARIN</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VARIN</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_VARIN()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='VAR_IN' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<VARINType> getVARIN();

  /**
   * Returns the value of the '<em><b>Nary Sub</b></em>' containment reference list.
   * The list contents are of type {@link bxml.NarySubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Sub</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Sub</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_NarySub()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Nary_Sub' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<NarySubType> getNarySub();

  /**
   * Returns the value of the '<em><b>Operation Call</b></em>' containment reference list.
   * The list contents are of type {@link bxml.OperationCallType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Call</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_OperationCall()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Operation_Call' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<OperationCallType> getOperationCall();

  /**
   * Returns the value of the '<em><b>While</b></em>' containment reference list.
   * The list contents are of type {@link bxml.WhileType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While</em>' containment reference list.
   * @see bxml.BxmlPackage#getNarySubType_While()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='While' namespace='##targetNamespace' group='Substitution:1'"
   * @generated
   */
  EList<WhileType> getWhile();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link bxml.OpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see bxml.OpType
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #setOp(OpType)
   * @see bxml.BxmlPackage#getNarySubType_Op()
   * @model unsettable="true" required="true"
   *        extendedMetaData="kind='attribute' name='op' namespace='##targetNamespace'"
   * @generated
   */
  OpType getOp();

  /**
   * Sets the value of the '{@link bxml.NarySubType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see bxml.OpType
   * @see #isSetOp()
   * @see #unsetOp()
   * @see #getOp()
   * @generated
   */
  void setOp(OpType value);

  /**
   * Unsets the value of the '{@link bxml.NarySubType#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetOp()
   * @see #getOp()
   * @see #setOp(OpType)
   * @generated
   */
  void unsetOp();

  /**
   * Returns whether the value of the '{@link bxml.NarySubType#getOp <em>Op</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Op</em>' attribute is set.
   * @see #unsetOp()
   * @see #getOp()
   * @see #setOp(OpType)
   * @generated
   */
  boolean isSetOp();

} // NarySubType
