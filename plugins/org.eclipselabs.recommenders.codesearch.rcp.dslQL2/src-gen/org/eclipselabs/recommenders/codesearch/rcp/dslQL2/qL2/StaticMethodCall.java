/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getStaticMethodCall()
 * @model
 * @generated
 */
public interface StaticMethodCall extends Statement
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getStaticMethodCall_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getStaticMethodCall_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // StaticMethodCall
