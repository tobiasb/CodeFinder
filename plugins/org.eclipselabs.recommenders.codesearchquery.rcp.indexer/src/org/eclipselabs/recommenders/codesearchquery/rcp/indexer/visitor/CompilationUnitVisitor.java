package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllDeclaredFieldNamesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllDeclaredMethodNamesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllExtendedTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllImplementedInterfacesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AnnotationsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CaughtTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredFieldNamesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredFieldTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredMethodNamesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaringTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ExtendedTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FieldTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FieldsReadIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FieldsWrittenIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FriendlyNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FullTextIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FullyQualifiedNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ImplementedInterfacesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.InstanceOfIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ModifiersIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.OverriddenMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ParameterCountIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ParameterTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ProjectNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ResourcePathIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnVariableExpressionIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedFieldsInFinallyIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedFieldsInTryIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedMethodsInFinallyIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedMethodsInTryIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesInFinallyIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesInTryIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IClassIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IFieldIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IMethodIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.ITryCatchBlockIndexer;

import com.google.common.collect.Lists;

public class CompilationUnitVisitor extends ASTVisitor {

	private CodeIndexerIndex index = null;
	private List<IIndexer> indexer;
	
	public void addIndexer(IIndexer indexer) {
		this.indexer.add(indexer);
	}
	
	public void addIndexer(Collection<IIndexer> indexer) {
		this.indexer.addAll(indexer);
	}

	public CompilationUnitVisitor(CodeIndexerIndex index) {
		this.index = index;
		
		indexer = Lists.newArrayList();		
	}

	public static List<IIndexer> getDefaultIndexer() {

	    List<IIndexer> list = Lists.newArrayList();
	    
	    list.add(new AllDeclaredFieldNamesIndexer());
	    list.add(new AllDeclaredMethodNamesIndexer());
	    list.add(new AllExtendedTypesIndexer());
	    list.add(new AllImplementedInterfacesIndexer());
	    list.add(new AnnotationsIndexer());
	    list.add(new CaughtTypeIndexer());
	    list.add(new DeclaredFieldNamesIndexer());
	    list.add(new DeclaredFieldTypesIndexer());
	    list.add(new DeclaredMethodNamesIndexer());
	    list.add(new DeclaredMethodsIndexer());
	    list.add(new DeclaringTypeIndexer());
	    list.add(new DocumentTypeIndexer());
	    list.add(new ExtendedTypeIndexer());
	    list.add(new FieldsReadIndexer());
	    list.add(new FieldsWrittenIndexer());
	    list.add(new FieldTypeIndexer());
	    list.add(new FriendlyNameIndexer());
	    list.add(new FullTextIndexer());
	    list.add(new FullyQualifiedNameIndexer());
	    list.add(new ImplementedInterfacesIndexer());
	    list.add(new InstanceOfIndexer());
	    list.add(new ModifiersIndexer());
	    list.add(new OverriddenMethodsIndexer());
	    list.add(new ParameterCountIndexer());
	    list.add(new ParameterTypesIndexer());
	    list.add(new ProjectNameIndexer());
	    list.add(new ResourcePathIndexer());
	    list.add(new ReturnTypeIndexer());
	    list.add(new ReturnVariableExpressionIndexer());
	    list.add(new UsedFieldsInFinallyIndexer());
	    list.add(new UsedFieldsInTryIndexer());
	    list.add(new UsedMethodsIndexer());
	    list.add(new UsedMethodsInFinallyIndexer());
	    list.add(new UsedMethodsInTryIndexer());
	    list.add(new UsedTypesIndexer());
	    list.add(new UsedTypesInFinallyIndexer());
	    list.add(new UsedTypesInTryIndexer());
        
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
	    return true;
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

	@Override
	public boolean visit(TryStatement node) {
        Document document = new Document();

		TryStatement tryStatement = node;
		
		@SuppressWarnings("unchecked")
		List<CatchClause> catchClauses = tryStatement.catchClauses();
		
		for(CatchClause catchClause : catchClauses) {
	        for(IIndexer i : indexer) {
	            if(i instanceof ITryCatchBlockIndexer) {
	                ((ITryCatchBlockIndexer)i).index(document, tryStatement, catchClause);
	            }
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
