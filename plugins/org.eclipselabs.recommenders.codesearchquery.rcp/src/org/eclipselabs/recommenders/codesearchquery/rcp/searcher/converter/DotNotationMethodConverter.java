package org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter;

public class DotNotationMethodConverter extends AbstractQueryPartConverter implements IQueryPartConverter {

    @Override
    public String convertFrom(final String queryPart) {
        return "L" + queryPart.replace(".", "/");
    }

    @Override
    public String convertTo(final String queryPart) {
        String tmp = queryPart;

        if (tmp.startsWith("L")) {
            tmp = tmp.substring(1);
        }

        tmp = tmp.replace("/", ".");

        return tmp;
    }
}
