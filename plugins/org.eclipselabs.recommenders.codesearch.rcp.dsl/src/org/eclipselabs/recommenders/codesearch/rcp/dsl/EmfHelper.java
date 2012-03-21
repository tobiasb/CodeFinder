package org.eclipselabs.recommenders.codesearch.rcp.dsl;

import org.eclipse.emf.ecore.EObject;

public class EmfHelper {
    public static EObject getRoot(final EObject o) {
        EObject obj = o;

        while (obj != null) {
            if (obj.eContainer() == null)
                return obj;

            obj = obj.eContainer();
        }

        return obj;
    }
}
