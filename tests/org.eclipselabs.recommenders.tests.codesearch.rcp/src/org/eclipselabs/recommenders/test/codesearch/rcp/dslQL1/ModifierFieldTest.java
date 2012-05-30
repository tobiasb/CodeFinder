package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL1;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.junit.Test;

public class ModifierFieldTest extends DslTestBase {

    @Test
    public void testValidModifier() throws Exception {
        super.setUp();
        getParseResultAndExpect(String.format("%s * *", Fields.MODIFIER_ABSTRACT), 0);
        getParseResultAndExpect(String.format("%s * *", Fields.MODIFIER_PUBLIC), 0);
        getParseResultAndExpect(String.format("%s * *", Fields.MODIFIER_FINAL), 0);
        getParseResultAndExpect(String.format("%s * *", Fields.MODIFIER_PRIVATE), 0);
        getParseResultAndExpect(String.format("%s * *", Fields.MODIFIER_PROTECTED), 0);
        getParseResultAndExpect(String.format("%s * *", Fields.MODIFIER_STATIC), 0);
    }

    @Test
    public void testInvalidModifier() throws Exception {
        super.setUp();
        getParseResultAndExpect(String.format("%s * *", "puuublic"), 1);
        getParseResultAndExpect(String.format("%s * *", "spundekäs"), 1);
    }
}
