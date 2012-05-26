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
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__DEFINITION = 0;

  /**
   * The number of structural features of the '<em>Method Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternDefinitionImpl <em>Method Pattern Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternDefinitionImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMethodPatternDefinition()
   * @generated
   */
  int METHOD_PATTERN_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_DEFINITION__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_DEFINITION__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_DEFINITION__METHOD_NAME = 2;

  /**
   * The feature id for the '<em><b>Parameter Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Throws Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_DEFINITION__THROWS_CLAUSE = 4;

  /**
   * The number of structural features of the '<em>Method Pattern Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterDefinitionImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getParameterDefinition()
   * @generated
   */
  int PARAMETER_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Parameter Elementholder</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFINITION__PARAMETER_ELEMENTHOLDER = 0;

  /**
   * The number of structural features of the '<em>Parameter Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 3;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__MODIFIERS = 0;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierValueImpl <em>Modifier Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierValueImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getModifierValue()
   * @generated
   */
  int MODIFIER_VALUE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Modifier Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ReturnTypeImpl <em>Return Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ReturnTypeImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getReturnType()
   * @generated
   */
  int RETURN_TYPE = 5;

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
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementHolderImpl <em>Parameter Element Holder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementHolderImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getParameterElementHolder()
   * @generated
   */
  int PARAMETER_ELEMENT_HOLDER = 6;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ELEMENT_HOLDER__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Parameter Element Holder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ELEMENT_HOLDER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleElementImpl <em>Single Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleElementImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getSingleElement()
   * @generated
   */
  int SINGLE_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_ELEMENT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Single Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiElementImpl <em>Multi Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiElementImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMultiElement()
   * @generated
   */
  int MULTI_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ELEMENT__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Multi Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterTypeImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getParameterType()
   * @generated
   */
  int PARAMETER_TYPE = 9;

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
  int THROWS = 10;

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
  int METHOD_NAME = 11;

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
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getDefinition()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_Definition();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition <em>Method Pattern Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Pattern Definition</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition
   * @generated
   */
  EClass getMethodPatternDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modifier</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getModifier()
   * @see #getMethodPatternDefinition()
   * @generated
   */
  EReference getMethodPatternDefinition_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getReturnType()
   * @see #getMethodPatternDefinition()
   * @generated
   */
  EReference getMethodPatternDefinition_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getMethodName()
   * @see #getMethodPatternDefinition()
   * @generated
   */
  EReference getMethodPatternDefinition_MethodName();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getParameterDefinition <em>Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Definition</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getParameterDefinition()
   * @see #getMethodPatternDefinition()
   * @generated
   */
  EReference getMethodPatternDefinition_ParameterDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getThrowsClause <em>Throws Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Throws Clause</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition#getThrowsClause()
   * @see #getMethodPatternDefinition()
   * @generated
   */
  EReference getMethodPatternDefinition_ThrowsClause();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition <em>Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Definition</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition
   * @generated
   */
  EClass getParameterDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition#getParameterElementholder <em>Parameter Elementholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Elementholder</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition#getParameterElementholder()
   * @see #getParameterDefinition()
   * @generated
   */
  EReference getParameterDefinition_ParameterElementholder();

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
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier#getModifiers()
   * @see #getModifier()
   * @generated
   */
  EReference getModifier_Modifiers();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierValue <em>Modifier Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierValue
   * @generated
   */
  EClass getModifierValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierValue#getValue()
   * @see #getModifierValue()
   * @generated
   */
  EAttribute getModifierValue_Value();

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
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder <em>Parameter Element Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Element Holder</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder
   * @generated
   */
  EClass getParameterElementHolder();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder#getElement()
   * @see #getParameterElementHolder()
   * @generated
   */
  EReference getParameterElementHolder_Element();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleElement <em>Single Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Element</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleElement
   * @generated
   */
  EClass getSingleElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleElement#getValue()
   * @see #getSingleElement()
   * @generated
   */
  EReference getSingleElement_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiElement <em>Multi Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Element</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiElement
   * @generated
   */
  EClass getMultiElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiElement#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiElement#getElements()
   * @see #getMultiElement()
   * @generated
   */
  EReference getMultiElement_Elements();

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
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__DEFINITION = eINSTANCE.getMethodPattern_Definition();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternDefinitionImpl <em>Method Pattern Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternDefinitionImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMethodPatternDefinition()
     * @generated
     */
    EClass METHOD_PATTERN_DEFINITION = eINSTANCE.getMethodPatternDefinition();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN_DEFINITION__MODIFIER = eINSTANCE.getMethodPatternDefinition_Modifier();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN_DEFINITION__RETURN_TYPE = eINSTANCE.getMethodPatternDefinition_ReturnType();

    /**
     * The meta object literal for the '<em><b>Method Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN_DEFINITION__METHOD_NAME = eINSTANCE.getMethodPatternDefinition_MethodName();

    /**
     * The meta object literal for the '<em><b>Parameter Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION = eINSTANCE.getMethodPatternDefinition_ParameterDefinition();

    /**
     * The meta object literal for the '<em><b>Throws Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN_DEFINITION__THROWS_CLAUSE = eINSTANCE.getMethodPatternDefinition_ThrowsClause();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterDefinitionImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getParameterDefinition()
     * @generated
     */
    EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

    /**
     * The meta object literal for the '<em><b>Parameter Elementholder</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_DEFINITION__PARAMETER_ELEMENTHOLDER = eINSTANCE.getParameterDefinition_ParameterElementholder();

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
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODIFIER__MODIFIERS = eINSTANCE.getModifier_Modifiers();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierValueImpl <em>Modifier Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ModifierValueImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getModifierValue()
     * @generated
     */
    EClass MODIFIER_VALUE = eINSTANCE.getModifierValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER_VALUE__VALUE = eINSTANCE.getModifierValue_Value();

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
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementHolderImpl <em>Parameter Element Holder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementHolderImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getParameterElementHolder()
     * @generated
     */
    EClass PARAMETER_ELEMENT_HOLDER = eINSTANCE.getParameterElementHolder();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ELEMENT_HOLDER__ELEMENT = eINSTANCE.getParameterElementHolder_Element();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleElementImpl <em>Single Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleElementImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getSingleElement()
     * @generated
     */
    EClass SINGLE_ELEMENT = eINSTANCE.getSingleElement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_ELEMENT__VALUE = eINSTANCE.getSingleElement_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiElementImpl <em>Multi Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiElementImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMultiElement()
     * @generated
     */
    EClass MULTI_ELEMENT = eINSTANCE.getMultiElement();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_ELEMENT__ELEMENTS = eINSTANCE.getMultiElement_Elements();

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
