/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.test.codesearch.rcp.dslQL2;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class VariableIdentityTestStrings {
  public static CharSequence testPositiveCase = new Function0<CharSequence>() {
    public CharSequence apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class TestClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void yesyesyes() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("String s1 = \"\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("List l1 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("l1.add(s1);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("l1.contains(s1);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      return _builder;
    }
  }.apply();
  
  public static CharSequence testNegativeCase = new Function0<CharSequence>() {
    public CharSequence apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import java.util.List;");
      _builder.newLine();
      _builder.append("public class TestClass {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void nonono() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("String s1 = \"\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("String s2 = \"\";");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("List l1 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("List l2 = null;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("l1.add(s1);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("l2.contains(s1);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("l1.contains(s2);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      return _builder;
    }
  }.apply();
  
  public static CharSequence varIdentityQueryString = new Function0<CharSequence>() {
    public CharSequence apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var *String s");
      _builder.newLine();
      _builder.append("var *List l");
      _builder.newLine();
      _builder.append("{\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("call l.add(s)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("call l.contains(s)");
      _builder.newLine();
      _builder.append("}");
      return _builder;
    }
  }.apply();
}
