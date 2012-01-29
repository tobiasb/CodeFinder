package org.eclipselabs.recommenders.codesearchquery.rcp.termvector;

import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;

public class JavaMethodProvider extends AbstractTermVectorProvider {

    @Override
    protected String[] getFields() {
        return new String[] { Fields.USED_METHODS, Fields.USED_METHODS_IN_FINALLY, Fields.USED_METHODS_IN_TRY,
                Fields.OVERRIDDEN_METHODS
        // ...
        };
    }
}
