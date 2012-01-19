/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MustExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl#getN <em>N</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl#getM <em>M</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClauseExpressionImpl extends MinimalEObjectImpl.Container implements ClauseExpression
{
  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final NotExpression N_EDEFAULT = NotExpression.N1;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected NotExpression n = N_EDEFAULT;

  /**
   * The default value of the '{@link #getM() <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected static final MustExpression M_EDEFAULT = MustExpression.M;

  /**
   * The cached value of the '{@link #getM() <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM()
   * @generated
   * @ordered
   */
  protected MustExpression m = M_EDEFAULT;

  /**
   * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClause()
   * @generated
   * @ordered
   */
  protected EObject clause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClauseExpressionImpl()
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
    return LuceneQueryPackage.Literals.CLAUSE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotExpression getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(NotExpression newN)
  {
    NotExpression oldN = n;
    n = newN == null ? N_EDEFAULT : newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.CLAUSE_EXPRESSION__N, oldN, n));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MustExpression getM()
  {
    return m;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setM(MustExpression newM)
  {
    MustExpression oldM = m;
    m = newM == null ? M_EDEFAULT : newM;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.CLAUSE_EXPRESSION__M, oldM, m));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getClause()
  {
    return clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClause(EObject newClause, NotificationChain msgs)
  {
    EObject oldClause = clause;
    clause = newClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.CLAUSE_EXPRESSION__CLAUSE, oldClause, newClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClause(EObject newClause)
  {
    if (newClause != clause)
    {
      NotificationChain msgs = null;
      if (clause != null)
        msgs = ((InternalEObject)clause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LuceneQueryPackage.CLAUSE_EXPRESSION__CLAUSE, null, msgs);
      if (newClause != null)
        msgs = ((InternalEObject)newClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LuceneQueryPackage.CLAUSE_EXPRESSION__CLAUSE, null, msgs);
      msgs = basicSetClause(newClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.CLAUSE_EXPRESSION__CLAUSE, newClause, newClause));
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
      case LuceneQueryPackage.CLAUSE_EXPRESSION__CLAUSE:
        return basicSetClause(null, msgs);
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
      case LuceneQueryPackage.CLAUSE_EXPRESSION__N:
        return getN();
      case LuceneQueryPackage.CLAUSE_EXPRESSION__M:
        return getM();
      case LuceneQueryPackage.CLAUSE_EXPRESSION__CLAUSE:
        return getClause();
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
      case LuceneQueryPackage.CLAUSE_EXPRESSION__N:
        setN((NotExpression)newValue);
        return;
      case LuceneQueryPackage.CLAUSE_EXPRESSION__M:
        setM((MustExpression)newValue);
        return;
      case LuceneQueryPackage.CLAUSE_EXPRESSION__CLAUSE:
        setClause((EObject)newValue);
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
      case LuceneQueryPackage.CLAUSE_EXPRESSION__N:
        setN(N_EDEFAULT);
        return;
      case LuceneQueryPackage.CLAUSE_EXPRESSION__M:
        setM(M_EDEFAULT);
        return;
      case LuceneQueryPackage.CLAUSE_EXPRESSION__CLAUSE:
        setClause((EObject)null);
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
      case LuceneQueryPackage.CLAUSE_EXPRESSION__N:
        return n != N_EDEFAULT;
      case LuceneQueryPackage.CLAUSE_EXPRESSION__M:
        return m != M_EDEFAULT;
      case LuceneQueryPackage.CLAUSE_EXPRESSION__CLAUSE:
        return clause != null;
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
    result.append(" (n: ");
    result.append(n);
    result.append(", m: ");
    result.append(m);
    result.append(')');
    return result.toString();
  }

} //ClauseExpressionImpl
