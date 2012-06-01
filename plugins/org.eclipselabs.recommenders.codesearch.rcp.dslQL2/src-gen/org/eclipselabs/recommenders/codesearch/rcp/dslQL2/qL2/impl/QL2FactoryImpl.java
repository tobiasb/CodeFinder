/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QL2FactoryImpl extends EFactoryImpl implements QL2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QL2Factory init()
  {
    try
    {
      QL2Factory theQL2Factory = (QL2Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/recommenders/codesearch/rcp/dslQL2/QL2"); 
      if (theQL2Factory != null)
      {
        return theQL2Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QL2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QL2FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QL2Package.MODEL: return createModel();
      case QL2Package.STATEMENT: return createStatement();
      case QL2Package.VAR_DECLARATION_PARAM: return createVarDeclarationParam();
      case QL2Package.VAR_NULL_LITERAL: return createVarNullLiteral();
      case QL2Package.VAR_ASSIGNMENT: return createVarAssignment();
      case QL2Package.VAR_INSTANCE_CREATION: return createVarInstanceCreation();
      case QL2Package.VAR_DECLARATION: return createVarDeclaration();
      case QL2Package.RETURN_STATEMENT: return createReturnStatement();
      case QL2Package.METHOD_CALL: return createMethodCall();
      case QL2Package.STATIC_METHOD_CALL: return createStaticMethodCall();
      case QL2Package.CALLED_METHOD_NAME: return createCalledMethodName();
      case QL2Package.TYPE: return createType();
      case QL2Package.NAME: return createName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclarationParam createVarDeclarationParam()
  {
    VarDeclarationParamImpl varDeclarationParam = new VarDeclarationParamImpl();
    return varDeclarationParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarNullLiteral createVarNullLiteral()
  {
    VarNullLiteralImpl varNullLiteral = new VarNullLiteralImpl();
    return varNullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarAssignment createVarAssignment()
  {
    VarAssignmentImpl varAssignment = new VarAssignmentImpl();
    return varAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarInstanceCreation createVarInstanceCreation()
  {
    VarInstanceCreationImpl varInstanceCreation = new VarInstanceCreationImpl();
    return varInstanceCreation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclaration createVarDeclaration()
  {
    VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
    return varDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCall createMethodCall()
  {
    MethodCallImpl methodCall = new MethodCallImpl();
    return methodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticMethodCall createStaticMethodCall()
  {
    StaticMethodCallImpl staticMethodCall = new StaticMethodCallImpl();
    return staticMethodCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CalledMethodName createCalledMethodName()
  {
    CalledMethodNameImpl calledMethodName = new CalledMethodNameImpl();
    return calledMethodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QL2Package getQL2Package()
  {
    return (QL2Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QL2Package getPackage()
  {
    return QL2Package.eINSTANCE;
  }

} //QL2FactoryImpl
