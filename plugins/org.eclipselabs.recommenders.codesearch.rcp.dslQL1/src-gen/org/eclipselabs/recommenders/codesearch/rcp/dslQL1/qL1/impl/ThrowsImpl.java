/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throws</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ThrowsImpl#getThrownType <em>Thrown Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThrowsImpl extends MinimalEObjectImpl.Container implements Throws
{
  /**
   * The default value of the '{@link #getThrownType() <em>Thrown Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrownType()
   * @generated
   * @ordered
   */
  protected static final String THROWN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThrownType() <em>Thrown Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrownType()
   * @generated
   * @ordered
   */
  protected String thrownType = THROWN_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ThrowsImpl()
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
    return QL1Package.Literals.THROWS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThrownType()
  {
    return thrownType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThrownType(String newThrownType)
  {
    String oldThrownType = thrownType;
    thrownType = newThrownType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.THROWS__THROWN_TYPE, oldThrownType, thrownType));
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
      case QL1Package.THROWS__THROWN_TYPE:
        return getThrownType();
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
      case QL1Package.THROWS__THROWN_TYPE:
        setThrownType((String)newValue);
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
      case QL1Package.THROWS__THROWN_TYPE:
        setThrownType(THROWN_TYPE_EDEFAULT);
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
      case QL1Package.THROWS__THROWN_TYPE:
        return THROWN_TYPE_EDEFAULT == null ? thrownType != null : !THROWN_TYPE_EDEFAULT.equals(thrownType);
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
    result.append(" (thrownType: ");
    result.append(thrownType);
    result.append(')');
    return result.toString();
  }

} //ThrowsImpl
