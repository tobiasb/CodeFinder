/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getB <em>B</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getExp1()
 * @model
 * @generated
 */
public interface Exp1 extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getExp1_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>B</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' attribute.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp
   * @see #setB(BooleanExp)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getExp1_B()
   * @model
   * @generated
   */
  BooleanExp getB();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getB <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' attribute.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BooleanExp
   * @see #getB()
   * @generated
   */
  void setB(BooleanExp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getExp1_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Exp1
