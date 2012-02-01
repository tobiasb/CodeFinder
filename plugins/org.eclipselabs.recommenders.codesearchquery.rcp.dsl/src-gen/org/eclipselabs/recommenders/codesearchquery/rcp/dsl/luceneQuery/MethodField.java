/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethods <em>Used Methods</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethodsInTry <em>Used Methods In Try</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethodsInFinally <em>Used Methods In Finally</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getOverriddenMethods <em>Overridden Methods</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getDeclaredMethods <em>Declared Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getMethodField()
 * @model
 * @generated
 */
public interface MethodField extends EObject
{
  /**
   * Returns the value of the '<em><b>Used Methods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Used Methods</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Used Methods</em>' attribute.
   * @see #setUsedMethods(String)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getMethodField_UsedMethods()
   * @model
   * @generated
   */
  String getUsedMethods();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethods <em>Used Methods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Used Methods</em>' attribute.
   * @see #getUsedMethods()
   * @generated
   */
  void setUsedMethods(String value);

  /**
   * Returns the value of the '<em><b>Used Methods In Try</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Used Methods In Try</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Used Methods In Try</em>' attribute.
   * @see #setUsedMethodsInTry(String)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getMethodField_UsedMethodsInTry()
   * @model
   * @generated
   */
  String getUsedMethodsInTry();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethodsInTry <em>Used Methods In Try</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Used Methods In Try</em>' attribute.
   * @see #getUsedMethodsInTry()
   * @generated
   */
  void setUsedMethodsInTry(String value);

  /**
   * Returns the value of the '<em><b>Used Methods In Finally</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Used Methods In Finally</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Used Methods In Finally</em>' attribute.
   * @see #setUsedMethodsInFinally(String)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getMethodField_UsedMethodsInFinally()
   * @model
   * @generated
   */
  String getUsedMethodsInFinally();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethodsInFinally <em>Used Methods In Finally</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Used Methods In Finally</em>' attribute.
   * @see #getUsedMethodsInFinally()
   * @generated
   */
  void setUsedMethodsInFinally(String value);

  /**
   * Returns the value of the '<em><b>Overridden Methods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overridden Methods</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overridden Methods</em>' attribute.
   * @see #setOverriddenMethods(String)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getMethodField_OverriddenMethods()
   * @model
   * @generated
   */
  String getOverriddenMethods();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getOverriddenMethods <em>Overridden Methods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overridden Methods</em>' attribute.
   * @see #getOverriddenMethods()
   * @generated
   */
  void setOverriddenMethods(String value);

  /**
   * Returns the value of the '<em><b>Declared Methods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Methods</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Methods</em>' attribute.
   * @see #setDeclaredMethods(String)
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage#getMethodField_DeclaredMethods()
   * @model
   * @generated
   */
  String getDeclaredMethods();

  /**
   * Sets the value of the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getDeclaredMethods <em>Declared Methods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declared Methods</em>' attribute.
   * @see #getDeclaredMethods()
   * @generated
   */
  void setDeclaredMethods(String value);

} // MethodField
