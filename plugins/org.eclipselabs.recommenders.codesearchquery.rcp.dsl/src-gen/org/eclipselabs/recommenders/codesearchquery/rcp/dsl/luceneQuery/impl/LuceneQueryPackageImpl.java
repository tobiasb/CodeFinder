/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleClause;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LuceneQueryPackageImpl extends EPackageImpl implements LuceneQueryPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clauseExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeFieldNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exp1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanExpEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum notExpressionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum mustExpressionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LuceneQueryPackageImpl()
  {
    super(eNS_URI, LuceneQueryFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LuceneQueryPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LuceneQueryPackage init()
  {
    if (isInited) return (LuceneQueryPackage)EPackage.Registry.INSTANCE.getEPackage(LuceneQueryPackage.eNS_URI);

    // Obtain or create and register package
    LuceneQueryPackageImpl theLuceneQueryPackage = (LuceneQueryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LuceneQueryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LuceneQueryPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLuceneQueryPackage.createPackageContents();

    // Initialize created meta-data
    theLuceneQueryPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLuceneQueryPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LuceneQueryPackage.eNS_URI, theLuceneQueryPackage);
    return theLuceneQueryPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Value()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClauseExpression()
  {
    return clauseExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClauseExpression_N()
  {
    return (EAttribute)clauseExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClauseExpression_M()
  {
    return (EAttribute)clauseExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClauseExpression_Clause()
  {
    return (EReference)clauseExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleClause()
  {
    return simpleClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleClause_Field()
  {
    return (EReference)simpleClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleClause_Value()
  {
    return (EAttribute)simpleClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeClause()
  {
    return typeClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeClause_Field()
  {
    return (EReference)typeClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeClause_Value()
  {
    return (EAttribute)typeClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldName()
  {
    return fieldNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_FullyQualifiedName()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_Type()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_FriendlyName()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_DeclaredMethods()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_ParameterCount()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_ReturnVariableEexpressions()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_UsedMethods()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_UsedMethodsInTry()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_UsedMethodsInFinally()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_OverriddenMethods()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_ProjectName()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_ResourcePath()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_Modifiers()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_AllDeclaredMethodNames()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_DeclaredMethodNames()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_DeclaredFieldNames()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_DeclaredFieldTypes()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_AllDeclaredFieldNames()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_FullText()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_FieldsRead()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_FieldsWritten()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_UsedFieldsInFinally()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_UsedFieldsInTry()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_Annotations()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldName_Timestamp()
  {
    return (EAttribute)fieldNameEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeFieldName()
  {
    return typeFieldNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_ImplementedTypes()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_ExtendedTypes()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_UsedTypes()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_UsedTypesInTry()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_UsedTypesInFinally()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_ParameterTypes()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_ReturnType()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_AllImplementedTypes()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_AllExtendedTypes()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_FieldType()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_DeclaringType()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_CaughtType()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFieldName_InstanceofTypes()
  {
    return (EAttribute)typeFieldNameEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExp1()
  {
    return exp1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExp1_Left()
  {
    return (EReference)exp1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExp1_B()
  {
    return (EAttribute)exp1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExp1_Right()
  {
    return (EReference)exp1EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBooleanExp()
  {
    return booleanExpEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNotExpression()
  {
    return notExpressionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMustExpression()
  {
    return mustExpressionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuceneQueryFactory getLuceneQueryFactory()
  {
    return (LuceneQueryFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__VALUE);

    clauseExpressionEClass = createEClass(CLAUSE_EXPRESSION);
    createEAttribute(clauseExpressionEClass, CLAUSE_EXPRESSION__N);
    createEAttribute(clauseExpressionEClass, CLAUSE_EXPRESSION__M);
    createEReference(clauseExpressionEClass, CLAUSE_EXPRESSION__CLAUSE);

    simpleClauseEClass = createEClass(SIMPLE_CLAUSE);
    createEReference(simpleClauseEClass, SIMPLE_CLAUSE__FIELD);
    createEAttribute(simpleClauseEClass, SIMPLE_CLAUSE__VALUE);

    typeClauseEClass = createEClass(TYPE_CLAUSE);
    createEReference(typeClauseEClass, TYPE_CLAUSE__FIELD);
    createEAttribute(typeClauseEClass, TYPE_CLAUSE__VALUE);

    fieldNameEClass = createEClass(FIELD_NAME);
    createEAttribute(fieldNameEClass, FIELD_NAME__FULLY_QUALIFIED_NAME);
    createEAttribute(fieldNameEClass, FIELD_NAME__TYPE);
    createEAttribute(fieldNameEClass, FIELD_NAME__FRIENDLY_NAME);
    createEAttribute(fieldNameEClass, FIELD_NAME__DECLARED_METHODS);
    createEAttribute(fieldNameEClass, FIELD_NAME__PARAMETER_COUNT);
    createEAttribute(fieldNameEClass, FIELD_NAME__RETURN_VARIABLE_EEXPRESSIONS);
    createEAttribute(fieldNameEClass, FIELD_NAME__USED_METHODS);
    createEAttribute(fieldNameEClass, FIELD_NAME__USED_METHODS_IN_TRY);
    createEAttribute(fieldNameEClass, FIELD_NAME__USED_METHODS_IN_FINALLY);
    createEAttribute(fieldNameEClass, FIELD_NAME__OVERRIDDEN_METHODS);
    createEAttribute(fieldNameEClass, FIELD_NAME__PROJECT_NAME);
    createEAttribute(fieldNameEClass, FIELD_NAME__RESOURCE_PATH);
    createEAttribute(fieldNameEClass, FIELD_NAME__MODIFIERS);
    createEAttribute(fieldNameEClass, FIELD_NAME__ALL_DECLARED_METHOD_NAMES);
    createEAttribute(fieldNameEClass, FIELD_NAME__DECLARED_METHOD_NAMES);
    createEAttribute(fieldNameEClass, FIELD_NAME__DECLARED_FIELD_NAMES);
    createEAttribute(fieldNameEClass, FIELD_NAME__DECLARED_FIELD_TYPES);
    createEAttribute(fieldNameEClass, FIELD_NAME__ALL_DECLARED_FIELD_NAMES);
    createEAttribute(fieldNameEClass, FIELD_NAME__FULL_TEXT);
    createEAttribute(fieldNameEClass, FIELD_NAME__FIELDS_READ);
    createEAttribute(fieldNameEClass, FIELD_NAME__FIELDS_WRITTEN);
    createEAttribute(fieldNameEClass, FIELD_NAME__USED_FIELDS_IN_FINALLY);
    createEAttribute(fieldNameEClass, FIELD_NAME__USED_FIELDS_IN_TRY);
    createEAttribute(fieldNameEClass, FIELD_NAME__ANNOTATIONS);
    createEAttribute(fieldNameEClass, FIELD_NAME__TIMESTAMP);

    typeFieldNameEClass = createEClass(TYPE_FIELD_NAME);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__IMPLEMENTED_TYPES);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__EXTENDED_TYPES);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__USED_TYPES);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__USED_TYPES_IN_TRY);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__USED_TYPES_IN_FINALLY);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__PARAMETER_TYPES);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__RETURN_TYPE);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__ALL_IMPLEMENTED_TYPES);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__ALL_EXTENDED_TYPES);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__FIELD_TYPE);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__DECLARING_TYPE);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__CAUGHT_TYPE);
    createEAttribute(typeFieldNameEClass, TYPE_FIELD_NAME__INSTANCEOF_TYPES);

    exp1EClass = createEClass(EXP1);
    createEReference(exp1EClass, EXP1__LEFT);
    createEAttribute(exp1EClass, EXP1__B);
    createEReference(exp1EClass, EXP1__RIGHT);

    // Create enums
    booleanExpEEnum = createEEnum(BOOLEAN_EXP);
    notExpressionEEnum = createEEnum(NOT_EXPRESSION);
    mustExpressionEEnum = createEEnum(MUST_EXPRESSION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    exp1EClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Value(), this.getClauseExpression(), null, "value", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clauseExpressionEClass, ClauseExpression.class, "ClauseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClauseExpression_N(), this.getNotExpression(), "n", null, 0, 1, ClauseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClauseExpression_M(), this.getMustExpression(), "m", null, 0, 1, ClauseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClauseExpression_Clause(), ecorePackage.getEObject(), null, "clause", null, 0, 1, ClauseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleClauseEClass, SimpleClause.class, "SimpleClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleClause_Field(), this.getFieldName(), null, "field", null, 0, 1, SimpleClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleClause_Value(), ecorePackage.getEString(), "value", null, 0, 1, SimpleClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeClauseEClass, TypeClause.class, "TypeClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeClause_Field(), this.getTypeFieldName(), null, "field", null, 0, 1, TypeClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeClause_Value(), ecorePackage.getEString(), "value", null, 0, 1, TypeClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldNameEClass, FieldName.class, "FieldName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFieldName_FullyQualifiedName(), ecorePackage.getEString(), "FullyQualifiedName", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_Type(), ecorePackage.getEString(), "Type", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_FriendlyName(), ecorePackage.getEString(), "FriendlyName", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_DeclaredMethods(), ecorePackage.getEString(), "DeclaredMethods", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_ParameterCount(), ecorePackage.getEString(), "ParameterCount", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_ReturnVariableEexpressions(), ecorePackage.getEString(), "ReturnVariableEexpressions", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_UsedMethods(), ecorePackage.getEString(), "UsedMethods", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_UsedMethodsInTry(), ecorePackage.getEString(), "UsedMethodsInTry", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_UsedMethodsInFinally(), ecorePackage.getEString(), "UsedMethodsInFinally", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_OverriddenMethods(), ecorePackage.getEString(), "OverriddenMethods", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_ProjectName(), ecorePackage.getEString(), "ProjectName", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_ResourcePath(), ecorePackage.getEString(), "ResourcePath", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_Modifiers(), ecorePackage.getEString(), "Modifiers", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_AllDeclaredMethodNames(), ecorePackage.getEString(), "AllDeclaredMethodNames", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_DeclaredMethodNames(), ecorePackage.getEString(), "DeclaredMethodNames", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_DeclaredFieldNames(), ecorePackage.getEString(), "DeclaredFieldNames", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_DeclaredFieldTypes(), ecorePackage.getEString(), "DeclaredFieldTypes", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_AllDeclaredFieldNames(), ecorePackage.getEString(), "AllDeclaredFieldNames", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_FullText(), ecorePackage.getEString(), "FullText", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_FieldsRead(), ecorePackage.getEString(), "FieldsRead", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_FieldsWritten(), ecorePackage.getEString(), "FieldsWritten", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_UsedFieldsInFinally(), ecorePackage.getEString(), "UsedFieldsInFinally", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_UsedFieldsInTry(), ecorePackage.getEString(), "UsedFieldsInTry", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_Annotations(), ecorePackage.getEString(), "Annotations", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldName_Timestamp(), ecorePackage.getEString(), "Timestamp", null, 0, 1, FieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeFieldNameEClass, TypeFieldName.class, "TypeFieldName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeFieldName_ImplementedTypes(), ecorePackage.getEString(), "ImplementedTypes", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_ExtendedTypes(), ecorePackage.getEString(), "ExtendedTypes", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_UsedTypes(), ecorePackage.getEString(), "UsedTypes", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_UsedTypesInTry(), ecorePackage.getEString(), "UsedTypesInTry", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_UsedTypesInFinally(), ecorePackage.getEString(), "UsedTypesInFinally", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_ParameterTypes(), ecorePackage.getEString(), "ParameterTypes", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_ReturnType(), ecorePackage.getEString(), "ReturnType", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_AllImplementedTypes(), ecorePackage.getEString(), "AllImplementedTypes", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_AllExtendedTypes(), ecorePackage.getEString(), "AllExtendedTypes", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_FieldType(), ecorePackage.getEString(), "FieldType", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_DeclaringType(), ecorePackage.getEString(), "DeclaringType", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_CaughtType(), ecorePackage.getEString(), "CaughtType", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFieldName_InstanceofTypes(), ecorePackage.getEString(), "InstanceofTypes", null, 0, 1, TypeFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exp1EClass, Exp1.class, "Exp1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExp1_Left(), this.getExpression(), null, "left", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExp1_B(), this.getBooleanExp(), "b", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExp1_Right(), this.getExpression(), null, "right", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(booleanExpEEnum, BooleanExp.class, "BooleanExp");
    addEEnumLiteral(booleanExpEEnum, BooleanExp.AND1);
    addEEnumLiteral(booleanExpEEnum, BooleanExp.OR1);

    initEEnum(notExpressionEEnum, NotExpression.class, "NotExpression");
    addEEnumLiteral(notExpressionEEnum, NotExpression.N1);
    addEEnumLiteral(notExpressionEEnum, NotExpression.N2);
    addEEnumLiteral(notExpressionEEnum, NotExpression.N3);

    initEEnum(mustExpressionEEnum, MustExpression.class, "MustExpression");
    addEEnumLiteral(mustExpressionEEnum, MustExpression.M);

    // Create resource
    createResource(eNS_URI);
  }

} //LuceneQueryPackageImpl
