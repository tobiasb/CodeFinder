/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1;

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
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Factory
 * @model kind="package"
 * @generated
 */
public interface QL1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "qL1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/recommenders/codesearch/rcp/dslQL1/QL1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "qL1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QL1Package eINSTANCE = org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.FirstImpl <em>First</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.FirstImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getFirst()
   * @generated
   */
  int FIRST = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST__TYPE = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST__E = 1;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST__C = 2;

  /**
   * The number of structural features of the '<em>First</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ContainsImpl <em>Contains</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ContainsImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getContains()
   * @generated
   */
  int CONTAINS = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS__TYPE = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS__E = 1;

  /**
   * The number of structural features of the '<em>Contains</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ExpressionImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.FieldExprImpl <em>Field Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.FieldExprImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getFieldExpr()
   * @generated
   */
  int FIELD_EXPR = 3;

  /**
   * The number of structural features of the '<em>Field Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.TypeImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__METHOD = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleValueFieldImpl <em>Single Value Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleValueFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getSingleValueField()
   * @generated
   */
  int SINGLE_VALUE_FIELD = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_VALUE_FIELD__NAME = FIELD_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_VALUE_FIELD__N = FIELD_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_VALUE_FIELD__VALUE = FIELD_EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Single Value Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_VALUE_FIELD_FEATURE_COUNT = FIELD_EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiValueFieldImpl <em>Multi Value Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiValueFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMultiValueField()
   * @generated
   */
  int MULTI_VALUE_FIELD = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_FIELD__NAME = FIELD_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_FIELD__VALUES = FIELD_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi Value Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_FIELD_FEATURE_COUNT = FIELD_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.BooleanFieldImpl <em>Boolean Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.BooleanFieldImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getBooleanField()
   * @generated
   */
  int BOOLEAN_FIELD = 7;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FIELD__N = FIELD_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FIELD__VALUE = FIELD_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Boolean Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FIELD_FEATURE_COUNT = FIELD_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleValueFieldNameImpl <em>Single Value Field Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleValueFieldNameImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getSingleValueFieldName()
   * @generated
   */
  int SINGLE_VALUE_FIELD_NAME = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_VALUE_FIELD_NAME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Single Value Field Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_VALUE_FIELD_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiValueFieldNameImpl <em>Multi Value Field Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiValueFieldNameImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMultiValueFieldName()
   * @generated
   */
  int MULTI_VALUE_FIELD_NAME = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_FIELD_NAME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Multi Value Field Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_FIELD_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.NegationImpl <em>Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.NegationImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getNegation()
   * @generated
   */
  int NEGATION = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.OrExprImpl <em>Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.OrExprImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getOrExpr()
   * @generated
   */
  int OR_EXPR = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiplicationImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BinaryExp <em>Binary Exp</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BinaryExp
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getBinaryExp()
   * @generated
   */
  int BINARY_EXP = 13;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.First <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>First</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.First
   * @generated
   */
  EClass getFirst();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.First#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.First#getType()
   * @see #getFirst()
   * @generated
   */
  EReference getFirst_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.First#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.First#getE()
   * @see #getFirst()
   * @generated
   */
  EReference getFirst_E();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.First#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>C</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.First#getC()
   * @see #getFirst()
   * @generated
   */
  EReference getFirst_C();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Contains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contains</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Contains
   * @generated
   */
  EClass getContains();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Contains#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Contains#getType()
   * @see #getContains()
   * @generated
   */
  EReference getContains_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Contains#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Contains#getE()
   * @see #getContains()
   * @generated
   */
  EReference getContains_E();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.FieldExpr <em>Field Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Expr</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.FieldExpr
   * @generated
   */
  EClass getFieldExpr();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Type#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Type#getValue()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Value();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Type#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Type#getMethod()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Method();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueField <em>Single Value Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Value Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueField
   * @generated
   */
  EClass getSingleValueField();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueField#getName()
   * @see #getSingleValueField()
   * @generated
   */
  EReference getSingleValueField_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueField#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueField#getN()
   * @see #getSingleValueField()
   * @generated
   */
  EReference getSingleValueField_N();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueField#getValue()
   * @see #getSingleValueField()
   * @generated
   */
  EAttribute getSingleValueField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueField <em>Multi Value Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Value Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueField
   * @generated
   */
  EClass getMultiValueField();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueField#getName()
   * @see #getMultiValueField()
   * @generated
   */
  EReference getMultiValueField_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueField#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueField#getValues()
   * @see #getMultiValueField()
   * @generated
   */
  EAttribute getMultiValueField_Values();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BooleanField <em>Boolean Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Field</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BooleanField
   * @generated
   */
  EClass getBooleanField();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BooleanField#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BooleanField#getN()
   * @see #getBooleanField()
   * @generated
   */
  EReference getBooleanField_N();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BooleanField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BooleanField#getValue()
   * @see #getBooleanField()
   * @generated
   */
  EAttribute getBooleanField_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueFieldName <em>Single Value Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Value Field Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueFieldName
   * @generated
   */
  EClass getSingleValueFieldName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueFieldName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueFieldName#getValue()
   * @see #getSingleValueFieldName()
   * @generated
   */
  EAttribute getSingleValueFieldName_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueFieldName <em>Multi Value Field Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Value Field Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueFieldName
   * @generated
   */
  EClass getMultiValueFieldName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueFieldName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueFieldName#getValue()
   * @see #getMultiValueFieldName()
   * @generated
   */
  EAttribute getMultiValueFieldName_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Negation <em>Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negation</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Negation
   * @generated
   */
  EClass getNegation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Negation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Negation#getValue()
   * @see #getNegation()
   * @generated
   */
  EAttribute getNegation_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expr</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.OrExpr
   * @generated
   */
  EClass getOrExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.OrExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.OrExpr#getLeft()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.OrExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.OrExpr#getRight()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Right();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Multiplication#getLeft()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Multiplication#getRight()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Right();

  /**
   * Returns the meta object for enum '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BinaryExp <em>Binary Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Exp</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BinaryExp
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
  QL1Factory getQL1Factory();

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
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.FirstImpl <em>First</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.FirstImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getFirst()
     * @generated
     */
    EClass FIRST = eINSTANCE.getFirst();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRST__TYPE = eINSTANCE.getFirst_Type();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRST__E = eINSTANCE.getFirst_E();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIRST__C = eINSTANCE.getFirst_C();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ContainsImpl <em>Contains</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ContainsImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getContains()
     * @generated
     */
    EClass CONTAINS = eINSTANCE.getContains();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINS__TYPE = eINSTANCE.getContains_Type();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINS__E = eINSTANCE.getContains_E();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.ExpressionImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.FieldExprImpl <em>Field Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.FieldExprImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getFieldExpr()
     * @generated
     */
    EClass FIELD_EXPR = eINSTANCE.getFieldExpr();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.TypeImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__VALUE = eINSTANCE.getType_Value();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__METHOD = eINSTANCE.getType_Method();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleValueFieldImpl <em>Single Value Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleValueFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getSingleValueField()
     * @generated
     */
    EClass SINGLE_VALUE_FIELD = eINSTANCE.getSingleValueField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_VALUE_FIELD__NAME = eINSTANCE.getSingleValueField_Name();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_VALUE_FIELD__N = eINSTANCE.getSingleValueField_N();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_VALUE_FIELD__VALUE = eINSTANCE.getSingleValueField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiValueFieldImpl <em>Multi Value Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiValueFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMultiValueField()
     * @generated
     */
    EClass MULTI_VALUE_FIELD = eINSTANCE.getMultiValueField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_VALUE_FIELD__NAME = eINSTANCE.getMultiValueField_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_VALUE_FIELD__VALUES = eINSTANCE.getMultiValueField_Values();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.BooleanFieldImpl <em>Boolean Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.BooleanFieldImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getBooleanField()
     * @generated
     */
    EClass BOOLEAN_FIELD = eINSTANCE.getBooleanField();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_FIELD__N = eINSTANCE.getBooleanField_N();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_FIELD__VALUE = eINSTANCE.getBooleanField_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleValueFieldNameImpl <em>Single Value Field Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.SingleValueFieldNameImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getSingleValueFieldName()
     * @generated
     */
    EClass SINGLE_VALUE_FIELD_NAME = eINSTANCE.getSingleValueFieldName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_VALUE_FIELD_NAME__VALUE = eINSTANCE.getSingleValueFieldName_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiValueFieldNameImpl <em>Multi Value Field Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiValueFieldNameImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMultiValueFieldName()
     * @generated
     */
    EClass MULTI_VALUE_FIELD_NAME = eINSTANCE.getMultiValueFieldName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_VALUE_FIELD_NAME__VALUE = eINSTANCE.getMultiValueFieldName_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.NegationImpl <em>Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.NegationImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getNegation()
     * @generated
     */
    EClass NEGATION = eINSTANCE.getNegation();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEGATION__VALUE = eINSTANCE.getNegation_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.OrExprImpl <em>Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.OrExprImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getOrExpr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOrExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__LEFT = eINSTANCE.getOrExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__RIGHT = eINSTANCE.getOrExpr_Right();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.MultiplicationImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT = eINSTANCE.getMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT = eINSTANCE.getMultiplication_Right();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BinaryExp <em>Binary Exp</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BinaryExp
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.impl.QL1PackageImpl#getBinaryExp()
     * @generated
     */
    EEnum BINARY_EXP = eINSTANCE.getBinaryExp();

  }

} //QL1Package
