package org.eclipselabs.recommenders.test.codesearch.rcp.indexer.analyzer;

import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.LowerCaseFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.apache.lucene.util.Version;
import org.eclipse.recommenders.codesearch.rcp.index.tokenizers.CamelCaseTokenizer;
import org.eclipse.recommenders.codesearch.rcp.index.tokenizers.DotSplitTokenizer;
import org.eclipse.recommenders.codesearch.rcp.index.tokenizers.WordSplitTokenizer;
import org.junit.Test;

public class TokenizerTest extends AnalysisTestBase {

    @Test
    public void testTokenizersDotNotation() {
        final String originalTerm = "org.eclipse.ui.IActionBars";

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new StandardTokenizer(Version.LUCENE_35, reader);
            }
        }, originalTerm, new String[] { "org.eclipse.ui.IActionBars" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new WordSplitTokenizer(new StandardTokenizer(Version.LUCENE_35, reader));
            }
        }, originalTerm, new String[] { "org.eclipse.ui.IActionBars" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new DotSplitTokenizer(new WordSplitTokenizer(new StandardTokenizer(Version.LUCENE_35, reader)));
            }
        }, originalTerm, new String[] { "org", "eclipse", "ui", "IActionBars" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new CamelCaseTokenizer(new DotSplitTokenizer(new WordSplitTokenizer(new StandardTokenizer(
                        Version.LUCENE_35, reader))));
            }
        }, originalTerm, new String[] { "org", "eclipse", "ui", "I", "Action", "Bars" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new LowerCaseFilter(new CamelCaseTokenizer(new DotSplitTokenizer(new WordSplitTokenizer(
                        new StandardTokenizer(Version.LUCENE_35, reader)))));
            }
        }, originalTerm, new String[] { "org", "eclipse", "ui", "i", "action", "bars" });
    }

    @Test
    public void testTokenizersNaturalLanguage() {
        final String originalTerm = "The brown fox FireFox. He walked&jumped!";

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new StandardTokenizer(Version.LUCENE_35, reader);
            }
        }, originalTerm, new String[] { "The", "brown", "fox", "FireFox", "He", "walked&jumped" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new WordSplitTokenizer(new StandardTokenizer(Version.LUCENE_35, reader));
            }
        }, originalTerm, new String[] { "The", "brown", "fox", "FireFox", "He", "jumped" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new DotSplitTokenizer(new WordSplitTokenizer(new StandardTokenizer(Version.LUCENE_35, reader)));
            }
        }, originalTerm, new String[] { "The", "brown", "fox", "FireFox", "He", "jumped" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new CamelCaseTokenizer(new DotSplitTokenizer(new WordSplitTokenizer(new StandardTokenizer(
                        Version.LUCENE_35, reader))));
            }
        }, originalTerm, new String[] { "The", "brown", "fox", "Fire", "Fox", "He", "jumped" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new LowerCaseFilter(new CamelCaseTokenizer(new DotSplitTokenizer(new WordSplitTokenizer(
                        new StandardTokenizer(Version.LUCENE_35, reader)))));
            }
        }, originalTerm, new String[] { "the", "brown", "fox", "fire", "fox", "he", "jumped" });
    }
}
