package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2

class VariableIdentityTestStrings {
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
			String s2 = "";
			List l1 = null;
			List l2 = null;
			
			l1.add(s1);
			l2.contains(s1);
			
			l1.contains(s2);
		}
	}'''
	
	public static CharSequence varIdentityQueryString = '''
	{
		var *String s
		var *List l
		
		call l.add(s)
		call l.contains(s)
	}'''
}