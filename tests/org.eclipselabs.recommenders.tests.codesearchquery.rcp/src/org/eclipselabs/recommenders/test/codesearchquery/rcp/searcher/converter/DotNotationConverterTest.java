package org.eclipselabs.recommenders.test.codesearchquery.rcp.searcher.converter;

import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.junit.Assert;
import org.junit.Test;

public class DotNotationConverterTest {

    @Test
    public void testPackageNameToDotNotation() {
        final IQueryPartConverter sut = new DotNotationConverter();
        final String actual = sut.convertTo("Lorg/java/lang/String");

        Assert.assertEquals("org.java.lang.String", actual);
    }

    @Test
    public void testPackageNameToDotNotationWildcard() {
        final IQueryPartConverter sut = new DotNotationConverter();
        final String actual = sut.convertTo("Lorg/java/lang/*");

        Assert.assertEquals("org.java.lang.*", actual);
    }

    @Test
    public void testPackageNameFromDotNotation() {
        final IQueryPartConverter sut = new DotNotationConverter();
        final String actual = sut.convertFrom("org.java.lang.String");

        Assert.assertEquals("Lorg/java/lang/String", actual);
    }

    @Test
    public void testPackageNameFromDotNotationWildcard() {
        final IQueryPartConverter sut = new DotNotationConverter();
        final String actual = sut.convertFrom("org.java.lang.*");

        Assert.assertEquals("Lorg/java/lang/*", actual);
    }

    @Test
    public void testSimplePackageName() {
        final IQueryPartConverter sut = new DotNotationConverter();

        final String expected = "Lorg/eclipselabs/recommenders";
        final String actual = sut.convertFrom("org.eclipselabs.recommenders");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleWildcardPackageName() {
        final IQueryPartConverter sut = new DotNotationConverter();

        final String expected = "Lorg/eclipselabs/*";
        final String actual = sut.convertFrom("org.eclipselabs.*");

        Assert.assertEquals(expected, actual);
    }
}
