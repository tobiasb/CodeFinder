/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableParameterUsage;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.VariableUsage;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.validation.ValidatorHelper;
import org.junit.Test;

public class ValidatorHelperTest {

    @Test
    public void testVariableParamUsagesSimple() {
        VariableUsage v = new VariableUsage("testName1", "testOrigin1");
        Map<String, List<VariableParameterUsage>> m = ValidatorHelper.getVarParamUsagesByVarName(v);

        assertNotNull(m);
    }

    @Test
    public void testVariableParamUsagesSomeUsages() {
        VariableUsage v1 = new VariableUsage("testName1", "testOrigin1");
        VariableUsage v2 = new VariableUsage("testName2", "testOrigin2");
        v2.parameterUsages.add(new VariableParameterUsage(v1, "method1"));

        Map<String, List<VariableParameterUsage>> m = ValidatorHelper.getVarParamUsagesByVarName(v2);

        assertNotNull(m);
    }

    @Test
    public void testVariableParamUsagesSomeUsagesTargetVarMissing() {
        VariableUsage v2 = new VariableUsage("testName2", "testOrigin2");
        v2.parameterUsages.add(new VariableParameterUsage(null, "method1"));

        Map<String, List<VariableParameterUsage>> m = ValidatorHelper.getVarParamUsagesByVarName(v2);

        assertNotNull(m);
    }
}
