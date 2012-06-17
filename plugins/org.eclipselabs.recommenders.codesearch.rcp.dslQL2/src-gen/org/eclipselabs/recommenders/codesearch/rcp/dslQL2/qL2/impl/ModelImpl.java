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

package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.ReturnStatement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ModelImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ModelImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ModelImpl#getReturnStatement <em>Return Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<EObject> vars;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getReturnStatement() <em>Return Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnStatement()
   * @generated
   * @ordered
   */
  protected ReturnStatement returnStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QL2Package.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectContainmentEList<EObject>(EObject.class, this, QL2Package.MODEL__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, QL2Package.MODEL__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement getReturnStatement()
  {
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnStatement(ReturnStatement newReturnStatement, NotificationChain msgs)
  {
    ReturnStatement oldReturnStatement = returnStatement;
    returnStatement = newReturnStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL2Package.MODEL__RETURN_STATEMENT, oldReturnStatement, newReturnStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnStatement(ReturnStatement newReturnStatement)
  {
    if (newReturnStatement != returnStatement)
    {
      NotificationChain msgs = null;
      if (returnStatement != null)
        msgs = ((InternalEObject)returnStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL2Package.MODEL__RETURN_STATEMENT, null, msgs);
      if (newReturnStatement != null)
        msgs = ((InternalEObject)newReturnStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL2Package.MODEL__RETURN_STATEMENT, null, msgs);
      msgs = basicSetReturnStatement(newReturnStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL2Package.MODEL__RETURN_STATEMENT, newReturnStatement, newReturnStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QL2Package.MODEL__VARS:
        return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
      case QL2Package.MODEL__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case QL2Package.MODEL__RETURN_STATEMENT:
        return basicSetReturnStatement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QL2Package.MODEL__VARS:
        return getVars();
      case QL2Package.MODEL__STATEMENTS:
        return getStatements();
      case QL2Package.MODEL__RETURN_STATEMENT:
        return getReturnStatement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QL2Package.MODEL__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends EObject>)newValue);
        return;
      case QL2Package.MODEL__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case QL2Package.MODEL__RETURN_STATEMENT:
        setReturnStatement((ReturnStatement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QL2Package.MODEL__VARS:
        getVars().clear();
        return;
      case QL2Package.MODEL__STATEMENTS:
        getStatements().clear();
        return;
      case QL2Package.MODEL__RETURN_STATEMENT:
        setReturnStatement((ReturnStatement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QL2Package.MODEL__VARS:
        return vars != null && !vars.isEmpty();
      case QL2Package.MODEL__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case QL2Package.MODEL__RETURN_STATEMENT:
        return returnStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
