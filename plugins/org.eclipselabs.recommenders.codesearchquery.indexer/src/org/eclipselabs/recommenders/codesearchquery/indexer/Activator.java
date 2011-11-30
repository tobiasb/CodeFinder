package org.eclipselabs.recommenders.codesearchquery.indexer;

import org.eclipse.recommenders.utils.LoggingUtils;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.eclipselabs.recommenders.codesearchquery.indexer"; //$NON-NLS-1$
    public static Injector injector = Guice.createInjector(new CodesearchQueryModule());

    // The shared instance
    private static Activator plugin;

    public static Activator getDefault() {
        return plugin;
    }

    public static void logError(final Throwable e, final String format, final Object... args) {
        LoggingUtils.logError(e, getDefault(), format, args);
    }

    public static void logWarning(final Throwable e, final String format, final Object... args) {
        LoggingUtils.logError(e, getDefault(), format, args);
    }

    public static void logWarning(final String format, final Object... args) {
        LoggingUtils.logWarning(null, getDefault(), format, args);
    }

    public static void logInfo(final String format, final Object... args) {
        LoggingUtils.newInfo(Activator.PLUGIN_ID, format, args);
    }
    
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

}
