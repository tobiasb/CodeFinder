package org.eclipselabs.recommenders.test.codesearch.rcp.indexer;

import java.io.File;
import java.util.List;

import junit.framework.Assert;

import org.apache.lucene.document.Document;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.junit.Ignore;
import org.junit.Test;

public class ResourcePathTest {

    LuceneInMemoryFixture fixture = new LuceneInMemoryFixture();

    @Test
    @Ignore("Well, this obviously fails when executed in a *nix environment. Silly me...")
    public void testPath() {
        final File f = new File("c:\\test-folder\\test.java");

        // NOTE: MB: I removed this replacing \\\ stuff what is this needed for?
        final String actualPath = ResourcePathIndexer.getPath(f);

        Assert.assertEquals("c\\:\\\\test\\-folder\\\\test.java", actualPath);
    }

    @Test
    public void testIndexPathIndexedCorrectly() throws Exception {
        final String filePath = "C:\\eclipseworkspace\\junit-workspace\\testProject\\MyInstanceOfClass.java";

        final Document doc = new Document();
        CodeIndexer.addAnalyzedField(doc, Fields.RESOURCE_PATH, filePath);

        final CodeIndexer index = fixture.index;
        index.addDocument(doc);
        index.commit();

        final List<Document> results = fixture.searcher.getDocuments();

        Assert.assertEquals(1, results.size());
        Assert.assertNotNull(results.get(0).get(Fields.RESOURCE_PATH));
        Assert.assertEquals(filePath, results.get(0).get(Fields.RESOURCE_PATH));
    }

    @Test
    public void testIndexPathFoundCorrectly() throws Exception {
        final String filePath = "C:\\eclipseworkspace\\junit-workspace\\testProject\\MyInstanceOfClass.java";

        final Document doc = new Document();
        CodeIndexer.addAnalyzedField(doc, Fields.RESOURCE_PATH, filePath);

        final CodeIndexer index = fixture.index;
        final CodeSearcher searcherIndex = fixture.searcher;
        index.addDocument(doc);
        index.commit();

        final List<Document> results = searcherIndex.search(Fields.RESOURCE_PATH + ":"
                + ResourcePathIndexer.escape(filePath));

        Assert.assertEquals(1, results.size());
        Assert.assertNotNull(results.get(0).get(Fields.RESOURCE_PATH));
        Assert.assertEquals(filePath, results.get(0).get(Fields.RESOURCE_PATH));
    }
}
