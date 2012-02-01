package org.eclipselabs.recommenders.test.codesearchquery.rcp.searcher.converter;

import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.DotNotationMethodConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.junit.Assert;
import org.junit.Test;

public class DotNotationMethodConverterTest {

    @Test
    public void testConstructorToDotNotation() {
        final IQueryPartConverter sut = new DotNotationMethodConverter();
        final String actual = sut.convertTo("Lorg/java/lang.init<>()V");

        Assert.assertEquals("org.java.lang.init<>", actual);
    }

    @Test
    public void testConstructorFromDotNotation() {
        final IQueryPartConverter sut = new DotNotationMethodConverter();
        final String actual = sut.convertFrom("org.java.lang.init<>");

        Assert.assertEquals("Lorg/java/lang.init<>\\(*", actual);
    }

    @Test
    public void testSimpleMethodToDotNotation01() {
        final IQueryPartConverter sut = new DotNotationMethodConverter();
        final String actual = sut.convertTo("Lorg/java/lang.doX()V");

        Assert.assertEquals("org.java.lang.doX", actual);
    }

    @Test
    public void testSimpleMethodFromDotNotation01() {
        final IQueryPartConverter sut = new DotNotationMethodConverter();
        final String actual = sut.convertFrom("org.java.lang.doX");

        Assert.assertEquals("Lorg/java/lang.doX\\(*", actual);
    }

    @Test
    public void testSimpleMethodToDotNotation02() {
        final IQueryPartConverter sut = new DotNotationMethodConverter();
        final String actual = sut.convertTo("Lorg/java/lang.doX(Ljava/util/Map;)V");

        Assert.assertEquals("org.java.lang.doX", actual);
    }
}
