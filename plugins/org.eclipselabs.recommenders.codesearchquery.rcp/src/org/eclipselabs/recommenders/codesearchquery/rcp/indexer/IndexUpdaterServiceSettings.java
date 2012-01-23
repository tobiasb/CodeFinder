package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

public class IndexUpdaterServiceSettings {

	private static boolean noDispatch = false;
	
	public static void setNoDispatch(boolean value) {
		IndexUpdaterServiceSettings.noDispatch = value;
	}
	
	/**
	 * Should workspace events be processed when fired?
	 */
	public static boolean getNoDispatch() {
		return noDispatch;
	}
}
