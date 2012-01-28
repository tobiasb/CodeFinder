package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

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

        final TypeDeclaration declaringType = getDeclaringType(n.getParent());

        if (declaringType != null) {
            final ITypeBinding b = (declaringType).resolveBinding();
            final ITypeName typeName = BindingUtils.toTypeName(b);

            addAnalyzedField(document, Fields.DECLARING_TYPE, typeName.getIdentifier());
        }

    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        addFieldForParentTypes(document, tryStatement);
    }
}
