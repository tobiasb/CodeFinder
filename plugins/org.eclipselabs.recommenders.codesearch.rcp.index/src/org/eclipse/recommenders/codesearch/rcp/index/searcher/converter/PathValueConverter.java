package org.eclipse.recommenders.codesearch.rcp.index.searcher.converter;

public class PathValueConverter extends AbstractQueryPartConverter implements IQueryPartConverter {

    @Override
    public String convertFrom(final String queryPart) {
        String result = queryPart;

        // result = result.replaceFirst("/", ":");
        // result = result.replace(":", ":\\");
        // result = result.replace("/", "\\");
        result = result.replace(":", "\\:");

        return result;
    }

    @Override
    public String convertTo(final String queryPart) {
        String result = queryPart;

        // result = result.replace("\\", "/");
        // result = result.replace(":", "\\:");
        result = result.replace("\\:", ":");

        return result;
    }

}
