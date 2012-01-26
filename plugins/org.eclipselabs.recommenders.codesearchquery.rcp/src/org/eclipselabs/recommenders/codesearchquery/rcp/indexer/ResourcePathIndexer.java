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

public class ResourcePathIndexer extends AbstractIndexer implements
		IClassIndexer, IMethodIndexer, ITryCatchBlockIndexer, IFieldIndexer {

	@Override
	public void index(Document document, FieldDeclaration field) {
		addField(document, field);
	}

	@Override
	public void index(Document document, MethodDeclaration method) {
		addField(document, method);
	}

	@Override
	public void index(Document document, TypeDeclaration type) {
		addField(document, type);
	}

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {

		addField(document, tryStatement);
	}

	private void addField(final Document document, ASTNode node) {
		IResource resource = getResource(node);
		
		addAnalyzedField(document, Fields.RESOURCE_PATH, getResourcePath(resource));
	}
	
	public String getResourcePath(CompilationUnit cu) {
		return getResourcePath(getResource(cu));
	}
	
	public String getResourcePath(IResource resource) {
		return getResourcePath(resource.getLocation());
	}
	
	public static String getResourcePath(IPath path) {
		return path.toPortableString();
	}
	
	public static String getResourcePath(File file) {
		return getResourcePath(Path.fromOSString(file.getAbsolutePath()));
	}
}
