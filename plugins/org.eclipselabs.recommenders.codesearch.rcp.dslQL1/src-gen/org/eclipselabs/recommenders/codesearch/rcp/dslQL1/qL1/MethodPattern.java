/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getThrowsClause <em>Throws Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getMethodPattern()
 * @model
 * @generated
 */
public interface MethodPattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference list.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getMethodPattern_Modifiers()
   * @model containment="true"
   * @generated
   */
  EList<Modifier> getModifiers();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see #setReturnType(String)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getMethodPattern_ReturnType()
   * @model
   * @generated
   */
  String getReturnType();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(String value);

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
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getMethodPattern_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

  /**
   * Returns the value of the '<em><b>Parameter Types</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Types</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Types</em>' attribute list.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getMethodPattern_ParameterTypes()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameterTypes();

  /**
   * Returns the value of the '<em><b>Throws Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Throws Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Throws Clause</em>' containment reference.
   * @see #setThrowsClause(Throws)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getMethodPattern_ThrowsClause()
   * @model containment="true"
   * @generated
   */
  Throws getThrowsClause();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern#getThrowsClause <em>Throws Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Throws Clause</em>' containment reference.
   * @see #getThrowsClause()
   * @generated
   */
  void setThrowsClause(Throws value);

} // MethodPattern
