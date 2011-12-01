package org.eclipselabs.recommenders.codesearchquery.indexer;


import java.io.File;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;

import com.google.inject.AbstractModule;

public class CodesearchQueryModule extends AbstractModule {

    @Override
    protected void configure() {
        try {
            Analyzer a = new StandardAnalyzer(Version.LUCENE_30);
            
            bind(Analyzer.class).toInstance(a);
            bind(Directory.class).toInstance(new SimpleFSDirectory(new File("o:/index.l")));
            bind(QueryParser.class).toInstance(new QueryParser(Version.LUCENE_30, Fields.ID, a));
            //bind(Directory.class).toInstance(new RAMDirectory());
        } catch(Exception ex) {
                Activator.logError(ex, null);
        }
    }

}
