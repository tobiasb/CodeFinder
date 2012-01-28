package org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter;

public interface IQueryPartConverter {
    public String convertFrom(String queryPart);

    public String convertTo(String queryPart);
}
