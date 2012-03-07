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
   * Returns a new object of class '<em>Method Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Pattern</em>'.
   * @generated
   */
  MethodPattern createMethodPattern();

  /**
   * Returns a new object of class '<em>Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modifier</em>'.
   * @generated
   */
  Modifier createModifier();

  /**
   * Returns a new object of class '<em>Return Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Type</em>'.
   * @generated
   */
  ReturnType createReturnType();

  /**
   * Returns a new object of class '<em>Parameter Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Element</em>'.
   * @generated
   */
  ParameterElement createParameterElement();

  /**
   * Returns a new object of class '<em>Parameter Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Type</em>'.
   * @generated
   */
  ParameterType createParameterType();

  /**
   * Returns a new object of class '<em>Throws</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Throws</em>'.
   * @generated
   */
  Throws createThrows();

  /**
   * Returns a new object of class '<em>Method Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Name</em>'.
   * @generated
   */
  MethodName createMethodName();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QL1Package getQL1Package();

} //QL1Factory
