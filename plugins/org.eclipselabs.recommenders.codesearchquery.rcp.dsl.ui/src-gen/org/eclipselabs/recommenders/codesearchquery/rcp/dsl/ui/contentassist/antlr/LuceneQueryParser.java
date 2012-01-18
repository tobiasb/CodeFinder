/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.services.LuceneQueryGrammarAccess;

public class LuceneQueryParser extends AbstractContentAssistParser {
	
	@Inject
	private LuceneQueryGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser createParser() {
		org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser result = new org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExp2Access().getAlternatives(), "rule__Exp2__Alternatives");
					put(grammarAccess.getClauseExpressionAccess().getAlternatives(), "rule__ClauseExpression__Alternatives");
					put(grammarAccess.getFieldValueAccess().getAlternatives(), "rule__FieldValue__Alternatives");
					put(grammarAccess.getTypeValueAccess().getAlternatives(), "rule__TypeValue__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives_0(), "rule__Value__Alternatives_0");
					put(grammarAccess.getValueAccess().getAlternatives_1(), "rule__Value__Alternatives_1");
					put(grammarAccess.getFieldNameAccess().getAlternatives(), "rule__FieldName__Alternatives");
					put(grammarAccess.getTypeFieldNameAccess().getAlternatives(), "rule__TypeFieldName__Alternatives");
					put(grammarAccess.getBooleanExpAccess().getAlternatives(), "rule__BooleanExp__Alternatives");
					put(grammarAccess.getNotExpressionAccess().getAlternatives(), "rule__NotExpression__Alternatives");
					put(grammarAccess.getExp1Access().getGroup(), "rule__Exp1__Group__0");
					put(grammarAccess.getExp1Access().getGroup_1(), "rule__Exp1__Group_1__0");
					put(grammarAccess.getExp2Access().getGroup_1(), "rule__Exp2__Group_1__0");
					put(grammarAccess.getSimpleClauseAccess().getGroup(), "rule__SimpleClause__Group__0");
					put(grammarAccess.getTypeClauseAccess().getGroup(), "rule__TypeClause__Group__0");
					put(grammarAccess.getFieldValueAccess().getGroup_1(), "rule__FieldValue__Group_1__0");
					put(grammarAccess.getTypeValueAccess().getGroup_1(), "rule__TypeValue__Group_1__0");
					put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
					put(grammarAccess.getExp1Access().getBAssignment_1_1(), "rule__Exp1__BAssignment_1_1");
					put(grammarAccess.getExp1Access().getRightAssignment_1_2(), "rule__Exp1__RightAssignment_1_2");
					put(grammarAccess.getExp2Access().getValueAssignment_0(), "rule__Exp2__ValueAssignment_0");
					put(grammarAccess.getClauseExpressionAccess().getClauseAssignment_0(), "rule__ClauseExpression__ClauseAssignment_0");
					put(grammarAccess.getClauseExpressionAccess().getClauseAssignment_1(), "rule__ClauseExpression__ClauseAssignment_1");
					put(grammarAccess.getSimpleClauseAccess().getNAssignment_0(), "rule__SimpleClause__NAssignment_0");
					put(grammarAccess.getSimpleClauseAccess().getFieldAssignment_1(), "rule__SimpleClause__FieldAssignment_1");
					put(grammarAccess.getSimpleClauseAccess().getValueAssignment_3(), "rule__SimpleClause__ValueAssignment_3");
					put(grammarAccess.getTypeClauseAccess().getNAssignment_0(), "rule__TypeClause__NAssignment_0");
					put(grammarAccess.getTypeClauseAccess().getFieldAssignment_1(), "rule__TypeClause__FieldAssignment_1");
					put(grammarAccess.getTypeClauseAccess().getValueAssignment_3(), "rule__TypeClause__ValueAssignment_3");
					put(grammarAccess.getFieldNameAccess().getFullyQualifiedNameAssignment_0(), "rule__FieldName__FullyQualifiedNameAssignment_0");
					put(grammarAccess.getFieldNameAccess().getTypeAssignment_1(), "rule__FieldName__TypeAssignment_1");
					put(grammarAccess.getFieldNameAccess().getFriendlyNameAssignment_2(), "rule__FieldName__FriendlyNameAssignment_2");
					put(grammarAccess.getFieldNameAccess().getDeclaredMethodsAssignment_3(), "rule__FieldName__DeclaredMethodsAssignment_3");
					put(grammarAccess.getFieldNameAccess().getParameterCountAssignment_4(), "rule__FieldName__ParameterCountAssignment_4");
					put(grammarAccess.getFieldNameAccess().getReturnVariableEexpressionsAssignment_5(), "rule__FieldName__ReturnVariableEexpressionsAssignment_5");
					put(grammarAccess.getFieldNameAccess().getUsedMethodsAssignment_6(), "rule__FieldName__UsedMethodsAssignment_6");
					put(grammarAccess.getFieldNameAccess().getUsedMethodsInTryAssignment_7(), "rule__FieldName__UsedMethodsInTryAssignment_7");
					put(grammarAccess.getFieldNameAccess().getUsedMethodsInFinallyAssignment_8(), "rule__FieldName__UsedMethodsInFinallyAssignment_8");
					put(grammarAccess.getFieldNameAccess().getOverriddenMethodsAssignment_9(), "rule__FieldName__OverriddenMethodsAssignment_9");
					put(grammarAccess.getFieldNameAccess().getProjectNameAssignment_10(), "rule__FieldName__ProjectNameAssignment_10");
					put(grammarAccess.getFieldNameAccess().getResourcePathAssignment_11(), "rule__FieldName__ResourcePathAssignment_11");
					put(grammarAccess.getFieldNameAccess().getModifiersAssignment_12(), "rule__FieldName__ModifiersAssignment_12");
					put(grammarAccess.getFieldNameAccess().getAllDeclaredMethodNamesAssignment_13(), "rule__FieldName__AllDeclaredMethodNamesAssignment_13");
					put(grammarAccess.getFieldNameAccess().getDeclaredMethodNamesAssignment_14(), "rule__FieldName__DeclaredMethodNamesAssignment_14");
					put(grammarAccess.getFieldNameAccess().getDeclaredFieldNamesAssignment_15(), "rule__FieldName__DeclaredFieldNamesAssignment_15");
					put(grammarAccess.getFieldNameAccess().getDeclaredFieldTypesAssignment_16(), "rule__FieldName__DeclaredFieldTypesAssignment_16");
					put(grammarAccess.getFieldNameAccess().getAllDeclaredFieldNamesAssignment_17(), "rule__FieldName__AllDeclaredFieldNamesAssignment_17");
					put(grammarAccess.getFieldNameAccess().getFullTextAssignment_18(), "rule__FieldName__FullTextAssignment_18");
					put(grammarAccess.getFieldNameAccess().getFieldsReadAssignment_19(), "rule__FieldName__FieldsReadAssignment_19");
					put(grammarAccess.getFieldNameAccess().getFieldsWrittenAssignment_20(), "rule__FieldName__FieldsWrittenAssignment_20");
					put(grammarAccess.getFieldNameAccess().getUsedFieldsInFinallyAssignment_21(), "rule__FieldName__UsedFieldsInFinallyAssignment_21");
					put(grammarAccess.getFieldNameAccess().getUsedFieldsInTryAssignment_22(), "rule__FieldName__UsedFieldsInTryAssignment_22");
					put(grammarAccess.getFieldNameAccess().getAnnotationsAssignment_23(), "rule__FieldName__AnnotationsAssignment_23");
					put(grammarAccess.getFieldNameAccess().getTimestampAssignment_24(), "rule__FieldName__TimestampAssignment_24");
					put(grammarAccess.getTypeFieldNameAccess().getImplementedTypesAssignment_0(), "rule__TypeFieldName__ImplementedTypesAssignment_0");
					put(grammarAccess.getTypeFieldNameAccess().getExtendedTypesAssignment_1(), "rule__TypeFieldName__ExtendedTypesAssignment_1");
					put(grammarAccess.getTypeFieldNameAccess().getUsedTypesAssignment_2(), "rule__TypeFieldName__UsedTypesAssignment_2");
					put(grammarAccess.getTypeFieldNameAccess().getUsedTypesInTryAssignment_3(), "rule__TypeFieldName__UsedTypesInTryAssignment_3");
					put(grammarAccess.getTypeFieldNameAccess().getUsedTypesInFinallyAssignment_4(), "rule__TypeFieldName__UsedTypesInFinallyAssignment_4");
					put(grammarAccess.getTypeFieldNameAccess().getParameterTypesAssignment_5(), "rule__TypeFieldName__ParameterTypesAssignment_5");
					put(grammarAccess.getTypeFieldNameAccess().getReturnTypeAssignment_6(), "rule__TypeFieldName__ReturnTypeAssignment_6");
					put(grammarAccess.getTypeFieldNameAccess().getAllImplementedTypesAssignment_7(), "rule__TypeFieldName__AllImplementedTypesAssignment_7");
					put(grammarAccess.getTypeFieldNameAccess().getAllExtendedTypesAssignment_8(), "rule__TypeFieldName__AllExtendedTypesAssignment_8");
					put(grammarAccess.getTypeFieldNameAccess().getFieldTypeAssignment_9(), "rule__TypeFieldName__FieldTypeAssignment_9");
					put(grammarAccess.getTypeFieldNameAccess().getDeclaringTypeAssignment_10(), "rule__TypeFieldName__DeclaringTypeAssignment_10");
					put(grammarAccess.getTypeFieldNameAccess().getCaughtTypeAssignment_11(), "rule__TypeFieldName__CaughtTypeAssignment_11");
					put(grammarAccess.getTypeFieldNameAccess().getInstanceofTypesAssignment_12(), "rule__TypeFieldName__InstanceofTypesAssignment_12");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser typedParser = (org.eclipselabs.recommenders.codesearchquery.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneQueryParser) parser;
			typedParser.entryRuleExp1();
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
