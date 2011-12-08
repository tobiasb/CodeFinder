package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex;

import com.google.common.collect.Lists;

public class _CompilationUnitVisitor extends ASTVisitor {

	private LuceneIndex index = null;
	private List<IIndexer> indexer;

	public _CompilationUnitVisitor(LuceneIndex index) {
		this.index = index;
		
		indexer = Lists.newArrayList();
		indexer.addAll(getAllIndexer());
		
	}

	private List<IIndexer> getAllIndexer() {

	    List<IIndexer> list = Lists.newArrayList();

	    list.add(new FullyQualifiedNameIndexer());
	    list.add(new FriendlyNameIndexer());
	    list.add(new ExtendedTypeIndexer());
	    list.add(new AllExtendedTypesIndexer());
	    list.add(new ImplementedInterfacesIndexer());
	    list.add(new AllImplementedInterfacesIndexer());
	    list.add(new CalledMethodsIndexer());
	    list.add(new DeclaredMethodsIndexer());
	    list.add(new DocumentTypeIndexer());
	    list.add(new OverriddenMethodsIndexer());
	    list.add(new ParameterTypesIndexer());
	    list.add(new ReturnTypeIndexer());
	    list.add(new UsedTypesIndexer());
	    list.add(new DeclaringTypeIndexer());
	    list.add(new FieldTypeIndexer());
        
	    return list;
	}
	
	@Override
	public boolean visit(TypeDeclaration node) {

//		_ClassVisitor visitor = new _ClassVisitor(m_index, node);
//		visitor.index(node);
	    
	    Document document = new Document();
	    
	    for(IIndexer i : indexer) {
	        if(i instanceof IClassIndexer) {
	            ((IClassIndexer)i).index(document, node);
	        }
	    }

	    addDocument(document);
		return true;
	}
	
	@Override
	public boolean visit(MethodDeclaration node) {
        Document document = new Document();

        for(IIndexer i : indexer) {
            if(i instanceof IMethodIndexer) {
                ((IMethodIndexer)i).index(document, node);
            }
        }

        addDocument(document);
	    return false;
	}
	
	@Override
	public boolean visit(FieldDeclaration node) {
        Document document = new Document();

        for(IIndexer i : indexer) {
            if(i instanceof IFieldIndexer) {
                ((IFieldIndexer)i).index(document, node);
            }
        }

        addDocument(document);
	    return false;
	}
	
	private void addDocument(final Document document) {

        try {
            index.addDocument(document);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
