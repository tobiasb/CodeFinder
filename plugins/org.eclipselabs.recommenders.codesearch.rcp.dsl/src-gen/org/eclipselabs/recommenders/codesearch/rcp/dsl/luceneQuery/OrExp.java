/**
 * Copyright (c) 2012 Tobias Boehm.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp#getOr <em>Or</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryPackage#getOrExp()
 * @model
 * @generated
 */
public interface OrExp extends Expression
{
  /**
   * Returns the value of the '<em><b>Or</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' attribute.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp
   * @see #setOr(BinaryExp)
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryPackage#getOrExp_Or()
   * @model
   * @generated
   */
  BinaryExp getOr();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp#getOr <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or</em>' attribute.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp
   * @see #getOr()
   * @generated
   */
  void setOr(BinaryExp value);

} // OrExp
