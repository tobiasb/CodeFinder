package org.eclipse.recommenders.internal.codesearch.rcp.views;

public interface ISearchView {
    public void doSearch() throws Exception;

    public void setSearchEnabled(boolean value);
}
