/*
* generated by Xtext
*/
grammar InternalQL1;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.ui.contentassist.antlr.internal; 

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
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.services.QL1GrammarAccess;

}

@parser::members {
 
 	private QL1GrammarAccess grammarAccess;
 	
    public void setGrammarAccess(QL1GrammarAccess grammarAccess) {
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




// Entry rule entryRuleExp1
entryRuleExp1 
:
{ before(grammarAccess.getExp1Rule()); }
	 ruleExp1
{ after(grammarAccess.getExp1Rule()); } 
	 EOF 
;

// Rule Exp1
ruleExp1
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExp1Access().getGroup()); }
(rule__Exp1__Group__0)
{ after(grammarAccess.getExp1Access().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFieldExpr
entryRuleFieldExpr 
:
{ before(grammarAccess.getFieldExprRule()); }
	 ruleFieldExpr
{ after(grammarAccess.getFieldExprRule()); } 
	 EOF 
;

// Rule FieldExpr
ruleFieldExpr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldExprAccess().getAlternatives()); }
(rule__FieldExpr__Alternatives)
{ after(grammarAccess.getFieldExprAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleType
entryRuleType 
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeAccess().getAlternatives()); }
(rule__Type__Alternatives)
{ after(grammarAccess.getTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSingleValueField
entryRuleSingleValueField 
:
{ before(grammarAccess.getSingleValueFieldRule()); }
	 ruleSingleValueField
{ after(grammarAccess.getSingleValueFieldRule()); } 
	 EOF 
;

// Rule SingleValueField
ruleSingleValueField
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSingleValueFieldAccess().getGroup()); }
(rule__SingleValueField__Group__0)
{ after(grammarAccess.getSingleValueFieldAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMultiValueField
entryRuleMultiValueField 
:
{ before(grammarAccess.getMultiValueFieldRule()); }
	 ruleMultiValueField
{ after(grammarAccess.getMultiValueFieldRule()); } 
	 EOF 
;

// Rule MultiValueField
ruleMultiValueField
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMultiValueFieldAccess().getGroup()); }
(rule__MultiValueField__Group__0)
{ after(grammarAccess.getMultiValueFieldAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBooleanField
entryRuleBooleanField 
:
{ before(grammarAccess.getBooleanFieldRule()); }
	 ruleBooleanField
{ after(grammarAccess.getBooleanFieldRule()); } 
	 EOF 
;

// Rule BooleanField
ruleBooleanField
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBooleanFieldAccess().getGroup()); }
(rule__BooleanField__Group__0)
{ after(grammarAccess.getBooleanFieldAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSingleValueFieldName
entryRuleSingleValueFieldName 
:
{ before(grammarAccess.getSingleValueFieldNameRule()); }
	 ruleSingleValueFieldName
{ after(grammarAccess.getSingleValueFieldNameRule()); } 
	 EOF 
;

// Rule SingleValueFieldName
ruleSingleValueFieldName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSingleValueFieldNameAccess().getValueAssignment()); }
(rule__SingleValueFieldName__ValueAssignment)
{ after(grammarAccess.getSingleValueFieldNameAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMultiValueFieldName
entryRuleMultiValueFieldName 
:
{ before(grammarAccess.getMultiValueFieldNameRule()); }
	 ruleMultiValueFieldName
{ after(grammarAccess.getMultiValueFieldNameRule()); } 
	 EOF 
;

// Rule MultiValueFieldName
ruleMultiValueFieldName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMultiValueFieldNameAccess().getValueAssignment()); }
(rule__MultiValueFieldName__ValueAssignment)
{ after(grammarAccess.getMultiValueFieldNameAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNegation
entryRuleNegation 
:
{ before(grammarAccess.getNegationRule()); }
	 ruleNegation
{ after(grammarAccess.getNegationRule()); } 
	 EOF 
;

// Rule Negation
ruleNegation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNegationAccess().getValueAssignment()); }
(rule__Negation__ValueAssignment)
{ after(grammarAccess.getNegationAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__FieldExpr__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldExprAccess().getSingleValueFieldParserRuleCall_0()); }
	ruleSingleValueField
{ after(grammarAccess.getFieldExprAccess().getSingleValueFieldParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getFieldExprAccess().getMultiValueFieldParserRuleCall_1()); }
	ruleMultiValueField
{ after(grammarAccess.getFieldExprAccess().getMultiValueFieldParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getFieldExprAccess().getBooleanFieldParserRuleCall_2()); }
	ruleBooleanField
{ after(grammarAccess.getFieldExprAccess().getBooleanFieldParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getValueAssignment_0()); }
(rule__Type__ValueAssignment_0)
{ after(grammarAccess.getTypeAccess().getValueAssignment_0()); }
)

    |(
{ before(grammarAccess.getTypeAccess().getMethodAssignment_1()); }
(rule__Type__MethodAssignment_1)
{ after(grammarAccess.getTypeAccess().getMethodAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Alternatives_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_0()); }
(rule__MultiValueField__ValuesAssignment_2_0)
{ after(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_0()); }
)

    |(
{ before(grammarAccess.getMultiValueFieldAccess().getGroup_2_1()); }
(rule__MultiValueField__Group_2_1__0)
{ after(grammarAccess.getMultiValueFieldAccess().getGroup_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__Alternatives_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_0()); }
(rule__BooleanField__ValueAssignment_1_0)
{ after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_0()); }
)

    |(
{ before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_1()); }
(rule__BooleanField__ValueAssignment_1_1)
{ after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_1()); }
)

    |(
{ before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_2()); }
(rule__BooleanField__ValueAssignment_1_2)
{ after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_2()); }
)

    |(
{ before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_3()); }
(rule__BooleanField__ValueAssignment_1_3)
{ after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_3()); }
)

    |(
{ before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_4()); }
(rule__BooleanField__ValueAssignment_1_4)
{ after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_4()); }
)

    |(
{ before(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_5()); }
(rule__BooleanField__ValueAssignment_1_5)
{ after(grammarAccess.getBooleanFieldAccess().getValueAssignment_1_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Exp1__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Exp1__Group__0__Impl
	rule__Exp1__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp1__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExp1Access().getTypeAssignment_0()); }
(rule__Exp1__TypeAssignment_0)
{ after(grammarAccess.getExp1Access().getTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Exp1__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Exp1__Group__1__Impl
	rule__Exp1__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp1__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExp1Access().getWhereKeyword_1()); }

	'where' 

{ after(grammarAccess.getExp1Access().getWhereKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Exp1__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Exp1__Group__2__Impl
	rule__Exp1__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp1__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExp1Access().getFieldExprAssignment_2()); }
(rule__Exp1__FieldExprAssignment_2)
{ after(grammarAccess.getExp1Access().getFieldExprAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Exp1__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Exp1__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp1__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExp1Access().getGroup_3()); }
(rule__Exp1__Group_3__0)*
{ after(grammarAccess.getExp1Access().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Exp1__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Exp1__Group_3__0__Impl
	rule__Exp1__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp1__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExp1Access().getCommaKeyword_3_0()); }

	',' 

{ after(grammarAccess.getExp1Access().getCommaKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Exp1__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Exp1__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp1__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExp1Access().getFieldExprAssignment_3_1()); }
(rule__Exp1__FieldExprAssignment_3_1)
{ after(grammarAccess.getExp1Access().getFieldExprAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SingleValueField__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SingleValueField__Group__0__Impl
	rule__SingleValueField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValueField__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSingleValueFieldAccess().getNameAssignment_0()); }
(rule__SingleValueField__NameAssignment_0)
{ after(grammarAccess.getSingleValueFieldAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SingleValueField__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SingleValueField__Group__1__Impl
	rule__SingleValueField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValueField__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSingleValueFieldAccess().getNAssignment_1()); }
(rule__SingleValueField__NAssignment_1)?
{ after(grammarAccess.getSingleValueFieldAccess().getNAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SingleValueField__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SingleValueField__Group__2__Impl
	rule__SingleValueField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValueField__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSingleValueFieldAccess().getIsKeyword_2()); }

	'is' 

{ after(grammarAccess.getSingleValueFieldAccess().getIsKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SingleValueField__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SingleValueField__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValueField__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSingleValueFieldAccess().getValueAssignment_3()); }
(rule__SingleValueField__ValueAssignment_3)
{ after(grammarAccess.getSingleValueFieldAccess().getValueAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MultiValueField__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiValueField__Group__0__Impl
	rule__MultiValueField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getNameAssignment_0()); }
(rule__MultiValueField__NameAssignment_0)
{ after(grammarAccess.getMultiValueFieldAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MultiValueField__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiValueField__Group__1__Impl
	rule__MultiValueField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getHasKeyword_1()); }

	'has' 

{ after(grammarAccess.getMultiValueFieldAccess().getHasKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MultiValueField__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiValueField__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getAlternatives_2()); }
(rule__MultiValueField__Alternatives_2)
{ after(grammarAccess.getMultiValueFieldAccess().getAlternatives_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__MultiValueField__Group_2_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiValueField__Group_2_1__0__Impl
	rule__MultiValueField__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Group_2_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getLeftParenthesisKeyword_2_1_0()); }

	'(' 

{ after(grammarAccess.getMultiValueFieldAccess().getLeftParenthesisKeyword_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MultiValueField__Group_2_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiValueField__Group_2_1__1__Impl
	rule__MultiValueField__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Group_2_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_1_1()); }
(rule__MultiValueField__ValuesAssignment_2_1_1)
{ after(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MultiValueField__Group_2_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiValueField__Group_2_1__2__Impl
	rule__MultiValueField__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Group_2_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getGroup_2_1_2()); }
(rule__MultiValueField__Group_2_1_2__0)
{ after(grammarAccess.getMultiValueFieldAccess().getGroup_2_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MultiValueField__Group_2_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiValueField__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Group_2_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getRightParenthesisKeyword_2_1_3()); }

	')' 

{ after(grammarAccess.getMultiValueFieldAccess().getRightParenthesisKeyword_2_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MultiValueField__Group_2_1_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiValueField__Group_2_1_2__0__Impl
	rule__MultiValueField__Group_2_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Group_2_1_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getCommaKeyword_2_1_2_0()); }

	',' 

{ after(grammarAccess.getMultiValueFieldAccess().getCommaKeyword_2_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MultiValueField__Group_2_1_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MultiValueField__Group_2_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__Group_2_1_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_1_2_1()); }
(rule__MultiValueField__ValuesAssignment_2_1_2_1)
{ after(grammarAccess.getMultiValueFieldAccess().getValuesAssignment_2_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__BooleanField__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BooleanField__Group__0__Impl
	rule__BooleanField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getNAssignment_0()); }
(rule__BooleanField__NAssignment_0)?
{ after(grammarAccess.getBooleanFieldAccess().getNAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanField__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__BooleanField__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getAlternatives_1()); }
(rule__BooleanField__Alternatives_1)
{ after(grammarAccess.getBooleanFieldAccess().getAlternatives_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Exp1__TypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExp1Access().getTypeTypeParserRuleCall_0_0()); }
	ruleType{ after(grammarAccess.getExp1Access().getTypeTypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Exp1__FieldExprAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExp1Access().getFieldExprFieldExprParserRuleCall_2_0()); }
	ruleFieldExpr{ after(grammarAccess.getExp1Access().getFieldExprFieldExprParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Exp1__FieldExprAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExp1Access().getFieldExprFieldExprParserRuleCall_3_1_0()); }
	ruleFieldExpr{ after(grammarAccess.getExp1Access().getFieldExprFieldExprParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__ValueAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0()); }
(
{ before(grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0()); }

	'Methods' 

{ after(grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0()); }
)

{ after(grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__MethodAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0()); }
(
{ before(grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0()); }

	'Types' 

{ after(grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0()); }
)

{ after(grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValueField__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSingleValueFieldAccess().getNameSingleValueFieldNameParserRuleCall_0_0()); }
	ruleSingleValueFieldName{ after(grammarAccess.getSingleValueFieldAccess().getNameSingleValueFieldNameParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValueField__NAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSingleValueFieldAccess().getNNegationParserRuleCall_1_0()); }
	ruleNegation{ after(grammarAccess.getSingleValueFieldAccess().getNNegationParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValueField__ValueAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSingleValueFieldAccess().getValueNameWithWCTerminalRuleCall_3_0()); }
	RULE_NAMEWITHWC{ after(grammarAccess.getSingleValueFieldAccess().getValueNameWithWCTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getNameMultiValueFieldNameParserRuleCall_0_0()); }
	ruleMultiValueFieldName{ after(grammarAccess.getMultiValueFieldAccess().getNameMultiValueFieldNameParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__ValuesAssignment_2_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_0_0()); }
	RULE_NAMEWITHWC{ after(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__ValuesAssignment_2_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_1_0()); }
	RULE_NAMEWITHWC{ after(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueField__ValuesAssignment_2_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_2_1_0()); }
	RULE_NAMEWITHWC{ after(grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__NAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getNNegationParserRuleCall_0_0()); }
	ruleNegation{ after(grammarAccess.getBooleanFieldAccess().getNNegationParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__ValueAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0()); }
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0()); }

	'IsStatic' 

{ after(grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0()); }
)

{ after(grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__ValueAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0()); }
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0()); }

	'IsPrivate' 

{ after(grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0()); }
)

{ after(grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__ValueAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0()); }
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0()); }

	'IsPublic' 

{ after(grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0()); }
)

{ after(grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__ValueAssignment_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0()); }
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0()); }

	'IsFinal' 

{ after(grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0()); }
)

{ after(grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__ValueAssignment_1_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0()); }
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0()); }

	'IsAbstract' 

{ after(grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0()); }
)

{ after(grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanField__ValueAssignment_1_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0()); }
(
{ before(grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0()); }

	'IsProtected' 

{ after(grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0()); }
)

{ after(grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SingleValueFieldName__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0()); }
(
{ before(grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0()); }

	'Name' 

{ after(grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0()); }
)

{ after(grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MultiValueFieldName__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0()); }
(
{ before(grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0()); }

	'CalledMethods' 

{ after(grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0()); }
)

{ after(grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Negation__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0()); }
(
{ before(grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0()); }

	'!' 

{ after(grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0()); }
)

{ after(grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_NAMEWITHWC : ('a'..'z'|'A'..'Z'|'_'|'*'|'?'|'<'|'>'|'['|']') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'*'|'?'|'<'|'>'|'['|']'|'.')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


