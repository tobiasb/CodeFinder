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

package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2;

import java.util.Map;

import org.eclipse.recommenders.internal.codesearch.rcp.views.CodeSnippetQLEditorWrapper;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Test;

public class ExampleTest extends QLTestBase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL2StandaloneSetup.class);
    }

    /**
     * Test example queries that are being shown in UI. This is just a
     * syntactical test.
     * 
     * @throws Exception
     */
    @Test
    public void testExamples() throws Exception {
        setUp();

        CodeSnippetQLEditorWrapper w = new CodeSnippetQLEditorWrapper();

        for (String exampleQuery : w.getExampleQueriesInternal()) {
            IParseResult result = getParseResultAndExpect(exampleQuery, 0);

            @SuppressWarnings("unused")
			Map<String, VariableUsage> map = new VariableExtractor().getVars(result.getRootASTElement());
        }
    }
}
