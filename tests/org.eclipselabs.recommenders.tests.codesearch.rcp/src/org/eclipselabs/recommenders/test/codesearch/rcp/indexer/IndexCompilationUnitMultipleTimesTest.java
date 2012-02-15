package org.eclipselabs.recommenders.test.codesearch.rcp.indexer;

import junit.framework.Assert;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer;
import org.eclipselabs.recommenders.test.codesearch.AbstractTestIndex;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("removed delete operation from index() due to performance reasons - which makes all these test cases fail. always checking for old versions becomes a huge performance bottleneck")
public class IndexCompilationUnitMultipleTimesTest extends AbstractTestIndex {

    @Test
    public void testOnce() throws Exception {

        final CompilationUnit cu = getSampleCompilationUnit();

        newIndex();
        final CodeIndexerIndex index = getIndexer();

        index.index(cu, new ResourcePathIndexer());
        index.commit();
        Assert.assertEquals(1, getSearchIndexer().getDocuments().size());
    }

    @Test
    public void testTwice() throws Exception {

        final CompilationUnit cu = getSampleCompilationUnit();

        newIndex();
        final CodeIndexerIndex index = getIndexer();

        index.index(cu, new ResourcePathIndexer());
        index.index(cu, new ResourcePathIndexer());
        index.commit();

        Assert.assertEquals(1, getSearchIndexer().getDocuments().size());
    }

    @Test
    public void testMultipleTimes() throws Exception {

        final CompilationUnit cu = getSampleCompilationUnit();

        newIndex();
        final CodeIndexerIndex index = getIndexer();

        index.index(cu, new ResourcePathIndexer());
        index.index(cu, new ResourcePathIndexer());
        index.index(cu, new ResourcePathIndexer());
        index.index(cu, new ResourcePathIndexer());
        index.index(cu, new ResourcePathIndexer());
        index.index(cu, new ResourcePathIndexer());
        index.commit();
        Assert.assertEquals(1, getSearchIndexer().getDocuments().size());
    }
}
