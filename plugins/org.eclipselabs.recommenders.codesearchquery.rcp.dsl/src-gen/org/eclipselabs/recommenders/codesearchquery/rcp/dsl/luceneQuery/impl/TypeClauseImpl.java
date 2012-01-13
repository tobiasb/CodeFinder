/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NotExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeClauseImpl#getN <em>N</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeClauseImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeClauseImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeClauseImpl extends MinimalEObjectImpl.Container implements TypeClause
{
  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final NotExpression N_EDEFAULT = NotExpression.NOT1;

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
   * The cached value of the '{@link #getField() <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected TypeFieldName field;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected TypeTest value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeClauseImpl()
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
    return LuceneQueryPackage.Literals.TYPE_CLAUSE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.TYPE_CLAUSE__N, oldN, n));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFieldName getField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetField(TypeFieldName newField, NotificationChain msgs)
  {
    TypeFieldName oldField = field;
    field = newField;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.TYPE_CLAUSE__FIELD, oldField, newField);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(TypeFieldName newField)
  {
    if (newField != field)
    {
      NotificationChain msgs = null;
      if (field != null)
        msgs = ((InternalEObject)field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LuceneQueryPackage.TYPE_CLAUSE__FIELD, null, msgs);
      if (newField != null)
        msgs = ((InternalEObject)newField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LuceneQueryPackage.TYPE_CLAUSE__FIELD, null, msgs);
      msgs = basicSetField(newField, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.TYPE_CLAUSE__FIELD, newField, newField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTest getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(TypeTest newValue, NotificationChain msgs)
  {
    TypeTest oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.TYPE_CLAUSE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(TypeTest newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LuceneQueryPackage.TYPE_CLAUSE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LuceneQueryPackage.TYPE_CLAUSE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.TYPE_CLAUSE__VALUE, newValue, newValue));
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
      case LuceneQueryPackage.TYPE_CLAUSE__FIELD:
        return basicSetField(null, msgs);
      case LuceneQueryPackage.TYPE_CLAUSE__VALUE:
        return basicSetValue(null, msgs);
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
      case LuceneQueryPackage.TYPE_CLAUSE__N:
        return getN();
      case LuceneQueryPackage.TYPE_CLAUSE__FIELD:
        return getField();
      case LuceneQueryPackage.TYPE_CLAUSE__VALUE:
        return getValue();
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
      case LuceneQueryPackage.TYPE_CLAUSE__N:
        setN((NotExpression)newValue);
        return;
      case LuceneQueryPackage.TYPE_CLAUSE__FIELD:
        setField((TypeFieldName)newValue);
        return;
      case LuceneQueryPackage.TYPE_CLAUSE__VALUE:
        setValue((TypeTest)newValue);
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
      case LuceneQueryPackage.TYPE_CLAUSE__N:
        setN(N_EDEFAULT);
        return;
      case LuceneQueryPackage.TYPE_CLAUSE__FIELD:
        setField((TypeFieldName)null);
        return;
      case LuceneQueryPackage.TYPE_CLAUSE__VALUE:
        setValue((TypeTest)null);
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
      case LuceneQueryPackage.TYPE_CLAUSE__N:
        return n != N_EDEFAULT;
      case LuceneQueryPackage.TYPE_CLAUSE__FIELD:
        return field != null;
      case LuceneQueryPackage.TYPE_CLAUSE__VALUE:
        return value != null;
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
    result.append(')');
    return result.toString();
  }

} //TypeClauseImpl
