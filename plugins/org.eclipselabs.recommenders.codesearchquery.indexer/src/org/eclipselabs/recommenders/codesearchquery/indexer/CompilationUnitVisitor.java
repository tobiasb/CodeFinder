package org.eclipselabs.recommenders.codesearchquery.indexer;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.indexer.lucene.LuceneIndex;

public class CompilationUnitVisitor extends ASTVisitor {

	private LuceneIndex m_index = null;

	public CompilationUnitVisitor(LuceneIndex index) {
		m_index = index;
	}

	@Override
	public boolean visit(TypeDeclaration node) {

		ClassVisitor visitor = new ClassVisitor(m_index, node);
		visitor.index(node);

		return false;
	}
}
