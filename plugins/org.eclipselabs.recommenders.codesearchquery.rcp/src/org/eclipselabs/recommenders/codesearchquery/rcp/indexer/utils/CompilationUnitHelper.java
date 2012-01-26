package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.utils;

import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class CompilationUnitHelper {

	private static ASTParser parser;
	
	static {
		parser = ASTParser.newParser(AST.JLS4);
        parser.setKind(ASTParser.K_COMPILATION_UNIT);
        parser.setResolveBindings(true);
	}
	
    public static CompilationUnit parse(final ICompilationUnit unit) {
        parser.setSource(unit);
        return (CompilationUnit) parser.createAST(null); // parse
    }

    public static CompilationUnit parse(final IClassFile type) {
        parser.setSource(type);
        return (CompilationUnit) parser.createAST(null); // parse
    }
}
