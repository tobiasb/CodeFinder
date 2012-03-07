/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Factory;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws;

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
  private EClass methodPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass throwsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodNameEClass = null;

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
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#eNS_URI
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
  public EClass getMethodPattern()
  {
    return methodPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_Modifiers()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_ReturnType()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_MethodName()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_ParameterElements()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_ThrowsClause()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifier()
  {
    return modifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModifier_Value()
  {
    return (EAttribute)modifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnType()
  {
    return returnTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReturnType_Value()
  {
    return (EAttribute)returnTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterElement()
  {
    return parameterElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterElement_Values()
  {
    return (EReference)parameterElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterElement_Types()
  {
    return (EReference)parameterElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterType()
  {
    return parameterTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterType_Value()
  {
    return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThrows()
  {
    return throwsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThrows_Value()
  {
    return (EAttribute)throwsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodName()
  {
    return methodNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodName_Value()
  {
    return (EAttribute)methodNameEClass.getEStructuralFeatures().get(0);
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
    methodPatternEClass = createEClass(METHOD_PATTERN);
    createEReference(methodPatternEClass, METHOD_PATTERN__MODIFIERS);
    createEReference(methodPatternEClass, METHOD_PATTERN__RETURN_TYPE);
    createEReference(methodPatternEClass, METHOD_PATTERN__METHOD_NAME);
    createEReference(methodPatternEClass, METHOD_PATTERN__PARAMETER_ELEMENTS);
    createEReference(methodPatternEClass, METHOD_PATTERN__THROWS_CLAUSE);

    modifierEClass = createEClass(MODIFIER);
    createEAttribute(modifierEClass, MODIFIER__VALUE);

    returnTypeEClass = createEClass(RETURN_TYPE);
    createEAttribute(returnTypeEClass, RETURN_TYPE__VALUE);

    parameterElementEClass = createEClass(PARAMETER_ELEMENT);
    createEReference(parameterElementEClass, PARAMETER_ELEMENT__VALUES);
    createEReference(parameterElementEClass, PARAMETER_ELEMENT__TYPES);

    parameterTypeEClass = createEClass(PARAMETER_TYPE);
    createEAttribute(parameterTypeEClass, PARAMETER_TYPE__VALUE);

    throwsEClass = createEClass(THROWS);
    createEAttribute(throwsEClass, THROWS__VALUE);

    methodNameEClass = createEClass(METHOD_NAME);
    createEAttribute(methodNameEClass, METHOD_NAME__VALUE);
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

    // Initialize classes and features; add operations and parameters
    initEClass(methodPatternEClass, MethodPattern.class, "MethodPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodPattern_Modifiers(), this.getModifier(), null, "modifiers", null, 0, -1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodPattern_ReturnType(), this.getReturnType(), null, "returnType", null, 0, 1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodPattern_MethodName(), this.getMethodName(), null, "methodName", null, 0, 1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodPattern_ParameterElements(), this.getParameterElement(), null, "parameterElements", null, 0, -1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodPattern_ThrowsClause(), this.getThrows(), null, "throwsClause", null, 0, 1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifierEClass, Modifier.class, "Modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModifier_Value(), ecorePackage.getEString(), "value", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnTypeEClass, ReturnType.class, "ReturnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReturnType_Value(), ecorePackage.getEString(), "value", null, 0, 1, ReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterElementEClass, ParameterElement.class, "ParameterElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterElement_Values(), this.getParameterType(), null, "values", null, 0, -1, ParameterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterElement_Types(), this.getParameterType(), null, "types", null, 0, -1, ParameterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterType_Value(), ecorePackage.getEString(), "value", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(throwsEClass, Throws.class, "Throws", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getThrows_Value(), ecorePackage.getEString(), "value", null, 0, 1, Throws.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodNameEClass, MethodName.class, "MethodName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethodName_Value(), ecorePackage.getEString(), "value", null, 0, 1, MethodName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //QL1PackageImpl
