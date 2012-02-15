/*
* generated by Xtext
*/

package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class QL1GrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MethodPatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MethodPattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModifiersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModifiersModifierParserRuleCall_0_0 = (RuleCall)cModifiersAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cReturnTypeAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cReturnTypeTypeParserRuleCall_1_0_0 = (RuleCall)cReturnTypeAssignment_1_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cMethodAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMethodMethodParserRuleCall_2_0 = (RuleCall)cMethodAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cParameterTypesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cParameterTypesParameterTypeParserRuleCall_3_1_0 = (RuleCall)cParameterTypesAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cThrowsClauseAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cThrowsClauseThrowsParserRuleCall_4_0 = (RuleCall)cThrowsClauseAssignment_4.eContents().get(0);
		
		//MethodPattern:
		//	modifiers+=Modifier* (returnType=Type ".")? method=Method ("(" parameterTypes+=ParameterType* ")")?
		//	throwsClause=Throws?;
		public ParserRule getRule() { return rule; }

		//modifiers+=Modifier* (returnType=Type ".")? method=Method ("(" parameterTypes+=ParameterType* ")")? throwsClause=Throws?
		public Group getGroup() { return cGroup; }

		//modifiers+=Modifier*
		public Assignment getModifiersAssignment_0() { return cModifiersAssignment_0; }

		//Modifier
		public RuleCall getModifiersModifierParserRuleCall_0_0() { return cModifiersModifierParserRuleCall_0_0; }

		//(returnType=Type ".")?
		public Group getGroup_1() { return cGroup_1; }

		//returnType=Type
		public Assignment getReturnTypeAssignment_1_0() { return cReturnTypeAssignment_1_0; }

		//Type
		public RuleCall getReturnTypeTypeParserRuleCall_1_0_0() { return cReturnTypeTypeParserRuleCall_1_0_0; }

		//"."
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }

		//method=Method
		public Assignment getMethodAssignment_2() { return cMethodAssignment_2; }

		//Method
		public RuleCall getMethodMethodParserRuleCall_2_0() { return cMethodMethodParserRuleCall_2_0; }

		//("(" parameterTypes+=ParameterType* ")")?
		public Group getGroup_3() { return cGroup_3; }

		//"("
		public Keyword getLeftParenthesisKeyword_3_0() { return cLeftParenthesisKeyword_3_0; }

		//parameterTypes+=ParameterType*
		public Assignment getParameterTypesAssignment_3_1() { return cParameterTypesAssignment_3_1; }

		//ParameterType
		public RuleCall getParameterTypesParameterTypeParserRuleCall_3_1_0() { return cParameterTypesParameterTypeParserRuleCall_3_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3_2() { return cRightParenthesisKeyword_3_2; }

		//throwsClause=Throws?
		public Assignment getThrowsClauseAssignment_4() { return cThrowsClauseAssignment_4; }

		//Throws
		public RuleCall getThrowsClauseThrowsParserRuleCall_4_0() { return cThrowsClauseThrowsParserRuleCall_4_0; }
	}

	public class ModifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Modifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cValueStaticKeyword_0_0 = (Keyword)cValueAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cValuePrivateKeyword_1_0 = (Keyword)cValueAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cValuePublicKeyword_2_0 = (Keyword)cValueAssignment_2.eContents().get(0);
		private final Assignment cValueAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final Keyword cValueFinalKeyword_3_0 = (Keyword)cValueAssignment_3.eContents().get(0);
		private final Assignment cValueAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final Keyword cValueAbstractKeyword_4_0 = (Keyword)cValueAssignment_4.eContents().get(0);
		private final Assignment cValueAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final Keyword cValueProtectedKeyword_5_0 = (Keyword)cValueAssignment_5.eContents().get(0);
		private final Assignment cValueAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final Keyword cValueAsteriskKeyword_6_0 = (Keyword)cValueAssignment_6.eContents().get(0);
		
		//Modifier:
		//	value="static" | value="private" | value="public" | value="final" | value="abstract" | value="protected" | value="*";
		public ParserRule getRule() { return rule; }

		//value="static" | value="private" | value="public" | value="final" | value="abstract" | value="protected" | value="*"
		public Alternatives getAlternatives() { return cAlternatives; }

		//value="static"
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }

		//"static"
		public Keyword getValueStaticKeyword_0_0() { return cValueStaticKeyword_0_0; }

		//value="private"
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//"private"
		public Keyword getValuePrivateKeyword_1_0() { return cValuePrivateKeyword_1_0; }

		//value="public"
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//"public"
		public Keyword getValuePublicKeyword_2_0() { return cValuePublicKeyword_2_0; }

		//value="final"
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//"final"
		public Keyword getValueFinalKeyword_3_0() { return cValueFinalKeyword_3_0; }

		//value="abstract"
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }

		//"abstract"
		public Keyword getValueAbstractKeyword_4_0() { return cValueAbstractKeyword_4_0; }

		//value="protected"
		public Assignment getValueAssignment_5() { return cValueAssignment_5; }

		//"protected"
		public Keyword getValueProtectedKeyword_5_0() { return cValueProtectedKeyword_5_0; }

		//value="*"
		public Assignment getValueAssignment_6() { return cValueAssignment_6; }

		//"*"
		public Keyword getValueAsteriskKeyword_6_0() { return cValueAsteriskKeyword_6_0; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final RuleCall cNameWithWCTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Type:
		//	NameWithWC;
		public ParserRule getRule() { return rule; }

		//NameWithWC
		public RuleCall getNameWithWCTerminalRuleCall() { return cNameWithWCTerminalRuleCall; }
	}

	public class ParameterTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ParameterType");
		private final RuleCall cNameWithWCTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ParameterType:
		//	NameWithWC;
		public ParserRule getRule() { return rule; }

		//NameWithWC
		public RuleCall getNameWithWCTerminalRuleCall() { return cNameWithWCTerminalRuleCall; }
	}

	public class ThrowsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Throws");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cThrowsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cThrownTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cThrownTypeTypeParserRuleCall_1_0 = (RuleCall)cThrownTypeAssignment_1.eContents().get(0);
		
		//Throws:
		//	"throws" thrownType=Type;
		public ParserRule getRule() { return rule; }

		//"throws" thrownType=Type
		public Group getGroup() { return cGroup; }

		//"throws"
		public Keyword getThrowsKeyword_0() { return cThrowsKeyword_0; }

		//thrownType=Type
		public Assignment getThrownTypeAssignment_1() { return cThrownTypeAssignment_1; }

		//Type
		public RuleCall getThrownTypeTypeParserRuleCall_1_0() { return cThrownTypeTypeParserRuleCall_1_0; }
	}

	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Method");
		private final RuleCall cNameWithWCTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Method:
		//	NameWithWC;
		public ParserRule getRule() { return rule; }

		//NameWithWC
		public RuleCall getNameWithWCTerminalRuleCall() { return cNameWithWCTerminalRuleCall; }
	}
	
	
	private MethodPatternElements pMethodPattern;
	private ModifierElements pModifier;
	private TypeElements pType;
	private ParameterTypeElements pParameterType;
	private ThrowsElements pThrows;
	private MethodElements pMethod;
	private TerminalRule tNameWithWC;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public QL1GrammarAccess(GrammarProvider grammarProvider,
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

	
	//MethodPattern:
	//	modifiers+=Modifier* (returnType=Type ".")? method=Method ("(" parameterTypes+=ParameterType* ")")?
	//	throwsClause=Throws?;
	public MethodPatternElements getMethodPatternAccess() {
		return (pMethodPattern != null) ? pMethodPattern : (pMethodPattern = new MethodPatternElements());
	}
	
	public ParserRule getMethodPatternRule() {
		return getMethodPatternAccess().getRule();
	}

	//Modifier:
	//	value="static" | value="private" | value="public" | value="final" | value="abstract" | value="protected" | value="*";
	public ModifierElements getModifierAccess() {
		return (pModifier != null) ? pModifier : (pModifier = new ModifierElements());
	}
	
	public ParserRule getModifierRule() {
		return getModifierAccess().getRule();
	}

	//Type:
	//	NameWithWC;
	public TypeElements getTypeAccess() {
		return (pType != null) ? pType : (pType = new TypeElements());
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//ParameterType:
	//	NameWithWC;
	public ParameterTypeElements getParameterTypeAccess() {
		return (pParameterType != null) ? pParameterType : (pParameterType = new ParameterTypeElements());
	}
	
	public ParserRule getParameterTypeRule() {
		return getParameterTypeAccess().getRule();
	}

	//Throws:
	//	"throws" thrownType=Type;
	public ThrowsElements getThrowsAccess() {
		return (pThrows != null) ? pThrows : (pThrows = new ThrowsElements());
	}
	
	public ParserRule getThrowsRule() {
		return getThrowsAccess().getRule();
	}

	//Method:
	//	NameWithWC;
	public MethodElements getMethodAccess() {
		return (pMethod != null) ? pMethod : (pMethod = new MethodElements());
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
	}

	//terminal NameWithWC:
	//	("a".."z" | "A".."Z" | "_" | "*" | "?" | "<" | ">" | "[" | "]") ("a".."z" | "A".."Z" | "_" | "0".."9" | "*" | "?" |
	//	"<" | ">" | "[" | "]" | ".")*;
	public TerminalRule getNameWithWCRule() {
		return (tNameWithWC != null) ? tNameWithWC : (tNameWithWC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NameWithWC"));
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
