package org.eclipselabs.recommenders.test.codesearchquery.rcp.searcher.converter;

import java.util.List;

import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.IQueryPartConverter;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.converter.PathValueConverter;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.Lists;

public class PathValueConverterTest {

    @Test
    public void testUnixPathToWindowsPath() {

        final IQueryPartConverter sut = new PathValueConverter();
        final String actual = sut.convertFrom("c:/xyz/abf/test.java");

        Assert.assertEquals("c\\:/xyz/abf/test.java", actual);
    }

    @Test
    public void testIdempotence() {

        final List<String> testStrings = Lists.newArrayList();
        final IQueryPartConverter sut = new PathValueConverter();

        testStrings.clear();
        testStrings.add("c:/xyz/abf/test.java");
        // add more testpaths...

        for (final String s : testStrings) {
            Assert.assertEquals(s, sut.convertTo(sut.convertFrom(s)));
        }
    }
}
