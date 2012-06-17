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

import java.util.List;

import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.IQueryPartConverter;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.converter.PathValueConverter;
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
