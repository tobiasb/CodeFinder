/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.BooleanField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.Exp1;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.FieldExpr;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.MultiValueField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.MultiValueFieldName;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.Negation;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Factory;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Package;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.SingleValueField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.SingleValueFieldName;
import org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QL1PackageImpl extends EPackageImpl implements QL1Package
{
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
  private EClass fieldExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleValueFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiValueFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleValueFieldNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiValueFieldNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negationEClass = null;

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
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Package#eNS_URI
   * @see #init()
   * @generated
   */
  private QL1PackageImpl()
  {
    super(eNS_URI, QL1Factory.eINSTANCE);
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
   * <p>This method is used to initialize {@link QL1Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static QL1Package init()
  {
    if (isInited) return (QL1Package)EPackage.Registry.INSTANCE.getEPackage(QL1Package.eNS_URI);

    // Obtain or create and register package
    QL1PackageImpl theQL1Package = (QL1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QL1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QL1PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theQL1Package.createPackageContents();

    // Initialize created meta-data
    theQL1Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theQL1Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(QL1Package.eNS_URI, theQL1Package);
    return theQL1Package;
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
  public EReference getExp1_Type()
  {
    return (EReference)exp1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExp1_FieldExpr()
  {
    return (EReference)exp1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldExpr()
  {
    return fieldExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Value()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Method()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleValueField()
  {
    return singleValueFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleValueField_Name()
  {
    return (EReference)singleValueFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleValueField_N()
  {
    return (EReference)singleValueFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleValueField_Value()
  {
    return (EAttribute)singleValueFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiValueField()
  {
    return multiValueFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiValueField_Name()
  {
    return (EReference)multiValueFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiValueField_Values()
  {
    return (EAttribute)multiValueFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanField()
  {
    return booleanFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanField_N()
  {
    return (EReference)booleanFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanField_Value()
  {
    return (EAttribute)booleanFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleValueFieldName()
  {
    return singleValueFieldNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleValueFieldName_Value()
  {
    return (EAttribute)singleValueFieldNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiValueFieldName()
  {
    return multiValueFieldNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiValueFieldName_Value()
  {
    return (EAttribute)multiValueFieldNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegation()
  {
    return negationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNegation_Value()
  {
    return (EAttribute)negationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QL1Factory getQL1Factory()
  {
    return (QL1Factory)getEFactoryInstance();
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
    exp1EClass = createEClass(EXP1);
    createEReference(exp1EClass, EXP1__TYPE);
    createEReference(exp1EClass, EXP1__FIELD_EXPR);

    fieldExprEClass = createEClass(FIELD_EXPR);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__VALUE);
    createEAttribute(typeEClass, TYPE__METHOD);

    singleValueFieldEClass = createEClass(SINGLE_VALUE_FIELD);
    createEReference(singleValueFieldEClass, SINGLE_VALUE_FIELD__NAME);
    createEReference(singleValueFieldEClass, SINGLE_VALUE_FIELD__N);
    createEAttribute(singleValueFieldEClass, SINGLE_VALUE_FIELD__VALUE);

    multiValueFieldEClass = createEClass(MULTI_VALUE_FIELD);
    createEReference(multiValueFieldEClass, MULTI_VALUE_FIELD__NAME);
    createEAttribute(multiValueFieldEClass, MULTI_VALUE_FIELD__VALUES);

    booleanFieldEClass = createEClass(BOOLEAN_FIELD);
    createEReference(booleanFieldEClass, BOOLEAN_FIELD__N);
    createEAttribute(booleanFieldEClass, BOOLEAN_FIELD__VALUE);

    singleValueFieldNameEClass = createEClass(SINGLE_VALUE_FIELD_NAME);
    createEAttribute(singleValueFieldNameEClass, SINGLE_VALUE_FIELD_NAME__VALUE);

    multiValueFieldNameEClass = createEClass(MULTI_VALUE_FIELD_NAME);
    createEAttribute(multiValueFieldNameEClass, MULTI_VALUE_FIELD_NAME__VALUE);

    negationEClass = createEClass(NEGATION);
    createEAttribute(negationEClass, NEGATION__VALUE);
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
    singleValueFieldEClass.getESuperTypes().add(this.getFieldExpr());
    multiValueFieldEClass.getESuperTypes().add(this.getFieldExpr());
    booleanFieldEClass.getESuperTypes().add(this.getFieldExpr());

    // Initialize classes and features; add operations and parameters
    initEClass(exp1EClass, Exp1.class, "Exp1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExp1_Type(), this.getType(), null, "type", null, 0, 1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExp1_FieldExpr(), this.getFieldExpr(), null, "fieldExpr", null, 0, -1, Exp1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldExprEClass, FieldExpr.class, "FieldExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Value(), ecorePackage.getEString(), "value", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Method(), ecorePackage.getEString(), "method", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleValueFieldEClass, SingleValueField.class, "SingleValueField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleValueField_Name(), this.getSingleValueFieldName(), null, "name", null, 0, 1, SingleValueField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSingleValueField_N(), this.getNegation(), null, "n", null, 0, 1, SingleValueField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleValueField_Value(), ecorePackage.getEString(), "value", null, 0, 1, SingleValueField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiValueFieldEClass, MultiValueField.class, "MultiValueField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiValueField_Name(), this.getMultiValueFieldName(), null, "name", null, 0, 1, MultiValueField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiValueField_Values(), ecorePackage.getEString(), "values", null, 0, -1, MultiValueField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanFieldEClass, BooleanField.class, "BooleanField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanField_N(), this.getNegation(), null, "n", null, 0, 1, BooleanField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanField_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleValueFieldNameEClass, SingleValueFieldName.class, "SingleValueFieldName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSingleValueFieldName_Value(), ecorePackage.getEString(), "value", null, 0, 1, SingleValueFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiValueFieldNameEClass, MultiValueFieldName.class, "MultiValueFieldName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiValueFieldName_Value(), ecorePackage.getEString(), "value", null, 0, 1, MultiValueFieldName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNegation_Value(), ecorePackage.getEString(), "value", null, 0, 1, Negation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //QL1PackageImpl
