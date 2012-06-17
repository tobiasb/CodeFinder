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

package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL1;

import java.io.StringReader;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;

public abstract class DslTestBase extends AbstractXtextTests {

    protected IParseResult parse(String query) {
        return getParser().parse(new StringReader(query));
    }

    /**
     * Parses query and checks for syntax errors. Reason for this alternative
     * method is that getParseResultAndExpect checks the serialized query and
     * the grouping-tests failed there for some reason.
     */
    protected void assertNoErrors(String query) {
        IParseResult r = parse(query);
        assertFalse(query, r.hasSyntaxErrors());
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        with(QL1StandaloneSetup.class);
    }
}
