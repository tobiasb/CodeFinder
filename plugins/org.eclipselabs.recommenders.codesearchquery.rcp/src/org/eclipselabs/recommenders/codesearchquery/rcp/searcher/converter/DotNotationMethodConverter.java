package org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter;

public class DotNotationMethodConverter extends AbstractQueryPartConverter implements IQueryPartConverter {

    @Override
    public String convertFrom(final String queryPart) {
        String tmp = queryPart;

        tmp = "L" + tmp;

        while (tmp.indexOf(".") < tmp.lastIndexOf(".")) {
            // The dot that seperates the "type" part from the "method" part
            // must survive
            tmp = tmp.replaceFirst("\\.", "/");
        }

        tmp = tmp + "\\(*";
        return tmp;
    }

    @Override
    public String convertTo(final String queryPart) {
        String tmp = queryPart;

        if (tmp.startsWith("L")) {
            tmp = tmp.substring(1);
        }

        tmp = tmp.replace("/", ".");

        // Removes trailing "(...)V"-Part
        tmp = tmp.replaceAll("\\(.*?\\)V", "");

        return tmp;
    }
}
