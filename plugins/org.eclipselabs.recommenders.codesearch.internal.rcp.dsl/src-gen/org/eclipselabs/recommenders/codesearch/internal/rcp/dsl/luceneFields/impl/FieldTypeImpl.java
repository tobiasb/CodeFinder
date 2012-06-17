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

package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.LuceneFieldsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl#isType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl#isMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl#isField <em>Field</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl#isTrycatch <em>Trycatch</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl#isVarusage <em>Varusage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldTypeImpl extends MinimalEObjectImpl.Container implements FieldType
{
  /**
   * The default value of the '{@link #isType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isType()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isType()
   * @generated
   * @ordered
   */
  protected boolean type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethod()
   * @generated
   * @ordered
   */
  protected static final boolean METHOD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethod()
   * @generated
   * @ordered
   */
  protected boolean method = METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #isField() <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isField()
   * @generated
   * @ordered
   */
  protected static final boolean FIELD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isField() <em>Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isField()
   * @generated
   * @ordered
   */
  protected boolean field = FIELD_EDEFAULT;

  /**
   * The default value of the '{@link #isTrycatch() <em>Trycatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrycatch()
   * @generated
   * @ordered
   */
  protected static final boolean TRYCATCH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTrycatch() <em>Trycatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrycatch()
   * @generated
   * @ordered
   */
  protected boolean trycatch = TRYCATCH_EDEFAULT;

  /**
   * The default value of the '{@link #isVarusage() <em>Varusage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarusage()
   * @generated
   * @ordered
   */
  protected static final boolean VARUSAGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVarusage() <em>Varusage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVarusage()
   * @generated
   * @ordered
   */
  protected boolean varusage = VARUSAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldTypeImpl()
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
    return LuceneFieldsPackage.Literals.FIELD_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(boolean newType)
  {
    boolean oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_TYPE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(boolean newMethod)
  {
    boolean oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_TYPE__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(boolean newField)
  {
    boolean oldField = field;
    field = newField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_TYPE__FIELD, oldField, field));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTrycatch()
  {
    return trycatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrycatch(boolean newTrycatch)
  {
    boolean oldTrycatch = trycatch;
    trycatch = newTrycatch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_TYPE__TRYCATCH, oldTrycatch, trycatch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVarusage()
  {
    return varusage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarusage(boolean newVarusage)
  {
    boolean oldVarusage = varusage;
    varusage = newVarusage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_TYPE__VARUSAGE, oldVarusage, varusage));
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
      case LuceneFieldsPackage.FIELD_TYPE__TYPE:
        return isType();
      case LuceneFieldsPackage.FIELD_TYPE__METHOD:
        return isMethod();
      case LuceneFieldsPackage.FIELD_TYPE__FIELD:
        return isField();
      case LuceneFieldsPackage.FIELD_TYPE__TRYCATCH:
        return isTrycatch();
      case LuceneFieldsPackage.FIELD_TYPE__VARUSAGE:
        return isVarusage();
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
      case LuceneFieldsPackage.FIELD_TYPE__TYPE:
        setType((Boolean)newValue);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__METHOD:
        setMethod((Boolean)newValue);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__FIELD:
        setField((Boolean)newValue);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__TRYCATCH:
        setTrycatch((Boolean)newValue);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__VARUSAGE:
        setVarusage((Boolean)newValue);
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
      case LuceneFieldsPackage.FIELD_TYPE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__FIELD:
        setField(FIELD_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__TRYCATCH:
        setTrycatch(TRYCATCH_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__VARUSAGE:
        setVarusage(VARUSAGE_EDEFAULT);
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
      case LuceneFieldsPackage.FIELD_TYPE__TYPE:
        return type != TYPE_EDEFAULT;
      case LuceneFieldsPackage.FIELD_TYPE__METHOD:
        return method != METHOD_EDEFAULT;
      case LuceneFieldsPackage.FIELD_TYPE__FIELD:
        return field != FIELD_EDEFAULT;
      case LuceneFieldsPackage.FIELD_TYPE__TRYCATCH:
        return trycatch != TRYCATCH_EDEFAULT;
      case LuceneFieldsPackage.FIELD_TYPE__VARUSAGE:
        return varusage != VARUSAGE_EDEFAULT;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", method: ");
    result.append(method);
    result.append(", field: ");
    result.append(field);
    result.append(", trycatch: ");
    result.append(trycatch);
    result.append(", varusage: ");
    result.append(varusage);
    result.append(')');
    return result.toString();
  }

} //FieldTypeImpl
