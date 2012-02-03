package org.eclipselabs.recommenders.internal.codesearchquery.rcp.views;

public interface ISearchView {
    public void doSearch() throws Exception;

    public void setSearchEnabled(boolean value);
}
