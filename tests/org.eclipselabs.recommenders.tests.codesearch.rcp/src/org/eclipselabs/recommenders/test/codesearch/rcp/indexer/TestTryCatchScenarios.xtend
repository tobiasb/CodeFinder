package org.eclipselabs.recommenders.test.codesearch.rcp.indexer

import org.eclipse.recommenders.codesearch.rcp.index.Fields
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CaughtTypeIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DocumentTypeIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedMethodsInFinallyIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedMethodsInTryIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedTypesInFinallyIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedTypesInTryIndexer
import org.junit.Test

class TestTryCatchScenarios extends TestBase {
	
	
	@Test
	def void testUsedTypesInTryIndexer(){
		val code = '''
		import java.util.Map;
		
		public class testUsedTypesInTryIndexer {	
			public void test() {
				try {
					Map map;
				} catch(Exception ex) {
				}
				return null;
			}
		}
		'''
		
		exercise(code, i(newArrayList(new UsedTypesInTryIndexer(), new DocumentTypeIndexer())))
				
		assertField(l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_TYPES_IN_TRY, "Ljava/util/Map")
		)))
	}
	
	@Test
	def void testUsedTypesInFinallyIndexer(){
		val code = '''
		import java.util.Map;
		
		public class testUsedTypesInFinallyIndexer {	
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
		
		exercise(code, i(newArrayList(new UsedTypesInFinallyIndexer(), new DocumentTypeIndexer())))
				
		assertField(l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_TYPES_IN_FINALLY, "Ljava/util/Map")
		)))
	}
	
	@Test
	def void testCaughtTypeIndexer(){
		val code = '''		
		public class testCaughtTypeIndexer {	
			public void test() {
				try {
				} catch(Exception ex) {
				} finally {
				}
				return null;
			}
		}
		'''
		
		exercise(code, i(newArrayList(new CaughtTypeIndexer(), new DocumentTypeIndexer())))
				
		assertField(l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::CAUGHT_TYPE, "Ljava/lang/Exception")
		)))
	}
	
	@Test
	def void testUsedMethodsInTryIndexer(){
		val code = '''
		import java.util.Map;
		
		public class testUsedMethodsInTryIndexer {	
			public List test() {
				Map<String, String> map;
				try {
					map.put("", "");
				} catch(Exception ex) {
				}
			}
		}
		'''
		
		exercise(code, i(newArrayList(new UsedMethodsInTryIndexer(), new DocumentTypeIndexer())))
				
		assertField(l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_METHODS_IN_TRY, "Ljava/util/Map.put(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
		)))
	}
	
	@Test
	def void testUsedMethodsInFinallyIndexer(){
		val code = '''
		import java.util.Map;
		
		public class testUsedMethodsInFinallyIndexer {	
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
		
		exercise(code, i(newArrayList(new UsedMethodsInFinallyIndexer(), new DocumentTypeIndexer())))
			
		assertField(l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_METHODS_IN_FINALLY, "Ljava/util/Map.put(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
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
//		exercise(code, i(newArrayList(new UsedMethodsInFinallyIndexer(), new DocumentTypeIndexer())))
//			
//		assertField(l(newArrayList(
//			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
//			s(Fields::USED_FIELDS_IN_TRY, "Ljava/util/Map")
//		)))
//	}
}