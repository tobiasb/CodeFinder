package org.eclipselabs.recommenders.test.codesearchquery.rcp;

import java.util.ArrayList;
import java.util.List;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaringTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FriendlyNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FullyQualifiedNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ModifiersIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ProjectNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ResourcePathIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex;
import org.eclipselabs.recommenders.test.codesearchquery.rcp.TestBase;
import org.junit.Test;

@SuppressWarnings("all")
public class TestGeneralScenarios extends TestBase {
  @Test
  public void testDocumentCounts() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      FriendlyNameIndexer _friendlyNameIndexer = new FriendlyNameIndexer();
      LuceneIndex _exercise = this.exercise(code, _friendlyNameIndexer);
      LuceneIndex index = _exercise;
      IndexReader _reader = index.getReader();
      this.assertNumDocs(_reader, 1);
  }
  
  @Test
  public void testDocumentCounts02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void test() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      FriendlyNameIndexer _friendlyNameIndexer = new FriendlyNameIndexer();
      LuceneIndex _exercise = this.exercise(code, _friendlyNameIndexer);
      LuceneIndex index = _exercise;
      IndexReader _reader = index.getReader();
      this.assertNumDocs(_reader, 2);
  }
  
  @Test
  public void testDocumentCounts03() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class MyClass {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Map map;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public List test() {");
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
      FriendlyNameIndexer _friendlyNameIndexer = new FriendlyNameIndexer();
      LuceneIndex _exercise = this.exercise(code, _friendlyNameIndexer);
      LuceneIndex index = _exercise;
      IndexReader _reader = index.getReader();
      this.assertNumDocs(_reader, 3);
  }
  
  @Test
  public void testFriendlyNameIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      FriendlyNameIndexer _friendlyNameIndexer = new FriendlyNameIndexer();
      LuceneIndex _exercise = this.exercise(code, _friendlyNameIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.FRIENDLY_NAME, "MyClass");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testFriendlyNameIndexer02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void test() {}");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      FriendlyNameIndexer _friendlyNameIndexer = new FriendlyNameIndexer();
      LuceneIndex _exercise = this.exercise(code, _friendlyNameIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.FRIENDLY_NAME, "test");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testFriendlyNameIndexer03() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Map map;");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      FriendlyNameIndexer _friendlyNameIndexer = new FriendlyNameIndexer();
      LuceneIndex _exercise = this.exercise(code, _friendlyNameIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.FRIENDLY_NAME, "map");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testFullyQualifiedNameIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      FullyQualifiedNameIndexer _fullyQualifiedNameIndexer = new FullyQualifiedNameIndexer();
      LuceneIndex _exercise = this.exercise(code, _fullyQualifiedNameIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.FULLY_QUALIFIED_NAME, "LMyClass");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testFullyQualifiedNameIndexer02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void test() {}");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      FullyQualifiedNameIndexer _fullyQualifiedNameIndexer = new FullyQualifiedNameIndexer();
      LuceneIndex _exercise = this.exercise(code, _fullyQualifiedNameIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.FULLY_QUALIFIED_NAME, "LMyClass.test()V");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testFullyQualifiedNameIndexer03() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Map mapInstance;");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      FullyQualifiedNameIndexer _fullyQualifiedNameIndexer = new FullyQualifiedNameIndexer();
      LuceneIndex _exercise = this.exercise(code, _fullyQualifiedNameIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.FULLY_QUALIFIED_NAME, "LMyClass.mapInstance");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testDocumentTypeIndexerClassOnly() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      LuceneIndex _exercise = this.exercise(code, _documentTypeIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testDocumentTypeIndexerClassAndField() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Map map;");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      LuceneIndex _exercise = this.exercise(code, _documentTypeIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_1 = this.s(Fields.TYPE, Fields.TYPE_FIELD);
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s_1);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents_1, _l_1);
  }
  
  @Test
  public void testDocumentTypeIndexerClassAndMethod() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void test() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      LuceneIndex _exercise = this.exercise(code, _documentTypeIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_1 = this.s(Fields.TYPE, Fields.TYPE_METHOD);
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s_1);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents_1, _l_1);
  }
  
  @Test
  public void testDocumentTypeIndexerClassMethodAndTryCatch() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class MyClass {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void test() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Map map;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if(map != null) { throw new Exception(); }");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} catch(Exception ex) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
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
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      LuceneIndex _exercise = this.exercise(code, _documentTypeIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_1 = this.s(Fields.TYPE, Fields.TYPE_METHOD);
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s_1);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents_1, _l_1);
      List<Document> _documents_2 = index.getDocuments();
      String _s_2 = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList(_s_2);
      List<String> _l_2 = this.l(((String[])Conversions.unwrapArray(_newArrayList_2, String.class)));
      this.assertField(_documents_2, _l_2);
  }
  
  @Test
  public void testUsedTypesIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class MyClass {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Map map;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      UsedTypesIndexer _usedTypesIndexer = new UsedTypesIndexer();
      LuceneIndex _exercise = this.exercise(code, _usedTypesIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.USED_TYPES, "Ljava/util/Map");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testUsedTypesIndexer02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class MyClass {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Map map;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public List test() {");
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
      UsedTypesIndexer _usedTypesIndexer = new UsedTypesIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_usedTypesIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.USED_TYPES, "Ljava/util/Map");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_2 = this.s(Fields.TYPE, Fields.TYPE_METHOD);
      String _s_3 = this.s(Fields.USED_TYPES, "Ljava/util/List");
      ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList(_s_2, _s_3);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_2, String.class)));
      this.assertField(_documents_1, _l_1);
  }
  
  @Test
  public void testUsedTypesIndexer03() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class MyClass {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void test() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} catch(Exception ex) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Map map;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
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
      UsedTypesIndexer _usedTypesIndexer = new UsedTypesIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_usedTypesIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.USED_TYPES, "Ljava/util/Map");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_2 = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_3 = this.s(Fields.USED_TYPES, "Ljava/util/Map");
      ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList(_s_2, _s_3);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_2, String.class)));
      this.assertField(_documents_1, _l_1);
  }
  
  @Test
  public void testUsedMethodsIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class MyClass {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public List test() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Map<String, String> map;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("map.put(\"\", \"\");");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      UsedMethodsIndexer _usedMethodsIndexer = new UsedMethodsIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_usedMethodsIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_2 = this.s(Fields.TYPE, Fields.TYPE_METHOD);
      String _s_3 = this.s(Fields.USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;");
      ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList(_s_2, _s_3);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_2, String.class)));
      this.assertField(_documents_1, _l_1);
  }
  
  @Test
  public void testUsedMethodsIndexer02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.append("public class MyClass {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public List test() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Map<String, String> map;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} catch(Exception ex) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("map.put(\"\", \"\");");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      UsedMethodsIndexer _usedMethodsIndexer = new UsedMethodsIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_usedMethodsIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_2 = this.s(Fields.TYPE, Fields.TYPE_METHOD);
      String _s_3 = this.s(Fields.USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;");
      ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList(_s_2, _s_3);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_2, String.class)));
      this.assertField(_documents_1, _l_1);
      List<Document> _documents_2 = index.getDocuments();
      String _s_4 = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_5 = this.s(Fields.USED_METHODS, "Ljava/util/Map.put(LK;LV;)LV;");
      ArrayList<String> _newArrayList_3 = CollectionLiterals.<String>newArrayList(_s_4, _s_5);
      List<String> _l_2 = this.l(((String[])Conversions.unwrapArray(_newArrayList_3, String.class)));
      this.assertField(_documents_2, _l_2);
  }
  
  @Test
  public void testDeclaringTypeIndexerMethod() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void foo() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      FriendlyNameIndexer _friendlyNameIndexer = new FriendlyNameIndexer();
      DeclaringTypeIndexer _declaringTypeIndexer = new DeclaringTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_friendlyNameIndexer, _declaringTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.FRIENDLY_NAME, "foo");
      String _s_1 = this.s(Fields.DECLARING_TYPE, "LMyClass");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testDeclaringTypeIndexerField() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Map map;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      FriendlyNameIndexer _friendlyNameIndexer = new FriendlyNameIndexer();
      DeclaringTypeIndexer _declaringTypeIndexer = new DeclaringTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_friendlyNameIndexer, _declaringTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.FRIENDLY_NAME, "map");
      String _s_1 = this.s(Fields.DECLARING_TYPE, "LMyClass");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testDeclaringTypeIndexerType() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public class SubClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      FriendlyNameIndexer _friendlyNameIndexer = new FriendlyNameIndexer();
      DeclaringTypeIndexer _declaringTypeIndexer = new DeclaringTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_friendlyNameIndexer, _declaringTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.FRIENDLY_NAME, "MyClass$SubClass");
      String _s_1 = this.s(Fields.DECLARING_TYPE, "LMyClass");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testDeclaringTypeIndexerTryCatch() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void testMethod123() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("try{} catch(Exception ex){}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      DeclaringTypeIndexer _declaringTypeIndexer = new DeclaringTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_documentTypeIndexer, _declaringTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_1 = this.s(Fields.DECLARING_TYPE, "LMyClass");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testProjectNameIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ProjectNameIndexer _projectNameIndexer = new ProjectNameIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_projectNameIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i, "projectName");
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.PROJECT_NAME, "projectName");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testProjectNameIndexer02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void myMethod() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ProjectNameIndexer _projectNameIndexer = new ProjectNameIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_projectNameIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i, "projectName");
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_METHOD);
      String _s_1 = this.s(Fields.PROJECT_NAME, "projectName");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testProjectNameIndexer03() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyClass test;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ProjectNameIndexer _projectNameIndexer = new ProjectNameIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_projectNameIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i, "projectName");
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_FIELD);
      String _s_1 = this.s(Fields.PROJECT_NAME, "projectName");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testProjectNameIndexer04() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void myMethod() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("try {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("catch(Exception ex) {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ProjectNameIndexer _projectNameIndexer = new ProjectNameIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_projectNameIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i, "projectName");
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_1 = this.s(Fields.PROJECT_NAME, "projectName");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testResourcePathIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ResourcePathIndexer _resourcePathIndexer = new ResourcePathIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_resourcePathIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i, "projectName", "MyClass.java");
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.RESOURCE_PATH, "/projectName/MyClass.java");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testResourcePathIndexer02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void myMethod() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ResourcePathIndexer _resourcePathIndexer = new ResourcePathIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_resourcePathIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i, "projectName", "MyClass.java");
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_METHOD);
      String _s_1 = this.s(Fields.RESOURCE_PATH, "/projectName/MyClass.java");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testResourcePathIndexer03() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MyClass test;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ResourcePathIndexer _resourcePathIndexer = new ResourcePathIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_resourcePathIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i, "projectName", "MyClass.java");
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_FIELD);
      String _s_1 = this.s(Fields.RESOURCE_PATH, "/projectName/MyClass.java");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testResourcePathIndexer04() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void myMethod() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("try {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("catch(Exception ex) {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ResourcePathIndexer _resourcePathIndexer = new ResourcePathIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_resourcePathIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i, "projectName", "MyClass.java");
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_1 = this.s(Fields.RESOURCE_PATH, "/projectName/MyClass.java");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testModifiersIndexerClass() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ModifiersIndexer _modifiersIndexer = new ModifiersIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_modifiersIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.MODIFIERS, "public");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testModifiersIndexerClass02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public abstract class MyClass {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ModifiersIndexer _modifiersIndexer = new ModifiersIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_modifiersIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.MODIFIERS, Fields.MODIFIER_PUBLIC);
      String _s_2 = this.s(Fields.MODIFIERS, Fields.MODIFIER_ABSTRACT);
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1, _s_2);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testModifiersIndexerMethod() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void doSomethingNow123413() {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ModifiersIndexer _modifiersIndexer = new ModifiersIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_modifiersIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_METHOD);
      String _s_1 = this.s(Fields.MODIFIERS, Fields.MODIFIER_PUBLIC);
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testModifiersIndexerMethod02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public abstract class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public static void doSomethingNow123413() {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ModifiersIndexer _modifiersIndexer = new ModifiersIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_modifiersIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_METHOD);
      String _s_1 = this.s(Fields.MODIFIERS, Fields.MODIFIER_PUBLIC);
      String _s_2 = this.s(Fields.MODIFIERS, Fields.MODIFIER_STATIC);
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1, _s_2);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testModifiersIndexerField() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private Map map;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ModifiersIndexer _modifiersIndexer = new ModifiersIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_modifiersIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_FIELD);
      String _s_1 = this.s(Fields.MODIFIERS, Fields.MODIFIER_PRIVATE);
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testModifiersIndexerField02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.append("public final class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected static Map map;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      ModifiersIndexer _modifiersIndexer = new ModifiersIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_modifiersIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      LuceneIndex _exercise = this.exercise(code, _i);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.TYPE, Fields.TYPE_FIELD);
      String _s_1 = this.s(Fields.MODIFIERS, Fields.MODIFIER_PROTECTED);
      String _s_2 = this.s(Fields.MODIFIERS, Fields.MODIFIER_STATIC);
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1, _s_2);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_3 = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_4 = this.s(Fields.MODIFIERS, Fields.MODIFIER_FINAL);
      ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList(_s_3, _s_4);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_2, String.class)));
      this.assertField(_documents_1, _l_1);
  }
}
