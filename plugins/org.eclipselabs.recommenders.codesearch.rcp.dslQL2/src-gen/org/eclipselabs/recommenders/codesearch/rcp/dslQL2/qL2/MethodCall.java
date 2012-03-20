/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCallee <em>Name Callee</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCaller <em>Name Caller</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends Statement
{
  /**
   * Returns the value of the '<em><b>Name Callee</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Callee</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Callee</em>' attribute.
   * @see #setNameCallee(String)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getMethodCall_NameCallee()
   * @model
   * @generated
   */
  String getNameCallee();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCallee <em>Name Callee</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Callee</em>' attribute.
   * @see #getNameCallee()
   * @generated
   */
  void setNameCallee(String value);

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
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getMethodCall_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

  /**
   * Returns the value of the '<em><b>Name Caller</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Caller</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Caller</em>' attribute.
   * @see #setNameCaller(String)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getMethodCall_NameCaller()
   * @model
   * @generated
   */
  String getNameCaller();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCaller <em>Name Caller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Caller</em>' attribute.
   * @see #getNameCaller()
   * @generated
   */
  void setNameCaller(String value);

} // MethodCall
