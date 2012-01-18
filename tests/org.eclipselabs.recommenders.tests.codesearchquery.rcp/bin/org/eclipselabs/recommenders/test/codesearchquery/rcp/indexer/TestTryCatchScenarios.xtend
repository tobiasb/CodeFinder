package org.eclipselabs.recommenders.test.codesearchquery.rcp.indexer

import org.eclipselabs.recommenders.codesearchquery.Fields
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CaughtTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedMethodsInFinallyIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedMethodsInTryIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesInFinallyIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesInTryIndexer
import org.junit.Test

class TestTryCatchScenarios extends TestBase {
	
	
	@Test
	def void testUsedTypesInTryIndexer(){
		val code = '''
		import java.util.Map;
		
		public class MyClass {	
			public void test() {
				try {
					Map map;
				} catch(Exception ex) {
				}
				return null;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new UsedTypesInTryIndexer(), new DocumentTypeIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_TYPES_IN_TRY, "Ljava/util/Map")
		)))
	}
	
	@Test
	def void testUsedTypesInFinallyIndexer(){
		val code = '''
		import java.util.Map;
		
		public class MyClass {	
			public void test() {
				try {
				} catch(Exception ex) {
				} finally {
					Map map;
				}
				return null;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new UsedTypesInFinallyIndexer(), new DocumentTypeIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_TYPES_IN_FINALLY, "Ljava/util/Map")
		)))
	}
	
	@Test
	def void testCaughtTypeIndexer(){
		val code = '''		
		public class MyClass {	
			public void test() {
				try {
				} catch(Exception ex) {
				} finally {
				}
				return null;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new CaughtTypeIndexer(), new DocumentTypeIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::CAUGHT_TYPE, "Ljava/lang/Exception")
		)))
	}
	
	@Test
	def void testUsedMethodsInTryIndexer(){
		val code = '''
		import java.util.Map;
		
		public class MyClass {	
			public List test() {
				Map<String, String> map;
				try {
					map.put("", "");
				} catch(Exception ex) {
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new UsedMethodsInTryIndexer(), new DocumentTypeIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_METHODS_IN_TRY, "Ljava/util/Map.put(LK;LV;)LV;")
		)))
	}
	
	@Test
	def void testUsedMethodsInFinallyIndexer(){
		val code = '''
		import java.util.Map;
		
		public class MyClass {	
			public List test() {
				Map<String, String> map;
				try {
				} catch(Exception ex) {
				} finally {
					map.put("", "");
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new UsedMethodsInFinallyIndexer(), new DocumentTypeIndexer())))
			
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_METHODS_IN_FINALLY, "Ljava/util/Map.put(LK;LV;)LV;")
		)))
	}
	
//	@Test
//	def void testFieldsInTryFinallyIndexer(){
//		val code = '''
//		import java.util.Map;
//		
//		public class MyClass {	
//			public List test() {
//				try {
//				Map<String, String> map;
//				} catch(Exception ex) {
//				} finally {
//				}
//			}
//		}
//		'''
//		
//		var index = exercise(code, i(newArrayList(new UsedMethodsInFinallyIndexer(), new DocumentTypeIndexer())))
//			
//		assertField(index, l(newArrayList(
//			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
//			s(Fields::USED_FIELDS_IN_TRY, "Ljava/util/Map")
//		)))
//	}
}