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
        String _operator_plus = StringExtensions.operator_plus(_className, ".java");
        CharSequence _compileFieldsClass = this.compileFieldsClass(e);
        fsa.generateFile(_operator_plus, _compileFieldsClass);
        CharSequence _compileXtextBaseClass = this.compileXtextBaseClass(e);
        fsa.generateFile("LuceneQueryBaseGenerated.xtext", _compileXtextBaseClass);
      }
    }
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
      _builder.append("\t");
      _builder.append("The following rules are generated. Do not modify. Modify source file instead.");
      _builder.newLine();
      _builder.append("*/");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("//Generated Rule. Do not modify!");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("ClauseExpression:");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(UnaryExpression)? ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("(");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("default=SimpleFieldValue Boost? | // Default field");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("(");
      _builder.newLine();
      {
        EList<FieldCategory> _fieldCategories = m.getFieldCategories();
        for(final FieldCategory category : _fieldCategories) {
          _builder.append("\t\t\t");
          String _xifexpression = null;
          EList<FieldCategory> _fieldCategories_1 = m.getFieldCategories();
          int _indexOf = _fieldCategories_1.indexOf(category);
          boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_indexOf, 0);
          if (_operator_greaterThan) {
            _xifexpression = "| ";
          }
          _builder.append(_xifexpression, "			");
          _builder.append("\t(");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("\t\t");
          _builder.append("field=");
          String _categoryName = category.getCategoryName();
          _builder.append(_categoryName, "					");
          _builder.append(" \':\' ");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("\t\t");
          _builder.append("(");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t\t\t");
          _builder.append("(values+=");
          String _categoryName_1 = category.getCategoryName();
          _builder.append(_categoryName_1, "						");
          _builder.append("Value)");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("\t\t\t");
          _builder.append("| (\'(\'(UnaryExpression? values+=");
          String _categoryName_2 = category.getCategoryName();
          _builder.append(_categoryName_2, "						");
          _builder.append("Value Boost?)*\')\')");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t");
          _builder.append("\t\t");
          _builder.append(") Boost?");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("\t");
          _builder.append(")");
          _builder.newLine();
        }
      }
      _builder.append("\t\t\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(";");
      _builder.newLine();
      _builder.newLine();
      {
        EList<FieldCategory> _fieldCategories_2 = m.getFieldCategories();
        for(final FieldCategory category_1 : _fieldCategories_2) {
          _builder.append("\t");
          _builder.append("//Generated Rule. Do not modify!");
          _builder.newLine();
          _builder.append("\t");
          String _categoryName_3 = category_1.getCategoryName();
          _builder.append(_categoryName_3, "	");
          _builder.append(":");
          _builder.newLineIfNotEmpty();
          {
            EList<Field> _fields = category_1.getFields();
            for(final Field field : _fields) {
              _builder.append("\t");
              _builder.append("\t");
              String _xifexpression_1 = null;
              Boolean _value = b.getValue();
              boolean _operator_not = BooleanExtensions.operator_not(_value);
              if (_operator_not) {
                _xifexpression_1 = "| ";
              }
              _builder.append(_xifexpression_1, "		");
              _builder.append("\tvalue=\'");
              String _value_1 = field.getValue();
              _builder.append(_value_1, "		");
              _builder.append("\'");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              b.setValue(Boolean.valueOf(false));
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append(";");
          _builder.newLine();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          b.setValue(Boolean.valueOf(true));
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("/*");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("End of generated rules.");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("*/");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence compileFieldsClass(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tCOPY THE NEXT BLOCK TO THE FOLLOWING LOCATONS:");
    _builder.newLine();
    {
      EList<String> _packageNames = m.getPackageNames();
      for(final String packageName : _packageNames) {
        _builder.append("*\t\t");
        _builder.append(packageName, "");
        _builder.append(".");
        String _className = m.getClassName();
        _builder.append(_className, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("*/");
    _builder.newLine();
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _doNotModify = this.doNotModify();
    _builder.append(_doNotModify, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class ");
    String _className_1 = m.getClassName();
    _builder.append(_className_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public final static String TYPE_CLASS = \"class\";");
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
    _builder.append("public static final String DEFINITION_PARAMETER = \"parameter\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String DEFINITION_NULLLITERAL = \"nullLiteral\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String DEFINITION_METHOD_INVOCATION = \"methodInvocation\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String DEFINITION_INSTANCE_CREATION = \"instanceCreation\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String DEFINITION_UNINITIALIZED = \"uninitialized\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<FieldCategory> _fieldCategories = m.getFieldCategories();
      for(final FieldCategory category : _fieldCategories) {
        _builder.append("\t");
        _builder.append("//");
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
    _builder.append("*/");
    return _builder;
  }
  
  public CharSequence compile(final Field f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("/** Can be applied to: ");
    {
      EList<FieldType> _types = f.getTypes();
      for(final FieldType t : _types) {
        String _xifexpression = null;
        EList<FieldType> _types_1 = f.getTypes();
        int _indexOf = _types_1.indexOf(t);
        boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_indexOf, 0);
        if (_operator_greaterThan) {
          _xifexpression = ",";
        }
        _builder.append(_xifexpression, "	");
        String _typeName = this.toTypeName(t);
        _builder.append(_typeName, "	");
      }
    }
    _builder.append("*/");
    _builder.newLineIfNotEmpty();
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
    String _xblockexpression = null;
    {
      boolean _isClassType = t.isClassType();
      if (_isClassType) {
        return "class";
      }
      boolean _isMethodType = t.isMethodType();
      if (_isMethodType) {
        return "method";
      }
      boolean _isFieldType = t.isFieldType();
      if (_isFieldType) {
        return "field";
      }
      String _xifexpression = null;
      boolean _isTrycatchType = t.isTrycatchType();
      if (_isTrycatchType) {
        return "tryCatch";
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
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
