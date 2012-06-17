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

public class ComplexQueryTest extends DslTestBase {

    @Test
    public void testMultipleFields01() throws Exception {

        super.setUp();
        getParseResultAndExpect(
                "Type:method AND Modifiers:private AND UsedTypes:org.eclipse.recommenders.codesearch.FeatureWeights", 0);
    }

    @Test
    public void testMultipleFields02() throws Exception {

        super.setUp();
        getParseResultAndExpect(
                "Type:method AND UsedTypes:org.eclipse.recommenders.codesearch.FeatureWeights AND Modifiers:private", 0);
    }

    @Test
    public void testMultipleFields03() throws Exception {

        super.setUp();
        getParseResultAndExpect("Type:method AND Modifiers:private", 0);
    }

    @Test
    public void testMultipleFields04() throws Exception {

        super.setUp();
        getParseResultAndExpect(
                "Type:method AND (UsedTypes:org.eclipse.recommenders.codesearch.FeatureWeights OR Modifiers:private)",
                0);
    }

    @Test
    public void testMultipleFields05() throws Exception {

        super.setUp();
        getParseResultAndExpect(
                "Type:method AND (UsedTypes:org.eclipse.recommenders.codesearch.FeatureWeights OR Modifiers:private OR Type:type)",
                0);
    }
}
