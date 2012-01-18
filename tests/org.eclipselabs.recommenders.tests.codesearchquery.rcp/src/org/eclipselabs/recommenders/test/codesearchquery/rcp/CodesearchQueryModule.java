package org.eclipselabs.recommenders.test.codesearchquery.rcp;


import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class CodesearchQueryModule extends AbstractModule {

    public static Injector injector = Guice.createInjector(new CodesearchQueryModule());
    
    public static CodeIndexerIndex getIndex() {
        return injector.getInstance(CodeIndexerIndex.class);
    }
    
    @Override
    protected void configure() {
        try {
            Analyzer a = new StandardAnalyzer(Version.LUCENE_35);
            
            bind(Analyzer.class).toInstance(a);
            bind(Directory.class).toInstance(new RAMDirectory());
            bind(QueryParser.class).toInstance(new QueryParser(Version.LUCENE_35, Fields.FULLY_QUALIFIED_NAME, a));
            //bind(Directory.class).toInstance(new RAMDirectory());
        } catch(Exception ex) {
            ex.printStackTrace();//TODO: refactor
        }
    }
}
