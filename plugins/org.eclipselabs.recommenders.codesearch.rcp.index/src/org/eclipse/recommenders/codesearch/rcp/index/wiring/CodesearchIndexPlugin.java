package org.eclipse.recommenders.codesearch.rcp.index.wiring;

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
}
