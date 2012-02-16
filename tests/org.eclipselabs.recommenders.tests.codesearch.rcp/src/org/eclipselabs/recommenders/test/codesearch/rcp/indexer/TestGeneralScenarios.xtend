package org.eclipselabs.recommenders.test.codesearch.rcp.indexer

import org.apache.lucene.store.RAMDirectory
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.recommenders.codesearch.rcp.index.Fields
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AllDeclaredFieldNamesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AnnotationsIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredFieldNamesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredFieldTypesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaringTypeIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DocumentTypeIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FieldsReadIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FieldsWrittenIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FriendlyNameIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FullTextIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FullyQualifiedNameIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.InstanceOfIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ModifiersIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ProjectNameIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.TimestampIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedFieldsInFinallyIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedFieldsInTryIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedMethodsIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedTypesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor.CompilationUnitVisitor
import org.eclipse.recommenders.tests.jdt.JavaProjectFixture
import org.junit.Test

import static org.eclipselabs.recommenders.test.codesearch.rcp.indexer.TestBase.*

class TestGeneralScenarios extends TestBase {

	@Test
	def void testDocumentCounts(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new FriendlyNameIndexer())
		assertNumDocs(index, 1)
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
		assertNumDocs(index, 2)
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
		assertNumDocs(index, 3)
	}
	
	@Test
	def void testFriendlyNameIndexer(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new FriendlyNameIndexer())
		
		assertField(index, l(newArrayList(s(Fields::FRIENDLY_NAME, "MyClass"))))
	}
	
	@Test
	def void testFriendlyNameIndexer02(){
		val code = '''
		public class MyClass {
			public void test() {}
		} 
		'''
		
		var index = exercise(code, new FriendlyNameIndexer())
		
		assertField(index, l(newArrayList(s(Fields::FRIENDLY_NAME, "test"))))
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
		
		assertField(index, l(newArrayList(s(Fields::FRIENDLY_NAME, "map"))))
	}
	
	@Test
	def void testFullyQualifiedNameIndexer(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new FullyQualifiedNameIndexer())
		
		assertField(index, l(newArrayList(s(Fields::FULLY_QUALIFIED_NAME, "LMyClass"))))
	}
	
	@Test
	def void testFullyQualifiedNameIndexer02(){
		val code = '''
		public class MyClass {
			public void test() {}
		} 
		'''
		
		var index = exercise(code, new FullyQualifiedNameIndexer())
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(s(Fields::FULLY_QUALIFIED_NAME, "LMyClass.mapInstance"))))
	}
	
	@Test
	def void testDocumentTypeIndexerClassOnly(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		var index = exercise(code, new DocumentTypeIndexer())
		
		assertField(index, l(newArrayList(s(Fields::TYPE, Fields::TYPE_CLASS))))
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
		
		assertField(index, l(newArrayList(s(Fields::TYPE, Fields::TYPE_CLASS))))
		assertField(index, l(newArrayList(s(Fields::TYPE, Fields::TYPE_FIELD))))
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
		
		assertField(index, l(newArrayList(s(Fields::TYPE, Fields::TYPE_CLASS))))
		assertField(index, l(newArrayList(s(Fields::TYPE, Fields::TYPE_METHOD))))
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
		
		assertField(index, l(newArrayList(s(Fields::TYPE, Fields::TYPE_CLASS))))
		assertField(index, l(newArrayList(s(Fields::TYPE, Fields::TYPE_METHOD))))
		assertField(index, l(newArrayList(s(Fields::TYPE, Fields::TYPE_TRYCATCH))))
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_TYPES, "Ljava/util/Map")
		)))
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_TYPES, "Ljava/util/Map")
		)))
		
		assertField(index, l(newArrayList(
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
		
		assertNotField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_TYPES, "Ljava/lang/String")
		)))
		
		assertNotField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::USED_TYPES, "Ljava/lang/String")
		)))
		assertNotField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_TYPES, "Ljava/lang/Object")
		)))
		
		assertNotField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
		)))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
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
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
		)))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
		)))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_METHODS, "Ljava/util/Map.put(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
			s(Fields::FRIENDLY_NAME, "MyClass$SubClass"),
			s(Fields::DECLARING_TYPE, "LMyClass")
		)))		
	}
	
	@Test
	def void testDeclaringTypeIndexerVarUsage(){
		val code = '''
		public class MyClass {
			public void testMethod123() {
				String s;
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new DeclaringTypeIndexer())))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_VARUSAGE),
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		val fixture = new JavaProjectFixture(ResourcesPlugin::getWorkspace(),"projectName")
		val struct = fixture.createFileAndParseWithMarkers(code.toString)
		val cu = struct.first;
        var cuParsed = parse(cu);

        var index = new CodeIndexerIndex(new RAMDirectory())
		
        var visitor = new CompilationUnitVisitor(index);
        visitor.addIndexer(i(newArrayList(new ResourcePathIndexer(), new DocumentTypeIndexer())));
        
        cuParsed.accept(visitor)
        index.commit
        		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::RESOURCE_PATH, ResourcePathIndexer::getPath(getCompilationUnitFromAstNode(cuParsed)))
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
		
		val fixture = new JavaProjectFixture(ResourcesPlugin::getWorkspace(),"projectName")
		val struct = fixture.createFileAndParseWithMarkers(code.toString)
		val cu = struct.first;
        var cuParsed = parse(cu);

        var index = new CodeIndexerIndex(new RAMDirectory())
		
        var visitor = new CompilationUnitVisitor(index);
        visitor.addIndexer(i(newArrayList(new ResourcePathIndexer(), new DocumentTypeIndexer())));
        
        cuParsed.accept(visitor)
        index.commit
        		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::RESOURCE_PATH, ResourcePathIndexer::getPath(getCompilationUnitFromAstNode(cuParsed)))
		)))		
	}
	
	@Test
	def void testResourcePathIndexer03(){
		val code = '''
		public class MyClass {
			MyClass test;
		}
		'''
		
		val fixture = new JavaProjectFixture(ResourcesPlugin::getWorkspace(),"projectName")
		val struct = fixture.createFileAndParseWithMarkers(code.toString)
		val cu = struct.first;
        var cuParsed = parse(cu);

        var index = new CodeIndexerIndex(new RAMDirectory())
		
        var visitor = new CompilationUnitVisitor(index);
        visitor.addIndexer(i(newArrayList(new ResourcePathIndexer(), new DocumentTypeIndexer())));
        
        cuParsed.accept(visitor)
        index.commit
        		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::RESOURCE_PATH, ResourcePathIndexer::getPath(getCompilationUnitFromAstNode(cuParsed)))
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
		
		val fixture = new JavaProjectFixture(ResourcesPlugin::getWorkspace(),"projectName")
		val struct = fixture.createFileAndParseWithMarkers(code.toString)
		val cu = struct.first;
        var cuParsed = parse(cu);

        var index = new CodeIndexerIndex(new RAMDirectory())
		
        var visitor = new CompilationUnitVisitor(index);
        visitor.addIndexer(i(newArrayList(new ResourcePathIndexer(), new DocumentTypeIndexer())));
        
        cuParsed.accept(visitor)
        index.commit
        		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::RESOURCE_PATH, ResourcePathIndexer::getPath(getCompilationUnitFromAstNode(cuParsed))
			)
		)))			
	}
	
	@Test
	def void testResourcePathIndexer05(){
		val code = '''
		public class MyClass {
			public void myMethod() {
				String a = "";
			}
		}
		'''
		
		val fixture = new JavaProjectFixture(ResourcesPlugin::getWorkspace(),"projectName")
		val struct = fixture.createFileAndParseWithMarkers(code.toString)
		val cu = struct.first;
        var cuParsed = parse(cu);

        var index = new CodeIndexerIndex(new RAMDirectory())
		
        var visitor = new CompilationUnitVisitor(index);
        visitor.addIndexer(i(newArrayList(new ResourcePathIndexer(), new DocumentTypeIndexer())));
        
        cuParsed.accept(visitor)
        index.commit
        		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_VARUSAGE),
			s(Fields::RESOURCE_PATH, ResourcePathIndexer::getPath(getCompilationUnitFromAstNode(cuParsed)))
		)))		
	}
	
	@Test
	def void testModifiersIndexerClass(){
		val code = '''
		public class MyClass {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new ModifiersIndexer(), new DocumentTypeIndexer())))
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::MODIFIERS, Fields::MODIFIER_PROTECTED),
			s(Fields::MODIFIERS, Fields::MODIFIER_STATIC)
		)))		
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllDeclaredFieldNamesIndexer())))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_DECLARED_FIELD_NAMES, "theMapyMap")
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
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllDeclaredFieldNamesIndexer())))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::ALL_DECLARED_FIELD_NAMES, "theMapyMap")
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
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllDeclaredFieldNamesIndexer())))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::ALL_DECLARED_FIELD_NAMES, "theMapyMap"),
			s(Fields::ALL_DECLARED_FIELD_NAMES, "someOtherMap")
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
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllDeclaredFieldNamesIndexer())))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::ALL_DECLARED_FIELD_NAMES, "theMapyMap")
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
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllDeclaredFieldNamesIndexer())))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::ALL_DECLARED_FIELD_NAMES, "theMapyMap"),
			s(Fields::ALL_DECLARED_FIELD_NAMES, "someOtherMap")
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
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllDeclaredFieldNamesIndexer())))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_DECLARED_FIELD_NAMES, "theMapyMap"),
			s(Fields::ALL_DECLARED_FIELD_NAMES, "stackTrace")
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::FIELDS_READ, "LMyOtherOtherException.theWorldMap")
		)))
		
//		assertNotField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::FIELDS_READ, "LTestclass.someObject")
		)))
		
//		assertNotField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::FIELDS_READ, "LTestclass.someObject")
		)))
		
//		assertNotField(index, l(newArrayList(
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
		
//		assertNotField(index, l(newArrayList(
//			s(Fields::TYPE, Fields::TYPE_METHOD),
//			s(Fields::FIELDS_READ, "LMyOtherOtherException.theWorldMap")
//		)))
		
		assertField(index, l(newArrayList(
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
				
		assertField(index, l(newArrayList(
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
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::USED_FIELDS_IN_FINALLY, "LMyOtherOtherException.theWorldMap")
		)))
	}
	
	@Test
	def void testAnnotationIndexer(){
		val code = '''
		@Deprecated
		public class MyAnnotatedClass {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AnnotationsIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ANNOTATIONS, "Ljava/lang/Deprecated")
		)))
	}
	
	@Test
	def void testAnnotationIndexer02(){
		val code = '''
		@SuppressWarnings({"unchecked", "rawtypes"})
		public class MyAnnotatedClass {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AnnotationsIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ANNOTATIONS, "Ljava/lang/SuppressWarnings")
		)))
			
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ANNOTATIONS, "Ljava/lang/SuppressWarnings:unchecked")
		)))
			
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ANNOTATIONS, "Ljava/lang/SuppressWarnings:rawtypes")
		)))
	}
	
	@Test
	def void testAnnotationIndexer03(){
		val code = '''
		import java.util.List;
		public class MyAnnotatedClass {
			@SuppressWarnings("rawtypes")
			public static String printLabel(List l) {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AnnotationsIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::ANNOTATIONS, "Ljava/lang/SuppressWarnings")
		)))
			
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::ANNOTATIONS, "Ljava/lang/SuppressWarnings:rawtypes")
		)))
	}
	
	@Test
	def void testInstanceOfIndexerClass(){
		val code = '''
		public class MyInstanceOfClass {
			public void operation() {
				Object a = new String();
				
				if(a instanceof Exception) {
					//Somethin's fishy
				} 
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new InstanceOfIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::INSTANCEOF_TYPES, "Ljava/lang/Exception")
		)))
	}
	
	@Test
	def void testInstanceOfIndexerMethod(){
		val code = '''
		public class MyInstanceOfClass {
			public void operation() {
				Object a = new String();
				
				if(a instanceof Exception) {
					//Somethin's fishy
				} 
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new InstanceOfIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::INSTANCEOF_TYPES, "Ljava/lang/Exception")
		)))
	}
	
	@Test
	def void testInstanceOfIndexerTryCatch(){
		val code = '''
		public class MyInstanceOfClass {
			public void operation() {
				Object a = new String();
				
				try {
				}
				catch(Exception ex) {
					if(a instanceof Exception) {
						//Somethin's fishy
					} 
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new InstanceOfIndexer())))
				
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::INSTANCEOF_TYPES, "Ljava/lang/Exception")
		)))
	}
	
	@Test
	def void testTimestampIndexer() {
		val code = '''
		public class MyInstanceOfClass {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new TimestampIndexer())))
				
		assertFieldStartsWith(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::TIMESTAMP, TimestampIndexer::getTimeString().substring(0, 8)) //This test obviously will fail from time to time
		)))
	}
	
	@Test
	def void testTimestampIndexer02() {
		val code = '''
		public class MyInstanceOfClass {
			public void operation() {
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new TimestampIndexer())))
				
		assertFieldStartsWith(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_METHOD),
			s(Fields::TIMESTAMP, TimestampIndexer::getTimeString().substring(0, 8)) //This test obviously will fail from time to time
		)))
	}
	
	@Test
	def void testTimestampIndexer03() {
		val code = '''
		public class MyInstanceOfClass {
			private String s;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new TimestampIndexer())))
				
		assertFieldStartsWith(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::TIMESTAMP, TimestampIndexer::getTimeString().substring(0, 8)) //This test obviously will fail from time to time
		)))
	}
	
	@Test
	def void testTimestampIndexer04() {
		val code = '''
		public class MyInstanceOfClass {
			public void operation() {
				try {
				}
				catch(Exception ex) {
				}
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new TimestampIndexer())))
				
		assertFieldStartsWith(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_TRYCATCH),
			s(Fields::TIMESTAMP, TimestampIndexer::getTimeString().substring(0, 8)) //This test obviously will fail from time to time
		)))
	}
}