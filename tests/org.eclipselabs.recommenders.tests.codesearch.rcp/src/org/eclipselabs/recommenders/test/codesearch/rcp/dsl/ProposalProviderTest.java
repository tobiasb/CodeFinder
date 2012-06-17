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

package org.eclipselabs.recommenders.test.codesearch.rcp.dsl;

import static org.junit.Assert.assertEquals;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.ui.contentassist.QL2ProposalProvider;
import org.junit.Test;

public class ProposalProviderTest {

    @Test
    public void testMethodNameConversionWithReturnType() {
        String expected = "htmlremoveY()";
        String actual = QL2ProposalProvider
                .getRawMethodNameWithBrackets("org.test.SomeType.htmlremoveY()Ljava.lang.String;");

        assertEquals(expected, actual);
    }

    @Test
    public void testMethodNameConversionSimple() {
        String expected = "htmlremoveY()";
        String actual = QL2ProposalProvider.getRawMethodNameWithBrackets("org.test.SomeType.htmlremoveY()V;");

        assertEquals(expected, actual);
    }

    @Test
    public void testMethodNameConversionParameter() {
        String expected = "doX()";
        String actual = QL2ProposalProvider.getRawMethodNameWithBrackets("org.test.SomeType.doX(Lorg.test.SomeType;)V");

        assertEquals(expected, actual);
    }
}
