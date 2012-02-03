/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Value Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.MultiValueField#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.MultiValueField#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Package#getMultiValueField()
 * @model
 * @generated
 */
public interface MultiValueField extends FieldExpr
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(MultiValueFieldName)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Package#getMultiValueField_Name()
   * @model containment="true"
   * @generated
   */
  MultiValueFieldName getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.MultiValueField#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(MultiValueFieldName value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Package#getMultiValueField_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // MultiValueField
