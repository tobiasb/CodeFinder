package org.eclipse.recommenders.codesearch.rcp.searcher;

import java.io.IOException;

import org.apache.lucene.queryParser.ParseException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.SearchResult;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.serializer.ISerializer;

import com.google.inject.Injector;

public abstract class AbstractQLSearcher {
    abstract SearchResult search(CodeSearcher codeSearcher, IParseResult parseResult) throws IOException,
            ParseException;

    private Injector luceneInjector;

    public AbstractQLSearcher(Injector injector) {
        this.luceneInjector = injector;
    }

    protected String serializeLuceneQuery(EObject o) {

        ISerializer s = luceneInjector.getInstance(ISerializer.class);
        String searchQuery = s.serialize(o);

        return searchQuery;
    }
}
