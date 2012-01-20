/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl;

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

import org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.Field;
import org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.FieldType;
import org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl.FieldImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl.FieldImpl#isProposeType <em>Propose Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl.FieldImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isProposeType() <em>Propose Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProposeType()
   * @generated
   * @ordered
   */
  protected static final boolean PROPOSE_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProposeType() <em>Propose Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProposeType()
   * @generated
   * @ordered
   */
  protected boolean proposeType = PROPOSE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<FieldType> types;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldImpl()
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
    return LuceneFieldsPackage.Literals.FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProposeType()
  {
    return proposeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProposeType(boolean newProposeType)
  {
    boolean oldProposeType = proposeType;
    proposeType = newProposeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD__PROPOSE_TYPE, oldProposeType, proposeType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldType> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<FieldType>(FieldType.class, this, LuceneFieldsPackage.FIELD__TYPES);
    }
    return types;
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
      case LuceneFieldsPackage.FIELD__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
      case LuceneFieldsPackage.FIELD__NAME:
        return getName();
      case LuceneFieldsPackage.FIELD__VALUE:
        return getValue();
      case LuceneFieldsPackage.FIELD__PROPOSE_TYPE:
        return isProposeType();
      case LuceneFieldsPackage.FIELD__TYPES:
        return getTypes();
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
      case LuceneFieldsPackage.FIELD__NAME:
        setName((String)newValue);
        return;
      case LuceneFieldsPackage.FIELD__VALUE:
        setValue((String)newValue);
        return;
      case LuceneFieldsPackage.FIELD__PROPOSE_TYPE:
        setProposeType((Boolean)newValue);
        return;
      case LuceneFieldsPackage.FIELD__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends FieldType>)newValue);
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
      case LuceneFieldsPackage.FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD__PROPOSE_TYPE:
        setProposeType(PROPOSE_TYPE_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD__TYPES:
        getTypes().clear();
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
      case LuceneFieldsPackage.FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LuceneFieldsPackage.FIELD__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case LuceneFieldsPackage.FIELD__PROPOSE_TYPE:
        return proposeType != PROPOSE_TYPE_EDEFAULT;
      case LuceneFieldsPackage.FIELD__TYPES:
        return types != null && !types.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(", proposeType: ");
    result.append(proposeType);
    result.append(')');
    return result.toString();
  }

} //FieldImpl
