package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;

public class ModifiersIndexer extends AbstractIndexer implements
		IClassIndexer, IMethodIndexer, IFieldIndexer {

	@Override
	public void index(Document document, FieldDeclaration field) {
		addFields(document, field.getModifiers());
	}

	@Override
	public void index(Document document, MethodDeclaration method) {
		addFields(document, method.getModifiers());
	}

	@Override
	public void index(Document document, TypeDeclaration type) {
		addFields(document, type.getModifiers());
	}
	
	private void addFields(Document document, int flags) {
		if(Modifier.isPublic(flags)) addField(document, Fields.MODIFIER_PUBLIC);
		if(Modifier.isFinal(flags)) addField(document, Fields.MODIFIER_FINAL);
		if(Modifier.isPrivate(flags)) addField(document, Fields.MODIFIER_PRIVATE);
		if(Modifier.isProtected(flags)) addField(document, Fields.MODIFIER_PROTECTED);
		if(Modifier.isStatic(flags)) addField(document, Fields.MODIFIER_STATIC);
		if(Modifier.isAbstract(flags)) addField(document, Fields.MODIFIER_ABSTRACT);
	}

	private void addField(final Document document, String modifier) {
		addAnalyzedField(document, Fields.MODIFIERS, modifier);
	}
}
