package org.eclipselabs.recommenders.test.codesearch.rcp.indexer

import org.eclipse.recommenders.codesearch.rcp.index.Fields
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AllDeclaredMethodNamesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AllExtendedTypesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AllImplementedInterfacesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredMethodNamesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredMethodsIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DocumentTypeIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ExtendedTypeIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ImplementedInterfacesIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.OverriddenMethodsIndexer
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		assertField(index, l(newArrayList(
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
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new AllDeclaredMethodNamesIndexer())))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_DELCARED_METHOD_NAMES, "method01"),
			s(Fields::ALL_DELCARED_METHOD_NAMES, "method02"),
			s(Fields::ALL_DELCARED_METHOD_NAMES, "method03"),
			s(Fields::ALL_DELCARED_METHOD_NAMES, "getMessage")
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
		
		assertNotField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_CLASS),
			s(Fields::ALL_DELCARED_METHOD_NAMES, "getMessage")
		)))
	}
}