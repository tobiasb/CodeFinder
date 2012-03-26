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
   * Returns the value of the '<em><b>Name Callee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Callee</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Callee</em>' containment reference.
   * @see #setNameCallee(Name)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getMethodCall_NameCallee()
   * @model containment="true"
   * @generated
   */
  Name getNameCallee();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCallee <em>Name Callee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Callee</em>' containment reference.
   * @see #getNameCallee()
   * @generated
   */
  void setNameCallee(Name value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(CalledMethodName)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getMethodCall_Method()
   * @model containment="true"
   * @generated
   */
  CalledMethodName getMethod();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(CalledMethodName value);

  /**
   * Returns the value of the '<em><b>Name Caller</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Caller</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Caller</em>' containment reference.
   * @see #setNameCaller(Name)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package#getMethodCall_NameCaller()
   * @model containment="true"
   * @generated
   */
  Name getNameCaller();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCaller <em>Name Caller</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Caller</em>' containment reference.
   * @see #getNameCaller()
   * @generated
   */
  void setNameCaller(Name value);

} // MethodCall
