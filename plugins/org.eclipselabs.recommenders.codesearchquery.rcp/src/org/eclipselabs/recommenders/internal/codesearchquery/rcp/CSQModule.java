package org.eclipselabs.recommenders.internal.codesearchquery.rcp;

import static org.eclipse.recommenders.utils.Throws.throwUnhandledException;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
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
        IndexUpdaterService service = new IndexUpdaterService(indexer);
        workspaceBus.register(service);
        return service;
    }

    private void configureLuceneIndex() {
        try {
            File folder = findOrCreateIndexFolder();
            SimpleFSDirectory directory = new SimpleFSDirectory(folder);
            bind(Directory.class).annotatedWith(CodeSearchQuery.class).toInstance(directory);
            bind(Directory.class).toInstance(directory);
        } catch (IOException e) {
            // this is critical!
            throwUnhandledException(e);
        }
    }

    private File findOrCreateIndexFolder() {
        File basedir = org.eclipselabs.recommenders.internal.codesearchquery.rcp.Activator.getDefault()
                .getStateLocation().toFile();
        File indexdir = new File(basedir, "index");
        indexdir.mkdirs();
        return indexdir;
    }

    @Provides
    @Singleton
    public CodeIndexerIndex provideCSQIndex(@CodeSearchQuery final Directory dir) throws IOException {
        return new CodeIndexerIndex(dir);
    }

    private static class Services {

        @Inject
        public Services(final IndexUpdaterService service, final CodeIndexerIndex indexer,
                final IWorkspaceRoot workspace) {

            IndexUpdaterJob job = new IndexUpdaterJob(indexer, workspace);
            job.setPriority(Job.DECORATE);
            job.schedule();
        }
    }
}
