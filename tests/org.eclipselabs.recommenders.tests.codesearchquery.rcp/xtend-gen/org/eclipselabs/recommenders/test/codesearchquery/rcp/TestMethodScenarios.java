package org.eclipselabs.recommenders.test.codesearchquery.rcp;

import java.util.ArrayList;
import java.util.List;
import org.apache.lucene.document.Document;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ParameterCountIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ParameterTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnVariableExpressionIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex;
import org.eclipselabs.recommenders.test.codesearchquery.rcp.TestBase;
import org.junit.Test;

@SuppressWarnings("all")
public class TestMethodScenarios extends TestBase {
  @Test
  public void testReturnTypeIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public List testReturnSomething() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ReturnTypeIndexer _returnTypeIndexer = new ReturnTypeIndexer();
      LuceneIndex _exercise = this.exercise(code, _returnTypeIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.RETURN_TYPE, "Ljava/util/List");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testParameterTypesIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void testSomething(List a) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ParameterTypesIndexer _parameterTypesIndexer = new ParameterTypesIndexer();
      LuceneIndex _exercise = this.exercise(code, _parameterTypesIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.PARAMETER_TYPES, "Ljava/util/List");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testParameterCountIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void testSomething(List a) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ParameterCountIndexer _parameterCountIndexer = new ParameterCountIndexer();
      LuceneIndex _exercise = this.exercise(code, _parameterCountIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.PARAMETER_COUNT, "1");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testParameterCountIndexer02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void testSomething(List a, String b) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ParameterCountIndexer _parameterCountIndexer = new ParameterCountIndexer();
      LuceneIndex _exercise = this.exercise(code, _parameterCountIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.PARAMETER_COUNT, "2");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testReturnVariableExpressionsIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public List testReturnNames() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("List names = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return names;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ReturnVariableExpressionIndexer _returnVariableExpressionIndexer = new ReturnVariableExpressionIndexer();
      LuceneIndex _exercise = this.exercise(code, _returnVariableExpressionIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.RETURN_VARIABLE_EXPRESSIONS, "names");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testReturnVariableExpressionsIndexer02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public List testReturnNames(boolean value) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("List names1 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("List names2 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if(value) { return names1; }");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("else { return names2;}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ReturnVariableExpressionIndexer _returnVariableExpressionIndexer = new ReturnVariableExpressionIndexer();
      LuceneIndex _exercise = this.exercise(code, _returnVariableExpressionIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.RETURN_VARIABLE_EXPRESSIONS, "names1");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_1 = this.s(Fields.RETURN_VARIABLE_EXPRESSIONS, "names2");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s_1);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents_1, _l_1);
  }
  
  @Test
  public void testReturnVariableExpressionsIndexer03() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public List testReturnNames() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ReturnVariableExpressionIndexer _returnVariableExpressionIndexer = new ReturnVariableExpressionIndexer();
      LuceneIndex _exercise = this.exercise(code, _returnVariableExpressionIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.RETURN_VARIABLE_EXPRESSIONS, "null");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
}