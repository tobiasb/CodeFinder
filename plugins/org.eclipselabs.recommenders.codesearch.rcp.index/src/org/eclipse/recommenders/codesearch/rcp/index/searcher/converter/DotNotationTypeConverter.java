package org.eclipse.recommenders.codesearch.rcp.index.searcher.converter;

public class DotNotationTypeConverter extends AbstractQueryPartConverter {

    @Override
    public String convertFrom(final String queryPart) {
        String tmp = queryPart;

        if (!tmp.startsWith("L")) {
            tmp = "L" + tmp;
        }

        tmp = tmp.replace(".", "/");

        return tmp;
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
