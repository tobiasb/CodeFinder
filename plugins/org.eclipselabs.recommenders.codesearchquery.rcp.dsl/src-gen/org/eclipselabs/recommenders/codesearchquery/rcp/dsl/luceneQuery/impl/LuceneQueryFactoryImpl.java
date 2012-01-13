/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LuceneQueryFactoryImpl extends EFactoryImpl implements LuceneQueryFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LuceneQueryFactory init()
  {
    try
    {
      LuceneQueryFactory theLuceneQueryFactory = (LuceneQueryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/recommenders/codesearchquery/rcp/dsl/LuceneQuery"); 
      if (theLuceneQueryFactory != null)
      {
        return theLuceneQueryFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LuceneQueryFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuceneQueryFactoryImpl()
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
      case LuceneQueryPackage.EXPRESSION: return createExpression();
      case LuceneQueryPackage.CLAUSE_EXPRESSION: return createClauseExpression();
      case LuceneQueryPackage.SIMPLE_CLAUSE: return createSimpleClause();
      case LuceneQueryPackage.TYPE_CLAUSE: return createTypeClause();
      case LuceneQueryPackage.TYPE_TEST: return createTypeTest();
      case LuceneQueryPackage.FIELD_NAME: return createFieldName();
      case LuceneQueryPackage.TYPE_FIELD_NAME: return createTypeFieldName();
      case LuceneQueryPackage.EXP1: return createExp1();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LuceneQueryPackage.BOOLEAN_EXP:
        return createBooleanExpFromString(eDataType, initialValue);
      case LuceneQueryPackage.NOT_EXPRESSION:
        return createNotExpressionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LuceneQueryPackage.BOOLEAN_EXP:
        return convertBooleanExpToString(eDataType, instanceValue);
      case LuceneQueryPackage.NOT_EXPRESSION:
        return convertNotExpressionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClauseExpression createClauseExpression()
  {
    ClauseExpressionImpl clauseExpression = new ClauseExpressionImpl();
    return clauseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleClause createSimpleClause()
  {
    SimpleClauseImpl simpleClause = new SimpleClauseImpl();
    return simpleClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeClause createTypeClause()
  {
    TypeClauseImpl typeClause = new TypeClauseImpl();
    return typeClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTest createTypeTest()
  {
    TypeTestImpl typeTest = new TypeTestImpl();
    return typeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldName createFieldName()
  {
    FieldNameImpl fieldName = new FieldNameImpl();
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFieldName createTypeFieldName()
  {
    TypeFieldNameImpl typeFieldName = new TypeFieldNameImpl();
    return typeFieldName;
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
  public BooleanExp createBooleanExpFromString(EDataType eDataType, String initialValue)
  {
    BooleanExp result = BooleanExp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanExpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotExpression createNotExpressionFromString(EDataType eDataType, String initialValue)
  {
    NotExpression result = NotExpression.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNotExpressionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuceneQueryPackage getLuceneQueryPackage()
  {
    return (LuceneQueryPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LuceneQueryPackage getPackage()
  {
    return LuceneQueryPackage.eINSTANCE;
  }

} //LuceneQueryFactoryImpl
