/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryFactory
 * @model kind="package"
 * @generated
 */
public interface LuceneQueryPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "luceneQuery";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/recommenders/codesearch/rcp/dsl/LuceneQuery";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "luceneQuery";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LuceneQueryPackage eINSTANCE = org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ExpressionImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUE = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl <em>Clause Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getClauseExpression()
   * @generated
   */
  int CLAUSE_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__DEFAULT = 0;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__FIELD = 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__VALUES = 2;

  /**
   * The number of structural features of the '<em>Clause Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.DocumentTypeFieldImpl <em>Document Type Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.DocumentTypeFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getDocumentTypeField()
   * @generated
   */
  int DOCUMENT_TYPE_FIELD = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TYPE_FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Document Type Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TYPE_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.SimpleFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getSimpleField()
   * @generated
   */
  int SIMPLE_FIELD = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Simple Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.TypeFieldImpl <em>Type Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.TypeFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTypeField()
   * @generated
   */
  int TYPE_FIELD = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Type Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.MethodFieldImpl <em>Method Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.MethodFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getMethodField()
   * @generated
   */
  int METHOD_FIELD = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Method Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.FilePathFieldImpl <em>File Path Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.FilePathFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getFilePathField()
   * @generated
   */
  int FILE_PATH_FIELD = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PATH_FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>File Path Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PATH_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.NumberFieldImpl <em>Number Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.NumberFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getNumberField()
   * @generated
   */
  int NUMBER_FIELD = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Number Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ModifierFieldImpl <em>Modifier Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ModifierFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getModifierField()
   * @generated
   */
  int MODIFIER_FIELD = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Modifier Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ProjectNameFieldImpl <em>Project Name Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ProjectNameFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getProjectNameField()
   * @generated
   */
  int PROJECT_NAME_FIELD = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_NAME_FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Project Name Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_NAME_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.DefinitionTypeFieldImpl <em>Definition Type Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.DefinitionTypeFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getDefinitionTypeField()
   * @generated
   */
  int DEFINITION_TYPE_FIELD = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_TYPE_FIELD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Definition Type Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_TYPE_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.OrExpImpl <em>Or Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.OrExpImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getOrExp()
   * @generated
   */
  int OR_EXP = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP__OR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.AndExpImpl <em>And Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.AndExpImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getAndExp()
   * @generated
   */
  int AND_EXP = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP__AND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>And Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp <em>Binary Exp</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getBinaryExp()
   * @generated
   */
  int BINARY_EXP = 13;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression#getValue()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression <em>Clause Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clause Expression</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression
   * @generated
   */
  EClass getClauseExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression#getDefault()
   * @see #getClauseExpression()
   * @generated
   */
  EAttribute getClauseExpression_Default();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression#getField()
   * @see #getClauseExpression()
   * @generated
   */
  EReference getClauseExpression_Field();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression#getValues()
   * @see #getClauseExpression()
   * @generated
   */
  EAttribute getClauseExpression_Values();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField <em>Document Type Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Type Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField
   * @generated
   */
  EClass getDocumentTypeField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField#getValue()
   * @see #getDocumentTypeField()
   * @generated
   */
  EAttribute getDocumentTypeField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField <em>Simple Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField
   * @generated
   */
  EClass getSimpleField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField#getValue()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField <em>Type Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField
   * @generated
   */
  EClass getTypeField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField#getValue()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField <em>Method Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField
   * @generated
   */
  EClass getMethodField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField#getValue()
   * @see #getMethodField()
   * @generated
   */
  EAttribute getMethodField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.FilePathField <em>File Path Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Path Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.FilePathField
   * @generated
   */
  EClass getFilePathField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.FilePathField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.FilePathField#getValue()
   * @see #getFilePathField()
   * @generated
   */
  EAttribute getFilePathField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.NumberField <em>Number Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.NumberField
   * @generated
   */
  EClass getNumberField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.NumberField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.NumberField#getValue()
   * @see #getNumberField()
   * @generated
   */
  EAttribute getNumberField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField <em>Modifier Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField
   * @generated
   */
  EClass getModifierField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField#getValue()
   * @see #getModifierField()
   * @generated
   */
  EAttribute getModifierField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ProjectNameField <em>Project Name Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Name Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ProjectNameField
   * @generated
   */
  EClass getProjectNameField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ProjectNameField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ProjectNameField#getValue()
   * @see #getProjectNameField()
   * @generated
   */
  EAttribute getProjectNameField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionTypeField <em>Definition Type Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Type Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionTypeField
   * @generated
   */
  EClass getDefinitionTypeField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionTypeField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionTypeField#getValue()
   * @see #getDefinitionTypeField()
   * @generated
   */
  EAttribute getDefinitionTypeField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp <em>Or Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Exp</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp
   * @generated
   */
  EClass getOrExp();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp#getOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Or</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp#getOr()
   * @see #getOrExp()
   * @generated
   */
  EAttribute getOrExp_Or();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp <em>And Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Exp</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp
   * @generated
   */
  EClass getAndExp();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp#getAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>And</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp#getAnd()
   * @see #getAndExp()
   * @generated
   */
  EAttribute getAndExp_And();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Exp</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp
   * @generated
   */
  EEnum getBinaryExp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LuceneQueryFactory getLuceneQueryFactory();

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
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ExpressionImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl <em>Clause Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getClauseExpression()
     * @generated
     */
    EClass CLAUSE_EXPRESSION = eINSTANCE.getClauseExpression();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAUSE_EXPRESSION__DEFAULT = eINSTANCE.getClauseExpression_Default();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAUSE_EXPRESSION__FIELD = eINSTANCE.getClauseExpression_Field();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAUSE_EXPRESSION__VALUES = eINSTANCE.getClauseExpression_Values();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.DocumentTypeFieldImpl <em>Document Type Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.DocumentTypeFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getDocumentTypeField()
     * @generated
     */
    EClass DOCUMENT_TYPE_FIELD = eINSTANCE.getDocumentTypeField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_TYPE_FIELD__VALUE = eINSTANCE.getDocumentTypeField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.SimpleFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getSimpleField()
     * @generated
     */
    EClass SIMPLE_FIELD = eINSTANCE.getSimpleField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__VALUE = eINSTANCE.getSimpleField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.TypeFieldImpl <em>Type Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.TypeFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTypeField()
     * @generated
     */
    EClass TYPE_FIELD = eINSTANCE.getTypeField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__VALUE = eINSTANCE.getTypeField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.MethodFieldImpl <em>Method Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.MethodFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getMethodField()
     * @generated
     */
    EClass METHOD_FIELD = eINSTANCE.getMethodField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_FIELD__VALUE = eINSTANCE.getMethodField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.FilePathFieldImpl <em>File Path Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.FilePathFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getFilePathField()
     * @generated
     */
    EClass FILE_PATH_FIELD = eINSTANCE.getFilePathField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_PATH_FIELD__VALUE = eINSTANCE.getFilePathField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.NumberFieldImpl <em>Number Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.NumberFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getNumberField()
     * @generated
     */
    EClass NUMBER_FIELD = eINSTANCE.getNumberField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_FIELD__VALUE = eINSTANCE.getNumberField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ModifierFieldImpl <em>Modifier Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ModifierFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getModifierField()
     * @generated
     */
    EClass MODIFIER_FIELD = eINSTANCE.getModifierField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER_FIELD__VALUE = eINSTANCE.getModifierField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ProjectNameFieldImpl <em>Project Name Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.ProjectNameFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getProjectNameField()
     * @generated
     */
    EClass PROJECT_NAME_FIELD = eINSTANCE.getProjectNameField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT_NAME_FIELD__VALUE = eINSTANCE.getProjectNameField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.DefinitionTypeFieldImpl <em>Definition Type Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.DefinitionTypeFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getDefinitionTypeField()
     * @generated
     */
    EClass DEFINITION_TYPE_FIELD = eINSTANCE.getDefinitionTypeField();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION_TYPE_FIELD__VALUE = eINSTANCE.getDefinitionTypeField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.OrExpImpl <em>Or Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.OrExpImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getOrExp()
     * @generated
     */
    EClass OR_EXP = eINSTANCE.getOrExp();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OR_EXP__OR = eINSTANCE.getOrExp_Or();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.AndExpImpl <em>And Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.AndExpImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getAndExp()
     * @generated
     */
    EClass AND_EXP = eINSTANCE.getAndExp();

    /**
     * The meta object literal for the '<em><b>And</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_EXP__AND = eINSTANCE.getAndExp_And();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp <em>Binary Exp</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp
     * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getBinaryExp()
     * @generated
     */
    EEnum BINARY_EXP = eINSTANCE.getBinaryExp();

  }

} //LuceneQueryPackage
