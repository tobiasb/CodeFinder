/*
* generated by Xtext
*/
grammar InternalLuceneQuery;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.services.LuceneQueryGrammarAccess;

}

@parser::members {

 	private LuceneQueryGrammarAccess grammarAccess;
 	
    public InternalLuceneQueryParser(TokenStream input, LuceneQueryGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Exp1";	
   	}
   	
   	@Override
   	protected LuceneQueryGrammarAccess getGrammarAccess() {
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
(
    { 
        newCompositeNode(grammarAccess.getExp1Access().getExp2ParserRuleCall_0()); 
    }
    this_Exp2_0=ruleExp2
    { 
        $current = $this_Exp2_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getExp1Access().getExp1LeftAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExp1Access().getBBooleanExpEnumRuleCall_1_1_0()); 
	    }
		lv_b_2_0=ruleBooleanExp		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExp1Rule());
	        }
       		set(
       			$current, 
       			"b",
        		lv_b_2_0, 
        		"BooleanExp");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExp1Access().getRightExp2ParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleExp2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExp1Rule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Exp2");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleExp2
entryRuleExp2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExp2Rule()); }
	 iv_ruleExp2=ruleExp2 
	 { $current=$iv_ruleExp2.current; } 
	 EOF 
;

// Rule Exp2
ruleExp2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0()); 
	    }
		lv_value_0_0=ruleClauseExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExp2Rule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"ClauseExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_0());
    }

    { 
        newCompositeNode(grammarAccess.getExp2Access().getExp1ParserRuleCall_1_1()); 
    }
    this_Exp1_2=ruleExp1
    { 
        $current = $this_Exp1_2.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getExp2Access().getRightParenthesisKeyword_1_2());
    }
))
;





// Entry rule entryRuleClauseExpression
entryRuleClauseExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClauseExpressionRule()); }
	 iv_ruleClauseExpression=ruleClauseExpression 
	 { $current=$iv_ruleClauseExpression.current; } 
	 EOF 
;

// Rule ClauseExpression
ruleClauseExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getClauseSimpleClauseParserRuleCall_0_0()); 
	    }
		lv_clause_0_0=ruleSimpleClause		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
	        }
       		set(
       			$current, 
       			"clause",
        		lv_clause_0_0, 
        		"SimpleClause");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getClauseExpressionAccess().getClauseTypeClauseParserRuleCall_1_0()); 
	    }
		lv_clause_1_0=ruleTypeClause		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClauseExpressionRule());
	        }
       		set(
       			$current, 
       			"clause",
        		lv_clause_1_0, 
        		"TypeClause");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleSimpleClause
entryRuleSimpleClause returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSimpleClauseRule()); }
	 iv_ruleSimpleClause=ruleSimpleClause 
	 { $current=$iv_ruleSimpleClause.current; } 
	 EOF 
;

// Rule SimpleClause
ruleSimpleClause returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getSimpleClauseAccess().getNNotExpressionEnumRuleCall_0_0()); 
	    }
		lv_n_0_0=ruleNotExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimpleClauseRule());
	        }
       		set(
       			$current, 
       			"n",
        		lv_n_0_0, 
        		"NotExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSimpleClauseAccess().getFieldFieldNameParserRuleCall_1_0()); 
	    }
		lv_field_1_0=ruleFieldName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimpleClauseRule());
	        }
       		set(
       			$current, 
       			"field",
        		lv_field_1_0, 
        		"FieldName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSimpleClauseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSimpleClauseAccess().getValueFieldValueParserRuleCall_3_0()); 
	    }
		lv_value_3_0=ruleFieldValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimpleClauseRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"FieldValue");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleTypeClause
entryRuleTypeClause returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeClauseRule()); }
	 iv_ruleTypeClause=ruleTypeClause 
	 { $current=$iv_ruleTypeClause.current; } 
	 EOF 
;

// Rule TypeClause
ruleTypeClause returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getTypeClauseAccess().getNNotExpressionEnumRuleCall_0_0()); 
	    }
		lv_n_0_0=ruleNotExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeClauseRule());
	        }
       		set(
       			$current, 
       			"n",
        		lv_n_0_0, 
        		"NotExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeClauseAccess().getFieldTypeFieldNameParserRuleCall_1_0()); 
	    }
		lv_field_1_0=ruleTypeFieldName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeClauseRule());
	        }
       		set(
       			$current, 
       			"field",
        		lv_field_1_0, 
        		"TypeFieldName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTypeClauseAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeClauseAccess().getValueTypeValueParserRuleCall_3_0()); 
	    }
		lv_value_3_0=ruleTypeValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeClauseRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"TypeValue");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFieldValue
entryRuleFieldValue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFieldValueRule()); } 
	 iv_ruleFieldValue=ruleFieldValue 
	 { $current=$iv_ruleFieldValue.current.getText(); }  
	 EOF 
;

// Rule FieldValue
ruleFieldValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getFieldValueAccess().getValueParserRuleCall()); 
    }
    this_Value_0=ruleValue    {
		$current.merge(this_Value_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;





// Entry rule entryRuleTypeValue
entryRuleTypeValue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeValueRule()); } 
	 iv_ruleTypeValue=ruleTypeValue 
	 { $current=$iv_ruleTypeValue.current.getText(); }  
	 EOF 
;

// Rule TypeValue
ruleTypeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getTypeValueAccess().getQualifiedNameWithWildcardParserRuleCall()); 
    }
    this_QualifiedNameWithWildcard_0=ruleQualifiedNameWithWildcard    {
		$current.merge(this_QualifiedNameWithWildcard_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;





// Entry rule entryRuleValue
entryRuleValue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); } 
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current.getText(); }  
	 EOF 
;

// Rule Value
ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValueAccess().getAsteriskKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getValueAccess().getIDTerminalRuleCall_1_1()); 
    }
)*(
	kw='*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValueAccess().getAsteriskKeyword_2()); 
    }
)?)
    ;





// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
	}
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard 
	 { $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }  
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT", "RULE_ML_COMMENT");
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameWithWildcardAccess().getIDTerminalRuleCall_0()); 
    }
((
	kw='*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_0()); 
    }
)?
    { 
        newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getSepParserRuleCall_1_1()); 
    }
    this_Sep_2=ruleSep    {
		$current.merge(this_Sep_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(    this_ID_3=RULE_ID    {
		$current.merge(this_ID_3);
    }

    { 
    newLeafNode(this_ID_3, grammarAccess.getQualifiedNameWithWildcardAccess().getIDTerminalRuleCall_1_2()); 
    }
)?)*(
	kw='*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
    }
)?)
    ;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleSep
entryRuleSep returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getSepRule()); } 
	 iv_ruleSep=ruleSep 
	 { $current=$iv_ruleSep.current.getText(); }  
	 EOF 
;

// Rule Sep
ruleSep returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='/' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSepAccess().getSolidusKeyword_0()); 
    }

    |
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSepAccess().getFullStopKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleFieldName
entryRuleFieldName returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFieldNameRule()); }
	 iv_ruleFieldName=ruleFieldName 
	 { $current=$iv_ruleFieldName.current; } 
	 EOF 
;

// Rule FieldName
ruleFieldName returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_FullyQualifiedName_0_0=	'FullyQualifiedName' 
    {
        newLeafNode(lv_FullyQualifiedName_0_0, grammarAccess.getFieldNameAccess().getFullyQualifiedNameFullyQualifiedNameKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "FullyQualifiedName", lv_FullyQualifiedName_0_0, "FullyQualifiedName");
	    }

)
)
    |(
(
		lv_Type_1_0=	'Type' 
    {
        newLeafNode(lv_Type_1_0, grammarAccess.getFieldNameAccess().getTypeTypeKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "Type", lv_Type_1_0, "Type");
	    }

)
)
    |(
(
		lv_FriendlyName_2_0=	'FriendlyName' 
    {
        newLeafNode(lv_FriendlyName_2_0, grammarAccess.getFieldNameAccess().getFriendlyNameFriendlyNameKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "FriendlyName", lv_FriendlyName_2_0, "FriendlyName");
	    }

)
)
    |(
(
		lv_DeclaredMethods_3_0=	'DeclaredMethods' 
    {
        newLeafNode(lv_DeclaredMethods_3_0, grammarAccess.getFieldNameAccess().getDeclaredMethodsDeclaredMethodsKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "DeclaredMethods", lv_DeclaredMethods_3_0, "DeclaredMethods");
	    }

)
)
    |(
(
		lv_ParameterCount_4_0=	'ParameterCount' 
    {
        newLeafNode(lv_ParameterCount_4_0, grammarAccess.getFieldNameAccess().getParameterCountParameterCountKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "ParameterCount", lv_ParameterCount_4_0, "ParameterCount");
	    }

)
)
    |(
(
		lv_ReturnVariableEexpressions_5_0=	'ReturnVariableEexpressions' 
    {
        newLeafNode(lv_ReturnVariableEexpressions_5_0, grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsReturnVariableEexpressionsKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "ReturnVariableEexpressions", lv_ReturnVariableEexpressions_5_0, "ReturnVariableEexpressions");
	    }

)
)
    |(
(
		lv_UsedMethods_6_0=	'UsedMethods' 
    {
        newLeafNode(lv_UsedMethods_6_0, grammarAccess.getFieldNameAccess().getUsedMethodsUsedMethodsKeyword_6_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "UsedMethods", lv_UsedMethods_6_0, "UsedMethods");
	    }

)
)
    |(
(
		lv_UsedMethodsInTry_7_0=	'UsedMethodsInTry' 
    {
        newLeafNode(lv_UsedMethodsInTry_7_0, grammarAccess.getFieldNameAccess().getUsedMethodsInTryUsedMethodsInTryKeyword_7_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "UsedMethodsInTry", lv_UsedMethodsInTry_7_0, "UsedMethodsInTry");
	    }

)
)
    |(
(
		lv_UsedMethodsInFinally_8_0=	'UsedMethodsInFinally' 
    {
        newLeafNode(lv_UsedMethodsInFinally_8_0, grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyUsedMethodsInFinallyKeyword_8_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "UsedMethodsInFinally", lv_UsedMethodsInFinally_8_0, "UsedMethodsInFinally");
	    }

)
)
    |(
(
		lv_OverriddenMethods_9_0=	'OverriddenMethods' 
    {
        newLeafNode(lv_OverriddenMethods_9_0, grammarAccess.getFieldNameAccess().getOverriddenMethodsOverriddenMethodsKeyword_9_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "OverriddenMethods", lv_OverriddenMethods_9_0, "OverriddenMethods");
	    }

)
)
    |(
(
		lv_ProjectName_10_0=	'ProjectName' 
    {
        newLeafNode(lv_ProjectName_10_0, grammarAccess.getFieldNameAccess().getProjectNameProjectNameKeyword_10_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "ProjectName", lv_ProjectName_10_0, "ProjectName");
	    }

)
)
    |(
(
		lv_ResourcePath_11_0=	'ResourcePath' 
    {
        newLeafNode(lv_ResourcePath_11_0, grammarAccess.getFieldNameAccess().getResourcePathResourcePathKeyword_11_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "ResourcePath", lv_ResourcePath_11_0, "ResourcePath");
	    }

)
)
    |(
(
		lv_Modifiers_12_0=	'Modifiers' 
    {
        newLeafNode(lv_Modifiers_12_0, grammarAccess.getFieldNameAccess().getModifiersModifiersKeyword_12_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "Modifiers", lv_Modifiers_12_0, "Modifiers");
	    }

)
)
    |(
(
		lv_AllDeclaredMethodNames_13_0=	'AllDeclaredMethodNames' 
    {
        newLeafNode(lv_AllDeclaredMethodNames_13_0, grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAllDeclaredMethodNamesKeyword_13_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "AllDeclaredMethodNames", lv_AllDeclaredMethodNames_13_0, "AllDeclaredMethodNames");
	    }

)
)
    |(
(
		lv_DeclaredMethodNames_14_0=	'DeclaredMethodNames' 
    {
        newLeafNode(lv_DeclaredMethodNames_14_0, grammarAccess.getFieldNameAccess().getDeclaredMethodNamesDeclaredMethodNamesKeyword_14_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "DeclaredMethodNames", lv_DeclaredMethodNames_14_0, "DeclaredMethodNames");
	    }

)
)
    |(
(
		lv_DeclaredFieldNames_15_0=	'DeclaredFieldNames' 
    {
        newLeafNode(lv_DeclaredFieldNames_15_0, grammarAccess.getFieldNameAccess().getDeclaredFieldNamesDeclaredFieldNamesKeyword_15_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "DeclaredFieldNames", lv_DeclaredFieldNames_15_0, "DeclaredFieldNames");
	    }

)
)
    |(
(
		lv_DeclaredFieldTypes_16_0=	'DeclaredFieldTypes' 
    {
        newLeafNode(lv_DeclaredFieldTypes_16_0, grammarAccess.getFieldNameAccess().getDeclaredFieldTypesDeclaredFieldTypesKeyword_16_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "DeclaredFieldTypes", lv_DeclaredFieldTypes_16_0, "DeclaredFieldTypes");
	    }

)
)
    |(
(
		lv_AllDeclaredFieldNames_17_0=	'AllDeclaredFieldNames' 
    {
        newLeafNode(lv_AllDeclaredFieldNames_17_0, grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAllDeclaredFieldNamesKeyword_17_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "AllDeclaredFieldNames", lv_AllDeclaredFieldNames_17_0, "AllDeclaredFieldNames");
	    }

)
)
    |(
(
		lv_FullText_18_0=	'FullText' 
    {
        newLeafNode(lv_FullText_18_0, grammarAccess.getFieldNameAccess().getFullTextFullTextKeyword_18_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "FullText", lv_FullText_18_0, "FullText");
	    }

)
)
    |(
(
		lv_FieldsRead_19_0=	'FieldsRead' 
    {
        newLeafNode(lv_FieldsRead_19_0, grammarAccess.getFieldNameAccess().getFieldsReadFieldsReadKeyword_19_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "FieldsRead", lv_FieldsRead_19_0, "FieldsRead");
	    }

)
)
    |(
(
		lv_FieldsWritten_20_0=	'FieldsWritten' 
    {
        newLeafNode(lv_FieldsWritten_20_0, grammarAccess.getFieldNameAccess().getFieldsWrittenFieldsWrittenKeyword_20_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "FieldsWritten", lv_FieldsWritten_20_0, "FieldsWritten");
	    }

)
)
    |(
(
		lv_UsedFieldsInFinally_21_0=	'UsedFieldsInFinally' 
    {
        newLeafNode(lv_UsedFieldsInFinally_21_0, grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyUsedFieldsInFinallyKeyword_21_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "UsedFieldsInFinally", lv_UsedFieldsInFinally_21_0, "UsedFieldsInFinally");
	    }

)
)
    |(
(
		lv_UsedFieldsInTry_22_0=	'UsedFieldsInTry' 
    {
        newLeafNode(lv_UsedFieldsInTry_22_0, grammarAccess.getFieldNameAccess().getUsedFieldsInTryUsedFieldsInTryKeyword_22_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "UsedFieldsInTry", lv_UsedFieldsInTry_22_0, "UsedFieldsInTry");
	    }

)
)
    |(
(
		lv_Annotations_23_0=	'Annotations' 
    {
        newLeafNode(lv_Annotations_23_0, grammarAccess.getFieldNameAccess().getAnnotationsAnnotationsKeyword_23_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "Annotations", lv_Annotations_23_0, "Annotations");
	    }

)
)
    |(
(
		lv_Timestamp_24_0=	'Timestamp' 
    {
        newLeafNode(lv_Timestamp_24_0, grammarAccess.getFieldNameAccess().getTimestampTimestampKeyword_24_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldNameRule());
	        }
       		setWithLastConsumed($current, "Timestamp", lv_Timestamp_24_0, "Timestamp");
	    }

)
))
;





// Entry rule entryRuleTypeFieldName
entryRuleTypeFieldName returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeFieldNameRule()); }
	 iv_ruleTypeFieldName=ruleTypeFieldName 
	 { $current=$iv_ruleTypeFieldName.current; } 
	 EOF 
;

// Rule TypeFieldName
ruleTypeFieldName returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_ImplementedTypes_0_0=	'ImplementedTypes' 
    {
        newLeafNode(lv_ImplementedTypes_0_0, grammarAccess.getTypeFieldNameAccess().getImplementedTypesImplementedTypesKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "ImplementedTypes", lv_ImplementedTypes_0_0, "ImplementedTypes");
	    }

)
)
    |(
(
		lv_ExtendedTypes_1_0=	'ExtendedTypes' 
    {
        newLeafNode(lv_ExtendedTypes_1_0, grammarAccess.getTypeFieldNameAccess().getExtendedTypesExtendedTypesKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "ExtendedTypes", lv_ExtendedTypes_1_0, "ExtendedTypes");
	    }

)
)
    |(
(
		lv_UsedTypes_2_0=	'UsedTypes' 
    {
        newLeafNode(lv_UsedTypes_2_0, grammarAccess.getTypeFieldNameAccess().getUsedTypesUsedTypesKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "UsedTypes", lv_UsedTypes_2_0, "UsedTypes");
	    }

)
)
    |(
(
		lv_UsedTypesInTry_3_0=	'UsedTypesInTry' 
    {
        newLeafNode(lv_UsedTypesInTry_3_0, grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryUsedTypesInTryKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "UsedTypesInTry", lv_UsedTypesInTry_3_0, "UsedTypesInTry");
	    }

)
)
    |(
(
		lv_UsedTypesInFinally_4_0=	'UsedTypesInFinally' 
    {
        newLeafNode(lv_UsedTypesInFinally_4_0, grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyUsedTypesInFinallyKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "UsedTypesInFinally", lv_UsedTypesInFinally_4_0, "UsedTypesInFinally");
	    }

)
)
    |(
(
		lv_ParameterTypes_5_0=	'ParameterTypes' 
    {
        newLeafNode(lv_ParameterTypes_5_0, grammarAccess.getTypeFieldNameAccess().getParameterTypesParameterTypesKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "ParameterTypes", lv_ParameterTypes_5_0, "ParameterTypes");
	    }

)
)
    |(
(
		lv_ReturnType_6_0=	'ReturnType' 
    {
        newLeafNode(lv_ReturnType_6_0, grammarAccess.getTypeFieldNameAccess().getReturnTypeReturnTypeKeyword_6_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "ReturnType", lv_ReturnType_6_0, "ReturnType");
	    }

)
)
    |(
(
		lv_AllImplementedTypes_7_0=	'AllImplementedTypes' 
    {
        newLeafNode(lv_AllImplementedTypes_7_0, grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAllImplementedTypesKeyword_7_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "AllImplementedTypes", lv_AllImplementedTypes_7_0, "AllImplementedTypes");
	    }

)
)
    |(
(
		lv_AllExtendedTypes_8_0=	'AllExtendedTypes' 
    {
        newLeafNode(lv_AllExtendedTypes_8_0, grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAllExtendedTypesKeyword_8_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "AllExtendedTypes", lv_AllExtendedTypes_8_0, "AllExtendedTypes");
	    }

)
)
    |(
(
		lv_FieldType_9_0=	'FieldType' 
    {
        newLeafNode(lv_FieldType_9_0, grammarAccess.getTypeFieldNameAccess().getFieldTypeFieldTypeKeyword_9_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "FieldType", lv_FieldType_9_0, "FieldType");
	    }

)
)
    |(
(
		lv_DeclaringType_10_0=	'DeclaringType' 
    {
        newLeafNode(lv_DeclaringType_10_0, grammarAccess.getTypeFieldNameAccess().getDeclaringTypeDeclaringTypeKeyword_10_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "DeclaringType", lv_DeclaringType_10_0, "DeclaringType");
	    }

)
)
    |(
(
		lv_CaughtType_11_0=	'CaughtType' 
    {
        newLeafNode(lv_CaughtType_11_0, grammarAccess.getTypeFieldNameAccess().getCaughtTypeCaughtTypeKeyword_11_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "CaughtType", lv_CaughtType_11_0, "CaughtType");
	    }

)
)
    |(
(
		lv_InstanceofTypes_12_0=	'InstanceofTypes' 
    {
        newLeafNode(lv_InstanceofTypes_12_0, grammarAccess.getTypeFieldNameAccess().getInstanceofTypesInstanceofTypesKeyword_12_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFieldNameRule());
	        }
       		setWithLastConsumed($current, "InstanceofTypes", lv_InstanceofTypes_12_0, "InstanceofTypes");
	    }

)
))
;





// Rule BooleanExp
ruleBooleanExp returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='AND' 
	{
        $current = grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getBooleanExpAccess().getAnd1EnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='OR' 
	{
        $current = grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getBooleanExpAccess().getOr1EnumLiteralDeclaration_1()); 
    }
));



// Rule NotExpression
ruleNotExpression returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='-' 
	{
        $current = grammarAccess.getNotExpressionAccess().getNot1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getNotExpressionAccess().getNot1EnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='NOT' 
	{
        $current = grammarAccess.getNotExpressionAccess().getNot2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getNotExpressionAccess().getNot2EnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='!' 
	{
        $current = grammarAccess.getNotExpressionAccess().getNot3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getNotExpressionAccess().getNot3EnumLiteralDeclaration_2()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


