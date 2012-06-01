/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2;

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
 * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Factory
 * @model kind="package"
 * @generated
 */
public interface QL2Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "qL2";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipselabs.org/recommenders/codesearch/rcp/dslQL2/QL2";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "qL2";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QL2Package eINSTANCE = org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ModelImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VARS = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STATEMENTS = 1;

  /**
   * The feature id for the '<em><b>Return Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RETURN_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.StatementImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VAR = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarDeclarationParamImpl <em>Var Declaration Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarDeclarationParamImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarDeclarationParam()
   * @generated
   */
  int VAR_DECLARATION_PARAM = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION_PARAM__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION_PARAM__NAME = 1;

  /**
   * The number of structural features of the '<em>Var Declaration Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarNullLiteralImpl <em>Var Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarNullLiteralImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarNullLiteral()
   * @generated
   */
  int VAR_NULL_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_NULL_LITERAL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_NULL_LITERAL__NAME = 1;

  /**
   * The number of structural features of the '<em>Var Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_NULL_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarAssignmentImpl <em>Var Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarAssignmentImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarAssignment()
   * @generated
   */
  int VAR_ASSIGNMENT = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ASSIGNMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ASSIGNMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Var Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarInstanceCreationImpl <em>Var Instance Creation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarInstanceCreationImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarInstanceCreation()
   * @generated
   */
  int VAR_INSTANCE_CREATION = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INSTANCE_CREATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INSTANCE_CREATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Var Instance Creation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INSTANCE_CREATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarDeclarationImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarDeclaration()
   * @generated
   */
  int VAR_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Var Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ReturnStatementImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.MethodCallImpl <em>Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.MethodCallImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getMethodCall()
   * @generated
   */
  int METHOD_CALL = 8;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__VAR = STATEMENT__VAR;

  /**
   * The feature id for the '<em><b>Name Callee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__NAME_CALLEE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__METHOD = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name Caller</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__NAME_CALLER = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.StaticMethodCallImpl <em>Static Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.StaticMethodCallImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getStaticMethodCall()
   * @generated
   */
  int STATIC_METHOD_CALL = 9;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_METHOD_CALL__VAR = STATEMENT__VAR;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_METHOD_CALL__METHOD = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_METHOD_CALL__NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Static Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_METHOD_CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.CalledMethodNameImpl <em>Called Method Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.CalledMethodNameImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getCalledMethodName()
   * @generated
   */
  int CALLED_METHOD_NAME = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLED_METHOD_NAME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Called Method Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLED_METHOD_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.TypeImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getType()
   * @generated
   */
  int TYPE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.NameImpl
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getName_()
   * @generated
   */
  int NAME = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model#getVars()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model#getStatements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statements();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model#getReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Statement</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model#getReturnStatement()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ReturnStatement();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Statement#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Statement#getVar()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Var();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclarationParam <em>Var Declaration Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Declaration Param</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclarationParam
   * @generated
   */
  EClass getVarDeclarationParam();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclarationParam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclarationParam#getType()
   * @see #getVarDeclarationParam()
   * @generated
   */
  EReference getVarDeclarationParam_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclarationParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclarationParam#getName()
   * @see #getVarDeclarationParam()
   * @generated
   */
  EAttribute getVarDeclarationParam_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarNullLiteral <em>Var Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Null Literal</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarNullLiteral
   * @generated
   */
  EClass getVarNullLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarNullLiteral#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarNullLiteral#getType()
   * @see #getVarNullLiteral()
   * @generated
   */
  EReference getVarNullLiteral_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarNullLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarNullLiteral#getName()
   * @see #getVarNullLiteral()
   * @generated
   */
  EAttribute getVarNullLiteral_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarAssignment <em>Var Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Assignment</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarAssignment
   * @generated
   */
  EClass getVarAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarAssignment#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarAssignment#getType()
   * @see #getVarAssignment()
   * @generated
   */
  EReference getVarAssignment_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarAssignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarAssignment#getName()
   * @see #getVarAssignment()
   * @generated
   */
  EAttribute getVarAssignment_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarInstanceCreation <em>Var Instance Creation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Instance Creation</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarInstanceCreation
   * @generated
   */
  EClass getVarInstanceCreation();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarInstanceCreation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarInstanceCreation#getType()
   * @see #getVarInstanceCreation()
   * @generated
   */
  EReference getVarInstanceCreation_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarInstanceCreation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarInstanceCreation#getName()
   * @see #getVarInstanceCreation()
   * @generated
   */
  EAttribute getVarInstanceCreation_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclaration <em>Var Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Declaration</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclaration
   * @generated
   */
  EClass getVarDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclaration#getType()
   * @see #getVarDeclaration()
   * @generated
   */
  EReference getVarDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclaration#getName()
   * @see #getVarDeclaration()
   * @generated
   */
  EAttribute getVarDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.ReturnStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.ReturnStatement#getName()
   * @see #getReturnStatement()
   * @generated
   */
  EAttribute getReturnStatement_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Call</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall
   * @generated
   */
  EClass getMethodCall();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCallee <em>Name Callee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Callee</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCallee()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_NameCallee();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getMethod()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_Method();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCaller <em>Name Caller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Caller</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall#getNameCaller()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_NameCaller();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall <em>Static Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Method Call</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall
   * @generated
   */
  EClass getStaticMethodCall();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall#getMethod()
   * @see #getStaticMethodCall()
   * @generated
   */
  EAttribute getStaticMethodCall_Method();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall#getName()
   * @see #getStaticMethodCall()
   * @generated
   */
  EReference getStaticMethodCall_Name();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.CalledMethodName <em>Called Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Called Method Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.CalledMethodName
   * @generated
   */
  EClass getCalledMethodName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.CalledMethodName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.CalledMethodName#getValue()
   * @see #getCalledMethodName()
   * @generated
   */
  EAttribute getCalledMethodName_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Type#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Type#getValue()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Value();

  /**
   * Returns the meta object for class '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Name#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Name#getValue()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QL2Factory getQL2Factory();

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
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ModelImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__VARS = eINSTANCE.getModel_Vars();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STATEMENTS = eINSTANCE.getModel_Statements();

    /**
     * The meta object literal for the '<em><b>Return Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RETURN_STATEMENT = eINSTANCE.getModel_ReturnStatement();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.StatementImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VAR = eINSTANCE.getStatement_Var();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarDeclarationParamImpl <em>Var Declaration Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarDeclarationParamImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarDeclarationParam()
     * @generated
     */
    EClass VAR_DECLARATION_PARAM = eINSTANCE.getVarDeclarationParam();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLARATION_PARAM__TYPE = eINSTANCE.getVarDeclarationParam_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECLARATION_PARAM__NAME = eINSTANCE.getVarDeclarationParam_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarNullLiteralImpl <em>Var Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarNullLiteralImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarNullLiteral()
     * @generated
     */
    EClass VAR_NULL_LITERAL = eINSTANCE.getVarNullLiteral();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_NULL_LITERAL__TYPE = eINSTANCE.getVarNullLiteral_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_NULL_LITERAL__NAME = eINSTANCE.getVarNullLiteral_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarAssignmentImpl <em>Var Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarAssignmentImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarAssignment()
     * @generated
     */
    EClass VAR_ASSIGNMENT = eINSTANCE.getVarAssignment();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_ASSIGNMENT__TYPE = eINSTANCE.getVarAssignment_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_ASSIGNMENT__NAME = eINSTANCE.getVarAssignment_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarInstanceCreationImpl <em>Var Instance Creation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarInstanceCreationImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarInstanceCreation()
     * @generated
     */
    EClass VAR_INSTANCE_CREATION = eINSTANCE.getVarInstanceCreation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_INSTANCE_CREATION__TYPE = eINSTANCE.getVarInstanceCreation_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_INSTANCE_CREATION__NAME = eINSTANCE.getVarInstanceCreation_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarDeclarationImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getVarDeclaration()
     * @generated
     */
    EClass VAR_DECLARATION = eINSTANCE.getVarDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECLARATION__TYPE = eINSTANCE.getVarDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECLARATION__NAME = eINSTANCE.getVarDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ReturnStatementImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN_STATEMENT__NAME = eINSTANCE.getReturnStatement_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.MethodCallImpl <em>Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.MethodCallImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getMethodCall()
     * @generated
     */
    EClass METHOD_CALL = eINSTANCE.getMethodCall();

    /**
     * The meta object literal for the '<em><b>Name Callee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__NAME_CALLEE = eINSTANCE.getMethodCall_NameCallee();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__METHOD = eINSTANCE.getMethodCall_Method();

    /**
     * The meta object literal for the '<em><b>Name Caller</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__NAME_CALLER = eINSTANCE.getMethodCall_NameCaller();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.StaticMethodCallImpl <em>Static Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.StaticMethodCallImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getStaticMethodCall()
     * @generated
     */
    EClass STATIC_METHOD_CALL = eINSTANCE.getStaticMethodCall();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_METHOD_CALL__METHOD = eINSTANCE.getStaticMethodCall_Method();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_METHOD_CALL__NAME = eINSTANCE.getStaticMethodCall_Name();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.CalledMethodNameImpl <em>Called Method Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.CalledMethodNameImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getCalledMethodName()
     * @generated
     */
    EClass CALLED_METHOD_NAME = eINSTANCE.getCalledMethodName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALLED_METHOD_NAME__VALUE = eINSTANCE.getCalledMethodName_Value();

    /**
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.TypeImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getType()
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
     * The meta object literal for the '{@link org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.NameImpl
     * @see org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.QL2PackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__VALUE = eINSTANCE.getName_Value();

  }

} //QL2Package
