package org.eclipse.recommenders.codesearch.rcp.index.termvector;

import org.eclipse.recommenders.codesearch.rcp.index.Fields;

public class JavaMethodProvider extends AbstractTermVectorProvider {

    @Override
    protected String[] getFields() {
        return new String[] { Fields.USED_METHODS, Fields.USED_METHODS_IN_FINALLY, Fields.USED_METHODS_IN_TRY,
                Fields.OVERRIDDEN_METHODS, Fields.USED_AS_TAGET_FOR_METHODS, Fields.USED_AS_PARAMETER_IN_METHODS,
                Fields.DECLARED_METHODS
        // ...
        };
    }
}
