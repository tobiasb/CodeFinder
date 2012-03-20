/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall;
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
   * The default value of the '{@link #getNameCallee() <em>Name Callee</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameCallee()
   * @generated
   * @ordered
   */
  protected static final String NAME_CALLEE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameCallee() <em>Name Callee</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameCallee()
   * @generated
   * @ordered
   */
  protected String nameCallee = NAME_CALLEE_EDEFAULT;

  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getNameCaller() <em>Name Caller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameCaller()
   * @generated
   * @ordered
   */
  protected static final String NAME_CALLER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameCaller() <em>Name Caller</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameCaller()
   * @generated
   * @ordered
   */
  protected String nameCaller = NAME_CALLER_EDEFAULT;

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
  public String getNameCallee()
  {
    return nameCallee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameCallee(String newNameCallee)
  {
    String oldNameCallee = nameCallee;
    nameCallee = newNameCallee;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL2Package.METHOD_CALL__NAME_CALLEE, oldNameCallee, nameCallee));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL2Package.METHOD_CALL__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameCaller()
  {
    return nameCaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameCaller(String newNameCaller)
  {
    String oldNameCaller = nameCaller;
    nameCaller = newNameCaller;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL2Package.METHOD_CALL__NAME_CALLER, oldNameCaller, nameCaller));
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
        setNameCallee((String)newValue);
        return;
      case QL2Package.METHOD_CALL__METHOD:
        setMethod((String)newValue);
        return;
      case QL2Package.METHOD_CALL__NAME_CALLER:
        setNameCaller((String)newValue);
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
        setNameCallee(NAME_CALLEE_EDEFAULT);
        return;
      case QL2Package.METHOD_CALL__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case QL2Package.METHOD_CALL__NAME_CALLER:
        setNameCaller(NAME_CALLER_EDEFAULT);
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
        return NAME_CALLEE_EDEFAULT == null ? nameCallee != null : !NAME_CALLEE_EDEFAULT.equals(nameCallee);
      case QL2Package.METHOD_CALL__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case QL2Package.METHOD_CALL__NAME_CALLER:
        return NAME_CALLER_EDEFAULT == null ? nameCaller != null : !NAME_CALLER_EDEFAULT.equals(nameCaller);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nameCallee: ");
    result.append(nameCallee);
    result.append(", method: ");
    result.append(method);
    result.append(", nameCaller: ");
    result.append(nameCaller);
    result.append(')');
    return result.toString();
  }

} //MethodCallImpl
