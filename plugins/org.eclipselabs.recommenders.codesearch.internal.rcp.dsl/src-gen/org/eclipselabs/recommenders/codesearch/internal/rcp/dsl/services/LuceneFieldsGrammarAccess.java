/*
* generated by Xtext
*/

package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class LuceneFieldsGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cClassNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cClassNameIDTerminalRuleCall_1_0 = (RuleCall)cClassNameAssignment_1.eContents().get(0);
		private final Assignment cFieldCategoriesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFieldCategoriesFieldCategoryParserRuleCall_2_0 = (RuleCall)cFieldCategoriesAssignment_2.eContents().get(0);
		
		//Model:
		//	"class" className=ID fieldCategories+=FieldCategory*;
		public ParserRule getRule() { return rule; }

		//"class" className=ID fieldCategories+=FieldCategory*
		public Group getGroup() { return cGroup; }

		//"class"
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }

		//className=ID
		public Assignment getClassNameAssignment_1() { return cClassNameAssignment_1; }

		//ID
		public RuleCall getClassNameIDTerminalRuleCall_1_0() { return cClassNameIDTerminalRuleCall_1_0; }

		//fieldCategories+=FieldCategory*
		public Assignment getFieldCategoriesAssignment_2() { return cFieldCategoriesAssignment_2; }

		//FieldCategory
		public RuleCall getFieldCategoriesFieldCategoryParserRuleCall_2_0() { return cFieldCategoriesFieldCategoryParserRuleCall_2_0; }
	}

	public class FieldCategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FieldCategory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCategoryNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCategoryNameIDTerminalRuleCall_0_0 = (RuleCall)cCategoryNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFieldsFieldParserRuleCall_2_0 = (RuleCall)cFieldsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cDescAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		
		//FieldCategory:
		//	categoryName=ID "{" fields+=Field* "}" ("(" desc=STRING ")")?;
		public ParserRule getRule() { return rule; }

		//categoryName=ID "{" fields+=Field* "}" ("(" desc=STRING ")")?
		public Group getGroup() { return cGroup; }

		//categoryName=ID
		public Assignment getCategoryNameAssignment_0() { return cCategoryNameAssignment_0; }

		//ID
		public RuleCall getCategoryNameIDTerminalRuleCall_0_0() { return cCategoryNameIDTerminalRuleCall_0_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//fields+=Field*
		public Assignment getFieldsAssignment_2() { return cFieldsAssignment_2; }

		//Field
		public RuleCall getFieldsFieldParserRuleCall_2_0() { return cFieldsFieldParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }

		//("(" desc=STRING ")")?
		public Group getGroup_4() { return cGroup_4; }

		//"("
		public Keyword getLeftParenthesisKeyword_4_0() { return cLeftParenthesisKeyword_4_0; }

		//desc=STRING
		public Assignment getDescAssignment_4_1() { return cDescAssignment_4_1; }

		//STRING
		public RuleCall getDescSTRINGTerminalRuleCall_4_1_0() { return cDescSTRINGTerminalRuleCall_4_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4_2() { return cRightParenthesisKeyword_4_2; }
	}

	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypesFieldTypeParserRuleCall_4_0 = (RuleCall)cTypesAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cTypesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cTypesFieldTypeParserRuleCall_5_1_0 = (RuleCall)cTypesAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cLeftParenthesisKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cDescAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cDescSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cDescAssignment_7_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7_2 = (Keyword)cGroup_7.eContents().get(2);
		
		//Field:
		//	name=ID "=" value=STRING "{" types+=FieldType ("," types+=FieldType)* "}" ("(" desc=STRING ")")?;
		public ParserRule getRule() { return rule; }

		//name=ID "=" value=STRING "{" types+=FieldType ("," types+=FieldType)* "}" ("(" desc=STRING ")")?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//types+=FieldType
		public Assignment getTypesAssignment_4() { return cTypesAssignment_4; }

		//FieldType
		public RuleCall getTypesFieldTypeParserRuleCall_4_0() { return cTypesFieldTypeParserRuleCall_4_0; }

		//("," types+=FieldType)*
		public Group getGroup_5() { return cGroup_5; }

		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }

		//types+=FieldType
		public Assignment getTypesAssignment_5_1() { return cTypesAssignment_5_1; }

		//FieldType
		public RuleCall getTypesFieldTypeParserRuleCall_5_1_0() { return cTypesFieldTypeParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//("(" desc=STRING ")")?
		public Group getGroup_7() { return cGroup_7; }

		//"("
		public Keyword getLeftParenthesisKeyword_7_0() { return cLeftParenthesisKeyword_7_0; }

		//desc=STRING
		public Assignment getDescAssignment_7_1() { return cDescAssignment_7_1; }

		//STRING
		public RuleCall getDescSTRINGTerminalRuleCall_7_1_0() { return cDescSTRINGTerminalRuleCall_7_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_7_2() { return cRightParenthesisKeyword_7_2; }
	}

	public class FieldTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cTypeTypeKeyword_0_0 = (Keyword)cTypeAssignment_0.eContents().get(0);
		private final Assignment cMethodAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cMethodMethodKeyword_1_0 = (Keyword)cMethodAssignment_1.eContents().get(0);
		private final Assignment cFieldAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cFieldFieldKeyword_2_0 = (Keyword)cFieldAssignment_2.eContents().get(0);
		private final Assignment cTrycatchAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final Keyword cTrycatchTrycatchKeyword_3_0 = (Keyword)cTrycatchAssignment_3.eContents().get(0);
		private final Assignment cVarusageAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final Keyword cVarusageVarusageKeyword_4_0 = (Keyword)cVarusageAssignment_4.eContents().get(0);
		
		//FieldType:
		//	type?="type" | method?="method" | field?="field" | trycatch?="trycatch" | varusage?="varusage";
		public ParserRule getRule() { return rule; }

		//type?="type" | method?="method" | field?="field" | trycatch?="trycatch" | varusage?="varusage"
		public Alternatives getAlternatives() { return cAlternatives; }

		//type?="type"
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//"type"
		public Keyword getTypeTypeKeyword_0_0() { return cTypeTypeKeyword_0_0; }

		//method?="method"
		public Assignment getMethodAssignment_1() { return cMethodAssignment_1; }

		//"method"
		public Keyword getMethodMethodKeyword_1_0() { return cMethodMethodKeyword_1_0; }

		//field?="field"
		public Assignment getFieldAssignment_2() { return cFieldAssignment_2; }

		//"field"
		public Keyword getFieldFieldKeyword_2_0() { return cFieldFieldKeyword_2_0; }

		//trycatch?="trycatch"
		public Assignment getTrycatchAssignment_3() { return cTrycatchAssignment_3; }

		//"trycatch"
		public Keyword getTrycatchTrycatchKeyword_3_0() { return cTrycatchTrycatchKeyword_3_0; }

		//varusage?="varusage"
		public Assignment getVarusageAssignment_4() { return cVarusageAssignment_4; }

		//"varusage"
		public Keyword getVarusageVarusageKeyword_4_0() { return cVarusageVarusageKeyword_4_0; }
	}
	
	
	private ModelElements pModel;
	private FieldCategoryElements pFieldCategory;
	private FieldElements pField;
	private FieldTypeElements pFieldType;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public LuceneFieldsGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"class" className=ID fieldCategories+=FieldCategory*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//FieldCategory:
	//	categoryName=ID "{" fields+=Field* "}" ("(" desc=STRING ")")?;
	public FieldCategoryElements getFieldCategoryAccess() {
		return (pFieldCategory != null) ? pFieldCategory : (pFieldCategory = new FieldCategoryElements());
	}
	
	public ParserRule getFieldCategoryRule() {
		return getFieldCategoryAccess().getRule();
	}

	//Field:
	//	name=ID "=" value=STRING "{" types+=FieldType ("," types+=FieldType)* "}" ("(" desc=STRING ")")?;
	public FieldElements getFieldAccess() {
		return (pField != null) ? pField : (pField = new FieldElements());
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}

	//FieldType:
	//	type?="type" | method?="method" | field?="field" | trycatch?="trycatch" | varusage?="varusage";
	public FieldTypeElements getFieldTypeAccess() {
		return (pFieldType != null) ? pFieldType : (pFieldType = new FieldTypeElements());
	}
	
	public ParserRule getFieldTypeRule() {
		return getFieldTypeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
