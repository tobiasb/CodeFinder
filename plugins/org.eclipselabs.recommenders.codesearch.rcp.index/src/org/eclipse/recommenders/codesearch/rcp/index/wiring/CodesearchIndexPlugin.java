package org.eclipse.recommenders.codesearch.rcp.index.wiring;

import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexer;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class CodesearchIndexPlugin extends AbstractUIPlugin {

    private static CodesearchIndexPlugin INSTANCE;

    public static CodesearchIndexPlugin getDefault() {
        return INSTANCE;
    }

    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        INSTANCE = this;
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        super.stop(context);
        final CodeIndexer instance = InjectionService.getInstance().getInjector()
                .getInstance(CodeIndexer.class);
        instance.close();
    }
}
