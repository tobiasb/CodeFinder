package org.eclipselabs.recommenders.test.codesearchquery.rcp.indexer;

import java.io.File;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ResourcePathIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.TimestampIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.utils.CompilationUnitHelper;
import org.eclipselabs.recommenders.test.codesearchquery.AbstractTestIndex;
import org.junit.Test;

import com.google.common.collect.Lists;

public class LastIndexedTimestamp extends AbstractTestIndex {

	@Test
	public void testLastUpdatedGtZero() throws Exception {

		ICompilationUnit icu = getSampleICompilationUnit();
        IResource resource = icu.getUnderlyingResource();
        File location = resource.getLocation().toFile();
		        
		newIndex();
		CodeIndexerIndex index = getIndexer(); 
		
		List<IIndexer> indexer = Lists.newArrayList();
		indexer.add(new ResourcePathIndexer());
		indexer.add(new TimestampIndexer());

        CompilationUnit cu = CompilationUnitHelper.parse(icu);
		index.index(cu, indexer);
		
		long lastUpdated = index.lastIndexed(location);
		
		
		Assert.assertTrue(lastUpdated > 0);
	}
}
