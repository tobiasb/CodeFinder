package org.eclipselabs.recommenders.test.codesearchquery.rcp.searcher;

import java.io.IOException;
import java.util.Set;

import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.test.codesearchquery.AbstractTestIndex;
import org.junit.Assert;
import org.junit.Test;

public class TermVectorTest extends AbstractTestIndex {
	
	@Test
	public void testSimpleTermVector() throws IOException {
		newIndex()
			.newDoc()
				.addField(Fields.USED_TYPES, "testTermVector01")
		.finish();
		
		Set<String> vec = getSearchIndexer().getTermVector(Fields.USED_TYPES);
		
		Assert.assertEquals(1, vec.size());
		Assert.assertTrue(vec.contains("testTermVector01"));
	}
}
