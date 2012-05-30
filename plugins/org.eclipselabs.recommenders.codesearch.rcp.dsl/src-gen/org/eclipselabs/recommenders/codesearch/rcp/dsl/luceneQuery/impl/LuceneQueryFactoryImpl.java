/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.*;

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
      LuceneQueryFactory theLuceneQueryFactory = (LuceneQueryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/recommenders/codesearch/rcp/dsl/LuceneQuery"); 
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
      case LuceneQueryPackage.SIMPLE_FIELD: return createSimpleField();
      case LuceneQueryPackage.TYPE_FIELD: return createTypeField();
      case LuceneQueryPackage.METHOD_FIELD: return createMethodField();
      case LuceneQueryPackage.FILE_PATH_FIELD: return createFilePathField();
      case LuceneQueryPackage.NUMBER_FIELD: return createNumberField();
      case LuceneQueryPackage.MODIFIER_FIELD: return createModifierField();
      case LuceneQueryPackage.TIME_FIELD: return createTimeField();
      case LuceneQueryPackage.DOCUMENT_TYPE_FIELD: return createDocumentTypeField();
      case LuceneQueryPackage.PROJECT_NAME_FIELD: return createProjectNameField();
      case LuceneQueryPackage.DEFINITION_TYPE: return createDefinitionType();
      case LuceneQueryPackage.OR_EXP: return createOrExp();
      case LuceneQueryPackage.AND_EXP: return createAndExp();
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
      case LuceneQueryPackage.BINARY_EXP:
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
      case LuceneQueryPackage.BINARY_EXP:
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
  public SimpleField createSimpleField()
  {
    SimpleFieldImpl simpleField = new SimpleFieldImpl();
    return simpleField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeField createTypeField()
  {
    TypeFieldImpl typeField = new TypeFieldImpl();
    return typeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodField createMethodField()
  {
    MethodFieldImpl methodField = new MethodFieldImpl();
    return methodField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilePathField createFilePathField()
  {
    FilePathFieldImpl filePathField = new FilePathFieldImpl();
    return filePathField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberField createNumberField()
  {
    NumberFieldImpl numberField = new NumberFieldImpl();
    return numberField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifierField createModifierField()
  {
    ModifierFieldImpl modifierField = new ModifierFieldImpl();
    return modifierField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeField createTimeField()
  {
    TimeFieldImpl timeField = new TimeFieldImpl();
    return timeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentTypeField createDocumentTypeField()
  {
    DocumentTypeFieldImpl documentTypeField = new DocumentTypeFieldImpl();
    return documentTypeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectNameField createProjectNameField()
  {
    ProjectNameFieldImpl projectNameField = new ProjectNameFieldImpl();
    return projectNameField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionType createDefinitionType()
  {
    DefinitionTypeImpl definitionType = new DefinitionTypeImpl();
    return definitionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExp createOrExp()
  {
    OrExpImpl orExp = new OrExpImpl();
    return orExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExp createAndExp()
  {
    AndExpImpl andExp = new AndExpImpl();
    return andExp;
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
