package org.eclipse.recommenders.test.codesearch.rcp.searcher;

import java.io.IOException;
import java.util.Set;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.test.codesearch.AbstractTestIndex;
import org.junit.Assert;
import org.junit.Test;

public class TermVectorTest extends AbstractTestIndex {

    @Test
    public void testSimpleTermVector() throws IOException {
        newIndex().newDoc().addField(Fields.USED_TYPES, "testTermVector01").finish();

        final Set<String> vec = getSearchIndexer().getTermVector(new String[] { Fields.USED_TYPES });

        Assert.assertEquals(1, vec.size());
        Assert.assertTrue(vec.contains("testtermvector01"));
    }
}
