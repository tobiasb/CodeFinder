package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;

public interface ICompilationUnitIndexer {

    /**
     * Indexes a CompilationUnit using the set of default indexers. Before
     * indexing all documents with the same ResourcePath will be deleted from
     * the index.
     * 
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ResourcePathIndexer
     */
    public void index(CompilationUnit cu) throws IOException;

    /**
     * Indexes a CompilationUnit using only the provided indexer. Before
     * indexing all documents with the same ResourcePath will be deleted from
     * the index.
     * 
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ResourcePathIndexer
     */
    public void index(CompilationUnit cu, IIndexer indexer) throws IOException;

    /**
     * Indexes a CompilationUnit using the set of provided indexers. Before
     * indexing all documents with the same ResourcePath will be deleted from
     * the index.
     * 
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ResourcePathIndexer
     */
    public void index(CompilationUnit cu, List<IIndexer> indexer) throws IOException;

    /**
     * Deletes documents associated with this CompilationUnit from the index.
     */
    public void delete(CompilationUnit cu) throws IOException;

    /**
     * Deletes all documents from the index.
     */
    public void truncateIndex();

    /**
     * Determines last time that the file has been indexed. Returns 0L if it
     * hasn't been indexed before or if either the TimestampIndexer or
     * ResourcePathIndexer haven't been used during indexing.
     */
    public long lastIndexed(final File location);

    /**
     * Closes the resources associated with this object. Must be called in order
     * to reuse the index.
     */
    public void close();
}
