package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler;

import java.util.List;

import com.google.common.collect.Lists;

public class NodeWalker {
    List<StringBuilder> sbList = Lists.newArrayList();

    public List<StringBuilder> walk(Node n) {
        while (n != null && n.typeNames.size() > 0) {

            if (n.typeNames.size() == 1) {
                if (sbList.size() == 0) {
                    sbList.add(new StringBuilder(getTypeString(n.typeNames.get(0))));
                } else {
                    for (StringBuilder sb : sbList) {
                        sb.append(getTypeString(n.typeNames.get(0)));
                    }
                }
            } else { // > 1
                if (sbList.size() == 0) {
                    for (String type : n.typeNames) {
                        sbList.add(new StringBuilder(getTypeString(type)));
                    }
                } else {
                    List<StringBuilder> newList = Lists.newArrayList();

                    for (StringBuilder sb : sbList) {
                        for (String type : n.typeNames) {
                            StringBuilder sbCopy = new StringBuilder(sb);
                            newList.add(sbCopy.append(getTypeString(type)));
                        }
                    }
                    sbList = newList;
                }
            }

            n = n.nextNode;
        }

        return sbList;
    }

    private String getTypeString(String raw) {
        if (raw.equals("*"))
            return raw;

        return raw + ";";
    }
}
