/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.services.LuceneFieldsGrammarAccess;

public class LuceneFieldsParser extends AbstractContentAssistParser {
	
	@Inject
	private LuceneFieldsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneFieldsParser createParser() {
		org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneFieldsParser result = new org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneFieldsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFieldTypeAccess().getAlternatives(), "rule__FieldType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getFieldCategoryAccess().getGroup(), "rule__FieldCategory__Group__0");
					put(grammarAccess.getFieldCategoryAccess().getGroup_4(), "rule__FieldCategory__Group_4__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getFieldAccess().getGroup_5(), "rule__Field__Group_5__0");
					put(grammarAccess.getFieldAccess().getGroup_7(), "rule__Field__Group_7__0");
					put(grammarAccess.getModelAccess().getClassNameAssignment_1(), "rule__Model__ClassNameAssignment_1");
					put(grammarAccess.getModelAccess().getFieldCategoriesAssignment_2(), "rule__Model__FieldCategoriesAssignment_2");
					put(grammarAccess.getFieldCategoryAccess().getCategoryNameAssignment_0(), "rule__FieldCategory__CategoryNameAssignment_0");
					put(grammarAccess.getFieldCategoryAccess().getFieldsAssignment_2(), "rule__FieldCategory__FieldsAssignment_2");
					put(grammarAccess.getFieldCategoryAccess().getDescAssignment_4_1(), "rule__FieldCategory__DescAssignment_4_1");
					put(grammarAccess.getFieldAccess().getNameAssignment_0(), "rule__Field__NameAssignment_0");
					put(grammarAccess.getFieldAccess().getValueAssignment_2(), "rule__Field__ValueAssignment_2");
					put(grammarAccess.getFieldAccess().getTypesAssignment_4(), "rule__Field__TypesAssignment_4");
					put(grammarAccess.getFieldAccess().getTypesAssignment_5_1(), "rule__Field__TypesAssignment_5_1");
					put(grammarAccess.getFieldAccess().getDescAssignment_7_1(), "rule__Field__DescAssignment_7_1");
					put(grammarAccess.getFieldTypeAccess().getTypeAssignment_0(), "rule__FieldType__TypeAssignment_0");
					put(grammarAccess.getFieldTypeAccess().getMethodAssignment_1(), "rule__FieldType__MethodAssignment_1");
					put(grammarAccess.getFieldTypeAccess().getFieldAssignment_2(), "rule__FieldType__FieldAssignment_2");
					put(grammarAccess.getFieldTypeAccess().getTrycatchAssignment_3(), "rule__FieldType__TrycatchAssignment_3");
					put(grammarAccess.getFieldTypeAccess().getVarusageAssignment_4(), "rule__FieldType__VarusageAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneFieldsParser typedParser = (org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.ui.contentassist.antlr.internal.InternalLuceneFieldsParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LuceneFieldsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LuceneFieldsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
