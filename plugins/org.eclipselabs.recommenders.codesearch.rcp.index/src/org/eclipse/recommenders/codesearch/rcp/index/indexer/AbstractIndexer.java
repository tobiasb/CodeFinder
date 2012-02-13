package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.fromNullable;
import static com.google.common.base.Optional.of;

import org.apache.lucene.document.Document;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.ITypeRoot;
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
        return isNullOrArrayType(type) || type.isPrimitiveType() || type == VmTypeName.OBJECT
                || type == VmTypeName.STRING;
    }

    public static boolean isNullOrArrayType(final ITypeName type) {
        return type == null || type.isArrayType();
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

    protected Optional<IPath> getResource(final ASTNode node) {
        final ASTNode rootNode = node.getRoot();
        final CompilationUnit cu = (CompilationUnit) rootNode;
        final ITypeRoot root = cu.getTypeRoot();
        final IPath path = root.getPath();
        return fromNullable(path);
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
