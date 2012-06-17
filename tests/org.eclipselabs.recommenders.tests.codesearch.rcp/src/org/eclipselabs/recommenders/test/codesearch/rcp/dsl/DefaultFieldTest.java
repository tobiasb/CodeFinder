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

public class DefaultFieldTest extends DslTestBase {

    @Test
    public void testMultipleFields01() throws Exception {
        super.setUp();

        getParseResultAndExpect("String", 0); // Default field
    }
}
