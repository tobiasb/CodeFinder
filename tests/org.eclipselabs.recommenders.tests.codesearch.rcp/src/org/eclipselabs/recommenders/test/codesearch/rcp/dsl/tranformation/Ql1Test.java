package org.eclipselabs.recommenders.test.codesearch.rcp.dsl.tranformation;

import org.eclipse.xtext.parser.IParseResult;
import org.junit.Test;

public class Ql1Test extends Ql1TestBase {
    @SuppressWarnings("unused")
    @Test
    public void extractObjectsTest() throws Exception {
        super.setUp();

        String query = "Types where IsAbstract Containing (Methods where IsPublic and !IsAbstract)";

        IParseResult result = parse(query);

    }
}
