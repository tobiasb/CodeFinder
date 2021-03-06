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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1QueryExtractor;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.Node;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.ParameterValidator;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Ignore;

@Ignore("This is a base class")
public class QL1TestBase extends QLTestBase {

    protected void testQuery(String query, String expected) throws Exception {

        IParseResult result = parse(query);

        assertFalse(result.hasSyntaxErrors());

        EObject o = new QL1QueryExtractor().transform(result);

        assertQueryEqual(expected, serializeLuceneQuery(o));
    }

    protected void checkGraphTrue(Node n, String s) {
        assertTrue(ParameterValidator.paramGraphFitsActualParams(n, s.split(";")));
    }

    protected void checkGraphFalse(Node n, String s) {
        assertFalse(ParameterValidator.paramGraphFitsActualParams(n, s.split(";")));
    }
}
