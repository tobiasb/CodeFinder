package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.of;

import org.apache.lucene.document.Document;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmTypeName;

import com.google.common.base.Optional;

public abstract class AbstractIndexer {

    // XXX diese methoden sollten eigentlich in einer statische helfer klasse. Du nutzt zwar vererbung aber eigentlich
    // gehören diese Methoden hier nicht rein. Static imports machen das auch schön. Vorteil: Deine Methoden kann man
    // noch aus anderen teilen des System benutzen (siehe BindungUtils etc.) oder
    // isPrimitiveOrArrayOrNullOrObjectOrString

    protected void addNoStoreNoAnalyzed(final Document document, final String fieldName, final String fieldValue) {
        CodeIndexer.addNoStoreNotAnalyzed(document, fieldName, fieldValue);
    }

    protected void addAnalyzedField(final Document document, final String fieldName, final int fieldValue) {
        CodeIndexer.addAnalyzedField(document, fieldName, fieldValue);
    }

    protected void addAnalyzedField(final Document document, final String fieldName, final String fieldValue) {
        CodeIndexer.addAnalyzedField(document, fieldName, fieldValue);
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
        final ITypeRoot root = ((CompilationUnit) node).getTypeRoot();
        if (root == null) {
            final IJavaProject property = (IJavaProject) node.getProperty("project");
            return property.getProject();
        }
        return root.getJavaProject().getProject();
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
