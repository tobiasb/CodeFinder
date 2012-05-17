package org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Field;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldCategory;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.FieldType;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.LuceneFieldsPackage;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.luceneFields.Model;
import org.eclipselabs.recommenders.codesearch.internal.rcp.dsl.services.LuceneFieldsGrammarAccess;

import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class AbstractLuceneFieldsSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected LuceneFieldsGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == LuceneFieldsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LuceneFieldsPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case LuceneFieldsPackage.FIELD_CATEGORY:
				if(context == grammarAccess.getFieldCategoryRule()) {
					sequence_FieldCategory(context, (FieldCategory) semanticObject); 
					return; 
				}
				else break;
			case LuceneFieldsPackage.FIELD_TYPE:
				if(context == grammarAccess.getFieldTypeRule()) {
					sequence_FieldType(context, (FieldType) semanticObject); 
					return; 
				}
				else break;
			case LuceneFieldsPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (categoryName=ID fields+=Field*)
	 */
	protected void sequence_FieldCategory(EObject context, FieldCategory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classType?='class' | methodType?='method' | fieldType?='field' | trycatchType?='trycatch' | varusage?='varusage')
	 */
	protected void sequence_FieldType(EObject context, FieldType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING types+=FieldType types+=FieldType*)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packageNames+=STRING* className=ID fieldCategories+=FieldCategory*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
