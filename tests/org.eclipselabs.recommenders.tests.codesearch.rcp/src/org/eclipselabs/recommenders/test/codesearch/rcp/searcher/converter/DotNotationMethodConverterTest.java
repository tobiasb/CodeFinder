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

import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.DotNotationMethodConverter;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.IQueryPartConverter;
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
    public void testConstructorToDotNotationLowerCase() {
        final IQueryPartConverter sut = new DotNotationMethodConverter();
        final String actual = sut.convertTo("lorg/java/lang.init<>()V");

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

    @Test
    public void testSimpleMethodToDotNotation03() {
        final IQueryPartConverter sut = new DotNotationMethodConverter();
        final String actual = sut.convertTo("Lorg/java/lang.doX(Ljava/util/Map;)L");

        Assert.assertEquals("org.java.lang.doX", actual);
    }

    @Test
    public void testSimpleMethodToDotNotation04() {
        final IQueryPartConverter sut = new DotNotationMethodConverter();
        final String actual = sut.convertTo("Ljava/lang/Iterable.iterator()Ljava/util/Iterator<T>;");

        Assert.assertEquals("java.lang.Iterable.iterator", actual);
    }

    @Test
    public void testSimpleMethodFromDotNotation04() {
        final IQueryPartConverter sut = new DotNotationMethodConverter();
        final String actual = sut.convertFrom("java.lang.Iterable.iterator");

        Assert.assertEquals("Ljava/lang/Iterable.iterator\\(*", actual);
    }
}
