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
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDef;
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
				if(context == grammarAccess.getVarDeclarationRule()) {
					sequence_VarDeclaration(context, (Var) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVarInitialisationRule()) {
					sequence_VarInitialisation(context, (Var) semanticObject); 
					return; 
				}
				else break;
			case QL2Package.VAR_DEF:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVarDefRule()) {
					sequence_VarDef(context, (VarDef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=VarName method=NameWithWC)
	 */
	protected void sequence_MethodCall(EObject context, MethodCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.METHOD_CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.METHOD_CALL__NAME));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.METHOD_CALL__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.METHOD_CALL__METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodCallAccess().getNameVarNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMethodCallAccess().getMethodNameWithWCTerminalRuleCall_2_0(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((vars+=VarDeclaration vars+=VarDeclaration*)? statements+=Statement*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=VarName)
	 */
	protected void sequence_VarDeclaration(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR__TYPE));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarDeclarationAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarDeclarationAccess().getNameVarNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (vars+=VarInitialisation | vars+=VarDeclaration)
	 */
	protected void sequence_VarDef(EObject context, VarDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=VarName)
	 */
	protected void sequence_VarInitialisation(EObject context, Var semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR__TYPE));
			if(transientValues.isValueTransient(semanticObject, QL2Package.Literals.VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL2Package.Literals.VAR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarInitialisationAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarInitialisationAccess().getNameVarNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
