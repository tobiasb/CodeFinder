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

package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.queryhandler;

public class ParameterValidator {

    public static boolean paramGraphFitsActualParams(Node paramGraph, String[] params) {

        Node currentNode = paramGraph;

        for (String param : params) {
            if (fits(currentNode, param)) {
                if (currentNode != null) {
                    currentNode = currentNode.nextNode;
                }
            } else {
                if (isIgnoreLeadingNode(currentNode)) {
                    if (fits(currentNode.nextNode, param)) {
                        currentNode = currentNode.nextNode.nextNode;
                    }

                } else if (!isIgnoreTrailingNode(currentNode)) {
                    return false;
                }
            }
        }

        if (currentNode != null && !isIgnoreTrailingNode(currentNode)) {
            return false;
        }

        return true;
    }

    private static boolean isIgnoreTrailingNode(Node n) {
        return n != null && n.typeNames.contains("..") && n.nextNode == null;
    }

    private static boolean isIgnoreLeadingNode(Node n) {
        return n != null && n.typeNames.contains("..") && n.prevNode == null;
    }

    private static boolean fits(Node n, String param) {
        if (n == null)
            return false;

        if (n.typeNames.contains(param))
            return true;

        if (n.typeNames.contains("*"))
            return true;

        for (String p : n.typeNames) {
            String pattern = p.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".\\*");

            if (param.matches(pattern))
                return true;
        }

        return false;
    }
}
