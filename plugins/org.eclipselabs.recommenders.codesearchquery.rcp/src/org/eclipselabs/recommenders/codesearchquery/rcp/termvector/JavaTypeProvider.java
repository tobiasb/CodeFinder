package org.eclipselabs.recommenders.codesearchquery.rcp.termvector;

import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;

public class JavaTypeProvider extends AbstractTermVectorProvider {

    @Override
    protected String[] getFields() {
        return new String[] { Fields.USED_TYPES, Fields.ALL_EXTENDED_TYPES, Fields.ALL_IMPLEMENTED_TYPES
        // ...
        };
    }

}
