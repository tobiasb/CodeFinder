/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NumberField#getParameterCount <em>Parameter Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getNumberField()
 * @model
 * @generated
 */
public interface NumberField extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Count</em>' attribute.
   * @see #setParameterCount(String)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getNumberField_ParameterCount()
   * @model
   * @generated
   */
  String getParameterCount();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NumberField#getParameterCount <em>Parameter Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Count</em>' attribute.
   * @see #getParameterCount()
   * @generated
   */
  void setParameterCount(String value);

} // NumberField
