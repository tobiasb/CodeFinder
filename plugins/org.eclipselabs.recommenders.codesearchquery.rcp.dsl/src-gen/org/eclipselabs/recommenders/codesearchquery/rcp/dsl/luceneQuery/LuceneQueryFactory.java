/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage
 * @generated
 */
public interface LuceneQueryFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LuceneQueryFactory eINSTANCE = org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Clause Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clause Expression</em>'.
   * @generated
   */
  ClauseExpression createClauseExpression();

  /**
   * Returns a new object of class '<em>Simple Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Clause</em>'.
   * @generated
   */
  SimpleClause createSimpleClause();

  /**
   * Returns a new object of class '<em>Type Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Clause</em>'.
   * @generated
   */
  TypeClause createTypeClause();

  /**
   * Returns a new object of class '<em>Type Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Test</em>'.
   * @generated
   */
  TypeTest createTypeTest();

  /**
   * Returns a new object of class '<em>Field Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Name</em>'.
   * @generated
   */
  FieldName createFieldName();

  /**
   * Returns a new object of class '<em>Type Field Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Field Name</em>'.
   * @generated
   */
  TypeFieldName createTypeFieldName();

  /**
   * Returns a new object of class '<em>Exp1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp1</em>'.
   * @generated
   */
  Exp1 createExp1();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LuceneQueryPackage getLuceneQueryPackage();

} //LuceneQueryFactory
