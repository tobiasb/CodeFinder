/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LuceneFieldsAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipselabs/recommenders/codesearch/internal/rcp/dsl/parser/antlr/internal/InternalLuceneFields.tokens");
	}
}