package org.eclipselabs.recommenders.test.codesearchquery.rcp.indexer;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipselabs.recommenders.codesearchquery.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllDeclaredMethodNamesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllExtendedTypesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.AllImplementedInterfacesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredMethodNamesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DeclaredMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.DocumentTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ExtendedTypeIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.ImplementedInterfacesIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.OverriddenMethodsIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.test.codesearchquery.rcp.indexer.TestBase;
import org.junit.Test;

@SuppressWarnings("all")
public class TestClassScenarios extends TestBase {
  @Test
  public void testDeclaredMethodsIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClassXyZ {");
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
      CodeIndexerIndex _exercise = this.exercise(code, _declaredMethodsIndexer);
      CodeIndexerIndex index = _exercise;
      String _s = this.s(Fields.DECLARED_METHODS, "LMyClassXyZ.test()V");
      String _s_1 = this.s(Fields.DECLARED_METHODS, "LMyClassXyZ.foo()V");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList, String.class)));
      this.assertField(index, _l);
  }
  
  @Test
  public void testOverriddenMethodsIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class Clazz {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public String toString() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return super.toString();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      OverriddenMethodsIndexer _overriddenMethodsIndexer = new OverriddenMethodsIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_documentTypeIndexer, _overriddenMethodsIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      CodeIndexerIndex _exercise = this.exercise(code, _i);
      CodeIndexerIndex index = _exercise;
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.OVERRIDDEN_METHODS, "Ljava/lang/Object.toString()Ljava/lang/String;");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(index, _l);
  }
  
  @Test
  public void testExtendedTypeIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.io.IOException;");
      _builder.newLine();
      _builder.append("public class MyException extends IOException {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ExtendedTypeIndexer _extendedTypeIndexer = new ExtendedTypeIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_documentTypeIndexer, _extendedTypeIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      CodeIndexerIndex _exercise = this.exercise(code, _i);
      CodeIndexerIndex index = _exercise;
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.EXTENDED_TYPE, "Ljava/io/IOException");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(index, _l);
  }
  
  @Test
  public void testAllExtendedTypesIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.io.IOException;");
      _builder.newLine();
      _builder.append("public class MyException extends IOException {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      AllExtendedTypesIndexer _allExtendedTypesIndexer = new AllExtendedTypesIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_documentTypeIndexer, _allExtendedTypesIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      CodeIndexerIndex _exercise = this.exercise(code, _i);
      CodeIndexerIndex index = _exercise;
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.ALL_EXTENDED_TYPES, "Ljava/io/IOException");
      String _s_2 = this.s(Fields.ALL_EXTENDED_TYPES, "Ljava/lang/Exception");
      String _s_3 = this.s(Fields.ALL_EXTENDED_TYPES, "Ljava/lang/Throwable");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1, _s_2, _s_3);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(index, _l);
  }
  
  @Test
  public void testImplementedInterfacesIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.io.Externalizable;");
      _builder.newLine();
      _builder.append("public class MyInterface implements Externalizable {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      ImplementedInterfacesIndexer _implementedInterfacesIndexer = new ImplementedInterfacesIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_documentTypeIndexer, _implementedInterfacesIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      CodeIndexerIndex _exercise = this.exercise(code, _i);
      CodeIndexerIndex index = _exercise;
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.IMPLEMENTED_TYPES, "Ljava/io/Externalizable");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(index, _l);
  }
  
  @Test
  public void testAllImplementedInterfacesIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.io.Externalizable;");
      _builder.newLine();
      _builder.append("public class MyInterface implements Externalizable {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      AllImplementedInterfacesIndexer _allImplementedInterfacesIndexer = new AllImplementedInterfacesIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_documentTypeIndexer, _allImplementedInterfacesIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      CodeIndexerIndex _exercise = this.exercise(code, _i);
      CodeIndexerIndex index = _exercise;
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.ALL_IMPLEMENTED_TYPES, "Ljava/io/Externalizable");
      String _s_2 = this.s(Fields.ALL_IMPLEMENTED_TYPES, "Ljava/io/Serializable");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1, _s_2);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(index, _l);
  }
  
  @Test
  public void testDeclaredMethodNamesIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class Clazz {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void method01() {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private void method02() {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected void method03() {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      DeclaredMethodNamesIndexer _declaredMethodNamesIndexer = new DeclaredMethodNamesIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_documentTypeIndexer, _declaredMethodNamesIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      CodeIndexerIndex _exercise = this.exercise(code, _i);
      CodeIndexerIndex index = _exercise;
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.DECLARED_METHODS_NAMES, "method01");
      String _s_2 = this.s(Fields.DECLARED_METHODS_NAMES, "method02");
      String _s_3 = this.s(Fields.DECLARED_METHODS_NAMES, "method03");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1, _s_2, _s_3);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(index, _l);
  }
  
  @Test
  public void testAllMethodNamesIndexer() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.io.IOException;");
      _builder.newLine();
      _builder.append("public class MyOtherException extends IOException {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void method01() {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private void method02() {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected void method03() {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      AllDeclaredMethodNamesIndexer _allDeclaredMethodNamesIndexer = new AllDeclaredMethodNamesIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_documentTypeIndexer, _allDeclaredMethodNamesIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      CodeIndexerIndex _exercise = this.exercise(code, _i);
      CodeIndexerIndex index = _exercise;
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.ALL_DELCARED_METHOD_NAMES, "method01");
      String _s_2 = this.s(Fields.ALL_DELCARED_METHOD_NAMES, "method02");
      String _s_3 = this.s(Fields.ALL_DELCARED_METHOD_NAMES, "method03");
      String _s_4 = this.s(Fields.ALL_DELCARED_METHOD_NAMES, "getMessage");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1, _s_2, _s_3, _s_4);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertField(index, _l);
  }
  
  @Test
  public void testAllMethodNamesIndexer02() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.io.IOException;");
      _builder.newLine();
      _builder.append("public class MyOtherException extends IOException {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void method01() {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private void method02() {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected void method03() {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final CharSequence code = _builder;
      DocumentTypeIndexer _documentTypeIndexer = new DocumentTypeIndexer();
      DeclaredMethodNamesIndexer _declaredMethodNamesIndexer = new DeclaredMethodNamesIndexer();
      ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(_documentTypeIndexer, _declaredMethodNamesIndexer);
      List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
      CodeIndexerIndex _exercise = this.exercise(code, _i);
      CodeIndexerIndex index = _exercise;
      String _s = this.s(Fields.TYPE, Fields.TYPE_CLASS);
      String _s_1 = this.s(Fields.ALL_DELCARED_METHOD_NAMES, "getMessage");
      ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList(_s, _s_1);
      List<String> _l = this.l(((String[])Conversions.unwrapArray(_newArrayList_1, String.class)));
      this.assertNotField(index, _l);
  }
}