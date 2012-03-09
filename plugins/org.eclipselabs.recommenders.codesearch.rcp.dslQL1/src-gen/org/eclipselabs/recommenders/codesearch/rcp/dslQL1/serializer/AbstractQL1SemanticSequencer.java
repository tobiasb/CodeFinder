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
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MethodPatternDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Modifier;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ModifierDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiElement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterDefinition;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterElementHolder;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ParameterType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.ReturnType;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleElement;
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
			case QL1Package.METHOD_PATTERN_DEFINITION:
				if(context == grammarAccess.getMethodPatternDefinitionRule()) {
					sequence_MethodPatternDefinition(context, (MethodPatternDefinition) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.MODIFIER:
				if(context == grammarAccess.getModifierRule()) {
					sequence_Modifier(context, (Modifier) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.MODIFIER_DEFINITION:
				if(context == grammarAccess.getModifierDefinitionRule()) {
					sequence_ModifierDefinition(context, (ModifierDefinition) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.MULTI_ELEMENT:
				if(context == grammarAccess.getMultiElementRule()) {
					sequence_MultiElement(context, (MultiElement) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.PARAMETER_DEFINITION:
				if(context == grammarAccess.getParameterDefinitionRule()) {
					sequence_ParameterDefinition(context, (ParameterDefinition) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.PARAMETER_ELEMENT_HOLDER:
				if(context == grammarAccess.getParameterElementHolderRule()) {
					sequence_ParameterElementHolder(context, (ParameterElementHolder) semanticObject); 
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
			case QL1Package.SINGLE_ELEMENT:
				if(context == grammarAccess.getSingleElementRule()) {
					sequence_SingleElement(context, (SingleElement) semanticObject); 
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
	 *     value=SimpleFieldValue
	 */
	protected void sequence_MethodName(EObject context, MethodName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.METHOD_NAME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.METHOD_NAME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodNameAccess().getValueSimpleFieldValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modifierDefinition=ModifierDefinition returnType=ReturnType methodName=MethodName parameterDefinition=ParameterDefinition? throwsClause=Throws?)
	 */
	protected void sequence_MethodPatternDefinition(EObject context, MethodPatternDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     definition=MethodPatternDefinition
	 */
	protected void sequence_MethodPattern(EObject context, MethodPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.METHOD_PATTERN__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.METHOD_PATTERN__DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodPatternAccess().getDefinitionMethodPatternDefinitionParserRuleCall_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier*)
	 */
	protected void sequence_ModifierDefinition(EObject context, ModifierDefinition semanticObject) {
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
	 *     (elements+=SingleElement elements+=SingleElement*)
	 */
	protected void sequence_MultiElement(EObject context, MultiElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameterElementholder+=ParameterElementHolder parameterElementholder+=ParameterElementHolder*)
	 */
	protected void sequence_ParameterDefinition(EObject context, ParameterDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=SingleElement | element=MultiElement)
	 */
	protected void sequence_ParameterElementHolder(EObject context, ParameterElementHolder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=TypeFieldValue | value='..')
	 */
	protected void sequence_ParameterType(EObject context, ParameterType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=TypeFieldValue
	 */
	protected void sequence_ReturnType(EObject context, ReturnType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.RETURN_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.RETURN_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnTypeAccess().getValueTypeFieldValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=ParameterType
	 */
	protected void sequence_SingleElement(EObject context, SingleElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.SINGLE_ELEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.SINGLE_ELEMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleElementAccess().getValueParameterTypeParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=TypeFieldValue
	 */
	protected void sequence_Throws(EObject context, Throws semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.THROWS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.THROWS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getThrowsAccess().getValueTypeFieldValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}
