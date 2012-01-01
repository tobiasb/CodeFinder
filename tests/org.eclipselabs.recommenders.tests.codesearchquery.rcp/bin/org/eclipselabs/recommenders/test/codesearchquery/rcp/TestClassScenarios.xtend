package org.eclipselabs.recommenders.test.codesearchquery.rcp

import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllDeclaredMethodNamesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllExtendedTypesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllImplementedInterfacesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredMethodNamesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredMethodsIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ExtendedTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ImplementedInterfacesIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.OverriddenMethodsIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields
import org.junit.Test

class TestClassScenarios extends TestBase {
	
	@Test
	def void testDeclaredMethodsIndexer(){
		val code = '''
		public class MyClassXyZ {
			public void test() {
			}
			public void foo() {
			}
		}
		'''
		
		var index = exercise(code, new DeclaredMethodsIndexer())
		
		assertField(index.documents, l(newArrayList(
			s(Fields::DECLARED_METHODS, "LMyClassXyZ.test()V"),
			s(Fields::DECLARED_METHODS, "LMyClassXyZ.foo()V")
		)))
	}
	
	@Test
	def void testOverriddenMethodsIndexer(){
		val code = '''
		public class Clazz {
			@Override
			public String toString() {
				return super.toString();
			}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new OverriddenMethodsIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::OVERRIDDEN_METHODS, "Ljava/lang/Object.toString()Ljava/lang/String;")
		)))
	}
	
	@Test
	def void testExtendedTypeIndexer(){
		val code = '''
		import java.io.IOException;
		public class MyException extends IOException {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new ExtendedTypeIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::EXTENDED_TYPE, "Ljava/io/IOException")
		)))
	}
	
	@Test
	def void testAllExtendedTypesIndexer(){
		val code = '''
		import java.io.IOException;
		public class MyException extends IOException {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllExtendedTypesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_EXTENDED_TYPES, "Ljava/io/IOException"),
			s(Fields::ALL_EXTENDED_TYPES, "Ljava/lang/Exception"),
			s(Fields::ALL_EXTENDED_TYPES, "Ljava/lang/Throwable")
		)))
	}
	
	@Test
	def void testImplementedInterfacesIndexer(){
		val code = '''
		import java.io.Externalizable;
		public class MyInterface implements Externalizable {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new ImplementedInterfacesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::IMPLEMENTED_TYPES, "Ljava/io/Externalizable")
		)))
	}
	
	@Test
	def void testAllImplementedInterfacesIndexer(){
		val code = '''
		import java.io.Externalizable;
		public class MyInterface implements Externalizable {
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllImplementedInterfacesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_IMPLEMENTED_TYPES, "Ljava/io/Externalizable"),
			s(Fields::ALL_IMPLEMENTED_TYPES, "Ljava/io/Serializable")
		)))
	}
	
	@Test
	def void testDeclaredMethodNamesIndexer(){
		val code = '''
		public class Clazz {
			public void method01() {}
			private void method02() {}
			protected void method03() {}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new DeclaredMethodNamesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::DECLARED_METHODS_NAMES, "method01"),
			s(Fields::DECLARED_METHODS_NAMES, "method02"),
			s(Fields::DECLARED_METHODS_NAMES, "method03")
		)))
	}
	
	@Test
	def void testAllMethodNamesIndexer(){
		val code = '''
		import java.io.IOException;
		public class MyOtherException extends IOException {
			public void method01() {}
			private void method02() {}
			protected void method03() {}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllDeclaredMethodNamesIndexer())))
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_METHOD_NAMES, "method01"),
			s(Fields::ALL_METHOD_NAMES, "method02"),
			s(Fields::ALL_METHOD_NAMES, "method03"),
			s(Fields::ALL_METHOD_NAMES, "getMessage")
		)))
	}
	
	@Test
	def void testAllMethodNamesIndexer02(){
		val code = '''
		import java.io.IOException;
		public class MyOtherException extends IOException {
			public void method01() {}
			private void method02() {}
			protected void method03() {}
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new DeclaredMethodNamesIndexer())))
		
		assertNotField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_METHOD_NAMES, "getMessage")
		)))
	}
}