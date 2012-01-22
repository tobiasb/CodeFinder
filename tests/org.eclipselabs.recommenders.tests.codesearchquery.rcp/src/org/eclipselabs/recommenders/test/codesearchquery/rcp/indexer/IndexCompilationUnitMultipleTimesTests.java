package org.eclipselabs.recommenders.test.codesearchquery.rcp.indexer;

import junit.framework.Assert;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ResourcePathIndexer;
import org.eclipselabs.recommenders.test.codesearchquery.AbstractTestIndex;
import org.junit.Test;

public class IndexCompilationUnitMultipleTimesTests extends AbstractTestIndex {

	@Test
	public void testOnce() throws Exception {

		CompilationUnit cu = getSampleCompilationUnit();
		
		newIndex();
		CodeIndexerIndex index = getIndexer(); 
		
		index.index(cu, new ResourcePathIndexer());
		
		Assert.assertEquals(1, getSearchIndexer().getDocuments().size());
	}

	@Test
	public void testTwice() throws Exception {

		CompilationUnit cu = getSampleCompilationUnit();
		
		newIndex();
		CodeIndexerIndex index = getIndexer(); 
				
		index.index(cu, new ResourcePathIndexer());
		index.index(cu, new ResourcePathIndexer());
		
		Assert.assertEquals(1, getSearchIndexer().getDocuments().size());
	}

	@Test
	public void testMultipleTimes() throws Exception {

		CompilationUnit cu = getSampleCompilationUnit();
		
		newIndex();
		CodeIndexerIndex index = getIndexer(); 
		
		index.index(cu, new ResourcePathIndexer());
		index.index(cu, new ResourcePathIndexer());
		index.index(cu, new ResourcePathIndexer());
		index.index(cu, new ResourcePathIndexer());
		index.index(cu, new ResourcePathIndexer());
		index.index(cu, new ResourcePathIndexer());
		
		Assert.assertEquals(1, getSearchIndexer().getDocuments().size());
	}
}
