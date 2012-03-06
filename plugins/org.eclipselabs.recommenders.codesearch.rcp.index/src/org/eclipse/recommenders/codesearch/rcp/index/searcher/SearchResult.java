/**
 * Copyright (c) 2010, 2011 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Marcel Bruch - initial API and implementation.
 */
package org.eclipse.recommenders.codesearch.rcp.index.searcher;

import java.io.IOException;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;

public class SearchResult {

    public final Query query;
    public final TopDocs docs;
    public final IndexSearcher searcher;

    public SearchResult(final Query query, final TopDocs docs, final IndexSearcher searcher) {
        super();
        this.query = query;
        this.docs = docs;
        this.searcher = searcher;
    }

    public ScoreDoc[] scoreDocs() {
        return docs.scoreDocs;
    }

    public Document scoreDoc(final int index) throws CorruptIndexException, IOException {
        final ScoreDoc scoreDoc = docs.scoreDocs[index];
        return searcher.doc(scoreDoc.doc);
    }
}
