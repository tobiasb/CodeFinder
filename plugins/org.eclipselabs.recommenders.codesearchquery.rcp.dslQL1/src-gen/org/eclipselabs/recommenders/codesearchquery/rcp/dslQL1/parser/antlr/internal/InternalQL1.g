/*
* generated by Xtext
*/
grammar InternalQL1;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.services.QL1GrammarAccess;

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
    	return "Exp1";	
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




// Entry rule entryRuleExp1
entryRuleExp1 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExp1Rule()); }
	 iv_ruleExp1=ruleExp1 
	 { $current=$iv_ruleExp1.current; } 
	 EOF 
;

// Rule Exp1
ruleExp1 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getExp1Access().getTypeTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExp1Rule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='where' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExp1Access().getWhereKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExp1Access().getFieldExprFieldExprParserRuleCall_2_0()); 
	    }
		lv_fieldExpr_2_0=ruleFieldExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExp1Rule());
	        }
       		add(
       			$current, 
       			"fieldExpr",
        		lv_fieldExpr_2_0, 
        		"FieldExpr");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getExp1Access().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExp1Access().getFieldExprFieldExprParserRuleCall_3_1_0()); 
	    }
		lv_fieldExpr_4_0=ruleFieldExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExp1Rule());
	        }
       		add(
       			$current, 
       			"fieldExpr",
        		lv_fieldExpr_4_0, 
        		"FieldExpr");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleFieldExpr
entryRuleFieldExpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFieldExprRule()); }
	 iv_ruleFieldExpr=ruleFieldExpr 
	 { $current=$iv_ruleFieldExpr.current; } 
	 EOF 
;

// Rule FieldExpr
ruleFieldExpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFieldExprAccess().getSingleValueFieldParserRuleCall_0()); 
    }
    this_SingleValueField_0=ruleSingleValueField
    { 
        $current = $this_SingleValueField_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFieldExprAccess().getMultiValueFieldParserRuleCall_1()); 
    }
    this_MultiValueField_1=ruleMultiValueField
    { 
        $current = $this_MultiValueField_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFieldExprAccess().getBooleanFieldParserRuleCall_2()); 
    }
    this_BooleanField_2=ruleBooleanField
    { 
        $current = $this_BooleanField_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_value_0_0=	'Methods' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getTypeAccess().getValueMethodsKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "Methods");
	    }

)
)
    |(
(
		lv_method_1_0=	'Types' 
    {
        newLeafNode(lv_method_1_0, grammarAccess.getTypeAccess().getMethodTypesKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed($current, "method", lv_method_1_0, "Types");
	    }

)
))
;





// Entry rule entryRuleSingleValueField
entryRuleSingleValueField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleValueFieldRule()); }
	 iv_ruleSingleValueField=ruleSingleValueField 
	 { $current=$iv_ruleSingleValueField.current; } 
	 EOF 
;

// Rule SingleValueField
ruleSingleValueField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getSingleValueFieldAccess().getNameSingleValueFieldNameParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleSingleValueFieldName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleValueFieldRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"SingleValueFieldName");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleValueFieldAccess().getNNegationParserRuleCall_1_0()); 
	    }
		lv_n_1_0=ruleNegation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleValueFieldRule());
	        }
       		set(
       			$current, 
       			"n",
        		lv_n_1_0, 
        		"Negation");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_2='is' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSingleValueFieldAccess().getIsKeyword_2());
    }
(
(
		lv_value_3_0=RULE_NAMEWITHWC
		{
			newLeafNode(lv_value_3_0, grammarAccess.getSingleValueFieldAccess().getValueNameWithWCTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleValueFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"NameWithWC");
	    }

)
))
;





// Entry rule entryRuleMultiValueField
entryRuleMultiValueField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiValueFieldRule()); }
	 iv_ruleMultiValueField=ruleMultiValueField 
	 { $current=$iv_ruleMultiValueField.current; } 
	 EOF 
;

// Rule MultiValueField
ruleMultiValueField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMultiValueFieldAccess().getNameMultiValueFieldNameParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleMultiValueFieldName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiValueFieldRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"MultiValueFieldName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='has' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMultiValueFieldAccess().getHasKeyword_1());
    }
((
(
		lv_values_2_0=RULE_NAMEWITHWC
		{
			newLeafNode(lv_values_2_0, grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultiValueFieldRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_2_0, 
        		"NameWithWC");
	    }

)
)
    |(	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMultiValueFieldAccess().getLeftParenthesisKeyword_2_1_0());
    }
(
(
		lv_values_4_0=RULE_NAMEWITHWC
		{
			newLeafNode(lv_values_4_0, grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultiValueFieldRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_4_0, 
        		"NameWithWC");
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMultiValueFieldAccess().getCommaKeyword_2_1_2_0());
    }
(
(
		lv_values_6_0=RULE_NAMEWITHWC
		{
			newLeafNode(lv_values_6_0, grammarAccess.getMultiValueFieldAccess().getValuesNameWithWCTerminalRuleCall_2_1_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultiValueFieldRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_6_0, 
        		"NameWithWC");
	    }

)
))	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMultiValueFieldAccess().getRightParenthesisKeyword_2_1_3());
    }
)))
;





// Entry rule entryRuleBooleanField
entryRuleBooleanField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanFieldRule()); }
	 iv_ruleBooleanField=ruleBooleanField 
	 { $current=$iv_ruleBooleanField.current; } 
	 EOF 
;

// Rule BooleanField
ruleBooleanField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanFieldAccess().getNNegationParserRuleCall_0_0()); 
	    }
		lv_n_0_0=ruleNegation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanFieldRule());
	        }
       		set(
       			$current, 
       			"n",
        		lv_n_0_0, 
        		"Negation");
	        afterParserOrEnumRuleCall();
	    }

)
)?((
(
		lv_value_1_0=	'IsStatic' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getBooleanFieldAccess().getValueIsStaticKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanFieldRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_0, "IsStatic");
	    }

)
)
    |(
(
		lv_value_2_0=	'IsPrivate' 
    {
        newLeafNode(lv_value_2_0, grammarAccess.getBooleanFieldAccess().getValueIsPrivateKeyword_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanFieldRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_2_0, "IsPrivate");
	    }

)
)
    |(
(
		lv_value_3_0=	'IsPublic' 
    {
        newLeafNode(lv_value_3_0, grammarAccess.getBooleanFieldAccess().getValueIsPublicKeyword_1_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanFieldRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_3_0, "IsPublic");
	    }

)
)
    |(
(
		lv_value_4_0=	'IsFinal' 
    {
        newLeafNode(lv_value_4_0, grammarAccess.getBooleanFieldAccess().getValueIsFinalKeyword_1_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanFieldRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_4_0, "IsFinal");
	    }

)
)
    |(
(
		lv_value_5_0=	'IsAbstract' 
    {
        newLeafNode(lv_value_5_0, grammarAccess.getBooleanFieldAccess().getValueIsAbstractKeyword_1_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanFieldRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_5_0, "IsAbstract");
	    }

)
)
    |(
(
		lv_value_6_0=	'IsProtected' 
    {
        newLeafNode(lv_value_6_0, grammarAccess.getBooleanFieldAccess().getValueIsProtectedKeyword_1_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanFieldRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_6_0, "IsProtected");
	    }

)
)))
;





// Entry rule entryRuleSingleValueFieldName
entryRuleSingleValueFieldName returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleValueFieldNameRule()); }
	 iv_ruleSingleValueFieldName=ruleSingleValueFieldName 
	 { $current=$iv_ruleSingleValueFieldName.current; } 
	 EOF 
;

// Rule SingleValueFieldName
ruleSingleValueFieldName returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=	'Name' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleValueFieldNameRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "Name");
	    }

)
)
;





// Entry rule entryRuleMultiValueFieldName
entryRuleMultiValueFieldName returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiValueFieldNameRule()); }
	 iv_ruleMultiValueFieldName=ruleMultiValueFieldName 
	 { $current=$iv_ruleMultiValueFieldName.current; } 
	 EOF 
;

// Rule MultiValueFieldName
ruleMultiValueFieldName returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=	'CalledMethods' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultiValueFieldNameRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "CalledMethods");
	    }

)
)
;





// Entry rule entryRuleNegation
entryRuleNegation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNegationRule()); }
	 iv_ruleNegation=ruleNegation 
	 { $current=$iv_ruleNegation.current; } 
	 EOF 
;

// Rule Negation
ruleNegation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=	'!' 
    {
        newLeafNode(lv_value_0_0, grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNegationRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_0_0, "!");
	    }

)
)
;





RULE_NAMEWITHWC : ('a'..'z'|'A'..'Z'|'_'|'*'|'?'|'<'|'>'|'['|']') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'*'|'?'|'<'|'>'|'['|']'|'.')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


