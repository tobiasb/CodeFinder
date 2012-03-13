package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;

public class JavaElementHandleIndexer extends AbstractIndexer implements IMethodIndexer, IClassIndexer, IFieldIndexer,
        IVarUsageIndexer {

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        add(document, method.resolveBinding());

    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        add(document, type.resolveBinding());
    }

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        final List<VariableDeclarationFragment> fragments = field.fragments();
        final VariableDeclarationFragment fragment = fragments.get(0);
        add(document, fragment.resolveBinding());
    }

    @Override
    public void indexVarUsage(final Document document, final MethodDeclaration method, final SimpleName name) {
        add(document, name.resolveBinding());
    }

    private void add(final Document document, final IBinding b) {
        if (b == null) {
            return;
        }
        final IJavaElement e = b.getJavaElement();
        if (e == null) {
            return;
        }
        final String h = e.getHandleIdentifier();
        final Field field = new Field(Fields.JAVA_ELEMENT_HANDLE, h, Store.YES, Index.NO);
        document.add(field);
    }
}