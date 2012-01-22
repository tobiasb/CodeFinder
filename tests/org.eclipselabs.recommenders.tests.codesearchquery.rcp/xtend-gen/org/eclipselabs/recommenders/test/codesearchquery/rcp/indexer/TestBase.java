package org.eclipselabs.recommenders.test.codesearchquery.rcp.indexer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Fieldable;
import org.apache.lucene.store.Directory;
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
import org.eclipselabs.recommenders.codesearchquery.AbstractIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.CodeIndexerIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.interfaces.IIndexer;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.CompilationUnitVisitor;
import org.eclipselabs.recommenders.codesearchquery.rcp.searcher.CodeSearcherIndex;
import org.eclipselabs.recommenders.test.codesearchquery.rcp.indexer.AbstractTestBase;
import org.junit.Ignore;

@SuppressWarnings("all")
@Ignore("to make maven happy: All files that start or end with Test are executed per default. If no tests are found the build is failed...")
public class TestBase extends AbstractTestBase {
  public static ASTNode parse(final ICompilationUnit unit) {
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
  
  public void assertNumDocs(final AbstractIndex index, final int expectedNum) {
    try {
      {
        Directory _index = index.getIndex();
        CodeSearcherIndex _codeSearcherIndex = new CodeSearcherIndex(_index);
        CodeSearcherIndex readIndex = _codeSearcherIndex;
        List<Document> _documents = readIndex.getDocuments();
        int _size = _documents.size();
        int numDocs = _size;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The number of documents is not correct. Is [");
        _builder.append(numDocs, "");
        _builder.append("] but should be [");
        _builder.append(expectedNum, "");
        _builder.append("]");
        String _string = _builder.toString();
        boolean _equals = Integer.valueOf(numDocs).equals(Integer.valueOf(expectedNum));
        Assert.assertTrue(_string, _equals);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean assertField(final AbstractIndex index, final List<String> expected) {
    try {
      {
        Directory _index = index.getIndex();
        CodeSearcherIndex _codeSearcherIndex = new CodeSearcherIndex(_index);
        CodeSearcherIndex readIndex = _codeSearcherIndex;
        List<Document> _documents = readIndex.getDocuments();
        for (final Document document : _documents) {
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
        _builder.append(expected, "");
        String _string = _builder.toString();
        Assert.assertTrue(_string, false);
        return false;
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean assertFieldStartsWith(final AbstractIndex index, final List<String> expected) {
    try {
      {
        Directory _index = index.getIndex();
        CodeSearcherIndex _codeSearcherIndex = new CodeSearcherIndex(_index);
        CodeSearcherIndex readIndex = _codeSearcherIndex;
        List<Document> _documents = readIndex.getDocuments();
        for (final Document document : _documents) {
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
                  boolean _startsWith = _s.startsWith(exp);
                  if (_startsWith) {
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
        _builder.append("There was no document with (startswith) ");
        _builder.append(expected, "");
        String _string = _builder.toString();
        Assert.assertTrue(_string, false);
        return false;
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void assertNotField(final AbstractIndex index, final List<String> expected) {
    try {
      {
        Directory _index = index.getIndex();
        CodeSearcherIndex _codeSearcherIndex = new CodeSearcherIndex(_index);
        CodeSearcherIndex readIndex = _codeSearcherIndex;
        List<Document> _documents = readIndex.getDocuments();
        for (final Document document : _documents) {
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
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("There was a document with ");
              _builder.append(expected, "");
              String _string = _builder.toString();
              Assert.assertTrue(_string, false);
            }
          }
        }
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String s(final String name, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(name, "");
    _builder.append("=");
    _builder.append(value, "");
    String _string = _builder.toString();
    return _string;
  }
  
  public CodeIndexerIndex exercise(final CharSequence code, final List<IIndexer> indexer) {
    CodeIndexerIndex _exercise = this.exercise(code, indexer, "test");
    return _exercise;
  }
  
  public CodeIndexerIndex exercise(final CharSequence code, final List<IIndexer> indexer, final String projectName) {
    CodeIndexerIndex _exercise = this.exercise(code, indexer, projectName, "MyClass.java");
    return _exercise;
  }
  
  public CodeIndexerIndex exercise(final CharSequence code, final List<IIndexer> indexer, final String projectName, final String fileName) {
    CodeIndexerIndex _exercise = this.exercise(code, null, null, indexer, projectName, fileName);
    return _exercise;
  }
  
  public CodeIndexerIndex exercise(final CharSequence code1, final CharSequence code2, final CharSequence code3, final List<IIndexer> indexer, final String projectName, final String fileName) {
    try {
      {
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        JavaProjectFixture _javaProjectFixture = new JavaProjectFixture(_workspace, projectName);
        final JavaProjectFixture fixture = _javaProjectFixture;
        String _string = code1.toString();
        Tuple<ICompilationUnit,Set<Integer>> _createFileAndParseWithMarkers = fixture.createFileAndParseWithMarkers(_string, fileName);
        final Tuple<ICompilationUnit,Set<Integer>> struct = _createFileAndParseWithMarkers;
        ICompilationUnit _first = struct.getFirst();
        final ICompilationUnit cu = _first;
        ASTNode _parse = TestBase.parse(cu);
        ASTNode cuParsed = _parse;
        RAMDirectory _rAMDirectory = new RAMDirectory();
        CodeIndexerIndex _codeIndexerIndex = new CodeIndexerIndex(_rAMDirectory);
        CodeIndexerIndex index = _codeIndexerIndex;
        CompilationUnitVisitor _compilationUnitVisitor = new CompilationUnitVisitor(index);
        CompilationUnitVisitor visitor = _compilationUnitVisitor;
        visitor.addIndexer(indexer);
        cuParsed.accept(visitor);
        index.commit();
        return index;
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CodeIndexerIndex exercise(final CharSequence code, final IIndexer indexer) {
    ArrayList<IIndexer> _newArrayList = CollectionLiterals.<IIndexer>newArrayList(indexer);
    List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
    CodeIndexerIndex _exercise = this.exercise(code, _i);
    return _exercise;
  }
  
  public List<String> l(final String[] items) {
    return ((List<String>) ((List<String>)Conversions.doWrapArray(items)));
  }
  
  public List<IIndexer> i(final IIndexer[] items) {
    return ((List<IIndexer>) ((List<IIndexer>)Conversions.doWrapArray(items)));
  }
}
