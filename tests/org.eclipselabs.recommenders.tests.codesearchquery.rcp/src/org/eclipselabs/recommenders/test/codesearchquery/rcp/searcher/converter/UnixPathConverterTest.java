package org.eclipselabs.recommenders.test.codesearchquery.rcp.searcher.converter;

import java.util.List;

import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.UnixPathNameConverter;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.Lists;

public class UnixPathConverterTest {

	@Test
	public void testWindowsPathToUnixPath() {

		IQueryPartConverter sut = new UnixPathNameConverter();
		String actual = sut.convertTo("c:\\xyz\\abf\\test.java");
		
		Assert.assertEquals("c/xyz/abf/test.java", actual);
	}
	
	@Test
	public void testUnixPathToWindowsPath() {

		IQueryPartConverter sut = new UnixPathNameConverter();
		String actual = sut.convertFrom("c/xyz/abf/test.java");
		
		Assert.assertEquals("c:\\xyz\\abf\\test.java", actual);
	}
	
	@Test
	public void testIdempotence() {
		
		List<String> testStrings = Lists.newArrayList();
		IQueryPartConverter sut = new UnixPathNameConverter();
		
		testStrings.clear();
		testStrings.add("c:\\xyz\\abf\\test.java");
		//add more testpaths...
		
		for(String s : testStrings) {
			Assert.assertEquals(s, sut.convertFrom(sut.convertTo(s)));
		}
		
		testStrings.clear();
		testStrings.add("c/xyz/abf/test.java");
		//add more testpaths...
		
		for(String s : testStrings) {
			Assert.assertEquals(s, sut.convertTo(sut.convertFrom(s)));
		}
	}
}
