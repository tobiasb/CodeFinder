package org.eclipse.recommenders.codesearch.rcp.index.extdoc;

import static java.lang.String.format;
import static org.eclipse.recommenders.extdoc.rcp.providers.ExtdocProvider.Status.NOT_AVAILABLE;
import static org.eclipse.recommenders.extdoc.rcp.providers.ExtdocProvider.Status.OK;
import static org.eclipse.recommenders.utils.Checks.cast;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.TermQuery;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.internal.corext.dom.LinkedNodeFinder;
import org.eclipse.jdt.internal.corext.refactoring.structure.ASTNodeSearchUtil;
import org.eclipse.jdt.ui.SharedASTProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.BindingHelper;
import org.eclipse.recommenders.codesearch.rcp.index.indexer.CodeIndexerIndex;
import org.eclipse.recommenders.codesearch.rcp.index.searcher.CodeSearcherIndex;
import org.eclipse.recommenders.extdoc.rcp.providers.ExtdocProvider;
import org.eclipse.recommenders.extdoc.rcp.providers.JavaSelectionSubscriber;
import org.eclipse.recommenders.internal.extdoc.rcp.ui.SourceCodeArea;
import org.eclipse.recommenders.rcp.events.JavaSelectionEvent;
import org.eclipse.recommenders.utils.IOUtils;
import org.eclipse.recommenders.utils.Names;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.VmMethodName;
import org.eclipse.recommenders.utils.rcp.JavaElementResolver;
import org.eclipse.recommenders.utils.rcp.JdtUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import com.google.common.base.Optional;
import com.google.common.base.Stopwatch;

@SuppressWarnings("restriction")
public class LocalExamplesProvider extends ExtdocProvider {

    private final JavaElementResolver jdtResolver;
    private final CodeSearcherIndex searcher;
    private Stopwatch watch;
    private ILocalVariable var;
    private JavaSelectionEvent event;
    private CompilationUnit cu;
    private MethodDeclaration method;
    private String varType;
    private SimpleName varNode;

    @Inject
    public LocalExamplesProvider(final CodeIndexerIndex index, final JavaElementResolver jdtResolver)
            throws IOException {
        this.searcher = new CodeSearcherIndex(index.getIndex());
        this.jdtResolver = jdtResolver;
    }

    @JavaSelectionSubscriber
    public Status onVariableSelection(final ILocalVariable var, final JavaSelectionEvent event, final Composite parent)
            throws IOException, JavaModelException {
        this.var = var;
        this.event = event;

        startMeasurement();
        if (!findVariableNode()) {
            return NOT_AVAILABLE;
        }
        if (!findCompilationUnit()) {
            return NOT_AVAILABLE;
        }
        if (!findEnclosingMethod()) {
            return NOT_AVAILABLE;
        }
        if (!findVariableType()) {
            return NOT_AVAILABLE;
        }

        final BooleanQuery query = createQuery();
        final List<Document> docs = searcher.search(query);
        stopMeasurement();

        runSyncInUiThread(new Renderer(docs, parent, varType, var, watch.toString()));
        return OK;
    }

    private boolean findVariableNode() {
        final Optional<ASTNode> astNode = event.getSelectedNode();
        if (!astNode.isPresent()) {
            return false;
        }
        final ASTNode node = astNode.get();
        if (node.getNodeType() == ASTNode.SIMPLE_NAME) {
            varNode = (SimpleName) node;
        }
        return varNode != null;
    }

    private boolean findVariableType() {
        final Optional<IType> opt = JdtUtils.findTypeFromSignature(var.getTypeSignature(), var);
        if (!opt.isPresent()) {
            return false;
        }
        varType = jdtResolver.toRecType(opt.get()).getIdentifier();
        return varType != null;
    }

    private boolean findCompilationUnit() {
        final ASTNode root = varNode.getRoot();
        if (root instanceof CompilationUnit) {
            cu = cast(root);
            return true;
        }
        return false;
    }

    private boolean findEnclosingMethod() throws JavaModelException {
        final IMethod jdtMethod = cast(var.getDeclaringMember());
        method = ASTNodeSearchUtil.getMethodDeclarationNode(jdtMethod, cu);
        return method != null;

    }

    private BooleanQuery createQuery() {
        final BooleanQuery query = new BooleanQuery();
        final Term typeTerm = new Term(Fields.VARIABLE_TYPE, varType);
        final TermQuery typeQuery = new TermQuery(typeTerm);
        query.add(typeQuery, Occur.MUST);

        for (final SimpleName use : LinkedNodeFinder.findByNode(cu, varNode)) {

            final ASTNode astParent = use.getParent();
            Term term = null;
            switch (astParent.getNodeType()) {
            case ASTNode.METHOD_INVOCATION:
                final MethodInvocation targetMethod = (MethodInvocation) astParent;
                final IMethodBinding methodBinding = targetMethod.resolveMethodBinding();
                final Optional<String> optMethod = BindingHelper.getIdentifier(methodBinding);
                if (!optMethod.isPresent()) {
                    break;
                }
                if (isUsedInArguments(use, targetMethod)) {
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

                if (declParent.getInitializer() == null) {
                    term = new Term(Fields.VARIABLE_DEFINITION, Fields.DEFINITION_UNINITIALIZED);
                    break;
                } else {
                    switch (declParent.getInitializer().getNodeType()) {
                    case ASTNode.NULL_LITERAL:
                        term = new Term(Fields.VARIABLE_DEFINITION, Fields.DEFINITION_NULLLITERAL);
                        break;
                    case ASTNode.METHOD_INVOCATION:
                        term = new Term(Fields.VARIABLE_DEFINITION, Fields.DEFINITION_METHOD_INVOCATION);
                        break;
                    case ASTNode.CLASS_INSTANCE_CREATION:
                        term = new Term(Fields.VARIABLE_DEFINITION, Fields.DEFINITION_INSTANCE_CREATION);
                        break;
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

    private boolean isUsedInArguments(final SimpleName uses, final MethodInvocation targetMethod) {
        return targetMethod.arguments().size() == 0 || targetMethod.arguments().indexOf(uses) == -1;
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
                final ILocalVariable var, final String searchDuration) {
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
            final Table t = new Table(container, SWT.VIRTUAL);
            // t.setLinesVisible(true);

            t.setLayoutData(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 200).grab(true, false).create());
            // t.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, true, false));
            t.setItemCount(docs.size());

            // final TableColumn c = new TableColumn(t, SWT.NONE);
            // c.setResizable(true);
            // c.setWidth(400);

            t.addListener(SWT.MeasureItem, new Listener() {
                @Override
                public void handleEvent(final Event event) {
                    final TableItem item = (TableItem) event.item;
                    final SourceCodeArea area = (SourceCodeArea) item.getData();
                    final StyledText w = area.getTextWidget();

                    final String text = w.getText();
                    event.gc.setFont(w.getFont());

                    final int clientWidth = item.getParent().getClientArea().width;
                    event.gc.setFont(w.getFont());
                    event.height = event.gc.textExtent(text).y + 5;
                    event.width = clientWidth - 15;
                }
            });
            t.addListener(SWT.EraseItem, new Listener() {
                @Override
                public void handleEvent(final Event event) {
                    event.detail &= ~SWT.FOREGROUND;
                }
            });
            t.addListener(SWT.PaintItem, new Listener() {
                @Override
                public void handleEvent(final Event event) {
                    // final Rectangle bounds = event.getBounds();
                    // System.out.println(bounds);
                    // final TableItem item = (TableItem) event.item;
                    // event.gc.drawText(item.getText(0), 0, 0, true);

                    //
                    // System.out.println("item " + event);
                    //
                    // final Rectangle bounds2 = item.getBounds();
                    // System.out.println("item bounds" + bounds2);
                    // final SourceCodeArea data = (SourceCodeArea) item.getData();
                    // data.getTextWidget().redraw();
                    // final Point size = data.getTextWidget().getSize();
                    // event.gc.drawText(item.getText(0), size.x, size.y + 0, true);

                }
            });

            t.addListener(SWT.SetData, new Listener() {

                @Override
                public void handleEvent(final Event event) {
                    final TableItem item = (TableItem) event.item;
                    final SourceCodeArea area = new SourceCodeArea(t);
                    final TableEditor editor = new TableEditor(t);
                    editor.grabHorizontal = editor.grabVertical = true;
                    editor.setEditor(area.getTextWidget(), item, 0);
                    item.setData(area);

                    final int tableIndex = t.indexOf(item);
                    final Document doc = docs.get(tableIndex);
                    final IMethodName ctx = VmMethodName.get(doc.get(Fields.DECLARING_METHOD));
                    final Optional<IMethod> jdtMethod = jdtResolver.toJdtMethod(ctx);
                    if (!jdtMethod.isPresent()) {
                        area.setCode("// failed to resolve method " + Names.vm2srcQualifiedMethod(ctx));
                        return;
                    }
                    final IMethod m = jdtMethod.get();
                    final CompilationUnit ast = SharedASTProvider.getAST(m.getCompilationUnit(),
                            SharedASTProvider.WAIT_YES, null);
                    if (ast == null) {
                        area.setCode("// failed AST for " + m);
                        return;
                    }
                    try {
                        final String varName = doc.get(Fields.VARIABLE_NAME);

                        final MethodDeclaration node = ASTNodeSearchUtil.getMethodDeclarationNode(m, ast);
                        final SimpleName name = new Callable<SimpleName>() {
                            SimpleName res;

                            @Override
                            public SimpleName call() {
                                node.accept(new ASTVisitor() {
                                    @Override
                                    public boolean visit(final SimpleName node) {
                                        if (node.getIdentifier().equals(varName)) {
                                            res = node;
                                        }
                                        return false;
                                    };
                                });
                                return res;
                            };
                        }.call();
                        final SimpleName[] findByNode = LinkedNodeFinder.findByNode(node, name);
                        final StringBuffer text = new StringBuffer();
                        for (final SimpleName n : findByNode) {
                            final ASTNode sup = n.getParent();
                            switch (sup.getNodeType()) {
                            case ASTNode.CLASS_INSTANCE_CREATION:
                                final ASTNode supSup = sup.getParent();
                                switch (supSup.getNodeType()) {
                                case ASTNode.ASSIGNMENT:
                                    text.append(supSup.toString()).append(IOUtils.LINE_SEPARATOR);
                                    break;
                                case ASTNode.VARIABLE_DECLARATION_FRAGMENT:
                                    final ASTNode supSupSup = supSup.getParent();
                                    if (supSupSup instanceof VariableDeclarationStatement) {
                                        text.append(supSupSup.toString()).append(IOUtils.LINE_SEPARATOR);
                                    } else {
                                        text.append(supSup.toString()).append(IOUtils.LINE_SEPARATOR);
                                    }
                                }

                                break;
                            case ASTNode.METHOD_INVOCATION:
                            case ASTNode.SUPER_METHOD_INVOCATION:
                            case ASTNode.FIELD_ACCESS:
                            case ASTNode.SUPER_FIELD_ACCESS:
                            case ASTNode.CONSTRUCTOR_INVOCATION:
                            case ASTNode.SUPER_CONSTRUCTOR_INVOCATION:
                            case ASTNode.CAST_EXPRESSION:
                            case ASTNode.VARIABLE_DECLARATION_FRAGMENT:
                                text.append(sup.toString()).append(IOUtils.LINE_SEPARATOR);
                                break;
                            default:
                                break;
                            }
                        }
                        final String[] split = StringUtils.split(text.toString(), IOUtils.LINE_SEPARATOR);
                        final String simpleSummary = StringUtils.join(ArrayUtils.subarray(split, 0, 3),
                                IOUtils.LINE_SEPARATOR);
                        area.setCode(simpleSummary);

                    } catch (final Exception e) {
                        item.setText(ExceptionUtils.getMessage(e));
                    }
                }
            });
        }
    }
}
