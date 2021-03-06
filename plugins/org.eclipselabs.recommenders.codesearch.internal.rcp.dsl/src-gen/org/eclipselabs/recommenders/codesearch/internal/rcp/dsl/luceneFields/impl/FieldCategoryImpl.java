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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.LuceneFieldsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldCategoryImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldCategoryImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldCategoryImpl#getDesc <em>Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldCategoryImpl extends MinimalEObjectImpl.Container implements FieldCategory
{
  /**
   * The default value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryName()
   * @generated
   * @ordered
   */
  protected static final String CATEGORY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategoryName()
   * @generated
   * @ordered
   */
  protected String categoryName = CATEGORY_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldCategoryImpl()
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
    return LuceneFieldsPackage.Literals.FIELD_CATEGORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCategoryName()
  {
    return categoryName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategoryName(String newCategoryName)
  {
    String oldCategoryName = categoryName;
    categoryName = newCategoryName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_CATEGORY__CATEGORY_NAME, oldCategoryName, categoryName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, LuceneFieldsPackage.FIELD_CATEGORY__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_CATEGORY__DESC, oldDesc, desc));
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
      case LuceneFieldsPackage.FIELD_CATEGORY__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case LuceneFieldsPackage.FIELD_CATEGORY__CATEGORY_NAME:
        return getCategoryName();
      case LuceneFieldsPackage.FIELD_CATEGORY__FIELDS:
        return getFields();
      case LuceneFieldsPackage.FIELD_CATEGORY__DESC:
        return getDesc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LuceneFieldsPackage.FIELD_CATEGORY__CATEGORY_NAME:
        setCategoryName((String)newValue);
        return;
      case LuceneFieldsPackage.FIELD_CATEGORY__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case LuceneFieldsPackage.FIELD_CATEGORY__DESC:
        setDesc((String)newValue);
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
      case LuceneFieldsPackage.FIELD_CATEGORY__CATEGORY_NAME:
        setCategoryName(CATEGORY_NAME_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD_CATEGORY__FIELDS:
        getFields().clear();
        return;
      case LuceneFieldsPackage.FIELD_CATEGORY__DESC:
        setDesc(DESC_EDEFAULT);
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
      case LuceneFieldsPackage.FIELD_CATEGORY__CATEGORY_NAME:
        return CATEGORY_NAME_EDEFAULT == null ? categoryName != null : !CATEGORY_NAME_EDEFAULT.equals(categoryName);
      case LuceneFieldsPackage.FIELD_CATEGORY__FIELDS:
        return fields != null && !fields.isEmpty();
      case LuceneFieldsPackage.FIELD_CATEGORY__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
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
    result.append(" (categoryName: ");
    result.append(categoryName);
    result.append(", desc: ");
    result.append(desc);
    result.append(')');
    return result.toString();
  }

} //FieldCategoryImpl
