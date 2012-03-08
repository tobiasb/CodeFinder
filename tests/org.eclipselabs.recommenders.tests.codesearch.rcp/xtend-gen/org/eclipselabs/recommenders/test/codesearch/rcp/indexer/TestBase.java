package org.eclipselabs.recommenders.test.codesearch.rcp.indexer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Fieldable;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor.CompilationUnitVisitor;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcher;
import org.eclipse.recommenders.codesearch.rcp.index.ui.IndexUpdateService;
import org.eclipse.recommenders.tests.jdt.JavaProjectFixture;
import org.eclipse.recommenders.utils.Tuple;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipselabs.recommenders.test.codesearch.rcp.indexer.AbstractTestBase;
import org.eclipselabs.recommenders.test.codesearch.rcp.indexer.LuceneInMemoryFixture;
import org.junit.Ignore;

@SuppressWarnings("all")
@Ignore("to make maven happy: All files that start or end with Test are executed per default. If no tests are found the build is failed...")
public class TestBase extends AbstractTestBase {
  public LuceneInMemoryFixture f = new Function0<LuceneInMemoryFixture>() {
    public LuceneInMemoryFixture apply() {
      LuceneInMemoryFixture _luceneInMemoryFixture = new LuceneInMemoryFixture();
      return _luceneInMemoryFixture;
    }
  }.apply();
  
  public CodeIndexer index = this.f.index;
  
  public CodeSearcher search = this.f.searcher;
  
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
  
  public void assertNumDocs(final int expectedNum) {
    try {
      {
        List<Document> _documents = this.search.getDocuments();
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
  
  public boolean assertField(final List<String> expected) {
    try {
      {
        List<Document> _documents = this.search.getDocuments();
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
  
  public boolean assertFieldStartsWith(final List<String> expected) {
    try {
      {
        List<Document> _documents = this.search.getDocuments();
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
  
  public void assertNotField(final List<String> expected) {
    try {
      List<Document> _documents = this.search.getDocuments();
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
  
  public void exercise(final CharSequence code, final List<IIndexer> indexer) {
    this.exercise(code, indexer, "test");
  }
  
  public void exercise(final CharSequence code, final List<IIndexer> indexer, final String projectName) {
    this.exercise(code, indexer, projectName, "MyClass.java");
  }
  
  public void exercise(final CharSequence code, final List<IIndexer> indexer, final String projectName, final String fileName) {
    this.exercise(code, null, null, indexer, projectName, fileName);
  }
  
  public void exercise(final CharSequence code1, final CharSequence code2, final CharSequence code3, final List<IIndexer> indexer, final String projectName, final String fileName) {
    try {
      {
        IndexUpdateService.setBackgroundIndexerActive(false);
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        JavaProjectFixture _javaProjectFixture = new JavaProjectFixture(_workspace, projectName);
        final JavaProjectFixture fixture = _javaProjectFixture;
        String _string = code1.toString();
        Tuple<ICompilationUnit,Set<Integer>> _createFileAndParseWithMarkers = fixture.createFileAndParseWithMarkers(_string);
        final Tuple<ICompilationUnit,Set<Integer>> struct = _createFileAndParseWithMarkers;
        ICompilationUnit _first = struct.getFirst();
        final ICompilationUnit cu = _first;
        ASTNode _parse = TestBase.parse(cu);
        ASTNode cuParsed = _parse;
        CompilationUnitVisitor _compilationUnitVisitor = new CompilationUnitVisitor(this.index);
        CompilationUnitVisitor visitor = _compilationUnitVisitor;
        visitor.addIndexer(indexer);
        cuParsed.accept(visitor);
        this.index.commit();
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void exercise(final CharSequence code, final IIndexer indexer) {
    ArrayList<IIndexer> _newArrayList = CollectionLiterals.<IIndexer>newArrayList(indexer);
    List<IIndexer> _i = this.i(((IIndexer[])Conversions.unwrapArray(_newArrayList, IIndexer.class)));
    this.exercise(code, _i);
  }
  
  public List<String> l(final String[] items) {
    return ((List<String>) ((List<String>)Conversions.doWrapArray(items)));
  }
  
  public List<IIndexer> i(final IIndexer[] items) {
    return ((List<IIndexer>) ((List<IIndexer>)Conversions.doWrapArray(items)));
  }
}
