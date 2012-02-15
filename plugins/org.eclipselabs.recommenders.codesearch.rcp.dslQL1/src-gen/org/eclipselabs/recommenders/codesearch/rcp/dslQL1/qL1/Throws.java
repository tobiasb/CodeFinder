/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throws</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws#getThrownType <em>Thrown Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getThrows()
 * @model
 * @generated
 */
public interface Throws extends EObject
{
  /**
   * Returns the value of the '<em><b>Thrown Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thrown Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thrown Type</em>' attribute.
   * @see #setThrownType(String)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getThrows_ThrownType()
   * @model
   * @generated
   */
  String getThrownType();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws#getThrownType <em>Thrown Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thrown Type</em>' attribute.
   * @see #getThrownType()
   * @generated
   */
  void setThrownType(String value);

} // Throws
