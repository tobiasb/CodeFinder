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

import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getFriendlyName <em>Friendly Name</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getReturnVariableExpressions <em>Return Variable Expressions</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getAllDeclaredMethodNames <em>All Declared Method Names</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getDeclaredMethodNames <em>Declared Method Names</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getDeclaredFieldNames <em>Declared Field Names</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getAllDeclaredFieldNames <em>All Declared Field Names</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getFullText <em>Full Text</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getFieldsRead <em>Fields Read</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getFieldsWritten <em>Fields Written</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getUsedFieldsInFinally <em>Used Fields In Finally</em>}</li>
 *   <li>{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl#getUsedFieldsInTry <em>Used Fields In Try</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleFieldImpl extends MinimalEObjectImpl.Container implements SimpleField
{
  /**
   * The default value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullyQualifiedName()
   * @generated
   * @ordered
   */
  protected static final String FULLY_QUALIFIED_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullyQualifiedName()
   * @generated
   * @ordered
   */
  protected String fullyQualifiedName = FULLY_QUALIFIED_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFriendlyName() <em>Friendly Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFriendlyName()
   * @generated
   * @ordered
   */
  protected static final String FRIENDLY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFriendlyName() <em>Friendly Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFriendlyName()
   * @generated
   * @ordered
   */
  protected String friendlyName = FRIENDLY_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getReturnVariableExpressions() <em>Return Variable Expressions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnVariableExpressions()
   * @generated
   * @ordered
   */
  protected static final String RETURN_VARIABLE_EXPRESSIONS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnVariableExpressions() <em>Return Variable Expressions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnVariableExpressions()
   * @generated
   * @ordered
   */
  protected String returnVariableExpressions = RETURN_VARIABLE_EXPRESSIONS_EDEFAULT;

  /**
   * The default value of the '{@link #getAllDeclaredMethodNames() <em>All Declared Method Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllDeclaredMethodNames()
   * @generated
   * @ordered
   */
  protected static final String ALL_DECLARED_METHOD_NAMES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAllDeclaredMethodNames() <em>All Declared Method Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllDeclaredMethodNames()
   * @generated
   * @ordered
   */
  protected String allDeclaredMethodNames = ALL_DECLARED_METHOD_NAMES_EDEFAULT;

  /**
   * The default value of the '{@link #getDeclaredMethodNames() <em>Declared Method Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredMethodNames()
   * @generated
   * @ordered
   */
  protected static final String DECLARED_METHOD_NAMES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeclaredMethodNames() <em>Declared Method Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredMethodNames()
   * @generated
   * @ordered
   */
  protected String declaredMethodNames = DECLARED_METHOD_NAMES_EDEFAULT;

  /**
   * The default value of the '{@link #getDeclaredFieldNames() <em>Declared Field Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredFieldNames()
   * @generated
   * @ordered
   */
  protected static final String DECLARED_FIELD_NAMES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeclaredFieldNames() <em>Declared Field Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredFieldNames()
   * @generated
   * @ordered
   */
  protected String declaredFieldNames = DECLARED_FIELD_NAMES_EDEFAULT;

  /**
   * The default value of the '{@link #getAllDeclaredFieldNames() <em>All Declared Field Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllDeclaredFieldNames()
   * @generated
   * @ordered
   */
  protected static final String ALL_DECLARED_FIELD_NAMES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAllDeclaredFieldNames() <em>All Declared Field Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllDeclaredFieldNames()
   * @generated
   * @ordered
   */
  protected String allDeclaredFieldNames = ALL_DECLARED_FIELD_NAMES_EDEFAULT;

  /**
   * The default value of the '{@link #getFullText() <em>Full Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullText()
   * @generated
   * @ordered
   */
  protected static final String FULL_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFullText() <em>Full Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullText()
   * @generated
   * @ordered
   */
  protected String fullText = FULL_TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldsRead() <em>Fields Read</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldsRead()
   * @generated
   * @ordered
   */
  protected static final String FIELDS_READ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldsRead() <em>Fields Read</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldsRead()
   * @generated
   * @ordered
   */
  protected String fieldsRead = FIELDS_READ_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldsWritten() <em>Fields Written</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldsWritten()
   * @generated
   * @ordered
   */
  protected static final String FIELDS_WRITTEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldsWritten() <em>Fields Written</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldsWritten()
   * @generated
   * @ordered
   */
  protected String fieldsWritten = FIELDS_WRITTEN_EDEFAULT;

  /**
   * The default value of the '{@link #getUsedFieldsInFinally() <em>Used Fields In Finally</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedFieldsInFinally()
   * @generated
   * @ordered
   */
  protected static final String USED_FIELDS_IN_FINALLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsedFieldsInFinally() <em>Used Fields In Finally</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedFieldsInFinally()
   * @generated
   * @ordered
   */
  protected String usedFieldsInFinally = USED_FIELDS_IN_FINALLY_EDEFAULT;

  /**
   * The default value of the '{@link #getUsedFieldsInTry() <em>Used Fields In Try</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedFieldsInTry()
   * @generated
   * @ordered
   */
  protected static final String USED_FIELDS_IN_TRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsedFieldsInTry() <em>Used Fields In Try</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsedFieldsInTry()
   * @generated
   * @ordered
   */
  protected String usedFieldsInTry = USED_FIELDS_IN_TRY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleFieldImpl()
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
    return LuceneQueryPackage.Literals.SIMPLE_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFullyQualifiedName()
  {
    return fullyQualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFullyQualifiedName(String newFullyQualifiedName)
  {
    String oldFullyQualifiedName = fullyQualifiedName;
    fullyQualifiedName = newFullyQualifiedName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__FULLY_QUALIFIED_NAME, oldFullyQualifiedName, fullyQualifiedName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFriendlyName()
  {
    return friendlyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFriendlyName(String newFriendlyName)
  {
    String oldFriendlyName = friendlyName;
    friendlyName = newFriendlyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__FRIENDLY_NAME, oldFriendlyName, friendlyName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnVariableExpressions()
  {
    return returnVariableExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnVariableExpressions(String newReturnVariableExpressions)
  {
    String oldReturnVariableExpressions = returnVariableExpressions;
    returnVariableExpressions = newReturnVariableExpressions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__RETURN_VARIABLE_EXPRESSIONS, oldReturnVariableExpressions, returnVariableExpressions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAllDeclaredMethodNames()
  {
    return allDeclaredMethodNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllDeclaredMethodNames(String newAllDeclaredMethodNames)
  {
    String oldAllDeclaredMethodNames = allDeclaredMethodNames;
    allDeclaredMethodNames = newAllDeclaredMethodNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_METHOD_NAMES, oldAllDeclaredMethodNames, allDeclaredMethodNames));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeclaredMethodNames()
  {
    return declaredMethodNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredMethodNames(String newDeclaredMethodNames)
  {
    String oldDeclaredMethodNames = declaredMethodNames;
    declaredMethodNames = newDeclaredMethodNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__DECLARED_METHOD_NAMES, oldDeclaredMethodNames, declaredMethodNames));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeclaredFieldNames()
  {
    return declaredFieldNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredFieldNames(String newDeclaredFieldNames)
  {
    String oldDeclaredFieldNames = declaredFieldNames;
    declaredFieldNames = newDeclaredFieldNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__DECLARED_FIELD_NAMES, oldDeclaredFieldNames, declaredFieldNames));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAllDeclaredFieldNames()
  {
    return allDeclaredFieldNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllDeclaredFieldNames(String newAllDeclaredFieldNames)
  {
    String oldAllDeclaredFieldNames = allDeclaredFieldNames;
    allDeclaredFieldNames = newAllDeclaredFieldNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_FIELD_NAMES, oldAllDeclaredFieldNames, allDeclaredFieldNames));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFullText()
  {
    return fullText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFullText(String newFullText)
  {
    String oldFullText = fullText;
    fullText = newFullText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__FULL_TEXT, oldFullText, fullText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldsRead()
  {
    return fieldsRead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldsRead(String newFieldsRead)
  {
    String oldFieldsRead = fieldsRead;
    fieldsRead = newFieldsRead;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__FIELDS_READ, oldFieldsRead, fieldsRead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldsWritten()
  {
    return fieldsWritten;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldsWritten(String newFieldsWritten)
  {
    String oldFieldsWritten = fieldsWritten;
    fieldsWritten = newFieldsWritten;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__FIELDS_WRITTEN, oldFieldsWritten, fieldsWritten));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsedFieldsInFinally()
  {
    return usedFieldsInFinally;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsedFieldsInFinally(String newUsedFieldsInFinally)
  {
    String oldUsedFieldsInFinally = usedFieldsInFinally;
    usedFieldsInFinally = newUsedFieldsInFinally;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_FINALLY, oldUsedFieldsInFinally, usedFieldsInFinally));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsedFieldsInTry()
  {
    return usedFieldsInTry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsedFieldsInTry(String newUsedFieldsInTry)
  {
    String oldUsedFieldsInTry = usedFieldsInTry;
    usedFieldsInTry = newUsedFieldsInTry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_TRY, oldUsedFieldsInTry, usedFieldsInTry));
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
      case LuceneQueryPackage.SIMPLE_FIELD__FULLY_QUALIFIED_NAME:
        return getFullyQualifiedName();
      case LuceneQueryPackage.SIMPLE_FIELD__FRIENDLY_NAME:
        return getFriendlyName();
      case LuceneQueryPackage.SIMPLE_FIELD__RETURN_VARIABLE_EXPRESSIONS:
        return getReturnVariableExpressions();
      case LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_METHOD_NAMES:
        return getAllDeclaredMethodNames();
      case LuceneQueryPackage.SIMPLE_FIELD__DECLARED_METHOD_NAMES:
        return getDeclaredMethodNames();
      case LuceneQueryPackage.SIMPLE_FIELD__DECLARED_FIELD_NAMES:
        return getDeclaredFieldNames();
      case LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_FIELD_NAMES:
        return getAllDeclaredFieldNames();
      case LuceneQueryPackage.SIMPLE_FIELD__FULL_TEXT:
        return getFullText();
      case LuceneQueryPackage.SIMPLE_FIELD__FIELDS_READ:
        return getFieldsRead();
      case LuceneQueryPackage.SIMPLE_FIELD__FIELDS_WRITTEN:
        return getFieldsWritten();
      case LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_FINALLY:
        return getUsedFieldsInFinally();
      case LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_TRY:
        return getUsedFieldsInTry();
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
      case LuceneQueryPackage.SIMPLE_FIELD__FULLY_QUALIFIED_NAME:
        setFullyQualifiedName((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__FRIENDLY_NAME:
        setFriendlyName((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__RETURN_VARIABLE_EXPRESSIONS:
        setReturnVariableExpressions((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_METHOD_NAMES:
        setAllDeclaredMethodNames((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__DECLARED_METHOD_NAMES:
        setDeclaredMethodNames((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__DECLARED_FIELD_NAMES:
        setDeclaredFieldNames((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_FIELD_NAMES:
        setAllDeclaredFieldNames((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__FULL_TEXT:
        setFullText((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__FIELDS_READ:
        setFieldsRead((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__FIELDS_WRITTEN:
        setFieldsWritten((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_FINALLY:
        setUsedFieldsInFinally((String)newValue);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_TRY:
        setUsedFieldsInTry((String)newValue);
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
      case LuceneQueryPackage.SIMPLE_FIELD__FULLY_QUALIFIED_NAME:
        setFullyQualifiedName(FULLY_QUALIFIED_NAME_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__FRIENDLY_NAME:
        setFriendlyName(FRIENDLY_NAME_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__RETURN_VARIABLE_EXPRESSIONS:
        setReturnVariableExpressions(RETURN_VARIABLE_EXPRESSIONS_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_METHOD_NAMES:
        setAllDeclaredMethodNames(ALL_DECLARED_METHOD_NAMES_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__DECLARED_METHOD_NAMES:
        setDeclaredMethodNames(DECLARED_METHOD_NAMES_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__DECLARED_FIELD_NAMES:
        setDeclaredFieldNames(DECLARED_FIELD_NAMES_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_FIELD_NAMES:
        setAllDeclaredFieldNames(ALL_DECLARED_FIELD_NAMES_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__FULL_TEXT:
        setFullText(FULL_TEXT_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__FIELDS_READ:
        setFieldsRead(FIELDS_READ_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__FIELDS_WRITTEN:
        setFieldsWritten(FIELDS_WRITTEN_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_FINALLY:
        setUsedFieldsInFinally(USED_FIELDS_IN_FINALLY_EDEFAULT);
        return;
      case LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_TRY:
        setUsedFieldsInTry(USED_FIELDS_IN_TRY_EDEFAULT);
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
      case LuceneQueryPackage.SIMPLE_FIELD__FULLY_QUALIFIED_NAME:
        return FULLY_QUALIFIED_NAME_EDEFAULT == null ? fullyQualifiedName != null : !FULLY_QUALIFIED_NAME_EDEFAULT.equals(fullyQualifiedName);
      case LuceneQueryPackage.SIMPLE_FIELD__FRIENDLY_NAME:
        return FRIENDLY_NAME_EDEFAULT == null ? friendlyName != null : !FRIENDLY_NAME_EDEFAULT.equals(friendlyName);
      case LuceneQueryPackage.SIMPLE_FIELD__RETURN_VARIABLE_EXPRESSIONS:
        return RETURN_VARIABLE_EXPRESSIONS_EDEFAULT == null ? returnVariableExpressions != null : !RETURN_VARIABLE_EXPRESSIONS_EDEFAULT.equals(returnVariableExpressions);
      case LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_METHOD_NAMES:
        return ALL_DECLARED_METHOD_NAMES_EDEFAULT == null ? allDeclaredMethodNames != null : !ALL_DECLARED_METHOD_NAMES_EDEFAULT.equals(allDeclaredMethodNames);
      case LuceneQueryPackage.SIMPLE_FIELD__DECLARED_METHOD_NAMES:
        return DECLARED_METHOD_NAMES_EDEFAULT == null ? declaredMethodNames != null : !DECLARED_METHOD_NAMES_EDEFAULT.equals(declaredMethodNames);
      case LuceneQueryPackage.SIMPLE_FIELD__DECLARED_FIELD_NAMES:
        return DECLARED_FIELD_NAMES_EDEFAULT == null ? declaredFieldNames != null : !DECLARED_FIELD_NAMES_EDEFAULT.equals(declaredFieldNames);
      case LuceneQueryPackage.SIMPLE_FIELD__ALL_DECLARED_FIELD_NAMES:
        return ALL_DECLARED_FIELD_NAMES_EDEFAULT == null ? allDeclaredFieldNames != null : !ALL_DECLARED_FIELD_NAMES_EDEFAULT.equals(allDeclaredFieldNames);
      case LuceneQueryPackage.SIMPLE_FIELD__FULL_TEXT:
        return FULL_TEXT_EDEFAULT == null ? fullText != null : !FULL_TEXT_EDEFAULT.equals(fullText);
      case LuceneQueryPackage.SIMPLE_FIELD__FIELDS_READ:
        return FIELDS_READ_EDEFAULT == null ? fieldsRead != null : !FIELDS_READ_EDEFAULT.equals(fieldsRead);
      case LuceneQueryPackage.SIMPLE_FIELD__FIELDS_WRITTEN:
        return FIELDS_WRITTEN_EDEFAULT == null ? fieldsWritten != null : !FIELDS_WRITTEN_EDEFAULT.equals(fieldsWritten);
      case LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_FINALLY:
        return USED_FIELDS_IN_FINALLY_EDEFAULT == null ? usedFieldsInFinally != null : !USED_FIELDS_IN_FINALLY_EDEFAULT.equals(usedFieldsInFinally);
      case LuceneQueryPackage.SIMPLE_FIELD__USED_FIELDS_IN_TRY:
        return USED_FIELDS_IN_TRY_EDEFAULT == null ? usedFieldsInTry != null : !USED_FIELDS_IN_TRY_EDEFAULT.equals(usedFieldsInTry);
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
    result.append(" (FullyQualifiedName: ");
    result.append(fullyQualifiedName);
    result.append(", FriendlyName: ");
    result.append(friendlyName);
    result.append(", ReturnVariableExpressions: ");
    result.append(returnVariableExpressions);
    result.append(", AllDeclaredMethodNames: ");
    result.append(allDeclaredMethodNames);
    result.append(", DeclaredMethodNames: ");
    result.append(declaredMethodNames);
    result.append(", DeclaredFieldNames: ");
    result.append(declaredFieldNames);
    result.append(", AllDeclaredFieldNames: ");
    result.append(allDeclaredFieldNames);
    result.append(", FullText: ");
    result.append(fullText);
    result.append(", FieldsRead: ");
    result.append(fieldsRead);
    result.append(", FieldsWritten: ");
    result.append(fieldsWritten);
    result.append(", UsedFieldsInFinally: ");
    result.append(usedFieldsInFinally);
    result.append(", UsedFieldsInTry: ");
    result.append(usedFieldsInTry);
    result.append(')');
    return result.toString();
  }

} //SimpleFieldImpl
