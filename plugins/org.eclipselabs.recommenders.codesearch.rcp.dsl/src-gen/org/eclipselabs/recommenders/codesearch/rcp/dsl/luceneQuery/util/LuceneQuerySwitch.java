/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AnnotationField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionType;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.FilePathField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.NumberField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ProjectNameField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TimeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField;

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
 * @see org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryPackage
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
      case LuceneQueryPackage.SIMPLE_FIELD:
      {
        SimpleField simpleField = (SimpleField)theEObject;
        T result = caseSimpleField(simpleField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.TYPE_FIELD:
      {
        TypeField typeField = (TypeField)theEObject;
        T result = caseTypeField(typeField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.METHOD_FIELD:
      {
        MethodField methodField = (MethodField)theEObject;
        T result = caseMethodField(methodField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.FILE_PATH_FIELD:
      {
        FilePathField filePathField = (FilePathField)theEObject;
        T result = caseFilePathField(filePathField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.NUMBER_FIELD:
      {
        NumberField numberField = (NumberField)theEObject;
        T result = caseNumberField(numberField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.MODIFIER_FIELD:
      {
        ModifierField modifierField = (ModifierField)theEObject;
        T result = caseModifierField(modifierField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.TIME_FIELD:
      {
        TimeField timeField = (TimeField)theEObject;
        T result = caseTimeField(timeField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.DOCUMENT_TYPE_FIELD:
      {
        DocumentTypeField documentTypeField = (DocumentTypeField)theEObject;
        T result = caseDocumentTypeField(documentTypeField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.PROJECT_NAME_FIELD:
      {
        ProjectNameField projectNameField = (ProjectNameField)theEObject;
        T result = caseProjectNameField(projectNameField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.ANNOTATION_FIELD:
      {
        AnnotationField annotationField = (AnnotationField)theEObject;
        T result = caseAnnotationField(annotationField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.DEFINITION_TYPE:
      {
        DefinitionType definitionType = (DefinitionType)theEObject;
        T result = caseDefinitionType(definitionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.OR_EXP:
      {
        OrExp orExp = (OrExp)theEObject;
        T result = caseOrExp(orExp);
        if (result == null) result = caseExpression(orExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LuceneQueryPackage.AND_EXP:
      {
        AndExp andExp = (AndExp)theEObject;
        T result = caseAndExp(andExp);
        if (result == null) result = caseExpression(andExp);
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
   * Returns the result of interpreting the object as an instance of '<em>Simple Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleField(SimpleField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeField(TypeField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodField(MethodField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Path Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Path Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilePathField(FilePathField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberField(NumberField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modifier Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modifier Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifierField(ModifierField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeField(TimeField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Type Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Type Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentTypeField(DocumentTypeField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project Name Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project Name Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectNameField(ProjectNameField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationField(AnnotationField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionType(DefinitionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExp(OrExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExp(AndExp object)
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
