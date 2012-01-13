/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Model#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Model#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Model#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getModel_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Model#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getModel_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Model#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getModel_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Model
