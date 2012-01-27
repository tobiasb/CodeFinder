package org.eclipselabs.recommenders.test.codesearchquery.rcp.dsl;

import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.junit.Test;

public class NumberFieldTest extends DslTestBase {

	@Test
	public void testValidNumber() throws Exception {
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, 1), 0);
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, 0), 0);
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, 100), 0);
	}
	
	@Test
	public void testInvalidNumber() throws Exception {
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, "nan"), 1);
        getParseResultAndExpect(field(Fields.PARAMETER_COUNT, "x"), 1);
	}
}
