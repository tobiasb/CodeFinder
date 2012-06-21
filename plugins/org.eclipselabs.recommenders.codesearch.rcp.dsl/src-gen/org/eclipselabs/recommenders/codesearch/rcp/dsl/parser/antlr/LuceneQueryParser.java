/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearch.rcp.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.services.LuceneQueryGrammarAccess;

public class LuceneQueryParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private LuceneQueryGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipselabs.recommenders.codesearch.rcp.dsl.parser.antlr.internal.InternalLuceneQueryParser createParser(XtextTokenStream stream) {
		return new org.eclipselabs.recommenders.codesearch.rcp.dsl.parser.antlr.internal.InternalLuceneQueryParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "OrExp";
	}
	
	public LuceneQueryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LuceneQueryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
