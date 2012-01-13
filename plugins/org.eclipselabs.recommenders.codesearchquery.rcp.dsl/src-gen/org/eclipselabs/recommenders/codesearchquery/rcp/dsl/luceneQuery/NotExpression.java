/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Not Expression</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getNotExpression()
 * @model
 * @generated
 */
public enum NotExpression implements Enumerator
{
  /**
   * The '<em><b>Not1</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT1_VALUE
   * @generated
   * @ordered
   */
  NOT1(0, "not1", "not"),

  /**
   * The '<em><b>Not2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT2_VALUE
   * @generated
   * @ordered
   */
  NOT2(1, "not2", "NOT"),

  /**
   * The '<em><b>Not3</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT3_VALUE
   * @generated
   * @ordered
   */
  NOT3(2, "not3", "!");

  /**
   * The '<em><b>Not1</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Not1</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT1
   * @model name="not1" literal="not"
   * @generated
   * @ordered
   */
  public static final int NOT1_VALUE = 0;

  /**
   * The '<em><b>Not2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Not2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT2
   * @model name="not2" literal="NOT"
   * @generated
   * @ordered
   */
  public static final int NOT2_VALUE = 1;

  /**
   * The '<em><b>Not3</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Not3</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT3
   * @model name="not3" literal="!"
   * @generated
   * @ordered
   */
  public static final int NOT3_VALUE = 2;

  /**
   * An array of all the '<em><b>Not Expression</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NotExpression[] VALUES_ARRAY =
    new NotExpression[]
    {
      NOT1,
      NOT2,
      NOT3,
    };

  /**
   * A public read-only list of all the '<em><b>Not Expression</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<NotExpression> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Not Expression</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NotExpression get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NotExpression result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Not Expression</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NotExpression getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NotExpression result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Not Expression</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NotExpression get(int value)
  {
    switch (value)
    {
      case NOT1_VALUE: return NOT1;
      case NOT2_VALUE: return NOT2;
      case NOT3_VALUE: return NOT3;
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
  private NotExpression(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //NotExpression
