package org.eclipselabs.recommenders.test.codesearchquery.rcp

import java.util.List
import org.apache.commons.lang3.StringUtils
import org.apache.lucene.document.Document
import org.apache.lucene.index.IndexReader
import org.apache.lucene.store.RAMDirectory
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.recommenders.tests.jdt.JavaProjectFixture
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.CompilationUnitVisitor

import static junit.framework.Assert.*

class TestBase {
	def parse(ICompilationUnit unit) {
        var parser = ASTParser::newParser(AST::JLS3);
        parser.setKind(ASTParser::K_COMPILATION_UNIT);
        parser.setSource(unit);
        parser.setResolveBindings(true);
        
		parser.createAST(null);
    }
    
    def assertNumDocs(IndexReader reader, int expectedNum) {
		assertTrue('''The number of documents is not correct. Is [«reader.numDocs»] but should be [«expectedNum»]'''.toString, reader.numDocs.equals(expectedNum))
    }
    
    def assertField(List<Document> documents, List<String> expected) {
    	    	
    	for(document : documents) {   
    		var foundInDocument = true
    		 		
    		for(exp : expected) {
    			var found = false
    			
	    		for(field : document.fields) {
	    			if(s(field.name, field.stringValue).equals(exp)) {
	    				found = true;
	    			}
	    		}
	    		
	    		if(!found) {
	    			foundInDocument = false
	    		}
    		}
    		
    		if(foundInDocument) {
    			return true
    		}
    	}
    	
		assertTrue('''There was no document with «(expected)»'''.toString, false)
		return false
    }
    
    def assertNotField(List<Document> documents, List<String> expected) {
    	    	
    	for(document : documents) {  
    		var foundInDocument = true
    		 		
    		for(exp : expected) {
    			var found = false
    			
	    		for(field : document.fields) {
	    			if(s(field.name, field.stringValue).equals(exp)) {
	    				found = true;
	    			}
	    		}
	    		
	    		if(!found) {
	    			foundInDocument = false
	    		}
    		}
    		
    		if(foundInDocument) {
    			assertTrue('''There was a document with «(expected)»'''.toString, false)
    		}
    	}
    }
    
    def s(String name, String value) {
    	return '''«name»=«value»'''.toString
    }
    
    def exercise(CharSequence code, List<IIndexer> indexer) {
    	return exercise(code, indexer, "test")
    }
    
    def exercise(CharSequence code, List<IIndexer> indexer, String projectName) {
    	return exercise(code, indexer, projectName, "MyClass.java")
    }
    
    def exercise(CharSequence code, List<IIndexer> indexer, String projectName, String fileName) {
    	return exercise(code, null, null, indexer, projectName, fileName)
    }
    
    def exercise(CharSequence code1, CharSequence code2, CharSequence code3, List<IIndexer> indexer, String projectName, String fileName) {
    	val fixture = new JavaProjectFixture(ResourcesPlugin::getWorkspace(),projectName)
		val struct = fixture.createFileAndParseWithMarkers(code1.toString, fileName)
//		val struct2 = fixture.createFileAndParseWithMarkers(code2.toString, "1" + fileName)
//		val struct3 = fixture.createFileAndParseWithMarkers(code3.toString, "2" + fileName)
		val cu = struct.first;

        var index = new LuceneIndex(new RAMDirectory())// CodesearchQueryModule::index//
		
        var visitor = new CompilationUnitVisitor(index);
        visitor.addIndexer(indexer);
        
        var cuParsed = parse(cu);
        cuParsed.accept(visitor)
        
        return index
    }
	
	def exercise(CharSequence code, IIndexer indexer){
		return exercise(code, i(newArrayList(indexer)))  
	}
	
	def c(String [] items) {
		return StringUtils::concatWith(", ", items)
	}
	
	def l(String [] items) {
		return items as List<String>
	}
	
	def i(IIndexer [] items) {
		return items as List<IIndexer>
	}
}