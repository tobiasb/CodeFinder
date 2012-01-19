package org.eclipselabs.recommenders.codesearchquery.rcp.dsl.serializer;

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
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.ClauseExpression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Exp1;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.Expression;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.FieldName;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.LuceneQueryPackage;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.SimpleClause;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeClause;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.luceneQuery.TypeFieldName;
import org.eclipselabs.recommenders.codesearchquery.rcp.dsl.services.LuceneQueryGrammarAccess;

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
			case LuceneQueryPackage.CLAUSE_EXPRESSION:
				if(context == grammarAccess.getClauseExpressionRule()) {
					sequence_ClauseExpression(context, (ClauseExpression) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.EXP1:
				if(context == grammarAccess.getExp1Rule() ||
				   context == grammarAccess.getExp1Access().getExp1LeftAction_1_0() ||
				   context == grammarAccess.getExp2Rule()) {
					sequence_Exp1(context, (Exp1) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.EXPRESSION:
				if(context == grammarAccess.getExp1Rule() ||
				   context == grammarAccess.getExp1Access().getExp1LeftAction_1_0() ||
				   context == grammarAccess.getExp2Rule()) {
					sequence_Exp2(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.FIELD_NAME:
				if(context == grammarAccess.getFieldNameRule()) {
					sequence_FieldName(context, (FieldName) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.SIMPLE_CLAUSE:
				if(context == grammarAccess.getSimpleClauseRule()) {
					sequence_SimpleClause(context, (SimpleClause) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.TYPE_CLAUSE:
				if(context == grammarAccess.getTypeClauseRule()) {
					sequence_TypeClause(context, (TypeClause) semanticObject); 
					return; 
				}
				else break;
			case LuceneQueryPackage.TYPE_FIELD_NAME:
				if(context == grammarAccess.getTypeFieldNameRule()) {
					sequence_TypeFieldName(context, (TypeFieldName) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((n=NotExpression | m=MustExpression)? (clause=SimpleClause | clause=TypeClause))
	 */
	protected void sequence_ClauseExpression(EObject context, ClauseExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Exp1_Exp1_1_0 b=BooleanExp right=Exp2)
	 */
	protected void sequence_Exp1(EObject context, Exp1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ClauseExpression
	 */
	protected void sequence_Exp2(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExp2Access().getValueClauseExpressionParserRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         FullyQualifiedName='FullyQualifiedName' | 
	 *         Type='Type' | 
	 *         FriendlyName='FriendlyName' | 
	 *         DeclaredMethods='DeclaredMethods' | 
	 *         ParameterCount='ParameterCount' | 
	 *         ReturnVariableEexpressions='ReturnVariableEexpressions' | 
	 *         UsedMethods='UsedMethods' | 
	 *         UsedMethodsInTry='UsedMethodsInTry' | 
	 *         UsedMethodsInFinally='UsedMethodsInFinally' | 
	 *         OverriddenMethods='OverriddenMethods' | 
	 *         ProjectName='ProjectName' | 
	 *         ResourcePath='ResourcePath' | 
	 *         Modifiers='Modifiers' | 
	 *         AllDeclaredMethodNames='AllDeclaredMethodNames' | 
	 *         DeclaredMethodNames='DeclaredMethodNames' | 
	 *         DeclaredFieldNames='DeclaredFieldNames' | 
	 *         DeclaredFieldTypes='DeclaredFieldTypes' | 
	 *         AllDeclaredFieldNames='AllDeclaredFieldNames' | 
	 *         FullText='FullText' | 
	 *         FieldsRead='FieldsRead' | 
	 *         FieldsWritten='FieldsWritten' | 
	 *         UsedFieldsInFinally='UsedFieldsInFinally' | 
	 *         UsedFieldsInTry='UsedFieldsInTry' | 
	 *         Annotations='Annotations' | 
	 *         Timestamp='Timestamp'
	 *     )
	 */
	protected void sequence_FieldName(EObject context, FieldName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=FieldName value=FieldValue)
	 */
	protected void sequence_SimpleClause(EObject context, SimpleClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.SIMPLE_CLAUSE__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.SIMPLE_CLAUSE__FIELD));
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.SIMPLE_CLAUSE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.SIMPLE_CLAUSE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleClauseAccess().getFieldFieldNameParserRuleCall_0_0(), semanticObject.getField());
		feeder.accept(grammarAccess.getSimpleClauseAccess().getValueFieldValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (field=TypeFieldName value=TypeValue)
	 */
	protected void sequence_TypeClause(EObject context, TypeClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.TYPE_CLAUSE__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.TYPE_CLAUSE__FIELD));
			if(transientValues.isValueTransient(semanticObject, LuceneQueryPackage.Literals.TYPE_CLAUSE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuceneQueryPackage.Literals.TYPE_CLAUSE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeClauseAccess().getFieldTypeFieldNameParserRuleCall_0_0(), semanticObject.getField());
		feeder.accept(grammarAccess.getTypeClauseAccess().getValueTypeValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ImplementedTypes='ImplementedTypes' | 
	 *         ExtendedTypes='ExtendedTypes' | 
	 *         UsedTypes='UsedTypes' | 
	 *         UsedTypesInTry='UsedTypesInTry' | 
	 *         UsedTypesInFinally='UsedTypesInFinally' | 
	 *         ParameterTypes='ParameterTypes' | 
	 *         ReturnType='ReturnType' | 
	 *         AllImplementedTypes='AllImplementedTypes' | 
	 *         AllExtendedTypes='AllExtendedTypes' | 
	 *         FieldType='FieldType' | 
	 *         DeclaringType='DeclaringType' | 
	 *         CaughtType='CaughtType' | 
	 *         InstanceofTypes='InstanceofTypes'
	 *     )
	 */
	protected void sequence_TypeFieldName(EObject context, TypeFieldName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
