/**
 */
package bxml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Op Type7</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bxml.BxmlPackage#getOpType7()
 * @model extendedMetaData="name='op_._7_._type'"
 * @generated
 */
public enum OpType7 implements Enumerator {
  /**
   * The '<em><b></b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #___VALUE
   * @generated
   * @ordered
   */
  __(0, "__", "&"),

  /**
   * The '<em><b>Or</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OR_VALUE
   * @generated
   * @ordered
   */
  OR(1, "or", "or"),

  /**
   * The '<em><b>1</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_1_VALUE
   * @generated
   * @ordered
   */
  _1(2, "_1", "=>"),

  /**
   * The '<em><b>2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #_2_VALUE
   * @generated
   * @ordered
   */
  _2(3, "_2", "<=>"),

  /**
   * The '<em><b>Cand</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CAND_VALUE
   * @generated
   * @ordered
   */
  CAND(4, "cand", "cand");

  /**
   * The '<em><b></b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b></b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #__
   * @model literal="&amp;"
   * @generated
   * @ordered
   */
  public static final int ___VALUE = 0;

  /**
   * The '<em><b>Or</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Or</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OR
   * @model name="or"
   * @generated
   * @ordered
   */
  public static final int OR_VALUE = 1;

  /**
   * The '<em><b>1</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>1</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_1
   * @model literal="=&gt;"
   * @generated
   * @ordered
   */
  public static final int _1_VALUE = 2;

  /**
   * The '<em><b>2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_2
   * @model literal="&lt;=&gt;"
   * @generated
   * @ordered
   */
  public static final int _2_VALUE = 3;

  /**
   * The '<em><b>Cand</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cand</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CAND
   * @model name="cand"
   * @generated
   * @ordered
   */
  public static final int CAND_VALUE = 4;

  /**
   * An array of all the '<em><b>Op Type7</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OpType7[] VALUES_ARRAY =
    new OpType7[] {
      __,
      OR,
      _1,
      _2,
      CAND,
    };

  /**
   * A public read-only list of all the '<em><b>Op Type7</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OpType7> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Op Type7</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OpType7 get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OpType7 result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Op Type7</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OpType7 getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      OpType7 result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Op Type7</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OpType7 get(int value) {
    switch (value) {
      case ___VALUE: return __;
      case OR_VALUE: return OR;
      case _1_VALUE: return _1;
      case _2_VALUE: return _2;
      case CAND_VALUE: return CAND;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OpType7(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }
  
} //OpType7
