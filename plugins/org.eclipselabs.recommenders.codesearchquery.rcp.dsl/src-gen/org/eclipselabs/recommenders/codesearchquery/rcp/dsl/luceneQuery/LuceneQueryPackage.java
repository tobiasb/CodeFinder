/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;

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
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryFactory
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
  String eNS_URI = "http://www.eclipselabs.org/recommenders/codesearchquery/rcp/dsl/LuceneQuery";

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
  LuceneQueryPackage eINSTANCE = org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ExpressionImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExpression()
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
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl <em>Clause Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getClauseExpression()
   * @generated
   */
  int CLAUSE_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__N = 0;

  /**
   * The feature id for the '<em><b>M</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__M = 1;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__CLAUSE = 2;

  /**
   * The number of structural features of the '<em>Clause Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleClauseImpl <em>Simple Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleClauseImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getSimpleClause()
   * @generated
   */
  int SIMPLE_CLAUSE = 2;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLAUSE__FIELD = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLAUSE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Simple Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeClauseImpl <em>Type Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeClauseImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTypeClause()
   * @generated
   */
  int TYPE_CLAUSE = 3;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CLAUSE__FIELD = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CLAUSE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Type Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FieldNameImpl <em>Field Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FieldNameImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getFieldName()
   * @generated
   */
  int FIELD_NAME = 4;

  /**
   * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__FULLY_QUALIFIED_NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__TYPE = 1;

  /**
   * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__FRIENDLY_NAME = 2;

  /**
   * The feature id for the '<em><b>Declared Methods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__DECLARED_METHODS = 3;

  /**
   * The feature id for the '<em><b>Parameter Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__PARAMETER_COUNT = 4;

  /**
   * The feature id for the '<em><b>Return Variable Eexpressions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__RETURN_VARIABLE_EEXPRESSIONS = 5;

  /**
   * The feature id for the '<em><b>Used Methods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__USED_METHODS = 6;

  /**
   * The feature id for the '<em><b>Used Methods In Try</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__USED_METHODS_IN_TRY = 7;

  /**
   * The feature id for the '<em><b>Used Methods In Finally</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__USED_METHODS_IN_FINALLY = 8;

  /**
   * The feature id for the '<em><b>Overridden Methods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__OVERRIDDEN_METHODS = 9;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__PROJECT_NAME = 10;

  /**
   * The feature id for the '<em><b>Resource Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__RESOURCE_PATH = 11;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__MODIFIERS = 12;

  /**
   * The feature id for the '<em><b>All Declared Method Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__ALL_DECLARED_METHOD_NAMES = 13;

  /**
   * The feature id for the '<em><b>Declared Method Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__DECLARED_METHOD_NAMES = 14;

  /**
   * The feature id for the '<em><b>Declared Field Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__DECLARED_FIELD_NAMES = 15;

  /**
   * The feature id for the '<em><b>Declared Field Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__DECLARED_FIELD_TYPES = 16;

  /**
   * The feature id for the '<em><b>All Declared Field Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__ALL_DECLARED_FIELD_NAMES = 17;

  /**
   * The feature id for the '<em><b>Full Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__FULL_TEXT = 18;

  /**
   * The feature id for the '<em><b>Fields Read</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__FIELDS_READ = 19;

  /**
   * The feature id for the '<em><b>Fields Written</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__FIELDS_WRITTEN = 20;

  /**
   * The feature id for the '<em><b>Used Fields In Finally</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__USED_FIELDS_IN_FINALLY = 21;

  /**
   * The feature id for the '<em><b>Used Fields In Try</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__USED_FIELDS_IN_TRY = 22;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__ANNOTATIONS = 23;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME__TIMESTAMP = 24;

  /**
   * The number of structural features of the '<em>Field Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_NAME_FEATURE_COUNT = 25;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldNameImpl <em>Type Field Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldNameImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTypeFieldName()
   * @generated
   */
  int TYPE_FIELD_NAME = 5;

  /**
   * The feature id for the '<em><b>Implemented Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__IMPLEMENTED_TYPES = 0;

  /**
   * The feature id for the '<em><b>Extended Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__EXTENDED_TYPES = 1;

  /**
   * The feature id for the '<em><b>Used Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__USED_TYPES = 2;

  /**
   * The feature id for the '<em><b>Used Types In Try</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__USED_TYPES_IN_TRY = 3;

  /**
   * The feature id for the '<em><b>Used Types In Finally</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__USED_TYPES_IN_FINALLY = 4;

  /**
   * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__PARAMETER_TYPES = 5;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__RETURN_TYPE = 6;

  /**
   * The feature id for the '<em><b>All Implemented Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__ALL_IMPLEMENTED_TYPES = 7;

  /**
   * The feature id for the '<em><b>All Extended Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__ALL_EXTENDED_TYPES = 8;

  /**
   * The feature id for the '<em><b>Field Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__FIELD_TYPE = 9;

  /**
   * The feature id for the '<em><b>Declaring Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__DECLARING_TYPE = 10;

  /**
   * The feature id for the '<em><b>Caught Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__CAUGHT_TYPE = 11;

  /**
   * The feature id for the '<em><b>Instanceof Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME__INSTANCEOF_TYPES = 12;

  /**
   * The number of structural features of the '<em>Type Field Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_NAME_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl <em>Exp1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExp1()
   * @generated
   */
  int EXP1 = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__B = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Exp1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp <em>Boolean Exp</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getBooleanExp()
   * @generated
   */
  int BOOLEAN_EXP = 7;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression <em>Not Expression</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getNotExpression()
   * @generated
   */
  int NOT_EXPRESSION = 8;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression <em>Must Expression</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getMustExpression()
   * @generated
   */
  int MUST_EXPRESSION = 9;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression#getValue()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression <em>Clause Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clause Expression</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression
   * @generated
   */
  EClass getClauseExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getN()
   * @see #getClauseExpression()
   * @generated
   */
  EAttribute getClauseExpression_N();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>M</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getM()
   * @see #getClauseExpression()
   * @generated
   */
  EAttribute getClauseExpression_M();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clause</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getClause()
   * @see #getClauseExpression()
   * @generated
   */
  EReference getClauseExpression_Clause();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleClause <em>Simple Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Clause</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleClause
   * @generated
   */
  EClass getSimpleClause();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleClause#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleClause#getField()
   * @see #getSimpleClause()
   * @generated
   */
  EReference getSimpleClause_Field();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleClause#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleClause#getValue()
   * @see #getSimpleClause()
   * @generated
   */
  EAttribute getSimpleClause_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause <em>Type Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Clause</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause
   * @generated
   */
  EClass getTypeClause();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getField()
   * @see #getTypeClause()
   * @generated
   */
  EReference getTypeClause_Field();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getValue()
   * @see #getTypeClause()
   * @generated
   */
  EAttribute getTypeClause_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Name</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName
   * @generated
   */
  EClass getFieldName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFullyQualifiedName <em>Fully Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fully Qualified Name</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFullyQualifiedName()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_FullyQualifiedName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getType()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFriendlyName <em>Friendly Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Friendly Name</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFriendlyName()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_FriendlyName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getDeclaredMethods <em>Declared Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Methods</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getDeclaredMethods()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_DeclaredMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getParameterCount <em>Parameter Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Count</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getParameterCount()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_ParameterCount();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getReturnVariableEexpressions <em>Return Variable Eexpressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Variable Eexpressions</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getReturnVariableEexpressions()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_ReturnVariableEexpressions();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedMethods <em>Used Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Methods</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedMethods()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_UsedMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedMethodsInTry <em>Used Methods In Try</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Methods In Try</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedMethodsInTry()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_UsedMethodsInTry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedMethodsInFinally <em>Used Methods In Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Methods In Finally</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedMethodsInFinally()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_UsedMethodsInFinally();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getOverriddenMethods <em>Overridden Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overridden Methods</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getOverriddenMethods()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_OverriddenMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getProjectName <em>Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getProjectName()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_ProjectName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getResourcePath <em>Resource Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resource Path</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getResourcePath()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_ResourcePath();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifiers</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getModifiers()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getAllDeclaredMethodNames <em>All Declared Method Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Declared Method Names</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getAllDeclaredMethodNames()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_AllDeclaredMethodNames();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getDeclaredMethodNames <em>Declared Method Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Method Names</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getDeclaredMethodNames()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_DeclaredMethodNames();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getDeclaredFieldNames <em>Declared Field Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Field Names</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getDeclaredFieldNames()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_DeclaredFieldNames();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getDeclaredFieldTypes <em>Declared Field Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Field Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getDeclaredFieldTypes()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_DeclaredFieldTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getAllDeclaredFieldNames <em>All Declared Field Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Declared Field Names</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getAllDeclaredFieldNames()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_AllDeclaredFieldNames();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFullText <em>Full Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Full Text</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFullText()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_FullText();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFieldsRead <em>Fields Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fields Read</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFieldsRead()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_FieldsRead();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFieldsWritten <em>Fields Written</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fields Written</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getFieldsWritten()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_FieldsWritten();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedFieldsInFinally <em>Used Fields In Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Fields In Finally</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedFieldsInFinally()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_UsedFieldsInFinally();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedFieldsInTry <em>Used Fields In Try</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Fields In Try</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getUsedFieldsInTry()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_UsedFieldsInTry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Annotations</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getAnnotations()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_Annotations();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getTimestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timestamp</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName#getTimestamp()
   * @see #getFieldName()
   * @generated
   */
  EAttribute getFieldName_Timestamp();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName <em>Type Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Field Name</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName
   * @generated
   */
  EClass getTypeFieldName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getImplementedTypes <em>Implemented Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implemented Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getImplementedTypes()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_ImplementedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getExtendedTypes <em>Extended Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extended Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getExtendedTypes()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_ExtendedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getUsedTypes <em>Used Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getUsedTypes()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_UsedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getUsedTypesInTry <em>Used Types In Try</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Types In Try</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getUsedTypesInTry()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_UsedTypesInTry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getUsedTypesInFinally <em>Used Types In Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Types In Finally</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getUsedTypesInFinally()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_UsedTypesInFinally();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getParameterTypes <em>Parameter Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getParameterTypes()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_ParameterTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getReturnType()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getAllImplementedTypes <em>All Implemented Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Implemented Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getAllImplementedTypes()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_AllImplementedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getAllExtendedTypes <em>All Extended Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Extended Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getAllExtendedTypes()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_AllExtendedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getFieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getFieldType()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_FieldType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getDeclaringType <em>Declaring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declaring Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getDeclaringType()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_DeclaringType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getCaughtType <em>Caught Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caught Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getCaughtType()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_CaughtType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getInstanceofTypes <em>Instanceof Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instanceof Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName#getInstanceofTypes()
   * @see #getTypeFieldName()
   * @generated
   */
  EAttribute getTypeFieldName_InstanceofTypes();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1 <em>Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp1</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1
   * @generated
   */
  EClass getExp1();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getLeft()
   * @see #getExp1()
   * @generated
   */
  EReference getExp1_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getB()
   * @see #getExp1()
   * @generated
   */
  EAttribute getExp1_B();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getRight()
   * @see #getExp1()
   * @generated
   */
  EReference getExp1_Right();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Exp</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp
   * @generated
   */
  EEnum getBooleanExp();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Not Expression</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression
   * @generated
   */
  EEnum getNotExpression();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression <em>Must Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Must Expression</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression
   * @generated
   */
  EEnum getMustExpression();

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
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ExpressionImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExpression()
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
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl <em>Clause Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getClauseExpression()
     * @generated
     */
    EClass CLAUSE_EXPRESSION = eINSTANCE.getClauseExpression();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAUSE_EXPRESSION__N = eINSTANCE.getClauseExpression_N();

    /**
     * The meta object literal for the '<em><b>M</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAUSE_EXPRESSION__M = eINSTANCE.getClauseExpression_M();

    /**
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAUSE_EXPRESSION__CLAUSE = eINSTANCE.getClauseExpression_Clause();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleClauseImpl <em>Simple Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleClauseImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getSimpleClause()
     * @generated
     */
    EClass SIMPLE_CLAUSE = eINSTANCE.getSimpleClause();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_CLAUSE__FIELD = eINSTANCE.getSimpleClause_Field();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CLAUSE__VALUE = eINSTANCE.getSimpleClause_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeClauseImpl <em>Type Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeClauseImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTypeClause()
     * @generated
     */
    EClass TYPE_CLAUSE = eINSTANCE.getTypeClause();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CLAUSE__FIELD = eINSTANCE.getTypeClause_Field();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_CLAUSE__VALUE = eINSTANCE.getTypeClause_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FieldNameImpl <em>Field Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FieldNameImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getFieldName()
     * @generated
     */
    EClass FIELD_NAME = eINSTANCE.getFieldName();

    /**
     * The meta object literal for the '<em><b>Fully Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__FULLY_QUALIFIED_NAME = eINSTANCE.getFieldName_FullyQualifiedName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__TYPE = eINSTANCE.getFieldName_Type();

    /**
     * The meta object literal for the '<em><b>Friendly Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__FRIENDLY_NAME = eINSTANCE.getFieldName_FriendlyName();

    /**
     * The meta object literal for the '<em><b>Declared Methods</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__DECLARED_METHODS = eINSTANCE.getFieldName_DeclaredMethods();

    /**
     * The meta object literal for the '<em><b>Parameter Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__PARAMETER_COUNT = eINSTANCE.getFieldName_ParameterCount();

    /**
     * The meta object literal for the '<em><b>Return Variable Eexpressions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__RETURN_VARIABLE_EEXPRESSIONS = eINSTANCE.getFieldName_ReturnVariableEexpressions();

    /**
     * The meta object literal for the '<em><b>Used Methods</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__USED_METHODS = eINSTANCE.getFieldName_UsedMethods();

    /**
     * The meta object literal for the '<em><b>Used Methods In Try</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__USED_METHODS_IN_TRY = eINSTANCE.getFieldName_UsedMethodsInTry();

    /**
     * The meta object literal for the '<em><b>Used Methods In Finally</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__USED_METHODS_IN_FINALLY = eINSTANCE.getFieldName_UsedMethodsInFinally();

    /**
     * The meta object literal for the '<em><b>Overridden Methods</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__OVERRIDDEN_METHODS = eINSTANCE.getFieldName_OverriddenMethods();

    /**
     * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__PROJECT_NAME = eINSTANCE.getFieldName_ProjectName();

    /**
     * The meta object literal for the '<em><b>Resource Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__RESOURCE_PATH = eINSTANCE.getFieldName_ResourcePath();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__MODIFIERS = eINSTANCE.getFieldName_Modifiers();

    /**
     * The meta object literal for the '<em><b>All Declared Method Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__ALL_DECLARED_METHOD_NAMES = eINSTANCE.getFieldName_AllDeclaredMethodNames();

    /**
     * The meta object literal for the '<em><b>Declared Method Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__DECLARED_METHOD_NAMES = eINSTANCE.getFieldName_DeclaredMethodNames();

    /**
     * The meta object literal for the '<em><b>Declared Field Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__DECLARED_FIELD_NAMES = eINSTANCE.getFieldName_DeclaredFieldNames();

    /**
     * The meta object literal for the '<em><b>Declared Field Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__DECLARED_FIELD_TYPES = eINSTANCE.getFieldName_DeclaredFieldTypes();

    /**
     * The meta object literal for the '<em><b>All Declared Field Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__ALL_DECLARED_FIELD_NAMES = eINSTANCE.getFieldName_AllDeclaredFieldNames();

    /**
     * The meta object literal for the '<em><b>Full Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__FULL_TEXT = eINSTANCE.getFieldName_FullText();

    /**
     * The meta object literal for the '<em><b>Fields Read</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__FIELDS_READ = eINSTANCE.getFieldName_FieldsRead();

    /**
     * The meta object literal for the '<em><b>Fields Written</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__FIELDS_WRITTEN = eINSTANCE.getFieldName_FieldsWritten();

    /**
     * The meta object literal for the '<em><b>Used Fields In Finally</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__USED_FIELDS_IN_FINALLY = eINSTANCE.getFieldName_UsedFieldsInFinally();

    /**
     * The meta object literal for the '<em><b>Used Fields In Try</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__USED_FIELDS_IN_TRY = eINSTANCE.getFieldName_UsedFieldsInTry();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__ANNOTATIONS = eINSTANCE.getFieldName_Annotations();

    /**
     * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_NAME__TIMESTAMP = eINSTANCE.getFieldName_Timestamp();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldNameImpl <em>Type Field Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldNameImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTypeFieldName()
     * @generated
     */
    EClass TYPE_FIELD_NAME = eINSTANCE.getTypeFieldName();

    /**
     * The meta object literal for the '<em><b>Implemented Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__IMPLEMENTED_TYPES = eINSTANCE.getTypeFieldName_ImplementedTypes();

    /**
     * The meta object literal for the '<em><b>Extended Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__EXTENDED_TYPES = eINSTANCE.getTypeFieldName_ExtendedTypes();

    /**
     * The meta object literal for the '<em><b>Used Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__USED_TYPES = eINSTANCE.getTypeFieldName_UsedTypes();

    /**
     * The meta object literal for the '<em><b>Used Types In Try</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__USED_TYPES_IN_TRY = eINSTANCE.getTypeFieldName_UsedTypesInTry();

    /**
     * The meta object literal for the '<em><b>Used Types In Finally</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__USED_TYPES_IN_FINALLY = eINSTANCE.getTypeFieldName_UsedTypesInFinally();

    /**
     * The meta object literal for the '<em><b>Parameter Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__PARAMETER_TYPES = eINSTANCE.getTypeFieldName_ParameterTypes();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__RETURN_TYPE = eINSTANCE.getTypeFieldName_ReturnType();

    /**
     * The meta object literal for the '<em><b>All Implemented Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__ALL_IMPLEMENTED_TYPES = eINSTANCE.getTypeFieldName_AllImplementedTypes();

    /**
     * The meta object literal for the '<em><b>All Extended Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__ALL_EXTENDED_TYPES = eINSTANCE.getTypeFieldName_AllExtendedTypes();

    /**
     * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__FIELD_TYPE = eINSTANCE.getTypeFieldName_FieldType();

    /**
     * The meta object literal for the '<em><b>Declaring Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__DECLARING_TYPE = eINSTANCE.getTypeFieldName_DeclaringType();

    /**
     * The meta object literal for the '<em><b>Caught Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__CAUGHT_TYPE = eINSTANCE.getTypeFieldName_CaughtType();

    /**
     * The meta object literal for the '<em><b>Instanceof Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD_NAME__INSTANCEOF_TYPES = eINSTANCE.getTypeFieldName_InstanceofTypes();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl <em>Exp1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExp1()
     * @generated
     */
    EClass EXP1 = eINSTANCE.getExp1();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP1__LEFT = eINSTANCE.getExp1_Left();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP1__B = eINSTANCE.getExp1_B();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP1__RIGHT = eINSTANCE.getExp1_Right();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp <em>Boolean Exp</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getBooleanExp()
     * @generated
     */
    EEnum BOOLEAN_EXP = eINSTANCE.getBooleanExp();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression <em>Not Expression</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getNotExpression()
     * @generated
     */
    EEnum NOT_EXPRESSION = eINSTANCE.getNotExpression();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression <em>Must Expression</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getMustExpression()
     * @generated
     */
    EEnum MUST_EXPRESSION = eINSTANCE.getMustExpression();

  }

} //LuceneQueryPackage
