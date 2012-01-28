package org.eclipselabs.recommenders.internal.codesearchquery.rcp;

import static org.eclipse.recommenders.utils.Checks.ensureIsTrue;
import static org.eclipse.recommenders.utils.Throws.throwUnhandledException;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipselabs.recommenders.codesearchquery.rcp.CodeSearchQuery;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.internal.codesearchquery.rcp.indexing.IndexUpdaterJob;
import org.eclipselabs.recommenders.internal.codesearchquery.rcp.indexing.IndexUpdaterService;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class CSQModule extends AbstractModule {

    @Override
    protected void configure() {

        configureLuceneIndex();

        bind(Services.class).asEagerSingleton();
    }

    @Provides
    @Singleton
    public IndexUpdaterService providerIndexUpdateService(final EventBus workspaceBus, final CodeIndexerIndex indexer) {
        final IndexUpdaterService service = new IndexUpdaterService(indexer);
        workspaceBus.register(service);
        return service;
    }

    private void configureLuceneIndex() {
        try {
            final File folder = findOrCreateIndexFolder();
            deleteOldLocks(folder);
            final FSDirectory directory = FSDirectory.open(folder);
            bind(Directory.class).annotatedWith(CodeSearchQuery.class).toInstance(directory);
            bind(CodeIndexerIndex.class).toInstance(new CodeIndexerIndex(directory));
            // // don't bind an unnamed index to the same folder!
            // bind(Directory.class).toInstance(directory);
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
        final File basedir = org.eclipselabs.recommenders.internal.codesearchquery.rcp.Activator.getDefault()
                .getStateLocation().toFile();
        final File indexdir = new File(basedir, "index");
        indexdir.mkdirs();
        return indexdir;
    }

    private static class Services {

        @Inject
        public Services(final IndexUpdaterService service, final CodeIndexerIndex indexer,
                final IWorkspaceRoot workspace) {

            final IndexUpdaterJob job = new IndexUpdaterJob(indexer, workspace);
            job.setPriority(Job.DECORATE);
            job.schedule();
        }
    }
}
