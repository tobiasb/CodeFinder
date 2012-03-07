/**
 * <copyright>
 * </copyright>
 *

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
      case QL1Package.MODIFIER: return createModifier();
      case QL1Package.RETURN_TYPE: return createReturnType();
      case QL1Package.PARAMETER_ELEMENT: return createParameterElement();
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
  public ParameterElement createParameterElement()
  {
    ParameterElementImpl parameterElement = new ParameterElementImpl();
    return parameterElement;
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
