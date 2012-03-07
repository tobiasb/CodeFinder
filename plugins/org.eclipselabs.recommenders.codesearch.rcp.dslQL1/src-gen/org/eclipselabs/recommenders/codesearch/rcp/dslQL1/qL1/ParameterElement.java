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
 * A representation of the model object '<em><b>Parameter Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getParameterElement()
 * @model
 * @generated
 */
public interface ParameterElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getParameterElement_Values()
   * @model containment="true"
   * @generated
   */
  EList<ParameterType> getValues();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getParameterElement_Types()
   * @model containment="true"
   * @generated
   */
  EList<ParameterType> getTypes();

} // ParameterElement
