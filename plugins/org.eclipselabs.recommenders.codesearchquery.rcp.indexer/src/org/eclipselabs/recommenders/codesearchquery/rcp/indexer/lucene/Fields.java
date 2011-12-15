package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene;

import java.io.IOException;
import java.util.Map;

public class Fields {
    //public final static String INT_TIMESTAMP = "int_timestamp";
    
	public final static String TYPE_CLASS = "class";
	public final static String TYPE_METHOD = "method";
	public final static String TYPE_FIELD = "field";
	public final static String TYPE_TRYCATCH = "trycatch";

	public static final String MODIFIER_PUBLIC = "public";
	public static final String MODIFIER_FINAL = "final";
	public static final String MODIFIER_PRIVATE = "private";
	public static final String MODIFIER_PROTECTED = "protected";
	public static final String MODIFIER_STATIC = "static";
	public static final String MODIFIER_ABSTRACT = "abstract";
	
    public final static String FULLY_QUALIFIED_NAME = "fully qualified name";
    public final static String TYPE = "type";
    public final static String FRIENDLY_NAME = "friendly name";
    public final static String IMPLEMENTED_TYPES = "implemented types";
    public final static String EXTENDED_TYPE = "extended types";
    public final static String DECLARED_METHODS = "declared methods";
    public final static String USED_TYPES = "used types";
    public final static String USED_TYPES_IN_TRY = "used types in try";
    public final static String USED_TYPES_IN_FINALLY = "used types in finally";
    public final static String PARAMETER_TYPES = "parameter types";
    public final static String RETURN_TYPE = "return type";
    public final static String USED_METHODS = "used methods";
    public final static String USED_METHODS_IN_TRY = "used methods in try";
    public final static String USED_METHODS_IN_FINALLY = "used methods in finally";
    public final static String OVERRIDDEN_METHODS = "overridden methods";
    public static final String ALL_IMPLEMENTED_TYPES = "all implemented types";
    public static final String ALL_EXTENDED_TYPES = "all extended types";
	public static final String FIELD_TYPE = "field type";
	public static final String DECLARING_TYPE = "declaring type";
	public static final String CAUGHT_TYPE = "caught type";
	public static final String PROJECT_NAME = "project name";
	public static final String RESOURCE_PATH = "resource path";
	public static final String MODIFIERS = "modifiers";
	public static final String ALL_METHOD_NAMES = "all method names";
}
