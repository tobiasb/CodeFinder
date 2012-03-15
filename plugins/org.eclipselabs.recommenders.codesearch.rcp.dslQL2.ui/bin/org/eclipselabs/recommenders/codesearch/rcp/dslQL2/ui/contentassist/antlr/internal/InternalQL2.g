/*
* generated by Xtext
*/
grammar InternalQL2;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.antlr.internal; 

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
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.services.QL2GrammarAccess;

}

@parser::members {
 
 	private QL2GrammarAccess grammarAccess;
 	
    public void setGrammarAccess(QL2GrammarAccess grammarAccess) {
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



// Entry rule entryRuleStatement
entryRuleStatement 
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStatementAccess().getAlternatives()); }
(rule__Statement__Alternatives)
{ after(grammarAccess.getStatementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVarDef
entryRuleVarDef 
:
{ before(grammarAccess.getVarDefRule()); }
	 ruleVarDef
{ after(grammarAccess.getVarDefRule()); } 
	 EOF 
;

// Rule VarDef
ruleVarDef
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVarDefAccess().getAlternatives()); }
(rule__VarDef__Alternatives)
{ after(grammarAccess.getVarDefAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVarInitialisation
entryRuleVarInitialisation 
:
{ before(grammarAccess.getVarInitialisationRule()); }
	 ruleVarInitialisation
{ after(grammarAccess.getVarInitialisationRule()); } 
	 EOF 
;

// Rule VarInitialisation
ruleVarInitialisation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVarInitialisationAccess().getGroup()); }
(rule__VarInitialisation__Group__0)
{ after(grammarAccess.getVarInitialisationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVarDeclaration
entryRuleVarDeclaration 
:
{ before(grammarAccess.getVarDeclarationRule()); }
	 ruleVarDeclaration
{ after(grammarAccess.getVarDeclarationRule()); } 
	 EOF 
;

// Rule VarDeclaration
ruleVarDeclaration
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVarDeclarationAccess().getGroup()); }
(rule__VarDeclaration__Group__0)
{ after(grammarAccess.getVarDeclarationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMethodCall
entryRuleMethodCall 
:
{ before(grammarAccess.getMethodCallRule()); }
	 ruleMethodCall
{ after(grammarAccess.getMethodCallRule()); } 
	 EOF 
;

// Rule MethodCall
ruleMethodCall
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMethodCallAccess().getGroup()); }
(rule__MethodCall__Group__0)
{ after(grammarAccess.getMethodCallAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVarName
entryRuleVarName 
:
{ before(grammarAccess.getVarNameRule()); }
	 ruleVarName
{ after(grammarAccess.getVarNameRule()); } 
	 EOF 
;

// Rule VarName
ruleVarName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVarNameAccess().getNameWithWCTerminalRuleCall()); }
	RULE_NAMEWITHWC
{ after(grammarAccess.getVarNameAccess().getNameWithWCTerminalRuleCall()); }
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
{ before(grammarAccess.getTypeAccess().getNameWithWCTerminalRuleCall()); }
	RULE_NAMEWITHWC
{ after(grammarAccess.getTypeAccess().getNameWithWCTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Statement__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStatementAccess().getVarDefParserRuleCall_0()); }
	ruleVarDef
{ after(grammarAccess.getStatementAccess().getVarDefParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1()); }
	ruleMethodCall
{ after(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VarDef__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDefAccess().getVarsAssignment_0()); }
(rule__VarDef__VarsAssignment_0)
{ after(grammarAccess.getVarDefAccess().getVarsAssignment_0()); }
)

    |(
{ before(grammarAccess.getVarDefAccess().getVarsAssignment_1()); }
(rule__VarDef__VarsAssignment_1)
{ after(grammarAccess.getVarDefAccess().getVarsAssignment_1()); }
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
{ before(grammarAccess.getModelAccess().getModelAction_0()); }
(

)
{ after(grammarAccess.getModelAccess().getModelAction_0()); }
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
{ before(grammarAccess.getModelAccess().getGroup_1()); }
(rule__Model__Group_1__0)?
{ after(grammarAccess.getModelAccess().getGroup_1()); }
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
{ before(grammarAccess.getModelAccess().getStatementsAssignment_2()); }
(rule__Model__StatementsAssignment_2)*
{ after(grammarAccess.getModelAccess().getStatementsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Model__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_1__0__Impl
	rule__Model__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0()); }

	'(' 

{ after(grammarAccess.getModelAccess().getLeftParenthesisKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_1__1__Impl
	rule__Model__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getVarsAssignment_1_1()); }
(rule__Model__VarsAssignment_1_1)
{ after(grammarAccess.getModelAccess().getVarsAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_1__2__Impl
	rule__Model__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getGroup_1_2()); }
(rule__Model__Group_1_2__0)*
{ after(grammarAccess.getModelAccess().getGroup_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3()); }

	')' 

{ after(grammarAccess.getModelAccess().getRightParenthesisKeyword_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Model__Group_1_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_1_2__0__Impl
	rule__Model__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getCommaKeyword_1_2_0()); }

	',' 

{ after(grammarAccess.getModelAccess().getCommaKeyword_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_1_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getVarsAssignment_1_2_1()); }
(rule__Model__VarsAssignment_1_2_1)
{ after(grammarAccess.getModelAccess().getVarsAssignment_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__VarInitialisation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarInitialisation__Group__0__Impl
	rule__VarInitialisation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarInitialisation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarInitialisationAccess().getTypeAssignment_0()); }
(rule__VarInitialisation__TypeAssignment_0)
{ after(grammarAccess.getVarInitialisationAccess().getTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VarInitialisation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarInitialisation__Group__1__Impl
	rule__VarInitialisation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VarInitialisation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarInitialisationAccess().getNameAssignment_1()); }
(rule__VarInitialisation__NameAssignment_1)
{ after(grammarAccess.getVarInitialisationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VarInitialisation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarInitialisation__Group__2__Impl
	rule__VarInitialisation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VarInitialisation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2()); }

	'=' 

{ after(grammarAccess.getVarInitialisationAccess().getEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VarInitialisation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarInitialisation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarInitialisation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3()); }

	'*' 

{ after(grammarAccess.getVarInitialisationAccess().getAsteriskKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__VarDeclaration__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarDeclaration__Group__0__Impl
	rule__VarDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); }
(rule__VarDeclaration__TypeAssignment_0)
{ after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VarDeclaration__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarDeclaration__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); }
(rule__VarDeclaration__NameAssignment_1)
{ after(grammarAccess.getVarDeclarationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__MethodCall__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodCall__Group__0__Impl
	rule__MethodCall__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodCall__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodCallAccess().getNameAssignment_0()); }
(rule__MethodCall__NameAssignment_0)
{ after(grammarAccess.getMethodCallAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MethodCall__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodCall__Group__1__Impl
	rule__MethodCall__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodCall__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); }

	'.' 

{ after(grammarAccess.getMethodCallAccess().getFullStopKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MethodCall__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodCall__Group__2__Impl
	rule__MethodCall__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodCall__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); }
(rule__MethodCall__MethodAssignment_2)
{ after(grammarAccess.getMethodCallAccess().getMethodAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MethodCall__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodCall__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodCall__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_3()); }

	'()' 

{ after(grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__Model__VarsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_1_0()); }
	ruleVarDeclaration{ after(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__VarsAssignment_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_2_1_0()); }
	ruleVarDeclaration{ after(grammarAccess.getModelAccess().getVarsVarDeclarationParserRuleCall_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__StatementsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_0()); }
	ruleStatement{ after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VarDef__VarsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDefAccess().getVarsVarInitialisationParserRuleCall_0_0()); }
	ruleVarInitialisation{ after(grammarAccess.getVarDefAccess().getVarsVarInitialisationParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VarDef__VarsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDefAccess().getVarsVarDeclarationParserRuleCall_1_0()); }
	ruleVarDeclaration{ after(grammarAccess.getVarDefAccess().getVarsVarDeclarationParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VarInitialisation__TypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0()); }
	ruleType{ after(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VarInitialisation__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarInitialisationAccess().getNameVarNameParserRuleCall_1_0()); }
	ruleVarName{ after(grammarAccess.getVarInitialisationAccess().getNameVarNameParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__TypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); }
	ruleType{ after(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDeclarationAccess().getNameVarNameParserRuleCall_1_0()); }
	ruleVarName{ after(grammarAccess.getVarDeclarationAccess().getNameVarNameParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MethodCall__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodCallAccess().getNameVarNameParserRuleCall_0_0()); }
	ruleVarName{ after(grammarAccess.getMethodCallAccess().getNameVarNameParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MethodCall__MethodAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodCallAccess().getMethodNameWithWCTerminalRuleCall_2_0()); }
	RULE_NAMEWITHWC{ after(grammarAccess.getMethodCallAccess().getMethodNameWithWCTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_NAMEWITHWC : ('a'..'z'|'A'..'Z'|'_'|'*'|'?') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'*'|'?'|'.'|'/')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


