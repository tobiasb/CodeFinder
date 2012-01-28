package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.analyzer;

import java.io.Reader;
import java.util.Set;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.LowerCaseTokenizer;
import org.apache.lucene.analysis.StopFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.util.Version;
import org.eclipselabs.recommenders.codesearchquery.rcp.Fields;

public class JavaSourceCodeAnalyzer extends Analyzer {

    private Set<Object> javaSourceCodeStopSet;

    public JavaSourceCodeAnalyzer() {
        super();

        javaSourceCodeStopSet = StopFilter.makeStopSet(Version.LUCENE_35, new String[] { Fields.MODIFIER_ABSTRACT,
                Fields.MODIFIER_FINAL, Fields.MODIFIER_PRIVATE, Fields.MODIFIER_PROTECTED, Fields.MODIFIER_PUBLIC,
                Fields.MODIFIER_STATIC, "interface", "implements", "extends", "null", "new", "switch", "case",
                "default", "synchronized", "do", "if", "else", "break", "continue", "this", "assert", "for",
                "instanceof", "transient", "void", "finally", "catch", "return", "throws", "throw", "class", "while",
                "import", "package", "true", "false" });
    }

    @Override
    public TokenStream tokenStream(String fieldName, Reader reader) {
        return new StopFilter(Version.LUCENE_35, new LowerCaseTokenizer(Version.LUCENE_35, reader),
                javaSourceCodeStopSet);
    }
}
