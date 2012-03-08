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
(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternAccess().getDefinitionMethodPatternDefinitionParserRuleCall_0()); 
	    }
		lv_definition_0_0=ruleMethodPatternDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternRule());
	        }
       		set(
       			$current, 
       			"definition",
        		lv_definition_0_0, 
        		"MethodPatternDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleMethodPatternDefinition
entryRuleMethodPatternDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMethodPatternDefinitionRule()); }
	 iv_ruleMethodPatternDefinition=ruleMethodPatternDefinition 
	 { $current=$iv_ruleMethodPatternDefinition.current; } 
	 EOF 
;

// Rule MethodPatternDefinition
ruleMethodPatternDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getModifiersModifierParserRuleCall_0_0()); 
	    }
		lv_modifiers_0_0=ruleModifier		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
	        }
       		add(
       			$current, 
       			"modifiers",
        		lv_modifiers_0_0, 
        		"Modifier");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getReturnTypeReturnTypeParserRuleCall_1_0()); 
	    }
		lv_returnType_1_0=ruleReturnType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
	        }
       		set(
       			$current, 
       			"returnType",
        		lv_returnType_1_0, 
        		"ReturnType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getMethodNameMethodNameParserRuleCall_2_0()); 
	    }
		lv_methodName_2_0=ruleMethodName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
	        }
       		set(
       			$current, 
       			"methodName",
        		lv_methodName_2_0, 
        		"MethodName");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getParameterDefinitionParameterDefinitionParserRuleCall_3_0()); 
	    }
		lv_parameterDefinition_3_0=ruleParameterDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
	        }
       		set(
       			$current, 
       			"parameterDefinition",
        		lv_parameterDefinition_3_0, 
        		"ParameterDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodPatternDefinitionAccess().getThrowsClauseThrowsParserRuleCall_4_0()); 
	    }
		lv_throwsClause_4_0=ruleThrows		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodPatternDefinitionRule());
	        }
       		set(
       			$current, 
       			"throwsClause",
        		lv_throwsClause_4_0, 
        		"Throws");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleParameterDefinition
entryRuleParameterDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterDefinitionRule()); }
	 iv_ruleParameterDefinition=ruleParameterDefinition 
	 { $current=$iv_ruleParameterDefinition.current; } 
	 EOF 
;

// Rule ParameterDefinition
ruleParameterDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParameterDefinitionAccess().getLeftParenthesisKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_1_0()); 
	    }
		lv_parameterElementholder_1_0=ruleParameterElementHolder		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
	        }
       		add(
       			$current, 
       			"parameterElementholder",
        		lv_parameterElementholder_1_0, 
        		"ParameterElementHolder");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getParameterDefinitionAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterDefinitionAccess().getParameterElementholderParameterElementHolderParserRuleCall_2_1_0()); 
	    }
		lv_parameterElementholder_3_0=ruleParameterElementHolder		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterDefinitionRule());
	        }
       		add(
       			$current, 
       			"parameterElementholder",
        		lv_parameterElementholder_3_0, 
        		"ParameterElementHolder");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getParameterDefinitionAccess().getRightParenthesisKeyword_3());
    }
)
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
))
;





// Entry rule entryRuleReturnType
entryRuleReturnType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getReturnTypeRule()); }
	 iv_ruleReturnType=ruleReturnType 
	 { $current=$iv_ruleReturnType.current; } 
	 EOF 
;

// Rule ReturnType
ruleReturnType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_NAMEWITHWC
		{
			newLeafNode(lv_value_0_0, grammarAccess.getReturnTypeAccess().getValueNameWithWCTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getReturnTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"NameWithWC");
	    }

)
)
;





// Entry rule entryRuleParameterElementHolder
entryRuleParameterElementHolder returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterElementHolderRule()); }
	 iv_ruleParameterElementHolder=ruleParameterElementHolder 
	 { $current=$iv_ruleParameterElementHolder.current; } 
	 EOF 
;

// Rule ParameterElementHolder
ruleParameterElementHolder returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getParameterElementHolderAccess().getElementSingleElementParserRuleCall_0_0()); 
	    }
		lv_element_0_0=ruleSingleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterElementHolderRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_0_0, 
        		"SingleElement");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterElementHolderAccess().getElementMultiElementParserRuleCall_1_0()); 
	    }
		lv_element_1_0=ruleMultiElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterElementHolderRule());
	        }
       		set(
       			$current, 
       			"element",
        		lv_element_1_0, 
        		"MultiElement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleSingleElement
entryRuleSingleElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleElementRule()); }
	 iv_ruleSingleElement=ruleSingleElement 
	 { $current=$iv_ruleSingleElement.current; } 
	 EOF 
;

// Rule SingleElement
ruleSingleElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleElementAccess().getValueParameterTypeParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleParameterType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleElementRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"ParameterType");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleMultiElement
entryRuleMultiElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiElementRule()); }
	 iv_ruleMultiElement=ruleMultiElement 
	 { $current=$iv_ruleMultiElement.current; } 
	 EOF 
;

// Rule MultiElement
ruleMultiElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMultiElementAccess().getLeftCurlyBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_1_0()); 
	    }
		lv_elements_1_0=ruleSingleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiElementRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_1_0, 
        		"SingleElement");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='|' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMultiElementAccess().getVerticalLineKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMultiElementAccess().getElementsSingleElementParserRuleCall_2_1_0()); 
	    }
		lv_elements_3_0=ruleSingleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiElementRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_3_0, 
        		"SingleElement");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMultiElementAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleParameterType
entryRuleParameterType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterTypeRule()); }
	 iv_ruleParameterType=ruleParameterType 
	 { $current=$iv_ruleParameterType.current; } 
	 EOF 
;

// Rule ParameterType
ruleParameterType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_value_0_0=RULE_NAMEWITHWC
		{
			newLeafNode(lv_value_0_0, grammarAccess.getParameterTypeAccess().getValueNameWithWCTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"NameWithWC");
	    }

)
)
    |(
(
		lv_value_1_0=	'..' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getParameterTypeAccess().getValueFullStopFullStopKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterTypeRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_0, "..");
	    }

)
))
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
		lv_value_1_0=RULE_NAMEWITHWC
		{
			newLeafNode(lv_value_1_0, grammarAccess.getThrowsAccess().getValueNameWithWCTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getThrowsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"NameWithWC");
	    }

)
))
;





// Entry rule entryRuleMethodName
entryRuleMethodName returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMethodNameRule()); }
	 iv_ruleMethodName=ruleMethodName 
	 { $current=$iv_ruleMethodName.current; } 
	 EOF 
;

// Rule MethodName
ruleMethodName returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_NAMEWITHWC
		{
			newLeafNode(lv_value_0_0, grammarAccess.getMethodNameAccess().getValueNameWithWCTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMethodNameRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"NameWithWC");
	    }

)
)
;





RULE_NAMEWITHWC : ('a'..'z'|'A'..'Z'|'_'|'*'|'?') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'*'|'?'|'.'|'/')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


