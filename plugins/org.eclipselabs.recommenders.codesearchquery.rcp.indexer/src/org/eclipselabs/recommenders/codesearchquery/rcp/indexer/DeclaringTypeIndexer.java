package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.*;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

public class DeclaringTypeIndexer extends AbstractIndexer implements
		IFieldIndexer, IMethodIndexer, IClassIndexer, ITryCatchBlockIndexer {

	@Override
	public void index(Document document, TypeDeclaration type) {
		addFieldForParentTypes(document, type);
	}

	@Override
	public void index(Document document, MethodDeclaration method) {
		addFieldForParentTypes(document, method);
	}

	@Override
	public void index(Document document, FieldDeclaration field) {
		addFieldForParentTypes(document, field);
	}

	private void addFieldForParentTypes(Document document, ASTNode n) {

		TypeDeclaration declaringType = getDeclaringType(n.getParent());
		
		if(declaringType != null) {
	        ITypeBinding b = (declaringType).resolveBinding();
	        final ITypeName typeName = BindingUtils.toTypeName(b);
	        
	        addAnalyzedField(document, Fields.DECLARING_TYPE, typeName.getIdentifier());
		}

	}

	@Override
	public void index(Document document, TryStatement tryStatement,
			CatchClause catchClause) {

		addFieldForParentTypes(document, tryStatement);
	}
}
