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
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.QL2Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Var;
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
			case QL2Package.VAR:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Var) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVarDeclarationParamRule()) {
					sequence_VarDeclarationParam(context, (Var) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVarDeclarationRule()) {
					sequence_VarDeclaration(context, (Var) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVarInitialisationRule()) {
					sequence_VarInitialisation(context, (Var) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=Name method=Name)
	 */
	protected void sequence_MethodCall(EObject context, MethodCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.METHOD_CALL__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.METHOD_CALL__METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodCallAccess().getNameNameTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMethodCallAccess().getMethodNameTerminalRuleCall_2_0(), semanticObject.getMethod());
		feeder.finish();
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
	 *     ((type=Name name=Name) | (type=Name name=Name))
	 */
	protected void sequence_Statement(EObject context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Name name=Name)
	 */
	protected void sequence_VarDeclarationParam(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarDeclarationParamAccess().getTypeNameTerminalRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarDeclarationParamAccess().getNameNameTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Name name=Name)
	 */
	protected void sequence_VarDeclaration(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarDeclarationAccess().getTypeNameTerminalRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarDeclarationAccess().getNameNameTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Name name=Name)
	 */
	protected void sequence_VarInitialisation(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarInitialisationAccess().getTypeNameTerminalRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarInitialisationAccess().getNameNameTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
