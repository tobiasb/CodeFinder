package org.eclipselabs.recommenders.test.codesearchquery.rcp.indexer;

import java.io.File;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
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

public class LastIndexedTimestampTest extends AbstractTestIndex {

    @Test
    public void testLastUpdatedGtZero() throws Exception {

        final ICompilationUnit icu = getSampleICompilationUnit();

        final ResourcePathIndexer rpi = new ResourcePathIndexer();
        final IPath p = Path.fromPortableString(rpi.getResourcePath(CompilationUnitHelper.parse(icu)));
        final File location = p.toFile();

        newIndex();
        final CodeIndexerIndex index = getIndexer();

        final List<IIndexer> indexer = Lists.newArrayList();
        indexer.add(rpi);
        indexer.add(new TimestampIndexer());

        final CompilationUnit cu = CompilationUnitHelper.parse(icu);
        index.index(cu, indexer);

        final long lastUpdated = index.lastIndexed(location);

        Assert.assertTrue(lastUpdated > 0);
    }
}
