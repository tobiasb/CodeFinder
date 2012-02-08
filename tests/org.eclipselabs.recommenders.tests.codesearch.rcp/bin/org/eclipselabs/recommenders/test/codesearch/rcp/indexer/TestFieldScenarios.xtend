package org.eclipselabs.recommenders.test.codesearch.rcp.indexer

import org.eclipse.recommenders.codesearch.rcp.index.Fields
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DocumentTypeIndexer
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FieldTypeIndexer
import org.junit.Test


class TestFieldScenarios extends TestBase {
	
	@Test
	def void testFieldTypeIndexer(){
		val code = '''
		import java.util.List;
		public class MyClass {
			List x;
		}
		'''
		
		var index = exercise(code, i(newArrayList(new DocumentTypeIndexer(), new FieldTypeIndexer())))
		
		assertField(index, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::FIELD_TYPE, "Ljava/util/List")
		)))
	}
}