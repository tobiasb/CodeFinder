/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NumberField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.NumberFieldImpl#getParameterCount <em>Parameter Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberFieldImpl extends MinimalEObjectImpl.Container implements NumberField
{
  /**
   * The default value of the '{@link #getParameterCount() <em>Parameter Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterCount()
   * @generated
   * @ordered
   */
  protected static final String PARAMETER_COUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameterCount() <em>Parameter Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterCount()
   * @generated
   * @ordered
   */
  protected String parameterCount = PARAMETER_COUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberFieldImpl()
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
    return LuceneQueryPackage.Literals.NUMBER_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameterCount()
  {
    return parameterCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterCount(String newParameterCount)
  {
    String oldParameterCount = parameterCount;
    parameterCount = newParameterCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.NUMBER_FIELD__PARAMETER_COUNT, oldParameterCount, parameterCount));
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
      case LuceneQueryPackage.NUMBER_FIELD__PARAMETER_COUNT:
        return getParameterCount();
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
      case LuceneQueryPackage.NUMBER_FIELD__PARAMETER_COUNT:
        setParameterCount((String)newValue);
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
      case LuceneQueryPackage.NUMBER_FIELD__PARAMETER_COUNT:
        setParameterCount(PARAMETER_COUNT_EDEFAULT);
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
      case LuceneQueryPackage.NUMBER_FIELD__PARAMETER_COUNT:
        return PARAMETER_COUNT_EDEFAULT == null ? parameterCount != null : !PARAMETER_COUNT_EDEFAULT.equals(parameterCount);
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
    result.append(" (ParameterCount: ");
    result.append(parameterCount);
    result.append(')');
    return result.toString();
  }

} //NumberFieldImpl
