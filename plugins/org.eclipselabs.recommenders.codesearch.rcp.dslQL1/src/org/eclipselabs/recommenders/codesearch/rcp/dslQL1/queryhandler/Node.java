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

package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler;

import java.util.List;

import com.google.common.collect.Lists;

public class Node {
    public List<String> typeNames = Lists.newArrayList();
    public Node nextNode;
    public Node prevNode;

    public Node(String... types) {
        for (String t : types)
            typeNames.add(t);
    }
}
