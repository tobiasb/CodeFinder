/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.FieldType;
import org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.LuceneFieldsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl#isClassType <em>Class Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl#isMethodType <em>Method Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl#isFieldType <em>Field Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl#isTrycatchType <em>Trycatch Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldTypeImpl extends MinimalEObjectImpl.Container implements FieldType
{
  /**
   * The default value of the '{@link #isClassType() <em>Class Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClassType()
   * @generated
   * @ordered
   */
  protected static final boolean CLASS_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClassType() <em>Class Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClassType()
   * @generated
   * @ordered
   */
  protected boolean classType = CLASS_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isMethodType() <em>Method Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethodType()
   * @generated
   * @ordered
   */
  protected static final boolean METHOD_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMethodType() <em>Method Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethodType()
   * @generated
   * @ordered
   */
  protected boolean methodType = METHOD_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFieldType()
   * @generated
   * @ordered
   */
  protected static final boolean FIELD_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFieldType()
   * @generated
   * @ordered
   */
  protected boolean fieldType = FIELD_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isTrycatchType() <em>Trycatch Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrycatchType()
   * @generated
   * @ordered
   */
  protected static final boolean TRYCATCH_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTrycatchType() <em>Trycatch Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrycatchType()
   * @generated
   * @ordered
   */
  protected boolean trycatchType = TRYCATCH_TYPE_EDEFAULT;

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
  public boolean isClassType()
  {
    return classType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassType(boolean newClassType)
  {
    boolean oldClassType = classType;
    classType = newClassType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_TYPE__CLASS_TYPE, oldClassType, classType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMethodType()
  {
    return methodType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodType(boolean newMethodType)
  {
    boolean oldMethodType = methodType;
    methodType = newMethodType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_TYPE__METHOD_TYPE, oldMethodType, methodType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFieldType()
  {
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldType(boolean newFieldType)
  {
    boolean oldFieldType = fieldType;
    fieldType = newFieldType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_TYPE__FIELD_TYPE, oldFieldType, fieldType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTrycatchType()
  {
    return trycatchType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrycatchType(boolean newTrycatchType)
  {
    boolean oldTrycatchType = trycatchType;
    trycatchType = newTrycatchType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneFieldsPackage.FIELD_TYPE__TRYCATCH_TYPE, oldTrycatchType, trycatchType));
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
      case LuceneFieldsPackage.FIELD_TYPE__CLASS_TYPE:
        return isClassType();
      case LuceneFieldsPackage.FIELD_TYPE__METHOD_TYPE:
        return isMethodType();
      case LuceneFieldsPackage.FIELD_TYPE__FIELD_TYPE:
        return isFieldType();
      case LuceneFieldsPackage.FIELD_TYPE__TRYCATCH_TYPE:
        return isTrycatchType();
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
      case LuceneFieldsPackage.FIELD_TYPE__CLASS_TYPE:
        setClassType((Boolean)newValue);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__METHOD_TYPE:
        setMethodType((Boolean)newValue);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__FIELD_TYPE:
        setFieldType((Boolean)newValue);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__TRYCATCH_TYPE:
        setTrycatchType((Boolean)newValue);
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
      case LuceneFieldsPackage.FIELD_TYPE__CLASS_TYPE:
        setClassType(CLASS_TYPE_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__METHOD_TYPE:
        setMethodType(METHOD_TYPE_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__FIELD_TYPE:
        setFieldType(FIELD_TYPE_EDEFAULT);
        return;
      case LuceneFieldsPackage.FIELD_TYPE__TRYCATCH_TYPE:
        setTrycatchType(TRYCATCH_TYPE_EDEFAULT);
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
      case LuceneFieldsPackage.FIELD_TYPE__CLASS_TYPE:
        return classType != CLASS_TYPE_EDEFAULT;
      case LuceneFieldsPackage.FIELD_TYPE__METHOD_TYPE:
        return methodType != METHOD_TYPE_EDEFAULT;
      case LuceneFieldsPackage.FIELD_TYPE__FIELD_TYPE:
        return fieldType != FIELD_TYPE_EDEFAULT;
      case LuceneFieldsPackage.FIELD_TYPE__TRYCATCH_TYPE:
        return trycatchType != TRYCATCH_TYPE_EDEFAULT;
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
    result.append(" (classType: ");
    result.append(classType);
    result.append(", methodType: ");
    result.append(methodType);
    result.append(", fieldType: ");
    result.append(fieldType);
    result.append(", trycatchType: ");
    result.append(trycatchType);
    result.append(')');
    return result.toString();
  }

} //FieldTypeImpl
