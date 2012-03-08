/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.BinaryExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.impl.OrExpImpl#getOr <em>Or</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrExpImpl extends ExpressionImpl implements OrExp
{
  /**
   * The default value of the '{@link #getOr() <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOr()
   * @generated
   * @ordered
   */
  protected static final BinaryExp OR_EDEFAULT = BinaryExp.OR1;

  /**
   * The cached value of the '{@link #getOr() <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOr()
   * @generated
   * @ordered
   */
  protected BinaryExp or = OR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrExpImpl()
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
    return LuceneQueryPackage.Literals.OR_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExp getOr()
  {
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOr(BinaryExp newOr)
  {
    BinaryExp oldOr = or;
    or = newOr == null ? OR_EDEFAULT : newOr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.OR_EXP__OR, oldOr, or));
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
      case LuceneQueryPackage.OR_EXP__OR:
        return getOr();
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
      case LuceneQueryPackage.OR_EXP__OR:
        setOr((BinaryExp)newValue);
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
      case LuceneQueryPackage.OR_EXP__OR:
        setOr(OR_EDEFAULT);
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
      case LuceneQueryPackage.OR_EXP__OR:
        return or != OR_EDEFAULT;
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
    result.append(" (or: ");
    result.append(or);
    result.append(')');
    return result.toString();
  }

} //OrExpImpl
