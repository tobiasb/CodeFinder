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

package org.eclipse.recommenders.codesearch.rcp.searcher;

import java.io.IOException;

import org.apache.lucene.queryParser.ParseException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.extractors.LuceneQueryExtractor;

import com.google.inject.Injector;

public abstract class AbstractQLSearcher {
    abstract SearchResult search(CodeSearcher codeSearcher, IParseResult parseResult) throws IOException,
            ParseException;

    private Injector luceneInjector;
    protected LuceneQueryExtractor luceneQueryExtractor = new LuceneQueryExtractor();

    public AbstractQLSearcher(Injector injector) {
        this.luceneInjector = injector;
    }

    protected String serializeLuceneQuery(EObject o) {

        ISerializer s = luceneInjector.getInstance(ISerializer.class);
        String searchQuery = s.serialize(o);

        return searchQuery;
    }
}
