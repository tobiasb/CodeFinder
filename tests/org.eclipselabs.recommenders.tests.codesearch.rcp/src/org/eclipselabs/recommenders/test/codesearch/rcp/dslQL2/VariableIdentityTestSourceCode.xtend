package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2

class VariableIdentityTestSourceCode {
	public static CharSequence testPositiveCase = '''
	import java.util.List;
	public class TestClass {
		public void yesyesyes() {
			String s1 = "";
			List l1 = null;
			
			l1.add(s1);
			l1.contains(s1);
		}
	}'''
	
	public static CharSequence testNegativeCase = '''
	import java.util.List;
	public class TestClass {
		public void nonono() {
			String s1 = "";
			List l1 = null;
			String s2 = "";
			List l2 = null;
			
			l1.add(s1);
			l1.contains(s2);
			l2.contains(s1);
		}
	}'''
}