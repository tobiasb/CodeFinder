package org.eclipselabs.recommenders.codesearchquery.rcp;


import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.Activator;

import com.google.inject.AbstractModule;

public class CodesearchQueryModule extends AbstractModule {

    @Override
    protected void configure() {
        try {
            Analyzer a = new StandardAnalyzer(Version.LUCENE_29);
            
            bind(Analyzer.class).toInstance(a);
            bind(QueryParser.class).toInstance(new QueryParser(Version.LUCENE_29, Fields.FULLY_QUALIFIED_NAME, a));
            //bind(Directory.class).toInstance(new SimpleFSDirectory(new File("d:/index.l")));
            bind(Directory.class).toInstance(new RAMDirectory());
        } catch(Exception ex) {
                Activator.logError(ex, null);
        }
    }

}
