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

import org.junit.Ignore;
import org.junit.Test;

public class SimpleWildcardValueFieldTest extends DslTestBase {

    @Test
    public void testSimpleName() throws Exception {

        super.setUp();
        getParseResultAndExpect("FriendlyName:Test", 0);
        getParseResultAndExpect("FriendlyName:Test001", 0);
    }

    @Test
    public void testWildcardName() throws Exception {

        super.setUp();
        getParseResultAndExpect("FriendlyName:Test*", 0);
        getParseResultAndExpect("FriendlyName:Test001*", 0);
        getParseResultAndExpect("FriendlyName:Test*001", 0);
        getParseResultAndExpect("FriendlyName:get*Name", 0);
    }

    @Test
    @Ignore("Bracket support not properly implemented yet because of difficulties with grammar")
    public void testBrackets01() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedMethods:org.test.sub.OtherClass.doSomething()", 0);
    }

    @Test
    @Ignore("Bracket support not properly implemented yet because of difficulties with grammar")
    public void testBrackets02() throws Exception {

        super.setUp();
        getParseResultAndExpect("UsedMethods:org.test.sub.OtherClass.<init>()", 0);
    }
}
