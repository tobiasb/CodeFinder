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
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredFieldNamesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredFieldTypesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredMethodNamesIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.DeclaredMethodsIndexer;
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
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IClassIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IFieldIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IMethodIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.ITryCatchBlockIndexer;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.interfaces.IVarUsageIndexer;

import com.google.common.collect.Lists;

public class CompilationUnitVisitor extends ASTVisitor {

    private CodeIndexerIndex index = null;
    private final List<IIndexer> indexer;

    public void addIndexer(final IIndexer indexer) {
        this.indexer.add(indexer);
    }

    public void addIndexer(final Collection<IIndexer> indexer) {
        this.indexer.addAll(indexer);
    }

    public CompilationUnitVisitor(final CodeIndexerIndex index) {
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

        return list;
    }

    @Override
    public boolean visit(final TypeDeclaration node) {
        final Document document = new Document();

        for (final IIndexer i : indexer) {
            if (i instanceof IClassIndexer) {
                ((IClassIndexer) i).index(document, node);
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
                ((IMethodIndexer) i).index(methodDocument, node);
            }
        }

        addDocument(methodDocument);

        final Document varUsageDocument = new Document();

        for (final IIndexer i : indexer) {
            if (i instanceof IVarUsageIndexer) {
                ((IVarUsageIndexer) i).index(methodDocument, node);
            }
        }

        addDocument(varUsageDocument);

        return true;
    }

    @Override
    public boolean visit(final FieldDeclaration node) {
        final Document document = new Document();

        for (final IIndexer i : indexer) {
            if (i instanceof IFieldIndexer) {
                ((IFieldIndexer) i).index(document, node);
            }
        }

        addDocument(document);
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
                    ((ITryCatchBlockIndexer) i).index(document, tryStatement, catchClause);
                }
            }
        }

        addDocument(document);
        return false;
    }

    private void addDocument(final Document document) {

        try {
            index.addDocument(document);
        } catch (final IOException e) {
            // XXX: Activator.logError(e);
        }
    }
}
