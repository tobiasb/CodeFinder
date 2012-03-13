package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;

import com.google.common.base.Optional;

public class DeclaringTypeIndexer extends AbstractIndexer implements IFieldIndexer, IMethodIndexer, IClassIndexer,
        ITryCatchBlockIndexer, IVarUsageIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        addFieldForParentTypes(document, type);
    }

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        addFieldForParentTypes(document, method);
    }

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        addFieldForParentTypes(document, field);
    }

    @Override
    public void indexVarUsage(final Document document, final MethodDeclaration method, final SimpleName name) {
        addFieldForParentTypes(document, method);
    }

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement,
            final CatchClause catchClause) {

        addFieldForParentTypes(document, tryStatement);
    }

    private void addFieldForParentTypes(final Document document, final ASTNode n) {
        final Optional<String> opt = BindingHelper.getIdentifier(getDeclaringType(n.getParent()));
        if (opt.isPresent()) {
            addFieldToDocument(document, Fields.DECLARING_TYPE, opt.get());
        }

    }
}