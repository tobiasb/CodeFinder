package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.io.File;

import org.apache.lucene.document.Document;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

import com.google.common.base.Optional;

public class ResourcePathIndexer extends AbstractIndexer implements IClassIndexer, IMethodIndexer,
        ITryCatchBlockIndexer, IFieldIndexer {

    @Override
    public void index(final Document document, final FieldDeclaration field) {
        addField(document, field);
    }

    @Override
    public void index(final Document document, final MethodDeclaration method) {
        addField(document, method);
    }

    @Override
    public void index(final Document document, final TypeDeclaration type) {
        addField(document, type);
    }

    @Override
    public void index(final Document document, final TryStatement tryStatement, final CatchClause catchClause) {

        addField(document, tryStatement);
    }

    private void addField(final Document document, final ASTNode node) {
        final Optional<IResource> opt = getResource(node);
        if (opt.isPresent()) {
            addAnalyzedField(document, Fields.RESOURCE_PATH, getResourcePath(opt.get()));
        }
    }

    public String getResourcePath(final CompilationUnit cu) {
        final Optional<IResource> opt = getResource(cu);
        if (opt.isPresent()) {
            return getResourcePath(opt.get());
        } else {
            // TODO MB: Tobias, the null case needs handling. Throw Exception? Return Optional?
            return null;
        }
    }

    public String getResourcePath(final IResource resource) {
        return getResourcePath(resource.getLocation());
    }

    public static String getResourcePath(final IPath path) {
        return path.toPortableString();
    }

    public static String getResourcePath(final File file) {
        return getResourcePath(Path.fromOSString(file.getAbsolutePath()));
    }
}
