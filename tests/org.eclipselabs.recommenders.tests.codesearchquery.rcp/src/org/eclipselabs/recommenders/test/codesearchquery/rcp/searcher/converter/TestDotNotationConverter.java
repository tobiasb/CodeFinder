package org.eclipselabs.recommenders.test.codesearchquery.rcp.searcher.converter;

import junit.framework.Assert;

import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.junit.Test;

public class TestDotNotationConverter {
	
	@Test
	public void testSimplePackageName() {
		IQueryPartConverter sut = new DotNotationConverter();
		
		String expected = "Lorg/eclipselabs/recommenders";
		String actual = sut.convert("org.eclipselabs.recommenders");
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSimpleWildcardPackageName() {
		IQueryPartConverter sut = new DotNotationConverter();
		
		String expected = "Lorg/eclipselabs/*";
		String actual = sut.convert("org.eclipselabs.*");
		
		Assert.assertEquals(expected, actual);
	}
}
