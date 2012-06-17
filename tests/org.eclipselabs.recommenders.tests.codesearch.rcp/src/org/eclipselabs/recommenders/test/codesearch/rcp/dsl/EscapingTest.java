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

import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.junit.Test;

public class EscapingTest extends DslTestBase {
    @Test
    public void testBasicEscaping() throws Exception {
        super.setUp();
        final String textModel = "Some path c\\:\\\\directory in a comment.";

        getParseResultAndExpect(textModel, 0);
    }
    
    @Test
    public void testEscapingFieldedWithPhrases() throws Exception {
        super.setUp();
        final String textModel = field(Fields.FULL_TEXT, "\"Some path c\\:\\\\directory in a comment.\"");

        getParseResultAndExpect(textModel, 0);
    }
}
