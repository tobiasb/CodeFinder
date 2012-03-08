package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler;

import java.util.List;

import com.google.common.collect.Lists;

public class Node {
    public List<String> typeNames = Lists.newArrayList();
    public Node nextNode;

    public Node(String... types) {
        for (String t : types)
            typeNames.add(t);
    }
}
