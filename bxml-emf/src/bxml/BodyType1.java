/**
 */
package bxml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bxml.BodyType1#getBlocSub <em>Bloc Sub</em>}</li>
 *   <li>{@link bxml.BodyType1#getSkip <em>Skip</em>}</li>
 *   <li>{@link bxml.BodyType1#getAssertSub <em>Assert Sub</em>}</li>
 *   <li>{@link bxml.BodyType1#getIfSub <em>If Sub</em>}</li>
 *   <li>{@link bxml.BodyType1#getBecomesSuchThat <em>Becomes Such That</em>}</li>
 *   <li>{@link bxml.BodyType1#getAssignementSub <em>Assignement Sub</em>}</li>
 *   <li>{@link bxml.BodyType1#getSelect <em>Select</em>}</li>
 *   <li>{@link bxml.BodyType1#getCaseSub <em>Case Sub</em>}</li>
 *   <li>{@link bxml.BodyType1#getANYSub <em>ANY Sub</em>}</li>
 *   <li>{@link bxml.BodyType1#getLETSub <em>LET Sub</em>}</li>
 *   <li>{@link bxml.BodyType1#getBecomesIn <em>Becomes In</em>}</li>
 *   <li>{@link bxml.BodyType1#getVARIN <em>VARIN</em>}</li>
 *   <li>{@link bxml.BodyType1#getNarySub <em>Nary Sub</em>}</li>
 *   <li>{@link bxml.BodyType1#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link bxml.BodyType1#getWhile <em>While</em>}</li>
 * </ul>
 *
 * @see bxml.BxmlPackage#getBodyType1()
 * @model extendedMetaData="name='Body_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface BodyType1 extends EObject {
  /**
   * Returns the value of the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bloc Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bloc Sub</em>' containment reference.
   * @see #setBlocSub(BlocSubType)
   * @see bxml.BxmlPackage#getBodyType1_BlocSub()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Bloc_Sub' namespace='##targetNamespace'"
   * @generated
   */
  BlocSubType getBlocSub();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getBlocSub <em>Bloc Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bloc Sub</em>' containment reference.
   * @see #getBlocSub()
   * @generated
   */
  void setBlocSub(BlocSubType value);

  /**
   * Returns the value of the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Skip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip</em>' containment reference.
   * @see #setSkip(SkipType)
   * @see bxml.BxmlPackage#getBodyType1_Skip()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Skip' namespace='##targetNamespace'"
   * @generated
   */
  SkipType getSkip();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getSkip <em>Skip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip</em>' containment reference.
   * @see #getSkip()
   * @generated
   */
  void setSkip(SkipType value);

  /**
   * Returns the value of the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert Sub</em>' containment reference.
   * @see #setAssertSub(AssertSubType)
   * @see bxml.BxmlPackage#getBodyType1_AssertSub()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Assert_Sub' namespace='##targetNamespace'"
   * @generated
   */
  AssertSubType getAssertSub();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getAssertSub <em>Assert Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert Sub</em>' containment reference.
   * @see #getAssertSub()
   * @generated
   */
  void setAssertSub(AssertSubType value);

  /**
   * Returns the value of the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Sub</em>' containment reference.
   * @see #setIfSub(IfSubType)
   * @see bxml.BxmlPackage#getBodyType1_IfSub()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='If_Sub' namespace='##targetNamespace'"
   * @generated
   */
  IfSubType getIfSub();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getIfSub <em>If Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Sub</em>' containment reference.
   * @see #getIfSub()
   * @generated
   */
  void setIfSub(IfSubType value);

  /**
   * Returns the value of the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Becomes Such That</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Becomes Such That</em>' containment reference.
   * @see #setBecomesSuchThat(BecomesSuchThatType)
   * @see bxml.BxmlPackage#getBodyType1_BecomesSuchThat()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Becomes_Such_That' namespace='##targetNamespace'"
   * @generated
   */
  BecomesSuchThatType getBecomesSuchThat();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getBecomesSuchThat <em>Becomes Such That</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Becomes Such That</em>' containment reference.
   * @see #getBecomesSuchThat()
   * @generated
   */
  void setBecomesSuchThat(BecomesSuchThatType value);

  /**
   * Returns the value of the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignement Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignement Sub</em>' containment reference.
   * @see #setAssignementSub(AssignementSubType)
   * @see bxml.BxmlPackage#getBodyType1_AssignementSub()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Assignement_Sub' namespace='##targetNamespace'"
   * @generated
   */
  AssignementSubType getAssignementSub();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getAssignementSub <em>Assignement Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignement Sub</em>' containment reference.
   * @see #getAssignementSub()
   * @generated
   */
  void setAssignementSub(AssignementSubType value);

  /**
   * Returns the value of the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' containment reference.
   * @see #setSelect(SelectType)
   * @see bxml.BxmlPackage#getBodyType1_Select()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Select' namespace='##targetNamespace'"
   * @generated
   */
  SelectType getSelect();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getSelect <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' containment reference.
   * @see #getSelect()
   * @generated
   */
  void setSelect(SelectType value);

  /**
   * Returns the value of the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Sub</em>' containment reference.
   * @see #setCaseSub(CaseSubType)
   * @see bxml.BxmlPackage#getBodyType1_CaseSub()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Case_Sub' namespace='##targetNamespace'"
   * @generated
   */
  CaseSubType getCaseSub();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getCaseSub <em>Case Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Sub</em>' containment reference.
   * @see #getCaseSub()
   * @generated
   */
  void setCaseSub(CaseSubType value);

  /**
   * Returns the value of the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ANY Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>ANY Sub</em>' containment reference.
   * @see #setANYSub(ANYSubType)
   * @see bxml.BxmlPackage#getBodyType1_ANYSub()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='ANY_Sub' namespace='##targetNamespace'"
   * @generated
   */
  ANYSubType getANYSub();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getANYSub <em>ANY Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>ANY Sub</em>' containment reference.
   * @see #getANYSub()
   * @generated
   */
  void setANYSub(ANYSubType value);

  /**
   * Returns the value of the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LET Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LET Sub</em>' containment reference.
   * @see #setLETSub(LETSubType)
   * @see bxml.BxmlPackage#getBodyType1_LETSub()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='LET_Sub' namespace='##targetNamespace'"
   * @generated
   */
  LETSubType getLETSub();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getLETSub <em>LET Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LET Sub</em>' containment reference.
   * @see #getLETSub()
   * @generated
   */
  void setLETSub(LETSubType value);

  /**
   * Returns the value of the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Becomes In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Becomes In</em>' containment reference.
   * @see #setBecomesIn(BecomesInType)
   * @see bxml.BxmlPackage#getBodyType1_BecomesIn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Becomes_In' namespace='##targetNamespace'"
   * @generated
   */
  BecomesInType getBecomesIn();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getBecomesIn <em>Becomes In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Becomes In</em>' containment reference.
   * @see #getBecomesIn()
   * @generated
   */
  void setBecomesIn(BecomesInType value);

  /**
   * Returns the value of the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VARIN</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VARIN</em>' containment reference.
   * @see #setVARIN(VARINType)
   * @see bxml.BxmlPackage#getBodyType1_VARIN()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='VAR_IN' namespace='##targetNamespace'"
   * @generated
   */
  VARINType getVARIN();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getVARIN <em>VARIN</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VARIN</em>' containment reference.
   * @see #getVARIN()
   * @generated
   */
  void setVARIN(VARINType value);

  /**
   * Returns the value of the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nary Sub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nary Sub</em>' containment reference.
   * @see #setNarySub(NarySubType)
   * @see bxml.BxmlPackage#getBodyType1_NarySub()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Nary_Sub' namespace='##targetNamespace'"
   * @generated
   */
  NarySubType getNarySub();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getNarySub <em>Nary Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nary Sub</em>' containment reference.
   * @see #getNarySub()
   * @generated
   */
  void setNarySub(NarySubType value);

  /**
   * Returns the value of the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Call</em>' containment reference.
   * @see #setOperationCall(OperationCallType)
   * @see bxml.BxmlPackage#getBodyType1_OperationCall()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='Operation_Call' namespace='##targetNamespace'"
   * @generated
   */
  OperationCallType getOperationCall();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getOperationCall <em>Operation Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Call</em>' containment reference.
   * @see #getOperationCall()
   * @generated
   */
  void setOperationCall(OperationCallType value);

  /**
   * Returns the value of the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While</em>' containment reference.
   * @see #setWhile(WhileType)
   * @see bxml.BxmlPackage#getBodyType1_While()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='While' namespace='##targetNamespace'"
   * @generated
   */
  WhileType getWhile();

  /**
   * Sets the value of the '{@link bxml.BodyType1#getWhile <em>While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While</em>' containment reference.
   * @see #getWhile()
   * @generated
   */
  void setWhile(WhileType value);

} // BodyType1
