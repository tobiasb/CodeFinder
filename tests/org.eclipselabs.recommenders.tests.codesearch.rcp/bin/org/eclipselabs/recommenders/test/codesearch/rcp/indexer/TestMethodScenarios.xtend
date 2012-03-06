package org.eclipselabs.recommenders.test.codesearch.rcp.indexer

import org.eclipse.recommenders.codesearch.rcp.index.Fields
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ParameterCountIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ParameterTypesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ReturnTypeIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ReturnVariableExpressionIndexer
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
		
		 exercise(code, new ReturnTypeIndexer())
		
		assertField(l(newArrayList(
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
		
		 exercise(code, new ParameterTypesIndexer())
		
		assertField(l(newArrayList(
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
		
		 exercise(code, new ParameterCountIndexer())
		
		assertField(l(newArrayList(
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
		
		 exercise(code, new ParameterCountIndexer())
		
		assertField(l(newArrayList(
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
		
		 exercise(code, new ReturnVariableExpressionIndexer())
		
		assertField(l(newArrayList(
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
		
		 exercise(code, new ReturnVariableExpressionIndexer())
		
		assertField(l(newArrayList(
			s(Fields::RETURN_VARIABLE_EXPRESSIONS, "names1")
		)))
		
		assertField(l(newArrayList(
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
		
		 exercise(code, new ReturnVariableExpressionIndexer())
		
		assertField(l(newArrayList(
			s(Fields::RETURN_VARIABLE_EXPRESSIONS, "null")
		)))
	}
}