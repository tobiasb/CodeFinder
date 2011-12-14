package org.eclipselabs.recommenders.test.codesearchquery.rcp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Fieldable;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.store.RAMDirectory;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.recommenders.tests.jdt.JavaProjectFixture;
import org.eclipse.recommenders.utils.Tuple;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaringTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FriendlyNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.FullyQualifiedNameIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ReturnTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.UsedTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.CompilationUnitVisitor;
import org.junit.Test;

@SuppressWarnings("all")
public class Scenarios {
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
  public void testUniqueIdentifierNameIndexer() {
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
      String _s = this.s(Fields.FULLY_QUALIFIED_NAME, "L/MyClass");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testUniqueIdentifierNameIndexer02() {
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
      String _s = this.s(Fields.FULLY_QUALIFIED_NAME, "L/MyClass.test()V");
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
      String _s = this.s(Fields.TYPE, "class");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
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
      String _s = this.s(Fields.TYPE, "class");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_1 = this.s(Fields.TYPE, "method");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s_1);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents_1, _l_1);
  }
  
  @Test
  public void testReturnTypeIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class MyClass {");
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
      String _s = this.s(Fields.TYPE, "class");
      String _s_1 = this.s(Fields.USED_TYPES, "Ljava/util/Map");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
      List<Document> _documents_1 = index.getDocuments();
      String _s_2 = this.s(Fields.TYPE, "method");
      String _s_3 = this.s(Fields.USED_TYPES, "Ljava/util/List");
      ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList(_s_2, _s_3);
      List<String> _l_1 = this.l(((String[])Conversions.unwrapArray(_newArrayList_2, String.class)));
      this.assertField(_documents_1, _l_1);
  }
  
  @Test
  public void testDeclaredMethodsIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void test() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
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
      DeclaredMethodsIndexer _declaredMethodsIndexer = new DeclaredMethodsIndexer();
      LuceneIndex _exercise = this.exercise(code, _declaredMethodsIndexer);
      LuceneIndex index = _exercise;
      List<Document> _documents = index.getDocuments();
      String _s = this.s(Fields.DECLARED_METHODS, "L/MyClass.test()V");
      String _s_1 = this.s(Fields.DECLARED_METHODS, "L/MyClass.foo()V");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testDeclaringTypesIndexerMethod() {
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
      String _s_1 = this.s(Fields.DECLARING_TYPES, "L/MyClass");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testDeclaringTypesIndexerField() {
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
      String _s_1 = this.s(Fields.DECLARING_TYPES, "L/MyClass");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  @Test
  public void testDeclaringTypesIndexerType() {
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
      String _s = this.s(Fields.FRIENDLY_NAME, "SubClass");
      String _s_1 = this.s(Fields.DECLARING_TYPES, "L/MyClass");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_documents, _l);
  }
  
  public ASTNode parse(final ICompilationUnit unit) {
    ASTNode _xblockexpression = null;
    {
      ASTParser _newParser = ASTParser.newParser(AST.JLS3);
      ASTParser parser = _newParser;
      parser.setKind(ASTParser.K_COMPILATION_UNIT);
      parser.setSource(unit);
      parser.setResolveBindings(true);
      ASTNode _createAST = parser.createAST(null);
      _xblockexpression = (_createAST);
    }
    return _xblockexpression;
  }
  
  public void assertNumDocs(final IndexReader reader, final int expectedNum) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("The number of documents is not correct. Is [");
    int _numDocs = reader.numDocs();
    _builder.append(_numDocs, "");
    _builder.append("] but should be [");
    _builder.append(expectedNum, "");
    _builder.append("]");
    String _string = _builder.toString();
    int _numDocs_1 = reader.numDocs();
    boolean _equals = Integer.valueOf(_numDocs_1).equals(Integer.valueOf(expectedNum));
    Assert.assertTrue(_string, _equals);
  }
  
  public boolean assertField(final List<Document> documents, final List<String> expected) {
      for (final Document document : documents) {
        {
          boolean foundInDocument = true;
          for (final String exp : expected) {
            {
              boolean found = false;
              List<Fieldable> _fields = document.getFields();
              for (final Fieldable field : _fields) {
                String _name = field.name();
                String _stringValue = field.stringValue();
                String _s = this.s(_name, _stringValue);
                boolean _equals = _s.equals(exp);
                if (_equals) {
                  found = true;
                }
              }
              boolean _operator_not = BooleanExtensions.operator_not(found);
              if (_operator_not) {
                foundInDocument = false;
              }
            }
          }
          if (foundInDocument) {
            return true;
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("There was no document with ");
      final List<String> _typeConverted_expected = (List<String>)expected;
      String _c = this.c(((String[])Conversions.unwrapArray(_typeConverted_expected, String.class)));
      _builder.append(_c, "");
      String _string = _builder.toString();
      Assert.assertTrue(_string, false);
      return false;
  }
  
  public String s(final String name, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(name, "");
    _builder.append("=");
    _builder.append(value, "");
    String _string = _builder.toString();
    return _string;
  }
  
  public LuceneIndex exercise(final CharSequence code, final List<IIndexer> indexer) {
    try {
      {
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        JavaProjectFixture _javaProjectFixture = new JavaProjectFixture(_workspace, "test");
        final JavaProjectFixture fixture = _javaProjectFixture;
        String _string = code.toString();
        Tuple<ICompilationUnit,Set<Integer>> _createFileAndParseWithMarkers = fixture.createFileAndParseWithMarkers(_string, "MyClass.java");
        final Tuple<ICompilationUnit,Set<Integer>> struct = _createFileAndParseWithMarkers;
        ICompilationUnit _first = struct.getFirst();
        final ICompilationUnit cu = _first;
        RAMDirectory _rAMDirectory = new RAMDirectory();
        LuceneIndex _luceneIndex = new LuceneIndex(_rAMDirectory);
        LuceneIndex index = _luceneIndex;
        CompilationUnitVisitor _compilationUnitVisitor = new CompilationUnitVisitor(index);
        CompilationUnitVisitor visitor = _compilationUnitVisitor;
        visitor.addIndexer(indexer);
        ASTNode _parse = this.parse(cu);
        ASTNode cuParsed = _parse;
        cuParsed.accept(visitor);
        return index;
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public LuceneIndex exercise(final CharSequence code, final IIndexer indexer) {
    ArrayList<IIndexer> _newArrayList = CollectionLiterals.<IIndexer>newArrayList(indexer);
    List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
    LuceneIndex _exercise = this.exercise(code, _i);
    return _exercise;
  }
  
  public String c(final String[] items) {
    String _concatWith = StringUtils.concatWith(", ", items);
    return _concatWith;
  }
  
  public List<String> l(final String[] items) {
    return ((List<String>) ((List<String>)Conversions.doWrapArray(items)));
  }
  
  public List<IIndexer> i(final IIndexer[] items) {
    return ((List<IIndexer>) ((List<IIndexer>)Conversions.doWrapArray(items)));
  }
}
