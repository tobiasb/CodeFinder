package org.eclipselabs.recommenders.codesearchquery.rcp;


import java.io.File;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.apache.lucene.util.Version;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.Activator;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;

import com.google.inject.AbstractModule;

public class CodesearchQueryModule extends AbstractModule {

    @Override
    protected void configure() {
        try {
            Analyzer a = new StandardAnalyzer(Version.LUCENE_30);
            
            bind(Analyzer.class).toInstance(a);
            bind(Directory.class).toInstance(new SimpleFSDirectory(new File("d:/index.l")));
            bind(QueryParser.class).toInstance(new QueryParser(Version.LUCENE_30, Fields.FULLY_QUALIFIED_NAME, a));
            //bind(Directory.class).toInstance(new RAMDirectory());
        } catch(Exception ex) {
                Activator.logError(ex, null);
        }
    }

}
