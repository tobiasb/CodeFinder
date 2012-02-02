package org.eclipselabs.recommenders.internal.codesearchquery.rcp;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.recommenders.injection.InjectionService;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.eclipselabs.recommenders.codesearchquery.rcp"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

    public static Activator getDefault() {
        return plugin;
    }

    public static void logError(final Throwable e, final String format, final Object... args) {
        logConsole(e, format, args);
    }

    public static void logError(final Throwable e) {
        logConsole(e, null);
    }

    public static void logWarning(final Throwable e, final String format, final Object... args) {
        logConsole(e, format, args);
    }

    public static void logWarning(final String format, final Object... args) {
        logConsole(null, format, args);
    }

    public static void logInfo(final String format, final Object... args) {
        logConsole(null, format, args);
    }

    public static void log(final IStatus s) {
        logConsole(s);
    }

    private static void logConsole(final Throwable e, final String format, final Object... args) {
        try {
            if (format != null) {
                System.out.println(String.format(format, args));
            }
            if (e != null) {
                e.printStackTrace();
            }
        } catch (final Exception ex) {
            System.out.println(String.format("String [%1$s] cannot be formatted correctly. Stacktrace: %2$s", format,
                    ex.getStackTrace()));
        }
    }

    private static void logConsole(final IStatus s) {
        System.out.println(s);
    }

    @Override
    public void start(final BundleContext context) throws Exception {
        plugin = this;
        super.start(context);
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
        InjectionService.getInstance().requestInstance(CodeIndexerIndex.class).close();
    }

}
