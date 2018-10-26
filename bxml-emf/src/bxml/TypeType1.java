/**
 */
package bxml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bxml.BxmlPackage#getTypeType1()
 * @model extendedMetaData="name='type_._1_._type'"
 * @generated
 */
public enum TypeType1 implements Enumerator {
  /**
   * The '<em><b>Abstraction</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABSTRACTION_VALUE
   * @generated
   * @ordered
   */
  ABSTRACTION(0, "abstraction", "abstraction"),

  /**
   * The '<em><b>Refinement</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REFINEMENT_VALUE
   * @generated
   * @ordered
   */
  REFINEMENT(1, "refinement", "refinement"),

  /**
   * The '<em><b>Implementation</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMPLEMENTATION_VALUE
   * @generated
   * @ordered
   */
  IMPLEMENTATION(2, "implementation", "implementation");

  /**
   * The '<em><b>Abstraction</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Abstraction</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABSTRACTION
   * @model name="abstraction"
   * @generated
   * @ordered
   */
  public static final int ABSTRACTION_VALUE = 0;

  /**
   * The '<em><b>Refinement</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Refinement</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REFINEMENT
   * @model name="refinement"
   * @generated
   * @ordered
   */
  public static final int REFINEMENT_VALUE = 1;

  /**
   * The '<em><b>Implementation</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Implementation</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMPLEMENTATION
   * @model name="implementation"
   * @generated
   * @ordered
   */
  public static final int IMPLEMENTATION_VALUE = 2;

  /**
   * An array of all the '<em><b>Type Type1</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TypeType1[] VALUES_ARRAY =
    new TypeType1[] {
      ABSTRACTION,
      REFINEMENT,
      IMPLEMENTATION,
    };

  /**
   * A public read-only list of all the '<em><b>Type Type1</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TypeType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type Type1</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeType1 get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeType1 result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Type1</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeType1 getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeType1 result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Type1</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeType1 get(int value) {
    switch (value) {
      case ABSTRACTION_VALUE: return ABSTRACTION;
      case REFINEMENT_VALUE: return REFINEMENT;
      case IMPLEMENTATION_VALUE: return IMPLEMENTATION;
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
  private TypeType1(int value, String name, String literal) {
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
  
} //TypeType1
