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
  String eNS_URI = "platform:/resource/bxml-emf/xml/bxml.xsd";

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
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION_TYPE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION_TYPE__PATH = 1;

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
   * The feature id for the '<em><b>Pred</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__PRED = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__EXP_COMPARISON = 2;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__QUANTIFIED_PRED = 3;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__UNARY_PRED = 4;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__NARY_PRED = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE__SET = 6;

  /**
   * The number of structural features of the '<em>Assertions Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTIONS_TYPE_FEATURE_COUNT = 7;

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
   * The meta object id for the '{@link bxml.impl.AssignementSubstitutionTypeImpl <em>Assignement Substitution Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.AssignementSubstitutionTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getAssignementSubstitutionType()
   * @generated
   */
  int ASSIGNEMENT_SUBSTITUTION_TYPE = 6;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUBSTITUTION_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUBSTITUTION_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUBSTITUTION_TYPE__VALUES = 2;

  /**
   * The number of structural features of the '<em>Assignement Substitution Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUBSTITUTION_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Assignement Substitution Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNEMENT_SUBSTITUTION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.AttributesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getAttributesType()
   * @generated
   */
  int ATTRIBUTES_TYPE = 7;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES_TYPE__ANY = 0;

  /**
   * The number of structural features of the '<em>Attributes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Attributes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES_TYPE_OPERATION_COUNT = 0;

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
   * The meta object id for the '{@link bxml.impl.BinaryExpressionTypeImpl <em>Binary Expression Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BinaryExpressionTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBinaryExpressionType()
   * @generated
   */
  int BINARY_EXPRESSION_TYPE = 10;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__RECORD = 14;

  /**
   * The feature id for the '<em><b>Binary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__BINARY_EXP1 = 15;

  /**
   * The feature id for the '<em><b>Nary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__NARY_EXP1 = 16;

  /**
   * The feature id for the '<em><b>Boolean Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__BOOLEAN_LITERAL1 = 17;

  /**
   * The feature id for the '<em><b>Boolean Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__BOOLEAN_EXP1 = 18;

  /**
   * The feature id for the '<em><b>Empty Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__EMPTY_SET1 = 19;

  /**
   * The feature id for the '<em><b>Empty Seq1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__EMPTY_SEQ1 = 20;

  /**
   * The feature id for the '<em><b>Id1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__ID1 = 21;

  /**
   * The feature id for the '<em><b>Integer Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__INTEGER_LITERAL1 = 22;

  /**
   * The feature id for the '<em><b>Quantified Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__QUANTIFIED_EXP1 = 23;

  /**
   * The feature id for the '<em><b>Quantified Set1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__QUANTIFIED_SET1 = 24;

  /**
   * The feature id for the '<em><b>STRING Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__STRING_LITERAL1 = 25;

  /**
   * The feature id for the '<em><b>Unary Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__UNARY_EXP1 = 26;

  /**
   * The feature id for the '<em><b>Struct1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__STRUCT1 = 27;

  /**
   * The feature id for the '<em><b>Record1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__RECORD1 = 28;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE__OP = 29;

  /**
   * The number of structural features of the '<em>Binary Expression Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE_FEATURE_COUNT = 30;

  /**
   * The number of operations of the '<em>Binary Expression Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPRESSION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BinaryPredicateTypeImpl <em>Binary Predicate Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BinaryPredicateTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBinaryPredicateType()
   * @generated
   */
  int BINARY_PREDICATE_TYPE = 11;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Pred</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE__PRED = 1;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE__BINARY_PRED = 2;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE__EXP_COMPARISON = 3;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE__QUANTIFIED_PRED = 4;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE__UNARY_PRED = 5;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE__NARY_PRED = 6;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE__SET = 7;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE__OP = 8;

  /**
   * The number of structural features of the '<em>Binary Predicate Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE_FEATURE_COUNT = 9;

  /**
   * The number of operations of the '<em>Binary Predicate Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_PREDICATE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.BinarySubTypeImpl <em>Binary Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.BinarySubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getBinarySubType()
   * @generated
   */
  int BINARY_SUB_TYPE = 12;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Sub</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__SUB = 1;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__BLOC_SUB = 2;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__SKIP = 3;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__ASSERT_SUB = 4;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__IF_SUB = 5;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__BECOMES_SUCH_THAT = 6;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__ASSIGNEMENT_SUB = 7;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__SELECT = 8;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__CASE_SUB = 9;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__ANY_SUB = 10;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__LET_SUB = 11;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__BECOMES_IN = 12;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__VARIN = 13;

  /**
   * The feature id for the '<em><b>Binary Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__BINARY_SUB = 14;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__NARY_SUB = 15;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__OPERATION_CALL = 16;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__WHILE = 17;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE__OP = 18;

  /**
   * The number of structural features of the '<em>Binary Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE_FEATURE_COUNT = 19;

  /**
   * The number of operations of the '<em>Binary Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_SUB_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.CallParamatersTypeImpl <em>Call Paramaters Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.CallParamatersTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getCallParamatersType()
   * @generated
   */
  int CALL_PARAMATERS_TYPE = 13;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__EXP = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE__RECORD = 14;

  /**
   * The number of structural features of the '<em>Call Paramaters Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE_FEATURE_COUNT = 15;

  /**
   * The number of operations of the '<em>Call Paramaters Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_PARAMATERS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.CaseSubTypeImpl <em>Case Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.CaseSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getCaseSubType()
   * @generated
   */
  int CASE_SUB_TYPE = 14;

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
  int CHOICES_TYPE = 15;

  /**
   * The feature id for the '<em><b>Choice</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICES_TYPE__CHOICE = 0;

  /**
   * The number of structural features of the '<em>Choices Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICES_TYPE_FEATURE_COUNT = 1;

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
  int CHOICE_TYPE = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_TYPE__VALUE = 0;

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
   * The meta object id for the '{@link bxml.impl.ConcreteConstantsTypeImpl <em>Concrete Constants Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ConcreteConstantsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getConcreteConstantsType()
   * @generated
   */
  int CONCRETE_CONSTANTS_TYPE = 17;

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
  int CONCRETE_VARIABLES_TYPE = 18;

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
   * The meta object id for the '{@link bxml.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.DocumentRootImpl
   * @see bxml.impl.BxmlPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 19;

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
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ANY_SUB = 3;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BECOMES_IN = 4;

  /**
   * The feature id for the '<em><b>Binary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BINARY_SUB = 5;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CASE_SUB = 6;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LET_SUB = 7;

  /**
   * The feature id for the '<em><b>Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MACHINE = 8;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__NARY_EXP = 9;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__OPERATION = 10;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__QUANTIFIED_EXP = 11;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__QUANTIFIED_PRED = 12;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__QUANTIFIED_SET = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__RECORD = 14;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SELECT = 15;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__STRUCT = 16;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VARIN = 17;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WHILE = 18;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 19;

  /**
   * The number of operations of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.EnumeratedValuesTypeImpl <em>Enumerated Values Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.EnumeratedValuesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getEnumeratedValuesType()
   * @generated
   */
  int ENUMERATED_VALUES_TYPE = 20;

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
  int EXP_COMPARISON_TYPE = 21;

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
   * The meta object id for the '{@link bxml.impl.ExpTypeImpl <em>Exp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ExpTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getExpType()
   * @generated
   */
  int EXP_TYPE = 22;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE__RECORD = 14;

  /**
   * The number of structural features of the '<em>Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE_FEATURE_COUNT = 15;

  /**
   * The number of operations of the '<em>Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.IdentifierTypeImpl <em>Identifier Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.IdentifierTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getIdentifierType()
   * @generated
   */
  int IDENTIFIER_TYPE = 23;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TYPE__SUFFIX = 1;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TYPE__TYPREF = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TYPE__VALUE = 3;

  /**
   * The number of structural features of the '<em>Identifier Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TYPE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Identifier Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.IfSubTypeImpl <em>If Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.IfSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getIfSubType()
   * @generated
   */
  int IF_SUB_TYPE = 24;

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
   * The meta object id for the '{@link bxml.impl.InfoTypeTypeImpl <em>Info Type Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.InfoTypeTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getInfoTypeType()
   * @generated
   */
  int INFO_TYPE_TYPE = 25;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_TYPE_TYPE__ANY = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_TYPE_TYPE__ID = 1;

  /**
   * The number of structural features of the '<em>Info Type Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_TYPE_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Info Type Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFO_TYPE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.InputParametersTypeImpl <em>Input Parameters Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.InputParametersTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getInputParametersType()
   * @generated
   */
  int INPUT_PARAMETERS_TYPE = 26;

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
   * The meta object id for the '{@link bxml.impl.LETSubTypeImpl <em>LET Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.LETSubTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getLETSubType()
   * @generated
   */
  int LET_SUB_TYPE = 27;

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
   * The meta object id for the '{@link bxml.impl.LiteralTypeImpl <em>Literal Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.LiteralTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getLiteralType()
   * @generated
   */
  int LITERAL_TYPE = 28;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Typref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TYPE__TYPREF = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TYPE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Literal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Literal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.LocalOperationsTypeImpl <em>Local Operations Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.LocalOperationsTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getLocalOperationsType()
   * @generated
   */
  int LOCAL_OPERATIONS_TYPE = 29;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OPERATIONS_TYPE__OPERATION = 0;

  /**
   * The number of structural features of the '<em>Local Operations Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OPERATIONS_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Local Operations Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_OPERATIONS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.MachineType1Impl <em>Machine Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.MachineType1Impl
   * @see bxml.impl.BxmlPackageImpl#getMachineType1()
   * @generated
   */
  int MACHINE_TYPE1 = 30;

  /**
   * The feature id for the '<em><b>Abstraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__ABSTRACTION = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__CONSTRAINTS = 2;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__INCLUDES = 3;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__IMPORTS = 4;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__EXTENDS = 5;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__USES = 6;

  /**
   * The feature id for the '<em><b>Sees</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__SEES = 7;

  /**
   * The feature id for the '<em><b>Promotes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__PROMOTES = 8;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__VALUES = 9;

  /**
   * The feature id for the '<em><b>Sets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__SETS = 10;

  /**
   * The feature id for the '<em><b>Abstract Constants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__ABSTRACT_CONSTANTS = 11;

  /**
   * The feature id for the '<em><b>Concrete Constants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__CONCRETE_CONSTANTS = 12;

  /**
   * The feature id for the '<em><b>Abstract Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__ABSTRACT_VARIABLES = 13;

  /**
   * The feature id for the '<em><b>Concrete Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__CONCRETE_VARIABLES = 14;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__PROPERTIES = 15;

  /**
   * The feature id for the '<em><b>Invariant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__INVARIANT = 16;

  /**
   * The feature id for the '<em><b>Initialisation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__INITIALISATION = 17;

  /**
   * The feature id for the '<em><b>Assertions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__ASSERTIONS = 18;

  /**
   * The feature id for the '<em><b>Local Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__LOCAL_OPERATIONS = 19;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__OPERATIONS = 20;

  /**
   * The feature id for the '<em><b>Type Infos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__TYPE_INFOS = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__NAME = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1__TYPE = 23;

  /**
   * The number of structural features of the '<em>Machine Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1_FEATURE_COUNT = 24;

  /**
   * The number of operations of the '<em>Machine Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.NameTypeImpl <em>Name Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.NameTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getNameType()
   * @generated
   */
  int NAME_TYPE = 31;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TYPE__ID = 0;

  /**
   * The number of structural features of the '<em>Name Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TYPE_FEATURE_COUNT = 1;

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
  int NARY_EXP_TYPE = 32;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__EXP = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__RECORD = 14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE__OP = 15;

  /**
   * The number of structural features of the '<em>Nary Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Nary Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_EXP_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.NaryPredicateTypeImpl <em>Nary Predicate Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.NaryPredicateTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getNaryPredicateType()
   * @generated
   */
  int NARY_PREDICATE_TYPE = 33;

  /**
   * The feature id for the '<em><b>Pred</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE__PRED = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE__EXP_COMPARISON = 2;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE__QUANTIFIED_PRED = 3;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE__UNARY_PRED = 4;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE__NARY_PRED = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE__SET = 6;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE__OP = 7;

  /**
   * The number of structural features of the '<em>Nary Predicate Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE_FEATURE_COUNT = 8;

  /**
   * The number of operations of the '<em>Nary Predicate Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_PREDICATE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.NarySubstitutionTypeImpl <em>Nary Substitution Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.NarySubstitutionTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getNarySubstitutionType()
   * @generated
   */
  int NARY_SUBSTITUTION_TYPE = 34;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Sub</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__SUB = 1;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__BLOC_SUB = 2;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__SKIP = 3;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__ASSERT_SUB = 4;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__IF_SUB = 5;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__BECOMES_SUCH_THAT = 6;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__ASSIGNEMENT_SUB = 7;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__SELECT = 8;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__CASE_SUB = 9;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__ANY_SUB = 10;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__LET_SUB = 11;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__BECOMES_IN = 12;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__VARIN = 13;

  /**
   * The feature id for the '<em><b>Binary Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__BINARY_SUB = 14;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__NARY_SUB = 15;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__OPERATION_CALL = 16;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__WHILE = 17;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE__OP = 18;

  /**
   * The number of structural features of the '<em>Nary Substitution Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE_FEATURE_COUNT = 19;

  /**
   * The number of operations of the '<em>Nary Substitution Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NARY_SUBSTITUTION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.OperationCallTypeImpl <em>Operation Call Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.OperationCallTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getOperationCallType()
   * @generated
   */
  int OPERATION_CALL_TYPE = 35;

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
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_TYPE__OPERATION = 4;

  /**
   * The number of structural features of the '<em>Operation Call Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_TYPE_FEATURE_COUNT = 5;

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
  int OPERATIONS_TYPE = 36;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_TYPE__OPERATION = 0;

  /**
   * The number of structural features of the '<em>Operations Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATIONS_TYPE_FEATURE_COUNT = 1;

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
  int OPERATION_TYPE = 37;

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
  int OUTPUT_PARAMETERS_TYPE = 38;

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
   * The meta object id for the '{@link bxml.impl.ParametersTypeImpl <em>Parameters Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ParametersTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getParametersType()
   * @generated
   */
  int PARAMETERS_TYPE = 39;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__EXP = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE__RECORD = 14;

  /**
   * The number of structural features of the '<em>Parameters Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE_FEATURE_COUNT = 15;

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
  int PARAMETERS_TYPE1 = 40;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__ATTR = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1__ID = 1;

  /**
   * The number of structural features of the '<em>Parameters Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Parameters Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.PredicateTypeImpl <em>Predicate Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.PredicateTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getPredicateType()
   * @generated
   */
  int PREDICATE_TYPE = 41;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_TYPE__BINARY_PRED = 1;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_TYPE__EXP_COMPARISON = 2;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_TYPE__QUANTIFIED_PRED = 3;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_TYPE__UNARY_PRED = 4;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_TYPE__NARY_PRED = 5;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_TYPE__SET = 6;

  /**
   * The number of structural features of the '<em>Predicate Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Predicate Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.PromotesTypeImpl <em>Promotes Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.PromotesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getPromotesType()
   * @generated
   */
  int PROMOTES_TYPE = 42;

  /**
   * The feature id for the '<em><b>Promoted Operation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTES_TYPE__PROMOTED_OPERATION = 0;

  /**
   * The number of structural features of the '<em>Promotes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTES_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Promotes Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROMOTES_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.QuantifiedExpTypeImpl <em>Quantified Exp Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.QuantifiedExpTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getQuantifiedExpType()
   * @generated
   */
  int QUANTIFIED_EXP_TYPE = 43;

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
   * The number of structural features of the '<em>Quantified Exp Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXP_TYPE_FEATURE_COUNT = 5;

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
  int QUANTIFIED_PRED_TYPE = 44;

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
  int QUANTIFIED_SET_TYPE = 45;

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
   * The number of structural features of the '<em>Quantified Set Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_SET_TYPE_FEATURE_COUNT = 3;

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
  int RECORD_ITEM_TYPE = 46;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__BINARY_EXP = 0;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__NARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__BOOLEAN_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__BOOLEAN_EXP = 3;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__EMPTY_SET = 4;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__EMPTY_SEQ = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__ID = 6;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__INTEGER_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__QUANTIFIED_EXP = 8;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__QUANTIFIED_SET = 9;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__STRING_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__UNARY_EXP = 11;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__STRUCT = 12;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__RECORD = 13;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE__LABEL = 14;

  /**
   * The number of structural features of the '<em>Record Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_ITEM_TYPE_FEATURE_COUNT = 15;

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
  int RECORD_TYPE = 47;

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
   * The number of structural features of the '<em>Record Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_FEATURE_COUNT = 2;

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
  int REFERENCED_MACHINE_TYPE = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE__INSTANCE = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE__PATH = 3;

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
   * The meta object id for the '{@link bxml.impl.ReferencedMachineType1Impl <em>Referenced Machine Type1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ReferencedMachineType1Impl
   * @see bxml.impl.BxmlPackageImpl#getReferencedMachineType1()
   * @generated
   */
  int REFERENCED_MACHINE_TYPE1 = 49;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE1__ATTR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE1__NAME = 1;

  /**
   * The feature id for the '<em><b>Rename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE1__RENAME = 2;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE1__PATH = 3;

  /**
   * The number of structural features of the '<em>Referenced Machine Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE1_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Referenced Machine Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE1_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ReferencedMachineType2Impl <em>Referenced Machine Type2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ReferencedMachineType2Impl
   * @see bxml.impl.BxmlPackageImpl#getReferencedMachineType2()
   * @generated
   */
  int REFERENCED_MACHINE_TYPE2 = 50;

  /**
   * The feature id for the '<em><b>Referenced Machine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE2__REFERENCED_MACHINE = 0;

  /**
   * The number of structural features of the '<em>Referenced Machine Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE2_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Referenced Machine Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCED_MACHINE_TYPE2_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.RefinesTypeImpl <em>Refines Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.RefinesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getRefinesType()
   * @generated
   */
  int REFINES_TYPE = 51;

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
  int SEES_TYPE = 52;

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
  int SELECT_TYPE = 53;

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
  int SETS_TYPE = 54;

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
  int SET_TYPE = 55;

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
   * The meta object id for the '{@link bxml.impl.StringLiteralTypeImpl <em>String Literal Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.StringLiteralTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getStringLiteralType()
   * @generated
   */
  int STRING_LITERAL_TYPE = 56;

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
   * The number of structural features of the '<em>String Literal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_TYPE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>String Literal Type</em>' class.
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
  int STRUCT_TYPE = 57;

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
   * The number of structural features of the '<em>Struct Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Struct Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.SubstitutionTypeImpl <em>Substitution Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.SubstitutionTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getSubstitutionType()
   * @generated
   */
  int SUBSTITUTION_TYPE = 58;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Bloc Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__BLOC_SUB = 1;

  /**
   * The feature id for the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__SKIP = 2;

  /**
   * The feature id for the '<em><b>Assert Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__ASSERT_SUB = 3;

  /**
   * The feature id for the '<em><b>If Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__IF_SUB = 4;

  /**
   * The feature id for the '<em><b>Becomes Such That</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__BECOMES_SUCH_THAT = 5;

  /**
   * The feature id for the '<em><b>Assignement Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__ASSIGNEMENT_SUB = 6;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__SELECT = 7;

  /**
   * The feature id for the '<em><b>Case Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__CASE_SUB = 8;

  /**
   * The feature id for the '<em><b>ANY Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__ANY_SUB = 9;

  /**
   * The feature id for the '<em><b>LET Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__LET_SUB = 10;

  /**
   * The feature id for the '<em><b>Becomes In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__BECOMES_IN = 11;

  /**
   * The feature id for the '<em><b>VARIN</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__VARIN = 12;

  /**
   * The feature id for the '<em><b>Binary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__BINARY_SUB = 13;

  /**
   * The feature id for the '<em><b>Nary Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__NARY_SUB = 14;

  /**
   * The feature id for the '<em><b>Operation Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__OPERATION_CALL = 15;

  /**
   * The feature id for the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE__WHILE = 16;

  /**
   * The number of structural features of the '<em>Substitution Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE_FEATURE_COUNT = 17;

  /**
   * The number of operations of the '<em>Substitution Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.TerminalTypeImpl <em>Terminal Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.TerminalTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getTerminalType()
   * @generated
   */
  int TERMINAL_TYPE = 59;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_TYPE__ATTR = 0;

  /**
   * The number of structural features of the '<em>Terminal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Terminal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.TypeInfosTypeImpl <em>Type Infos Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.TypeInfosTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getTypeInfosType()
   * @generated
   */
  int TYPE_INFOS_TYPE = 60;

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
   * The meta object id for the '{@link bxml.impl.UnaryExpressionTypeImpl <em>Unary Expression Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.UnaryExpressionTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getUnaryExpressionType()
   * @generated
   */
  int UNARY_EXPRESSION_TYPE = 61;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__ATTR = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__RECORD = 14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE__OP = 15;

  /**
   * The number of structural features of the '<em>Unary Expression Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE_FEATURE_COUNT = 16;

  /**
   * The number of operations of the '<em>Unary Expression Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.UnaryPredicateTypeImpl <em>Unary Predicate Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.UnaryPredicateTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getUnaryPredicateType()
   * @generated
   */
  int UNARY_PREDICATE_TYPE = 62;

  /**
   * The feature id for the '<em><b>Binary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PREDICATE_TYPE__BINARY_PRED = 0;

  /**
   * The feature id for the '<em><b>Exp Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PREDICATE_TYPE__EXP_COMPARISON = 1;

  /**
   * The feature id for the '<em><b>Quantified Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PREDICATE_TYPE__QUANTIFIED_PRED = 2;

  /**
   * The feature id for the '<em><b>Unary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PREDICATE_TYPE__UNARY_PRED = 3;

  /**
   * The feature id for the '<em><b>Nary Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PREDICATE_TYPE__NARY_PRED = 4;

  /**
   * The feature id for the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PREDICATE_TYPE__SET = 5;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PREDICATE_TYPE__OP = 6;

  /**
   * The number of structural features of the '<em>Unary Predicate Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PREDICATE_TYPE_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Unary Predicate Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_PREDICATE_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.ValuationTypeImpl <em>Valuation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.ValuationTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getValuationType()
   * @generated
   */
  int VALUATION_TYPE = 63;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__BINARY_EXP = 0;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__NARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__BOOLEAN_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__BOOLEAN_EXP = 3;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__EMPTY_SET = 4;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__EMPTY_SEQ = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__ID = 6;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__INTEGER_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__QUANTIFIED_EXP = 8;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__QUANTIFIED_SET = 9;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__STRING_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__UNARY_EXP = 11;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__STRUCT = 12;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__RECORD = 13;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE__IDENT = 14;

  /**
   * The number of structural features of the '<em>Valuation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE_FEATURE_COUNT = 15;

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
  int VALUATION_TYPE1 = 64;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__BINARY_EXP = 0;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__NARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__BOOLEAN_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__BOOLEAN_EXP = 3;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__EMPTY_SET = 4;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__EMPTY_SEQ = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__ID = 6;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__INTEGER_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__QUANTIFIED_EXP = 8;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__QUANTIFIED_SET = 9;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__STRING_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__UNARY_EXP = 11;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__STRUCT = 12;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__RECORD = 13;

  /**
   * The feature id for the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1__IDENT = 14;

  /**
   * The number of structural features of the '<em>Valuation Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUATION_TYPE1_FEATURE_COUNT = 15;

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
  int VALUES_TYPE = 65;

  /**
   * The feature id for the '<em><b>Valuation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE__VALUATION = 0;

  /**
   * The number of structural features of the '<em>Values Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE_FEATURE_COUNT = 1;

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
  int VALUES_TYPE1 = 66;

  /**
   * The feature id for the '<em><b>Valuation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE1__VALUATION = 0;

  /**
   * The number of structural features of the '<em>Values Type1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE1_FEATURE_COUNT = 1;

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
  int VALUES_TYPE2 = 67;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__EXP = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2__RECORD = 14;

  /**
   * The number of structural features of the '<em>Values Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2_FEATURE_COUNT = 15;

  /**
   * The number of operations of the '<em>Values Type2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_TYPE2_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bxml.impl.VariablesTypeImpl <em>Variables Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.VariablesTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getVariablesType()
   * @generated
   */
  int VARIABLES_TYPE = 68;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__EXP = 0;

  /**
   * The feature id for the '<em><b>Binary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__BINARY_EXP = 1;

  /**
   * The feature id for the '<em><b>Nary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__NARY_EXP = 2;

  /**
   * The feature id for the '<em><b>Boolean Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__BOOLEAN_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Boolean Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__BOOLEAN_EXP = 4;

  /**
   * The feature id for the '<em><b>Empty Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__EMPTY_SET = 5;

  /**
   * The feature id for the '<em><b>Empty Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__EMPTY_SEQ = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__ID = 7;

  /**
   * The feature id for the '<em><b>Integer Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__INTEGER_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Quantified Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__QUANTIFIED_EXP = 9;

  /**
   * The feature id for the '<em><b>Quantified Set</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__QUANTIFIED_SET = 10;

  /**
   * The feature id for the '<em><b>STRING Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__STRING_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Unary Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__UNARY_EXP = 12;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__STRUCT = 13;

  /**
   * The feature id for the '<em><b>Record</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE__RECORD = 14;

  /**
   * The number of structural features of the '<em>Variables Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_TYPE_FEATURE_COUNT = 15;

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
  int VARIABLES_TYPE1 = 69;

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
   * The meta object id for the '{@link bxml.impl.VARINTypeImpl <em>VARIN Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.impl.VARINTypeImpl
   * @see bxml.impl.BxmlPackageImpl#getVARINType()
   * @generated
   */
  int VARIN_TYPE = 70;

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
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIN_TYPE__OP = 3;

  /**
   * The number of structural features of the '<em>VARIN Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIN_TYPE_FEATURE_COUNT = 4;

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
  int WHEN_CLAUSES_TYPE = 71;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSES_TYPE__WHEN = 0;

  /**
   * The number of structural features of the '<em>When Clauses Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSES_TYPE_FEATURE_COUNT = 1;

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
  int WHEN_TYPE = 72;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TYPE__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TYPE__THEN = 1;

  /**
   * The number of structural features of the '<em>When Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_TYPE_FEATURE_COUNT = 2;

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
  int WHILE_TYPE = 73;

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
   * The meta object id for the '{@link bxml.BinaryExpOp <em>Binary Exp Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.BinaryExpOp
   * @see bxml.impl.BxmlPackageImpl#getBinaryExpOp()
   * @generated
   */
  int BINARY_EXP_OP = 74;

  /**
   * The meta object id for the '{@link bxml.BinaryPredOp <em>Binary Pred Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.BinaryPredOp
   * @see bxml.impl.BxmlPackageImpl#getBinaryPredOp()
   * @generated
   */
  int BINARY_PRED_OP = 75;

  /**
   * The meta object id for the '{@link bxml.BinarySubOp <em>Binary Sub Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.BinarySubOp
   * @see bxml.impl.BxmlPackageImpl#getBinarySubOp()
   * @generated
   */
  int BINARY_SUB_OP = 76;

  /**
   * The meta object id for the '{@link bxml.ComparisonOp <em>Comparison Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.ComparisonOp
   * @see bxml.impl.BxmlPackageImpl#getComparisonOp()
   * @generated
   */
  int COMPARISON_OP = 77;

  /**
   * The meta object id for the '{@link bxml.MachineType <em>Machine Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.MachineType
   * @see bxml.impl.BxmlPackageImpl#getMachineType()
   * @generated
   */
  int MACHINE_TYPE = 78;

  /**
   * The meta object id for the '{@link bxml.NaryExpOp <em>Nary Exp Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.NaryExpOp
   * @see bxml.impl.BxmlPackageImpl#getNaryExpOp()
   * @generated
   */
  int NARY_EXP_OP = 79;

  /**
   * The meta object id for the '{@link bxml.NaryOp <em>Nary Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.NaryOp
   * @see bxml.impl.BxmlPackageImpl#getNaryOp()
   * @generated
   */
  int NARY_OP = 80;

  /**
   * The meta object id for the '{@link bxml.OpVarSub <em>Op Var Sub</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpVarSub
   * @see bxml.impl.BxmlPackageImpl#getOpVarSub()
   * @generated
   */
  int OP_VAR_SUB = 81;

  /**
   * The meta object id for the '{@link bxml.QuantifiedExpOp <em>Quantified Exp Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.QuantifiedExpOp
   * @see bxml.impl.BxmlPackageImpl#getQuantifiedExpOp()
   * @generated
   */
  int QUANTIFIED_EXP_OP = 82;

  /**
   * The meta object id for the '{@link bxml.QuantifiedPredOp <em>Quantified Pred Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.QuantifiedPredOp
   * @see bxml.impl.BxmlPackageImpl#getQuantifiedPredOp()
   * @generated
   */
  int QUANTIFIED_PRED_OP = 83;

  /**
   * The meta object id for the '{@link bxml.UnaryExpOp <em>Unary Exp Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.UnaryExpOp
   * @see bxml.impl.BxmlPackageImpl#getUnaryExpOp()
   * @generated
   */
  int UNARY_EXP_OP = 84;

  /**
   * The meta object id for the '{@link bxml.UnaryPredOp <em>Unary Pred Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.UnaryPredOp
   * @see bxml.impl.BxmlPackageImpl#getUnaryPredOp()
   * @generated
   */
  int UNARY_PRED_OP = 85;

  /**
   * The meta object id for the '<em>Binary Exp Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.BinaryExpOp
   * @see bxml.impl.BxmlPackageImpl#getBinaryExpOpObject()
   * @generated
   */
  int BINARY_EXP_OP_OBJECT = 86;

  /**
   * The meta object id for the '<em>Binary Pred Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.BinaryPredOp
   * @see bxml.impl.BxmlPackageImpl#getBinaryPredOpObject()
   * @generated
   */
  int BINARY_PRED_OP_OBJECT = 87;

  /**
   * The meta object id for the '<em>Binary Sub Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.BinarySubOp
   * @see bxml.impl.BxmlPackageImpl#getBinarySubOpObject()
   * @generated
   */
  int BINARY_SUB_OP_OBJECT = 88;

  /**
   * The meta object id for the '<em>Comparison Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.ComparisonOp
   * @see bxml.impl.BxmlPackageImpl#getComparisonOpObject()
   * @generated
   */
  int COMPARISON_OP_OBJECT = 89;

  /**
   * The meta object id for the '<em>Machine Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.MachineType
   * @see bxml.impl.BxmlPackageImpl#getMachineTypeObject()
   * @generated
   */
  int MACHINE_TYPE_OBJECT = 90;

  /**
   * The meta object id for the '<em>Nary Exp Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.NaryExpOp
   * @see bxml.impl.BxmlPackageImpl#getNaryExpOpObject()
   * @generated
   */
  int NARY_EXP_OP_OBJECT = 91;

  /**
   * The meta object id for the '<em>Nary Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.NaryOp
   * @see bxml.impl.BxmlPackageImpl#getNaryOpObject()
   * @generated
   */
  int NARY_OP_OBJECT = 92;

  /**
   * The meta object id for the '<em>Op Var Sub Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.OpVarSub
   * @see bxml.impl.BxmlPackageImpl#getOpVarSubObject()
   * @generated
   */
  int OP_VAR_SUB_OBJECT = 93;

  /**
   * The meta object id for the '<em>Quantified Exp Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.QuantifiedExpOp
   * @see bxml.impl.BxmlPackageImpl#getQuantifiedExpOpObject()
   * @generated
   */
  int QUANTIFIED_EXP_OP_OBJECT = 94;

  /**
   * The meta object id for the '<em>Quantified Pred Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.QuantifiedPredOp
   * @see bxml.impl.BxmlPackageImpl#getQuantifiedPredOpObject()
   * @generated
   */
  int QUANTIFIED_PRED_OP_OBJECT = 95;

  /**
   * The meta object id for the '<em>Unary Exp Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.UnaryExpOp
   * @see bxml.impl.BxmlPackageImpl#getUnaryExpOpObject()
   * @generated
   */
  int UNARY_EXP_OP_OBJECT = 96;

  /**
   * The meta object id for the '<em>Unary Pred Op Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bxml.UnaryPredOp
   * @see bxml.impl.BxmlPackageImpl#getUnaryPredOpObject()
   * @generated
   */
  int UNARY_PRED_OP_OBJECT = 97;


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
   * Returns the meta object for the attribute '{@link bxml.AbstractionType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bxml.AbstractionType#getValue()
   * @see #getAbstractionType()
   * @generated
   */
  EAttribute getAbstractionType_Value();

  /**
   * Returns the meta object for the attribute '{@link bxml.AbstractionType#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see bxml.AbstractionType#getPath()
   * @see #getAbstractionType()
   * @generated
   */
  EAttribute getAbstractionType_Path();

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
   * Returns the meta object for the attribute list '{@link bxml.AssertionsType#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pred</em>'.
   * @see bxml.AssertionsType#getPred()
   * @see #getAssertionsType()
   * @generated
   */
  EAttribute getAssertionsType_Pred();

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
   * Returns the meta object for class '{@link bxml.AssignementSubstitutionType <em>Assignement Substitution Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignement Substitution Type</em>'.
   * @see bxml.AssignementSubstitutionType
   * @generated
   */
  EClass getAssignementSubstitutionType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssignementSubstitutionType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.AssignementSubstitutionType#getAttr()
   * @see #getAssignementSubstitutionType()
   * @generated
   */
  EReference getAssignementSubstitutionType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssignementSubstitutionType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables</em>'.
   * @see bxml.AssignementSubstitutionType#getVariables()
   * @see #getAssignementSubstitutionType()
   * @generated
   */
  EReference getAssignementSubstitutionType_Variables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.AssignementSubstitutionType#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see bxml.AssignementSubstitutionType#getValues()
   * @see #getAssignementSubstitutionType()
   * @generated
   */
  EReference getAssignementSubstitutionType_Values();

  /**
   * Returns the meta object for class '{@link bxml.AttributesType <em>Attributes Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributes Type</em>'.
   * @see bxml.AttributesType
   * @generated
   */
  EClass getAttributesType();

  /**
   * Returns the meta object for the attribute list '{@link bxml.AttributesType#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any</em>'.
   * @see bxml.AttributesType#getAny()
   * @see #getAttributesType()
   * @generated
   */
  EAttribute getAttributesType_Any();

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
   * Returns the meta object for class '{@link bxml.BinaryExpressionType <em>Binary Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expression Type</em>'.
   * @see bxml.BinaryExpressionType
   * @generated
   */
  EClass getBinaryExpressionType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BinaryExpressionType#getAttr()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.BinaryExpressionType#getBinaryExp()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.BinaryExpressionType#getNaryExp()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.BinaryExpressionType#getBooleanLiteral()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.BinaryExpressionType#getBooleanExp()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.BinaryExpressionType#getEmptySet()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.BinaryExpressionType#getEmptySeq()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.BinaryExpressionType#getId()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.BinaryExpressionType#getIntegerLiteral()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.BinaryExpressionType#getQuantifiedExp()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.BinaryExpressionType#getQuantifiedSet()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.BinaryExpressionType#getSTRINGLiteral()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.BinaryExpressionType#getUnaryExp()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.BinaryExpressionType#getStruct()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.BinaryExpressionType#getRecord()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_Record();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getBinaryExp1 <em>Binary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp1</em>'.
   * @see bxml.BinaryExpressionType#getBinaryExp1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_BinaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getNaryExp1 <em>Nary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp1</em>'.
   * @see bxml.BinaryExpressionType#getNaryExp1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_NaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getBooleanLiteral1 <em>Boolean Literal1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal1</em>'.
   * @see bxml.BinaryExpressionType#getBooleanLiteral1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_BooleanLiteral1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getBooleanExp1 <em>Boolean Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp1</em>'.
   * @see bxml.BinaryExpressionType#getBooleanExp1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_BooleanExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getEmptySet1 <em>Empty Set1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set1</em>'.
   * @see bxml.BinaryExpressionType#getEmptySet1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_EmptySet1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getEmptySeq1 <em>Empty Seq1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq1</em>'.
   * @see bxml.BinaryExpressionType#getEmptySeq1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_EmptySeq1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getId1 <em>Id1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id1</em>'.
   * @see bxml.BinaryExpressionType#getId1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_Id1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getIntegerLiteral1 <em>Integer Literal1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal1</em>'.
   * @see bxml.BinaryExpressionType#getIntegerLiteral1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_IntegerLiteral1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getQuantifiedExp1 <em>Quantified Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp1</em>'.
   * @see bxml.BinaryExpressionType#getQuantifiedExp1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_QuantifiedExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getQuantifiedSet1 <em>Quantified Set1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set1</em>'.
   * @see bxml.BinaryExpressionType#getQuantifiedSet1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_QuantifiedSet1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getSTRINGLiteral1 <em>STRING Literal1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal1</em>'.
   * @see bxml.BinaryExpressionType#getSTRINGLiteral1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_STRINGLiteral1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getUnaryExp1 <em>Unary Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp1</em>'.
   * @see bxml.BinaryExpressionType#getUnaryExp1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_UnaryExp1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getStruct1 <em>Struct1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct1</em>'.
   * @see bxml.BinaryExpressionType#getStruct1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_Struct1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryExpressionType#getRecord1 <em>Record1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record1</em>'.
   * @see bxml.BinaryExpressionType#getRecord1()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EReference getBinaryExpressionType_Record1();

  /**
   * Returns the meta object for the attribute '{@link bxml.BinaryExpressionType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.BinaryExpressionType#getOp()
   * @see #getBinaryExpressionType()
   * @generated
   */
  EAttribute getBinaryExpressionType_Op();

  /**
   * Returns the meta object for class '{@link bxml.BinaryPredicateType <em>Binary Predicate Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Predicate Type</em>'.
   * @see bxml.BinaryPredicateType
   * @generated
   */
  EClass getBinaryPredicateType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinaryPredicateType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BinaryPredicateType#getAttr()
   * @see #getBinaryPredicateType()
   * @generated
   */
  EReference getBinaryPredicateType_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.BinaryPredicateType#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pred</em>'.
   * @see bxml.BinaryPredicateType#getPred()
   * @see #getBinaryPredicateType()
   * @generated
   */
  EAttribute getBinaryPredicateType_Pred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinaryPredicateType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Pred</em>'.
   * @see bxml.BinaryPredicateType#getBinaryPred()
   * @see #getBinaryPredicateType()
   * @generated
   */
  EReference getBinaryPredicateType_BinaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinaryPredicateType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Comparison</em>'.
   * @see bxml.BinaryPredicateType#getExpComparison()
   * @see #getBinaryPredicateType()
   * @generated
   */
  EReference getBinaryPredicateType_ExpComparison();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinaryPredicateType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Pred</em>'.
   * @see bxml.BinaryPredicateType#getQuantifiedPred()
   * @see #getBinaryPredicateType()
   * @generated
   */
  EReference getBinaryPredicateType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinaryPredicateType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Pred</em>'.
   * @see bxml.BinaryPredicateType#getUnaryPred()
   * @see #getBinaryPredicateType()
   * @generated
   */
  EReference getBinaryPredicateType_UnaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinaryPredicateType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Pred</em>'.
   * @see bxml.BinaryPredicateType#getNaryPred()
   * @see #getBinaryPredicateType()
   * @generated
   */
  EReference getBinaryPredicateType_NaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinaryPredicateType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Set</em>'.
   * @see bxml.BinaryPredicateType#getSet()
   * @see #getBinaryPredicateType()
   * @generated
   */
  EReference getBinaryPredicateType_Set();

  /**
   * Returns the meta object for the attribute '{@link bxml.BinaryPredicateType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.BinaryPredicateType#getOp()
   * @see #getBinaryPredicateType()
   * @generated
   */
  EAttribute getBinaryPredicateType_Op();

  /**
   * Returns the meta object for class '{@link bxml.BinarySubType <em>Binary Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Sub Type</em>'.
   * @see bxml.BinarySubType
   * @generated
   */
  EClass getBinarySubType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.BinarySubType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.BinarySubType#getAttr()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.BinarySubType#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sub</em>'.
   * @see bxml.BinarySubType#getSub()
   * @see #getBinarySubType()
   * @generated
   */
  EAttribute getBinarySubType_Sub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bloc Sub</em>'.
   * @see bxml.BinarySubType#getBlocSub()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_BlocSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Skip</em>'.
   * @see bxml.BinarySubType#getSkip()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_Skip();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assert Sub</em>'.
   * @see bxml.BinarySubType#getAssertSub()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_AssertSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>If Sub</em>'.
   * @see bxml.BinarySubType#getIfSub()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_IfSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Becomes Such That</em>'.
   * @see bxml.BinarySubType#getBecomesSuchThat()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignement Sub</em>'.
   * @see bxml.BinarySubType#getAssignementSub()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_AssignementSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Select</em>'.
   * @see bxml.BinarySubType#getSelect()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_Select();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Sub</em>'.
   * @see bxml.BinarySubType#getCaseSub()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_CaseSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>ANY Sub</em>'.
   * @see bxml.BinarySubType#getANYSub()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_ANYSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>LET Sub</em>'.
   * @see bxml.BinarySubType#getLETSub()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_LETSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Becomes In</em>'.
   * @see bxml.BinarySubType#getBecomesIn()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_BecomesIn();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>VARIN</em>'.
   * @see bxml.BinarySubType#getVARIN()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_VARIN();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getBinarySub <em>Binary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Sub</em>'.
   * @see bxml.BinarySubType#getBinarySub()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_BinarySub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Sub</em>'.
   * @see bxml.BinarySubType#getNarySub()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_NarySub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation Call</em>'.
   * @see bxml.BinarySubType#getOperationCall()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_OperationCall();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.BinarySubType#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>While</em>'.
   * @see bxml.BinarySubType#getWhile()
   * @see #getBinarySubType()
   * @generated
   */
  EReference getBinarySubType_While();

  /**
   * Returns the meta object for the attribute '{@link bxml.BinarySubType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.BinarySubType#getOp()
   * @see #getBinarySubType()
   * @generated
   */
  EAttribute getBinarySubType_Op();

  /**
   * Returns the meta object for class '{@link bxml.CallParamatersType <em>Call Paramaters Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Paramaters Type</em>'.
   * @see bxml.CallParamatersType
   * @generated
   */
  EClass getCallParamatersType();

  /**
   * Returns the meta object for the attribute list '{@link bxml.CallParamatersType#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exp</em>'.
   * @see bxml.CallParamatersType#getExp()
   * @see #getCallParamatersType()
   * @generated
   */
  EAttribute getCallParamatersType_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Exp</em>'.
   * @see bxml.CallParamatersType#getBinaryExp()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_BinaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Exp</em>'.
   * @see bxml.CallParamatersType#getNaryExp()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_NaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Literal</em>'.
   * @see bxml.CallParamatersType#getBooleanLiteral()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Exp</em>'.
   * @see bxml.CallParamatersType#getBooleanExp()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_BooleanExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Set</em>'.
   * @see bxml.CallParamatersType#getEmptySet()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_EmptySet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Seq</em>'.
   * @see bxml.CallParamatersType#getEmptySeq()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_EmptySeq();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see bxml.CallParamatersType#getId()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_Id();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integer Literal</em>'.
   * @see bxml.CallParamatersType#getIntegerLiteral()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Exp</em>'.
   * @see bxml.CallParamatersType#getQuantifiedExp()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Set</em>'.
   * @see bxml.CallParamatersType#getQuantifiedSet()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>STRING Literal</em>'.
   * @see bxml.CallParamatersType#getSTRINGLiteral()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Exp</em>'.
   * @see bxml.CallParamatersType#getUnaryExp()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_UnaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct</em>'.
   * @see bxml.CallParamatersType#getStruct()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.CallParamatersType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record</em>'.
   * @see bxml.CallParamatersType#getRecord()
   * @see #getCallParamatersType()
   * @generated
   */
  EReference getCallParamatersType_Record();

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
   * Returns the meta object for the containment reference list '{@link bxml.ChoiceType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see bxml.ChoiceType#getValue()
   * @see #getChoiceType()
   * @generated
   */
  EReference getChoiceType_Value();

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
   * Returns the meta object for the containment reference '{@link bxml.DocumentRoot#getBinarySub <em>Binary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Sub</em>'.
   * @see bxml.DocumentRoot#getBinarySub()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_BinarySub();

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
   * Returns the meta object for class '{@link bxml.ExpType <em>Exp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp Type</em>'.
   * @see bxml.ExpType
   * @generated
   */
  EClass getExpType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ExpType#getAttr()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.ExpType#getBinaryExp()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.ExpType#getNaryExp()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.ExpType#getBooleanLiteral()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.ExpType#getBooleanExp()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.ExpType#getEmptySet()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.ExpType#getEmptySeq()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.ExpType#getId()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.ExpType#getIntegerLiteral()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.ExpType#getQuantifiedExp()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.ExpType#getQuantifiedSet()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.ExpType#getSTRINGLiteral()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.ExpType#getUnaryExp()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.ExpType#getStruct()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ExpType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.ExpType#getRecord()
   * @see #getExpType()
   * @generated
   */
  EReference getExpType_Record();

  /**
   * Returns the meta object for class '{@link bxml.IdentifierType <em>Identifier Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier Type</em>'.
   * @see bxml.IdentifierType
   * @generated
   */
  EClass getIdentifierType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.IdentifierType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.IdentifierType#getAttr()
   * @see #getIdentifierType()
   * @generated
   */
  EReference getIdentifierType_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.IdentifierType#getSuffix <em>Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Suffix</em>'.
   * @see bxml.IdentifierType#getSuffix()
   * @see #getIdentifierType()
   * @generated
   */
  EAttribute getIdentifierType_Suffix();

  /**
   * Returns the meta object for the attribute '{@link bxml.IdentifierType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.IdentifierType#getTypref()
   * @see #getIdentifierType()
   * @generated
   */
  EAttribute getIdentifierType_Typref();

  /**
   * Returns the meta object for the attribute '{@link bxml.IdentifierType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bxml.IdentifierType#getValue()
   * @see #getIdentifierType()
   * @generated
   */
  EAttribute getIdentifierType_Value();

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
   * Returns the meta object for class '{@link bxml.InfoTypeType <em>Info Type Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Info Type Type</em>'.
   * @see bxml.InfoTypeType
   * @generated
   */
  EClass getInfoTypeType();

  /**
   * Returns the meta object for the attribute list '{@link bxml.InfoTypeType#getAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Any</em>'.
   * @see bxml.InfoTypeType#getAny()
   * @see #getInfoTypeType()
   * @generated
   */
  EAttribute getInfoTypeType_Any();

  /**
   * Returns the meta object for the attribute '{@link bxml.InfoTypeType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see bxml.InfoTypeType#getId()
   * @see #getInfoTypeType()
   * @generated
   */
  EAttribute getInfoTypeType_Id();

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
   * Returns the meta object for class '{@link bxml.LiteralType <em>Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Type</em>'.
   * @see bxml.LiteralType
   * @generated
   */
  EClass getLiteralType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.LiteralType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.LiteralType#getAttr()
   * @see #getLiteralType()
   * @generated
   */
  EReference getLiteralType_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.LiteralType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.LiteralType#getTypref()
   * @see #getLiteralType()
   * @generated
   */
  EAttribute getLiteralType_Typref();

  /**
   * Returns the meta object for the attribute '{@link bxml.LiteralType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bxml.LiteralType#getValue()
   * @see #getLiteralType()
   * @generated
   */
  EAttribute getLiteralType_Value();

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
   * Returns the meta object for class '{@link bxml.MachineType1 <em>Machine Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Type1</em>'.
   * @see bxml.MachineType1
   * @generated
   */
  EClass getMachineType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getAbstraction <em>Abstraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstraction</em>'.
   * @see bxml.MachineType1#getAbstraction()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Abstraction();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see bxml.MachineType1#getParameters()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraints</em>'.
   * @see bxml.MachineType1#getConstraints()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Constraints();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Includes</em>'.
   * @see bxml.MachineType1#getIncludes()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Includes();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports</em>'.
   * @see bxml.MachineType1#getImports()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Imports();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see bxml.MachineType1#getExtends()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Extends();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getUses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uses</em>'.
   * @see bxml.MachineType1#getUses()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Uses();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getSees <em>Sees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sees</em>'.
   * @see bxml.MachineType1#getSees()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Sees();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getPromotes <em>Promotes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Promotes</em>'.
   * @see bxml.MachineType1#getPromotes()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Promotes();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values</em>'.
   * @see bxml.MachineType1#getValues()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Values();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getSets <em>Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sets</em>'.
   * @see bxml.MachineType1#getSets()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Sets();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getAbstractConstants <em>Abstract Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract Constants</em>'.
   * @see bxml.MachineType1#getAbstractConstants()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_AbstractConstants();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getConcreteConstants <em>Concrete Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concrete Constants</em>'.
   * @see bxml.MachineType1#getConcreteConstants()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_ConcreteConstants();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getAbstractVariables <em>Abstract Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract Variables</em>'.
   * @see bxml.MachineType1#getAbstractVariables()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_AbstractVariables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getConcreteVariables <em>Concrete Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concrete Variables</em>'.
   * @see bxml.MachineType1#getConcreteVariables()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_ConcreteVariables();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see bxml.MachineType1#getProperties()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Properties();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getInvariant <em>Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invariant</em>'.
   * @see bxml.MachineType1#getInvariant()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Invariant();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getInitialisation <em>Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialisation</em>'.
   * @see bxml.MachineType1#getInitialisation()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Initialisation();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assertions</em>'.
   * @see bxml.MachineType1#getAssertions()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Assertions();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getLocalOperations <em>Local Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local Operations</em>'.
   * @see bxml.MachineType1#getLocalOperations()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_LocalOperations();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operations</em>'.
   * @see bxml.MachineType1#getOperations()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_Operations();

  /**
   * Returns the meta object for the containment reference '{@link bxml.MachineType1#getTypeInfos <em>Type Infos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Infos</em>'.
   * @see bxml.MachineType1#getTypeInfos()
   * @see #getMachineType1()
   * @generated
   */
  EReference getMachineType1_TypeInfos();

  /**
   * Returns the meta object for the attribute '{@link bxml.MachineType1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bxml.MachineType1#getName()
   * @see #getMachineType1()
   * @generated
   */
  EAttribute getMachineType1_Name();

  /**
   * Returns the meta object for the attribute '{@link bxml.MachineType1#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see bxml.MachineType1#getType()
   * @see #getMachineType1()
   * @generated
   */
  EAttribute getMachineType1_Type();

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
   * Returns the meta object for the containment reference list '{@link bxml.NameType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
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
   * Returns the meta object for the attribute list '{@link bxml.NaryExpType#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exp</em>'.
   * @see bxml.NaryExpType#getExp()
   * @see #getNaryExpType()
   * @generated
   */
  EAttribute getNaryExpType_Exp();

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
   * Returns the meta object for class '{@link bxml.NaryPredicateType <em>Nary Predicate Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nary Predicate Type</em>'.
   * @see bxml.NaryPredicateType
   * @generated
   */
  EClass getNaryPredicateType();

  /**
   * Returns the meta object for the attribute list '{@link bxml.NaryPredicateType#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pred</em>'.
   * @see bxml.NaryPredicateType#getPred()
   * @see #getNaryPredicateType()
   * @generated
   */
  EAttribute getNaryPredicateType_Pred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredicateType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Pred</em>'.
   * @see bxml.NaryPredicateType#getBinaryPred()
   * @see #getNaryPredicateType()
   * @generated
   */
  EReference getNaryPredicateType_BinaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredicateType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Comparison</em>'.
   * @see bxml.NaryPredicateType#getExpComparison()
   * @see #getNaryPredicateType()
   * @generated
   */
  EReference getNaryPredicateType_ExpComparison();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredicateType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Pred</em>'.
   * @see bxml.NaryPredicateType#getQuantifiedPred()
   * @see #getNaryPredicateType()
   * @generated
   */
  EReference getNaryPredicateType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredicateType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Pred</em>'.
   * @see bxml.NaryPredicateType#getUnaryPred()
   * @see #getNaryPredicateType()
   * @generated
   */
  EReference getNaryPredicateType_UnaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredicateType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Pred</em>'.
   * @see bxml.NaryPredicateType#getNaryPred()
   * @see #getNaryPredicateType()
   * @generated
   */
  EReference getNaryPredicateType_NaryPred();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NaryPredicateType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Set</em>'.
   * @see bxml.NaryPredicateType#getSet()
   * @see #getNaryPredicateType()
   * @generated
   */
  EReference getNaryPredicateType_Set();

  /**
   * Returns the meta object for the attribute '{@link bxml.NaryPredicateType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.NaryPredicateType#getOp()
   * @see #getNaryPredicateType()
   * @generated
   */
  EAttribute getNaryPredicateType_Op();

  /**
   * Returns the meta object for class '{@link bxml.NarySubstitutionType <em>Nary Substitution Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nary Substitution Type</em>'.
   * @see bxml.NarySubstitutionType
   * @generated
   */
  EClass getNarySubstitutionType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.NarySubstitutionType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.NarySubstitutionType#getAttr()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_Attr();

  /**
   * Returns the meta object for the attribute list '{@link bxml.NarySubstitutionType#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Sub</em>'.
   * @see bxml.NarySubstitutionType#getSub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EAttribute getNarySubstitutionType_Sub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bloc Sub</em>'.
   * @see bxml.NarySubstitutionType#getBlocSub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_BlocSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Skip</em>'.
   * @see bxml.NarySubstitutionType#getSkip()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_Skip();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assert Sub</em>'.
   * @see bxml.NarySubstitutionType#getAssertSub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_AssertSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>If Sub</em>'.
   * @see bxml.NarySubstitutionType#getIfSub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_IfSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Becomes Such That</em>'.
   * @see bxml.NarySubstitutionType#getBecomesSuchThat()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignement Sub</em>'.
   * @see bxml.NarySubstitutionType#getAssignementSub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_AssignementSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Select</em>'.
   * @see bxml.NarySubstitutionType#getSelect()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_Select();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case Sub</em>'.
   * @see bxml.NarySubstitutionType#getCaseSub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_CaseSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>ANY Sub</em>'.
   * @see bxml.NarySubstitutionType#getANYSub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_ANYSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>LET Sub</em>'.
   * @see bxml.NarySubstitutionType#getLETSub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_LETSub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Becomes In</em>'.
   * @see bxml.NarySubstitutionType#getBecomesIn()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_BecomesIn();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>VARIN</em>'.
   * @see bxml.NarySubstitutionType#getVARIN()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_VARIN();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getBinarySub <em>Binary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Sub</em>'.
   * @see bxml.NarySubstitutionType#getBinarySub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_BinarySub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Sub</em>'.
   * @see bxml.NarySubstitutionType#getNarySub()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_NarySub();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation Call</em>'.
   * @see bxml.NarySubstitutionType#getOperationCall()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_OperationCall();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.NarySubstitutionType#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>While</em>'.
   * @see bxml.NarySubstitutionType#getWhile()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EReference getNarySubstitutionType_While();

  /**
   * Returns the meta object for the attribute '{@link bxml.NarySubstitutionType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.NarySubstitutionType#getOp()
   * @see #getNarySubstitutionType()
   * @generated
   */
  EAttribute getNarySubstitutionType_Op();

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
   * Returns the meta object for the containment reference '{@link bxml.OperationCallType#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see bxml.OperationCallType#getOperation()
   * @see #getOperationCallType()
   * @generated
   */
  EReference getOperationCallType_Operation();

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
   * Returns the meta object for class '{@link bxml.ParametersType <em>Parameters Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters Type</em>'.
   * @see bxml.ParametersType
   * @generated
   */
  EClass getParametersType();

  /**
   * Returns the meta object for the attribute list '{@link bxml.ParametersType#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exp</em>'.
   * @see bxml.ParametersType#getExp()
   * @see #getParametersType()
   * @generated
   */
  EAttribute getParametersType_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binary Exp</em>'.
   * @see bxml.ParametersType#getBinaryExp()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_BinaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nary Exp</em>'.
   * @see bxml.ParametersType#getNaryExp()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_NaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Literal</em>'.
   * @see bxml.ParametersType#getBooleanLiteral()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Exp</em>'.
   * @see bxml.ParametersType#getBooleanExp()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_BooleanExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Set</em>'.
   * @see bxml.ParametersType#getEmptySet()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_EmptySet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Empty Seq</em>'.
   * @see bxml.ParametersType#getEmptySeq()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_EmptySeq();

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
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Integer Literal</em>'.
   * @see bxml.ParametersType#getIntegerLiteral()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Exp</em>'.
   * @see bxml.ParametersType#getQuantifiedExp()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Set</em>'.
   * @see bxml.ParametersType#getQuantifiedSet()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>STRING Literal</em>'.
   * @see bxml.ParametersType#getSTRINGLiteral()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Exp</em>'.
   * @see bxml.ParametersType#getUnaryExp()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_UnaryExp();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct</em>'.
   * @see bxml.ParametersType#getStruct()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_Struct();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ParametersType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Record</em>'.
   * @see bxml.ParametersType#getRecord()
   * @see #getParametersType()
   * @generated
   */
  EReference getParametersType_Record();

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
   * Returns the meta object for the containment reference '{@link bxml.ParametersType1#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ParametersType1#getAttr()
   * @see #getParametersType1()
   * @generated
   */
  EReference getParametersType1_Attr();

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
   * Returns the meta object for class '{@link bxml.PredicateType <em>Predicate Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Type</em>'.
   * @see bxml.PredicateType
   * @generated
   */
  EClass getPredicateType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredicateType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.PredicateType#getAttr()
   * @see #getPredicateType()
   * @generated
   */
  EReference getPredicateType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredicateType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.PredicateType#getBinaryPred()
   * @see #getPredicateType()
   * @generated
   */
  EReference getPredicateType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredicateType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.PredicateType#getExpComparison()
   * @see #getPredicateType()
   * @generated
   */
  EReference getPredicateType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredicateType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.PredicateType#getQuantifiedPred()
   * @see #getPredicateType()
   * @generated
   */
  EReference getPredicateType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredicateType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.PredicateType#getUnaryPred()
   * @see #getPredicateType()
   * @generated
   */
  EReference getPredicateType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredicateType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.PredicateType#getNaryPred()
   * @see #getPredicateType()
   * @generated
   */
  EReference getPredicateType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.PredicateType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.PredicateType#getSet()
   * @see #getPredicateType()
   * @generated
   */
  EReference getPredicateType_Set();

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
   * Returns the meta object for the attribute list '{@link bxml.PromotesType#getPromotedOperation <em>Promoted Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Promoted Operation</em>'.
   * @see bxml.PromotesType#getPromotedOperation()
   * @see #getPromotesType()
   * @generated
   */
  EAttribute getPromotesType_PromotedOperation();

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
   * Returns the meta object for class '{@link bxml.RecordItemType <em>Record Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Item Type</em>'.
   * @see bxml.RecordItemType
   * @generated
   */
  EClass getRecordItemType();

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
   * Returns the meta object for class '{@link bxml.ReferencedMachineType <em>Referenced Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Machine Type</em>'.
   * @see bxml.ReferencedMachineType
   * @generated
   */
  EClass getReferencedMachineType();

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
   * Returns the meta object for the attribute '{@link bxml.ReferencedMachineType#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see bxml.ReferencedMachineType#getPath()
   * @see #getReferencedMachineType()
   * @generated
   */
  EAttribute getReferencedMachineType_Path();

  /**
   * Returns the meta object for class '{@link bxml.ReferencedMachineType1 <em>Referenced Machine Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Machine Type1</em>'.
   * @see bxml.ReferencedMachineType1
   * @generated
   */
  EClass getReferencedMachineType1();

  /**
   * Returns the meta object for the containment reference '{@link bxml.ReferencedMachineType1#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.ReferencedMachineType1#getAttr()
   * @see #getReferencedMachineType1()
   * @generated
   */
  EReference getReferencedMachineType1_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.ReferencedMachineType1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bxml.ReferencedMachineType1#getName()
   * @see #getReferencedMachineType1()
   * @generated
   */
  EAttribute getReferencedMachineType1_Name();

  /**
   * Returns the meta object for the attribute '{@link bxml.ReferencedMachineType1#getRename <em>Rename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rename</em>'.
   * @see bxml.ReferencedMachineType1#getRename()
   * @see #getReferencedMachineType1()
   * @generated
   */
  EAttribute getReferencedMachineType1_Rename();

  /**
   * Returns the meta object for the attribute '{@link bxml.ReferencedMachineType1#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see bxml.ReferencedMachineType1#getPath()
   * @see #getReferencedMachineType1()
   * @generated
   */
  EAttribute getReferencedMachineType1_Path();

  /**
   * Returns the meta object for class '{@link bxml.ReferencedMachineType2 <em>Referenced Machine Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenced Machine Type2</em>'.
   * @see bxml.ReferencedMachineType2
   * @generated
   */
  EClass getReferencedMachineType2();

  /**
   * Returns the meta object for the containment reference list '{@link bxml.ReferencedMachineType2#getReferencedMachine <em>Referenced Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referenced Machine</em>'.
   * @see bxml.ReferencedMachineType2#getReferencedMachine()
   * @see #getReferencedMachineType2()
   * @generated
   */
  EReference getReferencedMachineType2_ReferencedMachine();

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
   * Returns the meta object for class '{@link bxml.StringLiteralType <em>String Literal Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal Type</em>'.
   * @see bxml.StringLiteralType
   * @generated
   */
  EClass getStringLiteralType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.StringLiteralType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.StringLiteralType#getAttr()
   * @see #getStringLiteralType()
   * @generated
   */
  EReference getStringLiteralType_Attr();

  /**
   * Returns the meta object for the attribute '{@link bxml.StringLiteralType#getTypref <em>Typref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typref</em>'.
   * @see bxml.StringLiteralType#getTypref()
   * @see #getStringLiteralType()
   * @generated
   */
  EAttribute getStringLiteralType_Typref();

  /**
   * Returns the meta object for the attribute '{@link bxml.StringLiteralType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see bxml.StringLiteralType#getValue()
   * @see #getStringLiteralType()
   * @generated
   */
  EAttribute getStringLiteralType_Value();

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
   * Returns the meta object for class '{@link bxml.SubstitutionType <em>Substitution Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substitution Type</em>'.
   * @see bxml.SubstitutionType
   * @generated
   */
  EClass getSubstitutionType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.SubstitutionType#getAttr()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getBlocSub <em>Bloc Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bloc Sub</em>'.
   * @see bxml.SubstitutionType#getBlocSub()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_BlocSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getSkip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Skip</em>'.
   * @see bxml.SubstitutionType#getSkip()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_Skip();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getAssertSub <em>Assert Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assert Sub</em>'.
   * @see bxml.SubstitutionType#getAssertSub()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_AssertSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getIfSub <em>If Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Sub</em>'.
   * @see bxml.SubstitutionType#getIfSub()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_IfSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getBecomesSuchThat <em>Becomes Such That</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes Such That</em>'.
   * @see bxml.SubstitutionType#getBecomesSuchThat()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_BecomesSuchThat();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getAssignementSub <em>Assignement Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignement Sub</em>'.
   * @see bxml.SubstitutionType#getAssignementSub()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_AssignementSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see bxml.SubstitutionType#getSelect()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_Select();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getCaseSub <em>Case Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Sub</em>'.
   * @see bxml.SubstitutionType#getCaseSub()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_CaseSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getANYSub <em>ANY Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>ANY Sub</em>'.
   * @see bxml.SubstitutionType#getANYSub()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_ANYSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getLETSub <em>LET Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LET Sub</em>'.
   * @see bxml.SubstitutionType#getLETSub()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_LETSub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getBecomesIn <em>Becomes In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Becomes In</em>'.
   * @see bxml.SubstitutionType#getBecomesIn()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_BecomesIn();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getVARIN <em>VARIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>VARIN</em>'.
   * @see bxml.SubstitutionType#getVARIN()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_VARIN();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getBinarySub <em>Binary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Sub</em>'.
   * @see bxml.SubstitutionType#getBinarySub()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_BinarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getNarySub <em>Nary Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Sub</em>'.
   * @see bxml.SubstitutionType#getNarySub()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_NarySub();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getOperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Call</em>'.
   * @see bxml.SubstitutionType#getOperationCall()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_OperationCall();

  /**
   * Returns the meta object for the containment reference '{@link bxml.SubstitutionType#getWhile <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While</em>'.
   * @see bxml.SubstitutionType#getWhile()
   * @see #getSubstitutionType()
   * @generated
   */
  EReference getSubstitutionType_While();

  /**
   * Returns the meta object for class '{@link bxml.TerminalType <em>Terminal Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Type</em>'.
   * @see bxml.TerminalType
   * @generated
   */
  EClass getTerminalType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.TerminalType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.TerminalType#getAttr()
   * @see #getTerminalType()
   * @generated
   */
  EReference getTerminalType_Attr();

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
   * Returns the meta object for class '{@link bxml.UnaryExpressionType <em>Unary Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression Type</em>'.
   * @see bxml.UnaryExpressionType
   * @generated
   */
  EClass getUnaryExpressionType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr</em>'.
   * @see bxml.UnaryExpressionType#getAttr()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_Attr();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getBinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Exp</em>'.
   * @see bxml.UnaryExpressionType#getBinaryExp()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_BinaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getNaryExp <em>Nary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Exp</em>'.
   * @see bxml.UnaryExpressionType#getNaryExp()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_NaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getBooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Literal</em>'.
   * @see bxml.UnaryExpressionType#getBooleanLiteral()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_BooleanLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getBooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Boolean Exp</em>'.
   * @see bxml.UnaryExpressionType#getBooleanExp()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_BooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getEmptySet <em>Empty Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Set</em>'.
   * @see bxml.UnaryExpressionType#getEmptySet()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_EmptySet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getEmptySeq <em>Empty Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Empty Seq</em>'.
   * @see bxml.UnaryExpressionType#getEmptySeq()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_EmptySeq();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see bxml.UnaryExpressionType#getId()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_Id();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getIntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer Literal</em>'.
   * @see bxml.UnaryExpressionType#getIntegerLiteral()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_IntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getQuantifiedExp <em>Quantified Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Exp</em>'.
   * @see bxml.UnaryExpressionType#getQuantifiedExp()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_QuantifiedExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getQuantifiedSet <em>Quantified Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Set</em>'.
   * @see bxml.UnaryExpressionType#getQuantifiedSet()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_QuantifiedSet();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getSTRINGLiteral <em>STRING Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>STRING Literal</em>'.
   * @see bxml.UnaryExpressionType#getSTRINGLiteral()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_STRINGLiteral();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getUnaryExp <em>Unary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Exp</em>'.
   * @see bxml.UnaryExpressionType#getUnaryExp()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_UnaryExp();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct</em>'.
   * @see bxml.UnaryExpressionType#getStruct()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_Struct();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryExpressionType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record</em>'.
   * @see bxml.UnaryExpressionType#getRecord()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EReference getUnaryExpressionType_Record();

  /**
   * Returns the meta object for the attribute '{@link bxml.UnaryExpressionType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.UnaryExpressionType#getOp()
   * @see #getUnaryExpressionType()
   * @generated
   */
  EAttribute getUnaryExpressionType_Op();

  /**
   * Returns the meta object for class '{@link bxml.UnaryPredicateType <em>Unary Predicate Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Predicate Type</em>'.
   * @see bxml.UnaryPredicateType
   * @generated
   */
  EClass getUnaryPredicateType();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredicateType#getBinaryPred <em>Binary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binary Pred</em>'.
   * @see bxml.UnaryPredicateType#getBinaryPred()
   * @see #getUnaryPredicateType()
   * @generated
   */
  EReference getUnaryPredicateType_BinaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredicateType#getExpComparison <em>Exp Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Comparison</em>'.
   * @see bxml.UnaryPredicateType#getExpComparison()
   * @see #getUnaryPredicateType()
   * @generated
   */
  EReference getUnaryPredicateType_ExpComparison();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredicateType#getQuantifiedPred <em>Quantified Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantified Pred</em>'.
   * @see bxml.UnaryPredicateType#getQuantifiedPred()
   * @see #getUnaryPredicateType()
   * @generated
   */
  EReference getUnaryPredicateType_QuantifiedPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredicateType#getUnaryPred <em>Unary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Pred</em>'.
   * @see bxml.UnaryPredicateType#getUnaryPred()
   * @see #getUnaryPredicateType()
   * @generated
   */
  EReference getUnaryPredicateType_UnaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredicateType#getNaryPred <em>Nary Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nary Pred</em>'.
   * @see bxml.UnaryPredicateType#getNaryPred()
   * @see #getUnaryPredicateType()
   * @generated
   */
  EReference getUnaryPredicateType_NaryPred();

  /**
   * Returns the meta object for the containment reference '{@link bxml.UnaryPredicateType#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set</em>'.
   * @see bxml.UnaryPredicateType#getSet()
   * @see #getUnaryPredicateType()
   * @generated
   */
  EReference getUnaryPredicateType_Set();

  /**
   * Returns the meta object for the attribute '{@link bxml.UnaryPredicateType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.UnaryPredicateType#getOp()
   * @see #getUnaryPredicateType()
   * @generated
   */
  EAttribute getUnaryPredicateType_Op();

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
   * Returns the meta object for class '{@link bxml.ValuationType1 <em>Valuation Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valuation Type1</em>'.
   * @see bxml.ValuationType1
   * @generated
   */
  EClass getValuationType1();

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
   * Returns the meta object for the attribute list '{@link bxml.ValuesType2#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exp</em>'.
   * @see bxml.ValuesType2#getExp()
   * @see #getValuesType2()
   * @generated
   */
  EAttribute getValuesType2_Exp();

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
   * Returns the meta object for class '{@link bxml.VariablesType <em>Variables Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables Type</em>'.
   * @see bxml.VariablesType
   * @generated
   */
  EClass getVariablesType();

  /**
   * Returns the meta object for the attribute list '{@link bxml.VariablesType#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Exp</em>'.
   * @see bxml.VariablesType#getExp()
   * @see #getVariablesType()
   * @generated
   */
  EAttribute getVariablesType_Exp();

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
   * Returns the meta object for the attribute '{@link bxml.VARINType#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see bxml.VARINType#getOp()
   * @see #getVARINType()
   * @generated
   */
  EAttribute getVARINType_Op();

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
   * Returns the meta object for enum '{@link bxml.BinaryExpOp <em>Binary Exp Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Exp Op</em>'.
   * @see bxml.BinaryExpOp
   * @generated
   */
  EEnum getBinaryExpOp();

  /**
   * Returns the meta object for enum '{@link bxml.BinaryPredOp <em>Binary Pred Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Pred Op</em>'.
   * @see bxml.BinaryPredOp
   * @generated
   */
  EEnum getBinaryPredOp();

  /**
   * Returns the meta object for enum '{@link bxml.BinarySubOp <em>Binary Sub Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Sub Op</em>'.
   * @see bxml.BinarySubOp
   * @generated
   */
  EEnum getBinarySubOp();

  /**
   * Returns the meta object for enum '{@link bxml.ComparisonOp <em>Comparison Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comparison Op</em>'.
   * @see bxml.ComparisonOp
   * @generated
   */
  EEnum getComparisonOp();

  /**
   * Returns the meta object for enum '{@link bxml.MachineType <em>Machine Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Machine Type</em>'.
   * @see bxml.MachineType
   * @generated
   */
  EEnum getMachineType();

  /**
   * Returns the meta object for enum '{@link bxml.NaryExpOp <em>Nary Exp Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Nary Exp Op</em>'.
   * @see bxml.NaryExpOp
   * @generated
   */
  EEnum getNaryExpOp();

  /**
   * Returns the meta object for enum '{@link bxml.NaryOp <em>Nary Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Nary Op</em>'.
   * @see bxml.NaryOp
   * @generated
   */
  EEnum getNaryOp();

  /**
   * Returns the meta object for enum '{@link bxml.OpVarSub <em>Op Var Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Var Sub</em>'.
   * @see bxml.OpVarSub
   * @generated
   */
  EEnum getOpVarSub();

  /**
   * Returns the meta object for enum '{@link bxml.QuantifiedExpOp <em>Quantified Exp Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Quantified Exp Op</em>'.
   * @see bxml.QuantifiedExpOp
   * @generated
   */
  EEnum getQuantifiedExpOp();

  /**
   * Returns the meta object for enum '{@link bxml.QuantifiedPredOp <em>Quantified Pred Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Quantified Pred Op</em>'.
   * @see bxml.QuantifiedPredOp
   * @generated
   */
  EEnum getQuantifiedPredOp();

  /**
   * Returns the meta object for enum '{@link bxml.UnaryExpOp <em>Unary Exp Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Exp Op</em>'.
   * @see bxml.UnaryExpOp
   * @generated
   */
  EEnum getUnaryExpOp();

  /**
   * Returns the meta object for enum '{@link bxml.UnaryPredOp <em>Unary Pred Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Pred Op</em>'.
   * @see bxml.UnaryPredOp
   * @generated
   */
  EEnum getUnaryPredOp();

  /**
   * Returns the meta object for data type '{@link bxml.BinaryExpOp <em>Binary Exp Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Binary Exp Op Object</em>'.
   * @see bxml.BinaryExpOp
   * @model instanceClass="bxml.BinaryExpOp"
   *        extendedMetaData="name='binary_exp_op:Object' baseType='binary_exp_op'"
   * @generated
   */
  EDataType getBinaryExpOpObject();

  /**
   * Returns the meta object for data type '{@link bxml.BinaryPredOp <em>Binary Pred Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Binary Pred Op Object</em>'.
   * @see bxml.BinaryPredOp
   * @model instanceClass="bxml.BinaryPredOp"
   *        extendedMetaData="name='binary_pred_op:Object' baseType='binary_pred_op'"
   * @generated
   */
  EDataType getBinaryPredOpObject();

  /**
   * Returns the meta object for data type '{@link bxml.BinarySubOp <em>Binary Sub Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Binary Sub Op Object</em>'.
   * @see bxml.BinarySubOp
   * @model instanceClass="bxml.BinarySubOp"
   *        extendedMetaData="name='binary_sub_op:Object' baseType='binary_sub_op'"
   * @generated
   */
  EDataType getBinarySubOpObject();

  /**
   * Returns the meta object for data type '{@link bxml.ComparisonOp <em>Comparison Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Comparison Op Object</em>'.
   * @see bxml.ComparisonOp
   * @model instanceClass="bxml.ComparisonOp"
   *        extendedMetaData="name='comparison_op:Object' baseType='comparison_op'"
   * @generated
   */
  EDataType getComparisonOpObject();

  /**
   * Returns the meta object for data type '{@link bxml.MachineType <em>Machine Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Machine Type Object</em>'.
   * @see bxml.MachineType
   * @model instanceClass="bxml.MachineType"
   *        extendedMetaData="name='machine_type:Object' baseType='machine_type'"
   * @generated
   */
  EDataType getMachineTypeObject();

  /**
   * Returns the meta object for data type '{@link bxml.NaryExpOp <em>Nary Exp Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Nary Exp Op Object</em>'.
   * @see bxml.NaryExpOp
   * @model instanceClass="bxml.NaryExpOp"
   *        extendedMetaData="name='nary_exp_op:Object' baseType='nary_exp_op'"
   * @generated
   */
  EDataType getNaryExpOpObject();

  /**
   * Returns the meta object for data type '{@link bxml.NaryOp <em>Nary Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Nary Op Object</em>'.
   * @see bxml.NaryOp
   * @model instanceClass="bxml.NaryOp"
   *        extendedMetaData="name='nary_op:Object' baseType='nary_op'"
   * @generated
   */
  EDataType getNaryOpObject();

  /**
   * Returns the meta object for data type '{@link bxml.OpVarSub <em>Op Var Sub Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Op Var Sub Object</em>'.
   * @see bxml.OpVarSub
   * @model instanceClass="bxml.OpVarSub"
   *        extendedMetaData="name='op_var_sub:Object' baseType='op_var_sub'"
   * @generated
   */
  EDataType getOpVarSubObject();

  /**
   * Returns the meta object for data type '{@link bxml.QuantifiedExpOp <em>Quantified Exp Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Quantified Exp Op Object</em>'.
   * @see bxml.QuantifiedExpOp
   * @model instanceClass="bxml.QuantifiedExpOp"
   *        extendedMetaData="name='quantified_exp_op:Object' baseType='quantified_exp_op'"
   * @generated
   */
  EDataType getQuantifiedExpOpObject();

  /**
   * Returns the meta object for data type '{@link bxml.QuantifiedPredOp <em>Quantified Pred Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Quantified Pred Op Object</em>'.
   * @see bxml.QuantifiedPredOp
   * @model instanceClass="bxml.QuantifiedPredOp"
   *        extendedMetaData="name='quantified_pred_op:Object' baseType='quantified_pred_op'"
   * @generated
   */
  EDataType getQuantifiedPredOpObject();

  /**
   * Returns the meta object for data type '{@link bxml.UnaryExpOp <em>Unary Exp Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unary Exp Op Object</em>'.
   * @see bxml.UnaryExpOp
   * @model instanceClass="bxml.UnaryExpOp"
   *        extendedMetaData="name='unary_exp_op:Object' baseType='unary_exp_op'"
   * @generated
   */
  EDataType getUnaryExpOpObject();

  /**
   * Returns the meta object for data type '{@link bxml.UnaryPredOp <em>Unary Pred Op Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unary Pred Op Object</em>'.
   * @see bxml.UnaryPredOp
   * @model instanceClass="bxml.UnaryPredOp"
   *        extendedMetaData="name='unary_pred_op:Object' baseType='unary_pred_op'"
   * @generated
   */
  EDataType getUnaryPredOpObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BxmlFactory getBxmlFactory();

} //BxmlPackage
