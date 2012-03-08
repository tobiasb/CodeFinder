/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.recommenders.codesearch.rcp.dsl.services.LuceneQueryGrammarAccess;

public class LuceneQueryParser extends AbstractContentAssistParser {
	
	@Inject
	private LuceneQueryGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser createParser() {
		org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser result = new org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1(), "rule__ClauseExpression__Alternatives_1");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1(), "rule__ClauseExpression__Alternatives_1_1");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_0_2(), "rule__ClauseExpression__Alternatives_1_1_0_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_1_2(), "rule__ClauseExpression__Alternatives_1_1_1_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_2_2(), "rule__ClauseExpression__Alternatives_1_1_2_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_3_2(), "rule__ClauseExpression__Alternatives_1_1_3_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_4_2(), "rule__ClauseExpression__Alternatives_1_1_4_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_5_2(), "rule__ClauseExpression__Alternatives_1_1_5_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_6_2(), "rule__ClauseExpression__Alternatives_1_1_6_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_7_2(), "rule__ClauseExpression__Alternatives_1_1_7_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_8_2(), "rule__ClauseExpression__Alternatives_1_1_8_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_9_2(), "rule__ClauseExpression__Alternatives_1_1_9_2");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives_1_1_10_2(), "rule__ClauseExpression__Alternatives_1_1_10_2");
					put(grammarAccess.getSimpleFieldAccess().getAlternatives(), "rule__SimpleField__Alternatives");
					put(grammarAccess.getTypeFieldAccess().getAlternatives(), "rule__TypeField__Alternatives");
					put(grammarAccess.getMethodFieldAccess().getAlternatives(), "rule__MethodField__Alternatives");
					put(grammarAccess.getModifierFieldValueAccess().getAlternatives(), "rule__ModifierFieldValue__Alternatives");
					put(grammarAccess.getDocumentTypeFieldValueAccess().getAlternatives(), "rule__DocumentTypeFieldValue__Alternatives");
					put(grammarAccess.getDefinitionTypeValueAccess().getAlternatives(), "rule__DefinitionTypeValue__Alternatives");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getBinaryOrAccess().getAlternatives(), "rule__BinaryOr__Alternatives");
					put(grammarAccess.getOrExpAccess().getGroup(), "rule__OrExp__Group__0");
					put(grammarAccess.getOrExpAccess().getGroup_1(), "rule__OrExp__Group_1__0");
					put(grammarAccess.getAndExpAccess().getGroup(), "rule__AndExp__Group__0");
					put(grammarAccess.getAndExpAccess().getGroup_1(), "rule__AndExp__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup(), "rule__ClauseExpression__Group__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_0(), "rule__ClauseExpression__Group_1_0__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_0(), "rule__ClauseExpression__Group_1_1_0__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_0_2_1(), "rule__ClauseExpression__Group_1_1_0_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_0_2_1_1(), "rule__ClauseExpression__Group_1_1_0_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_1(), "rule__ClauseExpression__Group_1_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_1_2_1(), "rule__ClauseExpression__Group_1_1_1_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_1_2_1_1(), "rule__ClauseExpression__Group_1_1_1_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_2(), "rule__ClauseExpression__Group_1_1_2__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_2_2_1(), "rule__ClauseExpression__Group_1_1_2_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_2_2_1_1(), "rule__ClauseExpression__Group_1_1_2_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_3(), "rule__ClauseExpression__Group_1_1_3__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_3_2_1(), "rule__ClauseExpression__Group_1_1_3_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_3_2_1_1(), "rule__ClauseExpression__Group_1_1_3_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_4(), "rule__ClauseExpression__Group_1_1_4__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_4_2_1(), "rule__ClauseExpression__Group_1_1_4_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_4_2_1_1(), "rule__ClauseExpression__Group_1_1_4_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_5(), "rule__ClauseExpression__Group_1_1_5__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_5_2_1(), "rule__ClauseExpression__Group_1_1_5_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_5_2_1_1(), "rule__ClauseExpression__Group_1_1_5_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_6(), "rule__ClauseExpression__Group_1_1_6__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_6_2_1(), "rule__ClauseExpression__Group_1_1_6_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_6_2_1_1(), "rule__ClauseExpression__Group_1_1_6_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_7(), "rule__ClauseExpression__Group_1_1_7__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_7_2_1(), "rule__ClauseExpression__Group_1_1_7_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_7_2_1_1(), "rule__ClauseExpression__Group_1_1_7_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_8(), "rule__ClauseExpression__Group_1_1_8__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_8_2_1(), "rule__ClauseExpression__Group_1_1_8_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_8_2_1_1(), "rule__ClauseExpression__Group_1_1_8_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_9(), "rule__ClauseExpression__Group_1_1_9__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_9_2_1(), "rule__ClauseExpression__Group_1_1_9_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_9_2_1_1(), "rule__ClauseExpression__Group_1_1_9_2_1_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_10(), "rule__ClauseExpression__Group_1_1_10__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_10_2_1(), "rule__ClauseExpression__Group_1_1_10_2_1__0");
					put(grammarAccess.getClauseExpressionAccess().getGroup_1_1_10_2_1_1(), "rule__ClauseExpression__Group_1_1_10_2_1_1__0");
					put(grammarAccess.getOrExpAccess().getOrAssignment_1_1(), "rule__OrExp__OrAssignment_1_1");
					put(grammarAccess.getOrExpAccess().getRightAssignment_1_2(), "rule__OrExp__RightAssignment_1_2");
					put(grammarAccess.getAndExpAccess().getAndAssignment_1_1(), "rule__AndExp__AndAssignment_1_1");
					put(grammarAccess.getAndExpAccess().getRightAssignment_1_2(), "rule__AndExp__RightAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getValueAssignment_0(), "rule__Primary__ValueAssignment_0");
					put(grammarAccess.getClauseExpressionAccess().getDefaultAssignment_1_0_0(), "rule__ClauseExpression__DefaultAssignment_1_0_0");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_0_0(), "rule__ClauseExpression__FieldAssignment_1_1_0_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_0_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_0_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_0_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_0_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_1_0(), "rule__ClauseExpression__FieldAssignment_1_1_1_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_1_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_1_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_1_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_1_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_2_0(), "rule__ClauseExpression__FieldAssignment_1_1_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_2_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_2_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_2_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_2_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_3_0(), "rule__ClauseExpression__FieldAssignment_1_1_3_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_3_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_3_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_3_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_3_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_4_0(), "rule__ClauseExpression__FieldAssignment_1_1_4_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_4_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_4_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_4_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_4_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_5_0(), "rule__ClauseExpression__FieldAssignment_1_1_5_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_5_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_5_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_5_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_5_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_6_0(), "rule__ClauseExpression__FieldAssignment_1_1_6_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_6_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_6_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_6_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_6_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_7_0(), "rule__ClauseExpression__FieldAssignment_1_1_7_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_7_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_7_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_7_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_7_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_8_0(), "rule__ClauseExpression__FieldAssignment_1_1_8_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_8_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_8_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_8_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_8_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_9_0(), "rule__ClauseExpression__FieldAssignment_1_1_9_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_9_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_9_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_9_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_9_2_1_1_1");
					put(grammarAccess.getClauseExpressionAccess().getFieldAssignment_1_1_10_0(), "rule__ClauseExpression__FieldAssignment_1_1_10_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_10_2_0(), "rule__ClauseExpression__ValuesAssignment_1_1_10_2_0");
					put(grammarAccess.getClauseExpressionAccess().getValuesAssignment_1_1_10_2_1_1_1(), "rule__ClauseExpression__ValuesAssignment_1_1_10_2_1_1_1");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_0(), "rule__SimpleField__ValueAssignment_0");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_1(), "rule__SimpleField__ValueAssignment_1");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_2(), "rule__SimpleField__ValueAssignment_2");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_3(), "rule__SimpleField__ValueAssignment_3");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_4(), "rule__SimpleField__ValueAssignment_4");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_5(), "rule__SimpleField__ValueAssignment_5");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_6(), "rule__SimpleField__ValueAssignment_6");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_7(), "rule__SimpleField__ValueAssignment_7");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_8(), "rule__SimpleField__ValueAssignment_8");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_9(), "rule__SimpleField__ValueAssignment_9");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_10(), "rule__SimpleField__ValueAssignment_10");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_11(), "rule__SimpleField__ValueAssignment_11");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_12(), "rule__SimpleField__ValueAssignment_12");
					put(grammarAccess.getSimpleFieldAccess().getValueAssignment_13(), "rule__SimpleField__ValueAssignment_13");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_0(), "rule__TypeField__ValueAssignment_0");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_1(), "rule__TypeField__ValueAssignment_1");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_2(), "rule__TypeField__ValueAssignment_2");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_3(), "rule__TypeField__ValueAssignment_3");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_4(), "rule__TypeField__ValueAssignment_4");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_5(), "rule__TypeField__ValueAssignment_5");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_6(), "rule__TypeField__ValueAssignment_6");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_7(), "rule__TypeField__ValueAssignment_7");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_8(), "rule__TypeField__ValueAssignment_8");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_9(), "rule__TypeField__ValueAssignment_9");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_10(), "rule__TypeField__ValueAssignment_10");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_11(), "rule__TypeField__ValueAssignment_11");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_12(), "rule__TypeField__ValueAssignment_12");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_13(), "rule__TypeField__ValueAssignment_13");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_14(), "rule__TypeField__ValueAssignment_14");
					put(grammarAccess.getTypeFieldAccess().getValueAssignment_15(), "rule__TypeField__ValueAssignment_15");
					put(grammarAccess.getMethodFieldAccess().getValueAssignment_0(), "rule__MethodField__ValueAssignment_0");
					put(grammarAccess.getMethodFieldAccess().getValueAssignment_1(), "rule__MethodField__ValueAssignment_1");
					put(grammarAccess.getMethodFieldAccess().getValueAssignment_2(), "rule__MethodField__ValueAssignment_2");
					put(grammarAccess.getMethodFieldAccess().getValueAssignment_3(), "rule__MethodField__ValueAssignment_3");
					put(grammarAccess.getMethodFieldAccess().getValueAssignment_4(), "rule__MethodField__ValueAssignment_4");
					put(grammarAccess.getMethodFieldAccess().getValueAssignment_5(), "rule__MethodField__ValueAssignment_5");
					put(grammarAccess.getMethodFieldAccess().getValueAssignment_6(), "rule__MethodField__ValueAssignment_6");
					put(grammarAccess.getMethodFieldAccess().getValueAssignment_7(), "rule__MethodField__ValueAssignment_7");
					put(grammarAccess.getFilePathFieldAccess().getValueAssignment(), "rule__FilePathField__ValueAssignment");
					put(grammarAccess.getNumberFieldAccess().getValueAssignment(), "rule__NumberField__ValueAssignment");
					put(grammarAccess.getModifierFieldAccess().getValueAssignment(), "rule__ModifierField__ValueAssignment");
					put(grammarAccess.getTimeFieldAccess().getValueAssignment(), "rule__TimeField__ValueAssignment");
					put(grammarAccess.getDocumentTypeFieldAccess().getValueAssignment(), "rule__DocumentTypeField__ValueAssignment");
					put(grammarAccess.getProjectNameFieldAccess().getValueAssignment(), "rule__ProjectNameField__ValueAssignment");
					put(grammarAccess.getAnnotationFieldAccess().getValueAssignment(), "rule__AnnotationField__ValueAssignment");
					put(grammarAccess.getDefinitionTypeAccess().getValueAssignment(), "rule__DefinitionType__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser typedParser = (org.eclipselabs.recommenders.codesearch.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser) parser;
			typedParser.entryRuleOrExp();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LuceneQueryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LuceneQueryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
