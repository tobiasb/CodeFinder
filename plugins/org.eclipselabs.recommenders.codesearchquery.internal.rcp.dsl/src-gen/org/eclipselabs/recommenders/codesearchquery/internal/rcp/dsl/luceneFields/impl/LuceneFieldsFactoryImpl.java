/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LuceneFieldsFactoryImpl extends EFactoryImpl implements LuceneFieldsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LuceneFieldsFactory init()
  {
    try
    {
      LuceneFieldsFactory theLuceneFieldsFactory = (LuceneFieldsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/recommenders/codesearchquery/internal/rcp/dsl/LuceneFields"); 
      if (theLuceneFieldsFactory != null)
      {
        return theLuceneFieldsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LuceneFieldsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuceneFieldsFactoryImpl()
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
      case LuceneFieldsPackage.MODEL: return createModel();
      case LuceneFieldsPackage.FIELD: return createField();
      case LuceneFieldsPackage.FIELD_TYPE: return createFieldType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldType createFieldType()
  {
    FieldTypeImpl fieldType = new FieldTypeImpl();
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuceneFieldsPackage getLuceneFieldsPackage()
  {
    return (LuceneFieldsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LuceneFieldsPackage getPackage()
  {
    return LuceneFieldsPackage.eINSTANCE;
  }

} //LuceneFieldsFactoryImpl
