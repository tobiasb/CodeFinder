package org.eclipselabs.recommenders.test.codesearchquery.rcp;

import java.util.List;
import java.util.Set;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.recommenders.tests.jdt.JavaProjectFixture;
import org.eclipse.recommenders.utils.Tuple;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor.CompilationUnitVisitor;
import org.eclipselabs.recommenders.test.codesearchquery.rcp.CodesearchQueryModule;
import org.junit.Test;

@SuppressWarnings("all")
public class Scenarios {
  
  @Test
  public void testFindLocalAnchor() throws CoreException {
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class MyClass {");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final StringConcatenation code = _builder;
      this.exercise(code, null);
    }
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
  
  public void exercise(final StringConcatenation code, final List<? extends List<String>> expected) throws CoreException {
    {
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      JavaProjectFixture _javaProjectFixture = new JavaProjectFixture(_workspace, "test");
      final JavaProjectFixture fixture = _javaProjectFixture;
      String _string = code.toString();
      Tuple<ICompilationUnit,Set<Integer>> _createFileAndParseWithMarkers = fixture.createFileAndParseWithMarkers(_string, "MyClass.java");
      final Tuple<ICompilationUnit,Set<Integer>> struct = _createFileAndParseWithMarkers;
      ICompilationUnit _first = struct.getFirst();
      final ICompilationUnit cu = _first;
      LuceneIndex _index = CodesearchQueryModule.getIndex();
      LuceneIndex index = _index;
      CompilationUnitVisitor __CompilationUnitVisitor = new CompilationUnitVisitor(index);
      CompilationUnitVisitor visitor = __CompilationUnitVisitor;
      ASTNode _parse = this.parse(cu);
      ASTNode cuParsed = _parse;
      cuParsed.accept(visitor);
    }
  }
}