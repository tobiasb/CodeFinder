package org.eclipse.recommenders.codesearch.rcp.index.searcher.converter;

public interface IQueryPartConverter {
    /**
     * Converts the queryPart into the string used in the final query
     * 
     * @param queryPart
     * @return
     */
    public String convertFrom(String queryPart);

    /**
     * Converts the queryPart into the string displayed in content assist
     * 
     * @param queryPart
     * @return
     */
    public String convertTo(String queryPart);
}
