package org.eclipselabs.recommenders.test.codesearch.rcp.indexer

import java.util.List
import org.apache.lucene.store.RAMDirectory
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.recommenders.codesearch.rcp.index.AbstractIndex
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor.CompilationUnitVisitor
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcherIndex
import org.eclipse.recommenders.tests.jdt.JavaProjectFixture
import org.junit.Ignore

import static junit.framework.Assert.*
import static org.eclipselabs.recommenders.test.codesearch.rcp.indexer.TestBase.*

@Ignore("to make maven happy: All files that start or end with Test are executed per default. If no tests are found the build is failed...")
class TestBase extends AbstractTestBase {
	def static parse(ICompilationUnit unit) {
        var parser = ASTParser::newParser(AST::JLS3);
        parser.setKind(ASTParser::K_COMPILATION_UNIT);
        parser.setSource(unit);
        parser.setResolveBindings(true);
        
		parser.createAST(null);
    }
     
    def assertNumDocs(AbstractIndex index, int expectedNum) {
    	
    	var readIndex = new CodeSearcherIndex(index.index)
    	var numDocs = readIndex.getDocuments.size
    	
		assertTrue('''The number of documents is not correct. Is [«numDocs»] but should be [«expectedNum»]'''.toString, numDocs.equals(expectedNum))
    }
     
    def assertField(AbstractIndex index, List<String> expected) {
    	    	
    	var readIndex = new CodeSearcherIndex(index.index)
    	    	
    	for(document : readIndex.getDocuments) {   
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
    	
		assertTrue('''There was no document with «expected»'''.toString, false)
		return false
    }
    
    def assertFieldStartsWith(AbstractIndex index, List<String> expected) {
    	var readIndex = new CodeSearcherIndex(index.index)
    	    	
    	for(document : readIndex.getDocuments) {   
    		var foundInDocument = true
    		 		
    		for(exp : expected) {
    			var found = false
    			
	    		for(field : document.fields) {
	    			if(s(field.name, field.stringValue).startsWith(exp)) {
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
    	
		assertTrue('''There was no document with (startswith) «expected»'''.toString, false)
		return false
    }
    
    def assertNotField(AbstractIndex index, List<String> expected) {
    	    	    	var readIndex = new CodeSearcherIndex(index.index)
    	    	
    	for(document : readIndex.getDocuments) {   
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
    			assertTrue('''There was a document with «expected»'''.toString, false)
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
    	//IndexUpdaterServiceSettings::setNoDispatch(true); // To prevent workspace events from being processed
    	val fixture = new JavaProjectFixture(ResourcesPlugin::getWorkspace(),projectName)
		val struct = fixture.createFileAndParseWithMarkers(code1.toString, fileName)
		val cu = struct.first;
        var cuParsed = parse(cu);

        var index = new CodeIndexerIndex(new RAMDirectory())
		
        var visitor = new CompilationUnitVisitor(index);
        visitor.addIndexer(indexer);
        
        cuParsed.accept(visitor)
        index.commit
        
        return index
    }
	
	def exercise(CharSequence code, IIndexer indexer){
		return exercise(code, i(newArrayList(indexer)))  
	}
	
//	def c(String [] items) {
//		return StringUtils::concatWith(", ", items)
//	}
	
	def l(String [] items) {
		return items as List<String>
	}
	
	def i(IIndexer [] items) {
		return items as List<IIndexer>
	}
}