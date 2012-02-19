package org.eclipse.recommenders.codesearch.rcp.index.indexer.visitor;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AllDeclaredFieldNamesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AllDeclaredMethodNamesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AllExtendedTypesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AllImplementedInterfacesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.AnnotationsIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CaughtTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredFieldNamesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredFieldTypesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredMethodNamesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredMethodsIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaringMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaringTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DocumentTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ExtendedTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FieldTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FieldsReadIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FieldsWrittenIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FriendlyNameIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FullTextIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.FullyQualifiedNameIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ImplementedInterfacesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.InstanceOfIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.JavaElementHandleIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ModifiersIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.OverriddenMethodsIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ParameterCountIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ParameterTypesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ProjectNameIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ResourcePathIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ReturnTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.ReturnVariableExpressionIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.TimestampIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedFieldsInFinallyIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedFieldsInTryIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedMethodsInFinallyIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedMethodsInTryIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedMethodsIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedTypesInFinallyIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedTypesInTryIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.UsedTypesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableDefinitionIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableNameIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableParameterUsageIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableTargetUsageIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.VariableTypeIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.utils.rcp.internal.RecommendersUtilsPlugin;

import com.google.common.collect.Lists;

public class CompilationUnitVisitor extends ASTVisitor {

    private CodeIndexer index = null;
    private final List<IIndexer> indexer;

    public void addIndexer(final IIndexer indexer) {
        this.indexer.add(indexer);
    }

    public void addIndexer(final Collection<IIndexer> indexer) {
        this.indexer.addAll(indexer);
    }

    public CompilationUnitVisitor(final CodeIndexer index) {
        this.index = index;
        indexer = Lists.newArrayList();
    }

    public static List<IIndexer> getDefaultIndexer() {

        final List<IIndexer> list = Lists.newArrayList();

        list.add(new AllDeclaredFieldNamesIndexer());
        list.add(new AllDeclaredMethodNamesIndexer());
        list.add(new AllExtendedTypesIndexer());
        list.add(new AllImplementedInterfacesIndexer());
        list.add(new AnnotationsIndexer());
        list.add(new CaughtTypeIndexer());
        list.add(new DeclaredFieldNamesIndexer());
        list.add(new DeclaredFieldTypesIndexer());
        list.add(new DeclaredMethodNamesIndexer());
        list.add(new DeclaredMethodsIndexer());
        list.add(new DeclaringMethodIndexer());
        list.add(new DeclaringTypeIndexer());
        list.add(new DocumentTypeIndexer());
        list.add(new ExtendedTypeIndexer());
        list.add(new FieldsReadIndexer());
        list.add(new FieldsWrittenIndexer());
        list.add(new FieldTypeIndexer());
        list.add(new FriendlyNameIndexer());
        list.add(new FullTextIndexer());
        list.add(new FullyQualifiedNameIndexer());
        list.add(new ImplementedInterfacesIndexer());
        list.add(new InstanceOfIndexer());
        list.add(new ModifiersIndexer());
        list.add(new OverriddenMethodsIndexer());
        list.add(new ParameterCountIndexer());
        list.add(new ParameterTypesIndexer());
        list.add(new ProjectNameIndexer());
        list.add(new ResourcePathIndexer());
        list.add(new ReturnTypeIndexer());
        list.add(new ReturnVariableExpressionIndexer());
        list.add(new TimestampIndexer());
        list.add(new UsedFieldsInFinallyIndexer());
        list.add(new UsedFieldsInTryIndexer());
        list.add(new UsedMethodsIndexer());
        list.add(new UsedMethodsInFinallyIndexer());
        list.add(new UsedMethodsInTryIndexer());
        list.add(new UsedTypesIndexer());
        list.add(new UsedTypesInFinallyIndexer());
        list.add(new UsedTypesInTryIndexer());
        list.add(new VariableDefinitionIndexer());
        list.add(new VariableNameIndexer());
        list.add(new VariableParameterUsageIndexer());
        list.add(new VariableTargetUsageIndexer());
        list.add(new VariableTypeIndexer());
        list.add(new JavaElementHandleIndexer());
        return list;
    }

    @Override
    public boolean visit(final TypeDeclaration node) {
        final Document document = new Document();

        for (final IIndexer i : indexer) {
            if (i instanceof IClassIndexer) {
                ((IClassIndexer) i).indexType(document, node);
            }
        }

        addDocument(document);
        return true;
    }

    @Override
    public boolean visit(final MethodDeclaration node) {
        final Document methodDocument = new Document();

        for (final IIndexer i : indexer) {
            if (i instanceof IMethodIndexer) {
                ((IMethodIndexer) i).indexMethod(methodDocument, node);
            }
        }

        if (methodDocument.getFields().size() > 0) {
            addDocument(methodDocument);
        }

        // For each method declaration we use another visitor to learn about
        // variable usage

        final VarUsageVisitor varUsageVisitor = new VarUsageVisitor(indexer);
        varUsageVisitor.visit(node);

        for (final Document d : varUsageVisitor.getDocuments()) {
            if (d.getFields().size() > 0) {
                addDocument(d);
            }
        }

        return true;
    }

    @Override
    public boolean visit(final FieldDeclaration node) {
        final Document document = new Document();

        for (final IIndexer i : indexer) {
            if (i instanceof IFieldIndexer) {
                ((IFieldIndexer) i).indexField(document, node);
            }
        }

        if (document.getFields().size() > 0) {
            addDocument(document);
        }
        return false;
    }

    @Override
    public boolean visit(final TryStatement node) {
        final Document document = new Document();

        final TryStatement tryStatement = node;

        @SuppressWarnings("unchecked")
        final List<CatchClause> catchClauses = tryStatement.catchClauses();

        for (final CatchClause catchClause : catchClauses) {
            for (final IIndexer i : indexer) {
                if (i instanceof ITryCatchBlockIndexer) {
                    ((ITryCatchBlockIndexer) i).indexTryCatchBlock(document, tryStatement, catchClause);
                }
            }
        }

        if (document.getFields().size() > 0) {
            addDocument(document);
        }

        return false;
    }

    private void addDocument(final Document document) {

        try {
            index.addDocument(document);
        } catch (final IOException e) {
            RecommendersUtilsPlugin.logError(e, "Exception during document save.");
        }
    }
}
