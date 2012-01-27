/*
* generated by Xtext
*/
grammar InternalLuceneFields;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.services.LuceneFieldsGrammarAccess;

}

@parser::members {
 
 	private LuceneFieldsGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(LuceneFieldsGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFieldCategory
entryRuleFieldCategory 
:
{ before(grammarAccess.getFieldCategoryRule()); }
	 ruleFieldCategory
{ after(grammarAccess.getFieldCategoryRule()); } 
	 EOF 
;

// Rule FieldCategory
ruleFieldCategory
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldCategoryAccess().getGroup()); }
(rule__FieldCategory__Group__0)
{ after(grammarAccess.getFieldCategoryAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleField
entryRuleField 
:
{ before(grammarAccess.getFieldRule()); }
	 ruleField
{ after(grammarAccess.getFieldRule()); } 
	 EOF 
;

// Rule Field
ruleField
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldAccess().getGroup()); }
(rule__Field__Group__0)
{ after(grammarAccess.getFieldAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFieldType
entryRuleFieldType 
:
{ before(grammarAccess.getFieldTypeRule()); }
	 ruleFieldType
{ after(grammarAccess.getFieldTypeRule()); } 
	 EOF 
;

// Rule FieldType
ruleFieldType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldTypeAccess().getAlternatives()); }
(rule__FieldType__Alternatives)
{ after(grammarAccess.getFieldTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__FieldType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldTypeAccess().getClassTypeAssignment_0()); }
(rule__FieldType__ClassTypeAssignment_0)
{ after(grammarAccess.getFieldTypeAccess().getClassTypeAssignment_0()); }
)

    |(
{ before(grammarAccess.getFieldTypeAccess().getMethodTypeAssignment_1()); }
(rule__FieldType__MethodTypeAssignment_1)
{ after(grammarAccess.getFieldTypeAccess().getMethodTypeAssignment_1()); }
)

    |(
{ before(grammarAccess.getFieldTypeAccess().getFieldTypeAssignment_2()); }
(rule__FieldType__FieldTypeAssignment_2)
{ after(grammarAccess.getFieldTypeAccess().getFieldTypeAssignment_2()); }
)

    |(
{ before(grammarAccess.getFieldTypeAccess().getTrycatchTypeAssignment_3()); }
(rule__FieldType__TrycatchTypeAssignment_3)
{ after(grammarAccess.getFieldTypeAccess().getTrycatchTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getPackagesKeyword_0()); }

	'packages' 

{ after(grammarAccess.getModelAccess().getPackagesKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getPackageNamesAssignment_1()); }
(rule__Model__PackageNamesAssignment_1)*
{ after(grammarAccess.getModelAccess().getPackageNamesAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getClassKeyword_2()); }

	'class' 

{ after(grammarAccess.getModelAccess().getClassKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getClassNameAssignment_3()); }
(rule__Model__ClassNameAssignment_3)
{ after(grammarAccess.getModelAccess().getClassNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getFieldCategoriesAssignment_4()); }
(rule__Model__FieldCategoriesAssignment_4)*
{ after(grammarAccess.getModelAccess().getFieldCategoriesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__FieldCategory__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldCategory__Group__0__Impl
	rule__FieldCategory__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldCategory__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldCategoryAccess().getCategoryNameAssignment_0()); }
(rule__FieldCategory__CategoryNameAssignment_0)
{ after(grammarAccess.getFieldCategoryAccess().getCategoryNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldCategory__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldCategory__Group__1__Impl
	rule__FieldCategory__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldCategory__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldCategoryAccess().getLeftCurlyBracketKeyword_1()); }

	'{' 

{ after(grammarAccess.getFieldCategoryAccess().getLeftCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldCategory__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldCategory__Group__2__Impl
	rule__FieldCategory__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldCategory__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldCategoryAccess().getFieldsAssignment_2()); }
(rule__FieldCategory__FieldsAssignment_2)*
{ after(grammarAccess.getFieldCategoryAccess().getFieldsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FieldCategory__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FieldCategory__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldCategory__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getFieldCategoryAccess().getRightCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Field__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__0__Impl
	rule__Field__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getNameAssignment_0()); }
(rule__Field__NameAssignment_0)
{ after(grammarAccess.getFieldAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__1__Impl
	rule__Field__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__2__Impl
	rule__Field__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getValueAssignment_2()); }
(rule__Field__ValueAssignment_2)
{ after(grammarAccess.getFieldAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__3__Impl
	rule__Field__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__4__Impl
	rule__Field__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getTypesAssignment_4()); }
(rule__Field__TypesAssignment_4)
{ after(grammarAccess.getFieldAccess().getTypesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__5__Impl
	rule__Field__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getGroup_5()); }
(rule__Field__Group_5__0)*
{ after(grammarAccess.getFieldAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Field__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_5__0__Impl
	rule__Field__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getCommaKeyword_5_0()); }

	',' 

{ after(grammarAccess.getFieldAccess().getCommaKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getTypesAssignment_5_1()); }
(rule__Field__TypesAssignment_5_1)
{ after(grammarAccess.getFieldAccess().getTypesAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__PackageNamesAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getPackageNamesSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getModelAccess().getPackageNamesSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ClassNameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getModelAccess().getClassNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__FieldCategoriesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_4_0()); }
	ruleFieldCategory{ after(grammarAccess.getModelAccess().getFieldCategoriesFieldCategoryParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldCategory__CategoryNameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldCategoryAccess().getCategoryNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getFieldCategoryAccess().getCategoryNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldCategory__FieldsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); }
	ruleField{ after(grammarAccess.getFieldCategoryAccess().getFieldsFieldParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getFieldAccess().getValueSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__TypesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); }
	ruleFieldType{ after(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__TypesAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); }
	ruleFieldType{ after(grammarAccess.getFieldAccess().getTypesFieldTypeParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldType__ClassTypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); }
(
{ before(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); }

	'class' 

{ after(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); }
)

{ after(grammarAccess.getFieldTypeAccess().getClassTypeClassKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldType__MethodTypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); }
(
{ before(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); }

	'method' 

{ after(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); }
)

{ after(grammarAccess.getFieldTypeAccess().getMethodTypeMethodKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldType__FieldTypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); }
(
{ before(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); }

	'field' 

{ after(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); }
)

{ after(grammarAccess.getFieldTypeAccess().getFieldTypeFieldKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FieldType__TrycatchTypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); }
(
{ before(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); }

	'trycatch' 

{ after(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); }
)

{ after(grammarAccess.getFieldTypeAccess().getTrycatchTypeTrycatchKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


