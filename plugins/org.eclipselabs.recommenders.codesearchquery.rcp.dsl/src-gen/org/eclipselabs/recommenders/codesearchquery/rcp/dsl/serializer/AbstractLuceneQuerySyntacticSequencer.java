package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.serializer;

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
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.services.LuceneQueryGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractLuceneQuerySyntacticSequencer extends AbstractSyntacticSequencer {

	protected LuceneQueryGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ClauseExpression_UnaryExpressionParserRuleCall_0_q;
	protected AbstractElementAlias match_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a;
	protected AbstractElementAlias match_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LuceneQueryGrammarAccess) access;
		match_ClauseExpression_UnaryExpressionParserRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getClauseExpressionAccess().getUnaryExpressionParserRuleCall_0());
		match_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a = new GroupAlias(true, true, new TokenAlias(false, true, grammarAccess.getExp2Access().getUnaryExpressionParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_1()));
		match_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p = new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getExp2Access().getUnaryExpressionParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getExp2Access().getLeftParenthesisKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getUnaryExpressionRule())
			return getUnaryExpressionToken(semanticObject, ruleCall, node);
		return "";
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
			if(match_ClauseExpression_UnaryExpressionParserRuleCall_0_q.equals(syntax))
				emit_ClauseExpression_UnaryExpressionParserRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a.equals(syntax))
				emit_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p.equals(syntax))
				emit_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
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
	 *     (UnaryExpression? '(')*
	 */
	protected void emit_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (UnaryExpression? '(')+
	 */
	protected void emit_Exp2___UnaryExpressionParserRuleCall_1_0_q_LeftParenthesisKeyword_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
