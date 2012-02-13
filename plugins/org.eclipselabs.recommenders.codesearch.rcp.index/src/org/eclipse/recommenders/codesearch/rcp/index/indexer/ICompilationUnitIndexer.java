package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.io.IOException;
import java.util.List;

import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IIndexer;

public interface ICompilationUnitIndexer {

    /**
     * Indexes a CompilationUnit using the set of default indexers. Before indexing all documents with the same
     * ResourcePath will be deleted from the index.
     * 
     * @see org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer
     */
    public void index(final CompilationUnit cu) throws IOException;

    /**
     * Indexes a CompilationUnit using only the provided indexer. Before indexing all documents with the same
     * ResourcePath will be deleted from the index.
     * 
     * @see org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer
     */
    public void index(final CompilationUnit cu, final IIndexer indexer) throws IOException;

    /**
     * Indexes a CompilationUnit using the set of provided indexers. Before indexing all documents with the same
     * ResourcePath will be deleted from the index.
     * 
     * @see org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer
     */
    public void index(final CompilationUnit cu, final List<IIndexer> indexer) throws IOException;

    /**
     * Deletes documents associated with this CompilationUnit from the index.
     */
    public void delete(final CompilationUnit cu) throws IOException;

    /**
     * Deletes all documents from the index.
     */
    public void truncateIndex();

    /**
     * Determines last time that the file has been indexed. Returns 0L if it hasn't been indexed before or if either the
     * TimestampIndexer or ResourcePathIndexer haven't been used during indexing.
     */
    public long lastIndexed(final String location);

    /**
     * Closes the resources associated with this object. Must be called in order to reuse the index.
     */
    public void close();
}
