/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryFactory
 * @model kind="package"
 * @generated
 */
public interface LuceneQueryPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "luceneQuery";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/recommenders/codesearchquery/rcp/dsl/LuceneQuery";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "luceneQuery";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LuceneQueryPackage eINSTANCE = org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ExpressionImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl <em>Clause Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getClauseExpression()
   * @generated
   */
  int CLAUSE_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__DEFAULT = 0;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__FIELD = 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION__VALUES = 2;

  /**
   * The number of structural features of the '<em>Clause Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAUSE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldImpl <em>Type Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTypeField()
   * @generated
   */
  int TYPE_FIELD = 2;

  /**
   * The feature id for the '<em><b>Implemented Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__IMPLEMENTED_TYPES = 0;

  /**
   * The feature id for the '<em><b>Extended Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__EXTENDED_TYPES = 1;

  /**
   * The feature id for the '<em><b>Used Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__USED_TYPES = 2;

  /**
   * The feature id for the '<em><b>Used Types In Try</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__USED_TYPES_IN_TRY = 3;

  /**
   * The feature id for the '<em><b>Used Types In Finally</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__USED_TYPES_IN_FINALLY = 4;

  /**
   * The feature id for the '<em><b>Parameter Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__PARAMETER_TYPES = 5;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__RETURN_TYPE = 6;

  /**
   * The feature id for the '<em><b>Instanceof Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__INSTANCEOF_TYPES = 7;

  /**
   * The feature id for the '<em><b>All Implemented Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__ALL_IMPLEMENTED_TYPES = 8;

  /**
   * The feature id for the '<em><b>All Extended Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__ALL_EXTENDED_TYPES = 9;

  /**
   * The feature id for the '<em><b>Field Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__FIELD_TYPE = 10;

  /**
   * The feature id for the '<em><b>Caught Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__CAUGHT_TYPE = 11;

  /**
   * The feature id for the '<em><b>Declared Field Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__DECLARED_FIELD_TYPES = 12;

  /**
   * The feature id for the '<em><b>Declaring Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD__DECLARING_TYPE = 13;

  /**
   * The number of structural features of the '<em>Type Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FIELD_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.MethodFieldImpl <em>Method Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.MethodFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getMethodField()
   * @generated
   */
  int METHOD_FIELD = 3;

  /**
   * The feature id for the '<em><b>Used Methods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FIELD__USED_METHODS = 0;

  /**
   * The feature id for the '<em><b>Used Methods In Try</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FIELD__USED_METHODS_IN_TRY = 1;

  /**
   * The feature id for the '<em><b>Used Methods In Finally</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FIELD__USED_METHODS_IN_FINALLY = 2;

  /**
   * The feature id for the '<em><b>Overridden Methods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FIELD__OVERRIDDEN_METHODS = 3;

  /**
   * The number of structural features of the '<em>Method Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FIELD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FilePathFieldImpl <em>File Path Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FilePathFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getFilePathField()
   * @generated
   */
  int FILE_PATH_FIELD = 4;

  /**
   * The feature id for the '<em><b>Resource Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PATH_FIELD__RESOURCE_PATH = 0;

  /**
   * The number of structural features of the '<em>File Path Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PATH_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.NumberFieldImpl <em>Number Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.NumberFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getNumberField()
   * @generated
   */
  int NUMBER_FIELD = 5;

  /**
   * The feature id for the '<em><b>Parameter Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FIELD__PARAMETER_COUNT = 0;

  /**
   * The number of structural features of the '<em>Number Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ModifierFieldImpl <em>Modifier Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ModifierFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getModifierField()
   * @generated
   */
  int MODIFIER_FIELD = 6;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FIELD__MODIFIERS = 0;

  /**
   * The number of structural features of the '<em>Modifier Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TimeFieldImpl <em>Time Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TimeFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTimeField()
   * @generated
   */
  int TIME_FIELD = 7;

  /**
   * The feature id for the '<em><b>Timestamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FIELD__TIMESTAMP = 0;

  /**
   * The number of structural features of the '<em>Time Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.DocumentTypeFieldImpl <em>Document Type Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.DocumentTypeFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getDocumentTypeField()
   * @generated
   */
  int DOCUMENT_TYPE_FIELD = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TYPE_FIELD__TYPE = 0;

  /**
   * The number of structural features of the '<em>Document Type Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TYPE_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ProjectNameFieldImpl <em>Project Name Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ProjectNameFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getProjectNameField()
   * @generated
   */
  int PROJECT_NAME_FIELD = 9;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_NAME_FIELD__PROJECT_NAME = 0;

  /**
   * The number of structural features of the '<em>Project Name Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_NAME_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.AnnotationFieldImpl <em>Annotation Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.AnnotationFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getAnnotationField()
   * @generated
   */
  int ANNOTATION_FIELD = 10;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Annotation Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getSimpleField()
   * @generated
   */
  int SIMPLE_FIELD = 11;

  /**
   * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__FULLY_QUALIFIED_NAME = 0;

  /**
   * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__FRIENDLY_NAME = 1;

  /**
   * The feature id for the '<em><b>Declared Methods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__DECLARED_METHODS = 2;

  /**
   * The feature id for the '<em><b>Return Variable Eexpressions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__RETURN_VARIABLE_EEXPRESSIONS = 3;

  /**
   * The feature id for the '<em><b>All Declared Method Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__ALL_DECLARED_METHOD_NAMES = 4;

  /**
   * The feature id for the '<em><b>Declared Method Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__DECLARED_METHOD_NAMES = 5;

  /**
   * The feature id for the '<em><b>Declared Field Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__DECLARED_FIELD_NAMES = 6;

  /**
   * The feature id for the '<em><b>All Declared Field Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__ALL_DECLARED_FIELD_NAMES = 7;

  /**
   * The feature id for the '<em><b>Full Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__FULL_TEXT = 8;

  /**
   * The feature id for the '<em><b>Fields Read</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__FIELDS_READ = 9;

  /**
   * The feature id for the '<em><b>Fields Written</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__FIELDS_WRITTEN = 10;

  /**
   * The feature id for the '<em><b>Used Fields In Finally</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__USED_FIELDS_IN_FINALLY = 11;

  /**
   * The feature id for the '<em><b>Used Fields In Try</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD__USED_FIELDS_IN_TRY = 12;

  /**
   * The number of structural features of the '<em>Simple Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FIELD_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl <em>Exp1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExp1()
   * @generated
   */
  int EXP1 = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__B = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Exp1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BinaryExp <em>Binary Exp</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BinaryExp
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getBinaryExp()
   * @generated
   */
  int BINARY_EXP = 13;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression#getValue()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression <em>Clause Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clause Expression</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression
   * @generated
   */
  EClass getClauseExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getDefault()
   * @see #getClauseExpression()
   * @generated
   */
  EAttribute getClauseExpression_Default();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getField()
   * @see #getClauseExpression()
   * @generated
   */
  EReference getClauseExpression_Field();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression#getValues()
   * @see #getClauseExpression()
   * @generated
   */
  EAttribute getClauseExpression_Values();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField <em>Type Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField
   * @generated
   */
  EClass getTypeField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getImplementedTypes <em>Implemented Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Implemented Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getImplementedTypes()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_ImplementedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getExtendedTypes <em>Extended Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extended Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getExtendedTypes()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_ExtendedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getUsedTypes <em>Used Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getUsedTypes()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_UsedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getUsedTypesInTry <em>Used Types In Try</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Types In Try</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getUsedTypesInTry()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_UsedTypesInTry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getUsedTypesInFinally <em>Used Types In Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Types In Finally</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getUsedTypesInFinally()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_UsedTypesInFinally();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getParameterTypes <em>Parameter Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getParameterTypes()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_ParameterTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getReturnType()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_ReturnType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getInstanceofTypes <em>Instanceof Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instanceof Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getInstanceofTypes()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_InstanceofTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getAllImplementedTypes <em>All Implemented Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Implemented Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getAllImplementedTypes()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_AllImplementedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getAllExtendedTypes <em>All Extended Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Extended Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getAllExtendedTypes()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_AllExtendedTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getFieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getFieldType()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_FieldType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getCaughtType <em>Caught Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caught Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getCaughtType()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_CaughtType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getDeclaredFieldTypes <em>Declared Field Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Field Types</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getDeclaredFieldTypes()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_DeclaredFieldTypes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getDeclaringType <em>Declaring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declaring Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeField#getDeclaringType()
   * @see #getTypeField()
   * @generated
   */
  EAttribute getTypeField_DeclaringType();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField <em>Method Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField
   * @generated
   */
  EClass getMethodField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethods <em>Used Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Methods</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethods()
   * @see #getMethodField()
   * @generated
   */
  EAttribute getMethodField_UsedMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethodsInTry <em>Used Methods In Try</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Methods In Try</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethodsInTry()
   * @see #getMethodField()
   * @generated
   */
  EAttribute getMethodField_UsedMethodsInTry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethodsInFinally <em>Used Methods In Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Methods In Finally</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getUsedMethodsInFinally()
   * @see #getMethodField()
   * @generated
   */
  EAttribute getMethodField_UsedMethodsInFinally();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getOverriddenMethods <em>Overridden Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overridden Methods</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.MethodField#getOverriddenMethods()
   * @see #getMethodField()
   * @generated
   */
  EAttribute getMethodField_OverriddenMethods();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FilePathField <em>File Path Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Path Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FilePathField
   * @generated
   */
  EClass getFilePathField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FilePathField#getResourcePath <em>Resource Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resource Path</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FilePathField#getResourcePath()
   * @see #getFilePathField()
   * @generated
   */
  EAttribute getFilePathField_ResourcePath();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NumberField <em>Number Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NumberField
   * @generated
   */
  EClass getNumberField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NumberField#getParameterCount <em>Parameter Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Count</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.NumberField#getParameterCount()
   * @see #getNumberField()
   * @generated
   */
  EAttribute getNumberField_ParameterCount();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ModifierField <em>Modifier Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ModifierField
   * @generated
   */
  EClass getModifierField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ModifierField#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifiers</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ModifierField#getModifiers()
   * @see #getModifierField()
   * @generated
   */
  EAttribute getModifierField_Modifiers();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TimeField <em>Time Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TimeField
   * @generated
   */
  EClass getTimeField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TimeField#getTimestamp <em>Timestamp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timestamp</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TimeField#getTimestamp()
   * @see #getTimeField()
   * @generated
   */
  EAttribute getTimeField_Timestamp();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.DocumentTypeField <em>Document Type Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Type Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.DocumentTypeField
   * @generated
   */
  EClass getDocumentTypeField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.DocumentTypeField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.DocumentTypeField#getType()
   * @see #getDocumentTypeField()
   * @generated
   */
  EAttribute getDocumentTypeField_Type();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ProjectNameField <em>Project Name Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Name Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ProjectNameField
   * @generated
   */
  EClass getProjectNameField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ProjectNameField#getProjectName <em>Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ProjectNameField#getProjectName()
   * @see #getProjectNameField()
   * @generated
   */
  EAttribute getProjectNameField_ProjectName();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.AnnotationField <em>Annotation Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.AnnotationField
   * @generated
   */
  EClass getAnnotationField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.AnnotationField#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Annotations</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.AnnotationField#getAnnotations()
   * @see #getAnnotationField()
   * @generated
   */
  EAttribute getAnnotationField_Annotations();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField <em>Simple Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Field</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField
   * @generated
   */
  EClass getSimpleField();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFullyQualifiedName <em>Fully Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fully Qualified Name</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFullyQualifiedName()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_FullyQualifiedName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFriendlyName <em>Friendly Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Friendly Name</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFriendlyName()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_FriendlyName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getDeclaredMethods <em>Declared Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Methods</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getDeclaredMethods()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_DeclaredMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getReturnVariableEexpressions <em>Return Variable Eexpressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Variable Eexpressions</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getReturnVariableEexpressions()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_ReturnVariableEexpressions();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getAllDeclaredMethodNames <em>All Declared Method Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Declared Method Names</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getAllDeclaredMethodNames()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_AllDeclaredMethodNames();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getDeclaredMethodNames <em>Declared Method Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Method Names</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getDeclaredMethodNames()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_DeclaredMethodNames();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getDeclaredFieldNames <em>Declared Field Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Field Names</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getDeclaredFieldNames()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_DeclaredFieldNames();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getAllDeclaredFieldNames <em>All Declared Field Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Declared Field Names</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getAllDeclaredFieldNames()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_AllDeclaredFieldNames();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFullText <em>Full Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Full Text</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFullText()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_FullText();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFieldsRead <em>Fields Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fields Read</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFieldsRead()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_FieldsRead();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFieldsWritten <em>Fields Written</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fields Written</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getFieldsWritten()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_FieldsWritten();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getUsedFieldsInFinally <em>Used Fields In Finally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Fields In Finally</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getUsedFieldsInFinally()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_UsedFieldsInFinally();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getUsedFieldsInTry <em>Used Fields In Try</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Used Fields In Try</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleField#getUsedFieldsInTry()
   * @see #getSimpleField()
   * @generated
   */
  EAttribute getSimpleField_UsedFieldsInTry();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1 <em>Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp1</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1
   * @generated
   */
  EClass getExp1();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getLeft()
   * @see #getExp1()
   * @generated
   */
  EReference getExp1_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getB()
   * @see #getExp1()
   * @generated
   */
  EAttribute getExp1_B();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1#getRight()
   * @see #getExp1()
   * @generated
   */
  EReference getExp1_Right();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Exp</em>'.
   * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BinaryExp
   * @generated
   */
  EEnum getBinaryExp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LuceneQueryFactory getLuceneQueryFactory();

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
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ExpressionImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl <em>Clause Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ClauseExpressionImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getClauseExpression()
     * @generated
     */
    EClass CLAUSE_EXPRESSION = eINSTANCE.getClauseExpression();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAUSE_EXPRESSION__DEFAULT = eINSTANCE.getClauseExpression_Default();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLAUSE_EXPRESSION__FIELD = eINSTANCE.getClauseExpression_Field();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAUSE_EXPRESSION__VALUES = eINSTANCE.getClauseExpression_Values();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldImpl <em>Type Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TypeFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTypeField()
     * @generated
     */
    EClass TYPE_FIELD = eINSTANCE.getTypeField();

    /**
     * The meta object literal for the '<em><b>Implemented Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__IMPLEMENTED_TYPES = eINSTANCE.getTypeField_ImplementedTypes();

    /**
     * The meta object literal for the '<em><b>Extended Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__EXTENDED_TYPES = eINSTANCE.getTypeField_ExtendedTypes();

    /**
     * The meta object literal for the '<em><b>Used Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__USED_TYPES = eINSTANCE.getTypeField_UsedTypes();

    /**
     * The meta object literal for the '<em><b>Used Types In Try</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__USED_TYPES_IN_TRY = eINSTANCE.getTypeField_UsedTypesInTry();

    /**
     * The meta object literal for the '<em><b>Used Types In Finally</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__USED_TYPES_IN_FINALLY = eINSTANCE.getTypeField_UsedTypesInFinally();

    /**
     * The meta object literal for the '<em><b>Parameter Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__PARAMETER_TYPES = eINSTANCE.getTypeField_ParameterTypes();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__RETURN_TYPE = eINSTANCE.getTypeField_ReturnType();

    /**
     * The meta object literal for the '<em><b>Instanceof Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__INSTANCEOF_TYPES = eINSTANCE.getTypeField_InstanceofTypes();

    /**
     * The meta object literal for the '<em><b>All Implemented Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__ALL_IMPLEMENTED_TYPES = eINSTANCE.getTypeField_AllImplementedTypes();

    /**
     * The meta object literal for the '<em><b>All Extended Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__ALL_EXTENDED_TYPES = eINSTANCE.getTypeField_AllExtendedTypes();

    /**
     * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__FIELD_TYPE = eINSTANCE.getTypeField_FieldType();

    /**
     * The meta object literal for the '<em><b>Caught Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__CAUGHT_TYPE = eINSTANCE.getTypeField_CaughtType();

    /**
     * The meta object literal for the '<em><b>Declared Field Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__DECLARED_FIELD_TYPES = eINSTANCE.getTypeField_DeclaredFieldTypes();

    /**
     * The meta object literal for the '<em><b>Declaring Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FIELD__DECLARING_TYPE = eINSTANCE.getTypeField_DeclaringType();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.MethodFieldImpl <em>Method Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.MethodFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getMethodField()
     * @generated
     */
    EClass METHOD_FIELD = eINSTANCE.getMethodField();

    /**
     * The meta object literal for the '<em><b>Used Methods</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_FIELD__USED_METHODS = eINSTANCE.getMethodField_UsedMethods();

    /**
     * The meta object literal for the '<em><b>Used Methods In Try</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_FIELD__USED_METHODS_IN_TRY = eINSTANCE.getMethodField_UsedMethodsInTry();

    /**
     * The meta object literal for the '<em><b>Used Methods In Finally</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_FIELD__USED_METHODS_IN_FINALLY = eINSTANCE.getMethodField_UsedMethodsInFinally();

    /**
     * The meta object literal for the '<em><b>Overridden Methods</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_FIELD__OVERRIDDEN_METHODS = eINSTANCE.getMethodField_OverriddenMethods();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FilePathFieldImpl <em>File Path Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.FilePathFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getFilePathField()
     * @generated
     */
    EClass FILE_PATH_FIELD = eINSTANCE.getFilePathField();

    /**
     * The meta object literal for the '<em><b>Resource Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_PATH_FIELD__RESOURCE_PATH = eINSTANCE.getFilePathField_ResourcePath();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.NumberFieldImpl <em>Number Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.NumberFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getNumberField()
     * @generated
     */
    EClass NUMBER_FIELD = eINSTANCE.getNumberField();

    /**
     * The meta object literal for the '<em><b>Parameter Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_FIELD__PARAMETER_COUNT = eINSTANCE.getNumberField_ParameterCount();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ModifierFieldImpl <em>Modifier Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ModifierFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getModifierField()
     * @generated
     */
    EClass MODIFIER_FIELD = eINSTANCE.getModifierField();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER_FIELD__MODIFIERS = eINSTANCE.getModifierField_Modifiers();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TimeFieldImpl <em>Time Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.TimeFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getTimeField()
     * @generated
     */
    EClass TIME_FIELD = eINSTANCE.getTimeField();

    /**
     * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_FIELD__TIMESTAMP = eINSTANCE.getTimeField_Timestamp();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.DocumentTypeFieldImpl <em>Document Type Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.DocumentTypeFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getDocumentTypeField()
     * @generated
     */
    EClass DOCUMENT_TYPE_FIELD = eINSTANCE.getDocumentTypeField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_TYPE_FIELD__TYPE = eINSTANCE.getDocumentTypeField_Type();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ProjectNameFieldImpl <em>Project Name Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.ProjectNameFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getProjectNameField()
     * @generated
     */
    EClass PROJECT_NAME_FIELD = eINSTANCE.getProjectNameField();

    /**
     * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT_NAME_FIELD__PROJECT_NAME = eINSTANCE.getProjectNameField_ProjectName();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.AnnotationFieldImpl <em>Annotation Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.AnnotationFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getAnnotationField()
     * @generated
     */
    EClass ANNOTATION_FIELD = eINSTANCE.getAnnotationField();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_FIELD__ANNOTATIONS = eINSTANCE.getAnnotationField_Annotations();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.SimpleFieldImpl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getSimpleField()
     * @generated
     */
    EClass SIMPLE_FIELD = eINSTANCE.getSimpleField();

    /**
     * The meta object literal for the '<em><b>Fully Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__FULLY_QUALIFIED_NAME = eINSTANCE.getSimpleField_FullyQualifiedName();

    /**
     * The meta object literal for the '<em><b>Friendly Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__FRIENDLY_NAME = eINSTANCE.getSimpleField_FriendlyName();

    /**
     * The meta object literal for the '<em><b>Declared Methods</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__DECLARED_METHODS = eINSTANCE.getSimpleField_DeclaredMethods();

    /**
     * The meta object literal for the '<em><b>Return Variable Eexpressions</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__RETURN_VARIABLE_EEXPRESSIONS = eINSTANCE.getSimpleField_ReturnVariableEexpressions();

    /**
     * The meta object literal for the '<em><b>All Declared Method Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__ALL_DECLARED_METHOD_NAMES = eINSTANCE.getSimpleField_AllDeclaredMethodNames();

    /**
     * The meta object literal for the '<em><b>Declared Method Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__DECLARED_METHOD_NAMES = eINSTANCE.getSimpleField_DeclaredMethodNames();

    /**
     * The meta object literal for the '<em><b>Declared Field Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__DECLARED_FIELD_NAMES = eINSTANCE.getSimpleField_DeclaredFieldNames();

    /**
     * The meta object literal for the '<em><b>All Declared Field Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__ALL_DECLARED_FIELD_NAMES = eINSTANCE.getSimpleField_AllDeclaredFieldNames();

    /**
     * The meta object literal for the '<em><b>Full Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__FULL_TEXT = eINSTANCE.getSimpleField_FullText();

    /**
     * The meta object literal for the '<em><b>Fields Read</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__FIELDS_READ = eINSTANCE.getSimpleField_FieldsRead();

    /**
     * The meta object literal for the '<em><b>Fields Written</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__FIELDS_WRITTEN = eINSTANCE.getSimpleField_FieldsWritten();

    /**
     * The meta object literal for the '<em><b>Used Fields In Finally</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__USED_FIELDS_IN_FINALLY = eINSTANCE.getSimpleField_UsedFieldsInFinally();

    /**
     * The meta object literal for the '<em><b>Used Fields In Try</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FIELD__USED_FIELDS_IN_TRY = eINSTANCE.getSimpleField_UsedFieldsInTry();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl <em>Exp1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.Exp1Impl
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getExp1()
     * @generated
     */
    EClass EXP1 = eINSTANCE.getExp1();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP1__LEFT = eINSTANCE.getExp1_Left();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP1__B = eINSTANCE.getExp1_B();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP1__RIGHT = eINSTANCE.getExp1_Right();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BinaryExp <em>Binary Exp</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.BinaryExp
     * @see org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.impl.LuceneQueryPackageImpl#getBinaryExp()
     * @generated
     */
    EEnum BINARY_EXP = eINSTANCE.getBinaryExp();

  }

} //LuceneQueryPackage
