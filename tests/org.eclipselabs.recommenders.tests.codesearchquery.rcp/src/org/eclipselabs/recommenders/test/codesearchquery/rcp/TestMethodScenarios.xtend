package org.eclipselabs.recommenders.test.codesearchquery.rcp

import org.eclipselabs.recommenders.codesearchquery.Fields
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ParameterCountIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ParameterTypesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnVariableExpressionIndexer
import org.junit.Test

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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
			s(Fields::PARAMETER_TYPES, "Ljava/util/List")
		)))
	}
	
	@Test
	def void testParameterCountIndexer(){
		val code = '''
		import java.util.List;
		public class MyClass {
			public void testSomething(List a) {
			}
		}
		'''
		
		var index = exercise(code, new ParameterCountIndexer())
		
		assertField(index, l(newArrayList(
			s(Fields::PARAMETER_COUNT, "1")
		)))
	}
	
	@Test
	def void testParameterCountIndexer02(){
		val code = '''
		import java.util.List;
		public class MyClass {
			public void testSomething(List a, String b) {
			}
		}
		'''
		
		var index = exercise(code, new ParameterCountIndexer())
		
		assertField(index, l(newArrayList(
			s(Fields::PARAMETER_COUNT, "2")
		)))
	}
	
	@Test
	def void testReturnVariableExpressionsIndexer(){
		val code = '''
		import java.util.List;
		public class MyClass {
			public List testReturnNames() {
				List names = null;
				return names;
			}
		}
		'''
		
		var index = exercise(code, new org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnVariableExpressionIndexer())
		
		assertField(index, l(newArrayList(
			s(Fields::RETURN_VARIABLE_EXPRESSIONS, "names")
		)))
	}
	
	@Test
	def void testReturnVariableExpressionsIndexer02(){
		val code = '''
		import java.util.List;
		public class MyClass {
			public List testReturnNames(boolean value) {
				List names1 = null;
				List names2 = null;
				
				if(value) { return names1; }
				else { return names2;}
			}
		}
		'''
		
		var index = exercise(code, new ReturnVariableExpressionIndexer())
		
		assertField(index, l(newArrayList(
			s(Fields::RETURN_VARIABLE_EXPRESSIONS, "names1")
		)))
		
		assertField(index, l(newArrayList(
			s(Fields::RETURN_VARIABLE_EXPRESSIONS, "names2")
		)))
	}
	
	@Test
	def void testReturnVariableExpressionsIndexer03(){
		val code = '''
		import java.util.List;
		public class MyClass {
			public List testReturnNames() {
				return null;
			}
		}
		'''
		
		var index = exercise(code, new org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnVariableExpressionIndexer())
		
		assertField(index, l(newArrayList(
			s(Fields::RETURN_VARIABLE_EXPRESSIONS, "null")
		)))
	}
}