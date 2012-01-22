package org.eclipselabs.recommenders.test.codesearchquery.rcp.indexer;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

public abstract class AbstractTestBase {
	protected CompilationUnit getCompilationUnitFromAstNode(ASTNode node) {
		//We know what we are doing
		return (CompilationUnit)node;
	}
}
