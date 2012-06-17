/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.codesearch.rcp.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.services.LuceneQueryGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractLuceneQuerySyntacticSequencer extends AbstractSyntacticSequencer {

	protected LuceneQueryGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_0_1_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_0_2_1_1_2_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_0_3_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_1_2_1_1_2_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_1_3_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_2_2_1_1_2_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_2_3_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_3_2_1_1_2_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_3_3_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_4_2_1_1_2_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_4_3_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_5_2_1_1_2_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_5_3_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_6_2_1_1_2_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_6_3_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_7_2_1_1_2_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_7_3_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_8_2_1_1_2_q;
	protected AbstractElementAlias match_ClauseExpression_BoostTerminalRuleCall_1_1_8_3_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_0_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_0_2_1_1_0_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_1_2_1_1_0_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_2_2_1_1_0_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_3_2_1_1_0_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_4_2_1_1_0_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_5_2_1_1_0_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_6_2_1_1_0_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_7_2_1_1_0_q;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_8_2_1_1_0_q;
	protected AbstractElementAlias match_Primary_BoostTerminalRuleCall_1_4_q;
	protected AbstractElementAlias match_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a;
	protected AbstractElementAlias match_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LuceneQueryGrammarAccess) access;
		match_ClauseExpression_BoostTerminalRuleCall_1_0_1_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_0_1());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_0_2_1_1_2_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_0_2_1_1_2());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_0_3_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_0_3());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_1_2_1_1_2_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_1_2_1_1_2());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_1_3_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_1_3());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_2_2_1_1_2_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_2_2_1_1_2());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_2_3_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_2_3());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_3_2_1_1_2_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_3_2_1_1_2());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_3_3_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_3_3());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_4_2_1_1_2_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_4_2_1_1_2());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_4_3_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_4_3());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_5_2_1_1_2_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_5_2_1_1_2());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_5_3_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_5_3());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_6_2_1_1_2_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_6_2_1_1_2());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_6_3_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_6_3());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_7_2_1_1_2_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_7_2_1_1_2());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_7_3_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_7_3());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_8_2_1_1_2_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_8_2_1_1_2());
		match_ClauseExpression_BoostTerminalRuleCall_1_1_8_3_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getBoostTerminalRuleCall_1_1_8_3());
		match_ClauseExpression_UnaryExpressionParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_0());
		match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_0_2_1_1_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_0_2_1_1_0());
		match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_1_2_1_1_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_1_2_1_1_0());
		match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_2_2_1_1_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_2_2_1_1_0());
		match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_3_2_1_1_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_3_2_1_1_0());
		match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_4_2_1_1_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_4_2_1_1_0());
		match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_5_2_1_1_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_5_2_1_1_0());
		match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_6_2_1_1_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_6_2_1_1_0());
		match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_7_2_1_1_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_7_2_1_1_0());
		match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_8_2_1_1_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_1_1_8_2_1_1_0());
		match_Primary_BoostTerminalRuleCall_1_4_q = new TokenAlias(false, true, grammarAccess.getPrimaryAccess().getBoostTerminalRuleCall_1_4());
		match_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a = new GroupAlias(true, true, new TokenAlias(false, true, grammarAccess.getPrimaryAccess().getUnaryExpressionParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1()));
		match_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p = new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getPrimaryAccess().getUnaryExpressionParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBoostRule())
			return getBoostToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getUnaryExpressionRule())
			return getUnaryExpressionToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getBoostToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	protected String getUnaryExpressionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ClauseExpression_BoostTerminalRuleCall_1_0_1_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_0_2_1_1_2_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_0_2_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_0_3_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_1_2_1_1_2_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_1_2_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_1_3_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_2_2_1_1_2_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_2_2_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_2_3_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_2_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_3_2_1_1_2_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_3_2_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_3_3_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_3_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_4_2_1_1_2_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_4_2_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_4_3_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_4_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_5_2_1_1_2_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_5_2_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_5_3_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_5_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_6_2_1_1_2_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_6_2_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_6_3_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_6_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_7_2_1_1_2_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_7_2_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_7_3_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_7_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_8_2_1_1_2_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_8_2_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_BoostTerminalRuleCall_1_1_8_3_q.equals(syntax))
				emit_ClauseExpression_BoostTerminalRuleCall_1_1_8_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_0_2_1_1_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_0_2_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_1_2_1_1_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_1_2_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_2_2_1_1_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_2_2_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_3_2_1_1_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_3_2_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_4_2_1_1_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_4_2_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_5_2_1_1_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_5_2_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_6_2_1_1_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_6_2_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_7_2_1_1_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_7_2_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClauseExpression_UnaryExpressionParserRuleCall_1_1_8_2_1_1_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_8_2_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_BoostTerminalRuleCall_1_4_q.equals(syntax))
				emit_Primary_BoostTerminalRuleCall_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a.equals(syntax))
				emit_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p.equals(syntax))
				emit_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_0_2_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_1_2_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_2_2_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_2_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_3_2_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_3_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_4_2_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_4_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_5_2_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_5_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_6_2_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_6_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_7_2_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_7_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_8_2_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_ClauseExpression_BoostTerminalRuleCall_1_1_8_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_0_2_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_1_2_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_2_2_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_3_2_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_4_2_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_5_2_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_6_2_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_7_2_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     UnaryExpression?
	 */
	protected void emit_ClauseExpression_UnaryExpressionParserRuleCall_1_1_8_2_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Boost?
	 */
	protected void emit_Primary_BoostTerminalRuleCall_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (UnaryExpression? '(')*
	 */
	protected void emit_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (UnaryExpression? '(')+
	 */
	protected void emit_Primary___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
