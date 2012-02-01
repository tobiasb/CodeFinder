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

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.AnnotationField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.DocumentTypeField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FilePathField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryFactory;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ModifierField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NumberField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ProjectNameField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TimeField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField;

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
  private EClass simpleFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filePathFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifierFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentTypeFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectNameFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationFieldEClass = null;

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
  private EEnum binaryExpEEnum = null;

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
  public EAttribute getClauseExpression_Default()
  {
    return (EAttribute)clauseExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClauseExpression_Field()
  {
    return (EReference)clauseExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClauseExpression_Values()
  {
    return (EAttribute)clauseExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleField()
  {
    return simpleFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_FullyQualifiedName()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_FriendlyName()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_ReturnVariableExpressions()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_AllDeclaredMethodNames()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_DeclaredMethodNames()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_DeclaredFieldNames()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_AllDeclaredFieldNames()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_FullText()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_FieldsRead()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_FieldsWritten()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_UsedFieldsInFinally()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleField_UsedFieldsInTry()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeField()
  {
    return typeFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_ImplementedTypes()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_ExtendedTypes()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_UsedTypes()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_UsedTypesInTry()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_UsedTypesInFinally()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_ParameterTypes()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_ReturnType()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_InstanceofTypes()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_AllImplementedTypes()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_AllExtendedTypes()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_FieldType()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_CaughtType()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_DeclaredFieldTypes()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeField_DeclaringType()
  {
    return (EAttribute)typeFieldEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodField()
  {
    return methodFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodField_UsedMethods()
  {
    return (EAttribute)methodFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodField_UsedMethodsInTry()
  {
    return (EAttribute)methodFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodField_UsedMethodsInFinally()
  {
    return (EAttribute)methodFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodField_OverriddenMethods()
  {
    return (EAttribute)methodFieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodField_DeclaredMethods()
  {
    return (EAttribute)methodFieldEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilePathField()
  {
    return filePathFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilePathField_ResourcePath()
  {
    return (EAttribute)filePathFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberField()
  {
    return numberFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberField_ParameterCount()
  {
    return (EAttribute)numberFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifierField()
  {
    return modifierFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModifierField_Modifiers()
  {
    return (EAttribute)modifierFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeField()
  {
    return timeFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeField_Timestamp()
  {
    return (EAttribute)timeFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentTypeField()
  {
    return documentTypeFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentTypeField_Type()
  {
    return (EAttribute)documentTypeFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectNameField()
  {
    return projectNameFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectNameField_ProjectName()
  {
    return (EAttribute)projectNameFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationField()
  {
    return annotationFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationField_Annotations()
  {
    return (EAttribute)annotationFieldEClass.getEStructuralFeatures().get(0);
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
  public EEnum getBinaryExp()
  {
    return binaryExpEEnum;
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
    createEAttribute(clauseExpressionEClass, CLAUSE_EXPRESSION__DEFAULT);
    createEReference(clauseExpressionEClass, CLAUSE_EXPRESSION__FIELD);
    createEAttribute(clauseExpressionEClass, CLAUSE_EXPRESSION__VALUES);

    simpleFieldEClass = createEClass(SIMPLE_FIELD);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__FULLY_QUALIFIED_NAME);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__FRIENDLY_NAME);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__RETURN_VARIABLE_EXPRESSIONS);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__ALL_DECLARED_METHOD_NAMES);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__DECLARED_METHOD_NAMES);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__DECLARED_FIELD_NAMES);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__ALL_DECLARED_FIELD_NAMES);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__FULL_TEXT);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__FIELDS_READ);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__FIELDS_WRITTEN);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__USED_FIELDS_IN_FINALLY);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__USED_FIELDS_IN_TRY);

    typeFieldEClass = createEClass(TYPE_FIELD);
    createEAttribute(typeFieldEClass, TYPE_FIELD__IMPLEMENTED_TYPES);
    createEAttribute(typeFieldEClass, TYPE_FIELD__EXTENDED_TYPES);
    createEAttribute(typeFieldEClass, TYPE_FIELD__USED_TYPES);
    createEAttribute(typeFieldEClass, TYPE_FIELD__USED_TYPES_IN_TRY);
    createEAttribute(typeFieldEClass, TYPE_FIELD__USED_TYPES_IN_FINALLY);
    createEAttribute(typeFieldEClass, TYPE_FIELD__PARAMETER_TYPES);
    createEAttribute(typeFieldEClass, TYPE_FIELD__RETURN_TYPE);
    createEAttribute(typeFieldEClass, TYPE_FIELD__INSTANCEOF_TYPES);
    createEAttribute(typeFieldEClass, TYPE_FIELD__ALL_IMPLEMENTED_TYPES);
    createEAttribute(typeFieldEClass, TYPE_FIELD__ALL_EXTENDED_TYPES);
    createEAttribute(typeFieldEClass, TYPE_FIELD__FIELD_TYPE);
    createEAttribute(typeFieldEClass, TYPE_FIELD__CAUGHT_TYPE);
    createEAttribute(typeFieldEClass, TYPE_FIELD__DECLARED_FIELD_TYPES);
    createEAttribute(typeFieldEClass, TYPE_FIELD__DECLARING_TYPE);

    methodFieldEClass = createEClass(METHOD_FIELD);
    createEAttribute(methodFieldEClass, METHOD_FIELD__USED_METHODS);
    createEAttribute(methodFieldEClass, METHOD_FIELD__USED_METHODS_IN_TRY);
    createEAttribute(methodFieldEClass, METHOD_FIELD__USED_METHODS_IN_FINALLY);
    createEAttribute(methodFieldEClass, METHOD_FIELD__OVERRIDDEN_METHODS);
    createEAttribute(methodFieldEClass, METHOD_FIELD__DECLARED_METHODS);

    filePathFieldEClass = createEClass(FILE_PATH_FIELD);
    createEAttribute(filePathFieldEClass, FILE_PATH_FIELD__RESOURCE_PATH);

    numberFieldEClass = createEClass(NUMBER_FIELD);
    createEAttribute(numberFieldEClass, NUMBER_FIELD__PARAMETER_COUNT);

    modifierFieldEClass = createEClass(MODIFIER_FIELD);
    createEAttribute(modifierFieldEClass, MODIFIER_FIELD__MODIFIERS);

    timeFieldEClass = createEClass(TIME_FIELD);
    createEAttribute(timeFieldEClass, TIME_FIELD__TIMESTAMP);

    documentTypeFieldEClass = createEClass(DOCUMENT_TYPE_FIELD);
    createEAttribute(documentTypeFieldEClass, DOCUMENT_TYPE_FIELD__TYPE);

    projectNameFieldEClass = createEClass(PROJECT_NAME_FIELD);
    createEAttribute(projectNameFieldEClass, PROJECT_NAME_FIELD__PROJECT_NAME);

    annotationFieldEClass = createEClass(ANNOTATION_FIELD);
    createEAttribute(annotationFieldEClass, ANNOTATION_FIELD__ANNOTATIONS);

    exp1EClass = createEClass(EXP1);
    createEReference(exp1EClass, EXP1__LEFT);
    createEAttribute(exp1EClass, EXP1__B);
    createEReference(exp1EClass, EXP1__RIGHT);

    // Create enums
    binaryExpEEnum = createEEnum(BINARY_EXP);
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
    initEAttribute(getClauseExpression_Default(), ecorePackage.getEString(), "default", null, 0, 1, ClauseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClauseExpression_Field(), ecorePackage.getEObject(), null, "field", null, 0, 1, ClauseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClauseExpression_Values(), ecorePackage.getEString(), "values", null, 0, -1, ClauseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleFieldEClass, SimpleField.class, "SimpleField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleField_FullyQualifiedName(), ecorePackage.getEString(), "FullyQualifiedName", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_FriendlyName(), ecorePackage.getEString(), "FriendlyName", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_ReturnVariableExpressions(), ecorePackage.getEString(), "ReturnVariableExpressions", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_AllDeclaredMethodNames(), ecorePackage.getEString(), "AllDeclaredMethodNames", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_DeclaredMethodNames(), ecorePackage.getEString(), "DeclaredMethodNames", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_DeclaredFieldNames(), ecorePackage.getEString(), "DeclaredFieldNames", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_AllDeclaredFieldNames(), ecorePackage.getEString(), "AllDeclaredFieldNames", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_FullText(), ecorePackage.getEString(), "FullText", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_FieldsRead(), ecorePackage.getEString(), "FieldsRead", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_FieldsWritten(), ecorePackage.getEString(), "FieldsWritten", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_UsedFieldsInFinally(), ecorePackage.getEString(), "UsedFieldsInFinally", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_UsedFieldsInTry(), ecorePackage.getEString(), "UsedFieldsInTry", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeFieldEClass, TypeField.class, "TypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeField_ImplementedTypes(), ecorePackage.getEString(), "ImplementedTypes", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_ExtendedTypes(), ecorePackage.getEString(), "ExtendedTypes", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_UsedTypes(), ecorePackage.getEString(), "UsedTypes", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_UsedTypesInTry(), ecorePackage.getEString(), "UsedTypesInTry", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_UsedTypesInFinally(), ecorePackage.getEString(), "UsedTypesInFinally", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_ParameterTypes(), ecorePackage.getEString(), "ParameterTypes", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_ReturnType(), ecorePackage.getEString(), "ReturnType", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_InstanceofTypes(), ecorePackage.getEString(), "InstanceofTypes", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_AllImplementedTypes(), ecorePackage.getEString(), "AllImplementedTypes", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_AllExtendedTypes(), ecorePackage.getEString(), "AllExtendedTypes", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_FieldType(), ecorePackage.getEString(), "FieldType", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_CaughtType(), ecorePackage.getEString(), "CaughtType", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_DeclaredFieldTypes(), ecorePackage.getEString(), "DeclaredFieldTypes", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeField_DeclaringType(), ecorePackage.getEString(), "DeclaringType", null, 0, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodFieldEClass, MethodField.class, "MethodField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethodField_UsedMethods(), ecorePackage.getEString(), "UsedMethods", null, 0, 1, MethodField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodField_UsedMethodsInTry(), ecorePackage.getEString(), "UsedMethodsInTry", null, 0, 1, MethodField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodField_UsedMethodsInFinally(), ecorePackage.getEString(), "UsedMethodsInFinally", null, 0, 1, MethodField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodField_OverriddenMethods(), ecorePackage.getEString(), "OverriddenMethods", null, 0, 1, MethodField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodField_DeclaredMethods(), ecorePackage.getEString(), "DeclaredMethods", null, 0, 1, MethodField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filePathFieldEClass, FilePathField.class, "FilePathField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFilePathField_ResourcePath(), ecorePackage.getEString(), "ResourcePath", null, 0, 1, FilePathField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberFieldEClass, NumberField.class, "NumberField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberField_ParameterCount(), ecorePackage.getEString(), "ParameterCount", null, 0, 1, NumberField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifierFieldEClass, ModifierField.class, "ModifierField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModifierField_Modifiers(), ecorePackage.getEString(), "Modifiers", null, 0, 1, ModifierField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeFieldEClass, TimeField.class, "TimeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeField_Timestamp(), ecorePackage.getEString(), "Timestamp", null, 0, 1, TimeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentTypeFieldEClass, DocumentTypeField.class, "DocumentTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentTypeField_Type(), ecorePackage.getEString(), "Type", null, 0, 1, DocumentTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectNameFieldEClass, ProjectNameField.class, "ProjectNameField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProjectNameField_ProjectName(), ecorePackage.getEString(), "ProjectName", null, 0, 1, ProjectNameField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationFieldEClass, AnnotationField.class, "AnnotationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotationField_Annotations(), ecorePackage.getEString(), "Annotations", null, 0, 1, AnnotationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exp1EClass, Exp1.class, "Exp1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExp1_Left(), this.getExpression(), null, "left", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExp1_B(), this.getBinaryExp(), "b", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExp1_Right(), this.getExpression(), null, "right", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(binaryExpEEnum, BinaryExp.class, "BinaryExp");
    addEEnumLiteral(binaryExpEEnum, BinaryExp.AND1);
    addEEnumLiteral(binaryExpEEnum, BinaryExp.OR1);
    addEEnumLiteral(binaryExpEEnum, BinaryExp.OR2);

    // Create resource
    createResource(eNS_URI);
  }

} //LuceneQueryPackageImpl
