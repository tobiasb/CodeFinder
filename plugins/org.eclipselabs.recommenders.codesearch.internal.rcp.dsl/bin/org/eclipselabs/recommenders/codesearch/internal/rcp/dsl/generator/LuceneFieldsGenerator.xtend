/*
 * generated by Xtext
 */
package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model

class LuceneFieldsGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(typeof(Model))) {
			fsa.generateFile(e.className + ".java", e.compileFieldsClass)
			fsa.generateFile("LuceneQueryBaseGenerated.xtext", e.compileXtextBaseClass)
		}
	} 
	
	def compileXtextBaseClass(Model m) {
		var b = new BooleanHandler();
		
		b.setValue(true)
		
'''/*
	The following rules are generated. Do not modify. Modify source file instead.
*/

	//Generated Rule. Do not modify!
	ClauseExpression:
		(UnaryExpression)? 
		(
			default=SimpleFieldValue Boost? | // Default field
			(
			«FOR category : m.fieldCategories»
				«if(m.fieldCategories.indexOf(category)>0){'| '}»	(
						field=«category.categoryName» ':' 
						(
							(values+=«category.categoryName»Value)
							| ('('(UnaryExpression? values+=«category.categoryName»Value Boost?)*')')
						) Boost?
					)
			«ENDFOR»
			)
		)
	;

	«FOR category : m.fieldCategories»
	//Generated Rule. Do not modify!
	«category.categoryName»:
		«FOR field : category.fields»
			«if(!b.value){'| '}»	value='«field.value»'
			«b.setValue(false)»
		«ENDFOR»
	;
	
	«b.setValue(true)»
	«ENDFOR»
	/*
	End of generated rules.
	*/
'''

	}
	
	def compileFieldsClass(Model m) {
		'''
/*
 *	COPY THE NEXT BLOCK TO THE FOLLOWING LOCATONS:
	«FOR packageName : m.packageNames»
 *		«packageName».«m.className»
	«ENDFOR»
*/
	«doNotModify»
	
public class «m.className» {
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
    
	«FOR category : m.fieldCategories»
	//«category.categoryName»
		«FOR field : category.fields»
	«field.compile»
		«ENDFOR»
	
	
	«ENDFOR»
}
'''
	}
	
	def compile(Field f) {
'''	/** Can be applied to: «FOR t : f.types»«if(f.types.indexOf(t)>0){','}»«t.toTypeName»«ENDFOR»*/
	//Generated - please modify in source file
	public final static String «f.name» = "«f.value»";'''
	}
	
	def toTypeName(FieldType t) {
		if(t.classType) {
			return "class"
		}
		if(t.methodType) {
			return "method"
		}
		if(t.fieldType) {
			return "field"
		}
		if(t.trycatchType) {
			return "tryCatch"
		}
	}
	
	def doNotModify() {
'''/*
* This is a generated file. Do not modify. Modify source file instead.
*/'''
	}
}
