package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2;

import junit.framework.Assert;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.QL2ProposalProvider;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Test;

public class SyntaxTest extends QLTestBase {

    QL2ProposalProvider p = new QL2ProposalProvider();

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL2StandaloneSetup.class);
    }

    @Test
    public void testParameterBrackets() throws Exception {
        setUp();

        parseAndExtractVars("{}");
        parseAndExtractVars("(){}");
    }

    @Test
    public void testVariableDefinition() throws Exception {
        setUp();

        Assert.assertEquals(0, parseAndExtractVars("{}").size());
        Assert.assertEquals(1, parseAndExtractVars("var String s1 (){}").size());
        Assert.assertEquals(1, parseAndExtractVars("var String s1 {}").size());
        Assert.assertEquals(1, parseAndExtractVars("var String s1").size());
        Assert.assertEquals(1, parseAndExtractVars(String.format("var String s1%nvar String s1%n{}")).size());
        Assert.assertEquals(1, parseAndExtractVars(String.format("var String s1%nvar String s1%n")).size());
        Assert.assertEquals(1, parseAndExtractVars("(String s1){}").size());
        Assert.assertEquals(1, parseAndExtractVars("{var String s1}").size());
        Assert.assertEquals(1, parseAndExtractVars("{var String s1 = *}").size());
        Assert.assertEquals(1, parseAndExtractVars("{var String s1 = new}").size());
        Assert.assertEquals(1, parseAndExtractVars("{var String s1 = null}").size());
    }
    
    @Test
    public void testReturnStatement() throws Exception {
        setUp();

        getParseResultAndExpect(String.format("{var String s1%nreturn s1}"), 0);
        //geht noch nicht weil customvalidation nicht ausgeführt wird... getParseResultAndExpect(String.format("{var String s1%nreturn s2}"), 1);
    }
}
