/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.services.QL2GrammarAccess;

public class QL2Parser extends AbstractContentAssistParser {
	
	@Inject
	private QL2GrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.antlr.internal.InternalQL2Parser createParser() {
		org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.antlr.internal.InternalQL2Parser result = new org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.antlr.internal.InternalQL2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_1(), "rule__Model__Group_1__0");
					put(grammarAccess.getModelAccess().getGroup_1_2(), "rule__Model__Group_1_2__0");
					put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
					put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
					put(grammarAccess.getStatementAccess().getGroup_2(), "rule__Statement__Group_2__0");
					put(grammarAccess.getVarDeclarationAccess().getGroup(), "rule__VarDeclaration__Group__0");
					put(grammarAccess.getVarInitialisationAccess().getGroup(), "rule__VarInitialisation__Group__0");
					put(grammarAccess.getVarDeclarationParamAccess().getGroup(), "rule__VarDeclarationParam__Group__0");
					put(grammarAccess.getMethodCallAccess().getGroup(), "rule__MethodCall__Group__0");
					put(grammarAccess.getModelAccess().getVarsAssignment_1_1(), "rule__Model__VarsAssignment_1_1");
					put(grammarAccess.getModelAccess().getVarsAssignment_1_2_1(), "rule__Model__VarsAssignment_1_2_1");
					put(grammarAccess.getModelAccess().getStatementsAssignment_3(), "rule__Model__StatementsAssignment_3");
					put(grammarAccess.getVarDeclarationAccess().getTypeAssignment_0(), "rule__VarDeclaration__TypeAssignment_0");
					put(grammarAccess.getVarDeclarationAccess().getNameAssignment_1(), "rule__VarDeclaration__NameAssignment_1");
					put(grammarAccess.getVarInitialisationAccess().getTypeAssignment_0(), "rule__VarInitialisation__TypeAssignment_0");
					put(grammarAccess.getVarInitialisationAccess().getNameAssignment_1(), "rule__VarInitialisation__NameAssignment_1");
					put(grammarAccess.getVarDeclarationParamAccess().getTypeAssignment_0(), "rule__VarDeclarationParam__TypeAssignment_0");
					put(grammarAccess.getVarDeclarationParamAccess().getNameAssignment_1(), "rule__VarDeclarationParam__NameAssignment_1");
					put(grammarAccess.getMethodCallAccess().getNameAssignment_0(), "rule__MethodCall__NameAssignment_0");
					put(grammarAccess.getMethodCallAccess().getMethodAssignment_2(), "rule__MethodCall__MethodAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.antlr.internal.InternalQL2Parser typedParser = (org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.antlr.internal.InternalQL2Parser) parser;
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
	
	public QL2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QL2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
