package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	
    public static void logError(final Throwable e, final String format, final Object... args) {
        //LoggingUtils.logError(e, getDefault(), format, args);
        logConsole(e, format, args);
    }

    public static void logWarning(final Throwable e, final String format, final Object... args) {
//        LoggingUtils.logError(e, getDefault(), format, args);
        logConsole(e, format, args);
    }

    public static void logWarning(final String format, final Object... args) {
//        LoggingUtils.logWarning(null, getDefault(), format, args);
        logConsole(null, format, args);
    }

    public static void logInfo(final String format, final Object... args) {
//        LoggingUtils.newInfo(Activator.PLUGIN_ID, format, args);
        logConsole(null, format, args);
    }
    
    private static void logConsole(final Throwable e, final String format, final Object... args) {
        try {
            System.out.println(String.format(format, args));
            if(e != null) {
                e.printStackTrace();
            }
        }catch(Exception ex) {
            System.out.println(String.format("String [%1$s] cannot be formatted correctly. Stacktrace: %2$s", format, ex.getStackTrace()));
        }
    }
    
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
