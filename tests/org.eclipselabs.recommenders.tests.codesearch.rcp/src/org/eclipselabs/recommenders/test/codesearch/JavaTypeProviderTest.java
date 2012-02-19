package org.eclipselabs.recommenders.test.codesearch;

import java.io.IOException;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.termvector.ITermVectorProvider;
import org.eclipse.recommenders.codesearch.rcp.index.termvector.JavaTypeProvider;
import org.junit.Test;

public class JavaTypeProviderTest extends AbstractTestIndex {

    @Test
    public void testSingleField() throws IOException {
        newIndex().newDoc().addField(Fields.USED_TYPES, "type1").finish();

        final ITermVectorProvider sut = new JavaTypeProvider();

        final CodeSearcher index = getSearchIndexer();
        sut.load(index);

        final List<String> result = sut.getDisjunctTermVector();

        Assert.assertEquals(1, result.size());
        Assert.assertEquals("type1", result.get(0));
    }

    @Test
    public void testRedundandFieldSameDocument() throws IOException {
        newIndex().newDoc().addField(Fields.USED_TYPES, "type2").addField(Fields.USED_TYPES, "type2").finish();

        final ITermVectorProvider sut = new JavaTypeProvider();

        final CodeSearcher index = getSearchIndexer();
        sut.load(index);

        final List<String> result = sut.getDisjunctTermVector();

        Assert.assertEquals(1, result.size());
        Assert.assertEquals("type2", result.get(0));
    }

    @Test
    public void testRedundandFieldDifferentDocument() throws IOException {
        newIndex().newDoc().addField(Fields.USED_TYPES, "type3").newDoc().addField(Fields.USED_TYPES, "type3").finish();

        final ITermVectorProvider sut = new JavaTypeProvider();

        final CodeSearcher index = getSearchIndexer();
        sut.load(index);

        final List<String> result = sut.getDisjunctTermVector();

        Assert.assertEquals(1, result.size());
        Assert.assertEquals("type3", result.get(0));
    }

    @Test
    public void testMultipleFields() throws IOException {
        newIndex().newDoc().addField(Fields.USED_TYPES, "type4").newDoc().addField(Fields.USED_TYPES, "type5").finish();

        final ITermVectorProvider sut = new JavaTypeProvider();

        final CodeSearcher index = getSearchIndexer();
        sut.load(index);

        final List<String> result = sut.getDisjunctTermVector();

        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains("type4"));
        Assert.assertTrue(result.contains("type5"));
    }
}
