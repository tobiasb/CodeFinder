package org.eclipselabs.recommenders.test.codesearchquery.rcp

import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllFieldNamesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredFieldNamesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredFieldTypesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaringTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FieldsReadIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FieldsWrittenIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FriendlyNameIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FullTextIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FullyQualifiedNameIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ModifiersIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ProjectNameIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ResourcePathIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedMethodsIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields
import org.junit.Test
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedFieldsInTryIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedFieldsInFinallyIndexer

class TestGeneralScenarios extends TestBase {

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
	def void testFullyQualifiedNameIndexer(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new FullyQualifiedNameIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::FULLY_QUALIFIED_NAME, "LMyClass"))))
	}
	
	@Test
	def void testFullyQualifiedNameIndexer02(){
		val code = '''
		public class MyClass {
			public void test() {}
		} 
		'''
		
		var index = exercise(code, new FullyQualifiedNameIndexer())
		
		assertField(index.documents, l(newArrayList(
			s(Fields::FULLY_QUALIFIED_NAME, "LMyClass.test()V")
		)))
	}
	
	@Test
	def void testFullyQualifiedNameIndexer03(){
		val code = '''
		import java.util.Map;
		public class MyClass {
			Map mapInstance;
		} 
		'''
		
		var index = exercise(code, new FullyQualifiedNameIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::FULLY_QUALIFIED_NAME, "LMyClass.mapInstance"))))
	}
	
	@Test
	def void testDocumentTypeIndexerClassOnly(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new DocumentTypeIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, Fields::TYPE_CLASS))))
	}
	
	@Test
	def void testDocumentTypeIndexerClassAndField(){
		val code = '''
		import java.util.Map;
		public class MyClass {
			Map map;
		} 
		'''
		
		var index = exercise(code, new DocumentTypeIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, Fields::TYPE_CLASS))))
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, Fields::TYPE_FIELD))))
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
		
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, Fields::TYPE_CLASS))))
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, Fields::TYPE_METHOD))))
	}
	
	@Test
	def void testDocumentTypeIndexerClassMethodAndTryCatch(){
		val code = '''
		import java.util.Map;
		
		public class MyClass {	
			public void test() {
				try {
					Map map;
					if(map != null) { throw new Exception(); }
				} catch(Exception ex) {
				}
				return null;
			}
		}
		'''
		
		var index = exercise(code, new DocumentTypeIndexer())
		
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, Fields::TYPE_CLASS))))
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, Fields::TYPE_METHOD))))
		assertField(index.documents, l(newArrayList(s(Fields::TYPE, Fields::TYPE_TRYCATCH))))
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
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_TYPES, "Ljava/util/Map")
		)))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::USED_TYPES, "Ljava/util/List")
		)))
	}
	
	@Test
	def void testUsedTypesIndexer03(){
		val code = '''
		import java.util.Map;
		
		public class MyClass {	
			public void test() {
				try {
				} catch(Exception ex) {
					Map map;
				}
				return null;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new UsedTypesIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_TYPES, "Ljava/util/Map")
		)))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_TYPES, "Ljava/util/Map")
		)))
	}
	
	@Test
	def void testUsedTypesIndexerNoPrimitivesStringObjectEtc(){
		val code = '''
		import java.util.Map;
		
		public class MyClass {	
			String f;
			Object o1;
			public void test() {
				String g;
				Object o2;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new UsedTypesIndexer())))
		
		assertNotField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_TYPES, "Ljava/lang/String")
		)))
		
		assertNotField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::USED_TYPES, "Ljava/lang/String")
		)))
		assertNotField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_TYPES, "Ljava/lang/Object")
		)))
		
		assertNotField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::USED_TYPES, "Ljava/lang/Object")
		)))
	}
	
	@Test
	def void testUsedMethodsIndexer(){
		val code = '''
		import java.util.Map;
		
		public class MyClass {	
			public List test() {
				Map<String, String> map;
				map.put("", "");
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new UsedMethodsIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;")
		)))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;")
		)))
	}
	
	@Test
	def void testUsedMethodsIndexer02(){
		val code = '''
		import java.util.Map;
		public class MyClass {	
			public List test() {
				Map<String, String> map;
				try {
				} catch(Exception ex) {
					map.put("", "");
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new UsedMethodsIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;")
		)))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;")
		)))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;")
		)))
	}
	
	@Test
	def void testDeclaringTypeIndexerMethod(){
		val code = '''
		public class MyClass {
			public void foo() {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new FriendlyNameIndexer(), new DeclaringTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::FRIENDLY_NAME, "foo"),
			s(Fields::DECLARING_TYPE, "LMyClass")
		)))		
	}
	
	@Test
	def void testDeclaringTypeIndexerField(){
		val code = '''
		public class MyClass {
			Map map;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new FriendlyNameIndexer(), new DeclaringTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::FRIENDLY_NAME, "map"),
			s(Fields::DECLARING_TYPE, "LMyClass")
		)))		
	}
	
	@Test
	def void testDeclaringTypeIndexerType(){
		val code = '''
		public class MyClass {
			public class SubClass {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new FriendlyNameIndexer(), new DeclaringTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::FRIENDLY_NAME, "MyClass$SubClass"),
			s(Fields::DECLARING_TYPE, "LMyClass")
		)))		
	}
	
	@Test
	def void testDeclaringTypeIndexerTryCatch(){
		val code = '''
		public class MyClass {
			public void testMethod123() {
				try{} catch(Exception ex){}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new DeclaringTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::DECLARING_TYPE, "LMyClass")
		)))		
	}
	
	@Test
	def void testProjectNameIndexer(){
		val code = '''
		public class MyClass {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ProjectNameIndexer(), new DocumentTypeIndexer())), "projectName")
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::PROJECT_NAME, "projectName")
		)))		
	}
	
	@Test
	def void testProjectNameIndexer02(){
		val code = '''
		public class MyClass {
			public void myMethod() {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ProjectNameIndexer(), new DocumentTypeIndexer())), "projectName")
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::PROJECT_NAME, "projectName")
		)))		
	}
	
	@Test
	def void testProjectNameIndexer03(){
		val code = '''
		public class MyClass {
			MyClass test;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ProjectNameIndexer(), new DocumentTypeIndexer())), "projectName")
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::PROJECT_NAME, "projectName")
		)))		
	}
	
	@Test
	def void testProjectNameIndexer04(){
		val code = '''
		public class MyClass {
			public void myMethod() {
				try {}
				catch(Exception ex) {}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ProjectNameIndexer(), new DocumentTypeIndexer())), "projectName")
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::PROJECT_NAME, "projectName")
		)))		
	}
	
	@Test
	def void testResourcePathIndexer(){
		val code = '''
		public class MyClass {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ResourcePathIndexer(), new DocumentTypeIndexer())), "projectName", "MyClass.java")
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::RESOURCE_PATH, "/projectName/MyClass.java")
		)))		
	}
	
	@Test
	def void testResourcePathIndexer02(){
		val code = '''
		public class MyClass {
			public void myMethod() {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ResourcePathIndexer(), new DocumentTypeIndexer())), "projectName", "MyClass.java")
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::RESOURCE_PATH, "/projectName/MyClass.java")
		)))		
	}
	
	@Test
	def void testResourcePathIndexer03(){
		val code = '''
		public class MyClass {
			MyClass test;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ResourcePathIndexer(), new DocumentTypeIndexer())), "projectName", "MyClass.java")
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::RESOURCE_PATH, "/projectName/MyClass.java")
		)))		
	}
	
	@Test
	def void testResourcePathIndexer04(){
		val code = '''
		public class MyClass {
			public void myMethod() {
				try {}
				catch(Exception ex) {}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ResourcePathIndexer(), new DocumentTypeIndexer())), "projectName", "MyClass.java")
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::RESOURCE_PATH, "/projectName/MyClass.java")
		)))		
	}
	
	@Test
	def void testModifiersIndexerClass(){
		val code = '''
		public class MyClass {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ModifiersIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::MODIFIERS, "public")
		)))		
	}
	
	@Test
	def void testModifiersIndexerClass02(){
		val code = '''
		public abstract class MyClass {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ModifiersIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::MODIFIERS, Fields::MODIFIER_PUBLIC),
			s(Fields::MODIFIERS, Fields::MODIFIER_ABSTRACT)
		)))		
	}
	
	@Test
	def void testModifiersIndexerMethod(){
		val code = '''
		public class MyClass {
			public void doSomethingNow123413() {}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ModifiersIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::MODIFIERS, Fields::MODIFIER_PUBLIC)
		)))		
	}
	
	@Test
	def void testModifiersIndexerMethod02(){
		val code = '''
		public abstract class MyClass {
			public static void doSomethingNow123413() {}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ModifiersIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::MODIFIERS, Fields::MODIFIER_PUBLIC),
			s(Fields::MODIFIERS, Fields::MODIFIER_STATIC)
		)))		
	}
	
	@Test
	def void testModifiersIndexerField(){
		val code = '''
		import java.util.Map;
		public class MyClass {
			private Map map;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ModifiersIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::MODIFIERS, Fields::MODIFIER_PRIVATE)
		)))		
	}
	
	@Test
	def void testModifiersIndexerField02(){
		val code = '''
		import java.util.Map;
		public final class MyClass {
			protected static Map map;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ModifiersIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::MODIFIERS, Fields::MODIFIER_PROTECTED),
			s(Fields::MODIFIERS, Fields::MODIFIER_STATIC)
		)))		
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::MODIFIERS, Fields::MODIFIER_FINAL)
		)))	
	}
	
	@Test
	def void testDeclaredFieldNamesClass(){
		val code = '''
		import java.util.Map;
		public final class MyClass {
			Map map;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DeclaredFieldNamesIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::DECLARED_FIELD_NAMES, "map")
		)))	
	}
	
	@Test
	def void testDeclaredFieldNamesMethod(){
		val code = '''
		import java.util.Map;
		public final class MyClass {
			void doSomethingElse() {
				Map map;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DeclaredFieldNamesIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::DECLARED_FIELD_NAMES, "map")
		)))	
	}
	
	@Test
	def void testDeclaredFieldNamesTryCatch(){
		val code = '''
		import java.util.Map;
		public final class MyClass {
			void doSomethingElse() {
				try {}
				catch(Exception ex) { Map map; }
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DeclaredFieldNamesIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::DECLARED_FIELD_NAMES, "map")
		)))	
	}
	
	@Test
	def void testDeclaredFieldTypesClass(){
		val code = '''
		import java.util.Map;
		public final class MyClass {
			Map map;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DeclaredFieldTypesIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::DECLARED_FIELD_TYPES, "Ljava/util/Map")
		)))	
	}
	
	@Test
	def void testDeclaredFieldTypesMethod(){
		val code = '''
		import java.util.Map;
		public final class MyClass {
			void doSomethingElse() {
				Map map;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DeclaredFieldTypesIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::DECLARED_FIELD_TYPES, "Ljava/util/Map")
		)))	
	}
	
	@Test
	def void testDeclaredFieldTypesTry(){
		val code = '''
		import java.util.Map;
		public final class MyClass {
			void doSomethingElse() {
				try {}
				catch(Exception ex) { Map map; }
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DeclaredFieldTypesIndexer(), new DocumentTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::DECLARED_FIELD_TYPES, "Ljava/util/Map")
		)))	
	}
	
	@Test
	def void testAllFieldNamesIndexerClass(){
		val code = '''
		import java.util.Map;
		public class MyOtherException extends IOException {
			private Map theMapyMap;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllFieldNamesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_FIELD_NAMES, "theMapyMap")
		)))
	}
	
	@Test
	def void testAllFieldNamesIndexerMethod(){
		val code = '''
		import java.util.Map;
		public class MyOtherException extends IOException {
			private Map theMapyMap;
			void doThisAndThat() {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllFieldNamesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::ALL_FIELD_NAMES, "theMapyMap")
		)))
	}
	
	@Test
	def void testAllFieldNamesIndexerMethod02(){
		val code = '''
		import java.util.Map;
		public class MyOtherException extends IOException {
			private Map theMapyMap;
			void doThisAndThat() {
				private Map someOtherMap;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllFieldNamesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::ALL_FIELD_NAMES, "theMapyMap"),
			s(Fields::ALL_FIELD_NAMES, "someOtherMap")
		)))
	}
	
	@Test
	def void testAllFieldNamesIndexerTryCatch(){
		val code = '''
		import java.util.Map;
		public class MyOtherException extends IOException {
			private Map theMapyMap;
			void doThisAndThat() {
				try {}
				catch(Exception ex) {}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllFieldNamesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::ALL_FIELD_NAMES, "theMapyMap")
		)))
	}
	
	@Test
	def void testAllFieldNamesIndexerTryCatch02(){
		val code = '''
		import java.util.Map;
		public class MyOtherException extends IOException {
			private Map theMapyMap;
			void doThisAndThat() {
				try {}
				catch(Exception ex) {
					private Map someOtherMap;
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllFieldNamesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::ALL_FIELD_NAMES, "theMapyMap"),
			s(Fields::ALL_FIELD_NAMES, "someOtherMap")
		)))
	}
	
	@Test
	def void testAllFieldNamesIndexerClass02(){
		val code = '''
		import java.util.Map;
		import java.io.IOException;
		public class MyOtherException extends IOException {
			private Map theMapyMap;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllFieldNamesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_FIELD_NAMES, "theMapyMap"),
			s(Fields::ALL_FIELD_NAMES, "suppressedExceptions")
		)))
	}
	
	@Test
	def void testFullTextIndexerClass(){
		val code = '''
		import java.io.IOException;
		public class MOtherException extends IOException {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new FullTextIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::FULL_TEXT, '''public class MOtherException extends IOException {
}'''.toString)
		)))
	}
	
	@Test
	def void testFullTextIndexerMethod(){
		val code = '''
		import java.io.IOException;
		public class MyTinyException extends IOException {
			public static void theEasiestMethodEver() {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new FullTextIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::FULL_TEXT, '''public static void theEasiestMethodEver(){
}'''.toString)
		)))
	}
	
	@Test
	def void testFullTextIndexerTryCatch(){
		val code = '''
		import java.io.IOException;
		public class MyRandomException extends IOException {
			public static void theWorstMethodEver() {
				try {}
				catch(Exception ex) {
					//This is a comment
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new FullTextIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::FULL_TEXT, '''catch (Exception ex) {
}'''.toString)
		)))
	}
	
	@Test
	def void testFullTextIndexerField(){
		val code = '''
		import java.util.Map;
		import java.io.IOException;
		public class MyOtherOtherException extends IOException {
			Map theWorldMap;
			public static void theBestMethodEver() {
				try {}
				catch(Exception ex) {
					//This is a comment
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new FullTextIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::FULL_TEXT, '''Map theWorldMap;'''.toString)
		)))
	}
	
	@Test
	def void testFieldsReadIndexerMethod(){
		val code = '''
		import java.util.Map;
		import java.io.IOException;
		public class MyOtherOtherException extends IOException {
			public Map theWorldMap;
			public static void theBestMethodEver() {
				MyOtherOtherException m;
				Object o = m.theWorldMap;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new FieldsReadIndexer(), new FieldsWrittenIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::FIELDS_READ, "LMyOtherOtherException.theWorldMap")
		)))
		
//		assertNotField(index.documents, l(newArrayList(
//			s(Fields::TYPE, Fields::TYPE_CLASS),
//			s(Fields::FIELDS_WRITTEN, "LMyOtherOtherException.someObject")
//		)))
	}
	
	@Test
	def void testFieldsReadIndexerClass(){
		val code = '''
		import java.io.IOException;
		public class Testclass {
			public Object someObject = null;
			public Testclass ob = new Testclass();
			public Object anObject = ob.someObject;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new FieldsReadIndexer(), new FieldsWrittenIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::FIELDS_READ, "LTestclass.someObject")
		)))
		
//		assertNotField(index.documents, l(newArrayList(
//			s(Fields::TYPE, Fields::TYPE_CLASS),
//			s(Fields::FIELDS_WRITTEN, "LTestclass.someObject")
//		)))
	}
	
	@Test
	def void testFieldsReadIndexerTryCatch(){
		val code = '''
		import java.io.IOException;
		public class Testclass extends IOException {
			public Object someObject = null;
			public Object theWorldMap = (new Testclass()).someObject;
			public static void theBestMethodEver() {
				try {
				} catch(Exception ex) {
					Testclass c = new Testclass();
					Object myObject = c.someObject;
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new FieldsReadIndexer(), new FieldsWrittenIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::FIELDS_READ, "LTestclass.someObject")
		)))
		
//		assertNotField(index.documents, l(newArrayList(
//			s(Fields::TYPE, Fields::TYPE_CLASS),
//			s(Fields::FIELDS_WRITTEN, "LTestclass.someObject")
//		)))
	}
	
	@Test
	def void testFieldsWrittenIndexerMethod(){
		val code = '''
		import java.util.Map;
		import java.io.IOException;
		public class MyOtherOtherException extends IOException {
			public Map theWorldMap;
			public static void theBestMethodEver() {
				MyOtherOtherException m = null;
				m.theWorldMap = null;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new FieldsReadIndexer(), new FieldsWrittenIndexer())))
		
//		assertNotField(index.documents, l(newArrayList(
//			s(Fields::TYPE, Fields::TYPE_METHOD),
//			s(Fields::FIELDS_READ, "LMyOtherOtherException.theWorldMap")
//		)))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::FIELDS_WRITTEN, "LMyOtherOtherException.theWorldMap")
		)))
	}
	
	@Test
	def void testUsedFieldsInTryIndexer(){
		val code = '''
		import java.util.Map;
		import java.io.IOException;
		public class MyOtherOtherException extends IOException {
			public Map theWorldMap;
			public static void theBestMethodEver() {
				try {
					MyOtherOtherException m = null;
					m.theWorldMap = null;
				} catch(Exception ex) {
				} finally {
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new UsedFieldsInTryIndexer())))
				
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_FIELDS_IN_TRY, "LMyOtherOtherException.theWorldMap")
		)))
	}
	
	@Test
	def void testUsedFieldsInFinallyIndexer(){
		val code = '''
		import java.util.Map;
		import java.io.IOException;
		public class MyOtherOtherException extends IOException {
			public Map theWorldMap;
			public static void theBestMethodEver() {
				try {
				} catch(Exception ex) {
				} finally {
					MyOtherOtherException m = null;
					m.theWorldMap = null;
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new UsedFieldsInFinallyIndexer())))
				
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_FIELDS_IN_FINALLY, "LMyOtherOtherException.theWorldMap")
		)))
	}
}