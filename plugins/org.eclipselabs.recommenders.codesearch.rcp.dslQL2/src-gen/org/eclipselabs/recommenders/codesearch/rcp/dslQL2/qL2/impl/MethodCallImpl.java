/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.CalledMethodName;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Name;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.MethodCallImpl#getNameCallee <em>Name Callee</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.MethodCallImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.MethodCallImpl#getNameCaller <em>Name Caller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodCallImpl extends StatementImpl implements MethodCall
{
  /**
   * The cached value of the '{@link #getNameCallee() <em>Name Callee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameCallee()
   * @generated
   * @ordered
   */
  protected Name nameCallee;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected CalledMethodName method;

  /**
   * The cached value of the '{@link #getNameCaller() <em>Name Caller</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameCaller()
   * @generated
   * @ordered
   */
  protected Name nameCaller;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodCallImpl()
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
    return QL2Package.Literals.METHOD_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getNameCallee()
  {
    return nameCallee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameCallee(Name newNameCallee, NotificationChain msgs)
  {
    Name oldNameCallee = nameCallee;
    nameCallee = newNameCallee;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL2Package.METHOD_CALL__NAME_CALLEE, oldNameCallee, newNameCallee);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameCallee(Name newNameCallee)
  {
    if (newNameCallee != nameCallee)
    {
      NotificationChain msgs = null;
      if (nameCallee != null)
        msgs = ((InternalEObject)nameCallee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL2Package.METHOD_CALL__NAME_CALLEE, null, msgs);
      if (newNameCallee != null)
        msgs = ((InternalEObject)newNameCallee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL2Package.METHOD_CALL__NAME_CALLEE, null, msgs);
      msgs = basicSetNameCallee(newNameCallee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL2Package.METHOD_CALL__NAME_CALLEE, newNameCallee, newNameCallee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CalledMethodName getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(CalledMethodName newMethod, NotificationChain msgs)
  {
    CalledMethodName oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL2Package.METHOD_CALL__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(CalledMethodName newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL2Package.METHOD_CALL__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL2Package.METHOD_CALL__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL2Package.METHOD_CALL__METHOD, newMethod, newMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getNameCaller()
  {
    return nameCaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameCaller(Name newNameCaller, NotificationChain msgs)
  {
    Name oldNameCaller = nameCaller;
    nameCaller = newNameCaller;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL2Package.METHOD_CALL__NAME_CALLER, oldNameCaller, newNameCaller);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameCaller(Name newNameCaller)
  {
    if (newNameCaller != nameCaller)
    {
      NotificationChain msgs = null;
      if (nameCaller != null)
        msgs = ((InternalEObject)nameCaller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL2Package.METHOD_CALL__NAME_CALLER, null, msgs);
      if (newNameCaller != null)
        msgs = ((InternalEObject)newNameCaller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL2Package.METHOD_CALL__NAME_CALLER, null, msgs);
      msgs = basicSetNameCaller(newNameCaller, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL2Package.METHOD_CALL__NAME_CALLER, newNameCaller, newNameCaller));
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
      case QL2Package.METHOD_CALL__NAME_CALLEE:
        return basicSetNameCallee(null, msgs);
      case QL2Package.METHOD_CALL__METHOD:
        return basicSetMethod(null, msgs);
      case QL2Package.METHOD_CALL__NAME_CALLER:
        return basicSetNameCaller(null, msgs);
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
      case QL2Package.METHOD_CALL__NAME_CALLEE:
        return getNameCallee();
      case QL2Package.METHOD_CALL__METHOD:
        return getMethod();
      case QL2Package.METHOD_CALL__NAME_CALLER:
        return getNameCaller();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QL2Package.METHOD_CALL__NAME_CALLEE:
        setNameCallee((Name)newValue);
        return;
      case QL2Package.METHOD_CALL__METHOD:
        setMethod((CalledMethodName)newValue);
        return;
      case QL2Package.METHOD_CALL__NAME_CALLER:
        setNameCaller((Name)newValue);
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
      case QL2Package.METHOD_CALL__NAME_CALLEE:
        setNameCallee((Name)null);
        return;
      case QL2Package.METHOD_CALL__METHOD:
        setMethod((CalledMethodName)null);
        return;
      case QL2Package.METHOD_CALL__NAME_CALLER:
        setNameCaller((Name)null);
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
      case QL2Package.METHOD_CALL__NAME_CALLEE:
        return nameCallee != null;
      case QL2Package.METHOD_CALL__METHOD:
        return method != null;
      case QL2Package.METHOD_CALL__NAME_CALLER:
        return nameCaller != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodCallImpl
