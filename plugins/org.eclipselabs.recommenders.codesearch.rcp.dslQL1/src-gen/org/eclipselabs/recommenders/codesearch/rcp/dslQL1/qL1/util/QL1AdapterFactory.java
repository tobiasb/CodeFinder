/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package
 * @generated
 */
public class QL1AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QL1Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QL1AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = QL1Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QL1Switch<Adapter> modelSwitch =
    new QL1Switch<Adapter>()
    {
      @Override
      public Adapter caseMethodPattern(MethodPattern object)
      {
        return createMethodPatternAdapter();
      }
      @Override
      public Adapter caseMethodPatternDefinition(MethodPatternDefinition object)
      {
        return createMethodPatternDefinitionAdapter();
      }
      @Override
      public Adapter caseParameterDefinition(ParameterDefinition object)
      {
        return createParameterDefinitionAdapter();
      }
      @Override
      public Adapter caseModifier(Modifier object)
      {
        return createModifierAdapter();
      }
      @Override
      public Adapter caseModifierValue(ModifierValue object)
      {
        return createModifierValueAdapter();
      }
      @Override
      public Adapter caseReturnType(ReturnType object)
      {
        return createReturnTypeAdapter();
      }
      @Override
      public Adapter caseParameterElementHolder(ParameterElementHolder object)
      {
        return createParameterElementHolderAdapter();
      }
      @Override
      public Adapter caseSingleElement(SingleElement object)
      {
        return createSingleElementAdapter();
      }
      @Override
      public Adapter caseMultiElement(MultiElement object)
      {
        return createMultiElementAdapter();
      }
      @Override
      public Adapter caseParameterType(ParameterType object)
      {
        return createParameterTypeAdapter();
      }
      @Override
      public Adapter caseThrows(Throws object)
      {
        return createThrowsAdapter();
      }
      @Override
      public Adapter caseMethodName(MethodName object)
      {
        return createMethodNameAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern <em>Method Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern
   * @generated
   */
  public Adapter createMethodPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition <em>Method Pattern Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition
   * @generated
   */
  public Adapter createMethodPatternDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition <em>Parameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition
   * @generated
   */
  public Adapter createParameterDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier
   * @generated
   */
  public Adapter createModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierValue <em>Modifier Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierValue
   * @generated
   */
  public Adapter createModifierValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType
   * @generated
   */
  public Adapter createReturnTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder <em>Parameter Element Holder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder
   * @generated
   */
  public Adapter createParameterElementHolderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleElement <em>Single Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleElement
   * @generated
   */
  public Adapter createSingleElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiElement <em>Multi Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiElement
   * @generated
   */
  public Adapter createMultiElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType
   * @generated
   */
  public Adapter createParameterTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws <em>Throws</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws
   * @generated
   */
  public Adapter createThrowsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName
   * @generated
   */
  public Adapter createMethodNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //QL1AdapterFactory
