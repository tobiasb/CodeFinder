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
