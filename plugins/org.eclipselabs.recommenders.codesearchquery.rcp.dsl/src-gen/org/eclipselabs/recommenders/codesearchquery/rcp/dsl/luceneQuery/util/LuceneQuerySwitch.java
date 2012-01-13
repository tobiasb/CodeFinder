/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.*;

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
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage
 * @generated
 */
public class LuceneQuerySwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LuceneQueryPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LuceneQuerySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LuceneQueryPackage.eINSTANCE;
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
      case LuceneQueryPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.CLAUSE_EXPRESSION:
      {
        ClauseExpression clauseExpression = (ClauseExpression)theEObject;
        T result = caseClauseExpression(clauseExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.SIMPLE_CLAUSE:
      {
        SimpleClause simpleClause = (SimpleClause)theEObject;
        T result = caseSimpleClause(simpleClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.TYPE_CLAUSE:
      {
        TypeClause typeClause = (TypeClause)theEObject;
        T result = caseTypeClause(typeClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.TYPE_TEST:
      {
        TypeTest typeTest = (TypeTest)theEObject;
        T result = caseTypeTest(typeTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.FIELD_NAME:
      {
        FieldName fieldName = (FieldName)theEObject;
        T result = caseFieldName(fieldName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.TYPE_FIELD_NAME:
      {
        TypeFieldName typeFieldName = (TypeFieldName)theEObject;
        T result = caseTypeFieldName(typeFieldName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.EXP1:
      {
        Exp1 exp1 = (Exp1)theEObject;
        T result = caseExp1(exp1);
        if (result == null) result = caseExpression(exp1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clause Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clause Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClauseExpression(ClauseExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleClause(SimpleClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeClause(TypeClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeTest(TypeTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldName(FieldName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Field Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Field Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeFieldName(TypeFieldName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp1(Exp1 object)
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

} //LuceneQuerySwitch
