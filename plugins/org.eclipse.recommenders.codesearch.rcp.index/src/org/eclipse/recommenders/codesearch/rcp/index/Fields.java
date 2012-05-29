/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

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
    
	/* SimpleField
	   If the value of a field is plain text it is considered a simple field. No postprocessing is done to search terms that are used with a simple field when triggering the search. They usually contain names or expressions that do not have a special semantic.
	*/
	/** The unique represantation of the entity. Abbreviated as \cquote{FQN}
		Can be applied to: class,method,field,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String QUALIFIED_NAME = "FullyQualifiedName";
	/** Simple version of the entity's name
		Can be applied to: class,method,field,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String SIMPLE_NAME = "FriendlyName";
	/** Expression returned by a method, e.g, "return true;"
		Can be applied to: method
	*/
	//Generated - please modify in source file
	
	public final static String RETURN_VARIABLE_EXPRESSIONS = "ReturnVariableExpressions";
	/** Simple versions of all declared methods within, across the entire hierarchy
		Can be applied to: class
	*/
	//Generated - please modify in source file
	
	public final static String ALL_DECLARED_METHOD_NAMES = "AllDeclaredMethodNames";
	/** Simple versions of all declared methods within
		Can be applied to: class
	*/
	//Generated - please modify in source file
	
	public final static String DECLARED_METHODS_NAMES = "DeclaredMethodNames";
	/** Simple names of all declared fields
		Can be applied to: class,method,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String DECLARED_FIELD_NAMES = "DeclaredFieldNames";
	/** Simple names of all declared fields, across the entire hierarchy
		Can be applied to: class,method,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String ALL_DECLARED_FIELD_NAMES = "AllDeclaredFieldNames";
	/** Full text representation of the entire entity
		Can be applied to: class,method,field,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String FULL_TEXT = "FullText";
	/** The FQNs of the fields read within the entity. E.g, \cvalue{SomeType.someField}
		Can be applied to: class,method,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String FIELDS_READ = "FieldsRead";
	/** The FQNs of the fields written within the entity. E.g, \cvalue{SomeType.someField}
		Can be applied to: method,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String FIELDS_WRITTEN = "FieldsWritten";
	/** The FQNs of the fields used within the finally-block. E.g, \cvalue{SomeType.someField}
		Can be applied to: tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String USED_FIELDS_IN_FINALLY = "UsedFieldsInFinally";
	/** The FQNs of the fields used within the try-block. E.g, \cvalue{SomeType.someField}
		Can be applied to: tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String USED_FIELDS_IN_TRY = "UsedFieldsInTry";
	/** Variable name of a variable usage
		Can be applied to: varusage
	*/
	//Generated - please modify in source file
	
	public final static String VARIABLE_NAME = "VariableName";
	/** Textual representation of a methods parameter list used \textbf{internally} by MethodPatternQL (see \ref{sec:MethodPatternQL})
		Can be applied to: method
	*/
	//Generated - please modify in source file
	
	public final static String PARAMETER_TYPES_STRUCTURAL = "ParameterTypesStructural";
	
	
	/* TypeField
	   Field values in that category represent type names. 
	   Type names are fully qualified names of types, e.g, classes and interfaces. 
	   In Java they follow a certain pattern. Their names consist of a package name and the name of the type. 
	   Internally this format is called dot-notation. For example \cquote{java.util.List} is an interface. 
	   The name of the type is \cvalue{List}, the name of the package is \cvalue{java.util}.
	   
	   What is saved in the index is not this dot-notated syntax but a syntax providing more information. It is borrowed from CodeRecommenders' \cquote{BindingHelper}. 
	   By using the syntax that is used across the whole CodeRecommenders product range the compatibility between the search engine and those potential consumers is provided. 
	   For types that syntax does not look all that different than the usual dot-notation. The internal representation of the aforementioned type \cquote{java.util.List} is \cquote{Ljava/util/List}.  
	*/
	/** FQNs of types (interfaces) implemented by the entity
		Can be applied to: class
	*/
	//Generated - please modify in source file
	
	public final static String IMPLEMENTED_TYPES = "ImplementedTypes";
	/** FQN of the type the class has extended
		Can be applied to: class
	*/
	//Generated - please modify in source file
	
	public final static String EXTENDED_TYPE = "ExtendedTypes";
	/** Contains FQNs of all types used within the entity
		Can be applied to: class,method,field,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String USED_TYPES = "UsedTypes";
	/** Contains FQNs of all types used within the try-block
		Can be applied to: tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String USED_TYPES_IN_TRY = "UsedTypesInTry";
	/** Contains FQNs of all types used within the finally-block
		Can be applied to: tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String USED_TYPES_IN_FINALLY = "UsedTypesInFinally";
	/** Contains the FQNs of all types used in the parameter list of the method
		Can be applied to: method
	*/
	//Generated - please modify in source file
	
	public final static String PARAMETER_TYPES = "ParameterTypes";
	/** Contains the FQN of type returned by the method
		Can be applied to: method
	*/
	//Generated - please modify in source file
	
	public final static String RETURN_TYPE = "ReturnType";
	/** Contains the FQNs of all types used in \cquote{instanceof} checks within the entity
		Can be applied to: class,method,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String INSTANCEOF_TYPES = "InstanceofTypes";
	/** FQNs of types (interfaces) implemented by the entity across the entire hierarchy
		Can be applied to: class
	*/
	//Generated - please modify in source file
	
	public final static String ALL_IMPLEMENTED_TYPES = "AllImplementedTypes";
	/** FQNs of the types the class has extended across the entire hierarchy
		Can be applied to: class
	*/
	//Generated - please modify in source file
	
	public final static String ALL_EXTENDED_TYPES = "AllExtendedTypes";
	/** FQN of the field's type
		Can be applied to: field
	*/
	//Generated - please modify in source file
	
	public final static String FIELD_TYPE = "FieldType";
	/** FQN of the catch-block's caught type
		Can be applied to: tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String CAUGHT_TYPE = "CaughtType";
	/** Contains FQNs of the types declared within the entity
		Can be applied to: class,method,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String DECLARED_FIELD_TYPES = "DeclaredFieldTypes";
	/** The FQN of the entity's declaring type, e.g., a methods class or a catch-blocks method
		Can be applied to: method,field,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String DECLARING_TYPE = "DeclaringType";
	/** The FQN of the used variable's type
		Can be applied to: varusage
	*/
	//Generated - please modify in source file
	
	public final static String VARIABLE_TYPE = "VariableType";
	/** The FQN of the checked exceptions possibly thrown by a method
		Can be applied to: method
	*/
	//Generated - please modify in source file
	
	public final static String CHECKED_EXCEPTIONS = "CheckedExceptions";
	
	
	/* MethodField
	*/
	/** 
		Can be applied to: class,method,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String USED_METHODS = "UsedMethods";
	/** 
		Can be applied to: tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String USED_METHODS_IN_TRY = "UsedMethodsInTry";
	/** 
		Can be applied to: tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String USED_METHODS_IN_FINALLY = "UsedMethodsInFinally";
	/** 
		Can be applied to: class
	*/
	//Generated - please modify in source file
	
	public final static String OVERRIDDEN_METHODS = "OverriddenMethods";
	/** 
		Can be applied to: class
	*/
	//Generated - please modify in source file
	
	public final static String DECLARED_METHODS = "DeclaredMethods";
	/** 
		Can be applied to: varusage
	*/
	//Generated - please modify in source file
	
	public final static String DECLARING_METHOD = "DeclaringMethod";
	/** 
		Can be applied to: varusage
	*/
	//Generated - please modify in source file
	
	public final static String USED_AS_PARAMETER_IN_METHODS = "UsedAsParameterInMethods";
	/** 
		Can be applied to: varusage
	*/
	//Generated - please modify in source file
	
	public final static String USED_AS_TAGET_FOR_METHODS = "UsedAsTargetForMethods";
	
	
	/* FilePathField
	   When a field represents a file path it is contained in this category. 
	   Regardless of the local operating system all path names are persisted in unix style, e.g., \cquote{/users/bob/sourcecode} and \cquote{c:/users/bob/sourcecode}. 
	   Since the colon \cquote{:} is a special Lucene character that seperates a field name from its value it must be escaped when used inside a search term.
	   This escapint is done for all search terms used with fields in this category.
	*/
	/** Local file path to the current entity's source code file
		Can be applied to: class,method,field,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String RESOURCE_PATH = "ResourcePath";
	
	
	/* NumberField
	*/
	/** Number of parameters that are defined in a method's parameter list
		Can be applied to: method
	*/
	//Generated - please modify in source file
	
	public final static String PARAMETER_COUNT = "ParameterCount";
	
	
	/* ModifierField
	*/
	/** Modifiers that are defined for the entity
		Can be applied to: class,method,field
	*/
	//Generated - please modify in source file
	
	public final static String MODIFIERS = "Modifiers";
	
	
	/* TimeField
	*/
	/** Timestamp of the document's entity's last indexing time. Measured in milliseconds since January 1, 1970.
		Can be applied to: class,method,field,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String TIMESTAMP = "Timestamp";
	
	
	/* DocumentTypeField
	*/
	/** Defines the type of the entity represented by the document.
		Can be applied to: class,method,field,tryCatch,varusage
	*/
	//Generated - please modify in source file
	
	public final static String TYPE = "Type";
	
	
	/* ProjectNameField
	*/
	/** 
		Can be applied to: class,method,field,tryCatch
	*/
	//Generated - please modify in source file
	
	public final static String PROJECT_NAME = "ProjectName";
	
	
	/* AnnotationField
	*/
	/** 
		Can be applied to: class
	*/
	//Generated - please modify in source file
	
	public final static String ANNOTATIONS = "Annotations";
	
	
	/* DefinitionType
	*/
	/** 
		Can be applied to: varusage
	*/
	//Generated - please modify in source file
	
	public final static String VARIABLE_DEFINITION = "VariableDefinition";
	
	
}