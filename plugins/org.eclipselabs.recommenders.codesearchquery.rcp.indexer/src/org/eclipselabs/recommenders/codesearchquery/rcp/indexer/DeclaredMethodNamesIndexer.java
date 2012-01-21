package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;

public class DeclaredMethodNamesIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        ITypeBinding superclass = type.resolveBinding();
        if (superclass != null) {
            addAllMethods(document, superclass);
        }
    }

    protected void addAllMethods(final Document document, final ITypeBinding superclass) {
        for (IMethodBinding methodBinding : superclass.getDeclaredMethods()) {
            addField(document, methodBinding);
        }
    }

    protected void addField(final Document document, final IMethodBinding methodBinding) {
        final IMethodName method = BindingUtils.toMethodName(methodBinding);

        addAnalyzedField(document, Fields.DECLARED_METHODS_NAMES, method.getName());
    }

}
