package org.eclipselabs.recommenders.test.codesearchquery.rcp

import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FieldTypeIndexer
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields
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
		
		assertField(index.documents, l(newArrayList(
			s(Fields::TYPE, Fields::TYPE_FIELD),
			s(Fields::FIELD_TYPE, "Ljava/util/List")
		)))
	}
}