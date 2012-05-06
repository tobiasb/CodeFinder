/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Fieldable;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableParameterUsage;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;

import com.google.common.collect.Maps;

public class ValidatorHelper {
    public static Map<String, List<String>> getVarParamUsagesByVarName(Document doc) {
        Map<String, List<String>> m = Maps.newHashMap();

        for (Fieldable f : doc.getFieldables(Fields.USED_AS_PARAMETER_IN_METHODS)) {
            String methodName = f.stringValue().split("\\|")[0];
            String origVarName = f.stringValue().split("\\|")[1];

            if (!m.containsKey(origVarName)) {
                m.put(origVarName, new ArrayList<String>());
            }

            m.get(origVarName).add(methodName);
        }

        return m;
    }

    public static Map<String, List<VariableParameterUsage>> getVarParamUsagesByVarName(VariableUsage var) {
        Map<String, List<VariableParameterUsage>> m = Maps.newHashMap();

        for (VariableParameterUsage parUsage : var.parameterUsages) {
            if (parUsage.targetVariable == null)
                continue;

            if (!m.containsKey(parUsage.targetVariable.name)) {
                m.put(parUsage.targetVariable.name, new ArrayList<VariableParameterUsage>());
            }

            m.get(parUsage.targetVariable.name).add(parUsage);
        }

        return m;
    }
}
