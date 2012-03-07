/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ParameterElementImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterElementImpl extends MinimalEObjectImpl.Container implements ParameterElement
{
  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<ParameterType> values;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<ParameterType> types;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterElementImpl()
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
    return QL1Package.Literals.PARAMETER_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterType> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, QL1Package.PARAMETER_ELEMENT__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterType> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, QL1Package.PARAMETER_ELEMENT__TYPES);
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
      case QL1Package.PARAMETER_ELEMENT__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
      case QL1Package.PARAMETER_ELEMENT__TYPES:
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
      case QL1Package.PARAMETER_ELEMENT__VALUES:
        return getValues();
      case QL1Package.PARAMETER_ELEMENT__TYPES:
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
      case QL1Package.PARAMETER_ELEMENT__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends ParameterType>)newValue);
        return;
      case QL1Package.PARAMETER_ELEMENT__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends ParameterType>)newValue);
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
      case QL1Package.PARAMETER_ELEMENT__VALUES:
        getValues().clear();
        return;
      case QL1Package.PARAMETER_ELEMENT__TYPES:
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
      case QL1Package.PARAMETER_ELEMENT__VALUES:
        return values != null && !values.isEmpty();
      case QL1Package.PARAMETER_ELEMENT__TYPES:
        return types != null && !types.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ParameterElementImpl
