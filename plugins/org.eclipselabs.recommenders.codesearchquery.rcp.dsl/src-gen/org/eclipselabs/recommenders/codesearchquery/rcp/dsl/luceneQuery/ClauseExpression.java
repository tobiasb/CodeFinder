/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getN <em>N</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getM <em>M</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getClauseExpression()
 * @model
 * @generated
 */
public interface ClauseExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression
   * @see #setN(NotExpression)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getClauseExpression_N()
   * @model
   * @generated
   */
  NotExpression getN();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression
   * @see #getN()
   * @generated
   */
  void setN(NotExpression value);

  /**
   * Returns the value of the '<em><b>M</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' attribute.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression
   * @see #setM(MustExpression)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getClauseExpression_M()
   * @model
   * @generated
   */
  MustExpression getM();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getM <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' attribute.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression
   * @see #getM()
   * @generated
   */
  void setM(MustExpression value);

  /**
   * Returns the value of the '<em><b>Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clause</em>' containment reference.
   * @see #setClause(EObject)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getClauseExpression_Clause()
   * @model containment="true"
   * @generated
   */
  EObject getClause();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getClause <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clause</em>' containment reference.
   * @see #getClause()
   * @generated
   */
  void setClause(EObject value);

} // ClauseExpression
