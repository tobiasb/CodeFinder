/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.Exp1#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.Exp1#getFieldExpr <em>Field Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Package#getExp1()
 * @model
 * @generated
 */
public interface Exp1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Package#getExp1_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.Exp1#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Field Expr</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.FieldExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Expr</em>' containment reference list.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dslQL1.qL1.QL1Package#getExp1_FieldExpr()
   * @model containment="true"
   * @generated
   */
  EList<FieldExpr> getFieldExpr();

} // Exp1
