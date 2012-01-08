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
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Clause;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression;

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
  private EClass clauseEClass = null;

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
  private EEnum fieldNameEEnum = null;

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
  public EReference getClauseExpression_Clause()
  {
    return (EReference)clauseExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClause()
  {
    return clauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClause_N()
  {
    return (EAttribute)clauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClause_Field()
  {
    return (EAttribute)clauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClause_Value()
  {
    return (EAttribute)clauseEClass.getEStructuralFeatures().get(2);
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
  public EEnum getFieldName()
  {
    return fieldNameEEnum;
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
    createEReference(clauseExpressionEClass, CLAUSE_EXPRESSION__CLAUSE);

    clauseEClass = createEClass(CLAUSE);
    createEAttribute(clauseEClass, CLAUSE__N);
    createEAttribute(clauseEClass, CLAUSE__FIELD);
    createEAttribute(clauseEClass, CLAUSE__VALUE);

    exp1EClass = createEClass(EXP1);
    createEReference(exp1EClass, EXP1__LEFT);
    createEAttribute(exp1EClass, EXP1__B);
    createEReference(exp1EClass, EXP1__RIGHT);

    // Create enums
    booleanExpEEnum = createEEnum(BOOLEAN_EXP);
    notExpressionEEnum = createEEnum(NOT_EXPRESSION);
    fieldNameEEnum = createEEnum(FIELD_NAME);
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
    initEReference(getClauseExpression_Clause(), this.getClause(), null, "clause", null, 0, 1, ClauseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClause_N(), this.getNotExpression(), "n", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClause_Field(), this.getFieldName(), "field", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClause_Value(), ecorePackage.getEString(), "value", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exp1EClass, Exp1.class, "Exp1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExp1_Left(), this.getExpression(), null, "left", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExp1_B(), this.getBooleanExp(), "b", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExp1_Right(), this.getExpression(), null, "right", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(booleanExpEEnum, BooleanExp.class, "BooleanExp");
    addEEnumLiteral(booleanExpEEnum, BooleanExp.AND1);
    addEEnumLiteral(booleanExpEEnum, BooleanExp.AND2);
    addEEnumLiteral(booleanExpEEnum, BooleanExp.OR1);
    addEEnumLiteral(booleanExpEEnum, BooleanExp.OR2);

    initEEnum(notExpressionEEnum, NotExpression.class, "NotExpression");
    addEEnumLiteral(notExpressionEEnum, NotExpression.NOT1);
    addEEnumLiteral(notExpressionEEnum, NotExpression.NOT2);
    addEEnumLiteral(notExpressionEEnum, NotExpression.NOT3);

    initEEnum(fieldNameEEnum, FieldName.class, "FieldName");
    addEEnumLiteral(fieldNameEEnum, FieldName.FULLY_QUALIFIED_NAME);
    addEEnumLiteral(fieldNameEEnum, FieldName.TYPE);
    addEEnumLiteral(fieldNameEEnum, FieldName.FRIENDLY_NAME);
    addEEnumLiteral(fieldNameEEnum, FieldName.IMPLEMENTED_TYPES);
    addEEnumLiteral(fieldNameEEnum, FieldName.EXTENDED_TYPES);
    addEEnumLiteral(fieldNameEEnum, FieldName.DECLARED_METHODS);
    addEEnumLiteral(fieldNameEEnum, FieldName.USED_TYPES);
    addEEnumLiteral(fieldNameEEnum, FieldName.USED_TYPES_IN_TRY);
    addEEnumLiteral(fieldNameEEnum, FieldName.USED_TYPES_IN_FINALLY);
    addEEnumLiteral(fieldNameEEnum, FieldName.PARAMETER_TYPES);
    addEEnumLiteral(fieldNameEEnum, FieldName.PARAMETER_COUNT);
    addEEnumLiteral(fieldNameEEnum, FieldName.RETURN_TYPE);
    addEEnumLiteral(fieldNameEEnum, FieldName.RETURN_VARIABLE_EEXPRESSIONS);
    addEEnumLiteral(fieldNameEEnum, FieldName.USED_METHODS);
    addEEnumLiteral(fieldNameEEnum, FieldName.USED_METHODS_IN_TRY);
    addEEnumLiteral(fieldNameEEnum, FieldName.USED_METHODS_IN_FINALLY);
    addEEnumLiteral(fieldNameEEnum, FieldName.OVERRIDDEN_METHODS);
    addEEnumLiteral(fieldNameEEnum, FieldName.ALL_IMPLEMENTED_TYPES);
    addEEnumLiteral(fieldNameEEnum, FieldName.ALL_EXTENDED_TYPES);
    addEEnumLiteral(fieldNameEEnum, FieldName.FIELD_TYPE);
    addEEnumLiteral(fieldNameEEnum, FieldName.DECLARING_TYPE);
    addEEnumLiteral(fieldNameEEnum, FieldName.CAUGHT_TYPE);
    addEEnumLiteral(fieldNameEEnum, FieldName.PROJECT_NAME);
    addEEnumLiteral(fieldNameEEnum, FieldName.RESOURCE_PATH);
    addEEnumLiteral(fieldNameEEnum, FieldName.MODIFIERS);
    addEEnumLiteral(fieldNameEEnum, FieldName.ALL_DECLARED_METHOD_NAMES);
    addEEnumLiteral(fieldNameEEnum, FieldName.DECLARED_METHOD_NAMES);
    addEEnumLiteral(fieldNameEEnum, FieldName.DECLARED_FIELD_NAMES);
    addEEnumLiteral(fieldNameEEnum, FieldName.DECLARED_FIELD_TYPES);
    addEEnumLiteral(fieldNameEEnum, FieldName.ALL_DECLARED_FIELD_NAMES);
    addEEnumLiteral(fieldNameEEnum, FieldName.FULL_TEXT);
    addEEnumLiteral(fieldNameEEnum, FieldName.FIELDS_READ);
    addEEnumLiteral(fieldNameEEnum, FieldName.FIELDS_WRITTEN);
    addEEnumLiteral(fieldNameEEnum, FieldName.USED_FIELDS_IN_FINALLY);
    addEEnumLiteral(fieldNameEEnum, FieldName.USED_FIELDS_IN_TRY);
    addEEnumLiteral(fieldNameEEnum, FieldName.ANNOTATIONS);
    addEEnumLiteral(fieldNameEEnum, FieldName.INSTANCEOF_TYPES);

    // Create resource
    createResource(eNS_URI);
  }

} //LuceneQueryPackageImpl
