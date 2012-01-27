/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Path Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FilePathField#getResourcePath <em>Resource Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getFilePathField()
 * @model
 * @generated
 */
public interface FilePathField extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Path</em>' attribute.
   * @see #setResourcePath(String)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getFilePathField_ResourcePath()
   * @model
   * @generated
   */
  String getResourcePath();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FilePathField#getResourcePath <em>Resource Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource Path</em>' attribute.
   * @see #getResourcePath()
   * @generated
   */
  void setResourcePath(String value);

} // FilePathField
