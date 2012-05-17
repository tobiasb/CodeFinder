/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.parser.antlr;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.services.QL2GrammarAccess;

import com.google.inject.Inject;

public class QL2Parser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private QL2GrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipselabs.recommenders.codesearch.rcp.dslQL2.parser.antlr.internal.InternalQL2Parser createParser(XtextTokenStream stream) {
		return new org.eclipselabs.recommenders.codesearch.rcp.dslQL2.parser.antlr.internal.InternalQL2Parser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public QL2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QL2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
