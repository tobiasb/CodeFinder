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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier;
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
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MethodPatternImpl#getParameterTypes <em>Parameter Types</em>}</li>
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
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterTypes()
   * @generated
   * @ordered
   */
  protected EList<String> parameterTypes;

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
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QL1Package.METHOD_PATTERN__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParameterTypes()
  {
    if (parameterTypes == null)
    {
      parameterTypes = new EDataTypeEList<String>(String.class, this, QL1Package.METHOD_PATTERN__PARAMETER_TYPES);
    }
    return parameterTypes;
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
      case QL1Package.METHOD_PATTERN__METHOD:
        return getMethod();
      case QL1Package.METHOD_PATTERN__PARAMETER_TYPES:
        return getParameterTypes();
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
      case QL1Package.METHOD_PATTERN__METHOD:
        setMethod((String)newValue);
        return;
      case QL1Package.METHOD_PATTERN__PARAMETER_TYPES:
        getParameterTypes().clear();
        getParameterTypes().addAll((Collection<? extends String>)newValue);
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
      case QL1Package.METHOD_PATTERN__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case QL1Package.METHOD_PATTERN__PARAMETER_TYPES:
        getParameterTypes().clear();
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
      case QL1Package.METHOD_PATTERN__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case QL1Package.METHOD_PATTERN__PARAMETER_TYPES:
        return parameterTypes != null && !parameterTypes.isEmpty();
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
    result.append(", method: ");
    result.append(method);
    result.append(", parameterTypes: ");
    result.append(parameterTypes);
    result.append(')');
    return result.toString();
  }

} //MethodPatternImpl
