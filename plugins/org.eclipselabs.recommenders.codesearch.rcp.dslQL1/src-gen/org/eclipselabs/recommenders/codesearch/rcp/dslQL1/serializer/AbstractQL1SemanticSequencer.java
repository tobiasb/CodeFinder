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
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.BooleanField;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Contains;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.First;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueField;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.MultiValueFieldName;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Multiplication;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Negation;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.OrExpr;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.QL1Package;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueField;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.SingleValueFieldName;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL1.qL1.Type;
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
			case QL1Package.BOOLEAN_FIELD:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getBooleanFieldRule() ||
				   context == grammarAccess.getFieldExprRule() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_BooleanField(context, (BooleanField) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.CONTAINS:
				if(context == grammarAccess.getContainsRule()) {
					sequence_Contains(context, (Contains) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.FIRST:
				if(context == grammarAccess.getFirstRule()) {
					sequence_First(context, (First) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.MULTI_VALUE_FIELD:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getFieldExprRule() ||
				   context == grammarAccess.getMultiValueFieldRule() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_MultiValueField(context, (MultiValueField) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.MULTI_VALUE_FIELD_NAME:
				if(context == grammarAccess.getMultiValueFieldNameRule()) {
					sequence_MultiValueFieldName(context, (MultiValueFieldName) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.MULTIPLICATION:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_AndExpr(context, (Multiplication) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.NEGATION:
				if(context == grammarAccess.getNegationRule()) {
					sequence_Negation(context, (Negation) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.OR_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_OrExpr(context, (OrExpr) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.SINGLE_VALUE_FIELD:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getMultiplicationLeftAction_1_0() ||
				   context == grammarAccess.getFieldExprRule() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getSingleValueFieldRule()) {
					sequence_SingleValueField(context, (SingleValueField) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.SINGLE_VALUE_FIELD_NAME:
				if(context == grammarAccess.getSingleValueFieldNameRule()) {
					sequence_SingleValueFieldName(context, (SingleValueFieldName) semanticObject); 
					return; 
				}
				else break;
			case QL1Package.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=AndExpr_Multiplication_1_0 right=Primary)
	 */
	protected void sequence_AndExpr(EObject context, Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndExprAccess().getMultiplicationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndExprAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         n=Negation? 
	 *         (
	 *             value='IsStatic' | 
	 *             value='IsPrivate' | 
	 *             value='IsPublic' | 
	 *             value='IsFinal' | 
	 *             value='IsAbstract' | 
	 *             value='IsProtected'
	 *         )
	 *     )
	 */
	protected void sequence_BooleanField(EObject context, BooleanField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type e=OrExpr)
	 */
	protected void sequence_Contains(EObject context, Contains semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.CONTAINS__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.CONTAINS__TYPE));
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.CONTAINS__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.CONTAINS__E));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContainsAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getContainsAccess().getEOrExprParserRuleCall_2_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type e=OrExpr (c+=Contains c+=Contains*)?)
	 */
	protected void sequence_First(EObject context, First semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='CalledMethods'
	 */
	protected void sequence_MultiValueFieldName(EObject context, MultiValueFieldName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.MULTI_VALUE_FIELD_NAME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.MULTI_VALUE_FIELD_NAME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiValueFieldNameAccess().getValueCalledMethodsKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiValueFieldName (values+=NameWithWC | (values+=NameWithWC values+=NameWithWC*)))
	 */
	protected void sequence_MultiValueField(EObject context, MultiValueField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='!'
	 */
	protected void sequence_Negation(EObject context, Negation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.NEGATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.NEGATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegationAccess().getValueExclamationMarkKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OrExpr_OrExpr_1_0 right=AndExpr)
	 */
	protected void sequence_OrExpr(EObject context, OrExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.OR_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.OR_EXPR__LEFT));
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.OR_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.OR_EXPR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value='Name'
	 */
	protected void sequence_SingleValueFieldName(EObject context, SingleValueFieldName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QL1Package.Literals.SINGLE_VALUE_FIELD_NAME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QL1Package.Literals.SINGLE_VALUE_FIELD_NAME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleValueFieldNameAccess().getValueNameKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=SingleValueFieldName n=Negation? value=NameWithWC)
	 */
	protected void sequence_SingleValueField(EObject context, SingleValueField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='Methods' | method='Types')
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
