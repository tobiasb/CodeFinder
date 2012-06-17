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

public class FieldGroupingTest extends DslTestBase {

    @Test
    public void testFieldGroupingSimple() throws Exception {
        super.setUp();

        assertNoErrors("UsedTypes:(bar)");
        assertNoErrors("UsedTypes:(bar baz)");
        assertNoErrors("UsedTypes:(bar baz) UsedTypes:foo");
    }

    @Test
    public void testFieldGrouping01() throws Exception {
        super.setUp();

        assertNoErrors("UsedTypes:(+bar)");
        assertNoErrors("UsedTypes:(+bar +baz)");
        assertNoErrors("UsedTypes:(+bar +baz)");
        assertNoErrors("UsedTypes:(+bar +baz) +UsedTypes:foo");
    }

    @Test
    public void testFieldGrouping02() throws Exception {
        super.setUp();

        assertNoErrors("UsedTypes:(bar baz)");
        assertNoErrors("UsedTypes:(*bar *baz)");
        assertNoErrors("UsedTypes:(+bar +baz)");
    }

    @Test
    public void testFieldGrouping03() throws Exception {
        super.setUp();

        assertNoErrors("UsedTypes:(+bar +baz) +(UsedTypes:bar UsedTypes:baz)");
        assertNoErrors("+(UsedTypes:bar UsedTypes:baz) +UsedTypes:foo");
    }
}
