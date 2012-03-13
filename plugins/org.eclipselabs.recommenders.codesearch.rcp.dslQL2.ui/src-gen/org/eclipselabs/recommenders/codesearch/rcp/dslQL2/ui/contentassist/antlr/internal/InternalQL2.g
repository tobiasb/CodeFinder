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
{ before(grammarAccess.getStatementAccess().getVarDefParserRuleCall()); }
	ruleVarDef
{ after(grammarAccess.getStatementAccess().getVarDefParserRuleCall()); }
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
{ before(grammarAccess.getVarDefAccess().getGroup()); }
(rule__VarDef__Group__0)
{ after(grammarAccess.getVarDefAccess().getGroup()); }
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
{ before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0()); }

	'{' 

{ after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_0()); }
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
{ before(grammarAccess.getModelAccess().getStatementsAssignment_1()); }
(rule__Model__StatementsAssignment_1)*
{ after(grammarAccess.getModelAccess().getStatementsAssignment_1()); }
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
{ before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2()); }

	'}' 

{ after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__VarDef__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarDef__Group__0__Impl
	rule__VarDef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDef__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDefAccess().getTypeAssignment_0()); }
(rule__VarDef__TypeAssignment_0)
{ after(grammarAccess.getVarDefAccess().getTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VarDef__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarDef__Group__1__Impl
	rule__VarDef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDef__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDefAccess().getNameAssignment_1()); }
(rule__VarDef__NameAssignment_1)
{ after(grammarAccess.getVarDefAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VarDef__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarDef__Group__2__Impl
	rule__VarDef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDef__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDefAccess().getEqualsSignKeyword_2()); }

	'=' 

{ after(grammarAccess.getVarDefAccess().getEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VarDef__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VarDef__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDef__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDefAccess().getAsteriskKeyword_3()); }

	'*' 

{ after(grammarAccess.getVarDefAccess().getAsteriskKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__Model__StatementsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0()); }
	ruleStatement{ after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VarDef__TypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDefAccess().getTypeTypeParserRuleCall_0_0()); }
	ruleType{ after(grammarAccess.getVarDefAccess().getTypeTypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VarDef__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0()); }
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

