package org.eclipselabs.recommenders.test.codesearch.rcp.indexer;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CaughtTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DocumentTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedMethodsInFinallyIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedMethodsInTryIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedTypesInFinallyIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedTypesInTryIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IIndexer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipselabs.recommenders.test.codesearch.rcp.indexer.TestBase;
import org.junit.Test;

@SuppressWarnings("all")
public class TestTryCatchScenarios extends TestBase {
  @Test
  public void testUsedTypesInTryIndexer() {
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
      UsedTypesInTryIndexer _usedTypesInTryIndexer = new UsedTypesInTryIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_usedTypesInTryIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      this.exercise(code, _i);
      String _s = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_1 = this.s(Fields.USED_TYPES_IN_TRY, "Ljava/util/Map");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_l);
  }
  
  @Test
  public void testUsedTypesInFinallyIndexer() {
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
      _builder.append("\t\t");
      _builder.append("} finally {");
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
      UsedTypesInFinallyIndexer _usedTypesInFinallyIndexer = new UsedTypesInFinallyIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_usedTypesInFinallyIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      this.exercise(code, _i);
      String _s = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_1 = this.s(Fields.USED_TYPES_IN_FINALLY, "Ljava/util/Map");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_l);
  }
  
  @Test
  public void testCaughtTypeIndexer() {
      StringConcatenation _builder = new StringConcatenation();
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
      _builder.append("\t\t");
      _builder.append("} finally {");
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
      CaughtTypeIndexer _caughtTypeIndexer = new CaughtTypeIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_caughtTypeIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      this.exercise(code, _i);
      String _s = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_1 = this.s(Fields.CAUGHT_TYPE, "Ljava/lang/Exception");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_l);
  }
  
  @Test
  public void testUsedMethodsInTryIndexer() {
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
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("map.put(\"\", \"\");");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} catch(Exception ex) {");
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
      UsedMethodsInTryIndexer _usedMethodsInTryIndexer = new UsedMethodsInTryIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_usedMethodsInTryIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      this.exercise(code, _i);
      String _s = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_1 = this.s(Fields.USED_METHODS_IN_TRY, "Ljava/util/Map.put(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_l);
  }
  
  @Test
  public void testUsedMethodsInFinallyIndexer() {
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
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} catch(Exception ex) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} finally {");
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
      UsedMethodsInFinallyIndexer _usedMethodsInFinallyIndexer = new UsedMethodsInFinallyIndexer();
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_usedMethodsInFinallyIndexer, _documentTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      this.exercise(code, _i);
      String _s = this.s(Fields.TYPE, Fields.TYPE_TRYCATCH);
      String _s_1 = this.s(Fields.USED_METHODS_IN_FINALLY, "Ljava/util/Map.put(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(_l);
  }
}