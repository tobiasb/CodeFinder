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
					put(grammarAccess.getSimpleFieldAccess().getAlternatives(), "rule__SimpleField__Alternatives");
					put(grammarAccess.getTypeFieldAccess().getAlternatives(), "rule__TypeField__Alternatives");
					put(grammarAccess.getMethodFieldAccess().getAlternatives(), "rule__MethodField__Alternatives");
					put(grammarAccess.getModifierFieldValueAccess().getAlternatives(), "rule__ModifierFieldValue__Alternatives");
					put(grammarAccess.getDocumentTypeFieldValueAccess().getAlternatives(), "rule__DocumentTypeFieldValue__Alternatives");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getBinaryExpAccess().getAlternatives(), "rule__BinaryExp__Alternatives");
					put(grammarAccess.getExp1Access().getGroup(), "rule__Exp1__Group__0");
					put(grammarAccess.getExp1Access().getGroup_1(), "rule__Exp1__Group_1__0");
					put(grammarAccess.getExp2Access().getGroup_1(), "rule__Exp2__Group_1__0");
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
					put(grammarAccess.getExp1Access().getBAssignment_1_1(), "rule__Exp1__BAssignment_1_1");
					put(grammarAccess.getExp1Access().getRightAssignment_1_2(), "rule__Exp1__RightAssignment_1_2");
					put(grammarAccess.getExp2Access().getValueAssignment_0(), "rule__Exp2__ValueAssignment_0");
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
					put(grammarAccess.getSimpleFieldAccess().getFullyQualifiedNameAssignment_0(), "rule__SimpleField__FullyQualifiedNameAssignment_0");
					put(grammarAccess.getSimpleFieldAccess().getFriendlyNameAssignment_1(), "rule__SimpleField__FriendlyNameAssignment_1");
					put(grammarAccess.getSimpleFieldAccess().getDeclaredMethodsAssignment_2(), "rule__SimpleField__DeclaredMethodsAssignment_2");
					put(grammarAccess.getSimpleFieldAccess().getReturnVariableEexpressionsAssignment_3(), "rule__SimpleField__ReturnVariableEexpressionsAssignment_3");
					put(grammarAccess.getSimpleFieldAccess().getAllDeclaredMethodNamesAssignment_4(), "rule__SimpleField__AllDeclaredMethodNamesAssignment_4");
					put(grammarAccess.getSimpleFieldAccess().getDeclaredMethodNamesAssignment_5(), "rule__SimpleField__DeclaredMethodNamesAssignment_5");
					put(grammarAccess.getSimpleFieldAccess().getDeclaredFieldNamesAssignment_6(), "rule__SimpleField__DeclaredFieldNamesAssignment_6");
					put(grammarAccess.getSimpleFieldAccess().getAllDeclaredFieldNamesAssignment_7(), "rule__SimpleField__AllDeclaredFieldNamesAssignment_7");
					put(grammarAccess.getSimpleFieldAccess().getFullTextAssignment_8(), "rule__SimpleField__FullTextAssignment_8");
					put(grammarAccess.getSimpleFieldAccess().getFieldsReadAssignment_9(), "rule__SimpleField__FieldsReadAssignment_9");
					put(grammarAccess.getSimpleFieldAccess().getFieldsWrittenAssignment_10(), "rule__SimpleField__FieldsWrittenAssignment_10");
					put(grammarAccess.getSimpleFieldAccess().getUsedFieldsInFinallyAssignment_11(), "rule__SimpleField__UsedFieldsInFinallyAssignment_11");
					put(grammarAccess.getSimpleFieldAccess().getUsedFieldsInTryAssignment_12(), "rule__SimpleField__UsedFieldsInTryAssignment_12");
					put(grammarAccess.getTypeFieldAccess().getImplementedTypesAssignment_0(), "rule__TypeField__ImplementedTypesAssignment_0");
					put(grammarAccess.getTypeFieldAccess().getExtendedTypesAssignment_1(), "rule__TypeField__ExtendedTypesAssignment_1");
					put(grammarAccess.getTypeFieldAccess().getUsedTypesAssignment_2(), "rule__TypeField__UsedTypesAssignment_2");
					put(grammarAccess.getTypeFieldAccess().getUsedTypesInTryAssignment_3(), "rule__TypeField__UsedTypesInTryAssignment_3");
					put(grammarAccess.getTypeFieldAccess().getUsedTypesInFinallyAssignment_4(), "rule__TypeField__UsedTypesInFinallyAssignment_4");
					put(grammarAccess.getTypeFieldAccess().getParameterTypesAssignment_5(), "rule__TypeField__ParameterTypesAssignment_5");
					put(grammarAccess.getTypeFieldAccess().getReturnTypeAssignment_6(), "rule__TypeField__ReturnTypeAssignment_6");
					put(grammarAccess.getTypeFieldAccess().getInstanceofTypesAssignment_7(), "rule__TypeField__InstanceofTypesAssignment_7");
					put(grammarAccess.getTypeFieldAccess().getAllImplementedTypesAssignment_8(), "rule__TypeField__AllImplementedTypesAssignment_8");
					put(grammarAccess.getTypeFieldAccess().getAllExtendedTypesAssignment_9(), "rule__TypeField__AllExtendedTypesAssignment_9");
					put(grammarAccess.getTypeFieldAccess().getFieldTypeAssignment_10(), "rule__TypeField__FieldTypeAssignment_10");
					put(grammarAccess.getTypeFieldAccess().getCaughtTypeAssignment_11(), "rule__TypeField__CaughtTypeAssignment_11");
					put(grammarAccess.getTypeFieldAccess().getDeclaredFieldTypesAssignment_12(), "rule__TypeField__DeclaredFieldTypesAssignment_12");
					put(grammarAccess.getTypeFieldAccess().getDeclaringTypeAssignment_13(), "rule__TypeField__DeclaringTypeAssignment_13");
					put(grammarAccess.getMethodFieldAccess().getUsedMethodsAssignment_0(), "rule__MethodField__UsedMethodsAssignment_0");
					put(grammarAccess.getMethodFieldAccess().getUsedMethodsInTryAssignment_1(), "rule__MethodField__UsedMethodsInTryAssignment_1");
					put(grammarAccess.getMethodFieldAccess().getUsedMethodsInFinallyAssignment_2(), "rule__MethodField__UsedMethodsInFinallyAssignment_2");
					put(grammarAccess.getMethodFieldAccess().getOverriddenMethodsAssignment_3(), "rule__MethodField__OverriddenMethodsAssignment_3");
					put(grammarAccess.getFilePathFieldAccess().getResourcePathAssignment(), "rule__FilePathField__ResourcePathAssignment");
					put(grammarAccess.getNumberFieldAccess().getParameterCountAssignment(), "rule__NumberField__ParameterCountAssignment");
					put(grammarAccess.getModifierFieldAccess().getModifiersAssignment(), "rule__ModifierField__ModifiersAssignment");
					put(grammarAccess.getTimeFieldAccess().getTimestampAssignment(), "rule__TimeField__TimestampAssignment");
					put(grammarAccess.getDocumentTypeFieldAccess().getTypeAssignment(), "rule__DocumentTypeField__TypeAssignment");
					put(grammarAccess.getProjectNameFieldAccess().getProjectNameAssignment(), "rule__ProjectNameField__ProjectNameAssignment");
					put(grammarAccess.getAnnotationFieldAccess().getAnnotationsAssignment(), "rule__AnnotationField__AnnotationsAssignment");
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
