/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */
package org.eclipse.recommenders.test.codesearch.rcp.indexer.analyzer;

import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.LowerCaseFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.apache.lucene.util.Version;
import org.eclipse.recommenders.codesearch.rcp.index.tokenizers.CamelCaseTokenizer;
import org.eclipse.recommenders.codesearch.rcp.index.tokenizers.DotSplitTokenizer;
import org.eclipse.recommenders.codesearch.rcp.index.tokenizers.WordSplitTokenizer;
import org.junit.Ignore;
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
    @Ignore
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
