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
   * Returns a new object of class '<em>Simple Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Field</em>'.
   * @generated
   */
  SimpleField createSimpleField();

  /**
   * Returns a new object of class '<em>Type Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Field</em>'.
   * @generated
   */
  TypeField createTypeField();

  /**
   * Returns a new object of class '<em>Method Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Field</em>'.
   * @generated
   */
  MethodField createMethodField();

  /**
   * Returns a new object of class '<em>File Path Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Path Field</em>'.
   * @generated
   */
  FilePathField createFilePathField();

  /**
   * Returns a new object of class '<em>Number Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Field</em>'.
   * @generated
   */
  NumberField createNumberField();

  /**
   * Returns a new object of class '<em>Modifier Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifier Field</em>'.
   * @generated
   */
  ModifierField createModifierField();

  /**
   * Returns a new object of class '<em>Time Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Field</em>'.
   * @generated
   */
  TimeField createTimeField();

  /**
   * Returns a new object of class '<em>Document Type Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Type Field</em>'.
   * @generated
   */
  DocumentTypeField createDocumentTypeField();

  /**
   * Returns a new object of class '<em>Project Name Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project Name Field</em>'.
   * @generated
   */
  ProjectNameField createProjectNameField();

  /**
   * Returns a new object of class '<em>Annotation Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Field</em>'.
   * @generated
   */
  AnnotationField createAnnotationField();

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
