package org.eclipselabs.recommenders.test.codesearch.rcp.indexer;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

public abstract class AbstractTestBase {
    protected CompilationUnit getCompilationUnitFromAstNode(final ASTNode node) {
        // We know what we are doing
        return (CompilationUnit) node;
    }
}
