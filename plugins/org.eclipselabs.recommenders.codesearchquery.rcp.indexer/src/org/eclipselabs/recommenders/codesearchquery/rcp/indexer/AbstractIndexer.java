package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.names.VmTypeName;

public abstract class AbstractIndexer {

    protected void addAnalyzedField(final Document document, final String fieldName, final int fieldValue) {   
    	addAnalyzedField(document, fieldName, String.valueOf(fieldValue));
    }
    
    protected void addAnalyzedField(final Document document, final String fieldName, final String fieldValue) {        
        if(fieldValue == null) {
        	return;
        }
        
    	Field field = new Field(fieldName, fieldValue,
                Field.Store.YES, Field.Index.NOT_ANALYZED_NO_NORMS);

        System.out.println(String.format("Adding field: [%1$30s] = [%2$50s]", fieldName, fieldValue));
        
        document.add(field);
    }

    public static boolean isPrimitiveOrArrayOrNullOrObjectOrString(
            final ITypeName type) {
        return type == null || type.isPrimitiveType() || type.isArrayType()
                || type == VmTypeName.OBJECT || type == VmTypeName.STRING;
    }
	
//	protected void debugOut(String msg, String origin) {
////	    Activator.logInfo("%1$s [%2$s]: %3$s (%4$s)", getDocumentType(), getName(), msg, origin);
//	} 
	
	protected IProject getProject(ASTNode node) {
		while(node != null && !(node instanceof CompilationUnit)) {
			node = node.getParent();
		}
		
		return ((CompilationUnit)node).getTypeRoot().getJavaProject().getProject();
	}
	
	protected IResource getResource(ASTNode node) {
		while(node != null && !(node instanceof CompilationUnit)) {
			node = node.getParent();
		}
		
		try {
			return ((CompilationUnit)node).getTypeRoot().getCorrespondingResource();
		} catch (JavaModelException e) {
			return null;
		}
	}
	
	protected TypeDeclaration getDeclaringType(ASTNode node) {
		for(; node != null; node = node.getParent()) {
			if(node instanceof TypeDeclaration) {
				return (TypeDeclaration)node;
			}
		}
		
		return null;
	}
	
	protected MethodDeclaration getDeclaringMethod(ASTNode node) {
		for(; node != null; node = node.getParent()) {
			if(node instanceof MethodDeclaration) {
				return (MethodDeclaration)node;
			}
		}
		
		return null;
	}
}
