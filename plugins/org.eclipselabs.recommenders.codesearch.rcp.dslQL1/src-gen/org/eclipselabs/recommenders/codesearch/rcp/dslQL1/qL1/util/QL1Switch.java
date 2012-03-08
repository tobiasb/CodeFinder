/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package
 * @generated
 */
public class QL1Switch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QL1Package modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QL1Switch()
  {
    if (modelPackage == null)
    {
      modelPackage = QL1Package.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case QL1Package.METHOD_PATTERN:
      {
        MethodPattern methodPattern = (MethodPattern)theEObject;
        T result = caseMethodPattern(methodPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.METHOD_PATTERN_DEFINITION:
      {
        MethodPatternDefinition methodPatternDefinition = (MethodPatternDefinition)theEObject;
        T result = caseMethodPatternDefinition(methodPatternDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.PARAMETER_DEFINITION:
      {
        ParameterDefinition parameterDefinition = (ParameterDefinition)theEObject;
        T result = caseParameterDefinition(parameterDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.MODIFIER:
      {
        Modifier modifier = (Modifier)theEObject;
        T result = caseModifier(modifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.RETURN_TYPE:
      {
        ReturnType returnType = (ReturnType)theEObject;
        T result = caseReturnType(returnType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.PARAMETER_ELEMENT_HOLDER:
      {
        ParameterElementHolder parameterElementHolder = (ParameterElementHolder)theEObject;
        T result = caseParameterElementHolder(parameterElementHolder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.SINGLE_ELEMENT:
      {
        SingleElement singleElement = (SingleElement)theEObject;
        T result = caseSingleElement(singleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.MULTI_ELEMENT:
      {
        MultiElement multiElement = (MultiElement)theEObject;
        T result = caseMultiElement(multiElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.PARAMETER_TYPE:
      {
        ParameterType parameterType = (ParameterType)theEObject;
        T result = caseParameterType(parameterType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.THROWS:
      {
        Throws throws_ = (Throws)theEObject;
        T result = caseThrows(throws_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QL1Package.METHOD_NAME:
      {
        MethodName methodName = (MethodName)theEObject;
        T result = caseMethodName(methodName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodPattern(MethodPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Pattern Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Pattern Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodPatternDefinition(MethodPatternDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterDefinition(ParameterDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifier(Modifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnType(ReturnType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Element Holder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Element Holder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterElementHolder(ParameterElementHolder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleElement(SingleElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiElement(MultiElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterType(ParameterType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Throws</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Throws</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThrows(Throws object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodName(MethodName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //QL1Switch
