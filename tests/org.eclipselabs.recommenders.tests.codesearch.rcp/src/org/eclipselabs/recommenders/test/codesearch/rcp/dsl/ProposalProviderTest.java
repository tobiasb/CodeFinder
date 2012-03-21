package org.eclipselabs.recommenders.test.codesearch.rcp.dsl;

import static org.junit.Assert.assertEquals;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.QL2ProposalProvider;
import org.junit.Test;

public class ProposalProviderTest {

    @Test
    public void testMethodNameConversionWithReturnType() {
        String expected = "htmlremoveY()";
        String actual = QL2ProposalProvider
                .getRawMethodNameWithBrackets("org.test.SomeType.htmlremoveY()Ljava.lang.String;");

        assertEquals(expected, actual);
    }

    @Test
    public void testMethodNameConversionSimple() {
        String expected = "htmlremoveY()";
        String actual = QL2ProposalProvider.getRawMethodNameWithBrackets("org.test.SomeType.htmlremoveY()V;");

        assertEquals(expected, actual);
    }
}
