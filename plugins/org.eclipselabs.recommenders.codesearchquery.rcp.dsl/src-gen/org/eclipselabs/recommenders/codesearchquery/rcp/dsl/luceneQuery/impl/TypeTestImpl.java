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
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeTestImpl#getTest1 <em>Test1</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeTestImpl#getTest2 <em>Test2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTestImpl extends MinimalEObjectImpl.Container implements TypeTest
{
  /**
   * The default value of the '{@link #getTest1() <em>Test1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest1()
   * @generated
   * @ordered
   */
  protected static final String TEST1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTest1() <em>Test1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest1()
   * @generated
   * @ordered
   */
  protected String test1 = TEST1_EDEFAULT;

  /**
   * The default value of the '{@link #getTest2() <em>Test2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest2()
   * @generated
   * @ordered
   */
  protected static final String TEST2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTest2() <em>Test2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest2()
   * @generated
   * @ordered
   */
  protected String test2 = TEST2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeTestImpl()
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
    return LuceneQueryPackage.Literals.TYPE_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTest1()
  {
    return test1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest1(String newTest1)
  {
    String oldTest1 = test1;
    test1 = newTest1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.TYPE_TEST__TEST1, oldTest1, test1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTest2()
  {
    return test2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest2(String newTest2)
  {
    String oldTest2 = test2;
    test2 = newTest2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.TYPE_TEST__TEST2, oldTest2, test2));
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
      case LuceneQueryPackage.TYPE_TEST__TEST1:
        return getTest1();
      case LuceneQueryPackage.TYPE_TEST__TEST2:
        return getTest2();
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
      case LuceneQueryPackage.TYPE_TEST__TEST1:
        setTest1((String)newValue);
        return;
      case LuceneQueryPackage.TYPE_TEST__TEST2:
        setTest2((String)newValue);
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
      case LuceneQueryPackage.TYPE_TEST__TEST1:
        setTest1(TEST1_EDEFAULT);
        return;
      case LuceneQueryPackage.TYPE_TEST__TEST2:
        setTest2(TEST2_EDEFAULT);
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
      case LuceneQueryPackage.TYPE_TEST__TEST1:
        return TEST1_EDEFAULT == null ? test1 != null : !TEST1_EDEFAULT.equals(test1);
      case LuceneQueryPackage.TYPE_TEST__TEST2:
        return TEST2_EDEFAULT == null ? test2 != null : !TEST2_EDEFAULT.equals(test2);
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
    result.append(" (test1: ");
    result.append(test1);
    result.append(", test2: ");
    result.append(test2);
    result.append(')');
    return result.toString();
  }

} //TypeTestImpl
