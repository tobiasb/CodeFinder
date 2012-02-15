/*
* generated by Xtext
*/
grammar InternalQL1;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.services.QL1GrammarAccess;

}

@parser::members {

 	private QL1GrammarAccess grammarAccess;
 	
    public InternalQL1Parser(TokenStream input, QL1GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MethodPattern";	
   	}
   	
   	@Override
   	protected QL1GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMethodPattern
entryRuleMethodPattern returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMethodPatternRule()); }
	 iv_ruleMethodPattern=ruleMethodPattern 
	 { $current=$iv_ruleMethodPattern.current; } 
	 EOF 
;

// Rule MethodPattern
ruleMethodPattern returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternAccess().getModifiersModifierParserRuleCall_0_0()); 
	    }
		lv_modifiers_0_0=ruleModifier		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternRule());
	        }
       		add(
       			$current, 
       			"modifiers",
        		lv_modifiers_0_0, 
        		"Modifier");
	        afterParserOrEnumRuleCall();
	    }

)
)*((
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternAccess().getReturnTypeTypeParserRuleCall_1_0_0()); 
	    }
		lv_returnType_1_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternRule());
	        }
       		set(
       			$current, 
       			"returnType",
        		lv_returnType_1_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='.' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMethodPatternAccess().getFullStopKeyword_1_1());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternAccess().getMethodMethodParserRuleCall_2_0()); 
	    }
		lv_method_3_0=ruleMethod		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternRule());
	        }
       		set(
       			$current, 
       			"method",
        		lv_method_3_0, 
        		"Method");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='(' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMethodPatternAccess().getLeftParenthesisKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternAccess().getParameterTypesParameterTypeParserRuleCall_3_1_0()); 
	    }
		lv_parameterTypes_5_0=ruleParameterType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternRule());
	        }
       		add(
       			$current, 
       			"parameterTypes",
        		lv_parameterTypes_5_0, 
        		"ParameterType");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMethodPatternAccess().getRightParenthesisKeyword_3_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 
	    }
		lv_throwsClause_7_0=ruleThrows		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternRule());
	        }
       		set(
       			$current, 
       			"throwsClause",
        		lv_throwsClause_7_0, 
        		"Throws");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleModifier
entryRuleModifier returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModifierRule()); }
	 iv_ruleModifier=ruleModifier 
	 { $current=$iv_ruleModifier.current; } 
	 EOF 
;

// Rule Modifier
ruleModifier returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_value_0_0=	'static' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getModifierAccess().getValueStaticKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "static");
	    }

)
)
    |(
(
		lv_value_1_0=	'private' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getModifierAccess().getValuePrivateKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_0, "private");
	    }

)
)
    |(
(
		lv_value_2_0=	'public' 
    {
        newLeafNode(lv_value_2_0, grammarAccess.getModifierAccess().getValuePublicKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_2_0, "public");
	    }

)
)
    |(
(
		lv_value_3_0=	'final' 
    {
        newLeafNode(lv_value_3_0, grammarAccess.getModifierAccess().getValueFinalKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_3_0, "final");
	    }

)
)
    |(
(
		lv_value_4_0=	'abstract' 
    {
        newLeafNode(lv_value_4_0, grammarAccess.getModifierAccess().getValueAbstractKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_4_0, "abstract");
	    }

)
)
    |(
(
		lv_value_5_0=	'protected' 
    {
        newLeafNode(lv_value_5_0, grammarAccess.getModifierAccess().getValueProtectedKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_5_0, "protected");
	    }

)
)
    |(
(
		lv_value_6_0=	'*' 
    {
        newLeafNode(lv_value_6_0, grammarAccess.getModifierAccess().getValueAsteriskKeyword_6_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModifierRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_6_0, "*");
	    }

)
))
;





// Entry rule entryRuleType
entryRuleType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); } 
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current.getText(); }  
	 EOF 
;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_NameWithWC_0=RULE_NAMEWITHWC    {
		$current.merge(this_NameWithWC_0);
    }

    { 
    newLeafNode(this_NameWithWC_0, grammarAccess.getTypeAccess().getNameWithWCTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleParameterType
entryRuleParameterType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterTypeRule()); } 
	 iv_ruleParameterType=ruleParameterType 
	 { $current=$iv_ruleParameterType.current.getText(); }  
	 EOF 
;

// Rule ParameterType
ruleParameterType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_NameWithWC_0=RULE_NAMEWITHWC    {
		$current.merge(this_NameWithWC_0);
    }

    { 
    newLeafNode(this_NameWithWC_0, grammarAccess.getParameterTypeAccess().getNameWithWCTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleThrows
entryRuleThrows returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getThrowsRule()); }
	 iv_ruleThrows=ruleThrows 
	 { $current=$iv_ruleThrows.current; } 
	 EOF 
;

// Rule Throws
ruleThrows returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='throws' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getThrowsAccess().getThrowsKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getThrowsAccess().getThrownTypeTypeParserRuleCall_1_0()); 
	    }
		lv_thrownType_1_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getThrowsRule());
	        }
       		set(
       			$current, 
       			"thrownType",
        		lv_thrownType_1_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMethod
entryRuleMethod returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getMethodRule()); } 
	 iv_ruleMethod=ruleMethod 
	 { $current=$iv_ruleMethod.current.getText(); }  
	 EOF 
;

// Rule Method
ruleMethod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_NameWithWC_0=RULE_NAMEWITHWC    {
		$current.merge(this_NameWithWC_0);
    }

    { 
    newLeafNode(this_NameWithWC_0, grammarAccess.getMethodAccess().getNameWithWCTerminalRuleCall()); 
    }

    ;





RULE_NAMEWITHWC : ('a'..'z'|'A'..'Z'|'_'|'*'|'?'|'<'|'>'|'['|']') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'*'|'?'|'<'|'>'|'['|']'|'.')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


