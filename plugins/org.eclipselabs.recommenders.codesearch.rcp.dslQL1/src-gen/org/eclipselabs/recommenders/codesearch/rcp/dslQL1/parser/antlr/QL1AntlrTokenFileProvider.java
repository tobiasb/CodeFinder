/*
* generated by Xtext
*/
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class QL1AntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipselabs/recommenders/codesearch/rcp/dslQL1/parser/antlr/internal/InternalQL1.tokens");
	}
}
