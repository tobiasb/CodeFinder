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

package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition#getParameterElementholder <em>Parameter Elementholder</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getParameterDefinition()
 * @model
 * @generated
 */
public interface ParameterDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Elementholder</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Elementholder</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Elementholder</em>' containment reference list.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package#getParameterDefinition_ParameterElementholder()
   * @model containment="true"
   * @generated
   */
  EList<ParameterElementHolder> getParameterElementholder();

} // ParameterDefinition
