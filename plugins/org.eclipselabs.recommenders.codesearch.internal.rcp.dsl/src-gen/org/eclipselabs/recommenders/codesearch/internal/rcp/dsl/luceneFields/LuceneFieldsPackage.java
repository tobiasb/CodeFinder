/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.LuceneFieldsFactory
 * @model kind="package"
 * @generated
 */
public interface LuceneFieldsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "luceneFields";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/recommenders/codesearch/internal/rcp/dsl/LuceneFields";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "luceneFields";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LuceneFieldsPackage eINSTANCE = org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.LuceneFieldsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.ModelImpl
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.LuceneFieldsPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE_NAMES = 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CLASS_NAME = 1;

  /**
   * The feature id for the '<em><b>Field Categories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FIELD_CATEGORIES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldCategoryImpl <em>Field Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldCategoryImpl
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.LuceneFieldsPackageImpl#getFieldCategory()
   * @generated
   */
  int FIELD_CATEGORY = 1;

  /**
   * The feature id for the '<em><b>Category Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_CATEGORY__CATEGORY_NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_CATEGORY__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Field Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_CATEGORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldImpl
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.LuceneFieldsPackageImpl#getField()
   * @generated
   */
  int FIELD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VALUE = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPES = 2;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl <em>Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.LuceneFieldsPackageImpl#getFieldType()
   * @generated
   */
  int FIELD_TYPE = 3;

  /**
   * The feature id for the '<em><b>Class Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__CLASS_TYPE = 0;

  /**
   * The feature id for the '<em><b>Method Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__METHOD_TYPE = 1;

  /**
   * The feature id for the '<em><b>Field Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__FIELD_TYPE = 2;

  /**
   * The feature id for the '<em><b>Trycatch Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__TRYCATCH_TYPE = 3;

  /**
   * The number of structural features of the '<em>Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model#getPackageNames <em>Package Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Package Names</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model#getPackageNames()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_PackageNames();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model#getClassName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_ClassName();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model#getFieldCategories <em>Field Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field Categories</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model#getFieldCategories()
   * @see #getModel()
   * @generated
   */
  EReference getModel_FieldCategories();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory <em>Field Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Category</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory
   * @generated
   */
  EClass getFieldCategory();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory#getCategoryName <em>Category Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory#getCategoryName()
   * @see #getFieldCategory()
   * @generated
   */
  EAttribute getFieldCategory_CategoryName();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory#getFields()
   * @see #getFieldCategory()
   * @generated
   */
  EReference getFieldCategory_Fields();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field#getValue()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Value();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field#getTypes()
   * @see #getField()
   * @generated
   */
  EReference getField_Types();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType
   * @generated
   */
  EClass getFieldType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType#isClassType <em>Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType#isClassType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_ClassType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType#isMethodType <em>Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType#isMethodType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_MethodType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType#isFieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType#isFieldType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_FieldType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType#isTrycatchType <em>Trycatch Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trycatch Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType#isTrycatchType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_TrycatchType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LuceneFieldsFactory getLuceneFieldsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.ModelImpl
     * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.LuceneFieldsPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__PACKAGE_NAMES = eINSTANCE.getModel_PackageNames();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__CLASS_NAME = eINSTANCE.getModel_ClassName();

    /**
     * The meta object literal for the '<em><b>Field Categories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FIELD_CATEGORIES = eINSTANCE.getModel_FieldCategories();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldCategoryImpl <em>Field Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldCategoryImpl
     * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.LuceneFieldsPackageImpl#getFieldCategory()
     * @generated
     */
    EClass FIELD_CATEGORY = eINSTANCE.getFieldCategory();

    /**
     * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_CATEGORY__CATEGORY_NAME = eINSTANCE.getFieldCategory_CategoryName();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_CATEGORY__FIELDS = eINSTANCE.getFieldCategory_Fields();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldImpl
     * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.LuceneFieldsPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__VALUE = eINSTANCE.getField_Value();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPES = eINSTANCE.getField_Types();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl <em>Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.FieldTypeImpl
     * @see org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.impl.LuceneFieldsPackageImpl#getFieldType()
     * @generated
     */
    EClass FIELD_TYPE = eINSTANCE.getFieldType();

    /**
     * The meta object literal for the '<em><b>Class Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_TYPE__CLASS_TYPE = eINSTANCE.getFieldType_ClassType();

    /**
     * The meta object literal for the '<em><b>Method Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_TYPE__METHOD_TYPE = eINSTANCE.getFieldType_MethodType();

    /**
     * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_TYPE__FIELD_TYPE = eINSTANCE.getFieldType_FieldType();

    /**
     * The meta object literal for the '<em><b>Trycatch Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_TYPE__TRYCATCH_TYPE = eINSTANCE.getFieldType_TrycatchType();

  }

} //LuceneFieldsPackage
