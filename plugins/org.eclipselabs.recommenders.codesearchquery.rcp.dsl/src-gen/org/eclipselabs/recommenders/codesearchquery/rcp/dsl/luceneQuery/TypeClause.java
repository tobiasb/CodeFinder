/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getN <em>N</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getTypeClause()
 * @model
 * @generated
 */
public interface TypeClause extends EObject
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
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getTypeClause_N()
   * @model
   * @generated
   */
  NotExpression getN();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression
   * @see #getN()
   * @generated
   */
  void setN(NotExpression value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference.
   * @see #setField(TypeFieldName)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getTypeClause_Field()
   * @model containment="true"
   * @generated
   */
  TypeFieldName getField();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getField <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' containment reference.
   * @see #getField()
   * @generated
   */
  void setField(TypeFieldName value);

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
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getTypeClause_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // TypeClause
