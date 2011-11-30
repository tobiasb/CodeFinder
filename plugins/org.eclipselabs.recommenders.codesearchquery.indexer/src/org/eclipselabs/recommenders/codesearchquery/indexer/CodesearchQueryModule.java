package org.eclipselabs.recommenders.codesearchquery.indexer;


import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;

import com.google.inject.AbstractModule;

public class CodesearchQueryModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Analyzer.class).toInstance(new StandardAnalyzer(Version.LUCENE_30));
        bind(Directory.class).toInstance(new RAMDirectory());
    }

}
