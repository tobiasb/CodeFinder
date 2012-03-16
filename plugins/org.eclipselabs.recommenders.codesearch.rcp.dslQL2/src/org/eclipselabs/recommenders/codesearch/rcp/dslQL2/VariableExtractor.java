package org.eclipselabs.recommenders.codesearch.rcp.dslQL2;

import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Var;

import com.google.common.collect.Maps;

public class VariableExtractor {

    public Map<String, VariableUsage> getVars(EObject model) {
        Map<String, VariableUsage> result = getVariableDeclarations(model);

        if (model == null)
            return result;

        TreeIterator<EObject> iter = model.eAllContents();

        if (!iter.hasNext())
            return result;

        do {
            final EObject o = iter.next();

            // if (o instanceof MethodCall) {
            // MethodCall m = (MethodCall) o;
            //
            // // VariableUsage v = result.get(m.getName());
            // //
            // // if (v != null) {
            // // v.calledMethodsOnVariable.add(m.getMethod());
            // // }
            // }

        } while (iter.hasNext());

        return result;
    }

    private Map<String, VariableUsage> getVariableDeclarations(EObject model) {
        Map<String, VariableUsage> result = Maps.newHashMap();

        if (model == null)
            return result;

        TreeIterator<EObject> iter = model.eAllContents();

        if (!iter.hasNext())
            return result;

        do {
            final EObject o = iter.next();

            if (o instanceof Var) {
                VariableUsage v = new VariableUsage(((Var) o).getName(), null);
                v.type = ((Var) o).getType();

                result.put(v.name, v);
            }

        } while (iter.hasNext());

        return result;
    }
}
