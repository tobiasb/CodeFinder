package org.eclipselabs.recommenders.test.codesearch.rcp.dsl.tranformation;

import java.io.StringReader;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;

public abstract class Ql1TestBase extends AbstractXtextTests {

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        with(QL1StandaloneSetup.class);
    }

    protected IParseResult parse(String query) {
        return getParser().parse(new StringReader(query));
    }
}
