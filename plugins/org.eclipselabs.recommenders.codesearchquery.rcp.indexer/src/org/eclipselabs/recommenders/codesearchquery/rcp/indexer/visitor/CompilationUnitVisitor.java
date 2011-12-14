package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllExtendedTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllImplementedInterfacesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CalledMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaringTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ExtendedTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FieldTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FriendlyNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FullyQualifiedNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ImplementedInterfacesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.OverriddenMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ParameterTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex;

import com.google.common.collect.Lists;

public class CompilationUnitVisitor extends ASTVisitor {

	private LuceneIndex index = null;
	private List<IIndexer> indexer;
	
	public void addIndexer(IIndexer indexer) {
		this.indexer.add(indexer);
	}
	
	public void addIndexer(Collection<IIndexer> indexer) {
		this.indexer.addAll(indexer);
	}

	public CompilationUnitVisitor(LuceneIndex index) {
		this.index = index;
		
		indexer = Lists.newArrayList();		
	}

	public static List<IIndexer> getAllIndexer() {

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
