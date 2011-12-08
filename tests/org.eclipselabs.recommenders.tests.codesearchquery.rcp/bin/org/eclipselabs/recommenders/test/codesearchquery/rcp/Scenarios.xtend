package org.eclipselabs.recommenders.test.codesearchquery.rcp

import java.util.List
import org.apache.commons.lang3.StringUtils
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.recommenders.completion.rcp.chain.jdt.CallChainCompletionProposal
import org.eclipse.recommenders.tests.jdt.JavaProjectFixture
import org.eclipse.recommenders.tests.jdt.TestJavaContentAssistContext
import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.junit.Test

import static junit.framework.Assert.*
import org.eclipse.recommenders.completion.rcp.chain.jdt.CallChainCompletionProposalComputer
import org.junit.Ignore
import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer._CompilationUnitVisitor
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.jdt.core.IPackageFragmentRoot
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.ASTParser
import org.eclipse.jdt.core.dom.CompilationUnit

class Scenarios {
	
 
	@Test
	def void testFindLocalAnchor(){
		val code = '''
		public class MyClass {
		} 
		'''
		
		exercise(code, null)
	}
	
    def parse(ICompilationUnit unit) {
        var parser = ASTParser::newParser(AST::JLS3);
        parser.setKind(ASTParser::K_COMPILATION_UNIT);
        parser.setSource(unit);
        parser.setResolveBindings(true);
        
		parser.createAST(null); // parse
    }
	
	def exercise(StringConcatenation code, List<? extends List<String>> expected){
		val fixture = new JavaProjectFixture(ResourcesPlugin::getWorkspace(),"test")
		val struct = fixture.createFileAndParseWithMarkers(code.toString, "MyClass.java")
		val cu = struct.first;

		
        var index = CodesearchQueryModule::index
		
        var visitor = new _CompilationUnitVisitor(index);
        
        var cuParsed = parse(cu);
        cuParsed.accept(visitor)
		
		
//		val ctx = new TestJavaContentAssistContext(cu, completionIndex)
//		val sut = new CallChainCompletionProposalComputer()
//		
//		val proposals = sut.computeCompletionProposals(ctx, null) 
//		 for(proposal : proposals){
//			val names = (proposal as CallChainCompletionProposal).chainElementNames
//			assertTrue('''couldn't find Â«names» in expected.'''.toString, expected.remove(names))
//		} 
//		assertTrue(''' some expected values were not found Â«expected» '''.toString, expected.empty)
	}
	
//	def l(String spaceSeparatedElementNames){ 
//		val elementNames = StringUtils::split(spaceSeparatedElementNames);
//		return newArrayList(elementNames) as List<String>
//	}
//	def w (String [] chains){
//		val List<List<String>> res = newArrayList();
//		for(chain :chains){
//			res.add(l(chain))
//		}
//		return res as List<List<String>>
//	}
}