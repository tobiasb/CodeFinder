package org.eclipselabs.recommenders.codesearchquery.rcp.termvector;

import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;

public class ProjectNameProvider extends AbstractTermVectorProvider {

    @Override
    protected String[] getFields() {
        return new String[] { Fields.PROJECT_NAME };
    }

}
