/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
      case QL1Package.FIRST: return createFirst();
      case QL1Package.CONTAINS: return createContains();
      case QL1Package.EXPRESSION: return createExpression();
      case QL1Package.FIELD_EXPR: return createFieldExpr();
      case QL1Package.TYPE: return createType();
      case QL1Package.SINGLE_VALUE_FIELD: return createSingleValueField();
      case QL1Package.MULTI_VALUE_FIELD: return createMultiValueField();
      case QL1Package.BOOLEAN_FIELD: return createBooleanField();
      case QL1Package.SINGLE_VALUE_FIELD_NAME: return createSingleValueFieldName();
      case QL1Package.MULTI_VALUE_FIELD_NAME: return createMultiValueFieldName();
      case QL1Package.NEGATION: return createNegation();
      case QL1Package.OR_EXPR: return createOrExpr();
      case QL1Package.MULTIPLICATION: return createMultiplication();
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
      case QL1Package.BINARY_EXP:
        return createBinaryExpFromString(eDataType, initialValue);
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
      case QL1Package.BINARY_EXP:
        return convertBinaryExpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public First createFirst()
  {
    FirstImpl first = new FirstImpl();
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contains createContains()
  {
    ContainsImpl contains = new ContainsImpl();
    return contains;
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
  public OrExpr createOrExpr()
  {
    OrExprImpl orExpr = new OrExprImpl();
    return orExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExp createBinaryExpFromString(EDataType eDataType, String initialValue)
  {
    BinaryExp result = BinaryExp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryExpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
