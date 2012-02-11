package org.eclipse.recommenders.codesearch.rcp.index.wiring;

import static org.eclipse.recommenders.utils.Checks.ensureIsTrue;
import static org.eclipse.recommenders.utils.Throws.throwUnhandledException;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.recommenders.codesearch.rcp.index.CodeSearch;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcherIndex;
import org.eclipse.recommenders.codesearch.rcp.index.ui.IndexUpdateService;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class CodesearchIndexModule extends AbstractModule {

    @Override
    protected void configure() {

        configureLuceneIndex();

        bind(Services.class).asEagerSingleton();
    }

    @Provides
    @Singleton
    public IndexUpdateService providerIndexUpdateService(final EventBus workspaceBus, final CodeIndexerIndex indexer,
            final IWorkspaceRoot workspace) {
        final IndexUpdateService service = new IndexUpdateService(indexer, workspace);
        workspaceBus.register(service);
        return service;
    }

    private void configureLuceneIndex() {
        try {
            final File folder = findOrCreateIndexFolder();
            deleteOldLocks(folder);
            final FSDirectory directory = FSDirectory.open(folder);
            bind(Directory.class).annotatedWith(CodeSearch.class).toInstance(directory);
            // this is needed by GenericQueryProposalProvider ATM
            bind(Directory.class).toInstance(directory);
        } catch (final IOException e) {
            // this is critical!
            throwUnhandledException(e);
        }
    }

    private void deleteOldLocks(final File folder) {
        final File file = new File(folder, "write.lock");
        if (file.exists()) {
            ensureIsTrue(file.delete(), "failed to remove old write lock file");
        }

    }

    private File findOrCreateIndexFolder() {
        final File basedir = CodesearchIndexPlugin.getDefault().getStateLocation().toFile();
        final File indexdir = new File(basedir, "index");
        indexdir.mkdirs();
        return indexdir;
    }

    @Provides
    @Singleton
    public CodeIndexerIndex provideCSQIndexForIndexing(@CodeSearch final Directory dir) throws IOException {
        return new CodeIndexerIndex(dir);
    }

    @Provides
    @Singleton
    public CodeSearcherIndex provideCSQIndexForSearching(@CodeSearch final Directory dir) throws IOException {
        return new CodeSearcherIndex(dir);
    }

    private static class Services {

        @Inject
        public Services(final IndexUpdateService service, final CodeIndexerIndex indexer, final IWorkspaceRoot workspace) {
        }
    }
}
