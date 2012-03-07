/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Factory
 * @model kind="package"
 * @generated
 */
public interface QL1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "qL1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/recommenders/codesearch/rcp/dslQL1/QL1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "qL1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QL1Package eINSTANCE = org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl <em>Method Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMethodPattern()
   * @generated
   */
  int METHOD_PATTERN = 0;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__METHOD_NAME = 2;

  /**
   * The feature id for the '<em><b>Parameter Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__PARAMETER_ELEMENTS = 3;

  /**
   * The feature id for the '<em><b>Throws Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__THROWS_CLAUSE = 4;

  /**
   * The number of structural features of the '<em>Method Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__VALUE = 0;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ReturnTypeImpl <em>Return Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ReturnTypeImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getReturnType()
   * @generated
   */
  int RETURN_TYPE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_TYPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Return Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementImpl <em>Parameter Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getParameterElement()
   * @generated
   */
  int PARAMETER_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ELEMENT__VALUES = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ELEMENT__TYPES = 1;

  /**
   * The number of structural features of the '<em>Parameter Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterTypeImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getParameterType()
   * @generated
   */
  int PARAMETER_TYPE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Parameter Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ThrowsImpl <em>Throws</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ThrowsImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getThrows()
   * @generated
   */
  int THROWS = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROWS__VALUE = 0;

  /**
   * The number of structural features of the '<em>Throws</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROWS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodNameImpl <em>Method Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodNameImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMethodName()
   * @generated
   */
  int METHOD_NAME = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_NAME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Method Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_NAME_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern <em>Method Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Pattern</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern
   * @generated
   */
  EClass getMethodPattern();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getModifiers()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getReturnType()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getMethodName()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_MethodName();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getParameterElements <em>Parameter Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Elements</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getParameterElements()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_ParameterElements();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getThrowsClause <em>Throws Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Throws Clause</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getThrowsClause()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_ThrowsClause();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier
   * @generated
   */
  EClass getModifier();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier#getValue()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType
   * @generated
   */
  EClass getReturnType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType#getValue()
   * @see #getReturnType()
   * @generated
   */
  EAttribute getReturnType_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement <em>Parameter Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Element</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement
   * @generated
   */
  EClass getParameterElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement#getValues()
   * @see #getParameterElement()
   * @generated
   */
  EReference getParameterElement_Values();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement#getTypes()
   * @see #getParameterElement()
   * @generated
   */
  EReference getParameterElement_Types();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType
   * @generated
   */
  EClass getParameterType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType#getValue()
   * @see #getParameterType()
   * @generated
   */
  EAttribute getParameterType_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws <em>Throws</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Throws</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws
   * @generated
   */
  EClass getThrows();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws#getValue()
   * @see #getThrows()
   * @generated
   */
  EAttribute getThrows_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName
   * @generated
   */
  EClass getMethodName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName#getValue()
   * @see #getMethodName()
   * @generated
   */
  EAttribute getMethodName_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QL1Factory getQL1Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl <em>Method Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMethodPattern()
     * @generated
     */
    EClass METHOD_PATTERN = eINSTANCE.getMethodPattern();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__MODIFIERS = eINSTANCE.getMethodPattern_Modifiers();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__RETURN_TYPE = eINSTANCE.getMethodPattern_ReturnType();

    /**
     * The meta object literal for the '<em><b>Method Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__METHOD_NAME = eINSTANCE.getMethodPattern_MethodName();

    /**
     * The meta object literal for the '<em><b>Parameter Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__PARAMETER_ELEMENTS = eINSTANCE.getMethodPattern_ParameterElements();

    /**
     * The meta object literal for the '<em><b>Throws Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__THROWS_CLAUSE = eINSTANCE.getMethodPattern_ThrowsClause();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierImpl <em>Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getModifier()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__VALUE = eINSTANCE.getModifier_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ReturnTypeImpl <em>Return Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ReturnTypeImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getReturnType()
     * @generated
     */
    EClass RETURN_TYPE = eINSTANCE.getReturnType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN_TYPE__VALUE = eINSTANCE.getReturnType_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementImpl <em>Parameter Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getParameterElement()
     * @generated
     */
    EClass PARAMETER_ELEMENT = eINSTANCE.getParameterElement();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ELEMENT__VALUES = eINSTANCE.getParameterElement_Values();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ELEMENT__TYPES = eINSTANCE.getParameterElement_Types();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterTypeImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getParameterType()
     * @generated
     */
    EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_TYPE__VALUE = eINSTANCE.getParameterType_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ThrowsImpl <em>Throws</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ThrowsImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getThrows()
     * @generated
     */
    EClass THROWS = eINSTANCE.getThrows();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THROWS__VALUE = eINSTANCE.getThrows_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodNameImpl <em>Method Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodNameImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMethodName()
     * @generated
     */
    EClass METHOD_NAME = eINSTANCE.getMethodName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_NAME__VALUE = eINSTANCE.getMethodName_Value();

  }

} //QL1Package
