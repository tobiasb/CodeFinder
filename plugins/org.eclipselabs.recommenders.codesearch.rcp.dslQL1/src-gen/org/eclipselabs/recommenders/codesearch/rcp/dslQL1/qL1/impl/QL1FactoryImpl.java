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
      case QL1Package.EXP1: return createExp1();
      case QL1Package.FIELD_EXPR: return createFieldExpr();
      case QL1Package.TYPE: return createType();
      case QL1Package.SINGLE_VALUE_FIELD: return createSingleValueField();
      case QL1Package.MULTI_VALUE_FIELD: return createMultiValueField();
      case QL1Package.BOOLEAN_FIELD: return createBooleanField();
      case QL1Package.SINGLE_VALUE_FIELD_NAME: return createSingleValueFieldName();
      case QL1Package.MULTI_VALUE_FIELD_NAME: return createMultiValueFieldName();
      case QL1Package.NEGATION: return createNegation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp1 createExp1()
  {
    Exp1Impl exp1 = new Exp1Impl();
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldExpr createFieldExpr()
  {
    FieldExprImpl fieldExpr = new FieldExprImpl();
    return fieldExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleValueField createSingleValueField()
  {
    SingleValueFieldImpl singleValueField = new SingleValueFieldImpl();
    return singleValueField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiValueField createMultiValueField()
  {
    MultiValueFieldImpl multiValueField = new MultiValueFieldImpl();
    return multiValueField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanField createBooleanField()
  {
    BooleanFieldImpl booleanField = new BooleanFieldImpl();
    return booleanField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleValueFieldName createSingleValueFieldName()
  {
    SingleValueFieldNameImpl singleValueFieldName = new SingleValueFieldNameImpl();
    return singleValueFieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiValueFieldName createMultiValueFieldName()
  {
    MultiValueFieldNameImpl multiValueFieldName = new MultiValueFieldNameImpl();
    return multiValueFieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
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
