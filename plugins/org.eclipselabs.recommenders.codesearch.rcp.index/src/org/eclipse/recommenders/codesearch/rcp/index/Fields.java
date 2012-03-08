package org.eclipse.recommenders.codesearch.rcp.index;

/*
 * This is a generated file. Do not modify. Modify source file instead.
 */

public class Fields {
    public final static String TYPE_CLASS = "class";
    public final static String TYPE_METHOD = "method";
    public final static String TYPE_FIELD = "field";
    public final static String TYPE_TRYCATCH = "trycatch";
    public final static String TYPE_VARUSAGE = "varusage";

    public static final String MODIFIER_PUBLIC = "public";
    public static final String MODIFIER_FINAL = "final";
    public static final String MODIFIER_PRIVATE = "private";
    public static final String MODIFIER_PROTECTED = "protected";
    public static final String MODIFIER_STATIC = "static";
    public static final String MODIFIER_ABSTRACT = "abstract";

    public static final String DEFINITION_PARAMETER = "parameter";
    public static final String DEFINITION_NULLLITERAL = "nullLiteral";
    public static final String DEFINITION_METHOD_INVOCATION = "methodInvocation";
    public static final String DEFINITION_INSTANCE_CREATION = "instanceCreation";
    public static final String DEFINITION_UNINITIALIZED = "uninitialized";

    /**
     * Java handle used to open a given java element in an editor.
     */
    public static final String JAVA_ELEMENT_HANDLE = "Handle";

    // SimpleField
    /** Can be applied to: class,method,field,tryCatch */
    // Generated - please modify in source file
    public final static String QUALIFIED_NAME = "FullyQualifiedName";
    /** Can be applied to: class,method,field,tryCatch */
    // Generated - please modify in source file
    public final static String SIMPLE_NAME = "FriendlyName";
    /** Can be applied to: method */
    // Generated - please modify in source file
    public final static String RETURN_VARIABLE_EXPRESSIONS = "ReturnVariableExpressions";
    /** Can be applied to: class */
    // Generated - please modify in source file
    public final static String ALL_DECLARED_METHOD_NAMES = "AllDeclaredMethodNames";
    /** Can be applied to: class */
    // Generated - please modify in source file
    public final static String DECLARED_METHODS_NAMES = "DeclaredMethodNames";
    /** Can be applied to: class,method,tryCatch */
    // Generated - please modify in source file
    public final static String DECLARED_FIELD_NAMES = "DeclaredFieldNames";
    /** Can be applied to: class,method,tryCatch */
    // Generated - please modify in source file
    public final static String ALL_DECLARED_FIELD_NAMES = "AllDeclaredFieldNames";
    /** Can be applied to: class,method,field,tryCatch */
    // Generated - please modify in source file
    public final static String FULL_TEXT = "FullText";
    /** Can be applied to: class,method,tryCatch */
    // Generated - please modify in source file
    public final static String FIELDS_READ = "FieldsRead";
    /** Can be applied to: method,tryCatch */
    // Generated - please modify in source file
    public final static String FIELDS_WRITTEN = "FieldsWritten";
    /** Can be applied to: tryCatch */
    // Generated - please modify in source file
    public final static String USED_FIELDS_IN_FINALLY = "UsedFieldsInFinally";
    /** Can be applied to: tryCatch */
    // Generated - please modify in source file
    public final static String USED_FIELDS_IN_TRY = "UsedFieldsInTry";
    /** Can be applied to: */
    // Generated - please modify in source file
    public final static String VARIABLE_NAME = "VariableName";
    /** Can be applied to: method */
    // Generated - please modify in source file
    public final static String PARAMETER_TYPES_STRUCTURAL = "ParameterTypesStructural";

    // TypeField
    /** Can be applied to: class */
    // Generated - please modify in source file
    public final static String IMPLEMENTED_TYPES = "ImplementedTypes";
    /** Can be applied to: class */
    // Generated - please modify in source file
    public final static String EXTENDED_TYPE = "ExtendedTypes";
    /** Can be applied to: class,method,field,tryCatch */
    // Generated - please modify in source file
    public final static String USED_TYPES = "UsedTypes";
    /** Can be applied to: tryCatch */
    // Generated - please modify in source file
    public final static String USED_TYPES_IN_TRY = "UsedTypesInTry";
    /** Can be applied to: tryCatch */
    // Generated - please modify in source file
    public final static String USED_TYPES_IN_FINALLY = "UsedTypesInFinally";
    /** Can be applied to: method */
    // Generated - please modify in source file
    public final static String PARAMETER_TYPES = "ParameterTypes";
    /** Can be applied to: method */
    // Generated - please modify in source file
    public final static String RETURN_TYPE = "ReturnType";
    /** Can be applied to: class,method,tryCatch */
    // Generated - please modify in source file
    public final static String INSTANCEOF_TYPES = "InstanceofTypes";
    /** Can be applied to: class */
    // Generated - please modify in source file
    public final static String ALL_IMPLEMENTED_TYPES = "AllImplementedTypes";
    /** Can be applied to: class */
    // Generated - please modify in source file
    public final static String ALL_EXTENDED_TYPES = "AllExtendedTypes";
    /** Can be applied to: field */
    // Generated - please modify in source file
    public final static String FIELD_TYPE = "FieldType";
    /** Can be applied to: tryCatch */
    // Generated - please modify in source file
    public final static String CAUGHT_TYPE = "CaughtType";
    /** Can be applied to: class,method,tryCatch */
    // Generated - please modify in source file
    public final static String DECLARED_FIELD_TYPES = "DeclaredFieldTypes";
    /** Can be applied to: method,field,tryCatch */
    // Generated - please modify in source file
    public final static String DECLARING_TYPE = "DeclaringType";
    /** Can be applied to: */
    // Generated - please modify in source file
    public final static String VARIABLE_TYPE = "VariableType";
    /** Can be applied to: method */
    // Generated - please modify in source file
    public final static String CHECKED_EXCEPTIONS = "CheckedExceptions";

    // MethodField
    /** Can be applied to: class,method,tryCatch */
    // Generated - please modify in source file
    public final static String USED_METHODS = "UsedMethods";
    /** Can be applied to: tryCatch */
    // Generated - please modify in source file
    public final static String USED_METHODS_IN_TRY = "UsedMethodsInTry";
    /** Can be applied to: tryCatch */
    // Generated - please modify in source file
    public final static String USED_METHODS_IN_FINALLY = "UsedMethodsInFinally";
    /** Can be applied to: class */
    // Generated - please modify in source file
    public final static String OVERRIDDEN_METHODS = "OverriddenMethods";
    /** Can be applied to: class */
    // Generated - please modify in source file
    public final static String DECLARED_METHODS = "DeclaredMethods";
    /** Can be applied to: */
    // Generated - please modify in source file
    public final static String DECLARING_METHOD = "DeclaringMethod";
    /** Can be applied to: */
    // Generated - please modify in source file
    public final static String USED_AS_PARAMETER_IN_METHODS = "UsedAsParameterInMethods";
    /** Can be applied to: */
    // Generated - please modify in source file
    public final static String USED_AS_TAGET_FOR_METHODS = "UsedAsTargetForMethods";

    // FilePathField
    /** Can be applied to: class,method,field,tryCatch */
    // Generated - please modify in source file
    public final static String RESOURCE_PATH = "ResourcePath";

    // NumberField
    /** Can be applied to: method */
    // Generated - please modify in source file
    public final static String PARAMETER_COUNT = "ParameterCount";

    // ModifierField
    /** Can be applied to: class,method,field */
    // Generated - please modify in source file
    public final static String MODIFIERS = "Modifiers";

    // TimeField
    /** Can be applied to: class,method,field,tryCatch */
    // Generated - please modify in source file
    public final static String TIMESTAMP = "Timestamp";

    // DocumentTypeField
    /** Can be applied to: class,method,field,tryCatch, */
    // Generated - please modify in source file
    public final static String TYPE = "Type";

    // ProjectNameField
    /** Can be applied to: class,method,field,tryCatch */
    // Generated - please modify in source file
    public final static String PROJECT_NAME = "ProjectName";

    // AnnotationField
    /** Can be applied to: class */
    // Generated - please modify in source file
    public final static String ANNOTATIONS = "Annotations";

    // DefinitionType
    /** Can be applied to: */
    // Generated - please modify in source file
    public final static String VARIABLE_DEFINITION = "VariableDefinition";

}