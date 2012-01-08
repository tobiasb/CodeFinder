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
   * The feature id for the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__CLAUSE = 0;

  /**
   * The number of structural features of the '<em>Clause Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseImpl <em>Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getClause()
   * @generated
   */
  int CLAUSE = 2;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE__N = 0;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE__FIELD = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl <em>Exp1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExp1()
   * @generated
   */
  int EXP1 = 3;

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
  int BOOLEAN_EXP = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression <em>Not Expression</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getNotExpression()
   * @generated
   */
  int NOT_EXPRESSION = 5;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName <em>Field Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getFieldName()
   * @generated
   */
  int FIELD_NAME = 6;


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
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Clause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clause</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Clause
   * @generated
   */
  EClass getClause();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Clause#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Clause#getN()
   * @see #getClause()
   * @generated
   */
  EAttribute getClause_N();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Clause#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Clause#getField()
   * @see #getClause()
   * @generated
   */
  EAttribute getClause_Field();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Clause#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Clause#getValue()
   * @see #getClause()
   * @generated
   */
  EAttribute getClause_Value();

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
   * Returns the meta object for enum '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName <em>Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Field Name</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName
   * @generated
   */
  EEnum getFieldName();

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
     * The meta object literal for the '<em><b>Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAUSE_EXPRESSION__CLAUSE = eINSTANCE.getClauseExpression_Clause();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseImpl <em>Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getClause()
     * @generated
     */
    EClass CLAUSE = eINSTANCE.getClause();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAUSE__N = eINSTANCE.getClause_N();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAUSE__FIELD = eINSTANCE.getClause_Field();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAUSE__VALUE = eINSTANCE.getClause_Value();

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
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName <em>Field Name</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getFieldName()
     * @generated
     */
    EEnum FIELD_NAME = eINSTANCE.getFieldName();

  }

} //LuceneQueryPackage
