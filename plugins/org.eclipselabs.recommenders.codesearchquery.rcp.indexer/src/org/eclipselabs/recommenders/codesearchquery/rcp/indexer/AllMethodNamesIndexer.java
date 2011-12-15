package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class AllMethodNamesIndexer extends AbstractIndexer implements
		IClassIndexer {

	@Override
	public void index(final Document document, TypeDeclaration type) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(MethodDeclaration node) {
                final IMethodBinding b = node.resolveBinding();
                final IMethodName method = BindingUtils.toMethodName(b);
                
                addAnalyzedField(document, Fields.ALL_METHOD_NAMES, method.getName());
                
                return false;
            }
        };
        
        type.accept(visitor);
	}

}
