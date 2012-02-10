package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IMemberValuePairBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

public class AnnotationsIndexer extends AbstractIndexer implements IClassIndexer, IMethodIndexer {

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        final ITypeBinding clazz = type.resolveBinding();
        if (clazz == null) {
            return;
        }

        addAnnotations(document, clazz.getAnnotations());
    }

    // TODO extend for field

    @Override
    public void indexMethod(Document document, MethodDeclaration method) {
        IMethodBinding methodBinding = method.resolveBinding();
        if (methodBinding == null) {
            return;
        }

        addAnnotations(document, methodBinding.getAnnotations());
    }

    private void addAnnotations(final Document document, final IAnnotationBinding[] annotations) {
        for (final IAnnotationBinding annotation : annotations) {

            final ITypeName annotationTypeName = BindingUtils.toTypeName(annotation.getAnnotationType());
            final String annotationIdentifier = annotationTypeName.getIdentifier();

            // Annotation type i.e @Deprecated
            addAnalyzedField(document, Fields.ANNOTATIONS, annotationIdentifier);

            for (final IMemberValuePairBinding valuePairBinding : annotation.getAllMemberValuePairs()) {

                if (valuePairBinding.getValue() instanceof Object[]) {
                    for (final Object valuePairValue : (Object[]) valuePairBinding.getValue()) {
                        // Combination of annotation and value i.e
                        // @SuppressWarnings({"unchecked", "rawtypes"})
                        final String value = annotationIdentifier + ":" + valuePairValue;
                        addAnalyzedField(document, Fields.ANNOTATIONS, value);
                    }
                }
            }
        }
    }
}
