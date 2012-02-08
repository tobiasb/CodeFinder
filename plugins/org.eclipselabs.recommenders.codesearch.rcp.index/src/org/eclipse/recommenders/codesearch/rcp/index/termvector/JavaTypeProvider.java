package org.eclipse.recommenders.codesearch.rcp.index.termvector;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;

public class JavaTypeProvider extends AbstractTermVectorProvider {

    @Override
    protected String[] getFields() {
        return new String[] { Fields.USED_TYPES, Fields.ALL_EXTENDED_TYPES, Fields.ALL_IMPLEMENTED_TYPES
        // ...
        };
    }

}
