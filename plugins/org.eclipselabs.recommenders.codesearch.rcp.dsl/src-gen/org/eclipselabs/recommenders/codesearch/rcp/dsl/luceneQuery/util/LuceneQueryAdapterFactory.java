/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryPackage
 * @generated
 */
public class LuceneQueryAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LuceneQueryPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuceneQueryAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LuceneQueryPackage.eINSTANCE;
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
  protected LuceneQuerySwitch<Adapter> modelSwitch =
    new LuceneQuerySwitch<Adapter>()
    {
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseClauseExpression(ClauseExpression object)
      {
        return createClauseExpressionAdapter();
      }
      @Override
      public Adapter caseSimpleField(SimpleField object)
      {
        return createSimpleFieldAdapter();
      }
      @Override
      public Adapter caseTypeField(TypeField object)
      {
        return createTypeFieldAdapter();
      }
      @Override
      public Adapter caseMethodField(MethodField object)
      {
        return createMethodFieldAdapter();
      }
      @Override
      public Adapter caseFilePathField(FilePathField object)
      {
        return createFilePathFieldAdapter();
      }
      @Override
      public Adapter caseNumberField(NumberField object)
      {
        return createNumberFieldAdapter();
      }
      @Override
      public Adapter caseModifierField(ModifierField object)
      {
        return createModifierFieldAdapter();
      }
      @Override
      public Adapter caseTimeField(TimeField object)
      {
        return createTimeFieldAdapter();
      }
      @Override
      public Adapter caseDocumentTypeField(DocumentTypeField object)
      {
        return createDocumentTypeFieldAdapter();
      }
      @Override
      public Adapter caseProjectNameField(ProjectNameField object)
      {
        return createProjectNameFieldAdapter();
      }
      @Override
      public Adapter caseDefinitionType(DefinitionType object)
      {
        return createDefinitionTypeAdapter();
      }
      @Override
      public Adapter caseOrExp(OrExp object)
      {
        return createOrExpAdapter();
      }
      @Override
      public Adapter caseAndExp(AndExp object)
      {
        return createAndExpAdapter();
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
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression <em>Clause Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression
   * @generated
   */
  public Adapter createClauseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField <em>Simple Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField
   * @generated
   */
  public Adapter createSimpleFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField <em>Type Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField
   * @generated
   */
  public Adapter createTypeFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField <em>Method Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField
   * @generated
   */
  public Adapter createMethodFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.FilePathField <em>File Path Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.FilePathField
   * @generated
   */
  public Adapter createFilePathFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.NumberField <em>Number Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.NumberField
   * @generated
   */
  public Adapter createNumberFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField <em>Modifier Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField
   * @generated
   */
  public Adapter createModifierFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TimeField <em>Time Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TimeField
   * @generated
   */
  public Adapter createTimeFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField <em>Document Type Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField
   * @generated
   */
  public Adapter createDocumentTypeFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ProjectNameField <em>Project Name Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ProjectNameField
   * @generated
   */
  public Adapter createProjectNameFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionType <em>Definition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionType
   * @generated
   */
  public Adapter createDefinitionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp <em>Or Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp
   * @generated
   */
  public Adapter createOrExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp <em>And Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp
   * @generated
   */
  public Adapter createAndExpAdapter()
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

} //LuceneQueryAdapterFactory
