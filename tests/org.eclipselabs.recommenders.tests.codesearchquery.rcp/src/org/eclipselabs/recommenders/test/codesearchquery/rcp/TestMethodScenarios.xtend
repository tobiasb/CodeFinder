package org.eclipselabs.recommenders.test.codesearchquery.rcp

import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields
import org.junit.Test
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ParameterTypesIndexer

class TestMethodScenarios extends TestBase {
	
	@Test
	def void testReturnTypeIndexer(){
		val code = '''
		import java.util.List;
		public class MyClass {
			public List testReturnSomething() {
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
	def void testParameterTypesIndexer(){
		val code = '''
		import java.util.List;
		public class MyClass {
			public void testSomething(List a) {
			}
		}
		'''
		
		var index = exercise(code, new ParameterTypesIndexer())
		
		assertField(index.documents, l(newArrayList(
			s(Fields::PARAMETER_TYPES, "Ljava/util/List")
		)))
	}
}