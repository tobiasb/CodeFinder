/*
* generated by Xtext
*/

package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.services;

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
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPackageNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPackageNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cPackageNameAssignment_1.eContents().get(0);
		private final Keyword cClassKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cClassNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cClassNameIDTerminalRuleCall_3_0 = (RuleCall)cClassNameAssignment_3.eContents().get(0);
		private final Assignment cFieldsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFieldsFieldParserRuleCall_4_0 = (RuleCall)cFieldsAssignment_4.eContents().get(0);
		
		//Model:
		//	"package" packageName=STRING "class" className=ID fields+=Field*;
		public ParserRule getRule() { return rule; }

		//"package" packageName=STRING "class" className=ID fields+=Field*
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//packageName=STRING
		public Assignment getPackageNameAssignment_1() { return cPackageNameAssignment_1; }

		//STRING
		public RuleCall getPackageNameSTRINGTerminalRuleCall_1_0() { return cPackageNameSTRINGTerminalRuleCall_1_0; }

		//"class"
		public Keyword getClassKeyword_2() { return cClassKeyword_2; }

		//className=ID
		public Assignment getClassNameAssignment_3() { return cClassNameAssignment_3; }

		//ID
		public RuleCall getClassNameIDTerminalRuleCall_3_0() { return cClassNameIDTerminalRuleCall_3_0; }

		//fields+=Field*
		public Assignment getFieldsAssignment_4() { return cFieldsAssignment_4; }

		//Field
		public RuleCall getFieldsFieldParserRuleCall_4_0() { return cFieldsFieldParserRuleCall_4_0; }
	}

	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cProposeTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final Keyword cProposeTypeProposeTypeKeyword_3_1_0 = (Keyword)cProposeTypeAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTypesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTypesFieldTypeParserRuleCall_5_0 = (RuleCall)cTypesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTypesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cTypesFieldTypeParserRuleCall_6_1_0 = (RuleCall)cTypesAssignment_6_1.eContents().get(0);
		
		//Field:
		//	name=ID ";" value=STRING (";" proposeType?="proposeType")? ";" types+=FieldType ("," types+=FieldType)*;
		public ParserRule getRule() { return rule; }

		//name=ID ";" value=STRING (";" proposeType?="proposeType")? ";" types+=FieldType ("," types+=FieldType)*
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//";"
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }

		//value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }

		//(";" proposeType?="proposeType")?
		public Group getGroup_3() { return cGroup_3; }

		//";"
		public Keyword getSemicolonKeyword_3_0() { return cSemicolonKeyword_3_0; }

		//proposeType?="proposeType"
		public Assignment getProposeTypeAssignment_3_1() { return cProposeTypeAssignment_3_1; }

		//"proposeType"
		public Keyword getProposeTypeProposeTypeKeyword_3_1_0() { return cProposeTypeProposeTypeKeyword_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }

		//types+=FieldType
		public Assignment getTypesAssignment_5() { return cTypesAssignment_5; }

		//FieldType
		public RuleCall getTypesFieldTypeParserRuleCall_5_0() { return cTypesFieldTypeParserRuleCall_5_0; }

		//("," types+=FieldType)*
		public Group getGroup_6() { return cGroup_6; }

		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }

		//types+=FieldType
		public Assignment getTypesAssignment_6_1() { return cTypesAssignment_6_1; }

		//FieldType
		public RuleCall getTypesFieldTypeParserRuleCall_6_1_0() { return cTypesFieldTypeParserRuleCall_6_1_0; }
	}

	public class FieldTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cClassTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cClassTypeClassKeyword_0_0 = (Keyword)cClassTypeAssignment_0.eContents().get(0);
		private final Assignment cMethodTypeAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cMethodTypeMethodKeyword_1_0 = (Keyword)cMethodTypeAssignment_1.eContents().get(0);
		private final Assignment cFieldTypeAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cFieldTypeFieldKeyword_2_0 = (Keyword)cFieldTypeAssignment_2.eContents().get(0);
		private final Assignment cTrycatchTypeAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final Keyword cTrycatchTypeTrycatchKeyword_3_0 = (Keyword)cTrycatchTypeAssignment_3.eContents().get(0);
		
		//FieldType:
		//	classType?="class" | methodType?="method" | fieldType?="field" | trycatchType?="trycatch";
		public ParserRule getRule() { return rule; }

		//classType?="class" | methodType?="method" | fieldType?="field" | trycatchType?="trycatch"
		public Alternatives getAlternatives() { return cAlternatives; }

		//classType?="class"
		public Assignment getClassTypeAssignment_0() { return cClassTypeAssignment_0; }

		//"class"
		public Keyword getClassTypeClassKeyword_0_0() { return cClassTypeClassKeyword_0_0; }

		//methodType?="method"
		public Assignment getMethodTypeAssignment_1() { return cMethodTypeAssignment_1; }

		//"method"
		public Keyword getMethodTypeMethodKeyword_1_0() { return cMethodTypeMethodKeyword_1_0; }

		//fieldType?="field"
		public Assignment getFieldTypeAssignment_2() { return cFieldTypeAssignment_2; }

		//"field"
		public Keyword getFieldTypeFieldKeyword_2_0() { return cFieldTypeFieldKeyword_2_0; }

		//trycatchType?="trycatch"
		public Assignment getTrycatchTypeAssignment_3() { return cTrycatchTypeAssignment_3; }

		//"trycatch"
		public Keyword getTrycatchTypeTrycatchKeyword_3_0() { return cTrycatchTypeTrycatchKeyword_3_0; }
	}
	
	
	private ModelElements pModel;
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
	//	"package" packageName=STRING "class" className=ID fields+=Field*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Field:
	//	name=ID ";" value=STRING (";" proposeType?="proposeType")? ";" types+=FieldType ("," types+=FieldType)*;
	public FieldElements getFieldAccess() {
		return (pField != null) ? pField : (pField = new FieldElements());
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}

	//FieldType:
	//	classType?="class" | methodType?="method" | fieldType?="field" | trycatchType?="trycatch";
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
