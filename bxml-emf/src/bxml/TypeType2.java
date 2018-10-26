/**
 */
package bxml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bxml.BxmlPackage#getTypeType2()
 * @model extendedMetaData="name='type_._2_._type'"
 * @generated
 */
public enum TypeType2 implements Enumerator {
  /**
   * The '<em><b></b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #___VALUE
   * @generated
   * @ordered
   */
  __(0, "__", "%"),

  /**
   * The '<em><b>SIGMA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIGMA_VALUE
   * @generated
   * @ordered
   */
  SIGMA(1, "SIGMA", "SIGMA"),

  /**
   * The '<em><b>PI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PI_VALUE
   * @generated
   * @ordered
   */
  PI(2, "PI", "PI"),

  /**
   * The '<em><b>RSIGMA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RSIGMA_VALUE
   * @generated
   * @ordered
   */
  RSIGMA(3, "RSIGMA", "RSIGMA"),

  /**
   * The '<em><b>RPI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RPI_VALUE
   * @generated
   * @ordered
   */
  RPI(4, "RPI", "RPI"),

  /**
   * The '<em><b>INTER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTER_VALUE
   * @generated
   * @ordered
   */
  INTER(5, "INTER", "INTER"),

  /**
   * The '<em><b>UNION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNION_VALUE
   * @generated
   * @ordered
   */
  UNION(6, "UNION", "UNION");

  /**
   * The '<em><b></b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b></b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #__
   * @model literal="%"
   * @generated
   * @ordered
   */
  public static final int ___VALUE = 0;

  /**
   * The '<em><b>SIGMA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SIGMA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIGMA
   * @model
   * @generated
   * @ordered
   */
  public static final int SIGMA_VALUE = 1;

  /**
   * The '<em><b>PI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PI
   * @model
   * @generated
   * @ordered
   */
  public static final int PI_VALUE = 2;

  /**
   * The '<em><b>RSIGMA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RSIGMA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RSIGMA
   * @model
   * @generated
   * @ordered
   */
  public static final int RSIGMA_VALUE = 3;

  /**
   * The '<em><b>RPI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RPI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RPI
   * @model
   * @generated
   * @ordered
   */
  public static final int RPI_VALUE = 4;

  /**
   * The '<em><b>INTER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTER
   * @model
   * @generated
   * @ordered
   */
  public static final int INTER_VALUE = 5;

  /**
   * The '<em><b>UNION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNION
   * @model
   * @generated
   * @ordered
   */
  public static final int UNION_VALUE = 6;

  /**
   * An array of all the '<em><b>Type Type2</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TypeType2[] VALUES_ARRAY =
    new TypeType2[] {
      __,
      SIGMA,
      PI,
      RSIGMA,
      RPI,
      INTER,
      UNION,
    };

  /**
   * A public read-only list of all the '<em><b>Type Type2</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TypeType2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type Type2</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeType2 get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeType2 result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Type2</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeType2 getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeType2 result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Type2</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeType2 get(int value) {
    switch (value) {
      case ___VALUE: return __;
      case SIGMA_VALUE: return SIGMA;
      case PI_VALUE: return PI;
      case RSIGMA_VALUE: return RSIGMA;
      case RPI_VALUE: return RPI;
      case INTER_VALUE: return INTER;
      case UNION_VALUE: return UNION;
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
  private TypeType2(int value, String name, String literal) {
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
  
} //TypeType2
