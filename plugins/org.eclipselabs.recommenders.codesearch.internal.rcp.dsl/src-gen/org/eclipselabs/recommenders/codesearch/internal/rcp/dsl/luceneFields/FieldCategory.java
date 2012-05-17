/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getFieldCategory()
 * @model
 * @generated
 */
public interface FieldCategory extends EObject
{
  /**
   * Returns the value of the '<em><b>Category Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category Name</em>' attribute.
   * @see #setCategoryName(String)
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getFieldCategory_CategoryName()
   * @model
   * @generated
   */
  String getCategoryName();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory#getCategoryName <em>Category Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category Name</em>' attribute.
   * @see #getCategoryName()
   * @generated
   */
  void setCategoryName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getFieldCategory_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // FieldCategory
