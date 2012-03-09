/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Pattern Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternDefinitionImpl#getModifierDefinition <em>Modifier Definition</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternDefinitionImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternDefinitionImpl#getParameterDefinition <em>Parameter Definition</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternDefinitionImpl#getThrowsClause <em>Throws Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodPatternDefinitionImpl extends MinimalEObjectImpl.Container implements MethodPatternDefinition
{
  /**
   * The cached value of the '{@link #getModifierDefinition() <em>Modifier Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifierDefinition()
   * @generated
   * @ordered
   */
  protected ModifierDefinition modifierDefinition;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected ReturnType returnType;

  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected MethodName methodName;

  /**
   * The cached value of the '{@link #getParameterDefinition() <em>Parameter Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterDefinition()
   * @generated
   * @ordered
   */
  protected ParameterDefinition parameterDefinition;

  /**
   * The cached value of the '{@link #getThrowsClause() <em>Throws Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrowsClause()
   * @generated
   * @ordered
   */
  protected Throws throwsClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodPatternDefinitionImpl()
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
    return QL1Package.Literals.METHOD_PATTERN_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifierDefinition getModifierDefinition()
  {
    return modifierDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModifierDefinition(ModifierDefinition newModifierDefinition, NotificationChain msgs)
  {
    ModifierDefinition oldModifierDefinition = modifierDefinition;
    modifierDefinition = newModifierDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__MODIFIER_DEFINITION, oldModifierDefinition, newModifierDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifierDefinition(ModifierDefinition newModifierDefinition)
  {
    if (newModifierDefinition != modifierDefinition)
    {
      NotificationChain msgs = null;
      if (modifierDefinition != null)
        msgs = ((InternalEObject)modifierDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__MODIFIER_DEFINITION, null, msgs);
      if (newModifierDefinition != null)
        msgs = ((InternalEObject)newModifierDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__MODIFIER_DEFINITION, null, msgs);
      msgs = basicSetModifierDefinition(newModifierDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__MODIFIER_DEFINITION, newModifierDefinition, newModifierDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(ReturnType newReturnType, NotificationChain msgs)
  {
    ReturnType oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(ReturnType newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName getMethodName()
  {
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodName(MethodName newMethodName, NotificationChain msgs)
  {
    MethodName oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__METHOD_NAME, oldMethodName, newMethodName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodName(MethodName newMethodName)
  {
    if (newMethodName != methodName)
    {
      NotificationChain msgs = null;
      if (methodName != null)
        msgs = ((InternalEObject)methodName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__METHOD_NAME, null, msgs);
      if (newMethodName != null)
        msgs = ((InternalEObject)newMethodName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__METHOD_NAME, null, msgs);
      msgs = basicSetMethodName(newMethodName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__METHOD_NAME, newMethodName, newMethodName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDefinition getParameterDefinition()
  {
    return parameterDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterDefinition(ParameterDefinition newParameterDefinition, NotificationChain msgs)
  {
    ParameterDefinition oldParameterDefinition = parameterDefinition;
    parameterDefinition = newParameterDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION, oldParameterDefinition, newParameterDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterDefinition(ParameterDefinition newParameterDefinition)
  {
    if (newParameterDefinition != parameterDefinition)
    {
      NotificationChain msgs = null;
      if (parameterDefinition != null)
        msgs = ((InternalEObject)parameterDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION, null, msgs);
      if (newParameterDefinition != null)
        msgs = ((InternalEObject)newParameterDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION, null, msgs);
      msgs = basicSetParameterDefinition(newParameterDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION, newParameterDefinition, newParameterDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Throws getThrowsClause()
  {
    return throwsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThrowsClause(Throws newThrowsClause, NotificationChain msgs)
  {
    Throws oldThrowsClause = throwsClause;
    throwsClause = newThrowsClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__THROWS_CLAUSE, oldThrowsClause, newThrowsClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThrowsClause(Throws newThrowsClause)
  {
    if (newThrowsClause != throwsClause)
    {
      NotificationChain msgs = null;
      if (throwsClause != null)
        msgs = ((InternalEObject)throwsClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__THROWS_CLAUSE, null, msgs);
      if (newThrowsClause != null)
        msgs = ((InternalEObject)newThrowsClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN_DEFINITION__THROWS_CLAUSE, null, msgs);
      msgs = basicSetThrowsClause(newThrowsClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN_DEFINITION__THROWS_CLAUSE, newThrowsClause, newThrowsClause));
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
      case QL1Package.METHOD_PATTERN_DEFINITION__MODIFIER_DEFINITION:
        return basicSetModifierDefinition(null, msgs);
      case QL1Package.METHOD_PATTERN_DEFINITION__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case QL1Package.METHOD_PATTERN_DEFINITION__METHOD_NAME:
        return basicSetMethodName(null, msgs);
      case QL1Package.METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION:
        return basicSetParameterDefinition(null, msgs);
      case QL1Package.METHOD_PATTERN_DEFINITION__THROWS_CLAUSE:
        return basicSetThrowsClause(null, msgs);
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
      case QL1Package.METHOD_PATTERN_DEFINITION__MODIFIER_DEFINITION:
        return getModifierDefinition();
      case QL1Package.METHOD_PATTERN_DEFINITION__RETURN_TYPE:
        return getReturnType();
      case QL1Package.METHOD_PATTERN_DEFINITION__METHOD_NAME:
        return getMethodName();
      case QL1Package.METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION:
        return getParameterDefinition();
      case QL1Package.METHOD_PATTERN_DEFINITION__THROWS_CLAUSE:
        return getThrowsClause();
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
      case QL1Package.METHOD_PATTERN_DEFINITION__MODIFIER_DEFINITION:
        setModifierDefinition((ModifierDefinition)newValue);
        return;
      case QL1Package.METHOD_PATTERN_DEFINITION__RETURN_TYPE:
        setReturnType((ReturnType)newValue);
        return;
      case QL1Package.METHOD_PATTERN_DEFINITION__METHOD_NAME:
        setMethodName((MethodName)newValue);
        return;
      case QL1Package.METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION:
        setParameterDefinition((ParameterDefinition)newValue);
        return;
      case QL1Package.METHOD_PATTERN_DEFINITION__THROWS_CLAUSE:
        setThrowsClause((Throws)newValue);
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
      case QL1Package.METHOD_PATTERN_DEFINITION__MODIFIER_DEFINITION:
        setModifierDefinition((ModifierDefinition)null);
        return;
      case QL1Package.METHOD_PATTERN_DEFINITION__RETURN_TYPE:
        setReturnType((ReturnType)null);
        return;
      case QL1Package.METHOD_PATTERN_DEFINITION__METHOD_NAME:
        setMethodName((MethodName)null);
        return;
      case QL1Package.METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION:
        setParameterDefinition((ParameterDefinition)null);
        return;
      case QL1Package.METHOD_PATTERN_DEFINITION__THROWS_CLAUSE:
        setThrowsClause((Throws)null);
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
      case QL1Package.METHOD_PATTERN_DEFINITION__MODIFIER_DEFINITION:
        return modifierDefinition != null;
      case QL1Package.METHOD_PATTERN_DEFINITION__RETURN_TYPE:
        return returnType != null;
      case QL1Package.METHOD_PATTERN_DEFINITION__METHOD_NAME:
        return methodName != null;
      case QL1Package.METHOD_PATTERN_DEFINITION__PARAMETER_DEFINITION:
        return parameterDefinition != null;
      case QL1Package.METHOD_PATTERN_DEFINITION__THROWS_CLAUSE:
        return throwsClause != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodPatternDefinitionImpl
