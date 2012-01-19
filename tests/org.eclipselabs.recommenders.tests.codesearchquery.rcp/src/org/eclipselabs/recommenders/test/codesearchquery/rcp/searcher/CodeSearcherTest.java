package org.eclipselabs.recommenders.test.codesearchquery.rcp.searcher;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.queryParser.ParseException;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.CodeSearcherIndex;
import org.eclipselabs.recommenders.test.codesearchquery.AbstractTestIndex;
import org.junit.Assert;
import org.junit.Test;

public class CodeSearcherTest extends AbstractTestIndex {
	
	@Test
	public void testSimpleSearchReturnsSomething() throws IOException, ParseException {
		newIndex()
			.newDoc()
				.addField(Fields.TYPE, Fields.TYPE_CLASS)
		.finish();
		
		CodeSearcherIndex sut = getSearchIndexer();
		
		List<Document> result = sut.search(String.format("%s:%s", Fields.TYPE, Fields.TYPE_CLASS));
		
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
	}

	@Test
	public void testGetAllDocuments() throws IOException {
		newIndex()
			.newDoc()
			.newDoc()
			.newDoc()
		.finish();
		
		List<Document> docs = getSearchIndexer().getDocuments();

		Assert.assertNotNull(docs);
		Assert.assertEquals(3, docs.size());
	}
}
