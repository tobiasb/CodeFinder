package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

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
