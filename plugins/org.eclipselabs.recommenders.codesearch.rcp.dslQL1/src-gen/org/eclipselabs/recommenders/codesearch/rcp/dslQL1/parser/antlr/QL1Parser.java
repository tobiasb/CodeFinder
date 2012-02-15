/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.services.QL1GrammarAccess;

public class QL1Parser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private QL1GrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipselabs.recommenders.codesearch.rcp.dslQL1.parser.antlr.internal.InternalQL1Parser createParser(XtextTokenStream stream) {
		return new org.eclipselabs.recommenders.codesearch.rcp.dslQL1.parser.antlr.internal.InternalQL1Parser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MethodPattern";
	}
	
	public QL1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QL1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
