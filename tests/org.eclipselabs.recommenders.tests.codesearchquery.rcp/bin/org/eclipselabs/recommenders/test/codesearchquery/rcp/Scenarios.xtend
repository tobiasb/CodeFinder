package org.eclipselabs.recommenders.test.codesearchquery.rcp

import java.util.List
import org.apache.commons.lang3.StringUtils
import org.apache.lucene.document.Document
import org.apache.lucene.index.IndexReader
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.recommenders.tests.jdt.JavaProjectFixture
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FriendlyNameIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FullyQualifiedNameIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.CompilationUnitVisitor
import org.junit.Test

import static junit.framework.Assert.*
import org.apache.lucene.store.RAMDirectory
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredMethodsIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaringTypeIndexer

class Scenarios {

	@Test
	def void testDocumentCounts(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new FriendlyNameIndexer())
		assertNumDocs(index.reader, 1)
	}

	@Test
	def void testDocumentCounts02(){
		val code = '''
		public class MyClass {
			public void test() {
			}
		} 
		'''
		
		var index = exercise(code, new FriendlyNameIndexer())
		assertNumDocs(index.reader, 2)
	}

	@Test
	def void testDocumentCounts03(){
		val code = '''
		import java.util.List;
		import java.util.Map;
		
		public class MyClass {	
			Map map;
			public List test() {
				return null;
			}
		}
		'''
		
		var index = exercise(code, new FriendlyNameIndexer())
		assertNumDocs(index.reader, 3)
	}
	
	@Test
	def void testFriendlyNameIndexer(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new FriendlyNameIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::FRIENDLY_NAME, "MyClass"))))
	}
	
	@Test
	def void testFriendlyNameIndexer02(){
		val code = '''
		public class MyClass {
			public void test() {}
		} 
		'''
		
		var index = exercise(code, new FriendlyNameIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::FRIENDLY_NAME, "test"))))
	}
	
	@Test
	def void testFriendlyNameIndexer03(){
		val code = '''
		import java.util.Map;
		public class MyClass {
			Map map;
		} 
		'''
		
		var index = exercise(code, new FriendlyNameIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::FRIENDLY_NAME, "map"))))
	}
	
	@Test
	def void testUniqueIdentifierNameIndexer(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new FullyQualifiedNameIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::FULLY_QUALIFIED_NAME, "L/MyClass"))))
	}
	
	@Test
	def void testUniqueIdentifierNameIndexer02(){
		val code = '''
		public class MyClass {
			public void test() {}
		} 
		'''
		
		var index = exercise(code, new FullyQualifiedNameIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::FULLY_QUALIFIED_NAME, "L/MyClass.test()V"))))
	}
	
	@Test
	def void testDocumentTypeIndexerClassOnly(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new DocumentTypeIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, "class"))))
	}
	
	@Test
	def void testDocumentTypeIndexerClassAndMethod(){
		val code = '''
		public class MyClass {
			public void test() {
			}
		} 
		'''
		
		var index = exercise(code, new DocumentTypeIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, "class"))))
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, "method"))))
	}
	
	@Test
	def void testReturnTypeIndexer(){
		val code = '''
		import java.util.List;
		public class MyClass {
			public List test() {
				return null;
			}
		}
		'''
		
		var index = exercise(code, new ReturnTypeIndexer())
		
		assertField(index.documents, l(newArrayList(
			s(Fields::RETURN_TYPE, "Ljava/util/List")
		)))
	}
	
	@Test
	def void testUsedTypesIndexer(){
		val code = '''
		import java.util.List;
		import java.util.Map;
		
		public class MyClass {	
			Map map;
		}
		'''
		
		var index = exercise(code, new UsedTypesIndexer())
		
		assertField(index.documents, l(newArrayList(
			s(Fields::USED_TYPES, "Ljava/util/Map")
		)))
	}
	
	@Test
	def void testUsedTypesIndexer02(){
		val code = '''
		import java.util.List;
		import java.util.Map;
		
		public class MyClass {	
			Map map;
			public List test() {
				return null;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new UsedTypesIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, "class"),
			s(Fields::USED_TYPES, "Ljava/util/Map")
		)))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, "method"),
			s(Fields::USED_TYPES, "Ljava/util/List")
		)))
	}
	
	@Test
	def void testDeclaredMethodsIndexer(){
		val code = '''
		public class MyClass {
			public void test() {
			}
			public void foo() {
			}
		}
		'''
		
		var index = exercise(code, new DeclaredMethodsIndexer())
		
		assertField(index.documents, l(newArrayList(
			s(Fields::DECLARED_METHODS, "L/MyClass.test()V"),
			s(Fields::DECLARED_METHODS, "L/MyClass.foo()V")
		)))
	}
	
	@Test
	def void testDeclaringTypesIndexerMethod(){
		val code = '''
		public class MyClass {
			public void foo() {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new FriendlyNameIndexer(), new DeclaringTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::FRIENDLY_NAME, "foo"),
			s(Fields::DECLARING_TYPES, "L/MyClass")
		)))		
	}
	
	@Test
	def void testDeclaringTypesIndexerField(){
		val code = '''
		public class MyClass {
			Map map;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new FriendlyNameIndexer(), new DeclaringTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::FRIENDLY_NAME, "map"),
			s(Fields::DECLARING_TYPES, "L/MyClass")
		)))		
	}
	
	@Test
	def void testDeclaringTypesIndexerType(){
		val code = '''
		public class MyClass {
			public class SubClass {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new FriendlyNameIndexer(), new DeclaringTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::FRIENDLY_NAME, "SubClass"),
			s(Fields::DECLARING_TYPES, "L/MyClass")
		)))		
	}
	
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
    	
		assertTrue('''There was no document with «c(expected)»'''.toString, false)
		return false
    }
    
    def s(String name, String value) {
    	return '''«name»=«value»'''.toString
    }
    
    def exercise(CharSequence code, List<IIndexer> indexer) {
    	val fixture = new JavaProjectFixture(ResourcesPlugin::getWorkspace(),"test")
		val struct = fixture.createFileAndParseWithMarkers(code.toString, "MyClass.java")
		val cu = struct.first;

        var index = new LuceneIndex(new RAMDirectory())// CodesearchQueryModule::index//
		
        var visitor = new CompilationUnitVisitor(index);
        visitor.addIndexer(indexer);
        
        var cuParsed = parse(cu);
        cuParsed.accept(visitor)
        
        return index
    }
	
	def exercise(CharSequence code, IIndexer indexer){
		exercise(code, i(newArrayList(indexer)))  
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