/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl;

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

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl#getParameterElements <em>Parameter Elements</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl#getThrowsClause <em>Throws Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodPatternImpl extends MinimalEObjectImpl.Container implements MethodPattern
{
  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected EList<Modifier> modifiers;

  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final String RETURN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected String returnType = RETURN_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected static final String METHOD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected String methodName = METHOD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterElements() <em>Parameter Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterElements()
   * @generated
   * @ordered
   */
  protected EList<ParameterElement> parameterElements;

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
  protected MethodPatternImpl()
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
    return QL1Package.Literals.METHOD_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Modifier> getModifiers()
  {
    if (modifiers == null)
    {
      modifiers = new EObjectContainmentEList<Modifier>(Modifier.class, this, QL1Package.METHOD_PATTERN__MODIFIERS);
    }
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(String newReturnType)
  {
    String oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethodName()
  {
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodName(String newMethodName)
  {
    String oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN__METHOD_NAME, oldMethodName, methodName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterElement> getParameterElements()
  {
    if (parameterElements == null)
    {
      parameterElements = new EObjectContainmentEList<ParameterElement>(ParameterElement.class, this, QL1Package.METHOD_PATTERN__PARAMETER_ELEMENTS);
    }
    return parameterElements;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN__THROWS_CLAUSE, oldThrowsClause, newThrowsClause);
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
        msgs = ((InternalEObject)throwsClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN__THROWS_CLAUSE, null, msgs);
      if (newThrowsClause != null)
        msgs = ((InternalEObject)newThrowsClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QL1Package.METHOD_PATTERN__THROWS_CLAUSE, null, msgs);
      msgs = basicSetThrowsClause(newThrowsClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN__THROWS_CLAUSE, newThrowsClause, newThrowsClause));
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
      case QL1Package.METHOD_PATTERN__MODIFIERS:
        return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
      case QL1Package.METHOD_PATTERN__PARAMETER_ELEMENTS:
        return ((InternalEList<?>)getParameterElements()).basicRemove(otherEnd, msgs);
      case QL1Package.METHOD_PATTERN__THROWS_CLAUSE:
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
      case QL1Package.METHOD_PATTERN__MODIFIERS:
        return getModifiers();
      case QL1Package.METHOD_PATTERN__RETURN_TYPE:
        return getReturnType();
      case QL1Package.METHOD_PATTERN__METHOD_NAME:
        return getMethodName();
      case QL1Package.METHOD_PATTERN__PARAMETER_ELEMENTS:
        return getParameterElements();
      case QL1Package.METHOD_PATTERN__THROWS_CLAUSE:
        return getThrowsClause();
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
      case QL1Package.METHOD_PATTERN__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends Modifier>)newValue);
        return;
      case QL1Package.METHOD_PATTERN__RETURN_TYPE:
        setReturnType((String)newValue);
        return;
      case QL1Package.METHOD_PATTERN__METHOD_NAME:
        setMethodName((String)newValue);
        return;
      case QL1Package.METHOD_PATTERN__PARAMETER_ELEMENTS:
        getParameterElements().clear();
        getParameterElements().addAll((Collection<? extends ParameterElement>)newValue);
        return;
      case QL1Package.METHOD_PATTERN__THROWS_CLAUSE:
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
      case QL1Package.METHOD_PATTERN__MODIFIERS:
        getModifiers().clear();
        return;
      case QL1Package.METHOD_PATTERN__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
      case QL1Package.METHOD_PATTERN__METHOD_NAME:
        setMethodName(METHOD_NAME_EDEFAULT);
        return;
      case QL1Package.METHOD_PATTERN__PARAMETER_ELEMENTS:
        getParameterElements().clear();
        return;
      case QL1Package.METHOD_PATTERN__THROWS_CLAUSE:
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
      case QL1Package.METHOD_PATTERN__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case QL1Package.METHOD_PATTERN__RETURN_TYPE:
        return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
      case QL1Package.METHOD_PATTERN__METHOD_NAME:
        return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
      case QL1Package.METHOD_PATTERN__PARAMETER_ELEMENTS:
        return parameterElements != null && !parameterElements.isEmpty();
      case QL1Package.METHOD_PATTERN__THROWS_CLAUSE:
        return throwsClause != null;
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
    result.append(" (returnType: ");
    result.append(returnType);
    result.append(", methodName: ");
    result.append(methodName);
    result.append(')');
    return result.toString();
  }

} //MethodPatternImpl
