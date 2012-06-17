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

import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.junit.Test;

public class ModifierFieldTest extends DslTestBase {

    @Test
    public void testMinimumQuery() throws Exception {
        super.setUp();
        getParseResultAndExpect(String.format("%s * *", Fields.MODIFIER_ABSTRACT), 0);
        getParseResultAndExpect(String.format("%s *", Fields.MODIFIER_ABSTRACT), 0);
        getParseResultAndExpect(String.format("*", Fields.MODIFIER_ABSTRACT), 0);
    }
}
