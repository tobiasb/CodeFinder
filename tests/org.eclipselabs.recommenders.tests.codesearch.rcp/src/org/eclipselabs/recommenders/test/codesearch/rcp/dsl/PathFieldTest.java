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

public class PathFieldTest extends DslTestBase {

    @Test
    public void testSimplePath() throws Exception {

        super.setUp();
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Test.java"), 0);
    }

    @Test
    public void testWildcardPath01() throws Exception {

        super.setUp();
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Test.*"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Test*.java"), 0);
    }

    @Test
    public void testWildcardPath02() throws Exception {

        super.setUp();
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subfolder/Test.*"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subfolder/Test*.java"), 0);
    }

    @Test
    public void testWildcardPath03() throws Exception {

        super.setUp();
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subf?lder/Test.*"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subf?lder/Test*.java"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subf*lder/Test.*"), 0);
        getParseResultAndExpect(field(Fields.RESOURCE_PATH, "C:/Subf*lder/Test*.java"), 0);
    }
}
