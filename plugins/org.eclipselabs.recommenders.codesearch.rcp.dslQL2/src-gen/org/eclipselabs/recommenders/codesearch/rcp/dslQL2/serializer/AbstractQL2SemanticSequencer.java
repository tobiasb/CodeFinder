package org.eclipselabs.recommenders.codesearch.rcp.dslQL2.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.CalledMethodName;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Name;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Type;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclaration;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclarationParam;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarInitialisation;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarNullLiteral;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.services.QL2GrammarAccess;

@SuppressWarnings("restriction")
public class AbstractQL2SemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected QL2GrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QL2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QL2Package.CALLED_METHOD_NAME:
				if(context == grammarAccess.getCalledMethodNameRule()) {
					sequence_CalledMethodName(context, (CalledMethodName) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.METHOD_CALL:
				if(context == grammarAccess.getMethodCallRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_MethodCall(context, (MethodCall) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.NAME:
				if(context == grammarAccess.getNameRule()) {
					sequence_Name(context, (Name) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.STATIC_METHOD_CALL:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStaticMethodCallRule()) {
					sequence_StaticMethodCall(context, (StaticMethodCall) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.VAR_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDeclarationRule()) {
					sequence_VarDeclaration(context, (VarDeclaration) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.VAR_DECLARATION_PARAM:
				if(context == grammarAccess.getVarDeclarationParamRule()) {
					sequence_VarDeclarationParam(context, (VarDeclarationParam) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.VAR_INITIALISATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarInitialisationRule()) {
					sequence_VarInitialisation(context, (VarInitialisation) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.VAR_NULL_LITERAL:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarNullLiteralRule()) {
					sequence_VarNullLiteral(context, (VarNullLiteral) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=WildcardName
	 */
	protected void sequence_CalledMethodName(EObject context, CalledMethodName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.CALLED_METHOD_NAME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.CALLED_METHOD_NAME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCalledMethodNameAccess().getValueWildcardNameParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nameCallee=Name method=CalledMethodName nameCaller=Name?)
	 */
	protected void sequence_MethodCall(EObject context, MethodCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((vars+=VarDeclarationParam vars+=VarDeclarationParam*)? statements+=Statement*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_Name(EObject context, Name semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.NAME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.NAME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNameAccess().getValueIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (method=WildcardNameConcatenated name=Name)
	 */
	protected void sequence_StaticMethodCall(EObject context, StaticMethodCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.STATIC_METHOD_CALL__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.STATIC_METHOD_CALL__METHOD));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.STATIC_METHOD_CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.STATIC_METHOD_CALL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStaticMethodCallAccess().getMethodWildcardNameConcatenatedParserRuleCall_0_0(), semanticObject.getMethod());
		feeder.accept(grammarAccess.getStaticMethodCallAccess().getNameNameParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=WildcardNameConcatenated
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getValueWildcardNameConcatenatedParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_VarDeclarationParam(EObject context, VarDeclarationParam semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR_DECLARATION_PARAM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR_DECLARATION_PARAM__TYPE));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR_DECLARATION_PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR_DECLARATION_PARAM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarDeclarationParamAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarDeclarationParamAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_VarDeclaration(EObject context, VarDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_VarInitialisation(EObject context, VarInitialisation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR_INITIALISATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR_INITIALISATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR_INITIALISATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR_INITIALISATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarInitialisationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_VarNullLiteral(EObject context, VarNullLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR_NULL_LITERAL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR_NULL_LITERAL__TYPE));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR_NULL_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR_NULL_LITERAL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarNullLiteralAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarNullLiteralAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
