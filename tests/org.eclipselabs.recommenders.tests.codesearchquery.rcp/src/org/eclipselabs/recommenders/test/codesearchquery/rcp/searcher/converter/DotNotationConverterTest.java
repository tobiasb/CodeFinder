package org.eclipselabs.recommenders.test.codesearchquery.rcp.searcher.converter;

import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.junit.Assert;
import org.junit.Test;

public class DotNotationConverterTest {
	
	@Test
	public void testPackageNameToDotNotation() {
		IQueryPartConverter sut = new DotNotationConverter();
		String actual = sut.convertTo("Lorg/java/lang/String");
		
		Assert.assertEquals("org.java.lang.String", actual);
	}
	
	@Test
	public void testPackageNameToDotNotationWildcard() {
		IQueryPartConverter sut = new DotNotationConverter();
		String actual = sut.convertTo("Lorg/java/lang/*");
		
		Assert.assertEquals("org.java.lang.*", actual);
	}
	
	@Test
	public void testPackageNameFromDotNotation() {
		IQueryPartConverter sut = new DotNotationConverter();
		String actual = sut.convertFrom("org.java.lang.String");
		
		Assert.assertEquals("Lorg/java/lang/String", actual);
	}
	
	@Test
	public void testPackageNameFromDotNotationWildcard() {
		IQueryPartConverter sut = new DotNotationConverter();
		String actual = sut.convertFrom("org.java.lang.*");
		
		Assert.assertEquals("Lorg/java/lang/*", actual);
	}

	@Test
	public void testSimplePackageName() {
		IQueryPartConverter sut = new DotNotationConverter();
		
		String expected = "Lorg/eclipselabs/recommenders";
		String actual = sut.convertFrom("org.eclipselabs.recommenders");
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSimpleWildcardPackageName() {
		IQueryPartConverter sut = new DotNotationConverter();
		
		String expected = "Lorg/eclipselabs/*";
		String actual = sut.convertFrom("org.eclipselabs.*");
		
		Assert.assertEquals(expected, actual);
	}
}
