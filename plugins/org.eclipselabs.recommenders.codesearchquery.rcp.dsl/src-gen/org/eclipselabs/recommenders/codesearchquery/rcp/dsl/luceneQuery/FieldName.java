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
 * A representation of the literals of the enumeration '<em><b>Field Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getFieldName()
 * @model
 * @generated
 */
public enum FieldName implements Enumerator
{
  /**
   * The '<em><b>Fully Qualified Name</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FULLY_QUALIFIED_NAME_VALUE
   * @generated
   * @ordered
   */
  FULLY_QUALIFIED_NAME(0, "FullyQualifiedName", "FullyQualifiedName"),

  /**
   * The '<em><b>Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TYPE_VALUE
   * @generated
   * @ordered
   */
  TYPE(1, "type", "type"),

  /**
   * The '<em><b>Friendly Name</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRIENDLY_NAME_VALUE
   * @generated
   * @ordered
   */
  FRIENDLY_NAME(2, "FriendlyName", "FriendlyName"),

  /**
   * The '<em><b>Implemented Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMPLEMENTED_TYPES_VALUE
   * @generated
   * @ordered
   */
  IMPLEMENTED_TYPES(3, "ImplementedTypes", "ImplementedTypes"),

  /**
   * The '<em><b>Extended Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXTENDED_TYPES_VALUE
   * @generated
   * @ordered
   */
  EXTENDED_TYPES(4, "ExtendedTypes", "ExtendedTypes"),

  /**
   * The '<em><b>Declared Methods</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECLARED_METHODS_VALUE
   * @generated
   * @ordered
   */
  DECLARED_METHODS(5, "DeclaredMethods", "DeclaredMethods"),

  /**
   * The '<em><b>Used Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USED_TYPES_VALUE
   * @generated
   * @ordered
   */
  USED_TYPES(6, "UsedTypes", "UsedTypes"),

  /**
   * The '<em><b>Used Types In Try</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USED_TYPES_IN_TRY_VALUE
   * @generated
   * @ordered
   */
  USED_TYPES_IN_TRY(7, "UsedTypesInTry", "UsedTypesInTry"),

  /**
   * The '<em><b>Used Types In Finally</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USED_TYPES_IN_FINALLY_VALUE
   * @generated
   * @ordered
   */
  USED_TYPES_IN_FINALLY(8, "UsedTypesInFinally", "UsedTypesInFinally"),

  /**
   * The '<em><b>Parameter Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARAMETER_TYPES_VALUE
   * @generated
   * @ordered
   */
  PARAMETER_TYPES(9, "ParameterTypes", "ParameterTypes"),

  /**
   * The '<em><b>Parameter Count</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARAMETER_COUNT_VALUE
   * @generated
   * @ordered
   */
  PARAMETER_COUNT(10, "ParameterCount", "ParameterCount"),

  /**
   * The '<em><b>Return Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RETURN_TYPE_VALUE
   * @generated
   * @ordered
   */
  RETURN_TYPE(11, "ReturnType", "ReturnType"),

  /**
   * The '<em><b>Return Variable Eexpressions</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RETURN_VARIABLE_EEXPRESSIONS_VALUE
   * @generated
   * @ordered
   */
  RETURN_VARIABLE_EEXPRESSIONS(12, "ReturnVariableEexpressions", "ReturnVariableEexpressions"),

  /**
   * The '<em><b>Used Methods</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USED_METHODS_VALUE
   * @generated
   * @ordered
   */
  USED_METHODS(13, "UsedMethods", "UsedMethods"),

  /**
   * The '<em><b>Used Methods In Try</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USED_METHODS_IN_TRY_VALUE
   * @generated
   * @ordered
   */
  USED_METHODS_IN_TRY(14, "UsedMethodsInTry", "UsedMethodsInTry"),

  /**
   * The '<em><b>Used Methods In Finally</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USED_METHODS_IN_FINALLY_VALUE
   * @generated
   * @ordered
   */
  USED_METHODS_IN_FINALLY(15, "UsedMethodsInFinally", "UsedMethodsInFinally"),

  /**
   * The '<em><b>Overridden Methods</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OVERRIDDEN_METHODS_VALUE
   * @generated
   * @ordered
   */
  OVERRIDDEN_METHODS(16, "OverriddenMethods", "OverriddenMethods"),

  /**
   * The '<em><b>All Implemented Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_IMPLEMENTED_TYPES_VALUE
   * @generated
   * @ordered
   */
  ALL_IMPLEMENTED_TYPES(17, "AllImplementedTypes", "AllImplementedTypes"),

  /**
   * The '<em><b>All Extended Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_EXTENDED_TYPES_VALUE
   * @generated
   * @ordered
   */
  ALL_EXTENDED_TYPES(18, "AllExtendedTypes", "AllExtendedTypes"),

  /**
   * The '<em><b>Field Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIELD_TYPE_VALUE
   * @generated
   * @ordered
   */
  FIELD_TYPE(19, "FieldType", "FieldType"),

  /**
   * The '<em><b>Declaring Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECLARING_TYPE_VALUE
   * @generated
   * @ordered
   */
  DECLARING_TYPE(20, "DeclaringType", "DeclaringType"),

  /**
   * The '<em><b>Caught Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CAUGHT_TYPE_VALUE
   * @generated
   * @ordered
   */
  CAUGHT_TYPE(21, "CaughtType", "CaughtType"),

  /**
   * The '<em><b>Project Name</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROJECT_NAME_VALUE
   * @generated
   * @ordered
   */
  PROJECT_NAME(22, "ProjectName", "ProjectName"),

  /**
   * The '<em><b>Resource Path</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RESOURCE_PATH_VALUE
   * @generated
   * @ordered
   */
  RESOURCE_PATH(23, "ResourcePath", "ResourcePath"),

  /**
   * The '<em><b>Modifiers</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MODIFIERS_VALUE
   * @generated
   * @ordered
   */
  MODIFIERS(24, "Modifiers", "Modifiers"),

  /**
   * The '<em><b>All Declared Method Names</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_DECLARED_METHOD_NAMES_VALUE
   * @generated
   * @ordered
   */
  ALL_DECLARED_METHOD_NAMES(25, "AllDeclaredMethodNames", "AllDeclaredMethodNames"),

  /**
   * The '<em><b>Declared Method Names</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECLARED_METHOD_NAMES_VALUE
   * @generated
   * @ordered
   */
  DECLARED_METHOD_NAMES(26, "DeclaredMethodNames", "DeclaredMethodNames"),

  /**
   * The '<em><b>Declared Field Names</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECLARED_FIELD_NAMES_VALUE
   * @generated
   * @ordered
   */
  DECLARED_FIELD_NAMES(27, "DeclaredFieldNames", "DeclaredFieldNames"),

  /**
   * The '<em><b>Declared Field Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECLARED_FIELD_TYPES_VALUE
   * @generated
   * @ordered
   */
  DECLARED_FIELD_TYPES(28, "DeclaredFieldTypes", "DeclaredFieldTypes"),

  /**
   * The '<em><b>All Declared Field Names</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_DECLARED_FIELD_NAMES_VALUE
   * @generated
   * @ordered
   */
  ALL_DECLARED_FIELD_NAMES(29, "AllDeclaredFieldNames", "AllDeclaredFieldNames"),

  /**
   * The '<em><b>Full Text</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FULL_TEXT_VALUE
   * @generated
   * @ordered
   */
  FULL_TEXT(30, "FullText", "FullText"),

  /**
   * The '<em><b>Fields Read</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIELDS_READ_VALUE
   * @generated
   * @ordered
   */
  FIELDS_READ(31, "FieldsRead", "FieldsRead"),

  /**
   * The '<em><b>Fields Written</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIELDS_WRITTEN_VALUE
   * @generated
   * @ordered
   */
  FIELDS_WRITTEN(32, "FieldsWritten", "FieldsWritten"),

  /**
   * The '<em><b>Used Fields In Finally</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USED_FIELDS_IN_FINALLY_VALUE
   * @generated
   * @ordered
   */
  USED_FIELDS_IN_FINALLY(33, "UsedFieldsInFinally", "UsedFieldsInFinally"),

  /**
   * The '<em><b>Used Fields In Try</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USED_FIELDS_IN_TRY_VALUE
   * @generated
   * @ordered
   */
  USED_FIELDS_IN_TRY(34, "UsedFieldsInTry", "UsedFieldsInTry"),

  /**
   * The '<em><b>Annotations</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANNOTATIONS_VALUE
   * @generated
   * @ordered
   */
  ANNOTATIONS(35, "Annotations", "Annotations"),

  /**
   * The '<em><b>Instanceof Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSTANCEOF_TYPES_VALUE
   * @generated
   * @ordered
   */
  INSTANCEOF_TYPES(36, "InstanceofTypes", "InstanceofTypes");

  /**
   * The '<em><b>Fully Qualified Name</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fully Qualified Name</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FULLY_QUALIFIED_NAME
   * @model name="FullyQualifiedName"
   * @generated
   * @ordered
   */
  public static final int FULLY_QUALIFIED_NAME_VALUE = 0;

  /**
   * The '<em><b>Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TYPE
   * @model name="type"
   * @generated
   * @ordered
   */
  public static final int TYPE_VALUE = 1;

  /**
   * The '<em><b>Friendly Name</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Friendly Name</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRIENDLY_NAME
   * @model name="FriendlyName"
   * @generated
   * @ordered
   */
  public static final int FRIENDLY_NAME_VALUE = 2;

  /**
   * The '<em><b>Implemented Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Implemented Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMPLEMENTED_TYPES
   * @model name="ImplementedTypes"
   * @generated
   * @ordered
   */
  public static final int IMPLEMENTED_TYPES_VALUE = 3;

  /**
   * The '<em><b>Extended Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Extended Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXTENDED_TYPES
   * @model name="ExtendedTypes"
   * @generated
   * @ordered
   */
  public static final int EXTENDED_TYPES_VALUE = 4;

  /**
   * The '<em><b>Declared Methods</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Declared Methods</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECLARED_METHODS
   * @model name="DeclaredMethods"
   * @generated
   * @ordered
   */
  public static final int DECLARED_METHODS_VALUE = 5;

  /**
   * The '<em><b>Used Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Used Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USED_TYPES
   * @model name="UsedTypes"
   * @generated
   * @ordered
   */
  public static final int USED_TYPES_VALUE = 6;

  /**
   * The '<em><b>Used Types In Try</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Used Types In Try</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USED_TYPES_IN_TRY
   * @model name="UsedTypesInTry"
   * @generated
   * @ordered
   */
  public static final int USED_TYPES_IN_TRY_VALUE = 7;

  /**
   * The '<em><b>Used Types In Finally</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Used Types In Finally</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USED_TYPES_IN_FINALLY
   * @model name="UsedTypesInFinally"
   * @generated
   * @ordered
   */
  public static final int USED_TYPES_IN_FINALLY_VALUE = 8;

  /**
   * The '<em><b>Parameter Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Parameter Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARAMETER_TYPES
   * @model name="ParameterTypes"
   * @generated
   * @ordered
   */
  public static final int PARAMETER_TYPES_VALUE = 9;

  /**
   * The '<em><b>Parameter Count</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Parameter Count</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARAMETER_COUNT
   * @model name="ParameterCount"
   * @generated
   * @ordered
   */
  public static final int PARAMETER_COUNT_VALUE = 10;

  /**
   * The '<em><b>Return Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Return Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RETURN_TYPE
   * @model name="ReturnType"
   * @generated
   * @ordered
   */
  public static final int RETURN_TYPE_VALUE = 11;

  /**
   * The '<em><b>Return Variable Eexpressions</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Return Variable Eexpressions</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RETURN_VARIABLE_EEXPRESSIONS
   * @model name="ReturnVariableEexpressions"
   * @generated
   * @ordered
   */
  public static final int RETURN_VARIABLE_EEXPRESSIONS_VALUE = 12;

  /**
   * The '<em><b>Used Methods</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Used Methods</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USED_METHODS
   * @model name="UsedMethods"
   * @generated
   * @ordered
   */
  public static final int USED_METHODS_VALUE = 13;

  /**
   * The '<em><b>Used Methods In Try</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Used Methods In Try</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USED_METHODS_IN_TRY
   * @model name="UsedMethodsInTry"
   * @generated
   * @ordered
   */
  public static final int USED_METHODS_IN_TRY_VALUE = 14;

  /**
   * The '<em><b>Used Methods In Finally</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Used Methods In Finally</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USED_METHODS_IN_FINALLY
   * @model name="UsedMethodsInFinally"
   * @generated
   * @ordered
   */
  public static final int USED_METHODS_IN_FINALLY_VALUE = 15;

  /**
   * The '<em><b>Overridden Methods</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Overridden Methods</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OVERRIDDEN_METHODS
   * @model name="OverriddenMethods"
   * @generated
   * @ordered
   */
  public static final int OVERRIDDEN_METHODS_VALUE = 16;

  /**
   * The '<em><b>All Implemented Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All Implemented Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL_IMPLEMENTED_TYPES
   * @model name="AllImplementedTypes"
   * @generated
   * @ordered
   */
  public static final int ALL_IMPLEMENTED_TYPES_VALUE = 17;

  /**
   * The '<em><b>All Extended Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All Extended Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL_EXTENDED_TYPES
   * @model name="AllExtendedTypes"
   * @generated
   * @ordered
   */
  public static final int ALL_EXTENDED_TYPES_VALUE = 18;

  /**
   * The '<em><b>Field Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Field Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIELD_TYPE
   * @model name="FieldType"
   * @generated
   * @ordered
   */
  public static final int FIELD_TYPE_VALUE = 19;

  /**
   * The '<em><b>Declaring Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Declaring Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECLARING_TYPE
   * @model name="DeclaringType"
   * @generated
   * @ordered
   */
  public static final int DECLARING_TYPE_VALUE = 20;

  /**
   * The '<em><b>Caught Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Caught Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CAUGHT_TYPE
   * @model name="CaughtType"
   * @generated
   * @ordered
   */
  public static final int CAUGHT_TYPE_VALUE = 21;

  /**
   * The '<em><b>Project Name</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Project Name</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROJECT_NAME
   * @model name="ProjectName"
   * @generated
   * @ordered
   */
  public static final int PROJECT_NAME_VALUE = 22;

  /**
   * The '<em><b>Resource Path</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Resource Path</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RESOURCE_PATH
   * @model name="ResourcePath"
   * @generated
   * @ordered
   */
  public static final int RESOURCE_PATH_VALUE = 23;

  /**
   * The '<em><b>Modifiers</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Modifiers</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MODIFIERS
   * @model name="Modifiers"
   * @generated
   * @ordered
   */
  public static final int MODIFIERS_VALUE = 24;

  /**
   * The '<em><b>All Declared Method Names</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All Declared Method Names</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL_DECLARED_METHOD_NAMES
   * @model name="AllDeclaredMethodNames"
   * @generated
   * @ordered
   */
  public static final int ALL_DECLARED_METHOD_NAMES_VALUE = 25;

  /**
   * The '<em><b>Declared Method Names</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Declared Method Names</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECLARED_METHOD_NAMES
   * @model name="DeclaredMethodNames"
   * @generated
   * @ordered
   */
  public static final int DECLARED_METHOD_NAMES_VALUE = 26;

  /**
   * The '<em><b>Declared Field Names</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Declared Field Names</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECLARED_FIELD_NAMES
   * @model name="DeclaredFieldNames"
   * @generated
   * @ordered
   */
  public static final int DECLARED_FIELD_NAMES_VALUE = 27;

  /**
   * The '<em><b>Declared Field Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Declared Field Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECLARED_FIELD_TYPES
   * @model name="DeclaredFieldTypes"
   * @generated
   * @ordered
   */
  public static final int DECLARED_FIELD_TYPES_VALUE = 28;

  /**
   * The '<em><b>All Declared Field Names</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All Declared Field Names</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL_DECLARED_FIELD_NAMES
   * @model name="AllDeclaredFieldNames"
   * @generated
   * @ordered
   */
  public static final int ALL_DECLARED_FIELD_NAMES_VALUE = 29;

  /**
   * The '<em><b>Full Text</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Full Text</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FULL_TEXT
   * @model name="FullText"
   * @generated
   * @ordered
   */
  public static final int FULL_TEXT_VALUE = 30;

  /**
   * The '<em><b>Fields Read</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fields Read</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIELDS_READ
   * @model name="FieldsRead"
   * @generated
   * @ordered
   */
  public static final int FIELDS_READ_VALUE = 31;

  /**
   * The '<em><b>Fields Written</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fields Written</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIELDS_WRITTEN
   * @model name="FieldsWritten"
   * @generated
   * @ordered
   */
  public static final int FIELDS_WRITTEN_VALUE = 32;

  /**
   * The '<em><b>Used Fields In Finally</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Used Fields In Finally</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USED_FIELDS_IN_FINALLY
   * @model name="UsedFieldsInFinally"
   * @generated
   * @ordered
   */
  public static final int USED_FIELDS_IN_FINALLY_VALUE = 33;

  /**
   * The '<em><b>Used Fields In Try</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Used Fields In Try</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USED_FIELDS_IN_TRY
   * @model name="UsedFieldsInTry"
   * @generated
   * @ordered
   */
  public static final int USED_FIELDS_IN_TRY_VALUE = 34;

  /**
   * The '<em><b>Annotations</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Annotations</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANNOTATIONS
   * @model name="Annotations"
   * @generated
   * @ordered
   */
  public static final int ANNOTATIONS_VALUE = 35;

  /**
   * The '<em><b>Instanceof Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Instanceof Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INSTANCEOF_TYPES
   * @model name="InstanceofTypes"
   * @generated
   * @ordered
   */
  public static final int INSTANCEOF_TYPES_VALUE = 36;

  /**
   * An array of all the '<em><b>Field Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FieldName[] VALUES_ARRAY =
    new FieldName[]
    {
      FULLY_QUALIFIED_NAME,
      TYPE,
      FRIENDLY_NAME,
      IMPLEMENTED_TYPES,
      EXTENDED_TYPES,
      DECLARED_METHODS,
      USED_TYPES,
      USED_TYPES_IN_TRY,
      USED_TYPES_IN_FINALLY,
      PARAMETER_TYPES,
      PARAMETER_COUNT,
      RETURN_TYPE,
      RETURN_VARIABLE_EEXPRESSIONS,
      USED_METHODS,
      USED_METHODS_IN_TRY,
      USED_METHODS_IN_FINALLY,
      OVERRIDDEN_METHODS,
      ALL_IMPLEMENTED_TYPES,
      ALL_EXTENDED_TYPES,
      FIELD_TYPE,
      DECLARING_TYPE,
      CAUGHT_TYPE,
      PROJECT_NAME,
      RESOURCE_PATH,
      MODIFIERS,
      ALL_DECLARED_METHOD_NAMES,
      DECLARED_METHOD_NAMES,
      DECLARED_FIELD_NAMES,
      DECLARED_FIELD_TYPES,
      ALL_DECLARED_FIELD_NAMES,
      FULL_TEXT,
      FIELDS_READ,
      FIELDS_WRITTEN,
      USED_FIELDS_IN_FINALLY,
      USED_FIELDS_IN_TRY,
      ANNOTATIONS,
      INSTANCEOF_TYPES,
    };

  /**
   * A public read-only list of all the '<em><b>Field Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FieldName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Field Name</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FieldName get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FieldName result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Field Name</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FieldName getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FieldName result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Field Name</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FieldName get(int value)
  {
    switch (value)
    {
      case FULLY_QUALIFIED_NAME_VALUE: return FULLY_QUALIFIED_NAME;
      case TYPE_VALUE: return TYPE;
      case FRIENDLY_NAME_VALUE: return FRIENDLY_NAME;
      case IMPLEMENTED_TYPES_VALUE: return IMPLEMENTED_TYPES;
      case EXTENDED_TYPES_VALUE: return EXTENDED_TYPES;
      case DECLARED_METHODS_VALUE: return DECLARED_METHODS;
      case USED_TYPES_VALUE: return USED_TYPES;
      case USED_TYPES_IN_TRY_VALUE: return USED_TYPES_IN_TRY;
      case USED_TYPES_IN_FINALLY_VALUE: return USED_TYPES_IN_FINALLY;
      case PARAMETER_TYPES_VALUE: return PARAMETER_TYPES;
      case PARAMETER_COUNT_VALUE: return PARAMETER_COUNT;
      case RETURN_TYPE_VALUE: return RETURN_TYPE;
      case RETURN_VARIABLE_EEXPRESSIONS_VALUE: return RETURN_VARIABLE_EEXPRESSIONS;
      case USED_METHODS_VALUE: return USED_METHODS;
      case USED_METHODS_IN_TRY_VALUE: return USED_METHODS_IN_TRY;
      case USED_METHODS_IN_FINALLY_VALUE: return USED_METHODS_IN_FINALLY;
      case OVERRIDDEN_METHODS_VALUE: return OVERRIDDEN_METHODS;
      case ALL_IMPLEMENTED_TYPES_VALUE: return ALL_IMPLEMENTED_TYPES;
      case ALL_EXTENDED_TYPES_VALUE: return ALL_EXTENDED_TYPES;
      case FIELD_TYPE_VALUE: return FIELD_TYPE;
      case DECLARING_TYPE_VALUE: return DECLARING_TYPE;
      case CAUGHT_TYPE_VALUE: return CAUGHT_TYPE;
      case PROJECT_NAME_VALUE: return PROJECT_NAME;
      case RESOURCE_PATH_VALUE: return RESOURCE_PATH;
      case MODIFIERS_VALUE: return MODIFIERS;
      case ALL_DECLARED_METHOD_NAMES_VALUE: return ALL_DECLARED_METHOD_NAMES;
      case DECLARED_METHOD_NAMES_VALUE: return DECLARED_METHOD_NAMES;
      case DECLARED_FIELD_NAMES_VALUE: return DECLARED_FIELD_NAMES;
      case DECLARED_FIELD_TYPES_VALUE: return DECLARED_FIELD_TYPES;
      case ALL_DECLARED_FIELD_NAMES_VALUE: return ALL_DECLARED_FIELD_NAMES;
      case FULL_TEXT_VALUE: return FULL_TEXT;
      case FIELDS_READ_VALUE: return FIELDS_READ;
      case FIELDS_WRITTEN_VALUE: return FIELDS_WRITTEN;
      case USED_FIELDS_IN_FINALLY_VALUE: return USED_FIELDS_IN_FINALLY;
      case USED_FIELDS_IN_TRY_VALUE: return USED_FIELDS_IN_TRY;
      case ANNOTATIONS_VALUE: return ANNOTATIONS;
      case INSTANCEOF_TYPES_VALUE: return INSTANCEOF_TYPES;
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
  private FieldName(int value, String name, String literal)
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
  
} //FieldName
