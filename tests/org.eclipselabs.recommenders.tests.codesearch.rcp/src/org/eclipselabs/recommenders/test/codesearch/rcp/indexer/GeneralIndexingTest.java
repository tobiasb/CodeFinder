package org.eclipselabs.recommenders.test.codesearch.rcp.indexer;

import junit.framework.Assert;

import org.apache.lucene.index.Term;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer;
import org.eclipselabs.recommenders.test.codesearch.AbstractTestIndex;
import org.junit.Test;

public class GeneralIndexingTest extends AbstractTestIndex {

    @Test
    public void testDeleteByTerm() throws Exception {

        final CompilationUnit cu = getSampleCompilationUnit();

        newIndex();
        final CodeIndexerIndex index = getIndexer();

        index.index(cu, new ResourcePathIndexer());
        index.commit();

        Assert.assertEquals(1, getSearchIndexer().getDocuments().size());
        final Term term = new Term(Fields.RESOURCE_PATH, ResourcePathIndexer.getPath(cu));
        index.delete(term);
        index.commit();
        Assert.assertEquals(0, getSearchIndexer().getDocuments().size());
    }
}
