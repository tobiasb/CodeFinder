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

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FilePathField;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Path Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FilePathFieldImpl#getResourcePath <em>Resource Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilePathFieldImpl extends MinimalEObjectImpl.Container implements FilePathField
{
  /**
   * The default value of the '{@link #getResourcePath() <em>Resource Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcePath()
   * @generated
   * @ordered
   */
  protected static final String RESOURCE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResourcePath() <em>Resource Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcePath()
   * @generated
   * @ordered
   */
  protected String resourcePath = RESOURCE_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilePathFieldImpl()
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
    return LuceneQueryPackage.Literals.FILE_PATH_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResourcePath()
  {
    return resourcePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourcePath(String newResourcePath)
  {
    String oldResourcePath = resourcePath;
    resourcePath = newResourcePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.FILE_PATH_FIELD__RESOURCE_PATH, oldResourcePath, resourcePath));
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
      case LuceneQueryPackage.FILE_PATH_FIELD__RESOURCE_PATH:
        return getResourcePath();
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
      case LuceneQueryPackage.FILE_PATH_FIELD__RESOURCE_PATH:
        setResourcePath((String)newValue);
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
      case LuceneQueryPackage.FILE_PATH_FIELD__RESOURCE_PATH:
        setResourcePath(RESOURCE_PATH_EDEFAULT);
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
      case LuceneQueryPackage.FILE_PATH_FIELD__RESOURCE_PATH:
        return RESOURCE_PATH_EDEFAULT == null ? resourcePath != null : !RESOURCE_PATH_EDEFAULT.equals(resourcePath);
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
    result.append(" (ResourcePath: ");
    result.append(resourcePath);
    result.append(')');
    return result.toString();
  }

} //FilePathFieldImpl
