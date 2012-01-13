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
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Field#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Field#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Field#isProposeType <em>Propose Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Field#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
{
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
   * @see org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Field#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getField_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Field#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Propose Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Propose Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propose Type</em>' attribute.
   * @see #setProposeType(boolean)
   * @see org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getField_ProposeType()
   * @model
   * @generated
   */
  boolean isProposeType();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Field#isProposeType <em>Propose Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Propose Type</em>' attribute.
   * @see #isProposeType()
   * @generated
   */
  void setProposeType(boolean value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.FieldType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage#getField_Types()
   * @model containment="true"
   * @generated
   */
  EList<FieldType> getTypes();

} // Field
