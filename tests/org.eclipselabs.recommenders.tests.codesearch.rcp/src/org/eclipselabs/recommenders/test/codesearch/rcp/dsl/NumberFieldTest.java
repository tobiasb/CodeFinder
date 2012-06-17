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

public class NumberFieldTest extends DslTestBase {

    @Test
    public void testValidNumber() throws Exception {
        super.setUp();
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, 1), 0);
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, 0), 0);
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, 100), 0);
    }

    @Test
    public void testInvalidNumber() throws Exception {
        super.setUp();
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, "nan"), 1);
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, "x"), 1);
    }
}
