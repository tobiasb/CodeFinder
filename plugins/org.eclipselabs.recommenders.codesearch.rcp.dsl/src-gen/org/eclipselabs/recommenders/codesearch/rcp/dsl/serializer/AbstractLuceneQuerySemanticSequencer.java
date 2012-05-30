package org.eclipselabs.recommenders.codesearch.rcp.dsl.serializer;

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
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.AndExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DefinitionType;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.DocumentTypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.FilePathField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.MethodField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ModifierField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.NumberField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.OrExp;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.ProjectNameField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.SimpleField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.luceneQuery.TypeField;
import org.eclipselabs.recommenders.codesearch.rcp.dsl.services.LuceneQueryGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractLuceneQuerySemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected LuceneQueryGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == LuceneQueryPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LuceneQueryPackage.AND_EXP:
				if(context == grammarAccess.getAndExpRule() ||
				   context == grammarAccess.getAndExpAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpRule() ||
				   context == grammarAccess.getOrExpAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_AndExp(context, (AndExp) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.CLAUSE_EXPRESSION:
				if(context == grammarAccess.getClauseExpressionRule()) {
					sequence_ClauseExpression(context, (ClauseExpression) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.DEFINITION_TYPE:
				if(context == grammarAccess.getDefinitionTypeRule()) {
					sequence_DefinitionType(context, (DefinitionType) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.DOCUMENT_TYPE_FIELD:
				if(context == grammarAccess.getDocumentTypeFieldRule()) {
					sequence_DocumentTypeField(context, (DocumentTypeField) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.EXPRESSION:
				if(context == grammarAccess.getAndExpRule() ||
				   context == grammarAccess.getAndExpAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpRule() ||
				   context == grammarAccess.getOrExpAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.FILE_PATH_FIELD:
				if(context == grammarAccess.getFilePathFieldRule()) {
					sequence_FilePathField(context, (FilePathField) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.METHOD_FIELD:
				if(context == grammarAccess.getMethodFieldRule()) {
					sequence_MethodField(context, (MethodField) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.MODIFIER_FIELD:
				if(context == grammarAccess.getModifierFieldRule()) {
					sequence_ModifierField(context, (ModifierField) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.NUMBER_FIELD:
				if(context == grammarAccess.getNumberFieldRule()) {
					sequence_NumberField(context, (NumberField) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.OR_EXP:
				if(context == grammarAccess.getAndExpRule() ||
				   context == grammarAccess.getAndExpAccess().getAndExpLeftAction_1_0() ||
				   context == grammarAccess.getOrExpRule() ||
				   context == grammarAccess.getOrExpAccess().getOrExpLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_OrExp(context, (OrExp) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.PROJECT_NAME_FIELD:
				if(context == grammarAccess.getProjectNameFieldRule()) {
					sequence_ProjectNameField(context, (ProjectNameField) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.SIMPLE_FIELD:
				if(context == grammarAccess.getSimpleFieldRule()) {
					sequence_SimpleField(context, (SimpleField) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.TYPE_FIELD:
				if(context == grammarAccess.getTypeFieldRule()) {
					sequence_TypeField(context, (TypeField) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=AndExp_AndExp_1_0 and=BinaryAnd right=AndExp)
	 */
	protected void sequence_AndExp(EObject context, AndExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         default=SimpleFieldValue | 
	 *         (field=SimpleField (values+=SimpleFieldValue | values+=SimpleFieldValue*)) | 
	 *         (field=TypeField (values+=TypeFieldValue | values+=TypeFieldValue*)) | 
	 *         (field=MethodField (values+=MethodFieldValue | values+=MethodFieldValue*)) | 
	 *         (field=FilePathField (values+=FilePathFieldValue | values+=FilePathFieldValue*)) | 
	 *         (field=NumberField (values+=NumberFieldValue | values+=NumberFieldValue*)) | 
	 *         (field=ModifierField (values+=ModifierFieldValue | values+=ModifierFieldValue*)) | 
	 *         (field=DocumentTypeField (values+=DocumentTypeFieldValue | values+=DocumentTypeFieldValue*)) | 
	 *         (field=ProjectNameField (values+=ProjectNameFieldValue | values+=ProjectNameFieldValue*)) | 
	 *         (field=DefinitionType (values+=DefinitionTypeValue | values+=DefinitionTypeValue*))
	 *     )
	 */
	protected void sequence_ClauseExpression(EObject context, ClauseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='VariableDefinition'
	 */
	protected void sequence_DefinitionType(EObject context, DefinitionType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.DEFINITION_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.DEFINITION_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefinitionTypeAccess().getValueVariableDefinitionKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value='Type'
	 */
	protected void sequence_DocumentTypeField(EObject context, DocumentTypeField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.DOCUMENT_TYPE_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.DOCUMENT_TYPE_FIELD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDocumentTypeFieldAccess().getValueTypeKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value='ResourcePath'
	 */
	protected void sequence_FilePathField(EObject context, FilePathField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.FILE_PATH_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.FILE_PATH_FIELD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilePathFieldAccess().getValueResourcePathKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='UsedMethods' | 
	 *         value='UsedMethodsInTry' | 
	 *         value='UsedMethodsInFinally' | 
	 *         value='OverriddenMethods' | 
	 *         value='DeclaredMethods' | 
	 *         value='DeclaringMethod' | 
	 *         value='UsedAsParameterInMethods' | 
	 *         value='UsedAsTargetForMethods'
	 *     )
	 */
	protected void sequence_MethodField(EObject context, MethodField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='Modifiers'
	 */
	protected void sequence_ModifierField(EObject context, ModifierField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.MODIFIER_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.MODIFIER_FIELD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModifierFieldAccess().getValueModifiersKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='ParameterCount' | value='Timestamp')
	 */
	protected void sequence_NumberField(EObject context, NumberField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=OrExp_OrExp_1_0 or=BinaryOr? right=OrExp) | (left=OrExp_OrExp_1_0 right=OrExp))
	 */
	protected void sequence_OrExp(EObject context, OrExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ClauseExpression
	 */
	protected void sequence_Primary(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='ProjectName'
	 */
	protected void sequence_ProjectNameField(EObject context, ProjectNameField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.PROJECT_NAME_FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.PROJECT_NAME_FIELD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProjectNameFieldAccess().getValueProjectNameKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='FullyQualifiedName' | 
	 *         value='FriendlyName' | 
	 *         value='ReturnVariableExpressions' | 
	 *         value='AllDeclaredMethodNames' | 
	 *         value='DeclaredMethodNames' | 
	 *         value='DeclaredFieldNames' | 
	 *         value='AllDeclaredFieldNames' | 
	 *         value='FullText' | 
	 *         value='FieldsRead' | 
	 *         value='FieldsWritten' | 
	 *         value='UsedFieldsInFinally' | 
	 *         value='UsedFieldsInTry' | 
	 *         value='VariableName' | 
	 *         value='ParameterTypesStructural' | 
	 *         value='Annotations'
	 *     )
	 */
	protected void sequence_SimpleField(EObject context, SimpleField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='ImplementedTypes' | 
	 *         value='ExtendedTypes' | 
	 *         value='UsedTypes' | 
	 *         value='UsedTypesInTry' | 
	 *         value='UsedTypesInFinally' | 
	 *         value='ParameterTypes' | 
	 *         value='ReturnType' | 
	 *         value='InstanceofTypes' | 
	 *         value='AllImplementedTypes' | 
	 *         value='AllExtendedTypes' | 
	 *         value='FieldType' | 
	 *         value='CaughtType' | 
	 *         value='DeclaredFieldTypes' | 
	 *         value='DeclaringType' | 
	 *         value='VariableType' | 
	 *         value='CheckedExceptions'
	 *     )
	 */
	protected void sequence_TypeField(EObject context, TypeField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
