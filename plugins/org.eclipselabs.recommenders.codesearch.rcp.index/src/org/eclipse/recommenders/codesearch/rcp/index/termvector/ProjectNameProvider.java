package org.eclipse.recommenders.codesearch.rcp.index.termvector;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;

public class ProjectNameProvider extends AbstractTermVectorProvider {

    @Override
    protected String[] getFields() {
        return new String[] { Fields.PROJECT_NAME };
    }

}
