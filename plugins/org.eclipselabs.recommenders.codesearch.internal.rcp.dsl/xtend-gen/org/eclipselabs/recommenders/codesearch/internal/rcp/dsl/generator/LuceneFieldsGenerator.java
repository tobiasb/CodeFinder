package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.generator.BooleanHandler;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model;

@SuppressWarnings("all")
public class LuceneFieldsGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Model> _filter = IterableExtensions.<Model>filter(_iterable, org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model.class);
    for (final Model e : _filter) {
      {
        String _className = e.getClassName();
        String _operator_plus = StringExtensions.operator_plus(_className, ".java.txt");
        CharSequence _compileFieldsClass = this.compileFieldsClass(e);
        fsa.generateFile(_operator_plus, _compileFieldsClass);
        CharSequence _compileXtextBaseClass = this.compileXtextBaseClass(e);
        fsa.generateFile("LuceneQueryBaseGenerated.txt", _compileXtextBaseClass);
        CharSequence _compileTexFieldOverview = this.compileTexFieldOverview(e);
        fsa.generateFile("FieldsOverview.tex", _compileTexFieldOverview);
      }
    }
  }
  
  public CharSequence compileTexFieldOverview(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("% This file is generated");
    _builder.newLine();
    _builder.newLine();
    {
      EList<FieldCategory> _fieldCategories = m.getFieldCategories();
      for(final FieldCategory category : _fieldCategories) {
        _builder.newLine();
        _builder.append("%GENERATED, DO NOT MODIFY HERE!!!");
        _builder.newLine();
        _builder.append("\\subsubsection{");
        String _categoryName = category.getCategoryName();
        String _texCompatibleString = this.getTexCompatibleString(_categoryName);
        _builder.append(_texCompatibleString, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
        _builder.append("\\label{sec:FieldCategory");
        String _categoryName_1 = category.getCategoryName();
        String _texCompatibleString_1 = this.getTexCompatibleString(_categoryName_1);
        _builder.append(_texCompatibleString_1, "");
        _builder.append("}");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("%GENERATED, DO NOT MODIFY HERE!!!");
        _builder.newLine();
        String _desc = category.getDesc();
        _builder.append(_desc, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("%GENERATED, DO NOT MODIFY HERE!!!");
        _builder.newLine();
        _builder.append("See table \\ref{tab:FieldCategory");
        String _categoryName_2 = category.getCategoryName();
        String _texCompatibleString_2 = this.getTexCompatibleString(_categoryName_2);
        _builder.append(_texCompatibleString_2, "");
        _builder.append("Fields} for the complete list of fields.");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("%GENERATED, DO NOT MODIFY HERE!!!");
        _builder.newLine();
        _builder.append("%Category: ");
        String _categoryName_3 = category.getCategoryName();
        String _texCompatibleString_3 = this.getTexCompatibleString(_categoryName_3);
        _builder.append(_texCompatibleString_3, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\\begin{longtable}{|p{4.7cm}|p{2,1cm}|p{7,8cm}|}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\hline");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\multicolumn{3}{|l|}{\\textsl{");
        String _categoryName_4 = category.getCategoryName();
        String _texCompatibleString_4 = this.getTexCompatibleString(_categoryName_4);
        _builder.append(_texCompatibleString_4, "	");
        _builder.append("}}\\\\\\hline");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\\textbf{Field Name} & \\textbf{Target} & \\textbf{Description}\\\\");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\endfirsthead");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\multicolumn{3}{@{}l}{\\ldots continued}\\\\\\hline");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("%\\multicolumn{3}{|l|}{\\textsl{");
        String _categoryName_5 = category.getCategoryName();
        String _texCompatibleString_5 = this.getTexCompatibleString(_categoryName_5);
        _builder.append(_texCompatibleString_5, "	");
        _builder.append("}}\\\\\\hline");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\\textbf{Field Name} & \\textbf{Target} & \\textbf{Description}\\\\");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\hline");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\endhead");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\hline");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\multicolumn{3}{r@{}}{continued \\ldots}\\\\");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\endfoot");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\hline");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\endlastfoot");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\hline");
        _builder.newLine();
        {
          EList<Field> _fields = category.getFields();
          for(final Field field : _fields) {
            _builder.append("\t");
            _builder.append("%GENERATED, DO NOT MODIFY HERE!!!");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\\cfield{");
            String _value = field.getValue();
            String _texCompatibleString_6 = this.getTexCompatibleString(_value);
            _builder.append(_texCompatibleString_6, "	");
            _builder.append("} ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("& ");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _iconForActionType = this.getIconForActionType(field, "type");
            _builder.append(_iconForActionType, "		");
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _iconForActionType_1 = this.getIconForActionType(field, "method");
            _builder.append(_iconForActionType_1, "		");
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _iconForActionType_2 = this.getIconForActionType(field, "field");
            _builder.append(_iconForActionType_2, "		");
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _iconForActionType_3 = this.getIconForActionType(field, "tryCatch");
            _builder.append(_iconForActionType_3, "		");
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _iconForActionType_4 = this.getIconForActionType(field, "varusage");
            _builder.append(_iconForActionType_4, "		");
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("& ");
            String _desc_1 = field.getDesc();
            _builder.append(_desc_1, "		");
            _builder.append(" \\\\");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\\hline");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\\caption{Lucene Fields in category \\cquote{");
        String _categoryName_6 = category.getCategoryName();
        String _texCompatibleString_7 = this.getTexCompatibleString(_categoryName_6);
        _builder.append(_texCompatibleString_7, "	");
        _builder.append("}\\label{tab:FieldCategory");
        String _categoryName_7 = category.getCategoryName();
        String _texCompatibleString_8 = this.getTexCompatibleString(_categoryName_7);
        _builder.append(_texCompatibleString_8, "	");
        _builder.append("Fields}}");
        _builder.newLineIfNotEmpty();
        _builder.append("\\end{longtable}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("% End of generated file");
    return _builder;
  }
  
  public CharSequence getIconForActionType(final Field field, final String t) {
    CharSequence _xifexpression = null;
    boolean _hasActionOfType = this.hasActionOfType(field, t);
    if (_hasActionOfType) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\includegraphics[width=0.9em]{img-src/icons/");
      _builder.append(t, "");
      _builder.append(".png}");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\\includegraphics[width=0.9em]{img-src/icons/empty.png}");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public String getTexCompatibleString(final String s) {
    String _replace = s.replace("_", "\\_");
    return _replace;
  }
  
  public CharSequence compileXtextBaseClass(final Model m) {
    CharSequence _xblockexpression = null;
    {
      BooleanHandler _booleanHandler = new BooleanHandler();
      BooleanHandler b = _booleanHandler;
      b.setValue(Boolean.valueOf(true));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*");
      _builder.newLine();
      _builder.append("The following rules are generated. Do not modify. Modify source file instead.");
      _builder.newLine();
      _builder.append("*/");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Generated Rule. Do not modify!");
      _builder.newLine();
      _builder.append("ClauseExpression:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("(UnaryExpression)? ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("default=SimpleFieldValue Boost? | // Default field");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(");
      _builder.newLine();
      {
        EList<FieldCategory> _fieldCategories = m.getFieldCategories();
        for(final FieldCategory category : _fieldCategories) {
          _builder.append("\t\t");
          String _xifexpression = null;
          EList<FieldCategory> _fieldCategories_1 = m.getFieldCategories();
          int _indexOf = _fieldCategories_1.indexOf(category);
          boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_indexOf, 0);
          if (_operator_greaterThan) {
            _xifexpression = "| ";
          }
          _builder.append(_xifexpression, "		");
          _builder.append("\t(");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t\t");
          _builder.append("field=");
          String _categoryName = category.getCategoryName();
          _builder.append(_categoryName, "				");
          _builder.append(" \':\' ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t\t");
          _builder.append("(");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t\t\t");
          _builder.append("(values+=");
          String _categoryName_1 = category.getCategoryName();
          _builder.append(_categoryName_1, "					");
          _builder.append("Value)");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t\t\t");
          _builder.append("| (\'(\'(UnaryExpression? values+=");
          String _categoryName_2 = category.getCategoryName();
          _builder.append(_categoryName_2, "					");
          _builder.append("Value Boost?)*\')\')");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t\t");
          _builder.append(") Boost?");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append(")");
          _builder.newLine();
        }
      }
      _builder.append("\t\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append(";");
      _builder.newLine();
      _builder.newLine();
      {
        EList<FieldCategory> _fieldCategories_2 = m.getFieldCategories();
        for(final FieldCategory category_1 : _fieldCategories_2) {
          _builder.append("//Generated Rule. Do not modify!");
          _builder.newLine();
          String _categoryName_3 = category_1.getCategoryName();
          _builder.append(_categoryName_3, "");
          _builder.append(":");
          _builder.newLineIfNotEmpty();
          {
            EList<Field> _fields = category_1.getFields();
            for(final Field field : _fields) {
              _builder.append("\t");
              String _xifexpression_1 = null;
              Boolean _value = b.getValue();
              boolean _operator_not = BooleanExtensions.operator_not(_value);
              if (_operator_not) {
                _xifexpression_1 = "| ";
              }
              _builder.append(_xifexpression_1, "	");
              _builder.append("\tvalue=\'");
              String _value_1 = field.getValue();
              _builder.append(_value_1, "	");
              _builder.append("\'");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              b.setValue(Boolean.valueOf(false));
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append(";");
          _builder.newLine();
          _builder.newLine();
          b.setValue(Boolean.valueOf(true));
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("/*");
      _builder.newLine();
      _builder.append("End of generated rules.");
      _builder.newLine();
      _builder.append("*/");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence compileFieldsClass(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright (c) 2012 Tobias Boehm.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All rights reserved. This program and the accompanying materials");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* are made available under the terms of the Eclipse Public License v1.0");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* which accompanies this distribution, and is available at");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* http://www.eclipse.org/legal/epl-v10.html");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Contributors:");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*    Tobias Boehm - initial API and implementation.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package org.eclipse.recommenders.codesearch.rcp.index;");
    _builder.newLine();
    _builder.newLine();
    CharSequence _doNotModify = this.doNotModify();
    _builder.append(_doNotModify, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _className = m.getClassName();
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//GENERATED, DO NOT MODIFY HERE!!!");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public final static String TYPE_CLASS = \"type\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public final static String TYPE_METHOD = \"method\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public final static String TYPE_FIELD = \"field\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public final static String TYPE_TRYCATCH = \"trycatch\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public final static String TYPE_VARUSAGE = \"varusage\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//GENERATED, DO NOT MODIFY HERE!!!");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String MODIFIER_PUBLIC = \"public\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String MODIFIER_FINAL = \"final\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String MODIFIER_PRIVATE = \"private\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String MODIFIER_PROTECTED = \"protected\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String MODIFIER_STATIC = \"static\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String MODIFIER_ABSTRACT = \"abstract\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//GENERATED, DO NOT MODIFY HERE!!!");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String DEFINITION_PARAMETER = \"parameter\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String DEFINITION_NULLLITERAL = \"nullLiteral\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String DEFINITION_ASSIGNMENT = \"assignment\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String DEFINITION_INSTANCE_CREATION = \"instanceCreation\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String DEFINITION_UNINITIALIZED = \"uninitialized\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Java handle used to open a given java element in an editor.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String JAVA_ELEMENT_HANDLE = \"Handle\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      EList<FieldCategory> _fieldCategories = m.getFieldCategories();
      for(final FieldCategory category : _fieldCategories) {
        _builder.append("\t");
        _builder.append("//GENERATED, DO NOT MODIFY HERE!!!");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("// ");
        String _categoryName = category.getCategoryName();
        _builder.append(_categoryName, "	");
        _builder.newLineIfNotEmpty();
        {
          EList<Field> _fields = category.getFields();
          for(final Field field : _fields) {
            CharSequence _compile = this.compile(field);
            _builder.append(_compile, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Field f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("/** ");
    String _desc = f.getDesc();
    _builder.append(_desc, "	");
    _builder.append("<br /><br />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("Can be applied to: ");
    {
      EList<FieldType> _types = f.getTypes();
      for(final FieldType t : _types) {
        String _xifexpression = null;
        EList<FieldType> _types_1 = f.getTypes();
        int _indexOf = _types_1.indexOf(t);
        boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_indexOf, 0);
        if (_operator_greaterThan) {
          _xifexpression = ", ";
        }
        _builder.append(_xifexpression, "		");
        String _typeName = this.toTypeName(t);
        _builder.append(_typeName, "		");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//GENERATED, DO NOT MODIFY HERE!!!");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public final static String ");
    String _name = f.getName();
    _builder.append(_name, "	");
    _builder.append(" = \"");
    String _value = f.getValue();
    _builder.append(_value, "	");
    _builder.append("\";");
    return _builder;
  }
  
  public String toTypeName(final FieldType t) {
      boolean _isType = t.isType();
      if (_isType) {
        return "type";
      }
      boolean _isMethod = t.isMethod();
      if (_isMethod) {
        return "method";
      }
      boolean _isField = t.isField();
      if (_isField) {
        return "field";
      }
      boolean _isTrycatch = t.isTrycatch();
      if (_isTrycatch) {
        return "tryCatch";
      }
      boolean _isVarusage = t.isVarusage();
      if (_isVarusage) {
        return "varusage";
      }
      return "N/A";
  }
  
  public boolean hasActionOfType(final Field f, final String tDesired) {
      EList<FieldType> _types = f.getTypes();
      for (final FieldType t : _types) {
        String _typeName = this.toTypeName(t);
        boolean _equals = _typeName.equals(tDesired);
        if (_equals) {
          return true;
        }
      }
      return false;
  }
  
  public CharSequence doNotModify() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append("* This is a generated file. Do not modify. Modify source file instead.");
    _builder.newLine();
    _builder.append("*/");
    return _builder;
  }
}
