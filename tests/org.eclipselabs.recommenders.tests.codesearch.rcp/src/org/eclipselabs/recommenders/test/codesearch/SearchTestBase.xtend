package org.eclipselabs.recommenders.test.codesearch

import org.eclipselabs.recommenders.test.codesearch.rcp.indexer.TestBase
import org.junit.Assert

class SearchTestBase extends TestBase {
	
	def void assertQueryResultGtZero(CharSequence query) {
				
		var result = search.lenientSearch(query.toString)
		Assert::assertTrue('''Query [«query»] yielded no results'''.toString, result.docs.totalHits > 0)
	}
}