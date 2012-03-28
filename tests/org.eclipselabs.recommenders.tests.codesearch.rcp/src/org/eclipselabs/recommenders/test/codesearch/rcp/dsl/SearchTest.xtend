package org.eclipselabs.recommenders.test.codesearch.rcp.dsl

import org.eclipse.recommenders.codesearch.rcp.index.indexer.DocumentTypeIndexer
import org.junit.Test
import org.eclipse.recommenders.codesearch.rcp.index.Fields
import org.eclipse.recommenders.codesearch.rcp.index.indexer.SimpleNameIndexer
import org.eclipselabs.recommenders.test.codesearch.SearchTestBase

class SearchTest extends SearchTestBase {
	    
	@Test
	def void testSimpleSearch(){
		val code = '''
		public class MyClass {
		}
		'''
		
		exercise(code, i(newArrayList(new DocumentTypeIndexer(), new SimpleNameIndexer())))
		
		var query = '''«Fields::TYPE»:«Fields::TYPE_CLASS» AND «Fields::SIMPLE_NAME»:MyClass'''

		assertQueryResultGtZero(query)
	}   
	@Test
	def void testSimpleSearchLowerCase(){
		val code = '''
		public class MyClass {
		}
		'''
		
		exercise(code, i(newArrayList(new DocumentTypeIndexer(), new SimpleNameIndexer())))
		
		var query = '''«Fields::TYPE»:«Fields::TYPE_CLASS» AND «Fields::SIMPLE_NAME»:myclass'''

		assertQueryResultGtZero(query)
	}
}