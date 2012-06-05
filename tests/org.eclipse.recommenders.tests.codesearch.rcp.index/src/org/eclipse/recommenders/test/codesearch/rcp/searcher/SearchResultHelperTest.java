/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */
package org.eclipse.recommenders.test.codesearch.rcp.searcher;

import org.junit.Ignore;

@Ignore
public class SearchResultHelperTest {

    // @Test
    // public void testIntersection() {
    // TopDocs d1 = new TopDocs(2, new ScoreDoc[] { new ScoreDoc(2, 1), new
    // ScoreDoc(3, 1) }, 0);
    // TopDocs d2 = new TopDocs(2, new ScoreDoc[] { new ScoreDoc(3, 1), new
    // ScoreDoc(4, 1) }, 0);
    //
    // TopDocs result = SearchResultHelper.getIntersection(d1, d2);
    //
    // assertEquals(1, result.scoreDocs.length);
    // assertEquals(3, result.scoreDocs[0].doc);
    // }
    //
    // @Test
    // public void testIntersectionList() {
    // TopDocs d1 = new TopDocs(2, new ScoreDoc[] { new ScoreDoc(2, 1), new
    // ScoreDoc(3, 1), new ScoreDoc(4, 1),
    // new ScoreDoc(5, 1) }, 0);
    // TopDocs d2 = new TopDocs(2, new ScoreDoc[] { new ScoreDoc(1, 1), new
    // ScoreDoc(3, 1), new ScoreDoc(4, 1),
    // new ScoreDoc(5, 1) }, 0);
    // TopDocs d3 = new TopDocs(2, new ScoreDoc[] { new ScoreDoc(6, 1), new
    // ScoreDoc(3, 1), new ScoreDoc(4, 1),
    // new ScoreDoc(9, 1) }, 0);
    //
    // List<TopDocs> list = Lists.newArrayList();
    // list.add(d1);
    // list.add(d2);
    // list.add(d3);
    //
    // TopDocs result = SearchResultHelper.getIntersection(list);
    //
    // assertEquals(2, result.scoreDocs.length);
    // assertEquals(3, result.scoreDocs[0].doc);
    // assertEquals(4, result.scoreDocs[1].doc);
    // }
}
