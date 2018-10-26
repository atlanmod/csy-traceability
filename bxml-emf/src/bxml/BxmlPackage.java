/**
 */
package bxml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bxml.BxmlFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface BxmlPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bxml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "platform:/resource/csy-traceability/bxsd/bxml.xsd";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bxml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BxmlPackage eINSTANCE = bxml.impl.BxmlPackageImpl.init();

  /**
   * The meta object id for the '{@link bxml.impl.AbstractConstantsTypeImpl <em>Abstract Constants Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.AbstractConstantsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getAbstractConstantsType()
   * @generated
   */
  int ABSTRACT_CONSTANTS_TYPE = 0;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONSTANTS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONSTANTS_TYPE__ID = 1;

  /**
   * The number of structural features of the '<em>Abstract Constants Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONSTANTS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Abstract Constants Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONSTANTS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.AbstractionTypeImpl <em>Abstraction Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.AbstractionTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getAbstractionType()
   * @generated
   */
  int ABSTRACTION_TYPE = 1;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION_TYPE__MIXED = 0;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION_TYPE__ATTR = 1;

  /**
   * The number of structural features of the '<em>Abstraction Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Abstraction Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.AbstractVariablesTypeImpl <em>Abstract Variables Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.AbstractVariablesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getAbstractVariablesType()
   * @generated
   */
  int ABSTRACT_VARIABLES_TYPE = 2;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VARIABLES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VARIABLES_TYPE__ID = 1;

  /**
   * The number of structural features of the '<em>Abstract Variables Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VARIABLES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Abstract Variables Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VARIABLES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ANYSubTypeImpl <em>ANY Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ANYSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getANYSubType()
   * @generated
   */
  int ANY_SUB_TYPE = 3;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_SUB_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_SUB_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_SUB_TYPE__PRED = 2;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_SUB_TYPE__THEN = 3;

  /**
   * The number of structural features of the '<em>ANY Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_SUB_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>ANY Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_SUB_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.AssertionsTypeImpl <em>Assertions Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.AssertionsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getAssertionsType()
   * @generated
   */
  int ASSERTIONS_TYPE = 4;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__PREDICATE = 1;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__BINARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__NARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__UNARY_PRED = 4;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__QUANTIFIED_PRED = 5;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__EXP_COMPARISON = 6;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__SET = 7;

  /**
   * The number of structural features of the '<em>Assertions Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Assertions Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.AssertSubTypeImpl <em>Assert Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.AssertSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getAssertSubType()
   * @generated
   */
  int ASSERT_SUB_TYPE = 5;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_SUB_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_SUB_TYPE__GUARD = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_SUB_TYPE__BODY = 2;

  /**
   * The number of structural features of the '<em>Assert Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_SUB_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Assert Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_SUB_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.AssignementSubTypeImpl <em>Assignement Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.AssignementSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getAssignementSubType()
   * @generated
   */
  int ASSIGNEMENT_SUB_TYPE = 6;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUB_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUB_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUB_TYPE__VALUES = 2;

  /**
   * The number of structural features of the '<em>Assignement Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUB_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Assignement Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUB_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.AttrTypeImpl <em>Attr Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.AttrTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getAttrType()
   * @generated
   */
  int ATTR_TYPE = 7;

  /**
   * The feature id for the '<em><b>Any Element</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_TYPE__ANY_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_TYPE__ANY = 1;

  /**
   * The number of structural features of the '<em>Attr Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Attr Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BecomesInTypeImpl <em>Becomes In Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BecomesInTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBecomesInType()
   * @generated
   */
  int BECOMES_IN_TYPE = 8;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_IN_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_IN_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_IN_TYPE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Becomes In Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_IN_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Becomes In Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_IN_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BecomesSuchThatTypeImpl <em>Becomes Such That Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BecomesSuchThatTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBecomesSuchThatType()
   * @generated
   */
  int BECOMES_SUCH_THAT_TYPE = 9;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_SUCH_THAT_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_SUCH_THAT_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_SUCH_THAT_TYPE__PRED = 2;

  /**
   * The number of structural features of the '<em>Becomes Such That Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_SUCH_THAT_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Becomes Such That Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BECOMES_SUCH_THAT_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BinaryExpType2Impl <em>Binary Exp Type2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BinaryExpType2Impl
   * @see bxml.impl.BxmlPackageImpl#getBinaryExpType2()
   * @generated
   */
  int BINARY_EXP_TYPE2 = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__ID = 0;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__UNARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__BINARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__STRUCT = 3;

  /**
   * The feature id for the '<em><b>Generic Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__GENERIC_TYPE = 4;

  /**
   * The feature id for the '<em><b>Id1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__ID1 = 5;

  /**
   * The feature id for the '<em><b>Unary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__UNARY_EXP1 = 6;

  /**
   * The feature id for the '<em><b>Binary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__BINARY_EXP1 = 7;

  /**
   * The feature id for the '<em><b>Struct1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__STRUCT1 = 8;

  /**
   * The feature id for the '<em><b>Generic Type1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__GENERIC_TYPE1 = 9;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2__OP = 10;

  /**
   * The number of structural features of the '<em>Binary Exp Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2_FEATURE_COUNT = 11;

  /**
   * The number of operations of the '<em>Binary Exp Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXP_TYPE2_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BinaryPredTypeImpl <em>Binary Pred Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BinaryPredTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBinaryPredType()
   * @generated
   */
  int BINARY_PRED_TYPE = 11;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__SET = 6;

  /**
   * The feature id for the '<em><b>Binary Pred1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__BINARY_PRED1 = 7;

  /**
   * The feature id for the '<em><b>Nary Pred1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__NARY_PRED1 = 8;

  /**
   * The feature id for the '<em><b>Unary Pred1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__UNARY_PRED1 = 9;

  /**
   * The feature id for the '<em><b>Quantified Pred1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__QUANTIFIED_PRED1 = 10;

  /**
   * The feature id for the '<em><b>Exp Comparison1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__EXP_COMPARISON1 = 11;

  /**
   * The feature id for the '<em><b>Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__SET1 = 12;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE__OP = 13;

  /**
   * The number of structural features of the '<em>Binary Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE_FEATURE_COUNT = 14;

  /**
   * The number of operations of the '<em>Binary Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PRED_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BlocSubTypeImpl <em>Bloc Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BlocSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBlocSubType()
   * @generated
   */
  int BLOC_SUB_TYPE = 12;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__BLOC_SUB = 1;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__SKIP = 2;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__ASSERT_SUB = 3;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__IF_SUB = 4;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__BECOMES_SUCH_THAT = 5;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__ASSIGNEMENT_SUB = 6;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__SELECT = 7;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__CASE_SUB = 8;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__ANY_SUB = 9;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__LET_SUB = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__VARIN = 12;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__NARY_SUB = 13;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__OPERATION_CALL = 14;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE__WHILE = 15;

  /**
   * The number of structural features of the '<em>Bloc Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Bloc Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOC_SUB_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BodyTypeImpl <em>Body Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BodyTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBodyType()
   * @generated
   */
  int BODY_TYPE = 13;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE__SET = 6;

  /**
   * The number of structural features of the '<em>Body Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Body Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BodyType1Impl <em>Body Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BodyType1Impl
   * @see bxml.impl.BxmlPackageImpl#getBodyType1()
   * @generated
   */
  int BODY_TYPE1 = 14;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__BLOC_SUB = 0;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__SKIP = 1;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__ASSERT_SUB = 2;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__IF_SUB = 3;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__BECOMES_SUCH_THAT = 4;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__ASSIGNEMENT_SUB = 5;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__SELECT = 6;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__CASE_SUB = 7;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__ANY_SUB = 8;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__LET_SUB = 9;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__BECOMES_IN = 10;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__VARIN = 11;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__NARY_SUB = 12;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__OPERATION_CALL = 13;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1__WHILE = 14;

  /**
   * The number of structural features of the '<em>Body Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1_FEATURE_COUNT = 15;

  /**
   * The number of operations of the '<em>Body Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BodyType2Impl <em>Body Type2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BodyType2Impl
   * @see bxml.impl.BxmlPackageImpl#getBodyType2()
   * @generated
   */
  int BODY_TYPE2 = 15;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__ATTR = 0;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__BLOC_SUB = 1;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__SKIP = 2;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__ASSERT_SUB = 3;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__IF_SUB = 4;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__BECOMES_SUCH_THAT = 5;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__ASSIGNEMENT_SUB = 6;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__SELECT = 7;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__CASE_SUB = 8;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__ANY_SUB = 9;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__LET_SUB = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__VARIN = 12;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__NARY_SUB = 13;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__OPERATION_CALL = 14;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2__WHILE = 15;

  /**
   * The number of structural features of the '<em>Body Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Body Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE2_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BodyType3Impl <em>Body Type3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BodyType3Impl
   * @see bxml.impl.BxmlPackageImpl#getBodyType3()
   * @generated
   */
  int BODY_TYPE3 = 16;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3__RECORD = 14;

  /**
   * The number of structural features of the '<em>Body Type3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3_FEATURE_COUNT = 15;

  /**
   * The number of operations of the '<em>Body Type3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE3_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BodyType4Impl <em>Body Type4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BodyType4Impl
   * @see bxml.impl.BxmlPackageImpl#getBodyType4()
   * @generated
   */
  int BODY_TYPE4 = 17;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__ATTR = 0;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__BLOC_SUB = 1;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__SKIP = 2;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__ASSERT_SUB = 3;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__IF_SUB = 4;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__BECOMES_SUCH_THAT = 5;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__ASSIGNEMENT_SUB = 6;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__SELECT = 7;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__CASE_SUB = 8;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__ANY_SUB = 9;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__LET_SUB = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__VARIN = 12;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__NARY_SUB = 13;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__OPERATION_CALL = 14;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4__WHILE = 15;

  /**
   * The number of structural features of the '<em>Body Type4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Body Type4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE4_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BodyType5Impl <em>Body Type5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BodyType5Impl
   * @see bxml.impl.BxmlPackageImpl#getBodyType5()
   * @generated
   */
  int BODY_TYPE5 = 18;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__ATTR = 0;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__BLOC_SUB = 1;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__SKIP = 2;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__ASSERT_SUB = 3;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__IF_SUB = 4;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__BECOMES_SUCH_THAT = 5;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__ASSIGNEMENT_SUB = 6;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__SELECT = 7;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__CASE_SUB = 8;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__ANY_SUB = 9;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__LET_SUB = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__VARIN = 12;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__NARY_SUB = 13;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__OPERATION_CALL = 14;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5__WHILE = 15;

  /**
   * The number of structural features of the '<em>Body Type5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Body Type5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE5_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BodyType6Impl <em>Body Type6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BodyType6Impl
   * @see bxml.impl.BxmlPackageImpl#getBodyType6()
   * @generated
   */
  int BODY_TYPE6 = 19;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE6__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE6__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE6__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE6__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE6__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE6__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE6__SET = 6;

  /**
   * The number of structural features of the '<em>Body Type6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE6_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Body Type6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_TYPE6_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BooleanExpTypeImpl <em>Boolean Exp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BooleanExpTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBooleanExpType()
   * @generated
   */
  int BOOLEAN_EXP_TYPE = 20;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE__SET = 6;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE__TYPREF = 7;

  /**
   * The number of structural features of the '<em>Boolean Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Boolean Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BooleanLiteralTypeImpl <em>Boolean Literal Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BooleanLiteralTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBooleanLiteralType()
   * @generated
   */
  int BOOLEAN_LITERAL_TYPE = 21;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_TYPE__TYPREF = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_TYPE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Boolean Literal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Boolean Literal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BynaryExpTypeImpl <em>Bynary Exp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BynaryExpTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBynaryExpType()
   * @generated
   */
  int BYNARY_EXP_TYPE = 22;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__RECORD = 14;

  /**
   * The feature id for the '<em><b>Binary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__BINARY_EXP1 = 15;

  /**
   * The feature id for the '<em><b>Nary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__NARY_EXP1 = 16;

  /**
   * The feature id for the '<em><b>Boolean Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__BOOLEAN_LITERAL1 = 17;

  /**
   * The feature id for the '<em><b>Boolean Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__BOOLEAN_EXP1 = 18;

  /**
   * The feature id for the '<em><b>Empty Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__EMPTY_SET1 = 19;

  /**
   * The feature id for the '<em><b>Empty Seq1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__EMPTY_SEQ1 = 20;

  /**
   * The feature id for the '<em><b>Id1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__ID1 = 21;

  /**
   * The feature id for the '<em><b>Integer Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__INTEGER_LITERAL1 = 22;

  /**
   * The feature id for the '<em><b>Quantified Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__QUANTIFIED_EXP1 = 23;

  /**
   * The feature id for the '<em><b>Quantified Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__QUANTIFIED_SET1 = 24;

  /**
   * The feature id for the '<em><b>STRING Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__STRING_LITERAL1 = 25;

  /**
   * The feature id for the '<em><b>Unary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__UNARY_EXP1 = 26;

  /**
   * The feature id for the '<em><b>Struct1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__STRUCT1 = 27;

  /**
   * The feature id for the '<em><b>Record1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__RECORD1 = 28;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__OP = 29;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE__TYPREF = 30;

  /**
   * The number of structural features of the '<em>Bynary Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE_FEATURE_COUNT = 31;

  /**
   * The number of operations of the '<em>Bynary Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYNARY_EXP_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.CaseSubTypeImpl <em>Case Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.CaseSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getCaseSubType()
   * @generated
   */
  int CASE_SUB_TYPE = 23;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SUB_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SUB_TYPE__VALUE = 1;

  /**
   * The feature id for the '<em><b>Choices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SUB_TYPE__CHOICES = 2;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SUB_TYPE__ELSE = 3;

  /**
   * The number of structural features of the '<em>Case Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SUB_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Case Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SUB_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ChoicesTypeImpl <em>Choices Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ChoicesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getChoicesType()
   * @generated
   */
  int CHOICES_TYPE = 24;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Choice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICES_TYPE__CHOICE = 1;

  /**
   * The number of structural features of the '<em>Choices Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Choices Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ChoiceTypeImpl <em>Choice Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ChoiceTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getChoiceType()
   * @generated
   */
  int CHOICE_TYPE = 25;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE__THEN = 1;

  /**
   * The number of structural features of the '<em>Choice Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Choice Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ChoiceType1Impl <em>Choice Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ChoiceType1Impl
   * @see bxml.impl.BxmlPackageImpl#getChoiceType1()
   * @generated
   */
  int CHOICE_TYPE1 = 26;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE1__ATTR = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE1__VALUE = 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE1__THEN = 2;

  /**
   * The number of structural features of the '<em>Choice Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE1_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Choice Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ConcreteConstantsTypeImpl <em>Concrete Constants Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ConcreteConstantsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getConcreteConstantsType()
   * @generated
   */
  int CONCRETE_CONSTANTS_TYPE = 27;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CONSTANTS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CONSTANTS_TYPE__ID = 1;

  /**
   * The number of structural features of the '<em>Concrete Constants Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CONSTANTS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Concrete Constants Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_CONSTANTS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ConcreteVariablesTypeImpl <em>Concrete Variables Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ConcreteVariablesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getConcreteVariablesType()
   * @generated
   */
  int CONCRETE_VARIABLES_TYPE = 28;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_VARIABLES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_VARIABLES_TYPE__ID = 1;

  /**
   * The number of structural features of the '<em>Concrete Variables Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_VARIABLES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Concrete Variables Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_VARIABLES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ConditionTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getConditionType()
   * @generated
   */
  int CONDITION_TYPE = 29;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE__SET = 6;

  /**
   * The number of structural features of the '<em>Condition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Condition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ConstraintsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getConstraintsType()
   * @generated
   */
  int CONSTRAINTS_TYPE = 30;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_TYPE__SET = 6;

  /**
   * The number of structural features of the '<em>Constraints Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Constraints Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.DocumentRootImpl
   * @see bxml.impl.BxmlPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 31;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Abstract Constants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ABSTRACT_CONSTANTS = 3;

  /**
   * The feature id for the '<em><b>Abstract Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ABSTRACT_VARIABLES = 4;

  /**
   * The feature id for the '<em><b>Abstraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ABSTRACTION = 5;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ANY_SUB = 6;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ASSERT_SUB = 7;

  /**
   * The feature id for the '<em><b>Assertions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ASSERTIONS = 8;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ASSIGNEMENT_SUB = 9;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ATTR = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BECOMES_SUCH_THAT = 12;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BINARY_PRED = 13;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BLOC_SUB = 14;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BODY = 15;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BOOLEAN_EXP = 16;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BOOLEAN_LITERAL = 17;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CASE_SUB = 18;

  /**
   * The feature id for the '<em><b>Choices</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CHOICES = 19;

  /**
   * The feature id for the '<em><b>Concrete Constants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CONCRETE_CONSTANTS = 20;

  /**
   * The feature id for the '<em><b>Concrete Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CONCRETE_VARIABLES = 21;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CONDITION = 22;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CONSTRAINTS = 23;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EMPTY_SEQ = 24;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EMPTY_SET = 25;

  /**
   * The feature id for the '<em><b>Enumerated Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ENUMERATED_VALUES = 26;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EXP_COMPARISON = 27;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EXTENDS = 28;

  /**
   * The feature id for the '<em><b>Generic Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GENERIC_TYPE = 29;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GUARD = 30;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__IF_SUB = 31;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__IMPORTS = 32;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__INCLUDES = 33;

  /**
   * The feature id for the '<em><b>Initialisation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__INITIALISATION = 34;

  /**
   * The feature id for the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__INSTANCE = 35;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__INTEGER_LITERAL = 36;

  /**
   * The feature id for the '<em><b>Invariant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__INVARIANT = 37;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LET_SUB = 38;

  /**
   * The feature id for the '<em><b>Local Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LOCAL_OPERATIONS = 39;

  /**
   * The feature id for the '<em><b>Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MACHINE = 40;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__NARY_EXP = 41;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__NARY_PRED = 42;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__NARY_SUB = 43;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__OPERATION = 44;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__OPERATION_CALL = 45;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__OPERATIONS = 46;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PRECONDITION = 47;

  /**
   * The feature id for the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PRED = 48;

  /**
   * The feature id for the '<em><b>Promoted Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PROMOTED_OPERATION = 49;

  /**
   * The feature id for the '<em><b>Promotes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PROMOTES = 50;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PROPERTIES = 51;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__QUANTIFIED_EXP = 52;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__QUANTIFIED_PRED = 53;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__QUANTIFIED_SET = 54;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__RECORD = 55;

  /**
   * The feature id for the '<em><b>Record Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__RECORD_ITEM = 56;

  /**
   * The feature id for the '<em><b>Referenced Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REFERENCED_MACHINE = 57;

  /**
   * The feature id for the '<em><b>Refines</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REFINES = 58;

  /**
   * The feature id for the '<em><b>Sees</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEES = 59;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SELECT = 60;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SET = 61;

  /**
   * The feature id for the '<em><b>Sets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SETS = 62;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SKIP = 63;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__STRING_LITERAL = 64;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__STRUCT = 65;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__THEN = 66;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TYPE = 67;

  /**
   * The feature id for the '<em><b>Type Infos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TYPE_INFOS = 68;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__UNARY_PRED = 69;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__USES = 70;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VALUE = 71;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VARIN = 72;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VARIABLES = 73;

  /**
   * The feature id for the '<em><b>Variant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VARIANT = 74;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WHEN = 75;

  /**
   * The feature id for the '<em><b>When Clauses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WHEN_CLAUSES = 76;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WHILE = 77;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 78;

  /**
   * The number of operations of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ElseTypeImpl <em>Else Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ElseTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getElseType()
   * @generated
   */
  int ELSE_TYPE = 32;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__BLOC_SUB = 1;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__SKIP = 2;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__ASSERT_SUB = 3;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__IF_SUB = 4;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__BECOMES_SUCH_THAT = 5;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__ASSIGNEMENT_SUB = 6;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__SELECT = 7;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__CASE_SUB = 8;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__ANY_SUB = 9;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__LET_SUB = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__VARIN = 12;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__NARY_SUB = 13;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__OPERATION_CALL = 14;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE__WHILE = 15;

  /**
   * The number of structural features of the '<em>Else Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Else Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ElseType1Impl <em>Else Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ElseType1Impl
   * @see bxml.impl.BxmlPackageImpl#getElseType1()
   * @generated
   */
  int ELSE_TYPE1 = 33;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE1__ATTR = 0;

  /**
   * The feature id for the '<em><b>Choice</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE1__CHOICE = 1;

  /**
   * The number of structural features of the '<em>Else Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE1_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Else Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ElseType2Impl <em>Else Type2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ElseType2Impl
   * @see bxml.impl.BxmlPackageImpl#getElseType2()
   * @generated
   */
  int ELSE_TYPE2 = 34;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__ATTR = 0;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__BLOC_SUB = 1;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__SKIP = 2;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__ASSERT_SUB = 3;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__IF_SUB = 4;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__BECOMES_SUCH_THAT = 5;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__ASSIGNEMENT_SUB = 6;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__SELECT = 7;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__CASE_SUB = 8;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__ANY_SUB = 9;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__LET_SUB = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__VARIN = 12;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__NARY_SUB = 13;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__OPERATION_CALL = 14;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2__WHILE = 15;

  /**
   * The number of structural features of the '<em>Else Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Else Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_TYPE2_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.EmptySeqTypeImpl <em>Empty Seq Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.EmptySeqTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getEmptySeqType()
   * @generated
   */
  int EMPTY_SEQ_TYPE = 35;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_SEQ_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_SEQ_TYPE__TYPREF = 1;

  /**
   * The number of structural features of the '<em>Empty Seq Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_SEQ_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Empty Seq Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_SEQ_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.EmptySetTypeImpl <em>Empty Set Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.EmptySetTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getEmptySetType()
   * @generated
   */
  int EMPTY_SET_TYPE = 36;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_SET_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_SET_TYPE__TYPREF = 1;

  /**
   * The number of structural features of the '<em>Empty Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_SET_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Empty Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_SET_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.EnumeratedValuesTypeImpl <em>Enumerated Values Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.EnumeratedValuesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getEnumeratedValuesType()
   * @generated
   */
  int ENUMERATED_VALUES_TYPE = 37;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATED_VALUES_TYPE__ID = 0;

  /**
   * The number of structural features of the '<em>Enumerated Values Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATED_VALUES_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Enumerated Values Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATED_VALUES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ExpComparisonTypeImpl <em>Exp Comparison Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ExpComparisonTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getExpComparisonType()
   * @generated
   */
  int EXP_COMPARISON_TYPE = 38;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__RECORD = 14;

  /**
   * The feature id for the '<em><b>Binary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__BINARY_EXP1 = 15;

  /**
   * The feature id for the '<em><b>Nary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__NARY_EXP1 = 16;

  /**
   * The feature id for the '<em><b>Boolean Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__BOOLEAN_LITERAL1 = 17;

  /**
   * The feature id for the '<em><b>Boolean Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__BOOLEAN_EXP1 = 18;

  /**
   * The feature id for the '<em><b>Empty Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__EMPTY_SET1 = 19;

  /**
   * The feature id for the '<em><b>Empty Seq1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__EMPTY_SEQ1 = 20;

  /**
   * The feature id for the '<em><b>Id1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__ID1 = 21;

  /**
   * The feature id for the '<em><b>Integer Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__INTEGER_LITERAL1 = 22;

  /**
   * The feature id for the '<em><b>Quantified Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__QUANTIFIED_EXP1 = 23;

  /**
   * The feature id for the '<em><b>Quantified Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__QUANTIFIED_SET1 = 24;

  /**
   * The feature id for the '<em><b>STRING Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__STRING_LITERAL1 = 25;

  /**
   * The feature id for the '<em><b>Unary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__UNARY_EXP1 = 26;

  /**
   * The feature id for the '<em><b>Struct1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__STRUCT1 = 27;

  /**
   * The feature id for the '<em><b>Record1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__RECORD1 = 28;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE__OP = 29;

  /**
   * The number of structural features of the '<em>Exp Comparison Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE_FEATURE_COUNT = 30;

  /**
   * The number of operations of the '<em>Exp Comparison Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_COMPARISON_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ExtendsTypeImpl <em>Extends Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ExtendsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getExtendsType()
   * @generated
   */
  int EXTENDS_TYPE = 39;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Referenced Machine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_TYPE__REFERENCED_MACHINE = 1;

  /**
   * The number of structural features of the '<em>Extends Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Extends Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.GuardTypeImpl <em>Guard Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.GuardTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getGuardType()
   * @generated
   */
  int GUARD_TYPE = 40;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_TYPE__SET = 6;

  /**
   * The number of structural features of the '<em>Guard Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Guard Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.IdentifierImpl <em>Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.IdentifierImpl
   * @see bxml.impl.BxmlPackageImpl#getIdentifier()
   * @generated
   */
  int IDENTIFIER = 41;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__ATTR = 0;

  /**
   * The feature id for the '<em><b>Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__INSTANCE = 2;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__SUFFIX = 3;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__TYPREF = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__VALUE = 5;

  /**
   * The number of structural features of the '<em>Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.IdTypeImpl <em>Id Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.IdTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getIdType()
   * @generated
   */
  int ID_TYPE = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_TYPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Id Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Id Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.IfSubTypeImpl <em>If Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.IfSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getIfSubType()
   * @generated
   */
  int IF_SUB_TYPE = 43;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SUB_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SUB_TYPE__CONDITION = 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SUB_TYPE__THEN = 2;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SUB_TYPE__ELSE = 3;

  /**
   * The feature id for the '<em><b>Elseif</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SUB_TYPE__ELSEIF = 4;

  /**
   * The number of structural features of the '<em>If Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SUB_TYPE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>If Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SUB_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ImportsTypeImpl <em>Imports Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ImportsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getImportsType()
   * @generated
   */
  int IMPORTS_TYPE = 44;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Referenced Machine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_TYPE__REFERENCED_MACHINE = 1;

  /**
   * The number of structural features of the '<em>Imports Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Imports Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.IncludesTypeImpl <em>Includes Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.IncludesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getIncludesType()
   * @generated
   */
  int INCLUDES_TYPE = 45;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Referenced Machine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDES_TYPE__REFERENCED_MACHINE = 1;

  /**
   * The number of structural features of the '<em>Includes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Includes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.InitialisationTypeImpl <em>Initialisation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.InitialisationTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getInitialisationType()
   * @generated
   */
  int INITIALISATION_TYPE = 46;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__BLOC_SUB = 1;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__SKIP = 2;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__ASSERT_SUB = 3;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__IF_SUB = 4;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__BECOMES_SUCH_THAT = 5;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__ASSIGNEMENT_SUB = 6;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__SELECT = 7;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__CASE_SUB = 8;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__ANY_SUB = 9;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__LET_SUB = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__VARIN = 12;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__NARY_SUB = 13;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__OPERATION_CALL = 14;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE__WHILE = 15;

  /**
   * The number of structural features of the '<em>Initialisation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Initialisation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALISATION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.InputParametersTypeImpl <em>Input Parameters Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.InputParametersTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getInputParametersType()
   * @generated
   */
  int INPUT_PARAMETERS_TYPE = 47;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE__ID = 0;

  /**
   * The number of structural features of the '<em>Input Parameters Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Input Parameters Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.InputParametersType1Impl <em>Input Parameters Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.InputParametersType1Impl
   * @see bxml.impl.BxmlPackageImpl#getInputParametersType1()
   * @generated
   */
  int INPUT_PARAMETERS_TYPE1 = 48;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__ATTR = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__BINARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__NARY_EXP = 3;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__BOOLEAN_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__BOOLEAN_EXP = 5;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__EMPTY_SET = 6;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__EMPTY_SEQ = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__ID = 8;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__INTEGER_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__QUANTIFIED_EXP = 10;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__QUANTIFIED_SET = 11;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__STRING_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__UNARY_EXP = 13;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__STRUCT = 14;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1__RECORD = 15;

  /**
   * The number of structural features of the '<em>Input Parameters Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Input Parameters Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_PARAMETERS_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.IntegerLiteralTypeImpl <em>Integer Literal Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.IntegerLiteralTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getIntegerLiteralType()
   * @generated
   */
  int INTEGER_LITERAL_TYPE = 49;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_TYPE__TYPREF = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_TYPE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Integer Literal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Integer Literal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.InvariantTypeImpl <em>Invariant Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.InvariantTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getInvariantType()
   * @generated
   */
  int INVARIANT_TYPE = 50;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_TYPE__SET = 6;

  /**
   * The number of structural features of the '<em>Invariant Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Invariant Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.LETSubTypeImpl <em>LET Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.LETSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getLETSubType()
   * @generated
   */
  int LET_SUB_TYPE = 51;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_SUB_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_SUB_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_SUB_TYPE__VALUES = 2;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_SUB_TYPE__THEN = 3;

  /**
   * The number of structural features of the '<em>LET Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_SUB_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>LET Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LET_SUB_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.LocalOperationsTypeImpl <em>Local Operations Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.LocalOperationsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getLocalOperationsType()
   * @generated
   */
  int LOCAL_OPERATIONS_TYPE = 52;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OPERATIONS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OPERATIONS_TYPE__OPERATION = 1;

  /**
   * The number of structural features of the '<em>Local Operations Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OPERATIONS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Local Operations Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OPERATIONS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.MachineTypeImpl <em>Machine Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.MachineTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getMachineType()
   * @generated
   */
  int MACHINE_TYPE = 53;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Abstraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__ABSTRACTION = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__CONSTRAINTS = 3;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__INCLUDES = 4;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__IMPORTS = 5;

  /**
   * The feature id for the '<em><b>Sees</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__SEES = 6;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__EXTENDS = 7;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__USES = 8;

  /**
   * The feature id for the '<em><b>Promotes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__PROMOTES = 9;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__VALUES = 10;

  /**
   * The feature id for the '<em><b>Sets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__SETS = 11;

  /**
   * The feature id for the '<em><b>Abstract Constants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__ABSTRACT_CONSTANTS = 12;

  /**
   * The feature id for the '<em><b>Concrete Constants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__CONCRETE_CONSTANTS = 13;

  /**
   * The feature id for the '<em><b>Abstract Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__ABSTRACT_VARIABLES = 14;

  /**
   * The feature id for the '<em><b>Concrete Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__CONCRETE_VARIABLES = 15;

  /**
   * The feature id for the '<em><b>Variant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__VARIANT = 16;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__PROPERTIES = 17;

  /**
   * The feature id for the '<em><b>Invariant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__INVARIANT = 18;

  /**
   * The feature id for the '<em><b>Initialisation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__INITIALISATION = 19;

  /**
   * The feature id for the '<em><b>Assertions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__ASSERTIONS = 20;

  /**
   * The feature id for the '<em><b>Local Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__LOCAL_OPERATIONS = 21;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__OPERATIONS = 22;

  /**
   * The feature id for the '<em><b>Type Infos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__TYPE_INFOS = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__NAME = 24;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE__TYPE = 25;

  /**
   * The number of structural features of the '<em>Machine Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE_FEATURE_COUNT = 26;

  /**
   * The number of operations of the '<em>Machine Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.NameTypeImpl <em>Name Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.NameTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getNameType()
   * @generated
   */
  int NAME_TYPE = 54;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TYPE__ID = 1;

  /**
   * The number of structural features of the '<em>Name Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Name Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.NaryExpTypeImpl <em>Nary Exp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.NaryExpTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getNaryExpType()
   * @generated
   */
  int NARY_EXP_TYPE = 55;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__BINARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__NARY_EXP = 3;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__BOOLEAN_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__BOOLEAN_EXP = 5;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__EMPTY_SET = 6;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__EMPTY_SEQ = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__ID = 8;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__INTEGER_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__QUANTIFIED_EXP = 10;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__QUANTIFIED_SET = 11;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__STRING_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__UNARY_EXP = 13;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__STRUCT = 14;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__RECORD = 15;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__OP = 16;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__TYPREF = 17;

  /**
   * The number of structural features of the '<em>Nary Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE_FEATURE_COUNT = 18;

  /**
   * The number of operations of the '<em>Nary Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.NaryPredTypeImpl <em>Nary Pred Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.NaryPredTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getNaryPredType()
   * @generated
   */
  int NARY_PRED_TYPE = 56;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE__PREDICATE = 1;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE__BINARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE__NARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE__UNARY_PRED = 4;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE__QUANTIFIED_PRED = 5;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE__EXP_COMPARISON = 6;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE__SET = 7;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE__OP = 8;

  /**
   * The number of structural features of the '<em>Nary Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE_FEATURE_COUNT = 9;

  /**
   * The number of operations of the '<em>Nary Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PRED_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.NarySubTypeImpl <em>Nary Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.NarySubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getNarySubType()
   * @generated
   */
  int NARY_SUB_TYPE = 57;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__SUBSTITUTION = 1;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__BLOC_SUB = 2;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__SKIP = 3;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__ASSERT_SUB = 4;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__IF_SUB = 5;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__BECOMES_SUCH_THAT = 6;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__ASSIGNEMENT_SUB = 7;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__SELECT = 8;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__CASE_SUB = 9;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__ANY_SUB = 10;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__LET_SUB = 11;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__BECOMES_IN = 12;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__VARIN = 13;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__NARY_SUB = 14;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__OPERATION_CALL = 15;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__WHILE = 16;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE__OP = 17;

  /**
   * The number of structural features of the '<em>Nary Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE_FEATURE_COUNT = 18;

  /**
   * The number of operations of the '<em>Nary Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUB_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.OperationCallTypeImpl <em>Operation Call Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.OperationCallTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getOperationCallType()
   * @generated
   */
  int OPERATION_CALL_TYPE = 58;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Input Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_TYPE__INPUT_PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Output Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_TYPE__OUTPUT_PARAMETERS = 3;

  /**
   * The number of structural features of the '<em>Operation Call Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Operation Call Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.OperationsTypeImpl <em>Operations Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.OperationsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getOperationsType()
   * @generated
   */
  int OPERATIONS_TYPE = 59;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_TYPE__OPERATION = 1;

  /**
   * The number of structural features of the '<em>Operations Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Operations Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.OperationTypeImpl <em>Operation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.OperationTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getOperationType()
   * @generated
   */
  int OPERATION_TYPE = 60;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Refines</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE__REFINES = 1;

  /**
   * The feature id for the '<em><b>Output Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE__OUTPUT_PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Input Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE__INPUT_PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE__PRECONDITION = 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE__BODY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE__NAME = 6;

  /**
   * The number of structural features of the '<em>Operation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Operation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.OutputParametersTypeImpl <em>Output Parameters Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.OutputParametersTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getOutputParametersType()
   * @generated
   */
  int OUTPUT_PARAMETERS_TYPE = 61;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE__ID = 0;

  /**
   * The number of structural features of the '<em>Output Parameters Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Output Parameters Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.OutputParametersType1Impl <em>Output Parameters Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.OutputParametersType1Impl
   * @see bxml.impl.BxmlPackageImpl#getOutputParametersType1()
   * @generated
   */
  int OUTPUT_PARAMETERS_TYPE1 = 62;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__ATTR = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__BINARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__NARY_EXP = 3;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__BOOLEAN_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__BOOLEAN_EXP = 5;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__EMPTY_SET = 6;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__EMPTY_SEQ = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__ID = 8;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__INTEGER_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__QUANTIFIED_EXP = 10;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__QUANTIFIED_SET = 11;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__STRING_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__UNARY_EXP = 13;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__STRUCT = 14;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1__RECORD = 15;

  /**
   * The number of structural features of the '<em>Output Parameters Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Output Parameters Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_PARAMETERS_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ParametersTypeImpl <em>Parameters Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ParametersTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getParametersType()
   * @generated
   */
  int PARAMETERS_TYPE = 63;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__ID = 1;

  /**
   * The number of structural features of the '<em>Parameters Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Parameters Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ParametersType1Impl <em>Parameters Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ParametersType1Impl
   * @see bxml.impl.BxmlPackageImpl#getParametersType1()
   * @generated
   */
  int PARAMETERS_TYPE1 = 64;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__RECORD = 14;

  /**
   * The number of structural features of the '<em>Parameters Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1_FEATURE_COUNT = 15;

  /**
   * The number of operations of the '<em>Parameters Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.PreconditionTypeImpl <em>Precondition Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.PreconditionTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getPreconditionType()
   * @generated
   */
  int PRECONDITION_TYPE = 65;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_TYPE__BINARY_PRED = 0;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_TYPE__NARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_TYPE__UNARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_TYPE__QUANTIFIED_PRED = 3;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_TYPE__EXP_COMPARISON = 4;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_TYPE__SET = 5;

  /**
   * The number of structural features of the '<em>Precondition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_TYPE_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Precondition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECONDITION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.PredTypeImpl <em>Pred Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.PredTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getPredType()
   * @generated
   */
  int PRED_TYPE = 66;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE__SET = 6;

  /**
   * The number of structural features of the '<em>Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.PromotedOperationTypeImpl <em>Promoted Operation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.PromotedOperationTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getPromotedOperationType()
   * @generated
   */
  int PROMOTED_OPERATION_TYPE = 67;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTED_OPERATION_TYPE__MIXED = 0;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTED_OPERATION_TYPE__ATTR = 1;

  /**
   * The number of structural features of the '<em>Promoted Operation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTED_OPERATION_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Promoted Operation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTED_OPERATION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.PromotesTypeImpl <em>Promotes Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.PromotesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getPromotesType()
   * @generated
   */
  int PROMOTES_TYPE = 68;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Promoted Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTES_TYPE__PROMOTED_OPERATION = 1;

  /**
   * The number of structural features of the '<em>Promotes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Promotes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.PropertiesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getPropertiesType()
   * @generated
   */
  int PROPERTIES_TYPE = 69;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TYPE__SET = 6;

  /**
   * The number of structural features of the '<em>Properties Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Properties Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.QuantifiedExpTypeImpl <em>Quantified Exp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.QuantifiedExpTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getQuantifiedExpType()
   * @generated
   */
  int QUANTIFIED_EXP_TYPE = 70;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_TYPE__PRED = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_TYPE__BODY = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_TYPE__TYPE = 4;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_TYPE__TYPREF = 5;

  /**
   * The number of structural features of the '<em>Quantified Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_TYPE_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Quantified Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.QuantifiedPredTypeImpl <em>Quantified Pred Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.QuantifiedPredTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getQuantifiedPredType()
   * @generated
   */
  int QUANTIFIED_PRED_TYPE = 71;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_PRED_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_PRED_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_PRED_TYPE__BODY = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_PRED_TYPE__TYPE = 3;

  /**
   * The number of structural features of the '<em>Quantified Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_PRED_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Quantified Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_PRED_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.QuantifiedSetTypeImpl <em>Quantified Set Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.QuantifiedSetTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getQuantifiedSetType()
   * @generated
   */
  int QUANTIFIED_SET_TYPE = 72;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SET_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SET_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SET_TYPE__BODY = 2;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SET_TYPE__TYPREF = 3;

  /**
   * The number of structural features of the '<em>Quantified Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SET_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Quantified Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SET_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.RecordItemTypeImpl <em>Record Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.RecordItemTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getRecordItemType()
   * @generated
   */
  int RECORD_ITEM_TYPE = 73;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__RECORD = 14;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__LABEL = 15;

  /**
   * The number of structural features of the '<em>Record Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Record Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.RecordTypeImpl <em>Record Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.RecordTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getRecordType()
   * @generated
   */
  int RECORD_TYPE = 74;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Record Item</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__RECORD_ITEM = 1;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE__TYPREF = 2;

  /**
   * The number of structural features of the '<em>Record Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Record Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ReferencedMachineTypeImpl <em>Referenced Machine Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ReferencedMachineTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getReferencedMachineType()
   * @generated
   */
  int REFERENCED_MACHINE_TYPE = 75;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE__INSTANCE = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE__PARAMETERS = 3;

  /**
   * The number of structural features of the '<em>Referenced Machine Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Referenced Machine Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.RefinesTypeImpl <em>Refines Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.RefinesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getRefinesType()
   * @generated
   */
  int REFINES_TYPE = 76;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINES_TYPE__ID = 1;

  /**
   * The number of structural features of the '<em>Refines Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Refines Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.SeesTypeImpl <em>Sees Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.SeesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getSeesType()
   * @generated
   */
  int SEES_TYPE = 77;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Referenced Machine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEES_TYPE__REFERENCED_MACHINE = 1;

  /**
   * The number of structural features of the '<em>Sees Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Sees Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.SelectTypeImpl <em>Select Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.SelectTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getSelectType()
   * @generated
   */
  int SELECT_TYPE = 78;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>When Clauses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TYPE__WHEN_CLAUSES = 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TYPE__ELSE = 2;

  /**
   * The number of structural features of the '<em>Select Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Select Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.SetsTypeImpl <em>Sets Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.SetsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getSetsType()
   * @generated
   */
  int SETS_TYPE = 79;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETS_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETS_TYPE__SET = 1;

  /**
   * The number of structural features of the '<em>Sets Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETS_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Sets Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.SetTypeImpl <em>Set Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.SetTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getSetType()
   * @generated
   */
  int SET_TYPE = 80;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__ID = 1;

  /**
   * The feature id for the '<em><b>Enumerated Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE__ENUMERATED_VALUES = 2;

  /**
   * The number of structural features of the '<em>Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.SetType1Impl <em>Set Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.SetType1Impl
   * @see bxml.impl.BxmlPackageImpl#getSetType1()
   * @generated
   */
  int SET_TYPE1 = 81;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE1__ID = 0;

  /**
   * The number of structural features of the '<em>Set Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE1_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Set Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.SkipTypeImpl <em>Skip Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.SkipTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getSkipType()
   * @generated
   */
  int SKIP_TYPE = 82;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_TYPE__ATTR = 0;

  /**
   * The number of structural features of the '<em>Skip Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Skip Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.STRINGLiteralTypeImpl <em>STRING Literal Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.STRINGLiteralTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getSTRINGLiteralType()
   * @generated
   */
  int STRING_LITERAL_TYPE = 83;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_TYPE__TYPREF = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_TYPE__VALUE = 2;

  /**
   * The number of structural features of the '<em>STRING Literal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>STRING Literal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.StructTypeImpl <em>Struct Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.StructTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getStructType()
   * @generated
   */
  int STRUCT_TYPE = 84;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Record Item</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__RECORD_ITEM = 1;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE__TYPREF = 2;

  /**
   * The number of structural features of the '<em>Struct Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Struct Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ThenTypeImpl <em>Then Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ThenTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getThenType()
   * @generated
   */
  int THEN_TYPE = 85;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__BLOC_SUB = 1;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__SKIP = 2;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__ASSERT_SUB = 3;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__IF_SUB = 4;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__BECOMES_SUCH_THAT = 5;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__ASSIGNEMENT_SUB = 6;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__SELECT = 7;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__CASE_SUB = 8;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__ANY_SUB = 9;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__LET_SUB = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__VARIN = 12;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__NARY_SUB = 13;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__OPERATION_CALL = 14;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE__WHILE = 15;

  /**
   * The number of structural features of the '<em>Then Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Then Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THEN_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.TypeInfoImpl <em>Type Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.TypeInfoImpl
   * @see bxml.impl.BxmlPackageImpl#getTypeInfo()
   * @generated
   */
  int TYPE_INFO = 86;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFO__ID = 0;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFO__UNARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFO__BINARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFO__STRUCT = 3;

  /**
   * The feature id for the '<em><b>Generic Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFO__GENERIC_TYPE = 4;

  /**
   * The feature id for the '<em><b>Id1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFO__ID1 = 5;

  /**
   * The number of structural features of the '<em>Type Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFO_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Type Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFO_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.TypeInfosTypeImpl <em>Type Infos Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.TypeInfosTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getTypeInfosType()
   * @generated
   */
  int TYPE_INFOS_TYPE = 87;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFOS_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type Infos Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFOS_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Type Infos Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INFOS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.UnaryExpTypeImpl <em>Unary Exp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.UnaryExpTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getUnaryExpType()
   * @generated
   */
  int UNARY_EXP_TYPE = 88;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__RECORD = 14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__OP = 15;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE__TYPREF = 16;

  /**
   * The number of structural features of the '<em>Unary Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE_FEATURE_COUNT = 17;

  /**
   * The number of operations of the '<em>Unary Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.UnaryExpType2Impl <em>Unary Exp Type2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.UnaryExpType2Impl
   * @see bxml.impl.BxmlPackageImpl#getUnaryExpType2()
   * @generated
   */
  int UNARY_EXP_TYPE2 = 89;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE2__ID = 0;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE2__UNARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE2__BINARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE2__STRUCT = 3;

  /**
   * The feature id for the '<em><b>Generic Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE2__GENERIC_TYPE = 4;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE2__OP = 5;

  /**
   * The number of structural features of the '<em>Unary Exp Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE2_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Unary Exp Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXP_TYPE2_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.UnaryPredTypeImpl <em>Unary Pred Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.UnaryPredTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getUnaryPredType()
   * @generated
   */
  int UNARY_PRED_TYPE = 90;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE__NARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE__EXP_COMPARISON = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE__SET = 6;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE__OP = 7;

  /**
   * The number of structural features of the '<em>Unary Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Unary Pred Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PRED_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.UsesTypeImpl <em>Uses Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.UsesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getUsesType()
   * @generated
   */
  int USES_TYPE = 91;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Referenced Machine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_TYPE__REFERENCED_MACHINE = 1;

  /**
   * The number of structural features of the '<em>Uses Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Uses Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ValuationTypeImpl <em>Valuation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ValuationTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getValuationType()
   * @generated
   */
  int VALUATION_TYPE = 92;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__RECORD = 14;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__IDENT = 15;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__TYPREF = 16;

  /**
   * The number of structural features of the '<em>Valuation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE_FEATURE_COUNT = 17;

  /**
   * The number of operations of the '<em>Valuation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ValuationType1Impl <em>Valuation Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ValuationType1Impl
   * @see bxml.impl.BxmlPackageImpl#getValuationType1()
   * @generated
   */
  int VALUATION_TYPE1 = 93;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__RECORD = 14;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__IDENT = 15;

  /**
   * The number of structural features of the '<em>Valuation Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Valuation Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ValuesTypeImpl <em>Values Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ValuesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getValuesType()
   * @generated
   */
  int VALUES_TYPE = 94;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Valuation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE__VALUATION = 1;

  /**
   * The number of structural features of the '<em>Values Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Values Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ValuesType1Impl <em>Values Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ValuesType1Impl
   * @see bxml.impl.BxmlPackageImpl#getValuesType1()
   * @generated
   */
  int VALUES_TYPE1 = 95;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE1__ATTR = 0;

  /**
   * The feature id for the '<em><b>Valuation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE1__VALUATION = 1;

  /**
   * The number of structural features of the '<em>Values Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE1_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Values Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ValuesType2Impl <em>Values Type2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ValuesType2Impl
   * @see bxml.impl.BxmlPackageImpl#getValuesType2()
   * @generated
   */
  int VALUES_TYPE2 = 96;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__ATTR = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__BINARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__NARY_EXP = 3;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__BOOLEAN_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__BOOLEAN_EXP = 5;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__EMPTY_SET = 6;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__EMPTY_SEQ = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__ID = 8;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__INTEGER_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__QUANTIFIED_EXP = 10;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__QUANTIFIED_SET = 11;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__STRING_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__UNARY_EXP = 13;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__STRUCT = 14;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__RECORD = 15;

  /**
   * The number of structural features of the '<em>Values Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Values Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ValueTypeImpl <em>Value Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ValueTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getValueType()
   * @generated
   */
  int VALUE_TYPE = 97;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE__RECORD = 14;

  /**
   * The number of structural features of the '<em>Value Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE_FEATURE_COUNT = 15;

  /**
   * The number of operations of the '<em>Value Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.VariablesTypeImpl <em>Variables Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.VariablesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getVariablesType()
   * @generated
   */
  int VARIABLES_TYPE = 98;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__BINARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__NARY_EXP = 3;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__BOOLEAN_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__BOOLEAN_EXP = 5;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__EMPTY_SET = 6;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__EMPTY_SEQ = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__ID = 8;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__INTEGER_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__QUANTIFIED_EXP = 10;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__QUANTIFIED_SET = 11;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__STRING_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__UNARY_EXP = 13;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__STRUCT = 14;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__RECORD = 15;

  /**
   * The number of structural features of the '<em>Variables Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Variables Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.VariablesType1Impl <em>Variables Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.VariablesType1Impl
   * @see bxml.impl.BxmlPackageImpl#getVariablesType1()
   * @generated
   */
  int VARIABLES_TYPE1 = 99;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE1__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE1__ID = 1;

  /**
   * The number of structural features of the '<em>Variables Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE1_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Variables Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.VariantTypeImpl <em>Variant Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.VariantTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getVariantType()
   * @generated
   */
  int VARIANT_TYPE = 100;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE__RECORD = 14;

  /**
   * The number of structural features of the '<em>Variant Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE_FEATURE_COUNT = 15;

  /**
   * The number of operations of the '<em>Variant Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.VARINTypeImpl <em>VARIN Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.VARINTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getVARINType()
   * @generated
   */
  int VARIN_TYPE = 101;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIN_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIN_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIN_TYPE__BODY = 2;

  /**
   * The number of structural features of the '<em>VARIN Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIN_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>VARIN Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIN_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.WhenClausesTypeImpl <em>When Clauses Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.WhenClausesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getWhenClausesType()
   * @generated
   */
  int WHEN_CLAUSES_TYPE = 102;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSES_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSES_TYPE__WHEN = 1;

  /**
   * The number of structural features of the '<em>When Clauses Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSES_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>When Clauses Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.WhenTypeImpl <em>When Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.WhenTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getWhenType()
   * @generated
   */
  int WHEN_TYPE = 103;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TYPE__CONDITION = 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TYPE__THEN = 2;

  /**
   * The number of structural features of the '<em>When Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>When Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.WhileTypeImpl <em>While Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.WhileTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getWhileType()
   * @generated
   */
  int WHILE_TYPE = 104;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_TYPE__CONDITION = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_TYPE__BODY = 2;

  /**
   * The feature id for the '<em><b>Invariant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_TYPE__INVARIANT = 3;

  /**
   * The feature id for the '<em><b>Variant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_TYPE__VARIANT = 4;

  /**
   * The number of structural features of the '<em>While Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_TYPE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>While Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.ElseifType <em>Elseif Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.ElseifType
   * @see bxml.impl.BxmlPackageImpl#getElseifType()
   * @generated
   */
  int ELSEIF_TYPE = 105;

  /**
   * The meta object id for the '{@link bxml.OpType <em>Op Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType
   * @see bxml.impl.BxmlPackageImpl#getOpType()
   * @generated
   */
  int OP_TYPE = 106;

  /**
   * The meta object id for the '{@link bxml.OpType1 <em>Op Type1</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType1
   * @see bxml.impl.BxmlPackageImpl#getOpType1()
   * @generated
   */
  int OP_TYPE1 = 107;

  /**
   * The meta object id for the '{@link bxml.OpType2 <em>Op Type2</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType2
   * @see bxml.impl.BxmlPackageImpl#getOpType2()
   * @generated
   */
  int OP_TYPE2 = 108;

  /**
   * The meta object id for the '{@link bxml.OpType3 <em>Op Type3</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType3
   * @see bxml.impl.BxmlPackageImpl#getOpType3()
   * @generated
   */
  int OP_TYPE3 = 109;

  /**
   * The meta object id for the '{@link bxml.OpType4 <em>Op Type4</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType4
   * @see bxml.impl.BxmlPackageImpl#getOpType4()
   * @generated
   */
  int OP_TYPE4 = 110;

  /**
   * The meta object id for the '{@link bxml.OpType5 <em>Op Type5</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType5
   * @see bxml.impl.BxmlPackageImpl#getOpType5()
   * @generated
   */
  int OP_TYPE5 = 111;

  /**
   * The meta object id for the '{@link bxml.OpType6 <em>Op Type6</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType6
   * @see bxml.impl.BxmlPackageImpl#getOpType6()
   * @generated
   */
  int OP_TYPE6 = 112;

  /**
   * The meta object id for the '{@link bxml.OpType7 <em>Op Type7</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType7
   * @see bxml.impl.BxmlPackageImpl#getOpType7()
   * @generated
   */
  int OP_TYPE7 = 113;

  /**
   * The meta object id for the '{@link bxml.OpType8 <em>Op Type8</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType8
   * @see bxml.impl.BxmlPackageImpl#getOpType8()
   * @generated
   */
  int OP_TYPE8 = 114;

  /**
   * The meta object id for the '{@link bxml.OpType9 <em>Op Type9</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType9
   * @see bxml.impl.BxmlPackageImpl#getOpType9()
   * @generated
   */
  int OP_TYPE9 = 115;

  /**
   * The meta object id for the '{@link bxml.TypeType <em>Type Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.TypeType
   * @see bxml.impl.BxmlPackageImpl#getTypeType()
   * @generated
   */
  int TYPE_TYPE = 116;

  /**
   * The meta object id for the '{@link bxml.TypeType1 <em>Type Type1</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.TypeType1
   * @see bxml.impl.BxmlPackageImpl#getTypeType1()
   * @generated
   */
  int TYPE_TYPE1 = 117;

  /**
   * The meta object id for the '{@link bxml.TypeType2 <em>Type Type2</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.TypeType2
   * @see bxml.impl.BxmlPackageImpl#getTypeType2()
   * @generated
   */
  int TYPE_TYPE2 = 118;

  /**
   * The meta object id for the '{@link bxml.ValueType1 <em>Value Type1</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.ValueType1
   * @see bxml.impl.BxmlPackageImpl#getValueType1()
   * @generated
   */
  int VALUE_TYPE1 = 119;

  /**
   * The meta object id for the '<em>Elseif Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.ElseifType
   * @see bxml.impl.BxmlPackageImpl#getElseifTypeObject()
   * @generated
   */
  int ELSEIF_TYPE_OBJECT = 120;

  /**
   * The meta object id for the '<em>Op Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType1
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject()
   * @generated
   */
  int OP_TYPE_OBJECT = 121;

  /**
   * The meta object id for the '<em>Op Type Object1</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType8
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject1()
   * @generated
   */
  int OP_TYPE_OBJECT1 = 122;

  /**
   * The meta object id for the '<em>Op Type Object2</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType5
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject2()
   * @generated
   */
  int OP_TYPE_OBJECT2 = 123;

  /**
   * The meta object id for the '<em>Op Type Object3</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType4
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject3()
   * @generated
   */
  int OP_TYPE_OBJECT3 = 124;

  /**
   * The meta object id for the '<em>Op Type Object4</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType3
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject4()
   * @generated
   */
  int OP_TYPE_OBJECT4 = 125;

  /**
   * The meta object id for the '<em>Op Type Object5</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject5()
   * @generated
   */
  int OP_TYPE_OBJECT5 = 126;

  /**
   * The meta object id for the '<em>Op Type Object6</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType7
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject6()
   * @generated
   */
  int OP_TYPE_OBJECT6 = 127;

  /**
   * The meta object id for the '<em>Op Type Object7</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType6
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject7()
   * @generated
   */
  int OP_TYPE_OBJECT7 = 128;

  /**
   * The meta object id for the '<em>Op Type Object8</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType2
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject8()
   * @generated
   */
  int OP_TYPE_OBJECT8 = 129;

  /**
   * The meta object id for the '<em>Op Type Object9</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpType9
   * @see bxml.impl.BxmlPackageImpl#getOpTypeObject9()
   * @generated
   */
  int OP_TYPE_OBJECT9 = 130;

  /**
   * The meta object id for the '<em>Type Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.TypeType
   * @see bxml.impl.BxmlPackageImpl#getTypeTypeObject()
   * @generated
   */
  int TYPE_TYPE_OBJECT = 131;

  /**
   * The meta object id for the '<em>Type Type Object1</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.TypeType1
   * @see bxml.impl.BxmlPackageImpl#getTypeTypeObject1()
   * @generated
   */
  int TYPE_TYPE_OBJECT1 = 132;

  /**
   * The meta object id for the '<em>Type Type Object2</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.TypeType2
   * @see bxml.impl.BxmlPackageImpl#getTypeTypeObject2()
   * @generated
   */
  int TYPE_TYPE_OBJECT2 = 133;

  /**
   * The meta object id for the '<em>Value Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.ValueType1
   * @see bxml.impl.BxmlPackageImpl#getValueTypeObject()
   * @generated
   */
  int VALUE_TYPE_OBJECT = 134;


  /**
   * Returns the meta object for class '{@link bxml.AbstractConstantsType <em>Abstract Constants Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Constants Type</em>'.
   * @see bxml.AbstractConstantsType
   * @generated
   */
  EClass getAbstractConstantsType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AbstractConstantsType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.AbstractConstantsType#getAttr()
   * @see #getAbstractConstantsType()
   * @generated
   */
  EReference getAbstractConstantsType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.AbstractConstantsType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.AbstractConstantsType#getId()
   * @see #getAbstractConstantsType()
   * @generated
   */
  EReference getAbstractConstantsType_Id();

  /**
   * Returns the meta object for class '{@link bxml.AbstractionType <em>Abstraction Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstraction Type</em>'.
   * @see bxml.AbstractionType
   * @generated
   */
  EClass getAbstractionType();

  /**
   * Returns the meta object for the attribute list '{@link bxml.AbstractionType#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see bxml.AbstractionType#getMixed()
   * @see #getAbstractionType()
   * @generated
   */
  EAttribute getAbstractionType_Mixed();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AbstractionType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.AbstractionType#getAttr()
   * @see #getAbstractionType()
   * @generated
   */
  EReference getAbstractionType_Attr();

  /**
   * Returns the meta object for class '{@link bxml.AbstractVariablesType <em>Abstract Variables Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Variables Type</em>'.
   * @see bxml.AbstractVariablesType
   * @generated
   */
  EClass getAbstractVariablesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AbstractVariablesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.AbstractVariablesType#getAttr()
   * @see #getAbstractVariablesType()
   * @generated
   */
  EReference getAbstractVariablesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.AbstractVariablesType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.AbstractVariablesType#getId()
   * @see #getAbstractVariablesType()
   * @generated
   */
  EReference getAbstractVariablesType_Id();

  /**
   * Returns the meta object for class '{@link bxml.ANYSubType <em>ANY Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ANY Sub Type</em>'.
   * @see bxml.ANYSubType
   * @generated
   */
  EClass getANYSubType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ANYSubType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ANYSubType#getAttr()
   * @see #getANYSubType()
   * @generated
   */
  EReference getANYSubType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ANYSubType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.ANYSubType#getVariables()
   * @see #getANYSubType()
   * @generated
   */
  EReference getANYSubType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ANYSubType#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred</em>'.
   * @see bxml.ANYSubType#getPred()
   * @see #getANYSubType()
   * @generated
   */
  EReference getANYSubType_Pred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ANYSubType#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see bxml.ANYSubType#getThen()
   * @see #getANYSubType()
   * @generated
   */
  EReference getANYSubType_Then();

  /**
   * Returns the meta object for class '{@link bxml.AssertionsType <em>Assertions Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertions Type</em>'.
   * @see bxml.AssertionsType
   * @generated
   */
  EClass getAssertionsType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssertionsType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.AssertionsType#getAttr()
   * @see #getAssertionsType()
   * @generated
   */
  EReference getAssertionsType_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.AssertionsType#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Predicate</em>'.
   * @see bxml.AssertionsType#getPredicate()
   * @see #getAssertionsType()
   * @generated
   */
  EAttribute getAssertionsType_Predicate();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.AssertionsType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Pred</em>'.
   * @see bxml.AssertionsType#getBinaryPred()
   * @see #getAssertionsType()
   * @generated
   */
  EReference getAssertionsType_BinaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.AssertionsType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Pred</em>'.
   * @see bxml.AssertionsType#getNaryPred()
   * @see #getAssertionsType()
   * @generated
   */
  EReference getAssertionsType_NaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.AssertionsType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Pred</em>'.
   * @see bxml.AssertionsType#getUnaryPred()
   * @see #getAssertionsType()
   * @generated
   */
  EReference getAssertionsType_UnaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.AssertionsType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Pred</em>'.
   * @see bxml.AssertionsType#getQuantifiedPred()
   * @see #getAssertionsType()
   * @generated
   */
  EReference getAssertionsType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.AssertionsType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Comparison</em>'.
   * @see bxml.AssertionsType#getExpComparison()
   * @see #getAssertionsType()
   * @generated
   */
  EReference getAssertionsType_ExpComparison();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.AssertionsType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Set</em>'.
   * @see bxml.AssertionsType#getSet()
   * @see #getAssertionsType()
   * @generated
   */
  EReference getAssertionsType_Set();

  /**
   * Returns the meta object for class '{@link bxml.AssertSubType <em>Assert Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert Sub Type</em>'.
   * @see bxml.AssertSubType
   * @generated
   */
  EClass getAssertSubType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssertSubType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.AssertSubType#getAttr()
   * @see #getAssertSubType()
   * @generated
   */
  EReference getAssertSubType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssertSubType#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see bxml.AssertSubType#getGuard()
   * @see #getAssertSubType()
   * @generated
   */
  EReference getAssertSubType_Guard();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssertSubType#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see bxml.AssertSubType#getBody()
   * @see #getAssertSubType()
   * @generated
   */
  EReference getAssertSubType_Body();

  /**
   * Returns the meta object for class '{@link bxml.AssignementSubType <em>Assignement Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignement Sub Type</em>'.
   * @see bxml.AssignementSubType
   * @generated
   */
  EClass getAssignementSubType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssignementSubType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.AssignementSubType#getAttr()
   * @see #getAssignementSubType()
   * @generated
   */
  EReference getAssignementSubType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssignementSubType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.AssignementSubType#getVariables()
   * @see #getAssignementSubType()
   * @generated
   */
  EReference getAssignementSubType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssignementSubType#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see bxml.AssignementSubType#getValues()
   * @see #getAssignementSubType()
   * @generated
   */
  EReference getAssignementSubType_Values();

  /**
   * Returns the meta object for class '{@link bxml.AttrType <em>Attr Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr Type</em>'.
   * @see bxml.AttrType
   * @generated
   */
  EClass getAttrType();

  /**
   * Returns the meta object for the attribute list '{@link bxml.AttrType#getAnyElement <em>Any Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any Element</em>'.
   * @see bxml.AttrType#getAnyElement()
   * @see #getAttrType()
   * @generated
   */
  EAttribute getAttrType_AnyElement();

  /**
   * Returns the meta object for the attribute list '{@link bxml.AttrType#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any</em>'.
   * @see bxml.AttrType#getAny()
   * @see #getAttrType()
   * @generated
   */
  EAttribute getAttrType_Any();

  /**
   * Returns the meta object for class '{@link bxml.BecomesInType <em>Becomes In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Becomes In Type</em>'.
   * @see bxml.BecomesInType
   * @generated
   */
  EClass getBecomesInType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BecomesInType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BecomesInType#getAttr()
   * @see #getBecomesInType()
   * @generated
   */
  EReference getBecomesInType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BecomesInType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.BecomesInType#getVariables()
   * @see #getBecomesInType()
   * @generated
   */
  EReference getBecomesInType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BecomesInType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see bxml.BecomesInType#getValue()
   * @see #getBecomesInType()
   * @generated
   */
  EReference getBecomesInType_Value();

  /**
   * Returns the meta object for class '{@link bxml.BecomesSuchThatType <em>Becomes Such That Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Becomes Such That Type</em>'.
   * @see bxml.BecomesSuchThatType
   * @generated
   */
  EClass getBecomesSuchThatType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BecomesSuchThatType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BecomesSuchThatType#getAttr()
   * @see #getBecomesSuchThatType()
   * @generated
   */
  EReference getBecomesSuchThatType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BecomesSuchThatType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.BecomesSuchThatType#getVariables()
   * @see #getBecomesSuchThatType()
   * @generated
   */
  EReference getBecomesSuchThatType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BecomesSuchThatType#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred</em>'.
   * @see bxml.BecomesSuchThatType#getPred()
   * @see #getBecomesSuchThatType()
   * @generated
   */
  EReference getBecomesSuchThatType_Pred();

  /**
   * Returns the meta object for class '{@link bxml.BinaryExpType2 <em>Binary Exp Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Exp Type2</em>'.
   * @see bxml.BinaryExpType2
   * @generated
   */
  EClass getBinaryExpType2();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpType2#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.BinaryExpType2#getId()
   * @see #getBinaryExpType2()
   * @generated
   */
  EReference getBinaryExpType2_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpType2#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.BinaryExpType2#getUnaryExp()
   * @see #getBinaryExpType2()
   * @generated
   */
  EReference getBinaryExpType2_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpType2#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.BinaryExpType2#getBinaryExp()
   * @see #getBinaryExpType2()
   * @generated
   */
  EReference getBinaryExpType2_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpType2#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.BinaryExpType2#getStruct()
   * @see #getBinaryExpType2()
   * @generated
   */
  EReference getBinaryExpType2_Struct();

  /**
   * Returns the meta object for the attribute '{@link bxml.BinaryExpType2#getGenericType <em>Generic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Type</em>'.
   * @see bxml.BinaryExpType2#getGenericType()
   * @see #getBinaryExpType2()
   * @generated
   */
  EAttribute getBinaryExpType2_GenericType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpType2#getId1 <em>Id1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id1</em>'.
   * @see bxml.BinaryExpType2#getId1()
   * @see #getBinaryExpType2()
   * @generated
   */
  EReference getBinaryExpType2_Id1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpType2#getUnaryExp1 <em>Unary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp1</em>'.
   * @see bxml.BinaryExpType2#getUnaryExp1()
   * @see #getBinaryExpType2()
   * @generated
   */
  EReference getBinaryExpType2_UnaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpType2#getBinaryExp1 <em>Binary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp1</em>'.
   * @see bxml.BinaryExpType2#getBinaryExp1()
   * @see #getBinaryExpType2()
   * @generated
   */
  EReference getBinaryExpType2_BinaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpType2#getStruct1 <em>Struct1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct1</em>'.
   * @see bxml.BinaryExpType2#getStruct1()
   * @see #getBinaryExpType2()
   * @generated
   */
  EReference getBinaryExpType2_Struct1();

  /**
   * Returns the meta object for the attribute '{@link bxml.BinaryExpType2#getGenericType1 <em>Generic Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Type1</em>'.
   * @see bxml.BinaryExpType2#getGenericType1()
   * @see #getBinaryExpType2()
   * @generated
   */
  EAttribute getBinaryExpType2_GenericType1();

  /**
   * Returns the meta object for the attribute '{@link bxml.BinaryExpType2#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.BinaryExpType2#getOp()
   * @see #getBinaryExpType2()
   * @generated
   */
  EAttribute getBinaryExpType2_Op();

  /**
   * Returns the meta object for class '{@link bxml.BinaryPredType <em>Binary Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Pred Type</em>'.
   * @see bxml.BinaryPredType
   * @generated
   */
  EClass getBinaryPredType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BinaryPredType#getAttr()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.BinaryPredType#getBinaryPred()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.BinaryPredType#getNaryPred()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.BinaryPredType#getUnaryPred()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.BinaryPredType#getQuantifiedPred()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.BinaryPredType#getExpComparison()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.BinaryPredType#getSet()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_Set();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getBinaryPred1 <em>Binary Pred1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred1</em>'.
   * @see bxml.BinaryPredType#getBinaryPred1()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_BinaryPred1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getNaryPred1 <em>Nary Pred1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred1</em>'.
   * @see bxml.BinaryPredType#getNaryPred1()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_NaryPred1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getUnaryPred1 <em>Unary Pred1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred1</em>'.
   * @see bxml.BinaryPredType#getUnaryPred1()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_UnaryPred1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getQuantifiedPred1 <em>Quantified Pred1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred1</em>'.
   * @see bxml.BinaryPredType#getQuantifiedPred1()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_QuantifiedPred1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getExpComparison1 <em>Exp Comparison1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison1</em>'.
   * @see bxml.BinaryPredType#getExpComparison1()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_ExpComparison1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredType#getSet1 <em>Set1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set1</em>'.
   * @see bxml.BinaryPredType#getSet1()
   * @see #getBinaryPredType()
   * @generated
   */
  EReference getBinaryPredType_Set1();

  /**
   * Returns the meta object for the attribute '{@link bxml.BinaryPredType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.BinaryPredType#getOp()
   * @see #getBinaryPredType()
   * @generated
   */
  EAttribute getBinaryPredType_Op();

  /**
   * Returns the meta object for class '{@link bxml.BlocSubType <em>Bloc Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bloc Sub Type</em>'.
   * @see bxml.BlocSubType
   * @generated
   */
  EClass getBlocSubType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BlocSubType#getAttr()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.BlocSubType#getBlocSub()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.BlocSubType#getSkip()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.BlocSubType#getAssertSub()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.BlocSubType#getIfSub()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.BlocSubType#getBecomesSuchThat()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.BlocSubType#getAssignementSub()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.BlocSubType#getSelect()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.BlocSubType#getCaseSub()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.BlocSubType#getANYSub()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.BlocSubType#getLETSub()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.BlocSubType#getBecomesIn()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.BlocSubType#getVARIN()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.BlocSubType#getNarySub()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.BlocSubType#getOperationCall()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BlocSubType#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.BlocSubType#getWhile()
   * @see #getBlocSubType()
   * @generated
   */
  EReference getBlocSubType_While();

  /**
   * Returns the meta object for class '{@link bxml.BodyType <em>Body Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Type</em>'.
   * @see bxml.BodyType
   * @generated
   */
  EClass getBodyType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BodyType#getAttr()
   * @see #getBodyType()
   * @generated
   */
  EReference getBodyType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.BodyType#getBinaryPred()
   * @see #getBodyType()
   * @generated
   */
  EReference getBodyType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.BodyType#getNaryPred()
   * @see #getBodyType()
   * @generated
   */
  EReference getBodyType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.BodyType#getUnaryPred()
   * @see #getBodyType()
   * @generated
   */
  EReference getBodyType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.BodyType#getQuantifiedPred()
   * @see #getBodyType()
   * @generated
   */
  EReference getBodyType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.BodyType#getExpComparison()
   * @see #getBodyType()
   * @generated
   */
  EReference getBodyType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.BodyType#getSet()
   * @see #getBodyType()
   * @generated
   */
  EReference getBodyType_Set();

  /**
   * Returns the meta object for class '{@link bxml.BodyType1 <em>Body Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Type1</em>'.
   * @see bxml.BodyType1
   * @generated
   */
  EClass getBodyType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.BodyType1#getBlocSub()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.BodyType1#getSkip()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.BodyType1#getAssertSub()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.BodyType1#getIfSub()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.BodyType1#getBecomesSuchThat()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.BodyType1#getAssignementSub()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.BodyType1#getSelect()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.BodyType1#getCaseSub()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.BodyType1#getANYSub()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.BodyType1#getLETSub()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.BodyType1#getBecomesIn()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.BodyType1#getVARIN()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.BodyType1#getNarySub()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.BodyType1#getOperationCall()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType1#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.BodyType1#getWhile()
   * @see #getBodyType1()
   * @generated
   */
  EReference getBodyType1_While();

  /**
   * Returns the meta object for class '{@link bxml.BodyType2 <em>Body Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Type2</em>'.
   * @see bxml.BodyType2
   * @generated
   */
  EClass getBodyType2();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BodyType2#getAttr()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.BodyType2#getBlocSub()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.BodyType2#getSkip()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.BodyType2#getAssertSub()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.BodyType2#getIfSub()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.BodyType2#getBecomesSuchThat()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.BodyType2#getAssignementSub()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.BodyType2#getSelect()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.BodyType2#getCaseSub()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.BodyType2#getANYSub()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.BodyType2#getLETSub()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.BodyType2#getBecomesIn()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.BodyType2#getVARIN()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.BodyType2#getNarySub()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.BodyType2#getOperationCall()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType2#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.BodyType2#getWhile()
   * @see #getBodyType2()
   * @generated
   */
  EReference getBodyType2_While();

  /**
   * Returns the meta object for class '{@link bxml.BodyType3 <em>Body Type3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Type3</em>'.
   * @see bxml.BodyType3
   * @generated
   */
  EClass getBodyType3();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BodyType3#getAttr()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.BodyType3#getBinaryExp()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.BodyType3#getNaryExp()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.BodyType3#getBooleanLiteral()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.BodyType3#getBooleanExp()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.BodyType3#getEmptySet()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.BodyType3#getEmptySeq()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.BodyType3#getId()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.BodyType3#getIntegerLiteral()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.BodyType3#getQuantifiedExp()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.BodyType3#getQuantifiedSet()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.BodyType3#getSTRINGLiteral()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.BodyType3#getUnaryExp()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.BodyType3#getStruct()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType3#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.BodyType3#getRecord()
   * @see #getBodyType3()
   * @generated
   */
  EReference getBodyType3_Record();

  /**
   * Returns the meta object for class '{@link bxml.BodyType4 <em>Body Type4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Type4</em>'.
   * @see bxml.BodyType4
   * @generated
   */
  EClass getBodyType4();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BodyType4#getAttr()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.BodyType4#getBlocSub()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.BodyType4#getSkip()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.BodyType4#getAssertSub()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.BodyType4#getIfSub()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.BodyType4#getBecomesSuchThat()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.BodyType4#getAssignementSub()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.BodyType4#getSelect()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.BodyType4#getCaseSub()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.BodyType4#getANYSub()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.BodyType4#getLETSub()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.BodyType4#getBecomesIn()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.BodyType4#getVARIN()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.BodyType4#getNarySub()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.BodyType4#getOperationCall()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType4#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.BodyType4#getWhile()
   * @see #getBodyType4()
   * @generated
   */
  EReference getBodyType4_While();

  /**
   * Returns the meta object for class '{@link bxml.BodyType5 <em>Body Type5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Type5</em>'.
   * @see bxml.BodyType5
   * @generated
   */
  EClass getBodyType5();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BodyType5#getAttr()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.BodyType5#getBlocSub()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.BodyType5#getSkip()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.BodyType5#getAssertSub()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.BodyType5#getIfSub()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.BodyType5#getBecomesSuchThat()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.BodyType5#getAssignementSub()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.BodyType5#getSelect()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.BodyType5#getCaseSub()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.BodyType5#getANYSub()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.BodyType5#getLETSub()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.BodyType5#getBecomesIn()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.BodyType5#getVARIN()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.BodyType5#getNarySub()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.BodyType5#getOperationCall()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType5#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.BodyType5#getWhile()
   * @see #getBodyType5()
   * @generated
   */
  EReference getBodyType5_While();

  /**
   * Returns the meta object for class '{@link bxml.BodyType6 <em>Body Type6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Type6</em>'.
   * @see bxml.BodyType6
   * @generated
   */
  EClass getBodyType6();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType6#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BodyType6#getAttr()
   * @see #getBodyType6()
   * @generated
   */
  EReference getBodyType6_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType6#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.BodyType6#getBinaryPred()
   * @see #getBodyType6()
   * @generated
   */
  EReference getBodyType6_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType6#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.BodyType6#getNaryPred()
   * @see #getBodyType6()
   * @generated
   */
  EReference getBodyType6_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType6#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.BodyType6#getUnaryPred()
   * @see #getBodyType6()
   * @generated
   */
  EReference getBodyType6_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType6#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.BodyType6#getQuantifiedPred()
   * @see #getBodyType6()
   * @generated
   */
  EReference getBodyType6_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType6#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.BodyType6#getExpComparison()
   * @see #getBodyType6()
   * @generated
   */
  EReference getBodyType6_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BodyType6#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.BodyType6#getSet()
   * @see #getBodyType6()
   * @generated
   */
  EReference getBodyType6_Set();

  /**
   * Returns the meta object for class '{@link bxml.BooleanExpType <em>Boolean Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Exp Type</em>'.
   * @see bxml.BooleanExpType
   * @generated
   */
  EClass getBooleanExpType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BooleanExpType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BooleanExpType#getAttr()
   * @see #getBooleanExpType()
   * @generated
   */
  EReference getBooleanExpType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BooleanExpType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.BooleanExpType#getBinaryPred()
   * @see #getBooleanExpType()
   * @generated
   */
  EReference getBooleanExpType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BooleanExpType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.BooleanExpType#getNaryPred()
   * @see #getBooleanExpType()
   * @generated
   */
  EReference getBooleanExpType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BooleanExpType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.BooleanExpType#getUnaryPred()
   * @see #getBooleanExpType()
   * @generated
   */
  EReference getBooleanExpType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BooleanExpType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.BooleanExpType#getQuantifiedPred()
   * @see #getBooleanExpType()
   * @generated
   */
  EReference getBooleanExpType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BooleanExpType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.BooleanExpType#getExpComparison()
   * @see #getBooleanExpType()
   * @generated
   */
  EReference getBooleanExpType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BooleanExpType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.BooleanExpType#getSet()
   * @see #getBooleanExpType()
   * @generated
   */
  EReference getBooleanExpType_Set();

  /**
   * Returns the meta object for the attribute '{@link bxml.BooleanExpType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.BooleanExpType#getTypref()
   * @see #getBooleanExpType()
   * @generated
   */
  EAttribute getBooleanExpType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.BooleanLiteralType <em>Boolean Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal Type</em>'.
   * @see bxml.BooleanLiteralType
   * @generated
   */
  EClass getBooleanLiteralType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BooleanLiteralType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BooleanLiteralType#getAttr()
   * @see #getBooleanLiteralType()
   * @generated
   */
  EReference getBooleanLiteralType_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.BooleanLiteralType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.BooleanLiteralType#getTypref()
   * @see #getBooleanLiteralType()
   * @generated
   */
  EAttribute getBooleanLiteralType_Typref();

  /**
   * Returns the meta object for the attribute '{@link bxml.BooleanLiteralType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bxml.BooleanLiteralType#getValue()
   * @see #getBooleanLiteralType()
   * @generated
   */
  EAttribute getBooleanLiteralType_Value();

  /**
   * Returns the meta object for class '{@link bxml.BynaryExpType <em>Bynary Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bynary Exp Type</em>'.
   * @see bxml.BynaryExpType
   * @generated
   */
  EClass getBynaryExpType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BynaryExpType#getAttr()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.BynaryExpType#getBinaryExp()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.BynaryExpType#getNaryExp()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.BynaryExpType#getBooleanLiteral()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.BynaryExpType#getBooleanExp()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.BynaryExpType#getEmptySet()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.BynaryExpType#getEmptySeq()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.BynaryExpType#getId()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.BynaryExpType#getIntegerLiteral()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.BynaryExpType#getQuantifiedExp()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.BynaryExpType#getQuantifiedSet()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.BynaryExpType#getSTRINGLiteral()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.BynaryExpType#getUnaryExp()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.BynaryExpType#getStruct()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.BynaryExpType#getRecord()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_Record();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getBinaryExp1 <em>Binary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp1</em>'.
   * @see bxml.BynaryExpType#getBinaryExp1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_BinaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getNaryExp1 <em>Nary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp1</em>'.
   * @see bxml.BynaryExpType#getNaryExp1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_NaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getBooleanLiteral1 <em>Boolean Literal1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal1</em>'.
   * @see bxml.BynaryExpType#getBooleanLiteral1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_BooleanLiteral1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getBooleanExp1 <em>Boolean Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp1</em>'.
   * @see bxml.BynaryExpType#getBooleanExp1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_BooleanExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getEmptySet1 <em>Empty Set1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set1</em>'.
   * @see bxml.BynaryExpType#getEmptySet1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_EmptySet1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getEmptySeq1 <em>Empty Seq1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq1</em>'.
   * @see bxml.BynaryExpType#getEmptySeq1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_EmptySeq1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getId1 <em>Id1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id1</em>'.
   * @see bxml.BynaryExpType#getId1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_Id1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getIntegerLiteral1 <em>Integer Literal1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal1</em>'.
   * @see bxml.BynaryExpType#getIntegerLiteral1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_IntegerLiteral1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getQuantifiedExp1 <em>Quantified Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp1</em>'.
   * @see bxml.BynaryExpType#getQuantifiedExp1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_QuantifiedExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getQuantifiedSet1 <em>Quantified Set1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set1</em>'.
   * @see bxml.BynaryExpType#getQuantifiedSet1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_QuantifiedSet1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getSTRINGLiteral1 <em>STRING Literal1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal1</em>'.
   * @see bxml.BynaryExpType#getSTRINGLiteral1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_STRINGLiteral1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getUnaryExp1 <em>Unary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp1</em>'.
   * @see bxml.BynaryExpType#getUnaryExp1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_UnaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getStruct1 <em>Struct1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct1</em>'.
   * @see bxml.BynaryExpType#getStruct1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_Struct1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BynaryExpType#getRecord1 <em>Record1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record1</em>'.
   * @see bxml.BynaryExpType#getRecord1()
   * @see #getBynaryExpType()
   * @generated
   */
  EReference getBynaryExpType_Record1();

  /**
   * Returns the meta object for the attribute '{@link bxml.BynaryExpType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.BynaryExpType#getOp()
   * @see #getBynaryExpType()
   * @generated
   */
  EAttribute getBynaryExpType_Op();

  /**
   * Returns the meta object for the attribute '{@link bxml.BynaryExpType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.BynaryExpType#getTypref()
   * @see #getBynaryExpType()
   * @generated
   */
  EAttribute getBynaryExpType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.CaseSubType <em>Case Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Sub Type</em>'.
   * @see bxml.CaseSubType
   * @generated
   */
  EClass getCaseSubType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.CaseSubType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.CaseSubType#getAttr()
   * @see #getCaseSubType()
   * @generated
   */
  EReference getCaseSubType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.CaseSubType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see bxml.CaseSubType#getValue()
   * @see #getCaseSubType()
   * @generated
   */
  EReference getCaseSubType_Value();

  /**
   * Returns the meta object for the containment reference '{@link bxml.CaseSubType#getChoices <em>Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choices</em>'.
   * @see bxml.CaseSubType#getChoices()
   * @see #getCaseSubType()
   * @generated
   */
  EReference getCaseSubType_Choices();

  /**
   * Returns the meta object for the containment reference '{@link bxml.CaseSubType#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see bxml.CaseSubType#getElse()
   * @see #getCaseSubType()
   * @generated
   */
  EReference getCaseSubType_Else();

  /**
   * Returns the meta object for class '{@link bxml.ChoicesType <em>Choices Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choices Type</em>'.
   * @see bxml.ChoicesType
   * @generated
   */
  EClass getChoicesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ChoicesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ChoicesType#getAttr()
   * @see #getChoicesType()
   * @generated
   */
  EReference getChoicesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ChoicesType#getChoice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choice</em>'.
   * @see bxml.ChoicesType#getChoice()
   * @see #getChoicesType()
   * @generated
   */
  EReference getChoicesType_Choice();

  /**
   * Returns the meta object for class '{@link bxml.ChoiceType <em>Choice Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Type</em>'.
   * @see bxml.ChoiceType
   * @generated
   */
  EClass getChoiceType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ChoiceType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ChoiceType#getAttr()
   * @see #getChoiceType()
   * @generated
   */
  EReference getChoiceType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ChoiceType#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see bxml.ChoiceType#getThen()
   * @see #getChoiceType()
   * @generated
   */
  EReference getChoiceType_Then();

  /**
   * Returns the meta object for class '{@link bxml.ChoiceType1 <em>Choice Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Type1</em>'.
   * @see bxml.ChoiceType1
   * @generated
   */
  EClass getChoiceType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ChoiceType1#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ChoiceType1#getAttr()
   * @see #getChoiceType1()
   * @generated
   */
  EReference getChoiceType1_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ChoiceType1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see bxml.ChoiceType1#getValue()
   * @see #getChoiceType1()
   * @generated
   */
  EReference getChoiceType1_Value();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ChoiceType1#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see bxml.ChoiceType1#getThen()
   * @see #getChoiceType1()
   * @generated
   */
  EReference getChoiceType1_Then();

  /**
   * Returns the meta object for class '{@link bxml.ConcreteConstantsType <em>Concrete Constants Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concrete Constants Type</em>'.
   * @see bxml.ConcreteConstantsType
   * @generated
   */
  EClass getConcreteConstantsType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConcreteConstantsType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ConcreteConstantsType#getAttr()
   * @see #getConcreteConstantsType()
   * @generated
   */
  EReference getConcreteConstantsType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ConcreteConstantsType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.ConcreteConstantsType#getId()
   * @see #getConcreteConstantsType()
   * @generated
   */
  EReference getConcreteConstantsType_Id();

  /**
   * Returns the meta object for class '{@link bxml.ConcreteVariablesType <em>Concrete Variables Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concrete Variables Type</em>'.
   * @see bxml.ConcreteVariablesType
   * @generated
   */
  EClass getConcreteVariablesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConcreteVariablesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ConcreteVariablesType#getAttr()
   * @see #getConcreteVariablesType()
   * @generated
   */
  EReference getConcreteVariablesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ConcreteVariablesType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.ConcreteVariablesType#getId()
   * @see #getConcreteVariablesType()
   * @generated
   */
  EReference getConcreteVariablesType_Id();

  /**
   * Returns the meta object for class '{@link bxml.ConditionType <em>Condition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Type</em>'.
   * @see bxml.ConditionType
   * @generated
   */
  EClass getConditionType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConditionType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ConditionType#getAttr()
   * @see #getConditionType()
   * @generated
   */
  EReference getConditionType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConditionType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.ConditionType#getBinaryPred()
   * @see #getConditionType()
   * @generated
   */
  EReference getConditionType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConditionType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.ConditionType#getNaryPred()
   * @see #getConditionType()
   * @generated
   */
  EReference getConditionType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConditionType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.ConditionType#getUnaryPred()
   * @see #getConditionType()
   * @generated
   */
  EReference getConditionType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConditionType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.ConditionType#getQuantifiedPred()
   * @see #getConditionType()
   * @generated
   */
  EReference getConditionType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConditionType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.ConditionType#getExpComparison()
   * @see #getConditionType()
   * @generated
   */
  EReference getConditionType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConditionType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.ConditionType#getSet()
   * @see #getConditionType()
   * @generated
   */
  EReference getConditionType_Set();

  /**
   * Returns the meta object for class '{@link bxml.ConstraintsType <em>Constraints Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraints Type</em>'.
   * @see bxml.ConstraintsType
   * @generated
   */
  EClass getConstraintsType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConstraintsType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ConstraintsType#getAttr()
   * @see #getConstraintsType()
   * @generated
   */
  EReference getConstraintsType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConstraintsType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.ConstraintsType#getBinaryPred()
   * @see #getConstraintsType()
   * @generated
   */
  EReference getConstraintsType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConstraintsType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.ConstraintsType#getNaryPred()
   * @see #getConstraintsType()
   * @generated
   */
  EReference getConstraintsType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConstraintsType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.ConstraintsType#getUnaryPred()
   * @see #getConstraintsType()
   * @generated
   */
  EReference getConstraintsType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConstraintsType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.ConstraintsType#getQuantifiedPred()
   * @see #getConstraintsType()
   * @generated
   */
  EReference getConstraintsType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConstraintsType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.ConstraintsType#getExpComparison()
   * @see #getConstraintsType()
   * @generated
   */
  EReference getConstraintsType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ConstraintsType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.ConstraintsType#getSet()
   * @see #getConstraintsType()
   * @generated
   */
  EReference getConstraintsType_Set();

  /**
   * Returns the meta object for class '{@link bxml.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see bxml.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link bxml.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see bxml.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link bxml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see bxml.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link bxml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see bxml.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getAbstractConstants <em>Abstract Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract Constants</em>'.
   * @see bxml.DocumentRoot#getAbstractConstants()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_AbstractConstants();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getAbstractVariables <em>Abstract Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract Variables</em>'.
   * @see bxml.DocumentRoot#getAbstractVariables()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_AbstractVariables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getAbstraction <em>Abstraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstraction</em>'.
   * @see bxml.DocumentRoot#getAbstraction()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Abstraction();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.DocumentRoot#getANYSub()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.DocumentRoot#getAssertSub()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assertions</em>'.
   * @see bxml.DocumentRoot#getAssertions()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Assertions();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.DocumentRoot#getAssignementSub()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.DocumentRoot#getAttr()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.DocumentRoot#getBecomesIn()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.DocumentRoot#getBecomesSuchThat()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.DocumentRoot#getBinaryPred()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.DocumentRoot#getBlocSub()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see bxml.DocumentRoot#getBody()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Body();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.DocumentRoot#getBooleanExp()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.DocumentRoot#getBooleanLiteral()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.DocumentRoot#getCaseSub()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getChoices <em>Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choices</em>'.
   * @see bxml.DocumentRoot#getChoices()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Choices();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getConcreteConstants <em>Concrete Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concrete Constants</em>'.
   * @see bxml.DocumentRoot#getConcreteConstants()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ConcreteConstants();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getConcreteVariables <em>Concrete Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concrete Variables</em>'.
   * @see bxml.DocumentRoot#getConcreteVariables()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ConcreteVariables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see bxml.DocumentRoot#getCondition()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Condition();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraints</em>'.
   * @see bxml.DocumentRoot#getConstraints()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Constraints();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.DocumentRoot#getEmptySeq()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.DocumentRoot#getEmptySet()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getEnumeratedValues <em>Enumerated Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumerated Values</em>'.
   * @see bxml.DocumentRoot#getEnumeratedValues()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EnumeratedValues();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.DocumentRoot#getExpComparison()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see bxml.DocumentRoot#getExtends()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Extends();

  /**
   * Returns the meta object for the attribute '{@link bxml.DocumentRoot#getGenericType <em>Generic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Type</em>'.
   * @see bxml.DocumentRoot#getGenericType()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_GenericType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see bxml.DocumentRoot#getGuard()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Guard();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.DocumentRoot#getIfSub()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports</em>'.
   * @see bxml.DocumentRoot#getImports()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Imports();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Includes</em>'.
   * @see bxml.DocumentRoot#getIncludes()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Includes();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getInitialisation <em>Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialisation</em>'.
   * @see bxml.DocumentRoot#getInitialisation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Initialisation();

  /**
   * Returns the meta object for the attribute '{@link bxml.DocumentRoot#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance</em>'.
   * @see bxml.DocumentRoot#getInstance()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Instance();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.DocumentRoot#getIntegerLiteral()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getInvariant <em>Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invariant</em>'.
   * @see bxml.DocumentRoot#getInvariant()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Invariant();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.DocumentRoot#getLETSub()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getLocalOperations <em>Local Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local Operations</em>'.
   * @see bxml.DocumentRoot#getLocalOperations()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_LocalOperations();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getMachine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Machine</em>'.
   * @see bxml.DocumentRoot#getMachine()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Machine();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.DocumentRoot#getNaryExp()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.DocumentRoot#getNaryPred()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.DocumentRoot#getNarySub()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see bxml.DocumentRoot#getOperation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Operation();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.DocumentRoot#getOperationCall()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operations</em>'.
   * @see bxml.DocumentRoot#getOperations()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Operations();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getPrecondition <em>Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Precondition</em>'.
   * @see bxml.DocumentRoot#getPrecondition()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Precondition();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred</em>'.
   * @see bxml.DocumentRoot#getPred()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Pred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getPromotedOperation <em>Promoted Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Promoted Operation</em>'.
   * @see bxml.DocumentRoot#getPromotedOperation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_PromotedOperation();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getPromotes <em>Promotes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Promotes</em>'.
   * @see bxml.DocumentRoot#getPromotes()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Promotes();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see bxml.DocumentRoot#getProperties()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Properties();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.DocumentRoot#getQuantifiedExp()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.DocumentRoot#getQuantifiedPred()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.DocumentRoot#getQuantifiedSet()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.DocumentRoot#getRecord()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Record();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getRecordItem <em>Record Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record Item</em>'.
   * @see bxml.DocumentRoot#getRecordItem()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_RecordItem();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getReferencedMachine <em>Referenced Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Referenced Machine</em>'.
   * @see bxml.DocumentRoot#getReferencedMachine()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ReferencedMachine();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getRefines <em>Refines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Refines</em>'.
   * @see bxml.DocumentRoot#getRefines()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Refines();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getSees <em>Sees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sees</em>'.
   * @see bxml.DocumentRoot#getSees()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Sees();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.DocumentRoot#getSelect()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.DocumentRoot#getSet()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Set();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getSets <em>Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sets</em>'.
   * @see bxml.DocumentRoot#getSets()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Sets();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.DocumentRoot#getSkip()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.DocumentRoot#getSTRINGLiteral()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.DocumentRoot#getStruct()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see bxml.DocumentRoot#getThen()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Then();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see bxml.DocumentRoot#getType()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Type();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getTypeInfos <em>Type Infos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Infos</em>'.
   * @see bxml.DocumentRoot#getTypeInfos()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_TypeInfos();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.DocumentRoot#getUnaryPred()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getUses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uses</em>'.
   * @see bxml.DocumentRoot#getUses()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Uses();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see bxml.DocumentRoot#getValue()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Value();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.DocumentRoot#getVARIN()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.DocumentRoot#getVariables()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variant</em>'.
   * @see bxml.DocumentRoot#getVariant()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Variant();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When</em>'.
   * @see bxml.DocumentRoot#getWhen()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_When();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getWhenClauses <em>When Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When Clauses</em>'.
   * @see bxml.DocumentRoot#getWhenClauses()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_WhenClauses();

  /**
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.DocumentRoot#getWhile()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_While();

  /**
   * Returns the meta object for class '{@link bxml.ElseType <em>Else Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Type</em>'.
   * @see bxml.ElseType
   * @generated
   */
  EClass getElseType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ElseType#getAttr()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.ElseType#getBlocSub()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.ElseType#getSkip()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.ElseType#getAssertSub()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.ElseType#getIfSub()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.ElseType#getBecomesSuchThat()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.ElseType#getAssignementSub()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.ElseType#getSelect()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.ElseType#getCaseSub()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.ElseType#getANYSub()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.ElseType#getLETSub()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.ElseType#getBecomesIn()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.ElseType#getVARIN()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.ElseType#getNarySub()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.ElseType#getOperationCall()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.ElseType#getWhile()
   * @see #getElseType()
   * @generated
   */
  EReference getElseType_While();

  /**
   * Returns the meta object for class '{@link bxml.ElseType1 <em>Else Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Type1</em>'.
   * @see bxml.ElseType1
   * @generated
   */
  EClass getElseType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType1#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ElseType1#getAttr()
   * @see #getElseType1()
   * @generated
   */
  EReference getElseType1_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType1#getChoice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choice</em>'.
   * @see bxml.ElseType1#getChoice()
   * @see #getElseType1()
   * @generated
   */
  EReference getElseType1_Choice();

  /**
   * Returns the meta object for class '{@link bxml.ElseType2 <em>Else Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Type2</em>'.
   * @see bxml.ElseType2
   * @generated
   */
  EClass getElseType2();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ElseType2#getAttr()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.ElseType2#getBlocSub()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.ElseType2#getSkip()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.ElseType2#getAssertSub()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.ElseType2#getIfSub()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.ElseType2#getBecomesSuchThat()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.ElseType2#getAssignementSub()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.ElseType2#getSelect()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.ElseType2#getCaseSub()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.ElseType2#getANYSub()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.ElseType2#getLETSub()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.ElseType2#getBecomesIn()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.ElseType2#getVARIN()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.ElseType2#getNarySub()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.ElseType2#getOperationCall()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ElseType2#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.ElseType2#getWhile()
   * @see #getElseType2()
   * @generated
   */
  EReference getElseType2_While();

  /**
   * Returns the meta object for class '{@link bxml.EmptySeqType <em>Empty Seq Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Seq Type</em>'.
   * @see bxml.EmptySeqType
   * @generated
   */
  EClass getEmptySeqType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.EmptySeqType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.EmptySeqType#getAttr()
   * @see #getEmptySeqType()
   * @generated
   */
  EReference getEmptySeqType_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.EmptySeqType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.EmptySeqType#getTypref()
   * @see #getEmptySeqType()
   * @generated
   */
  EAttribute getEmptySeqType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.EmptySetType <em>Empty Set Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Set Type</em>'.
   * @see bxml.EmptySetType
   * @generated
   */
  EClass getEmptySetType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.EmptySetType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.EmptySetType#getAttr()
   * @see #getEmptySetType()
   * @generated
   */
  EReference getEmptySetType_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.EmptySetType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.EmptySetType#getTypref()
   * @see #getEmptySetType()
   * @generated
   */
  EAttribute getEmptySetType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.EnumeratedValuesType <em>Enumerated Values Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumerated Values Type</em>'.
   * @see bxml.EnumeratedValuesType
   * @generated
   */
  EClass getEnumeratedValuesType();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.EnumeratedValuesType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.EnumeratedValuesType#getId()
   * @see #getEnumeratedValuesType()
   * @generated
   */
  EReference getEnumeratedValuesType_Id();

  /**
   * Returns the meta object for class '{@link bxml.ExpComparisonType <em>Exp Comparison Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp Comparison Type</em>'.
   * @see bxml.ExpComparisonType
   * @generated
   */
  EClass getExpComparisonType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ExpComparisonType#getAttr()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.ExpComparisonType#getBinaryExp()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.ExpComparisonType#getNaryExp()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.ExpComparisonType#getBooleanLiteral()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.ExpComparisonType#getBooleanExp()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.ExpComparisonType#getEmptySet()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.ExpComparisonType#getEmptySeq()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.ExpComparisonType#getId()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.ExpComparisonType#getIntegerLiteral()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.ExpComparisonType#getQuantifiedExp()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.ExpComparisonType#getQuantifiedSet()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.ExpComparisonType#getSTRINGLiteral()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.ExpComparisonType#getUnaryExp()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.ExpComparisonType#getStruct()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.ExpComparisonType#getRecord()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_Record();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getBinaryExp1 <em>Binary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp1</em>'.
   * @see bxml.ExpComparisonType#getBinaryExp1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_BinaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getNaryExp1 <em>Nary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp1</em>'.
   * @see bxml.ExpComparisonType#getNaryExp1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_NaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getBooleanLiteral1 <em>Boolean Literal1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal1</em>'.
   * @see bxml.ExpComparisonType#getBooleanLiteral1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_BooleanLiteral1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getBooleanExp1 <em>Boolean Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp1</em>'.
   * @see bxml.ExpComparisonType#getBooleanExp1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_BooleanExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getEmptySet1 <em>Empty Set1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set1</em>'.
   * @see bxml.ExpComparisonType#getEmptySet1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_EmptySet1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getEmptySeq1 <em>Empty Seq1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq1</em>'.
   * @see bxml.ExpComparisonType#getEmptySeq1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_EmptySeq1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getId1 <em>Id1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id1</em>'.
   * @see bxml.ExpComparisonType#getId1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_Id1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getIntegerLiteral1 <em>Integer Literal1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal1</em>'.
   * @see bxml.ExpComparisonType#getIntegerLiteral1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_IntegerLiteral1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getQuantifiedExp1 <em>Quantified Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp1</em>'.
   * @see bxml.ExpComparisonType#getQuantifiedExp1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_QuantifiedExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getQuantifiedSet1 <em>Quantified Set1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set1</em>'.
   * @see bxml.ExpComparisonType#getQuantifiedSet1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_QuantifiedSet1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getSTRINGLiteral1 <em>STRING Literal1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal1</em>'.
   * @see bxml.ExpComparisonType#getSTRINGLiteral1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_STRINGLiteral1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getUnaryExp1 <em>Unary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp1</em>'.
   * @see bxml.ExpComparisonType#getUnaryExp1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_UnaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getStruct1 <em>Struct1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct1</em>'.
   * @see bxml.ExpComparisonType#getStruct1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_Struct1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpComparisonType#getRecord1 <em>Record1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record1</em>'.
   * @see bxml.ExpComparisonType#getRecord1()
   * @see #getExpComparisonType()
   * @generated
   */
  EReference getExpComparisonType_Record1();

  /**
   * Returns the meta object for the attribute '{@link bxml.ExpComparisonType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.ExpComparisonType#getOp()
   * @see #getExpComparisonType()
   * @generated
   */
  EAttribute getExpComparisonType_Op();

  /**
   * Returns the meta object for class '{@link bxml.ExtendsType <em>Extends Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends Type</em>'.
   * @see bxml.ExtendsType
   * @generated
   */
  EClass getExtendsType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExtendsType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ExtendsType#getAttr()
   * @see #getExtendsType()
   * @generated
   */
  EReference getExtendsType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ExtendsType#getReferencedMachine <em>Referenced Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referenced Machine</em>'.
   * @see bxml.ExtendsType#getReferencedMachine()
   * @see #getExtendsType()
   * @generated
   */
  EReference getExtendsType_ReferencedMachine();

  /**
   * Returns the meta object for class '{@link bxml.GuardType <em>Guard Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard Type</em>'.
   * @see bxml.GuardType
   * @generated
   */
  EClass getGuardType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.GuardType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.GuardType#getAttr()
   * @see #getGuardType()
   * @generated
   */
  EReference getGuardType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.GuardType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.GuardType#getBinaryPred()
   * @see #getGuardType()
   * @generated
   */
  EReference getGuardType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.GuardType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.GuardType#getNaryPred()
   * @see #getGuardType()
   * @generated
   */
  EReference getGuardType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.GuardType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.GuardType#getUnaryPred()
   * @see #getGuardType()
   * @generated
   */
  EReference getGuardType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.GuardType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.GuardType#getQuantifiedPred()
   * @see #getGuardType()
   * @generated
   */
  EReference getGuardType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.GuardType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.GuardType#getExpComparison()
   * @see #getGuardType()
   * @generated
   */
  EReference getGuardType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.GuardType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.GuardType#getSet()
   * @see #getGuardType()
   * @generated
   */
  EReference getGuardType_Set();

  /**
   * Returns the meta object for class '{@link bxml.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier</em>'.
   * @see bxml.Identifier
   * @generated
   */
  EClass getIdentifier();

  /**
   * Returns the meta object for the containment reference '{@link bxml.Identifier#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.Identifier#getAttr()
   * @see #getIdentifier()
   * @generated
   */
  EReference getIdentifier_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.Identifier#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component</em>'.
   * @see bxml.Identifier#getComponent()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Component();

  /**
   * Returns the meta object for the attribute '{@link bxml.Identifier#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance</em>'.
   * @see bxml.Identifier#getInstance()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Instance();

  /**
   * Returns the meta object for the attribute '{@link bxml.Identifier#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Suffix</em>'.
   * @see bxml.Identifier#getSuffix()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Suffix();

  /**
   * Returns the meta object for the attribute '{@link bxml.Identifier#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.Identifier#getTypref()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Typref();

  /**
   * Returns the meta object for the attribute '{@link bxml.Identifier#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bxml.Identifier#getValue()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Value();

  /**
   * Returns the meta object for class '{@link bxml.IdType <em>Id Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Type</em>'.
   * @see bxml.IdType
   * @generated
   */
  EClass getIdType();

  /**
   * Returns the meta object for the attribute '{@link bxml.IdType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bxml.IdType#getValue()
   * @see #getIdType()
   * @generated
   */
  EAttribute getIdType_Value();

  /**
   * Returns the meta object for class '{@link bxml.IfSubType <em>If Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Sub Type</em>'.
   * @see bxml.IfSubType
   * @generated
   */
  EClass getIfSubType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.IfSubType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.IfSubType#getAttr()
   * @see #getIfSubType()
   * @generated
   */
  EReference getIfSubType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.IfSubType#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see bxml.IfSubType#getCondition()
   * @see #getIfSubType()
   * @generated
   */
  EReference getIfSubType_Condition();

  /**
   * Returns the meta object for the containment reference '{@link bxml.IfSubType#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see bxml.IfSubType#getThen()
   * @see #getIfSubType()
   * @generated
   */
  EReference getIfSubType_Then();

  /**
   * Returns the meta object for the containment reference '{@link bxml.IfSubType#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see bxml.IfSubType#getElse()
   * @see #getIfSubType()
   * @generated
   */
  EReference getIfSubType_Else();

  /**
   * Returns the meta object for the attribute '{@link bxml.IfSubType#getElseif <em>Elseif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Elseif</em>'.
   * @see bxml.IfSubType#getElseif()
   * @see #getIfSubType()
   * @generated
   */
  EAttribute getIfSubType_Elseif();

  /**
   * Returns the meta object for class '{@link bxml.ImportsType <em>Imports Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imports Type</em>'.
   * @see bxml.ImportsType
   * @generated
   */
  EClass getImportsType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ImportsType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ImportsType#getAttr()
   * @see #getImportsType()
   * @generated
   */
  EReference getImportsType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ImportsType#getReferencedMachine <em>Referenced Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referenced Machine</em>'.
   * @see bxml.ImportsType#getReferencedMachine()
   * @see #getImportsType()
   * @generated
   */
  EReference getImportsType_ReferencedMachine();

  /**
   * Returns the meta object for class '{@link bxml.IncludesType <em>Includes Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Includes Type</em>'.
   * @see bxml.IncludesType
   * @generated
   */
  EClass getIncludesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.IncludesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.IncludesType#getAttr()
   * @see #getIncludesType()
   * @generated
   */
  EReference getIncludesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.IncludesType#getReferencedMachine <em>Referenced Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referenced Machine</em>'.
   * @see bxml.IncludesType#getReferencedMachine()
   * @see #getIncludesType()
   * @generated
   */
  EReference getIncludesType_ReferencedMachine();

  /**
   * Returns the meta object for class '{@link bxml.InitialisationType <em>Initialisation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initialisation Type</em>'.
   * @see bxml.InitialisationType
   * @generated
   */
  EClass getInitialisationType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.InitialisationType#getAttr()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.InitialisationType#getBlocSub()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.InitialisationType#getSkip()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.InitialisationType#getAssertSub()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.InitialisationType#getIfSub()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.InitialisationType#getBecomesSuchThat()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.InitialisationType#getAssignementSub()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.InitialisationType#getSelect()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.InitialisationType#getCaseSub()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.InitialisationType#getANYSub()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.InitialisationType#getLETSub()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.InitialisationType#getBecomesIn()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.InitialisationType#getVARIN()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.InitialisationType#getNarySub()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.InitialisationType#getOperationCall()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InitialisationType#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.InitialisationType#getWhile()
   * @see #getInitialisationType()
   * @generated
   */
  EReference getInitialisationType_While();

  /**
   * Returns the meta object for class '{@link bxml.InputParametersType <em>Input Parameters Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Parameters Type</em>'.
   * @see bxml.InputParametersType
   * @generated
   */
  EClass getInputParametersType();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.InputParametersType#getId()
   * @see #getInputParametersType()
   * @generated
   */
  EReference getInputParametersType_Id();

  /**
   * Returns the meta object for class '{@link bxml.InputParametersType1 <em>Input Parameters Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Parameters Type1</em>'.
   * @see bxml.InputParametersType1
   * @generated
   */
  EClass getInputParametersType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InputParametersType1#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.InputParametersType1#getAttr()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.InputParametersType1#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Expression</em>'.
   * @see bxml.InputParametersType1#getExpression()
   * @see #getInputParametersType1()
   * @generated
   */
  EAttribute getInputParametersType1_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Exp</em>'.
   * @see bxml.InputParametersType1#getBinaryExp()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_BinaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Exp</em>'.
   * @see bxml.InputParametersType1#getNaryExp()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_NaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Literal</em>'.
   * @see bxml.InputParametersType1#getBooleanLiteral()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Exp</em>'.
   * @see bxml.InputParametersType1#getBooleanExp()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_BooleanExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Set</em>'.
   * @see bxml.InputParametersType1#getEmptySet()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_EmptySet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Seq</em>'.
   * @see bxml.InputParametersType1#getEmptySeq()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_EmptySeq();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.InputParametersType1#getId()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_Id();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integer Literal</em>'.
   * @see bxml.InputParametersType1#getIntegerLiteral()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Exp</em>'.
   * @see bxml.InputParametersType1#getQuantifiedExp()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Set</em>'.
   * @see bxml.InputParametersType1#getQuantifiedSet()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>STRING Literal</em>'.
   * @see bxml.InputParametersType1#getSTRINGLiteral()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Exp</em>'.
   * @see bxml.InputParametersType1#getUnaryExp()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_UnaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct</em>'.
   * @see bxml.InputParametersType1#getStruct()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.InputParametersType1#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record</em>'.
   * @see bxml.InputParametersType1#getRecord()
   * @see #getInputParametersType1()
   * @generated
   */
  EReference getInputParametersType1_Record();

  /**
   * Returns the meta object for class '{@link bxml.IntegerLiteralType <em>Integer Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal Type</em>'.
   * @see bxml.IntegerLiteralType
   * @generated
   */
  EClass getIntegerLiteralType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.IntegerLiteralType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.IntegerLiteralType#getAttr()
   * @see #getIntegerLiteralType()
   * @generated
   */
  EReference getIntegerLiteralType_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.IntegerLiteralType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.IntegerLiteralType#getTypref()
   * @see #getIntegerLiteralType()
   * @generated
   */
  EAttribute getIntegerLiteralType_Typref();

  /**
   * Returns the meta object for the attribute '{@link bxml.IntegerLiteralType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bxml.IntegerLiteralType#getValue()
   * @see #getIntegerLiteralType()
   * @generated
   */
  EAttribute getIntegerLiteralType_Value();

  /**
   * Returns the meta object for class '{@link bxml.InvariantType <em>Invariant Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invariant Type</em>'.
   * @see bxml.InvariantType
   * @generated
   */
  EClass getInvariantType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InvariantType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.InvariantType#getAttr()
   * @see #getInvariantType()
   * @generated
   */
  EReference getInvariantType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InvariantType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.InvariantType#getBinaryPred()
   * @see #getInvariantType()
   * @generated
   */
  EReference getInvariantType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InvariantType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.InvariantType#getNaryPred()
   * @see #getInvariantType()
   * @generated
   */
  EReference getInvariantType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InvariantType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.InvariantType#getUnaryPred()
   * @see #getInvariantType()
   * @generated
   */
  EReference getInvariantType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InvariantType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.InvariantType#getQuantifiedPred()
   * @see #getInvariantType()
   * @generated
   */
  EReference getInvariantType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InvariantType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.InvariantType#getExpComparison()
   * @see #getInvariantType()
   * @generated
   */
  EReference getInvariantType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.InvariantType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.InvariantType#getSet()
   * @see #getInvariantType()
   * @generated
   */
  EReference getInvariantType_Set();

  /**
   * Returns the meta object for class '{@link bxml.LETSubType <em>LET Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LET Sub Type</em>'.
   * @see bxml.LETSubType
   * @generated
   */
  EClass getLETSubType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.LETSubType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.LETSubType#getAttr()
   * @see #getLETSubType()
   * @generated
   */
  EReference getLETSubType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.LETSubType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.LETSubType#getVariables()
   * @see #getLETSubType()
   * @generated
   */
  EReference getLETSubType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.LETSubType#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see bxml.LETSubType#getValues()
   * @see #getLETSubType()
   * @generated
   */
  EReference getLETSubType_Values();

  /**
   * Returns the meta object for the containment reference '{@link bxml.LETSubType#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see bxml.LETSubType#getThen()
   * @see #getLETSubType()
   * @generated
   */
  EReference getLETSubType_Then();

  /**
   * Returns the meta object for class '{@link bxml.LocalOperationsType <em>Local Operations Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Operations Type</em>'.
   * @see bxml.LocalOperationsType
   * @generated
   */
  EClass getLocalOperationsType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.LocalOperationsType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.LocalOperationsType#getAttr()
   * @see #getLocalOperationsType()
   * @generated
   */
  EReference getLocalOperationsType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.LocalOperationsType#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation</em>'.
   * @see bxml.LocalOperationsType#getOperation()
   * @see #getLocalOperationsType()
   * @generated
   */
  EReference getLocalOperationsType_Operation();

  /**
   * Returns the meta object for class '{@link bxml.MachineType <em>Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Type</em>'.
   * @see bxml.MachineType
   * @generated
   */
  EClass getMachineType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.MachineType#getAttr()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getAbstraction <em>Abstraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstraction</em>'.
   * @see bxml.MachineType#getAbstraction()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Abstraction();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see bxml.MachineType#getParameters()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraints</em>'.
   * @see bxml.MachineType#getConstraints()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Constraints();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Includes</em>'.
   * @see bxml.MachineType#getIncludes()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Includes();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports</em>'.
   * @see bxml.MachineType#getImports()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Imports();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getSees <em>Sees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sees</em>'.
   * @see bxml.MachineType#getSees()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Sees();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see bxml.MachineType#getExtends()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Extends();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getUses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uses</em>'.
   * @see bxml.MachineType#getUses()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Uses();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getPromotes <em>Promotes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Promotes</em>'.
   * @see bxml.MachineType#getPromotes()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Promotes();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see bxml.MachineType#getValues()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Values();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getSets <em>Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sets</em>'.
   * @see bxml.MachineType#getSets()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Sets();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getAbstractConstants <em>Abstract Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract Constants</em>'.
   * @see bxml.MachineType#getAbstractConstants()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_AbstractConstants();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getConcreteConstants <em>Concrete Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concrete Constants</em>'.
   * @see bxml.MachineType#getConcreteConstants()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_ConcreteConstants();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getAbstractVariables <em>Abstract Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract Variables</em>'.
   * @see bxml.MachineType#getAbstractVariables()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_AbstractVariables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getConcreteVariables <em>Concrete Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concrete Variables</em>'.
   * @see bxml.MachineType#getConcreteVariables()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_ConcreteVariables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variant</em>'.
   * @see bxml.MachineType#getVariant()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Variant();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see bxml.MachineType#getProperties()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Properties();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getInvariant <em>Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invariant</em>'.
   * @see bxml.MachineType#getInvariant()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Invariant();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getInitialisation <em>Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialisation</em>'.
   * @see bxml.MachineType#getInitialisation()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Initialisation();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assertions</em>'.
   * @see bxml.MachineType#getAssertions()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Assertions();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getLocalOperations <em>Local Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local Operations</em>'.
   * @see bxml.MachineType#getLocalOperations()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_LocalOperations();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operations</em>'.
   * @see bxml.MachineType#getOperations()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_Operations();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType#getTypeInfos <em>Type Infos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Infos</em>'.
   * @see bxml.MachineType#getTypeInfos()
   * @see #getMachineType()
   * @generated
   */
  EReference getMachineType_TypeInfos();

  /**
   * Returns the meta object for the attribute '{@link bxml.MachineType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bxml.MachineType#getName()
   * @see #getMachineType()
   * @generated
   */
  EAttribute getMachineType_Name();

  /**
   * Returns the meta object for the attribute '{@link bxml.MachineType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see bxml.MachineType#getType()
   * @see #getMachineType()
   * @generated
   */
  EAttribute getMachineType_Type();

  /**
   * Returns the meta object for class '{@link bxml.NameType <em>Name Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Type</em>'.
   * @see bxml.NameType
   * @generated
   */
  EClass getNameType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.NameType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.NameType#getAttr()
   * @see #getNameType()
   * @generated
   */
  EReference getNameType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.NameType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.NameType#getId()
   * @see #getNameType()
   * @generated
   */
  EReference getNameType_Id();

  /**
   * Returns the meta object for class '{@link bxml.NaryExpType <em>Nary Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nary Exp Type</em>'.
   * @see bxml.NaryExpType
   * @generated
   */
  EClass getNaryExpType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.NaryExpType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.NaryExpType#getAttr()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.NaryExpType#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Expression</em>'.
   * @see bxml.NaryExpType#getExpression()
   * @see #getNaryExpType()
   * @generated
   */
  EAttribute getNaryExpType_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Exp</em>'.
   * @see bxml.NaryExpType#getBinaryExp()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_BinaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Exp</em>'.
   * @see bxml.NaryExpType#getNaryExp()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_NaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Literal</em>'.
   * @see bxml.NaryExpType#getBooleanLiteral()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Exp</em>'.
   * @see bxml.NaryExpType#getBooleanExp()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_BooleanExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Set</em>'.
   * @see bxml.NaryExpType#getEmptySet()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_EmptySet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Seq</em>'.
   * @see bxml.NaryExpType#getEmptySeq()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_EmptySeq();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.NaryExpType#getId()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_Id();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integer Literal</em>'.
   * @see bxml.NaryExpType#getIntegerLiteral()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Exp</em>'.
   * @see bxml.NaryExpType#getQuantifiedExp()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Set</em>'.
   * @see bxml.NaryExpType#getQuantifiedSet()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>STRING Literal</em>'.
   * @see bxml.NaryExpType#getSTRINGLiteral()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Exp</em>'.
   * @see bxml.NaryExpType#getUnaryExp()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_UnaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct</em>'.
   * @see bxml.NaryExpType#getStruct()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryExpType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record</em>'.
   * @see bxml.NaryExpType#getRecord()
   * @see #getNaryExpType()
   * @generated
   */
  EReference getNaryExpType_Record();

  /**
   * Returns the meta object for the attribute '{@link bxml.NaryExpType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.NaryExpType#getOp()
   * @see #getNaryExpType()
   * @generated
   */
  EAttribute getNaryExpType_Op();

  /**
   * Returns the meta object for the attribute '{@link bxml.NaryExpType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.NaryExpType#getTypref()
   * @see #getNaryExpType()
   * @generated
   */
  EAttribute getNaryExpType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.NaryPredType <em>Nary Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nary Pred Type</em>'.
   * @see bxml.NaryPredType
   * @generated
   */
  EClass getNaryPredType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.NaryPredType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.NaryPredType#getAttr()
   * @see #getNaryPredType()
   * @generated
   */
  EReference getNaryPredType_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.NaryPredType#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Predicate</em>'.
   * @see bxml.NaryPredType#getPredicate()
   * @see #getNaryPredType()
   * @generated
   */
  EAttribute getNaryPredType_Predicate();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Pred</em>'.
   * @see bxml.NaryPredType#getBinaryPred()
   * @see #getNaryPredType()
   * @generated
   */
  EReference getNaryPredType_BinaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Pred</em>'.
   * @see bxml.NaryPredType#getNaryPred()
   * @see #getNaryPredType()
   * @generated
   */
  EReference getNaryPredType_NaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Pred</em>'.
   * @see bxml.NaryPredType#getUnaryPred()
   * @see #getNaryPredType()
   * @generated
   */
  EReference getNaryPredType_UnaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Pred</em>'.
   * @see bxml.NaryPredType#getQuantifiedPred()
   * @see #getNaryPredType()
   * @generated
   */
  EReference getNaryPredType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Comparison</em>'.
   * @see bxml.NaryPredType#getExpComparison()
   * @see #getNaryPredType()
   * @generated
   */
  EReference getNaryPredType_ExpComparison();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Set</em>'.
   * @see bxml.NaryPredType#getSet()
   * @see #getNaryPredType()
   * @generated
   */
  EReference getNaryPredType_Set();

  /**
   * Returns the meta object for the attribute '{@link bxml.NaryPredType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.NaryPredType#getOp()
   * @see #getNaryPredType()
   * @generated
   */
  EAttribute getNaryPredType_Op();

  /**
   * Returns the meta object for class '{@link bxml.NarySubType <em>Nary Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nary Sub Type</em>'.
   * @see bxml.NarySubType
   * @generated
   */
  EClass getNarySubType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.NarySubType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.NarySubType#getAttr()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.NarySubType#getSubstitution <em>Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Substitution</em>'.
   * @see bxml.NarySubType#getSubstitution()
   * @see #getNarySubType()
   * @generated
   */
  EAttribute getNarySubType_Substitution();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bloc Sub</em>'.
   * @see bxml.NarySubType#getBlocSub()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_BlocSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Skip</em>'.
   * @see bxml.NarySubType#getSkip()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_Skip();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assert Sub</em>'.
   * @see bxml.NarySubType#getAssertSub()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_AssertSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>If Sub</em>'.
   * @see bxml.NarySubType#getIfSub()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_IfSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Becomes Such That</em>'.
   * @see bxml.NarySubType#getBecomesSuchThat()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignement Sub</em>'.
   * @see bxml.NarySubType#getAssignementSub()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_AssignementSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Select</em>'.
   * @see bxml.NarySubType#getSelect()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_Select();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Sub</em>'.
   * @see bxml.NarySubType#getCaseSub()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_CaseSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>ANY Sub</em>'.
   * @see bxml.NarySubType#getANYSub()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_ANYSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>LET Sub</em>'.
   * @see bxml.NarySubType#getLETSub()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_LETSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Becomes In</em>'.
   * @see bxml.NarySubType#getBecomesIn()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_BecomesIn();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>VARIN</em>'.
   * @see bxml.NarySubType#getVARIN()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_VARIN();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Sub</em>'.
   * @see bxml.NarySubType#getNarySub()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_NarySub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation Call</em>'.
   * @see bxml.NarySubType#getOperationCall()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_OperationCall();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubType#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>While</em>'.
   * @see bxml.NarySubType#getWhile()
   * @see #getNarySubType()
   * @generated
   */
  EReference getNarySubType_While();

  /**
   * Returns the meta object for the attribute '{@link bxml.NarySubType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.NarySubType#getOp()
   * @see #getNarySubType()
   * @generated
   */
  EAttribute getNarySubType_Op();

  /**
   * Returns the meta object for class '{@link bxml.OperationCallType <em>Operation Call Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Call Type</em>'.
   * @see bxml.OperationCallType
   * @generated
   */
  EClass getOperationCallType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationCallType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.OperationCallType#getAttr()
   * @see #getOperationCallType()
   * @generated
   */
  EReference getOperationCallType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationCallType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see bxml.OperationCallType#getName()
   * @see #getOperationCallType()
   * @generated
   */
  EReference getOperationCallType_Name();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationCallType#getInputParameters <em>Input Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Parameters</em>'.
   * @see bxml.OperationCallType#getInputParameters()
   * @see #getOperationCallType()
   * @generated
   */
  EReference getOperationCallType_InputParameters();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationCallType#getOutputParameters <em>Output Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Parameters</em>'.
   * @see bxml.OperationCallType#getOutputParameters()
   * @see #getOperationCallType()
   * @generated
   */
  EReference getOperationCallType_OutputParameters();

  /**
   * Returns the meta object for class '{@link bxml.OperationsType <em>Operations Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operations Type</em>'.
   * @see bxml.OperationsType
   * @generated
   */
  EClass getOperationsType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationsType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.OperationsType#getAttr()
   * @see #getOperationsType()
   * @generated
   */
  EReference getOperationsType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OperationsType#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation</em>'.
   * @see bxml.OperationsType#getOperation()
   * @see #getOperationsType()
   * @generated
   */
  EReference getOperationsType_Operation();

  /**
   * Returns the meta object for class '{@link bxml.OperationType <em>Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Type</em>'.
   * @see bxml.OperationType
   * @generated
   */
  EClass getOperationType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.OperationType#getAttr()
   * @see #getOperationType()
   * @generated
   */
  EReference getOperationType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationType#getRefines <em>Refines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Refines</em>'.
   * @see bxml.OperationType#getRefines()
   * @see #getOperationType()
   * @generated
   */
  EReference getOperationType_Refines();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationType#getOutputParameters <em>Output Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Parameters</em>'.
   * @see bxml.OperationType#getOutputParameters()
   * @see #getOperationType()
   * @generated
   */
  EReference getOperationType_OutputParameters();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationType#getInputParameters <em>Input Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Parameters</em>'.
   * @see bxml.OperationType#getInputParameters()
   * @see #getOperationType()
   * @generated
   */
  EReference getOperationType_InputParameters();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationType#getPrecondition <em>Precondition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Precondition</em>'.
   * @see bxml.OperationType#getPrecondition()
   * @see #getOperationType()
   * @generated
   */
  EReference getOperationType_Precondition();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OperationType#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see bxml.OperationType#getBody()
   * @see #getOperationType()
   * @generated
   */
  EReference getOperationType_Body();

  /**
   * Returns the meta object for the attribute '{@link bxml.OperationType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bxml.OperationType#getName()
   * @see #getOperationType()
   * @generated
   */
  EAttribute getOperationType_Name();

  /**
   * Returns the meta object for class '{@link bxml.OutputParametersType <em>Output Parameters Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Parameters Type</em>'.
   * @see bxml.OutputParametersType
   * @generated
   */
  EClass getOutputParametersType();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.OutputParametersType#getId()
   * @see #getOutputParametersType()
   * @generated
   */
  EReference getOutputParametersType_Id();

  /**
   * Returns the meta object for class '{@link bxml.OutputParametersType1 <em>Output Parameters Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Parameters Type1</em>'.
   * @see bxml.OutputParametersType1
   * @generated
   */
  EClass getOutputParametersType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.OutputParametersType1#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.OutputParametersType1#getAttr()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.OutputParametersType1#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Expression</em>'.
   * @see bxml.OutputParametersType1#getExpression()
   * @see #getOutputParametersType1()
   * @generated
   */
  EAttribute getOutputParametersType1_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Exp</em>'.
   * @see bxml.OutputParametersType1#getBinaryExp()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_BinaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Exp</em>'.
   * @see bxml.OutputParametersType1#getNaryExp()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_NaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Literal</em>'.
   * @see bxml.OutputParametersType1#getBooleanLiteral()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Exp</em>'.
   * @see bxml.OutputParametersType1#getBooleanExp()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_BooleanExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Set</em>'.
   * @see bxml.OutputParametersType1#getEmptySet()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_EmptySet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Seq</em>'.
   * @see bxml.OutputParametersType1#getEmptySeq()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_EmptySeq();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.OutputParametersType1#getId()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_Id();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integer Literal</em>'.
   * @see bxml.OutputParametersType1#getIntegerLiteral()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Exp</em>'.
   * @see bxml.OutputParametersType1#getQuantifiedExp()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Set</em>'.
   * @see bxml.OutputParametersType1#getQuantifiedSet()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>STRING Literal</em>'.
   * @see bxml.OutputParametersType1#getSTRINGLiteral()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Exp</em>'.
   * @see bxml.OutputParametersType1#getUnaryExp()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_UnaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct</em>'.
   * @see bxml.OutputParametersType1#getStruct()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.OutputParametersType1#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record</em>'.
   * @see bxml.OutputParametersType1#getRecord()
   * @see #getOutputParametersType1()
   * @generated
   */
  EReference getOutputParametersType1_Record();

  /**
   * Returns the meta object for class '{@link bxml.ParametersType <em>Parameters Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters Type</em>'.
   * @see bxml.ParametersType
   * @generated
   */
  EClass getParametersType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ParametersType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ParametersType#getAttr()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.ParametersType#getId()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_Id();

  /**
   * Returns the meta object for class '{@link bxml.ParametersType1 <em>Parameters Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters Type1</em>'.
   * @see bxml.ParametersType1
   * @generated
   */
  EClass getParametersType1();

  /**
   * Returns the meta object for the attribute list '{@link bxml.ParametersType1#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Expression</em>'.
   * @see bxml.ParametersType1#getExpression()
   * @see #getParametersType1()
   * @generated
   */
  EAttribute getParametersType1_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Exp</em>'.
   * @see bxml.ParametersType1#getBinaryExp()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_BinaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Exp</em>'.
   * @see bxml.ParametersType1#getNaryExp()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_NaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Literal</em>'.
   * @see bxml.ParametersType1#getBooleanLiteral()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Exp</em>'.
   * @see bxml.ParametersType1#getBooleanExp()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_BooleanExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Set</em>'.
   * @see bxml.ParametersType1#getEmptySet()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_EmptySet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Seq</em>'.
   * @see bxml.ParametersType1#getEmptySeq()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_EmptySeq();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.ParametersType1#getId()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_Id();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integer Literal</em>'.
   * @see bxml.ParametersType1#getIntegerLiteral()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Exp</em>'.
   * @see bxml.ParametersType1#getQuantifiedExp()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Set</em>'.
   * @see bxml.ParametersType1#getQuantifiedSet()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>STRING Literal</em>'.
   * @see bxml.ParametersType1#getSTRINGLiteral()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Exp</em>'.
   * @see bxml.ParametersType1#getUnaryExp()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_UnaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct</em>'.
   * @see bxml.ParametersType1#getStruct()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType1#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record</em>'.
   * @see bxml.ParametersType1#getRecord()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_Record();

  /**
   * Returns the meta object for class '{@link bxml.PreconditionType <em>Precondition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precondition Type</em>'.
   * @see bxml.PreconditionType
   * @generated
   */
  EClass getPreconditionType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PreconditionType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.PreconditionType#getBinaryPred()
   * @see #getPreconditionType()
   * @generated
   */
  EReference getPreconditionType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PreconditionType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.PreconditionType#getNaryPred()
   * @see #getPreconditionType()
   * @generated
   */
  EReference getPreconditionType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PreconditionType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.PreconditionType#getUnaryPred()
   * @see #getPreconditionType()
   * @generated
   */
  EReference getPreconditionType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PreconditionType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.PreconditionType#getQuantifiedPred()
   * @see #getPreconditionType()
   * @generated
   */
  EReference getPreconditionType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PreconditionType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.PreconditionType#getExpComparison()
   * @see #getPreconditionType()
   * @generated
   */
  EReference getPreconditionType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PreconditionType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.PreconditionType#getSet()
   * @see #getPreconditionType()
   * @generated
   */
  EReference getPreconditionType_Set();

  /**
   * Returns the meta object for class '{@link bxml.PredType <em>Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pred Type</em>'.
   * @see bxml.PredType
   * @generated
   */
  EClass getPredType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.PredType#getAttr()
   * @see #getPredType()
   * @generated
   */
  EReference getPredType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.PredType#getBinaryPred()
   * @see #getPredType()
   * @generated
   */
  EReference getPredType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.PredType#getNaryPred()
   * @see #getPredType()
   * @generated
   */
  EReference getPredType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.PredType#getUnaryPred()
   * @see #getPredType()
   * @generated
   */
  EReference getPredType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.PredType#getQuantifiedPred()
   * @see #getPredType()
   * @generated
   */
  EReference getPredType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.PredType#getExpComparison()
   * @see #getPredType()
   * @generated
   */
  EReference getPredType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.PredType#getSet()
   * @see #getPredType()
   * @generated
   */
  EReference getPredType_Set();

  /**
   * Returns the meta object for class '{@link bxml.PromotedOperationType <em>Promoted Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Promoted Operation Type</em>'.
   * @see bxml.PromotedOperationType
   * @generated
   */
  EClass getPromotedOperationType();

  /**
   * Returns the meta object for the attribute list '{@link bxml.PromotedOperationType#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see bxml.PromotedOperationType#getMixed()
   * @see #getPromotedOperationType()
   * @generated
   */
  EAttribute getPromotedOperationType_Mixed();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PromotedOperationType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.PromotedOperationType#getAttr()
   * @see #getPromotedOperationType()
   * @generated
   */
  EReference getPromotedOperationType_Attr();

  /**
   * Returns the meta object for class '{@link bxml.PromotesType <em>Promotes Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Promotes Type</em>'.
   * @see bxml.PromotesType
   * @generated
   */
  EClass getPromotesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PromotesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.PromotesType#getAttr()
   * @see #getPromotesType()
   * @generated
   */
  EReference getPromotesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.PromotesType#getPromotedOperation <em>Promoted Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Promoted Operation</em>'.
   * @see bxml.PromotesType#getPromotedOperation()
   * @see #getPromotesType()
   * @generated
   */
  EReference getPromotesType_PromotedOperation();

  /**
   * Returns the meta object for class '{@link bxml.PropertiesType <em>Properties Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Properties Type</em>'.
   * @see bxml.PropertiesType
   * @generated
   */
  EClass getPropertiesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PropertiesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.PropertiesType#getAttr()
   * @see #getPropertiesType()
   * @generated
   */
  EReference getPropertiesType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PropertiesType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.PropertiesType#getBinaryPred()
   * @see #getPropertiesType()
   * @generated
   */
  EReference getPropertiesType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PropertiesType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.PropertiesType#getNaryPred()
   * @see #getPropertiesType()
   * @generated
   */
  EReference getPropertiesType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PropertiesType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.PropertiesType#getUnaryPred()
   * @see #getPropertiesType()
   * @generated
   */
  EReference getPropertiesType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PropertiesType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.PropertiesType#getQuantifiedPred()
   * @see #getPropertiesType()
   * @generated
   */
  EReference getPropertiesType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PropertiesType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.PropertiesType#getExpComparison()
   * @see #getPropertiesType()
   * @generated
   */
  EReference getPropertiesType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PropertiesType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.PropertiesType#getSet()
   * @see #getPropertiesType()
   * @generated
   */
  EReference getPropertiesType_Set();

  /**
   * Returns the meta object for class '{@link bxml.QuantifiedExpType <em>Quantified Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Exp Type</em>'.
   * @see bxml.QuantifiedExpType
   * @generated
   */
  EClass getQuantifiedExpType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedExpType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.QuantifiedExpType#getAttr()
   * @see #getQuantifiedExpType()
   * @generated
   */
  EReference getQuantifiedExpType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedExpType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.QuantifiedExpType#getVariables()
   * @see #getQuantifiedExpType()
   * @generated
   */
  EReference getQuantifiedExpType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedExpType#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred</em>'.
   * @see bxml.QuantifiedExpType#getPred()
   * @see #getQuantifiedExpType()
   * @generated
   */
  EReference getQuantifiedExpType_Pred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedExpType#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see bxml.QuantifiedExpType#getBody()
   * @see #getQuantifiedExpType()
   * @generated
   */
  EReference getQuantifiedExpType_Body();

  /**
   * Returns the meta object for the attribute '{@link bxml.QuantifiedExpType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see bxml.QuantifiedExpType#getType()
   * @see #getQuantifiedExpType()
   * @generated
   */
  EAttribute getQuantifiedExpType_Type();

  /**
   * Returns the meta object for the attribute '{@link bxml.QuantifiedExpType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.QuantifiedExpType#getTypref()
   * @see #getQuantifiedExpType()
   * @generated
   */
  EAttribute getQuantifiedExpType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.QuantifiedPredType <em>Quantified Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Pred Type</em>'.
   * @see bxml.QuantifiedPredType
   * @generated
   */
  EClass getQuantifiedPredType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedPredType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.QuantifiedPredType#getAttr()
   * @see #getQuantifiedPredType()
   * @generated
   */
  EReference getQuantifiedPredType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedPredType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.QuantifiedPredType#getVariables()
   * @see #getQuantifiedPredType()
   * @generated
   */
  EReference getQuantifiedPredType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedPredType#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see bxml.QuantifiedPredType#getBody()
   * @see #getQuantifiedPredType()
   * @generated
   */
  EReference getQuantifiedPredType_Body();

  /**
   * Returns the meta object for the attribute '{@link bxml.QuantifiedPredType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see bxml.QuantifiedPredType#getType()
   * @see #getQuantifiedPredType()
   * @generated
   */
  EAttribute getQuantifiedPredType_Type();

  /**
   * Returns the meta object for class '{@link bxml.QuantifiedSetType <em>Quantified Set Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Set Type</em>'.
   * @see bxml.QuantifiedSetType
   * @generated
   */
  EClass getQuantifiedSetType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedSetType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.QuantifiedSetType#getAttr()
   * @see #getQuantifiedSetType()
   * @generated
   */
  EReference getQuantifiedSetType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedSetType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.QuantifiedSetType#getVariables()
   * @see #getQuantifiedSetType()
   * @generated
   */
  EReference getQuantifiedSetType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.QuantifiedSetType#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see bxml.QuantifiedSetType#getBody()
   * @see #getQuantifiedSetType()
   * @generated
   */
  EReference getQuantifiedSetType_Body();

  /**
   * Returns the meta object for the attribute '{@link bxml.QuantifiedSetType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.QuantifiedSetType#getTypref()
   * @see #getQuantifiedSetType()
   * @generated
   */
  EAttribute getQuantifiedSetType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.RecordItemType <em>Record Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Item Type</em>'.
   * @see bxml.RecordItemType
   * @generated
   */
  EClass getRecordItemType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.RecordItemType#getAttr()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.RecordItemType#getBinaryExp()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.RecordItemType#getNaryExp()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.RecordItemType#getBooleanLiteral()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.RecordItemType#getBooleanExp()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.RecordItemType#getEmptySet()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.RecordItemType#getEmptySeq()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.RecordItemType#getId()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.RecordItemType#getIntegerLiteral()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.RecordItemType#getQuantifiedExp()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.RecordItemType#getQuantifiedSet()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.RecordItemType#getSTRINGLiteral()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.RecordItemType#getUnaryExp()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.RecordItemType#getStruct()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordItemType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.RecordItemType#getRecord()
   * @see #getRecordItemType()
   * @generated
   */
  EReference getRecordItemType_Record();

  /**
   * Returns the meta object for the attribute '{@link bxml.RecordItemType#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see bxml.RecordItemType#getLabel()
   * @see #getRecordItemType()
   * @generated
   */
  EAttribute getRecordItemType_Label();

  /**
   * Returns the meta object for class '{@link bxml.RecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Type</em>'.
   * @see bxml.RecordType
   * @generated
   */
  EClass getRecordType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RecordType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.RecordType#getAttr()
   * @see #getRecordType()
   * @generated
   */
  EReference getRecordType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.RecordType#getRecordItem <em>Record Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record Item</em>'.
   * @see bxml.RecordType#getRecordItem()
   * @see #getRecordType()
   * @generated
   */
  EReference getRecordType_RecordItem();

  /**
   * Returns the meta object for the attribute '{@link bxml.RecordType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.RecordType#getTypref()
   * @see #getRecordType()
   * @generated
   */
  EAttribute getRecordType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.ReferencedMachineType <em>Referenced Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Machine Type</em>'.
   * @see bxml.ReferencedMachineType
   * @generated
   */
  EClass getReferencedMachineType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ReferencedMachineType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ReferencedMachineType#getAttr()
   * @see #getReferencedMachineType()
   * @generated
   */
  EReference getReferencedMachineType_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.ReferencedMachineType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bxml.ReferencedMachineType#getName()
   * @see #getReferencedMachineType()
   * @generated
   */
  EAttribute getReferencedMachineType_Name();

  /**
   * Returns the meta object for the attribute '{@link bxml.ReferencedMachineType#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance</em>'.
   * @see bxml.ReferencedMachineType#getInstance()
   * @see #getReferencedMachineType()
   * @generated
   */
  EAttribute getReferencedMachineType_Instance();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ReferencedMachineType#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see bxml.ReferencedMachineType#getParameters()
   * @see #getReferencedMachineType()
   * @generated
   */
  EReference getReferencedMachineType_Parameters();

  /**
   * Returns the meta object for class '{@link bxml.RefinesType <em>Refines Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refines Type</em>'.
   * @see bxml.RefinesType
   * @generated
   */
  EClass getRefinesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.RefinesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.RefinesType#getAttr()
   * @see #getRefinesType()
   * @generated
   */
  EReference getRefinesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.RefinesType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.RefinesType#getId()
   * @see #getRefinesType()
   * @generated
   */
  EReference getRefinesType_Id();

  /**
   * Returns the meta object for class '{@link bxml.SeesType <em>Sees Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sees Type</em>'.
   * @see bxml.SeesType
   * @generated
   */
  EClass getSeesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SeesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.SeesType#getAttr()
   * @see #getSeesType()
   * @generated
   */
  EReference getSeesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.SeesType#getReferencedMachine <em>Referenced Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referenced Machine</em>'.
   * @see bxml.SeesType#getReferencedMachine()
   * @see #getSeesType()
   * @generated
   */
  EReference getSeesType_ReferencedMachine();

  /**
   * Returns the meta object for class '{@link bxml.SelectType <em>Select Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Type</em>'.
   * @see bxml.SelectType
   * @generated
   */
  EClass getSelectType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SelectType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.SelectType#getAttr()
   * @see #getSelectType()
   * @generated
   */
  EReference getSelectType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SelectType#getWhenClauses <em>When Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>When Clauses</em>'.
   * @see bxml.SelectType#getWhenClauses()
   * @see #getSelectType()
   * @generated
   */
  EReference getSelectType_WhenClauses();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SelectType#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see bxml.SelectType#getElse()
   * @see #getSelectType()
   * @generated
   */
  EReference getSelectType_Else();

  /**
   * Returns the meta object for class '{@link bxml.SetsType <em>Sets Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sets Type</em>'.
   * @see bxml.SetsType
   * @generated
   */
  EClass getSetsType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SetsType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.SetsType#getAttr()
   * @see #getSetsType()
   * @generated
   */
  EReference getSetsType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.SetsType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Set</em>'.
   * @see bxml.SetsType#getSet()
   * @see #getSetsType()
   * @generated
   */
  EReference getSetsType_Set();

  /**
   * Returns the meta object for class '{@link bxml.SetType <em>Set Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Type</em>'.
   * @see bxml.SetType
   * @generated
   */
  EClass getSetType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SetType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.SetType#getAttr()
   * @see #getSetType()
   * @generated
   */
  EReference getSetType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SetType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.SetType#getId()
   * @see #getSetType()
   * @generated
   */
  EReference getSetType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SetType#getEnumeratedValues <em>Enumerated Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumerated Values</em>'.
   * @see bxml.SetType#getEnumeratedValues()
   * @see #getSetType()
   * @generated
   */
  EReference getSetType_EnumeratedValues();

  /**
   * Returns the meta object for class '{@link bxml.SetType1 <em>Set Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Type1</em>'.
   * @see bxml.SetType1
   * @generated
   */
  EClass getSetType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SetType1#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.SetType1#getId()
   * @see #getSetType1()
   * @generated
   */
  EReference getSetType1_Id();

  /**
   * Returns the meta object for class '{@link bxml.SkipType <em>Skip Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skip Type</em>'.
   * @see bxml.SkipType
   * @generated
   */
  EClass getSkipType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SkipType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.SkipType#getAttr()
   * @see #getSkipType()
   * @generated
   */
  EReference getSkipType_Attr();

  /**
   * Returns the meta object for class '{@link bxml.STRINGLiteralType <em>STRING Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STRING Literal Type</em>'.
   * @see bxml.STRINGLiteralType
   * @generated
   */
  EClass getSTRINGLiteralType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.STRINGLiteralType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.STRINGLiteralType#getAttr()
   * @see #getSTRINGLiteralType()
   * @generated
   */
  EReference getSTRINGLiteralType_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.STRINGLiteralType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.STRINGLiteralType#getTypref()
   * @see #getSTRINGLiteralType()
   * @generated
   */
  EAttribute getSTRINGLiteralType_Typref();

  /**
   * Returns the meta object for the attribute '{@link bxml.STRINGLiteralType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bxml.STRINGLiteralType#getValue()
   * @see #getSTRINGLiteralType()
   * @generated
   */
  EAttribute getSTRINGLiteralType_Value();

  /**
   * Returns the meta object for class '{@link bxml.StructType <em>Struct Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Type</em>'.
   * @see bxml.StructType
   * @generated
   */
  EClass getStructType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.StructType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.StructType#getAttr()
   * @see #getStructType()
   * @generated
   */
  EReference getStructType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.StructType#getRecordItem <em>Record Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record Item</em>'.
   * @see bxml.StructType#getRecordItem()
   * @see #getStructType()
   * @generated
   */
  EReference getStructType_RecordItem();

  /**
   * Returns the meta object for the attribute '{@link bxml.StructType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.StructType#getTypref()
   * @see #getStructType()
   * @generated
   */
  EAttribute getStructType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.ThenType <em>Then Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Then Type</em>'.
   * @see bxml.ThenType
   * @generated
   */
  EClass getThenType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ThenType#getAttr()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.ThenType#getBlocSub()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.ThenType#getSkip()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.ThenType#getAssertSub()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.ThenType#getIfSub()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.ThenType#getBecomesSuchThat()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.ThenType#getAssignementSub()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.ThenType#getSelect()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.ThenType#getCaseSub()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.ThenType#getANYSub()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.ThenType#getLETSub()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.ThenType#getBecomesIn()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.ThenType#getVARIN()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.ThenType#getNarySub()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.ThenType#getOperationCall()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ThenType#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.ThenType#getWhile()
   * @see #getThenType()
   * @generated
   */
  EReference getThenType_While();

  /**
   * Returns the meta object for class '{@link bxml.TypeInfo <em>Type Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Info</em>'.
   * @see bxml.TypeInfo
   * @generated
   */
  EClass getTypeInfo();

  /**
   * Returns the meta object for the containment reference '{@link bxml.TypeInfo#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.TypeInfo#getId()
   * @see #getTypeInfo()
   * @generated
   */
  EReference getTypeInfo_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.TypeInfo#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.TypeInfo#getUnaryExp()
   * @see #getTypeInfo()
   * @generated
   */
  EReference getTypeInfo_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.TypeInfo#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.TypeInfo#getBinaryExp()
   * @see #getTypeInfo()
   * @generated
   */
  EReference getTypeInfo_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.TypeInfo#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.TypeInfo#getStruct()
   * @see #getTypeInfo()
   * @generated
   */
  EReference getTypeInfo_Struct();

  /**
   * Returns the meta object for the attribute '{@link bxml.TypeInfo#getGenericType <em>Generic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Type</em>'.
   * @see bxml.TypeInfo#getGenericType()
   * @see #getTypeInfo()
   * @generated
   */
  EAttribute getTypeInfo_GenericType();

  /**
   * Returns the meta object for the attribute '{@link bxml.TypeInfo#getId1 <em>Id1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id1</em>'.
   * @see bxml.TypeInfo#getId1()
   * @see #getTypeInfo()
   * @generated
   */
  EAttribute getTypeInfo_Id1();

  /**
   * Returns the meta object for class '{@link bxml.TypeInfosType <em>Type Infos Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Infos Type</em>'.
   * @see bxml.TypeInfosType
   * @generated
   */
  EClass getTypeInfosType();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.TypeInfosType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see bxml.TypeInfosType#getType()
   * @see #getTypeInfosType()
   * @generated
   */
  EReference getTypeInfosType_Type();

  /**
   * Returns the meta object for class '{@link bxml.UnaryExpType <em>Unary Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Exp Type</em>'.
   * @see bxml.UnaryExpType
   * @generated
   */
  EClass getUnaryExpType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.UnaryExpType#getAttr()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.UnaryExpType#getBinaryExp()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.UnaryExpType#getNaryExp()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.UnaryExpType#getBooleanLiteral()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.UnaryExpType#getBooleanExp()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.UnaryExpType#getEmptySet()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.UnaryExpType#getEmptySeq()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.UnaryExpType#getId()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.UnaryExpType#getIntegerLiteral()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.UnaryExpType#getQuantifiedExp()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.UnaryExpType#getQuantifiedSet()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.UnaryExpType#getSTRINGLiteral()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.UnaryExpType#getUnaryExp()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.UnaryExpType#getStruct()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.UnaryExpType#getRecord()
   * @see #getUnaryExpType()
   * @generated
   */
  EReference getUnaryExpType_Record();

  /**
   * Returns the meta object for the attribute '{@link bxml.UnaryExpType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.UnaryExpType#getOp()
   * @see #getUnaryExpType()
   * @generated
   */
  EAttribute getUnaryExpType_Op();

  /**
   * Returns the meta object for the attribute '{@link bxml.UnaryExpType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.UnaryExpType#getTypref()
   * @see #getUnaryExpType()
   * @generated
   */
  EAttribute getUnaryExpType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.UnaryExpType2 <em>Unary Exp Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Exp Type2</em>'.
   * @see bxml.UnaryExpType2
   * @generated
   */
  EClass getUnaryExpType2();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType2#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.UnaryExpType2#getId()
   * @see #getUnaryExpType2()
   * @generated
   */
  EReference getUnaryExpType2_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType2#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.UnaryExpType2#getUnaryExp()
   * @see #getUnaryExpType2()
   * @generated
   */
  EReference getUnaryExpType2_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType2#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.UnaryExpType2#getBinaryExp()
   * @see #getUnaryExpType2()
   * @generated
   */
  EReference getUnaryExpType2_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpType2#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.UnaryExpType2#getStruct()
   * @see #getUnaryExpType2()
   * @generated
   */
  EReference getUnaryExpType2_Struct();

  /**
   * Returns the meta object for the attribute '{@link bxml.UnaryExpType2#getGenericType <em>Generic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Type</em>'.
   * @see bxml.UnaryExpType2#getGenericType()
   * @see #getUnaryExpType2()
   * @generated
   */
  EAttribute getUnaryExpType2_GenericType();

  /**
   * Returns the meta object for the attribute '{@link bxml.UnaryExpType2#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.UnaryExpType2#getOp()
   * @see #getUnaryExpType2()
   * @generated
   */
  EAttribute getUnaryExpType2_Op();

  /**
   * Returns the meta object for class '{@link bxml.UnaryPredType <em>Unary Pred Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Pred Type</em>'.
   * @see bxml.UnaryPredType
   * @generated
   */
  EClass getUnaryPredType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.UnaryPredType#getAttr()
   * @see #getUnaryPredType()
   * @generated
   */
  EReference getUnaryPredType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.UnaryPredType#getBinaryPred()
   * @see #getUnaryPredType()
   * @generated
   */
  EReference getUnaryPredType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.UnaryPredType#getNaryPred()
   * @see #getUnaryPredType()
   * @generated
   */
  EReference getUnaryPredType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.UnaryPredType#getUnaryPred()
   * @see #getUnaryPredType()
   * @generated
   */
  EReference getUnaryPredType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.UnaryPredType#getQuantifiedPred()
   * @see #getUnaryPredType()
   * @generated
   */
  EReference getUnaryPredType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.UnaryPredType#getExpComparison()
   * @see #getUnaryPredType()
   * @generated
   */
  EReference getUnaryPredType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.UnaryPredType#getSet()
   * @see #getUnaryPredType()
   * @generated
   */
  EReference getUnaryPredType_Set();

  /**
   * Returns the meta object for the attribute '{@link bxml.UnaryPredType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.UnaryPredType#getOp()
   * @see #getUnaryPredType()
   * @generated
   */
  EAttribute getUnaryPredType_Op();

  /**
   * Returns the meta object for class '{@link bxml.UsesType <em>Uses Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses Type</em>'.
   * @see bxml.UsesType
   * @generated
   */
  EClass getUsesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UsesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.UsesType#getAttr()
   * @see #getUsesType()
   * @generated
   */
  EReference getUsesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.UsesType#getReferencedMachine <em>Referenced Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referenced Machine</em>'.
   * @see bxml.UsesType#getReferencedMachine()
   * @see #getUsesType()
   * @generated
   */
  EReference getUsesType_ReferencedMachine();

  /**
   * Returns the meta object for class '{@link bxml.ValuationType <em>Valuation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valuation Type</em>'.
   * @see bxml.ValuationType
   * @generated
   */
  EClass getValuationType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ValuationType#getAttr()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.ValuationType#getBinaryExp()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.ValuationType#getNaryExp()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.ValuationType#getBooleanLiteral()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.ValuationType#getBooleanExp()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.ValuationType#getEmptySet()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.ValuationType#getEmptySeq()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.ValuationType#getId()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.ValuationType#getIntegerLiteral()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.ValuationType#getQuantifiedExp()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.ValuationType#getQuantifiedSet()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.ValuationType#getSTRINGLiteral()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.ValuationType#getUnaryExp()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.ValuationType#getStruct()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.ValuationType#getRecord()
   * @see #getValuationType()
   * @generated
   */
  EReference getValuationType_Record();

  /**
   * Returns the meta object for the attribute '{@link bxml.ValuationType#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see bxml.ValuationType#getIdent()
   * @see #getValuationType()
   * @generated
   */
  EAttribute getValuationType_Ident();

  /**
   * Returns the meta object for the attribute '{@link bxml.ValuationType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.ValuationType#getTypref()
   * @see #getValuationType()
   * @generated
   */
  EAttribute getValuationType_Typref();

  /**
   * Returns the meta object for class '{@link bxml.ValuationType1 <em>Valuation Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valuation Type1</em>'.
   * @see bxml.ValuationType1
   * @generated
   */
  EClass getValuationType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ValuationType1#getAttr()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.ValuationType1#getBinaryExp()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.ValuationType1#getNaryExp()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.ValuationType1#getBooleanLiteral()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.ValuationType1#getBooleanExp()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.ValuationType1#getEmptySet()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.ValuationType1#getEmptySeq()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.ValuationType1#getId()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.ValuationType1#getIntegerLiteral()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.ValuationType1#getQuantifiedExp()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.ValuationType1#getQuantifiedSet()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.ValuationType1#getSTRINGLiteral()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.ValuationType1#getUnaryExp()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.ValuationType1#getStruct()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuationType1#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.ValuationType1#getRecord()
   * @see #getValuationType1()
   * @generated
   */
  EReference getValuationType1_Record();

  /**
   * Returns the meta object for the attribute '{@link bxml.ValuationType1#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ident</em>'.
   * @see bxml.ValuationType1#getIdent()
   * @see #getValuationType1()
   * @generated
   */
  EAttribute getValuationType1_Ident();

  /**
   * Returns the meta object for class '{@link bxml.ValuesType <em>Values Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values Type</em>'.
   * @see bxml.ValuesType
   * @generated
   */
  EClass getValuesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ValuesType#getAttr()
   * @see #getValuesType()
   * @generated
   */
  EReference getValuesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType#getValuation <em>Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Valuation</em>'.
   * @see bxml.ValuesType#getValuation()
   * @see #getValuesType()
   * @generated
   */
  EReference getValuesType_Valuation();

  /**
   * Returns the meta object for class '{@link bxml.ValuesType1 <em>Values Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values Type1</em>'.
   * @see bxml.ValuesType1
   * @generated
   */
  EClass getValuesType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuesType1#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ValuesType1#getAttr()
   * @see #getValuesType1()
   * @generated
   */
  EReference getValuesType1_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType1#getValuation <em>Valuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Valuation</em>'.
   * @see bxml.ValuesType1#getValuation()
   * @see #getValuesType1()
   * @generated
   */
  EReference getValuesType1_Valuation();

  /**
   * Returns the meta object for class '{@link bxml.ValuesType2 <em>Values Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values Type2</em>'.
   * @see bxml.ValuesType2
   * @generated
   */
  EClass getValuesType2();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValuesType2#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ValuesType2#getAttr()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.ValuesType2#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Expression</em>'.
   * @see bxml.ValuesType2#getExpression()
   * @see #getValuesType2()
   * @generated
   */
  EAttribute getValuesType2_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Exp</em>'.
   * @see bxml.ValuesType2#getBinaryExp()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_BinaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Exp</em>'.
   * @see bxml.ValuesType2#getNaryExp()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_NaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Literal</em>'.
   * @see bxml.ValuesType2#getBooleanLiteral()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Exp</em>'.
   * @see bxml.ValuesType2#getBooleanExp()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_BooleanExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Set</em>'.
   * @see bxml.ValuesType2#getEmptySet()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_EmptySet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Seq</em>'.
   * @see bxml.ValuesType2#getEmptySeq()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_EmptySeq();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.ValuesType2#getId()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_Id();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integer Literal</em>'.
   * @see bxml.ValuesType2#getIntegerLiteral()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Exp</em>'.
   * @see bxml.ValuesType2#getQuantifiedExp()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Set</em>'.
   * @see bxml.ValuesType2#getQuantifiedSet()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>STRING Literal</em>'.
   * @see bxml.ValuesType2#getSTRINGLiteral()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Exp</em>'.
   * @see bxml.ValuesType2#getUnaryExp()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_UnaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct</em>'.
   * @see bxml.ValuesType2#getStruct()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ValuesType2#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record</em>'.
   * @see bxml.ValuesType2#getRecord()
   * @see #getValuesType2()
   * @generated
   */
  EReference getValuesType2_Record();

  /**
   * Returns the meta object for class '{@link bxml.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Type</em>'.
   * @see bxml.ValueType
   * @generated
   */
  EClass getValueType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ValueType#getAttr()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.ValueType#getBinaryExp()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.ValueType#getNaryExp()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.ValueType#getBooleanLiteral()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.ValueType#getBooleanExp()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.ValueType#getEmptySet()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.ValueType#getEmptySeq()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.ValueType#getId()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.ValueType#getIntegerLiteral()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.ValueType#getQuantifiedExp()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.ValueType#getQuantifiedSet()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.ValueType#getSTRINGLiteral()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.ValueType#getUnaryExp()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.ValueType#getStruct()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ValueType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.ValueType#getRecord()
   * @see #getValueType()
   * @generated
   */
  EReference getValueType_Record();

  /**
   * Returns the meta object for class '{@link bxml.VariablesType <em>Variables Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables Type</em>'.
   * @see bxml.VariablesType
   * @generated
   */
  EClass getVariablesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariablesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.VariablesType#getAttr()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.VariablesType#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Expression</em>'.
   * @see bxml.VariablesType#getExpression()
   * @see #getVariablesType()
   * @generated
   */
  EAttribute getVariablesType_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Exp</em>'.
   * @see bxml.VariablesType#getBinaryExp()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_BinaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Exp</em>'.
   * @see bxml.VariablesType#getNaryExp()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_NaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Literal</em>'.
   * @see bxml.VariablesType#getBooleanLiteral()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Exp</em>'.
   * @see bxml.VariablesType#getBooleanExp()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_BooleanExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Set</em>'.
   * @see bxml.VariablesType#getEmptySet()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_EmptySet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Seq</em>'.
   * @see bxml.VariablesType#getEmptySeq()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_EmptySeq();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.VariablesType#getId()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_Id();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integer Literal</em>'.
   * @see bxml.VariablesType#getIntegerLiteral()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Exp</em>'.
   * @see bxml.VariablesType#getQuantifiedExp()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Set</em>'.
   * @see bxml.VariablesType#getQuantifiedSet()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>STRING Literal</em>'.
   * @see bxml.VariablesType#getSTRINGLiteral()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Exp</em>'.
   * @see bxml.VariablesType#getUnaryExp()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_UnaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct</em>'.
   * @see bxml.VariablesType#getStruct()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record</em>'.
   * @see bxml.VariablesType#getRecord()
   * @see #getVariablesType()
   * @generated
   */
  EReference getVariablesType_Record();

  /**
   * Returns the meta object for class '{@link bxml.VariablesType1 <em>Variables Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables Type1</em>'.
   * @see bxml.VariablesType1
   * @generated
   */
  EClass getVariablesType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariablesType1#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.VariablesType1#getAttr()
   * @see #getVariablesType1()
   * @generated
   */
  EReference getVariablesType1_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.VariablesType1#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.VariablesType1#getId()
   * @see #getVariablesType1()
   * @generated
   */
  EReference getVariablesType1_Id();

  /**
   * Returns the meta object for class '{@link bxml.VariantType <em>Variant Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variant Type</em>'.
   * @see bxml.VariantType
   * @generated
   */
  EClass getVariantType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.VariantType#getAttr()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.VariantType#getBinaryExp()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.VariantType#getNaryExp()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.VariantType#getBooleanLiteral()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.VariantType#getBooleanExp()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.VariantType#getEmptySet()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.VariantType#getEmptySeq()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.VariantType#getId()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.VariantType#getIntegerLiteral()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.VariantType#getQuantifiedExp()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.VariantType#getQuantifiedSet()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.VariantType#getSTRINGLiteral()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.VariantType#getUnaryExp()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.VariantType#getStruct()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VariantType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.VariantType#getRecord()
   * @see #getVariantType()
   * @generated
   */
  EReference getVariantType_Record();

  /**
   * Returns the meta object for class '{@link bxml.VARINType <em>VARIN Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VARIN Type</em>'.
   * @see bxml.VARINType
   * @generated
   */
  EClass getVARINType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VARINType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.VARINType#getAttr()
   * @see #getVARINType()
   * @generated
   */
  EReference getVARINType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VARINType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.VARINType#getVariables()
   * @see #getVARINType()
   * @generated
   */
  EReference getVARINType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.VARINType#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see bxml.VARINType#getBody()
   * @see #getVARINType()
   * @generated
   */
  EReference getVARINType_Body();

  /**
   * Returns the meta object for class '{@link bxml.WhenClausesType <em>When Clauses Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Clauses Type</em>'.
   * @see bxml.WhenClausesType
   * @generated
   */
  EClass getWhenClausesType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.WhenClausesType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.WhenClausesType#getAttr()
   * @see #getWhenClausesType()
   * @generated
   */
  EReference getWhenClausesType_Attr();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.WhenClausesType#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>When</em>'.
   * @see bxml.WhenClausesType#getWhen()
   * @see #getWhenClausesType()
   * @generated
   */
  EReference getWhenClausesType_When();

  /**
   * Returns the meta object for class '{@link bxml.WhenType <em>When Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Type</em>'.
   * @see bxml.WhenType
   * @generated
   */
  EClass getWhenType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.WhenType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.WhenType#getAttr()
   * @see #getWhenType()
   * @generated
   */
  EReference getWhenType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.WhenType#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see bxml.WhenType#getCondition()
   * @see #getWhenType()
   * @generated
   */
  EReference getWhenType_Condition();

  /**
   * Returns the meta object for the containment reference '{@link bxml.WhenType#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see bxml.WhenType#getThen()
   * @see #getWhenType()
   * @generated
   */
  EReference getWhenType_Then();

  /**
   * Returns the meta object for class '{@link bxml.WhileType <em>While Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Type</em>'.
   * @see bxml.WhileType
   * @generated
   */
  EClass getWhileType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.WhileType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.WhileType#getAttr()
   * @see #getWhileType()
   * @generated
   */
  EReference getWhileType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.WhileType#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see bxml.WhileType#getCondition()
   * @see #getWhileType()
   * @generated
   */
  EReference getWhileType_Condition();

  /**
   * Returns the meta object for the containment reference '{@link bxml.WhileType#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see bxml.WhileType#getBody()
   * @see #getWhileType()
   * @generated
   */
  EReference getWhileType_Body();

  /**
   * Returns the meta object for the containment reference '{@link bxml.WhileType#getInvariant <em>Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invariant</em>'.
   * @see bxml.WhileType#getInvariant()
   * @see #getWhileType()
   * @generated
   */
  EReference getWhileType_Invariant();

  /**
   * Returns the meta object for the containment reference '{@link bxml.WhileType#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variant</em>'.
   * @see bxml.WhileType#getVariant()
   * @see #getWhileType()
   * @generated
   */
  EReference getWhileType_Variant();

  /**
   * Returns the meta object for enum '{@link bxml.ElseifType <em>Elseif Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Elseif Type</em>'.
   * @see bxml.ElseifType
   * @generated
   */
  EEnum getElseifType();

  /**
   * Returns the meta object for enum '{@link bxml.OpType <em>Op Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type</em>'.
   * @see bxml.OpType
   * @generated
   */
  EEnum getOpType();

  /**
   * Returns the meta object for enum '{@link bxml.OpType1 <em>Op Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type1</em>'.
   * @see bxml.OpType1
   * @generated
   */
  EEnum getOpType1();

  /**
   * Returns the meta object for enum '{@link bxml.OpType2 <em>Op Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type2</em>'.
   * @see bxml.OpType2
   * @generated
   */
  EEnum getOpType2();

  /**
   * Returns the meta object for enum '{@link bxml.OpType3 <em>Op Type3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type3</em>'.
   * @see bxml.OpType3
   * @generated
   */
  EEnum getOpType3();

  /**
   * Returns the meta object for enum '{@link bxml.OpType4 <em>Op Type4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type4</em>'.
   * @see bxml.OpType4
   * @generated
   */
  EEnum getOpType4();

  /**
   * Returns the meta object for enum '{@link bxml.OpType5 <em>Op Type5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type5</em>'.
   * @see bxml.OpType5
   * @generated
   */
  EEnum getOpType5();

  /**
   * Returns the meta object for enum '{@link bxml.OpType6 <em>Op Type6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type6</em>'.
   * @see bxml.OpType6
   * @generated
   */
  EEnum getOpType6();

  /**
   * Returns the meta object for enum '{@link bxml.OpType7 <em>Op Type7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type7</em>'.
   * @see bxml.OpType7
   * @generated
   */
  EEnum getOpType7();

  /**
   * Returns the meta object for enum '{@link bxml.OpType8 <em>Op Type8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type8</em>'.
   * @see bxml.OpType8
   * @generated
   */
  EEnum getOpType8();

  /**
   * Returns the meta object for enum '{@link bxml.OpType9 <em>Op Type9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Type9</em>'.
   * @see bxml.OpType9
   * @generated
   */
  EEnum getOpType9();

  /**
   * Returns the meta object for enum '{@link bxml.TypeType <em>Type Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Type</em>'.
   * @see bxml.TypeType
   * @generated
   */
  EEnum getTypeType();

  /**
   * Returns the meta object for enum '{@link bxml.TypeType1 <em>Type Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Type1</em>'.
   * @see bxml.TypeType1
   * @generated
   */
  EEnum getTypeType1();

  /**
   * Returns the meta object for enum '{@link bxml.TypeType2 <em>Type Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Type2</em>'.
   * @see bxml.TypeType2
   * @generated
   */
  EEnum getTypeType2();

  /**
   * Returns the meta object for enum '{@link bxml.ValueType1 <em>Value Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Value Type1</em>'.
   * @see bxml.ValueType1
   * @generated
   */
  EEnum getValueType1();

  /**
   * Returns the meta object for data type '{@link bxml.ElseifType <em>Elseif Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Elseif Type Object</em>'.
   * @see bxml.ElseifType
   * @model instanceClass="bxml.ElseifType"
   *        extendedMetaData="name='elseif_._type:Object' baseType='elseif_._type'"
   * @generated
   */
  EDataType getElseifTypeObject();

  /**
   * Returns the meta object for data type '{@link bxml.OpType1 <em>Op Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object</em>'.
   * @see bxml.OpType1
   * @model instanceClass="bxml.OpType1"
   *        extendedMetaData="name='op_._1_._type:Object' baseType='op_._1_._type'"
   * @generated
   */
  EDataType getOpTypeObject();

  /**
   * Returns the meta object for data type '{@link bxml.OpType8 <em>Op Type Object1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object1</em>'.
   * @see bxml.OpType8
   * @model instanceClass="bxml.OpType8"
   *        extendedMetaData="name='op_._8_._type:Object' baseType='op_._8_._type'"
   * @generated
   */
  EDataType getOpTypeObject1();

  /**
   * Returns the meta object for data type '{@link bxml.OpType5 <em>Op Type Object2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object2</em>'.
   * @see bxml.OpType5
   * @model instanceClass="bxml.OpType5"
   *        extendedMetaData="name='op_._5_._type:Object' baseType='op_._5_._type'"
   * @generated
   */
  EDataType getOpTypeObject2();

  /**
   * Returns the meta object for data type '{@link bxml.OpType4 <em>Op Type Object3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object3</em>'.
   * @see bxml.OpType4
   * @model instanceClass="bxml.OpType4"
   *        extendedMetaData="name='op_._4_._type:Object' baseType='op_._4_._type'"
   * @generated
   */
  EDataType getOpTypeObject3();

  /**
   * Returns the meta object for data type '{@link bxml.OpType3 <em>Op Type Object4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object4</em>'.
   * @see bxml.OpType3
   * @model instanceClass="bxml.OpType3"
   *        extendedMetaData="name='op_._3_._type:Object' baseType='op_._3_._type'"
   * @generated
   */
  EDataType getOpTypeObject4();

  /**
   * Returns the meta object for data type '{@link bxml.OpType <em>Op Type Object5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object5</em>'.
   * @see bxml.OpType
   * @model instanceClass="bxml.OpType"
   *        extendedMetaData="name='op_._type:Object' baseType='op_._type'"
   * @generated
   */
  EDataType getOpTypeObject5();

  /**
   * Returns the meta object for data type '{@link bxml.OpType7 <em>Op Type Object6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object6</em>'.
   * @see bxml.OpType7
   * @model instanceClass="bxml.OpType7"
   *        extendedMetaData="name='op_._7_._type:Object' baseType='op_._7_._type'"
   * @generated
   */
  EDataType getOpTypeObject6();

  /**
   * Returns the meta object for data type '{@link bxml.OpType6 <em>Op Type Object7</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object7</em>'.
   * @see bxml.OpType6
   * @model instanceClass="bxml.OpType6"
   *        extendedMetaData="name='op_._6_._type:Object' baseType='op_._6_._type'"
   * @generated
   */
  EDataType getOpTypeObject7();

  /**
   * Returns the meta object for data type '{@link bxml.OpType2 <em>Op Type Object8</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object8</em>'.
   * @see bxml.OpType2
   * @model instanceClass="bxml.OpType2"
   *        extendedMetaData="name='op_._2_._type:Object' baseType='op_._2_._type'"
   * @generated
   */
  EDataType getOpTypeObject8();

  /**
   * Returns the meta object for data type '{@link bxml.OpType9 <em>Op Type Object9</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Type Object9</em>'.
   * @see bxml.OpType9
   * @model instanceClass="bxml.OpType9"
   *        extendedMetaData="name='op_._9_._type:Object' baseType='op_._9_._type'"
   * @generated
   */
  EDataType getOpTypeObject9();

  /**
   * Returns the meta object for data type '{@link bxml.TypeType <em>Type Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Type Type Object</em>'.
   * @see bxml.TypeType
   * @model instanceClass="bxml.TypeType"
   *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
   * @generated
   */
  EDataType getTypeTypeObject();

  /**
   * Returns the meta object for data type '{@link bxml.TypeType1 <em>Type Type Object1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Type Type Object1</em>'.
   * @see bxml.TypeType1
   * @model instanceClass="bxml.TypeType1"
   *        extendedMetaData="name='type_._1_._type:Object' baseType='type_._1_._type'"
   * @generated
   */
  EDataType getTypeTypeObject1();

  /**
   * Returns the meta object for data type '{@link bxml.TypeType2 <em>Type Type Object2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Type Type Object2</em>'.
   * @see bxml.TypeType2
   * @model instanceClass="bxml.TypeType2"
   *        extendedMetaData="name='type_._2_._type:Object' baseType='type_._2_._type'"
   * @generated
   */
  EDataType getTypeTypeObject2();

  /**
   * Returns the meta object for data type '{@link bxml.ValueType1 <em>Value Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Value Type Object</em>'.
   * @see bxml.ValueType1
   * @model instanceClass="bxml.ValueType1"
   *        extendedMetaData="name='value_._type:Object' baseType='value_._type'"
   * @generated
   */
  EDataType getValueTypeObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BxmlFactory getBxmlFactory();

} //BxmlPackage
