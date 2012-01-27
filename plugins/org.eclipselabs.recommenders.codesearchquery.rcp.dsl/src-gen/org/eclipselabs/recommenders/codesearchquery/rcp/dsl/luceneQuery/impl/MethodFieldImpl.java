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
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.MethodFieldImpl#getUsedMethods <em>Used Methods</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.MethodFieldImpl#getUsedMethodsInTry <em>Used Methods In Try</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.MethodFieldImpl#getUsedMethodsInFinally <em>Used Methods In Finally</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.MethodFieldImpl#getOverriddenMethods <em>Overridden Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodFieldImpl extends MinimalEObjectImpl.Container implements MethodField
{
  /**
   * The default value of the '{@link #getUsedMethods() <em>Used Methods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedMethods()
   * @generated
   * @ordered
   */
  protected static final String USED_METHODS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsedMethods() <em>Used Methods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedMethods()
   * @generated
   * @ordered
   */
  protected String usedMethods = USED_METHODS_EDEFAULT;

  /**
   * The default value of the '{@link #getUsedMethodsInTry() <em>Used Methods In Try</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedMethodsInTry()
   * @generated
   * @ordered
   */
  protected static final String USED_METHODS_IN_TRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsedMethodsInTry() <em>Used Methods In Try</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedMethodsInTry()
   * @generated
   * @ordered
   */
  protected String usedMethodsInTry = USED_METHODS_IN_TRY_EDEFAULT;

  /**
   * The default value of the '{@link #getUsedMethodsInFinally() <em>Used Methods In Finally</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedMethodsInFinally()
   * @generated
   * @ordered
   */
  protected static final String USED_METHODS_IN_FINALLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsedMethodsInFinally() <em>Used Methods In Finally</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedMethodsInFinally()
   * @generated
   * @ordered
   */
  protected String usedMethodsInFinally = USED_METHODS_IN_FINALLY_EDEFAULT;

  /**
   * The default value of the '{@link #getOverriddenMethods() <em>Overridden Methods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverriddenMethods()
   * @generated
   * @ordered
   */
  protected static final String OVERRIDDEN_METHODS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOverriddenMethods() <em>Overridden Methods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverriddenMethods()
   * @generated
   * @ordered
   */
  protected String overriddenMethods = OVERRIDDEN_METHODS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodFieldImpl()
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
    return LuceneQueryPackage.Literals.METHOD_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsedMethods()
  {
    return usedMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsedMethods(String newUsedMethods)
  {
    String oldUsedMethods = usedMethods;
    usedMethods = newUsedMethods;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.METHOD_FIELD__USED_METHODS, oldUsedMethods, usedMethods));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsedMethodsInTry()
  {
    return usedMethodsInTry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsedMethodsInTry(String newUsedMethodsInTry)
  {
    String oldUsedMethodsInTry = usedMethodsInTry;
    usedMethodsInTry = newUsedMethodsInTry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_TRY, oldUsedMethodsInTry, usedMethodsInTry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsedMethodsInFinally()
  {
    return usedMethodsInFinally;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsedMethodsInFinally(String newUsedMethodsInFinally)
  {
    String oldUsedMethodsInFinally = usedMethodsInFinally;
    usedMethodsInFinally = newUsedMethodsInFinally;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_FINALLY, oldUsedMethodsInFinally, usedMethodsInFinally));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOverriddenMethods()
  {
    return overriddenMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverriddenMethods(String newOverriddenMethods)
  {
    String oldOverriddenMethods = overriddenMethods;
    overriddenMethods = newOverriddenMethods;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.METHOD_FIELD__OVERRIDDEN_METHODS, oldOverriddenMethods, overriddenMethods));
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
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS:
        return getUsedMethods();
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_TRY:
        return getUsedMethodsInTry();
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_FINALLY:
        return getUsedMethodsInFinally();
      case LuceneQueryPackage.METHOD_FIELD__OVERRIDDEN_METHODS:
        return getOverriddenMethods();
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
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS:
        setUsedMethods((String)newValue);
        return;
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_TRY:
        setUsedMethodsInTry((String)newValue);
        return;
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_FINALLY:
        setUsedMethodsInFinally((String)newValue);
        return;
      case LuceneQueryPackage.METHOD_FIELD__OVERRIDDEN_METHODS:
        setOverriddenMethods((String)newValue);
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
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS:
        setUsedMethods(USED_METHODS_EDEFAULT);
        return;
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_TRY:
        setUsedMethodsInTry(USED_METHODS_IN_TRY_EDEFAULT);
        return;
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_FINALLY:
        setUsedMethodsInFinally(USED_METHODS_IN_FINALLY_EDEFAULT);
        return;
      case LuceneQueryPackage.METHOD_FIELD__OVERRIDDEN_METHODS:
        setOverriddenMethods(OVERRIDDEN_METHODS_EDEFAULT);
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
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS:
        return USED_METHODS_EDEFAULT == null ? usedMethods != null : !USED_METHODS_EDEFAULT.equals(usedMethods);
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_TRY:
        return USED_METHODS_IN_TRY_EDEFAULT == null ? usedMethodsInTry != null : !USED_METHODS_IN_TRY_EDEFAULT.equals(usedMethodsInTry);
      case LuceneQueryPackage.METHOD_FIELD__USED_METHODS_IN_FINALLY:
        return USED_METHODS_IN_FINALLY_EDEFAULT == null ? usedMethodsInFinally != null : !USED_METHODS_IN_FINALLY_EDEFAULT.equals(usedMethodsInFinally);
      case LuceneQueryPackage.METHOD_FIELD__OVERRIDDEN_METHODS:
        return OVERRIDDEN_METHODS_EDEFAULT == null ? overriddenMethods != null : !OVERRIDDEN_METHODS_EDEFAULT.equals(overriddenMethods);
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
    result.append(" (UsedMethods: ");
    result.append(usedMethods);
    result.append(", UsedMethodsInTry: ");
    result.append(usedMethodsInTry);
    result.append(", UsedMethodsInFinally: ");
    result.append(usedMethodsInFinally);
    result.append(", OverriddenMethods: ");
    result.append(overriddenMethods);
    result.append(')');
    return result.toString();
  }

} //MethodFieldImpl
