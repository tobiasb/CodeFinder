package org.eclipselabs.recommenders.codesearch.rcp.dslQL1.serializer;

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
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodName;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPattern;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Throws;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.services.QL1GrammarAccess;

@SuppressWarnings("restriction")
public class AbstractQL1SemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected QL1GrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == QL1Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QL1Package.METHOD_NAME:
				if(context == grammarAccess.getMethodNameRule()) {
					sequence_MethodName(context, (MethodName) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.METHOD_PATTERN:
				if(context == grammarAccess.getMethodPatternRule()) {
					sequence_MethodPattern(context, (MethodPattern) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.MODIFIER:
				if(context == grammarAccess.getModifierRule()) {
					sequence_Modifier(context, (Modifier) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.PARAMETER_ELEMENT:
				if(context == grammarAccess.getParameterElementRule()) {
					sequence_ParameterElement(context, (ParameterElement) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.PARAMETER_TYPE:
				if(context == grammarAccess.getParameterTypeRule()) {
					sequence_ParameterType(context, (ParameterType) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.RETURN_TYPE:
				if(context == grammarAccess.getReturnTypeRule()) {
					sequence_ReturnType(context, (ReturnType) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.THROWS:
				if(context == grammarAccess.getThrowsRule()) {
					sequence_Throws(context, (Throws) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=NameWithWC
	 */
	protected void sequence_MethodName(EObject context, MethodName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.METHOD_NAME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.METHOD_NAME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodNameAccess().getValueNameWithWCTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         modifiers+=Modifier* 
	 *         returnType=ReturnType 
	 *         methodName=MethodName 
	 *         (parameterElements+=ParameterElement parameterElements+=ParameterElement*)? 
	 *         throwsClause=Throws?
	 *     )
	 */
	protected void sequence_MethodPattern(EObject context, MethodPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='static' | 
	 *         value='private' | 
	 *         value='public' | 
	 *         value='final' | 
	 *         value='abstract' | 
	 *         value='protected'
	 *     )
	 */
	protected void sequence_Modifier(EObject context, Modifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     values+=ParameterType
	 */
	protected void sequence_ParameterElement(EObject context, ParameterElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=NameWithWC | value='..')
	 */
	protected void sequence_ParameterType(EObject context, ParameterType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NameWithWC
	 */
	protected void sequence_ReturnType(EObject context, ReturnType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.RETURN_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.RETURN_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnTypeAccess().getValueNameWithWCTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=NameWithWC
	 */
	protected void sequence_Throws(EObject context, Throws semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.THROWS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.THROWS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getThrowsAccess().getValueNameWithWCTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}
