/*
* generated by Xtext
*/

package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class QL2GrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cVarsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cVarsVarDeclarationParamParserRuleCall_1_1_0 = (RuleCall)cVarsAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cVarsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cVarsVarDeclarationParamParserRuleCall_1_2_1_0 = (RuleCall)cVarsAssignment_1_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cStatementsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cStatementsStatementParserRuleCall_2_1_0 = (RuleCall)cStatementsAssignment_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		////import "http://www.eclipse.org/xtext/xbase/Xbase"
		//
		////import "http://www.eclipse.org/xtext/common/JavaVMTypes" as types
		//
		////import "http://www.eclipse.org/emf/2002/Ecore" as ecore
		//
		//Model:
		//	{Model} ("(" vars+=VarDeclarationParam ("," vars+=VarDeclarationParam)* ")")? ("{" statements+=Statement* "}")?;
		public ParserRule getRule() { return rule; }

		//{Model} ("(" vars+=VarDeclarationParam ("," vars+=VarDeclarationParam)* ")")? ("{" statements+=Statement* "}")?
		public Group getGroup() { return cGroup; }

		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }

		//("(" vars+=VarDeclarationParam ("," vars+=VarDeclarationParam)* ")")?
		public Group getGroup_1() { return cGroup_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }

		//vars+=VarDeclarationParam
		public Assignment getVarsAssignment_1_1() { return cVarsAssignment_1_1; }

		//VarDeclarationParam
		public RuleCall getVarsVarDeclarationParamParserRuleCall_1_1_0() { return cVarsVarDeclarationParamParserRuleCall_1_1_0; }

		//("," vars+=VarDeclarationParam)*
		public Group getGroup_1_2() { return cGroup_1_2; }

		//","
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }

		//vars+=VarDeclarationParam
		public Assignment getVarsAssignment_1_2_1() { return cVarsAssignment_1_2_1; }

		//VarDeclarationParam
		public RuleCall getVarsVarDeclarationParamParserRuleCall_1_2_1_0() { return cVarsVarDeclarationParamParserRuleCall_1_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }

		//("{" statements+=Statement* "}")?
		public Group getGroup_2() { return cGroup_2; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2_0() { return cLeftCurlyBracketKeyword_2_0; }

		//statements+=Statement*
		public Assignment getStatementsAssignment_2_1() { return cStatementsAssignment_2_1; }

		//Statement
		public RuleCall getStatementsStatementParserRuleCall_2_1_0() { return cStatementsStatementParserRuleCall_2_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2_2() { return cRightCurlyBracketKeyword_2_2; }
	}

	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cVarKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final RuleCall cVarInitialisationParserRuleCall_0_1_0 = (RuleCall)cAlternatives_0_1.eContents().get(0);
		private final RuleCall cVarNullLiteralParserRuleCall_0_1_1 = (RuleCall)cAlternatives_0_1.eContents().get(1);
		private final RuleCall cVarDeclarationParserRuleCall_0_1_2 = (RuleCall)cAlternatives_0_1.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cCallKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cMethodCallParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cScallKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cStaticMethodCallParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//Statement:
		//	"var" (VarInitialisation | VarNullLiteral | VarDeclaration) | "call" MethodCall | "scall" StaticMethodCall;
		public ParserRule getRule() { return rule; }

		//"var" (VarInitialisation | VarNullLiteral | VarDeclaration) | "call" MethodCall | "scall" StaticMethodCall
		public Alternatives getAlternatives() { return cAlternatives; }

		//"var" (VarInitialisation | VarNullLiteral | VarDeclaration)
		public Group getGroup_0() { return cGroup_0; }

		//"var"
		public Keyword getVarKeyword_0_0() { return cVarKeyword_0_0; }

		//VarInitialisation | VarNullLiteral | VarDeclaration
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }

		//VarInitialisation
		public RuleCall getVarInitialisationParserRuleCall_0_1_0() { return cVarInitialisationParserRuleCall_0_1_0; }

		//VarNullLiteral
		public RuleCall getVarNullLiteralParserRuleCall_0_1_1() { return cVarNullLiteralParserRuleCall_0_1_1; }

		//VarDeclaration
		public RuleCall getVarDeclarationParserRuleCall_0_1_2() { return cVarDeclarationParserRuleCall_0_1_2; }

		//"call" MethodCall
		public Group getGroup_1() { return cGroup_1; }

		//"call"
		public Keyword getCallKeyword_1_0() { return cCallKeyword_1_0; }

		//MethodCall
		public RuleCall getMethodCallParserRuleCall_1_1() { return cMethodCallParserRuleCall_1_1; }

		//"scall" StaticMethodCall
		public Group getGroup_2() { return cGroup_2; }

		//"scall"
		public Keyword getScallKeyword_2_0() { return cScallKeyword_2_0; }

		//StaticMethodCall
		public RuleCall getStaticMethodCallParserRuleCall_2_1() { return cStaticMethodCallParserRuleCall_2_1; }
	}

	public class VarInitialisationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VarInitialisation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cAsteriskKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VarInitialisation:
		//	type=Type name=ID "=" "*";
		public ParserRule getRule() { return rule; }

		//type=Type name=ID "=" "*"
		public Group getGroup() { return cGroup; }

		//type=Type
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_0_0() { return cTypeTypeParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//"*"
		public Keyword getAsteriskKeyword_3() { return cAsteriskKeyword_3; }
	}

	public class VarNullLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VarNullLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cNullKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VarNullLiteral:
		//	type=Type name=ID "=" "null";
		public ParserRule getRule() { return rule; }

		//type=Type name=ID "=" "null"
		public Group getGroup() { return cGroup; }

		//type=Type
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_0_0() { return cTypeTypeParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }

		//"null"
		public Keyword getNullKeyword_3() { return cNullKeyword_3; }
	}

	public class VarDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VarDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//VarDeclaration:
		//	type=Type name=ID;
		public ParserRule getRule() { return rule; }

		//type=Type name=ID
		public Group getGroup() { return cGroup; }

		//type=Type
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_0_0() { return cTypeTypeParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class VarDeclarationParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VarDeclarationParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//VarDeclarationParam:
		//	type=Type name=ID;
		public ParserRule getRule() { return rule; }

		//type=Type name=ID
		public Group getGroup() { return cGroup; }

		//type=Type
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_0_0() { return cTypeTypeParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class MethodCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MethodCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameCalleeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameCalleeNameParserRuleCall_0_0 = (RuleCall)cNameCalleeAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMethodAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMethodMethodNameParserRuleCall_2_0 = (RuleCall)cMethodAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameCallerAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameCallerNameParserRuleCall_4_0 = (RuleCall)cNameCallerAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MethodCall:
		//	nameCallee=Name "." method=MethodName "(" nameCaller=Name? ")";
		public ParserRule getRule() { return rule; }

		//nameCallee=Name "." method=MethodName "(" nameCaller=Name? ")"
		public Group getGroup() { return cGroup; }

		//nameCallee=Name
		public Assignment getNameCalleeAssignment_0() { return cNameCalleeAssignment_0; }

		//Name
		public RuleCall getNameCalleeNameParserRuleCall_0_0() { return cNameCalleeNameParserRuleCall_0_0; }

		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }

		//method=MethodName
		public Assignment getMethodAssignment_2() { return cMethodAssignment_2; }

		//MethodName
		public RuleCall getMethodMethodNameParserRuleCall_2_0() { return cMethodMethodNameParserRuleCall_2_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//nameCaller=Name?
		public Assignment getNameCallerAssignment_4() { return cNameCallerAssignment_4; }

		//Name
		public RuleCall getNameCallerNameParserRuleCall_4_0() { return cNameCallerNameParserRuleCall_4_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}

	public class StaticMethodCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StaticMethodCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMethodAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMethodWildcardNameConcatenatedParserRuleCall_0_0 = (RuleCall)cMethodAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//StaticMethodCall:
		//	method=WildcardNameConcatenated "(" name=Name ")";
		public ParserRule getRule() { return rule; }

		//method=WildcardNameConcatenated "(" name=Name ")"
		public Group getGroup() { return cGroup; }

		//method=WildcardNameConcatenated
		public Assignment getMethodAssignment_0() { return cMethodAssignment_0; }

		//WildcardNameConcatenated
		public RuleCall getMethodWildcardNameConcatenatedParserRuleCall_0_0() { return cMethodWildcardNameConcatenatedParserRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//name=Name
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//Name
		public RuleCall getNameNameParserRuleCall_2_0() { return cNameNameParserRuleCall_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}

	public class MethodNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MethodName");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueWildcardNameParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//MethodName:
		//	value=WildcardName;
		public ParserRule getRule() { return rule; }

		//value=WildcardName
		public Assignment getValueAssignment() { return cValueAssignment; }

		//WildcardName
		public RuleCall getValueWildcardNameParserRuleCall_0() { return cValueWildcardNameParserRuleCall_0; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueWildcardNameConcatenatedParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Type:
		//	value=WildcardNameConcatenated;
		public ParserRule getRule() { return rule; }

		//value=WildcardNameConcatenated
		public Assignment getValueAssignment() { return cValueAssignment; }

		//WildcardNameConcatenated
		public RuleCall getValueWildcardNameConcatenatedParserRuleCall_0() { return cValueWildcardNameConcatenatedParserRuleCall_0; }
	}

	public class NameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Name");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Name:
		//	value=ID;
		public ParserRule getRule() { return rule; }

		//value=ID
		public Assignment getValueAssignment() { return cValueAssignment; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_0() { return cValueIDTerminalRuleCall_0; }
	}

	public class WildcardNameConcatenatedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WildcardNameConcatenated");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWildcardNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cWildcardNameParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//WildcardNameConcatenated:
		//	WildcardName ("." WildcardName)*;
		public ParserRule getRule() { return rule; }

		//WildcardName ("." WildcardName)*
		public Group getGroup() { return cGroup; }

		//WildcardName
		public RuleCall getWildcardNameParserRuleCall_0() { return cWildcardNameParserRuleCall_0; }

		//("." WildcardName)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//WildcardName
		public RuleCall getWildcardNameParserRuleCall_1_1() { return cWildcardNameParserRuleCall_1_1; }
	}

	public class WildcardNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WildcardName");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Keyword cAsteriskKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cQuestionMarkKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//WildcardName:
		//	(ID | "*" | "?")+;
		public ParserRule getRule() { return rule; }

		//(ID | "*" | "?")+
		public Alternatives getAlternatives() { return cAlternatives; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//"*"
		public Keyword getAsteriskKeyword_1() { return cAsteriskKeyword_1; }

		//"?"
		public Keyword getQuestionMarkKeyword_2() { return cQuestionMarkKeyword_2; }
	}
	
	
	private ModelElements pModel;
	private StatementElements pStatement;
	private VarInitialisationElements pVarInitialisation;
	private VarNullLiteralElements pVarNullLiteral;
	private VarDeclarationElements pVarDeclaration;
	private VarDeclarationParamElements pVarDeclarationParam;
	private MethodCallElements pMethodCall;
	private StaticMethodCallElements pStaticMethodCall;
	private MethodNameElements pMethodName;
	private TypeElements pType;
	private NameElements pName;
	private WildcardNameConcatenatedElements pWildcardNameConcatenated;
	private WildcardNameElements pWildcardName;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public QL2GrammarAccess(GrammarProvider grammarProvider,
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

	
	////import "http://www.eclipse.org/xtext/xbase/Xbase"
	//
	////import "http://www.eclipse.org/xtext/common/JavaVMTypes" as types
	//
	////import "http://www.eclipse.org/emf/2002/Ecore" as ecore
	//
	//Model:
	//	{Model} ("(" vars+=VarDeclarationParam ("," vars+=VarDeclarationParam)* ")")? ("{" statements+=Statement* "}")?;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Statement:
	//	"var" (VarInitialisation | VarNullLiteral | VarDeclaration) | "call" MethodCall | "scall" StaticMethodCall;
	public StatementElements getStatementAccess() {
		return (pStatement != null) ? pStatement : (pStatement = new StatementElements());
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}

	//VarInitialisation:
	//	type=Type name=ID "=" "*";
	public VarInitialisationElements getVarInitialisationAccess() {
		return (pVarInitialisation != null) ? pVarInitialisation : (pVarInitialisation = new VarInitialisationElements());
	}
	
	public ParserRule getVarInitialisationRule() {
		return getVarInitialisationAccess().getRule();
	}

	//VarNullLiteral:
	//	type=Type name=ID "=" "null";
	public VarNullLiteralElements getVarNullLiteralAccess() {
		return (pVarNullLiteral != null) ? pVarNullLiteral : (pVarNullLiteral = new VarNullLiteralElements());
	}
	
	public ParserRule getVarNullLiteralRule() {
		return getVarNullLiteralAccess().getRule();
	}

	//VarDeclaration:
	//	type=Type name=ID;
	public VarDeclarationElements getVarDeclarationAccess() {
		return (pVarDeclaration != null) ? pVarDeclaration : (pVarDeclaration = new VarDeclarationElements());
	}
	
	public ParserRule getVarDeclarationRule() {
		return getVarDeclarationAccess().getRule();
	}

	//VarDeclarationParam:
	//	type=Type name=ID;
	public VarDeclarationParamElements getVarDeclarationParamAccess() {
		return (pVarDeclarationParam != null) ? pVarDeclarationParam : (pVarDeclarationParam = new VarDeclarationParamElements());
	}
	
	public ParserRule getVarDeclarationParamRule() {
		return getVarDeclarationParamAccess().getRule();
	}

	//MethodCall:
	//	nameCallee=Name "." method=MethodName "(" nameCaller=Name? ")";
	public MethodCallElements getMethodCallAccess() {
		return (pMethodCall != null) ? pMethodCall : (pMethodCall = new MethodCallElements());
	}
	
	public ParserRule getMethodCallRule() {
		return getMethodCallAccess().getRule();
	}

	//StaticMethodCall:
	//	method=WildcardNameConcatenated "(" name=Name ")";
	public StaticMethodCallElements getStaticMethodCallAccess() {
		return (pStaticMethodCall != null) ? pStaticMethodCall : (pStaticMethodCall = new StaticMethodCallElements());
	}
	
	public ParserRule getStaticMethodCallRule() {
		return getStaticMethodCallAccess().getRule();
	}

	//MethodName:
	//	value=WildcardName;
	public MethodNameElements getMethodNameAccess() {
		return (pMethodName != null) ? pMethodName : (pMethodName = new MethodNameElements());
	}
	
	public ParserRule getMethodNameRule() {
		return getMethodNameAccess().getRule();
	}

	//Type:
	//	value=WildcardNameConcatenated;
	public TypeElements getTypeAccess() {
		return (pType != null) ? pType : (pType = new TypeElements());
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//Name:
	//	value=ID;
	public NameElements getNameAccess() {
		return (pName != null) ? pName : (pName = new NameElements());
	}
	
	public ParserRule getNameRule() {
		return getNameAccess().getRule();
	}

	//WildcardNameConcatenated:
	//	WildcardName ("." WildcardName)*;
	public WildcardNameConcatenatedElements getWildcardNameConcatenatedAccess() {
		return (pWildcardNameConcatenated != null) ? pWildcardNameConcatenated : (pWildcardNameConcatenated = new WildcardNameConcatenatedElements());
	}
	
	public ParserRule getWildcardNameConcatenatedRule() {
		return getWildcardNameConcatenatedAccess().getRule();
	}

	//WildcardName:
	//	(ID | "*" | "?")+;
	public WildcardNameElements getWildcardNameAccess() {
		return (pWildcardName != null) ? pWildcardName : (pWildcardName = new WildcardNameElements());
	}
	
	public ParserRule getWildcardNameRule() {
		return getWildcardNameAccess().getRule();
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
