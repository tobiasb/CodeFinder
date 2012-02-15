package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.of;
import static org.eclipse.recommenders.utils.Checks.ensureIsNotNull;

import java.io.File;

import org.apache.lucene.document.Document;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.ui.IndexUtils;
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
        final ITypeRoot root = ((CompilationUnit) node).getTypeRoot();
        if (root == null) {
            final IJavaProject property = (IJavaProject) node.getProperty("project");
            return property.getProject();
        }
        return root.getJavaProject().getProject();
    }

    static protected File getLocation(final ASTNode node) {
        final ASTNode rootNode = node.getRoot();
        final CompilationUnit cu = (CompilationUnit) rootNode;

        final ITypeRoot root = cu.getTypeRoot();
        if (root == null) {
            // this is a special treatment for cus created from source code w/o
            // a IClassFile or ICompilationUnit
            return ensureIsNotNull((File) cu.getProperty("location"));
        }
        return IndexUtils.computeLocation(root);
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
