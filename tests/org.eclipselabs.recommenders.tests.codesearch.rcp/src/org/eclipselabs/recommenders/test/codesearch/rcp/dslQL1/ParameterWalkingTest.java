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

package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL1;

import java.util.List;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.QL1StandaloneSetup;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.Node;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler.NodeWalker;
import org.junit.Test;

public class ParameterWalkingTest extends QL1TestBase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        with(QL1StandaloneSetup.class);
    }

    @Test
    public void createParameterQueryPartCombinationsTest() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");

        n1.nextNode = n2; // wiring

        NodeWalker nw = new NodeWalker();
        List<StringBuilder> result = nw.walk(n1);

        assertTrue(result.size() == 2);
        assertEquals("T1;T21;", result.get(0).toString());
        assertEquals("T1;T22;", result.get(1).toString());
    }

    @Test
    public void paramGraphFitsTestSimple() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21");
        n1.nextNode = n2; // wiring

        String actualParams = "T1;T21;";

        checkGraphTrue(n1, actualParams);
    }

    @Test
    public void paramGraphFitsTestSimple01() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring

        checkGraphTrue(n1, "T1;T21;");
        checkGraphTrue(n1, "T1;T22;");
    }

    @Test
    public void paramGraphFitsAnyOneTest() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("*");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "T1;foo;T21;");
        checkGraphTrue(n1, "T1;foo;T22;");

        checkGraphFalse(n1, "T1;T22;");
        checkGraphFalse(n1, "T1;foo;bar;T22;");
    }

    @Test
    public void paramGraphFitsAnyOneTest02() {
        final Node n1 = new Node("*");
        final Node n2 = new Node("T1");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "foo;T1;T21;");
        checkGraphTrue(n1, "foo;T1;T22;");

        checkGraphFalse(n1, "T1;T22;");
        checkGraphFalse(n1, "T1;foo;bar;T22;");
        checkGraphFalse(n1, "foo;T1;T22;bar;");
    }

    @Test
    public void paramGraphFitsAnyOneTest03() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        final Node n3 = new Node("*");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "T1;T21;foo;");
        checkGraphTrue(n1, "T1;T22;foo;");

        checkGraphFalse(n1, "T1;T22;");
        checkGraphFalse(n1, "T1;foo;bar;T22;");
    }

    @Test
    public void paramGraphFitsAnyOneTest04() {
        final Node n1 = new Node("*");
        final Node n2 = new Node("T1");
        final Node n3 = new Node("*");
        final Node n4 = new Node("T21", "T22");
        final Node n5 = new Node("*");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring
        n3.nextNode = n4; // wiring
        n4.nextNode = n5; // wiring

        checkGraphTrue(n1, "bar;T1;bla;T21;foo;");
        checkGraphTrue(n1, "bar;T1;bla;T22;foo;");

        checkGraphFalse(n1, "T1;T22;");
        checkGraphFalse(n1, "T1;foo;bar;T22;");
    }

    @Test
    public void paramGraphFitsAnyTest() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("..");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "T1;foo;T21;");
        checkGraphTrue(n1, "T1;foo;T22;");

        checkGraphTrue(n1, "T1;T22;");
        checkGraphTrue(n1, "T1;foo;bar;T22;");
    }

    @Test
    public void paramGraphFitsAnyTest02() {
        final Node n1 = new Node("..");
        final Node n2 = new Node("T1");
        final Node n3 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "foo;T1;T21;");
        checkGraphTrue(n1, "foo;T1;T22;");

        checkGraphTrue(n1, "foo;foo;T1;T22;");
        checkGraphTrue(n1, "foo;foo;foo;T1;T21;");
    }

    @Test
    public void paramGraphFitsAnyTest03() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        final Node n3 = new Node("..");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring
        n2.nextNode = n3; // wiring

        checkGraphTrue(n1, "T1;T21;foo;");
        checkGraphTrue(n1, "T1;T22;foo;");

        checkGraphTrue(n1, "T1;T22;");
        checkGraphTrue(n1, "T1;T22;foo;bar;");
    }

    @Test
    public void paramGraphFitsAnyTest04() {
        final Node n1 = new Node("..");
        final Node n2 = new Node("T1");
        final Node n3 = new Node("..");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring
        n2.nextNode = n3; // wiring
        n3.prevNode = n2; // wiring

        checkGraphTrue(n1, "foo;T1;T21;");
        checkGraphTrue(n1, "foo;T1;bar;");

        checkGraphTrue(n1, "foo;foo;T1;T22;bar;fobar;");
        checkGraphTrue(n1, "foo;foo;foo;T1;T21;");
    }

    @Test
    public void paramGraphFitsAnyTest05() {
        final Node n1 = new Node("..");
        final Node n2 = new Node("T1");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring

        checkGraphTrue(n1, "T1;");
        checkGraphTrue(n1, "foo;T1;");
        checkGraphTrue(n1, "foo;bar;T1;");

        checkGraphFalse(n1, "foo;foo;T1;T22;bar;fobar;");
        checkGraphFalse(n1, "foo;foo;foo;T1;T21;");
    }

    @Test
    public void paramGraphFitsAnyTest06() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("..");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring

        checkGraphTrue(n1, "T1;");
        checkGraphTrue(n1, "T1;foo;");
        checkGraphTrue(n1, "T1;foo;bar;");

        checkGraphFalse(n1, "foo;foo;T1;T22;bar;fobar;");
        checkGraphFalse(n1, "foo;foo;foo;T1;T21;");
    }

    @Test
    public void paramGraphFitsNotTestSimple01() {
        final Node n1 = new Node("T1");
        final Node n2 = new Node("T21", "T22");
        n1.nextNode = n2; // wiring
        n2.prevNode = n1; // wiring

        checkGraphFalse(n1, "T1;T21;T31;");
        checkGraphFalse(n1, "T1;T23;");
    }
}
