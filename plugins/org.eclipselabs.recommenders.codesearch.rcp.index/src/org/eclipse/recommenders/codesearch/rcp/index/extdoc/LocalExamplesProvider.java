package org.eclipse.recommenders.codesearch.rcp.index.extdoc;

import static java.lang.String.format;
import static org.eclipse.recommenders.codesearch.rcp.index.indexer.BindingHelper.getIdentifier;
import static org.eclipse.recommenders.extdoc.rcp.providers.ExtdocProvider.Status.NOT_AVAILABLE;
import static org.eclipse.recommenders.extdoc.rcp.providers.ExtdocProvider.Status.OK;
import static org.eclipse.recommenders.rcp.events.JavaSelectionEvent.JavaSelectionLocation.METHOD_BODY;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.TermQuery;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.internal.corext.dom.LinkedNodeFinder;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.BindingHelper;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcherIndex;
import org.eclipse.recommenders.extdoc.rcp.providers.ExtdocProvider;
import org.eclipse.recommenders.extdoc.rcp.providers.JavaSelectionSubscriber;
import org.eclipse.recommenders.rcp.RecommendersPlugin;
import org.eclipse.recommenders.rcp.events.JavaSelectionEvent;
import org.eclipse.recommenders.utils.Names;
import org.eclipse.recommenders.utils.names.VmMethodName;
import org.eclipse.recommenders.utils.rcp.JavaElementResolver;
import org.eclipse.recommenders.utils.rcp.JdtUtils;
import org.eclipse.recommenders.utils.rcp.RCPUtils;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.google.common.base.Optional;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public class LocalExamplesProvider extends ExtdocProvider {

    private final JavaElementResolver jdtResolver;
    private final CodeSearcherIndex searcher;
    private Stopwatch watch;
    private JavaSelectionEvent event;

    private MethodDeclaration enclosingMethod;
    private TypeDeclaration enclosingType;
    private SimpleName varNode;
    private String varType;

    private List<String> searchterms;
    private IType jdtVarType;

    @Inject
    public LocalExamplesProvider(final CodeIndexerIndex index, final JavaElementResolver jdtResolver)
            throws IOException {
        this.searcher = new CodeSearcherIndex(index.getIndex());
        this.jdtResolver = jdtResolver;
    }

    @JavaSelectionSubscriber(METHOD_BODY)
    public Status onFieldSelection(final IField var, final JavaSelectionEvent event, final Composite parent)
            throws IOException, JavaModelException {
        this.event = event;
        startMeasurement();
        if (!findAstNodes()) {
            return NOT_AVAILABLE;
        }

        if (!findVariableType(var.getTypeSignature())) {
            return NOT_AVAILABLE;
        }

        final BooleanQuery query = createQuery();
        final List<Document> docs = searcher.search(query);
        stopMeasurement();

        runSyncInUiThread(new Renderer(docs, parent, varType, watch.toString()));
        return OK;
    }

    @JavaSelectionSubscriber
    public Status onVariableSelection(final ILocalVariable var, final JavaSelectionEvent event, final Composite parent)
            throws IOException, JavaModelException {
        this.event = event;
        startMeasurement();
        if (!findAstNodes()) {
            return NOT_AVAILABLE;
        }

        if (!findVariableType(var.getTypeSignature())) {
            return NOT_AVAILABLE;
        }

        final BooleanQuery query = createQuery();
        final List<Document> docs = searcher.search(query);
        stopMeasurement();

        runSyncInUiThread(new Renderer(docs, parent, varType, watch.toString()));
        return OK;
    }

    private boolean findAstNodes() {
        final Optional<ASTNode> astNode = event.getSelectedNode();
        if (!astNode.isPresent()) {
            return false;
        }
        final ASTNode node = astNode.get();
        if (node.getNodeType() == ASTNode.SIMPLE_NAME) {
            varNode = (SimpleName) node;
        }

        for (ASTNode parent = varNode; parent != null; parent = parent.getParent()) {
            if (parent instanceof MethodDeclaration) {
                enclosingMethod = (MethodDeclaration) parent;
            } else if (parent instanceof TypeDeclaration) {
                enclosingType = (TypeDeclaration) parent;
                break;
            }
        }
        return varNode != null && enclosingMethod != null && enclosingType != null;
    }

    private boolean findVariableType(final String typeSignature) {
        final Optional<IMethod> method = BindingUtils.getMethod(enclosingMethod);
        if (!method.isPresent()) {
            return false;
        }

        final Optional<IType> opt = JdtUtils.findTypeFromSignature(typeSignature, method.get());
        if (!opt.isPresent()) {
            return false;
        }
        jdtVarType = opt.get();
        varType = jdtResolver.toRecType(opt.get()).getIdentifier();
        return varType != null;
    }

    private BooleanQuery createQuery() {
        final BooleanQuery query = new BooleanQuery();
        final Term typeTerm = new Term(Fields.VARIABLE_TYPE, varType);
        final TermQuery typeQuery = new TermQuery(typeTerm);
        query.add(typeQuery, Occur.MUST);
        searchterms = Lists.newArrayList();
        searchterms.add(varNode.getIdentifier());
        searchterms.add(jdtVarType.getElementName());

        for (final SimpleName use : LinkedNodeFinder.findByNode(enclosingMethod, varNode)) {

            final ASTNode astParent = use.getParent();
            Term term = null;
            switch (astParent.getNodeType()) {
            case ASTNode.CLASS_INSTANCE_CREATION: {
                final ClassInstanceCreation targetMethod = (ClassInstanceCreation) astParent;
                final IMethodBinding methodBinding = targetMethod.resolveConstructorBinding();
                final Optional<String> optMethod = BindingHelper.getIdentifier(methodBinding);
                if (!optMethod.isPresent()) {
                    break;
                }
                // matches more than the method itself, but that'S a minor thing
                searchterms.add(targetMethod.getType().toString());
                if (isUsedInArguments(use, targetMethod.arguments())) {
                    term = new Term(Fields.USED_AS_TAGET_FOR_METHODS, optMethod.get());
                } else {
                    term = new Term(Fields.USED_AS_TAGET_FOR_METHODS, optMethod.get());
                }
                break;
            }
            case ASTNode.METHOD_INVOCATION:
                final MethodInvocation targetMethod = (MethodInvocation) astParent;
                final IMethodBinding methodBinding = targetMethod.resolveMethodBinding();
                final Optional<String> optMethod = BindingHelper.getIdentifier(methodBinding);
                if (!optMethod.isPresent()) {
                    break;
                }
                searchterms.add(targetMethod.getName().toString());
                if (isUsedInArguments(use, targetMethod.arguments())) {
                    term = new Term(Fields.USED_AS_TAGET_FOR_METHODS, optMethod.get());
                } else {
                    term = new Term(Fields.USED_AS_TAGET_FOR_METHODS, optMethod.get());
                }
                break;
            case ASTNode.SINGLE_VARIABLE_DECLARATION:
                term = new Term(Fields.VARIABLE_DEFINITION, Fields.DEFINITION_PARAMETER);
                break;
            case ASTNode.VARIABLE_DECLARATION_FRAGMENT:
                final VariableDeclarationFragment declParent = (VariableDeclarationFragment) use.getParent();

                final Expression initializer = declParent.getInitializer();
                if (initializer == null) {
                    term = new Term(Fields.VARIABLE_DEFINITION, Fields.DEFINITION_UNINITIALIZED);
                    break;
                } else {
                    switch (initializer.getNodeType()) {
                    case ASTNode.NULL_LITERAL:
                        term = new Term(Fields.VARIABLE_DEFINITION, Fields.DEFINITION_NULLLITERAL);
                        break;
                    case ASTNode.SUPER_METHOD_INVOCATION:
                    case ASTNode.METHOD_INVOCATION:
                        term = new Term(Fields.VARIABLE_DEFINITION, Fields.DEFINITION_METHOD_INVOCATION);
                        break;
                    case ASTNode.CLASS_INSTANCE_CREATION:
                        term = new Term(Fields.VARIABLE_DEFINITION, Fields.DEFINITION_INSTANCE_CREATION);
                        break;
                    case ASTNode.CAST_EXPRESSION:
                        // look more deeply into this here:
                        final Expression expression = ((CastExpression) initializer).getExpression();
                        IMethodBinding definingMethodBining = null;
                        switch (expression.getNodeType()) {
                        case ASTNode.METHOD_INVOCATION:
                            definingMethodBining = ((MethodInvocation) expression).resolveMethodBinding();
                            break;
                        case ASTNode.SUPER_METHOD_INVOCATION:
                            definingMethodBining = ((SuperMethodInvocation) expression).resolveMethodBinding();
                            break;
                        }
                        final Optional<String> optDef = getIdentifier(definingMethodBining);
                        if (optDef.isPresent()) {
                            searchterms.add(definingMethodBining.getName().toString());
                            query.add(new TermQuery(new Term(Fields.VARIABLE_DEFINITION, optDef.get())), Occur.SHOULD);
                        }
                    }
                }
                break;
            default:
                break;
            }
            if (term != null) {
                query.add(new TermQuery(term), Occur.SHOULD);
            }
        }
        return query;
    }

    private boolean isUsedInArguments(final SimpleName uses, final List arguments) {
        return arguments.size() == 0 || arguments.indexOf(uses) == -1;
    }

    private void startMeasurement() {
        watch = new Stopwatch();
        watch.start();
    }

    private void stopMeasurement() {
        watch.stop();
    }

    private final class Renderer implements Runnable {
        private final List<Document> docs;
        private final Composite parent;
        private final String typeName;
        private final String searchDuration;

        private Renderer(final List<Document> docs, final Composite parent, final String typeName,
                final String searchDuration) {
            this.docs = docs;
            this.parent = parent;
            this.typeName = typeName;
            this.searchDuration = searchDuration;
        }

        @Override
        public void run() {
            final Composite container = new Composite(parent, SWT.NONE);
            container.setLayout(new GridLayout());
            container.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
            final Label l = new Label(container, SWT.NONE);
            final String msg = format("found %s examples for type '%s'. Search took %s.", docs.size(),
                    Names.vm2srcSimpleTypeName(typeName), searchDuration);
            l.setText(msg);

            final TableViewer v = new TableViewer(container, SWT.VIRTUAL);
            v.setLabelProvider(new LabelProvider(jdtResolver, searchterms));
            v.setContentProvider(new ArrayContentProvider());
            v.setUseHashlookup(true);
            v.setInput(docs);
            // v.getTable().setLinesVisible(true);
            v.setItemCount(docs.size());
            v.getControl().setLayoutData(GridDataFactory.fillDefaults().hint(300, 200).grab(true, false).create());
            v.addDoubleClickListener(new IDoubleClickListener() {

                @Override
                public void doubleClick(final DoubleClickEvent event) {
                    final Optional<Document> doc = RCPUtils.first(event.getSelection());
                    if (doc.isPresent()) {
                        final String string = doc.get().get(Fields.DECLARING_METHOD);
                        final VmMethodName recMethod = VmMethodName.get(string);
                        final Optional<IMethod> jdtMethod = jdtResolver.toJdtMethod(recMethod);
                        if (jdtMethod.isPresent()) {
                            try {
                                JavaUI.openInEditor(jdtMethod.get());
                            } catch (final Exception e) {
                                RecommendersPlugin.logError(e, "Failed to open method declaration in editor");
                            }
                        }
                    }

                }
            });
        }
    }
}
