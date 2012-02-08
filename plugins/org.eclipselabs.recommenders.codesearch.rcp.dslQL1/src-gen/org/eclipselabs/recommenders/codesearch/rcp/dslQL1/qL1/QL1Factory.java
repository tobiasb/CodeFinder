/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package
 * @generated
 */
public interface QL1Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QL1Factory eINSTANCE = org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Exp1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp1</em>'.
   * @generated
   */
  Exp1 createExp1();

  /**
   * Returns a new object of class '<em>Field Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Expr</em>'.
   * @generated
   */
  FieldExpr createFieldExpr();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Single Value Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Value Field</em>'.
   * @generated
   */
  SingleValueField createSingleValueField();

  /**
   * Returns a new object of class '<em>Multi Value Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Value Field</em>'.
   * @generated
   */
  MultiValueField createMultiValueField();

  /**
   * Returns a new object of class '<em>Boolean Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Field</em>'.
   * @generated
   */
  BooleanField createBooleanField();

  /**
   * Returns a new object of class '<em>Single Value Field Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Value Field Name</em>'.
   * @generated
   */
  SingleValueFieldName createSingleValueFieldName();

  /**
   * Returns a new object of class '<em>Multi Value Field Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Value Field Name</em>'.
   * @generated
   */
  MultiValueFieldName createMultiValueFieldName();

  /**
   * Returns a new object of class '<em>Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negation</em>'.
   * @generated
   */
  Negation createNegation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QL1Package getQL1Package();

} //QL1Factory
