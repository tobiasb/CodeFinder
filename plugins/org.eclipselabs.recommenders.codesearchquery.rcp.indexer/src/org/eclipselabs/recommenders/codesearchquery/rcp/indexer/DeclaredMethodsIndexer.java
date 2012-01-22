package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;

public class DeclaredMethodsIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void index(final Document document, TypeDeclaration type) {
        final ASTVisitor visitor = new ASTVisitor() {
            @Override
            public boolean visit(MethodDeclaration node) {
                addAnalyzedField(document, Fields.DECLARED_METHODS, BindingHelper.getIdentifier(node));
                
                return false;
            }
        };
        
        type.accept(visitor);
    }
}
