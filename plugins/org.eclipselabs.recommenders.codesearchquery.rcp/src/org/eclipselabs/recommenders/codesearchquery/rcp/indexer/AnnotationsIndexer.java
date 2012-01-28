package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.IAnnotationBinding;
import org.eclipse.jdt.core.dom.IMemberValuePairBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;

public class AnnotationsIndexer extends AbstractIndexer implements IClassIndexer {

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        final ITypeBinding clazz = type.resolveBinding();
        if (clazz == null) {
            return;
        }
        for (final IAnnotationBinding annotation : clazz.getAnnotations()) {

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
    // TODO extend for field and method
}
