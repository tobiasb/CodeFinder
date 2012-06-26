/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.test.codesearch.rcp.searcher.converter;

import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.DotNotationTypeConverter;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.IQueryPartConverter;
import org.junit.Assert;
import org.junit.Test;

public class DotNotationTypeConverterTest {

    @Test
    public void testPackageNameToDotNotation() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();
        final String actual = sut.convertTo("Lorg/java/lang/String");

        Assert.assertEquals("org.java.lang.String", actual);
    }

    @Test
    public void testPackageNameToDotNotationLowerCase() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();
        final String actual = sut.convertTo("lorg/java/lang/String");

        Assert.assertEquals("org.java.lang.String", actual);
    }

    @Test
    public void testPackageNameToDotNotationWildcard() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();
        final String actual = sut.convertTo("Lorg/java/lang/*");

        Assert.assertEquals("org.java.lang.*", actual);
    }

    @Test
    public void testPackageNameFromDotNotation() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();
        final String actual = sut.convertFrom("org.java.lang.String");

        Assert.assertEquals("Lorg/java/lang/String", actual);
    }

    @Test
    public void testPackageNameFromDotNotationWildcard() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();
        final String actual = sut.convertFrom("org.java.lang.*");

        Assert.assertEquals("Lorg/java/lang/*", actual);
    }

    @Test
    public void testSimplePackageName() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();

        final String expected = "Lorg/eclipselabs/recommenders";
        final String actual = sut.convertFrom("org.eclipselabs.recommenders");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleWildcardPackageName() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();

        final String expected = "Lorg/eclipselabs/*";
        final String actual = sut.convertFrom("org.eclipselabs.*");

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testQualifiedNameWithoutDotIsWildcardPrefixSearch() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();

        final String expected = "L*/IWorkbench";
        final String actual = sut.convertFrom("IWorkbench");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIdempotence() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();

        final String expected = "Lorg/eclipselabs/*";
        String actual = "org.eclipselabs.*";

        actual = sut.convertFrom(actual);
        Assert.assertEquals(expected, actual);

        actual = sut.convertFrom(actual);
        Assert.assertEquals(expected, actual);

        actual = sut.convertFrom(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIdempotenceUnqualifiedTypeName() {
        final IQueryPartConverter sut = new DotNotationTypeConverter();

        final String expected = "L*/IWorkbench";
        String actual = "IWorkbench";

        actual = sut.convertFrom(actual);
        Assert.assertEquals(expected, actual);

        actual = sut.convertFrom(actual);
        Assert.assertEquals(expected, actual);

        actual = sut.convertFrom(actual);
        Assert.assertEquals(expected, actual);
    }
}
