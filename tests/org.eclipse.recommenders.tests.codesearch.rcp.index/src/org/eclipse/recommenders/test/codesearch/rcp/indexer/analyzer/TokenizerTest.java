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

package org.eclipse.recommenders.test.codesearch.rcp.indexer.analyzer;

import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.LowerCaseFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.apache.lucene.util.Version;
import org.eclipse.recommenders.codesearch.rcp.index.tokenizers.CamelCaseTokenizer;
import org.eclipse.recommenders.codesearch.rcp.index.tokenizers.DotSplitTokenizer;
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
                return new DotSplitTokenizer(new StandardTokenizer(Version.LUCENE_35, reader));
            }
        }, originalTerm, new String[] { "org", "eclipse", "ui", "IActionBars" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new CamelCaseTokenizer(new DotSplitTokenizer(new StandardTokenizer(
                        Version.LUCENE_35, reader)));
            }
        }, originalTerm, new String[] { "org", "eclipse", "ui", "I", "Action", "Bars" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new LowerCaseFilter(new CamelCaseTokenizer(new DotSplitTokenizer(
                        new StandardTokenizer(Version.LUCENE_35, reader))));
            }
        }, originalTerm, new String[] { "org", "eclipse", "ui", "i", "action", "bars" });
    }

    @Test
    public void testTokenizersResolvedTypeNotation() {
        final String originalTerm = "Lcom/volkswagen/beetle/IgnitionCoil";

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new StandardTokenizer(Version.LUCENE_35, reader);
            }
        }, originalTerm, new String[] { "Lcom", "volkswagen", "beetle", "IgnitionCoil" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new DotSplitTokenizer(new StandardTokenizer(Version.LUCENE_35, reader));
            }
        }, originalTerm, new String[] { "Lcom", "volkswagen", "beetle", "IgnitionCoil" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new CamelCaseTokenizer(new DotSplitTokenizer(new StandardTokenizer(
                        Version.LUCENE_35, reader)));
            }
        }, originalTerm, new String[] { "Lcom", "volkswagen", "beetle", "Ignition", "Coil" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new LowerCaseFilter(new CamelCaseTokenizer(new DotSplitTokenizer(
                        new StandardTokenizer(Version.LUCENE_35, reader))));
            }
        }, originalTerm, new String[] { "lcom", "volkswagen", "beetle", "ignition", "coil" });
    }

    @Test
    public void testTokenizersNaturalLanguage() {
        final String originalTerm = "Where is org.eclipse? Safe&sound I hope!";

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new StandardTokenizer(Version.LUCENE_35, reader);
            }
        }, originalTerm, new String[] { "Where", "is", "org.eclipse", "Safe", "sound", "I", "hope"  });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new DotSplitTokenizer(new StandardTokenizer(Version.LUCENE_35, reader));
            }
        }, originalTerm, new String[] { "Where", "is", "org", "eclipse", "Safe", "sound", "I", "hope" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new CamelCaseTokenizer(new DotSplitTokenizer(new StandardTokenizer(
                        Version.LUCENE_35, reader)));
            }
        }, originalTerm, new String[] { "Where", "is", "org", "eclipse", "Safe", "sound", "I", "hope" });

        testAnalyzer(new Analyzer() {

            @Override
            public TokenStream tokenStream(String fieldName, Reader reader) {
                return new LowerCaseFilter(new CamelCaseTokenizer(new DotSplitTokenizer(
                        new StandardTokenizer(Version.LUCENE_35, reader))));
            }
        }, originalTerm, new String[] { "where", "is", "org", "eclipse", "safe", "sound", "i", "hope" });
    }
}
