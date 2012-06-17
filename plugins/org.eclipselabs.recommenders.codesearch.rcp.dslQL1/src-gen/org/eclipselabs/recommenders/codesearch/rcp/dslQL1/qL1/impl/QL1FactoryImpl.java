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

package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QL1FactoryImpl extends EFactoryImpl implements QL1Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QL1Factory init()
  {
    try
    {
      QL1Factory theQL1Factory = (QL1Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/recommenders/codesearch/rcp/dslQL1/QL1"); 
      if (theQL1Factory != null)
      {
        return theQL1Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QL1FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QL1FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QL1Package.METHOD_PATTERN: return createMethodPattern();
      case QL1Package.METHOD_PATTERN_DEFINITION: return createMethodPatternDefinition();
      case QL1Package.PARAMETER_DEFINITION: return createParameterDefinition();
      case QL1Package.MODIFIER: return createModifier();
      case QL1Package.MODIFIER_VALUE: return createModifierValue();
      case QL1Package.RETURN_TYPE: return createReturnType();
      case QL1Package.PARAMETER_ELEMENT_HOLDER: return createParameterElementHolder();
      case QL1Package.SINGLE_ELEMENT: return createSingleElement();
      case QL1Package.MULTI_ELEMENT: return createMultiElement();
      case QL1Package.PARAMETER_TYPE: return createParameterType();
      case QL1Package.THROWS: return createThrows();
      case QL1Package.METHOD_NAME: return createMethodName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodPattern createMethodPattern()
  {
    MethodPatternImpl methodPattern = new MethodPatternImpl();
    return methodPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodPatternDefinition createMethodPatternDefinition()
  {
    MethodPatternDefinitionImpl methodPatternDefinition = new MethodPatternDefinitionImpl();
    return methodPatternDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDefinition createParameterDefinition()
  {
    ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
    return parameterDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modifier createModifier()
  {
    ModifierImpl modifier = new ModifierImpl();
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifierValue createModifierValue()
  {
    ModifierValueImpl modifierValue = new ModifierValueImpl();
    return modifierValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnType createReturnType()
  {
    ReturnTypeImpl returnType = new ReturnTypeImpl();
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterElementHolder createParameterElementHolder()
  {
    ParameterElementHolderImpl parameterElementHolder = new ParameterElementHolderImpl();
    return parameterElementHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleElement createSingleElement()
  {
    SingleElementImpl singleElement = new SingleElementImpl();
    return singleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiElement createMultiElement()
  {
    MultiElementImpl multiElement = new MultiElementImpl();
    return multiElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType createParameterType()
  {
    ParameterTypeImpl parameterType = new ParameterTypeImpl();
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Throws createThrows()
  {
    ThrowsImpl throws_ = new ThrowsImpl();
    return throws_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName createMethodName()
  {
    MethodNameImpl methodName = new MethodNameImpl();
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QL1Package getQL1Package()
  {
    return (QL1Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QL1Package getPackage()
  {
    return QL1Package.eINSTANCE;
  }

} //QL1FactoryImpl
