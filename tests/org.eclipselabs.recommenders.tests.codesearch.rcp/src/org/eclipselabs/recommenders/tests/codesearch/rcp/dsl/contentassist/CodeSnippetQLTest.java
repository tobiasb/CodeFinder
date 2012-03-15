package org.eclipselabs.recommenders.tests.codesearch.rcp.dsl.contentassist;

import java.util.List;

import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.QL2StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.QL2ProposalProvider;
import org.eclipselabs.recommenders.test.codesearch.QLTestBase;
import org.junit.Test;

public class CodeSnippetQLTest extends QLTestBase {

    QL2ProposalProvider p = new QL2ProposalProvider();

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL2StandaloneSetup.class);
    }

    @Test
    public void contentAssistVariableNameTest() throws Exception {
        setUp();

        IParseResult r = parse("{A varA = *%nB varB = *}");

        List<String> result = p.getVarNames(r.getRootASTElement());

        assertTrue(!r.hasSyntaxErrors());
        assertEquals(2, result.size());
        assertTrue(result.contains("varA"));
        assertTrue(result.contains("varB"));
    }

    @Test
    public void contentAssistVariableNameTest02() throws Exception {
        setUp();

        IParseResult r = parse("(X varX){A varA = *%nB varB = *%nC varC}");

        List<String> result = p.getVarNames(r.getRootASTElement());

        assertTrue(!r.hasSyntaxErrors());
        assertEquals(4, result.size());
        assertTrue(result.contains("varA"));
        assertTrue(result.contains("varB"));
        assertTrue(result.contains("varC"));
        assertTrue(result.contains("varX"));
    }
}
