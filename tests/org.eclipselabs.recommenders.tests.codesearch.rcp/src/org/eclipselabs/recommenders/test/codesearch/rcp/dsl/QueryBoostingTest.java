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

public class QueryBoostingTest extends DslTestBase {

    @Test
    public void testSimpleBoosting() throws Exception {
        super.setUp();

        getParseResultAndExpect("toString^4", 0);
    }

    @Test
    public void testSimpleBoostingLtOne() throws Exception {
        super.setUp();

        getParseResultAndExpect("toString^0.2", 0);
    }

    @Test
    public void testBoostingTerms01() throws Exception {
        super.setUp();

        getParseResultAndExpect("FriendlyName:(test^4)", 0);
        getParseResultAndExpect("FriendlyName:(test^4.2)", 0);
        getParseResultAndExpect("FriendlyName:(test^0.4)", 0);
    }

    @Test
    public void testBoostingTerms04() throws Exception {
        super.setUp();

        getParseResultAndExpect("FriendlyName:(test)^4", 0);
        getParseResultAndExpect("FriendlyName:(test)^4.2", 0);
        getParseResultAndExpect("FriendlyName:(test)^0.4", 0);
    }

    @Test
    public void testBoostingTerms02() throws Exception {
        super.setUp();

        getParseResultAndExpect("FriendlyName:(test^4 bla^3)", 0);
        getParseResultAndExpect("FriendlyName:(test^4.2 bla^0.3)", 0);
        getParseResultAndExpect("FriendlyName:(test^4.5 bla^3)", 0);
    }

    @Test
    public void testBoostingTerms03() throws Exception {
        super.setUp();

        assertNoErrors("(FriendlyName:(test^4 bla^3))^3");
        assertNoErrors("(FriendlyName:(test bla^3))^3");
        assertNoErrors("(FriendlyName:(test^4.8 bla^3.6))^3.1");
        assertNoErrors("(FriendlyName:(test bla^3.3))^3");
        assertNoErrors("(FriendlyName:(test^4.2 bla^3))^3");
        assertNoErrors("(FriendlyName:(test bla^3.2))^3.0");
    }
}
