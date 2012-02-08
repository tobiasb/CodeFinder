package org.eclipse.recommenders.codesearch.rcp.index.termvector;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;

public class ResourcePathProvider extends AbstractTermVectorProvider {

    @Override
    protected String[] getFields() {
        return new String[] { Fields.RESOURCE_PATH
        // ...
        };
    }

}
