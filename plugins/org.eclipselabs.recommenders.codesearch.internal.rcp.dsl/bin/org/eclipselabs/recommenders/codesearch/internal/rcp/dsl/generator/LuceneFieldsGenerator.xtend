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
			fsa.generateFile(e.className + ".java.txt", e.compileFieldsClass)
			fsa.generateFile("LuceneQueryBaseGenerated.txt", e.compileXtextBaseClass)
			fsa.generateFile("FieldsOverview.tex", e.compileTexFieldOverview)
		}
	} 
	
	def compileTexFieldOverview(Model m) {
'''% This file is generated

		«FOR category : m.fieldCategories»

%GENERATED, DO NOT MODIFY HERE!!!
\subsubsection{«category.categoryName.getTexCompatibleString()»}
\label{sec:FieldCategory«category.categoryName.getTexCompatibleString()»}

%GENERATED, DO NOT MODIFY HERE!!!
«category.desc»

%GENERATED, DO NOT MODIFY HERE!!!
See table \ref{tab:FieldCategory«category.categoryName.getTexCompatibleString»Fields} for the complete list of fields.

%GENERATED, DO NOT MODIFY HERE!!!
%Category: «category.categoryName.getTexCompatibleString()»
\begin{longtable}{|p{4.7cm}|p{2,1cm}|p{7,8cm}|}
	\hline
	\multicolumn{3}{|l|}{\textsl{«category.categoryName.getTexCompatibleString()»}}\\\hline
	\textbf{Field Name} & \textbf{Target} & \textbf{Description}\\
	\endfirsthead
	\multicolumn{3}{@{}l}{\ldots continued}\\\hline
	%\multicolumn{3}{|l|}{\textsl{«category.categoryName.getTexCompatibleString()»}}\\\hline
	\textbf{Field Name} & \textbf{Target} & \textbf{Description}\\
	\hline
	\endhead
	\hline
	\multicolumn{3}{r@{}}{continued \ldots}\\
	\endfoot
	\hline
	\endlastfoot
	\hline
	«FOR field : category.fields»
	%GENERATED, DO NOT MODIFY HERE!!!
	\cfield{«field.value.getTexCompatibleString»} 
		& 
		«field.getIconForActionType("type")» 
		«field.getIconForActionType("method")» 
		«field.getIconForActionType("field")» 
		«field.getIconForActionType("tryCatch")» 
		«field.getIconForActionType("varusage")» 
		& «field.desc» \\
	«ENDFOR»
	\hline
	\caption{Lucene Fields in category \cquote{«category.categoryName.getTexCompatibleString»}\label{tab:FieldCategory«category.categoryName.getTexCompatibleString»Fields}}
\end{longtable}
		
		«ENDFOR»
		
% End of generated file'''
	}
	
	def getIconForActionType(Field field, String t) {
		if(field.hasActionOfType(t)) {
			'''\includegraphics[width=0.9em]{img-src/icons/«t».png}'''
		} else {
			'''\includegraphics[width=0.9em]{img-src/icons/empty.png}'''
		}
	}
	
	def getTexCompatibleString(String s) {
		s.replace('_', '\\_')
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

«doNotModify»

public class «m.className» {
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
	
	/**
     * Java handle used to open a given java element in an editor.
     */
    public static final String JAVA_ELEMENT_HANDLE = "Handle";
    
	«FOR category : m.fieldCategories»
	//GENERATED, DO NOT MODIFY HERE!!!
	// «category.categoryName»
		«FOR field : category.fields»
	«field.compile»
		«ENDFOR»
	
	
	«ENDFOR»
}
'''
	}
	
	def compile(Field f) {
'''	/** «f.desc»<br /><br />
		Can be applied to: «FOR t : f.types»«if(f.types.indexOf(t)>0){', '}»«t.toTypeName»«ENDFOR»
	*/
	//GENERATED, DO NOT MODIFY HERE!!!
	public final static String «f.name» = "«f.value»";'''
	}
	
	def toTypeName(FieldType t) {
		if(t.type) {
			return "type"
		}
		if(t.method) {
			return "method"
		}
		if(t.field) {
			return "field"
		}
		if(t.trycatch) {
			return "tryCatch"
		}
		if(t.varusage) {
			return "varusage"
		}
		
		return "N/A"
	}
	
	def hasActionOfType(Field f, String tDesired) {
		for(FieldType t : f.types) {
			if(t.toTypeName.equals(tDesired)) {
				return true
			}
		}
		
		return false
	}
	
	def doNotModify() {
'''/*
* This is a generated file. Do not modify. Modify source file instead.
*/'''
	}
}
