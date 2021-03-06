/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.test.codesearch.rcp.dsl;

import org.junit.Test;

public class TypeFieldTest extends DslTestBase {

    @Test
    public void testBasicDotNotationGrammar() throws Exception {
        super.setUp();
        final String textModel = "UsedTypes:java.util.List";

        getParseResultAndExpect(textModel, 0);
    }

    @Test
    public void testBasicDotNotationGrammarTwoRules() throws Exception {
        super.setUp();
        final String textModel = "UsedTypes:java.util.List AND UsedTypes:java.util.Map";

        getParseResultAndExpect(textModel, 0);
    }

    @Test
    public void testWildcard01() throws Exception {
        super.setUp();

        getParseResultAndExpect("UsedTypes:java*", 0);
    }

    @Test
    public void testWildcard02() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:java.util*", 0);
    }

    @Test
    public void testWildcard05() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:java.util.*", 0);
    }

    @Test
    public void testWildcard06() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:java?", 0);
    }

    @Test
    public void testWildcard07() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:java.util.?", 0);
    }

    @Test
    public void testWildcard08() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:java.util?", 0);
    }

    @Test
    public void testWildcard10() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:java.util*.*", 0);
    }

    @Test
    public void testWildcard04() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:java.util*.bla", 0);
    }

    @Test
    public void testWildcard11() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:java.util*.bla*", 0);
    }

    @Test
    public void testMisc() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedTypes:org.eclipse.recommenders.codesearch.FeatureWeights", 0);
    }
}
