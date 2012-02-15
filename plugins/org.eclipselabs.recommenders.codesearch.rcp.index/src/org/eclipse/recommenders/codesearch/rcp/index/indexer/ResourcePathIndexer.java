package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import java.io.File;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;

public class ResourcePathIndexer extends AbstractIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer, IFieldIndexer, IVarUsageIndexer {

    @Override
    public void indexField(final Document document, final FieldDeclaration field) {
        addField(document, field);
    }

    @Override
    public void indexMethod(final Document document, final MethodDeclaration method) {
        addField(document, method);
    }

    @Override
    public void indexType(final Document document, final TypeDeclaration type) {
        addField(document, type);
    }

    @Override
    public void indexTryCatchBlock(final Document document, final TryStatement tryStatement,
            final CatchClause catchClause) {

        addField(document, tryStatement);
    }

    @Override
    public void indexVarUsage(final Document document, final MethodDeclaration method, final SimpleName name) {
        addField(document, method);
    }

    private void addField(final Document document, final ASTNode node) {
        final File f = getLocation(node);
        addAnalyzedField(document, Fields.RESOURCE_PATH, f.getAbsolutePath());
    }

    public static String getResourcePath(final CompilationUnit cu) {
        return getResourcePath(getLocation(cu));
    }

    public static String getResourcePath(final File file) {
        return file.getAbsolutePath();
    }

    public static String getResourcePathForQuery(final CompilationUnit cu) {
        return getResourcePathForQuery(getLocation(cu));
    }

    public static String getResourcePathForQuery(final String path) {

        String fileName = path;

        fileName = fileName.replaceAll("\\\\", "\\\\\\\\");
        fileName = fileName.replaceAll(":", "\\\\:");
        fileName = fileName.replaceAll("-", "\\\\-");

        return fileName;
    }

    public static String getResourcePathForQuery(final File file) {
        return getResourcePathForQuery(file.getAbsolutePath());
    }

    // public String getResourcePath(final IResource resource) {
    // return getResourcePath(resource.getFullPath());
    // }
    //
    // public static String getResourcePath(final IPath path) {
    // return path.toPortableString();
    // }
    //
    // public static String getResourcePath(final File file) {
    // return getResourcePath(Path.fromOSString(file.getAbsolutePath()));
    // }

}
