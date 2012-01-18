package org.eclipselabs.recommenders.codesearchquery.rcp;


import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.Activator;

import com.google.inject.AbstractModule;

public class CodesearchQueryModule extends AbstractModule {

    @Override
    protected void configure() {
        try {
            //Analyzer a = new KeywordAnalyzer();
            
            //bind(Analyzer.class).toInstance(a);
            //bind(QueryParser.class).toInstance(new QueryParser(Version.LUCENE_29, Fields.FULLY_QUALIFIED_NAME, a));
            //bind(Directory.class).toInstance(new SimpleFSDirectory(new File("d:/index.l")));
            //bind(Directory.class).toInstance(new RAMDirectory());
        } catch(Exception ex) {
                Activator.logError(ex, null);
        }
    }

}
