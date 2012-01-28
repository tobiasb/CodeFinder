package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.fromNullable;
import static com.google.common.base.Optional.of;

import org.apache.lucene.document.Document;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmTypeName;

import com.google.common.base.Optional;

public abstract class AbstractIndexer {

    protected void addAnalyzedField(final Document document, final String fieldName, final int fieldValue) {
        CodeIndexerIndex.addAnalyzedField(document, fieldName, fieldValue);
    }

    protected void addAnalyzedField(final Document document, final String fieldName, final String fieldValue) {
        CodeIndexerIndex.addAnalyzedField(document, fieldName, fieldValue);
    }

    public static boolean isPrimitiveOrArrayOrNullOrObjectOrString(final ITypeName type) {
        return type == null || type.isPrimitiveType() || type.isArrayType() || type == VmTypeName.OBJECT
                || type == VmTypeName.STRING;
    }

    // protected void debugOut(String msg, String origin) {
    // // Activator.logInfo("%1$s [%2$s]: %3$s (%4$s)", getDocumentType(),
    // getName(), msg, origin);
    // }

    protected IProject getProject(ASTNode node) {
        while (node != null && !(node instanceof CompilationUnit)) {
            node = node.getParent();
        }

        return ((CompilationUnit) node).getTypeRoot().getJavaProject().getProject();
    }

    protected Optional<IResource> getResource(ASTNode node) {
        while (node != null && !(node instanceof CompilationUnit)) {
            node = node.getParent();
        }

        try {
            final CompilationUnit cu = (CompilationUnit) node;
            final ITypeRoot root = cu.getTypeRoot();
            final IResource resource = root.getCorrespondingResource();
            return fromNullable(resource);
        } catch (final JavaModelException e) {
            return absent();
        }
    }

    protected Optional<TypeDeclaration> getDeclaringType(ASTNode node) {
        for (; node != null; node = node.getParent()) {
            if (node instanceof TypeDeclaration) {
                return of((TypeDeclaration) node);
            }
        }

        return absent();
    }

    protected Optional<MethodDeclaration> getDeclaringMethod(ASTNode node) {
        for (; node != null; node = node.getParent()) {
            if (node instanceof MethodDeclaration) {
                return of((MethodDeclaration) node);
            }
        }
        return absent();
    }
}
