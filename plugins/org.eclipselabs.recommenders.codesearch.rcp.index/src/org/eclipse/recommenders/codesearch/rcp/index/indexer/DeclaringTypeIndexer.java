package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

import com.google.common.base.Optional;

public class DeclaringTypeIndexer extends AbstractIndexer implements IFieldIndexer, IMethodIndexer, IClassIndexer,
        ITryCatchBlockIndexer {

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        addFieldForParentTypes(document, type);
    }

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        addFieldForParentTypes(document, method);
    }

    @Override
    public void index(final Document document, final FieldDeclaration field) {
        addFieldForParentTypes(document, field);
    }

    private void addFieldForParentTypes(final Document document, final ASTNode n) {

        final Optional<TypeDeclaration> opt = getDeclaringType(n.getParent());

        if (opt.isPresent()) {
            final ITypeBinding b = (opt.get()).resolveBinding();
            final ITypeName typeName = BindingUtils.toTypeName(b);

            addAnalyzedField(document, Fields.DECLARING_TYPE, typeName.getIdentifier());
        }

    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        addFieldForParentTypes(document, tryStatement);
    }
}
