/**
 * Copyright (c) 2012 Tobias Boehm.
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
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String TYPE_CLASS = "type";
	public final static String TYPE_METHOD = "method";
	public final static String TYPE_FIELD = "field";
	public final static String TYPE_TRYCATCH = "trycatch";
	public final static String TYPE_VARUSAGE = "varusage";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	public static final String MODIFIER_PUBLIC = "public";
	public static final String MODIFIER_FINAL = "final";
	public static final String MODIFIER_PRIVATE = "private";
	public static final String MODIFIER_PROTECTED = "protected";
	public static final String MODIFIER_STATIC = "static";
	public static final String MODIFIER_ABSTRACT = "abstract";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	public static final String DEFINITION_PARAMETER = "parameter";
	public static final String DEFINITION_NULLLITERAL = "nullLiteral";
	public static final String DEFINITION_ASSIGNMENT = "assignment";
	public static final String DEFINITION_INSTANCE_CREATION = "instanceCreation";
	public static final String DEFINITION_UNINITIALIZED = "uninitialized";
	    
	//GENERATED, DO NOT MODIFY HERE!!!
	// DocumentTypeField
	/** Defines the type of the entity represented by the document.<br /><br />
		Can be applied to: type, method, field, tryCatch, varusage
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String TYPE = "Type";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// DocumentTypeField
	public static String[] getDocumentTypeFields() {
		return new String[]{
			Fields.TYPE
		};	
	}
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// SimpleField
	/** Java handle used internally as a reference from the entity represented by the document to the actual structural Java element. 
		  Used for example when opening a Java element (class, method, ...) from the query result in the user interface<br /><br />
		Can be applied to: type, method, field, varusage
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String JAVA_ELEMENT_HANDLE = "Handle";
	/** Simple name representation of the entity's name<br /><br />
		Can be applied to: type, method, field, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String SIMPLE_NAME = "FriendlyName";
	/** Expression returned by a method, e.g., "return true;"<br /><br />
		Can be applied to: method
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String RETURN_VARIABLE_EXPRESSIONS = "ReturnVariableExpressions";
	/** Simple versions of all declared methods within, across the entire hierarchy<br /><br />
		Can be applied to: type
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String ALL_DECLARED_METHOD_NAMES = "AllDeclaredMethodNames";
	/** Simple versions of all declared methods within<br /><br />
		Can be applied to: type
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String DECLARED_METHODS_NAMES = "DeclaredMethodNames";
	/** Simple names of all declared fields<br /><br />
		Can be applied to: type, method, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String DECLARED_FIELD_NAMES = "DeclaredFieldNames";
	/** Simple names of all declared fields, across the entire hierarchy<br /><br />
		Can be applied to: type, method, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String ALL_DECLARED_FIELD_NAMES = "AllDeclaredFieldNames";
	/** Full text representation of the entire entity, including names of structural elements, implementation comments as well as documentation<br /><br />
		Can be applied to: type, method, field, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String FULL_TEXT = "FullText";
	/** The FQNs of the fields read from within the entity. E.g., \cvalue{SomeType.someField}<br /><br />
		Can be applied to: type, method, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String FIELDS_READ = "FieldsRead";
	/** The FQNs of the fields written to within the entity. E.g., \cvalue{SomeType.someField}<br /><br />
		Can be applied to: method, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String FIELDS_WRITTEN = "FieldsWritten";
	/** The FQNs of the fields used within the finally-block. E.g., \cvalue{SomeType.someField}<br /><br />
		Can be applied to: tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_FIELDS_IN_FINALLY = "UsedFieldsInFinally";
	/** The FQNs of the fields used within the try-block. E.g., \cvalue{SomeType.someField}<br /><br />
		Can be applied to: tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_FIELDS_IN_TRY = "UsedFieldsInTry";
	/** Variable name of a variable usage<br /><br />
		Can be applied to: varusage
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String VARIABLE_NAME = "VariableName";
	/** Textual representation of a methods parameter list used \textbf{internally} by \cmpq{} (see \ref{sec:MethodPatternQL})<br /><br />
		Can be applied to: method
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String PARAMETER_TYPES_STRUCTURAL = "ParameterTypesStructural";
	/** List of Java annotations along with specified annotation parameters.<br /><br />
		Can be applied to: type, method
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String ANNOTATIONS = "Annotations";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// SimpleField
	public static String[] getSimpleFields() {
		return new String[]{
			Fields.JAVA_ELEMENT_HANDLE
			, Fields.SIMPLE_NAME
			, Fields.RETURN_VARIABLE_EXPRESSIONS
			, Fields.ALL_DECLARED_METHOD_NAMES
			, Fields.DECLARED_METHODS_NAMES
			, Fields.DECLARED_FIELD_NAMES
			, Fields.ALL_DECLARED_FIELD_NAMES
			, Fields.FULL_TEXT
			, Fields.FIELDS_READ
			, Fields.FIELDS_WRITTEN
			, Fields.USED_FIELDS_IN_FINALLY
			, Fields.USED_FIELDS_IN_TRY
			, Fields.VARIABLE_NAME
			, Fields.PARAMETER_TYPES_STRUCTURAL
			, Fields.ANNOTATIONS
		};	
	}
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// TypeField
	/** The unique representation of the entity. Abbreviated as \cquote{FQN}<br /><br />
		Can be applied to: type, method, field, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String QUALIFIED_NAME = "FullyQualifiedName";
	/** FQN of types (interfaces) implemented by the entity<br /><br />
		Can be applied to: type
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String IMPLEMENTED_TYPES = "ImplementedTypes";
	/** FQN of the type the class has extended<br /><br />
		Can be applied to: type
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String EXTENDED_TYPE = "ExtendedTypes";
	/** Contains the FQN of all types used within the entity<br /><br />
		Can be applied to: type, method, field, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_TYPES = "UsedTypes";
	/** Contains the FQN of all types used within the try-block<br /><br />
		Can be applied to: tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_TYPES_IN_TRY = "UsedTypesInTry";
	/** Contains FQNs of all types used within the finally-block<br /><br />
		Can be applied to: tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_TYPES_IN_FINALLY = "UsedTypesInFinally";
	/** Contains the FQNs of all types used in the parameter list of the method<br /><br />
		Can be applied to: method
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String PARAMETER_TYPES = "ParameterTypes";
	/** Contains the FQN of type returned by the method<br /><br />
		Can be applied to: method
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String RETURN_TYPE = "ReturnType";
	/** Contains the FQN of all types used in \cquote{instanceof} checks within the entity<br /><br />
		Can be applied to: type, method, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String INSTANCEOF_TYPES = "InstanceofTypes";
	/** FQN of the type (interface) the type has implemented directly as well as the FQN of the types (interfaces) implemented indirectly by the type across the entire hierarchy<br /><br />
		Can be applied to: type
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String ALL_IMPLEMENTED_TYPES = "AllImplementedTypes";
	/** FQN of the type that the class has extended directly as well as the FQN of the types the class has extended indirectly across the entire hierarchy<br /><br />
		Can be applied to: type
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String ALL_EXTENDED_TYPES = "AllExtendedTypes";
	/** FQN of the field's type<br /><br />
		Can be applied to: field
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String FIELD_TYPE = "FieldType";
	/** FQN of the catch-block's caught type<br /><br />
		Can be applied to: tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String CAUGHT_TYPE = "CaughtType";
	/** Contains the FQN of the types declared within the entity<br /><br />
		Can be applied to: type, method, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String DECLARED_FIELD_TYPES = "DeclaredFieldTypes";
	/** The FQN of the entity's declaring type, e.g., a method's declaring class or a catch-block's declaring method<br /><br />
		Can be applied to: method, field, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String DECLARING_TYPE = "DeclaringType";
	/** The FQN of the used variable's type<br /><br />
		Can be applied to: varusage
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String VARIABLE_TYPE = "VariableType";
	/** The FQN of the checked exceptions possibly thrown by a method<br /><br />
		Can be applied to: method
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String CHECKED_EXCEPTIONS = "CheckedExceptions";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// TypeField
	public static String[] getTypeFields() {
		return new String[]{
			Fields.QUALIFIED_NAME
			, Fields.IMPLEMENTED_TYPES
			, Fields.EXTENDED_TYPE
			, Fields.USED_TYPES
			, Fields.USED_TYPES_IN_TRY
			, Fields.USED_TYPES_IN_FINALLY
			, Fields.PARAMETER_TYPES
			, Fields.RETURN_TYPE
			, Fields.INSTANCEOF_TYPES
			, Fields.ALL_IMPLEMENTED_TYPES
			, Fields.ALL_EXTENDED_TYPES
			, Fields.FIELD_TYPE
			, Fields.CAUGHT_TYPE
			, Fields.DECLARED_FIELD_TYPES
			, Fields.DECLARING_TYPE
			, Fields.VARIABLE_TYPE
			, Fields.CHECKED_EXCEPTIONS
		};	
	}
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// MethodField
	/** FQN of the methods that are being called from within the entity. In case of a try/catch-construct called from within the catch-block<br /><br />
		Can be applied to: type, method, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_METHODS = "UsedMethods";
	/** FQN of the methods that are being called from within the entity's try-block<br /><br />
		Can be applied to: tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_METHODS_IN_TRY = "UsedMethodsInTry";
	/** FQN of the methods that are being called from within the entity's finally-block<br /><br />
		Can be applied to: tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_METHODS_IN_FINALLY = "UsedMethodsInFinally";
	/** FQN of the methods that are being overridden by a method definition<br /><br />
		Can be applied to: type
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String OVERRIDDEN_METHODS = "OverriddenMethods";
	/** FQN of methods that are being declared inside an entity<br /><br />
		Can be applied to: type
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String DECLARED_METHODS = "DeclaredMethods";
	/** FQN of the method that the entity has been declared in<br /><br />
		Can be applied to: varusage
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String DECLARING_METHOD = "DeclaringMethod";
	/** FQN of the method that a variable has been used as a parameter with<br /><br />
		Can be applied to: varusage
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_AS_PARAMETER_IN_METHODS = "UsedAsParameterInMethods";
	/** FQN of the method that has been called on a variable<br /><br />
		Can be applied to: varusage
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String USED_AS_TAGET_FOR_METHODS = "UsedAsTargetForMethods";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// MethodField
	public static String[] getMethodFields() {
		return new String[]{
			Fields.USED_METHODS
			, Fields.USED_METHODS_IN_TRY
			, Fields.USED_METHODS_IN_FINALLY
			, Fields.OVERRIDDEN_METHODS
			, Fields.DECLARED_METHODS
			, Fields.DECLARING_METHOD
			, Fields.USED_AS_PARAMETER_IN_METHODS
			, Fields.USED_AS_TAGET_FOR_METHODS
		};	
	}
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// FilePathField
	/** Local file path to the current entity's source code file<br /><br />
		Can be applied to: type, method, field, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String RESOURCE_PATH = "ResourcePath";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// FilePathField
	public static String[] getFilePathFields() {
		return new String[]{
			Fields.RESOURCE_PATH
		};	
	}
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// NumberField
	/** Number of parameters that are defined in a method's parameter list<br /><br />
		Can be applied to: method
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String PARAMETER_COUNT = "ParameterCount";
	/** Timestamp of the document's entity's last indexing time. Measured in milliseconds since January 1, 1970<br /><br />
		Can be applied to: type, method, field, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String TIMESTAMP = "Timestamp";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// NumberField
	public static String[] getNumberFields() {
		return new String[]{
			Fields.PARAMETER_COUNT
			, Fields.TIMESTAMP
		};	
	}
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// ModifierField
	/** Modifiers that are defined for the entity<br /><br />
		Can be applied to: type, method, field
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String MODIFIERS = "Modifiers";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// ModifierField
	public static String[] getModifierFields() {
		return new String[]{
			Fields.MODIFIERS
		};	
	}
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// ProjectNameField
	/** Name of the project the entity's source code file is a part of. 
		  If the entity is part of a class file, the values is the project that references the library that contains the class file.<br /><br />
		Can be applied to: type, method, field, tryCatch
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String PROJECT_NAME = "ProjectName";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// ProjectNameField
	public static String[] getProjectNameFields() {
		return new String[]{
			Fields.PROJECT_NAME
		};	
	}
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// DefinitionTypeField
	/** The way a variable of a variable usage has been declared<br /><br />
		Can be applied to: varusage
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String VARIABLE_DEFINITION = "VariableDefinition";
	
	//GENERATED, DO NOT MODIFY HERE!!!
	// DefinitionTypeField
	public static String[] getDefinitionTypeFields() {
		return new String[]{
			Fields.VARIABLE_DEFINITION
		};	
	}
	
}
