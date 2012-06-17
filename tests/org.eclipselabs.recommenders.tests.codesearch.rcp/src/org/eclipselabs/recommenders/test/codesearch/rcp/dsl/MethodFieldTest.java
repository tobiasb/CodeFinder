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

public class MethodFieldTest extends DslTestBase {

    @Test
    public void testSimple() throws Exception {
        super.setUp();
        final String textModel = "UsedMethods:*addFieldToDocument";

        getParseResultAndExpect(textModel, 0);
    }

    @Test
    public void testWithType() throws Exception {
        super.setUp();
        final String textModel = "UsedMethods:*.CodeIndexer.addFieldToDocument";

        getParseResultAndExpect(textModel, 0);
    }

    @Test
    public void testWithParameters() throws Exception {
        super.setUp();
        
        String textModel; 
        
//        textModel = "UsedMethods:*.CodeIndexer.addFieldToDocument()";
//        getParseResultAndExpect(textModel, 0);

        textModel = "UsedMethods:*.CodeIndexer.addFieldToDocument(*)";
        getParseResultAndExpect(textModel, 0);

//        textModel = "UsedMethods:*.CodeIndexer.addFieldToDocument(*, java.lang.String)";
//        getParseResultAndExpect(textModel, 0);
    }
}
