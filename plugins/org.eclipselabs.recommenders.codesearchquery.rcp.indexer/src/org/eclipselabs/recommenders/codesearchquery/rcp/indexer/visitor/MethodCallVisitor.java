package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;

public class MethodCallVisitor extends ASTVisitor {
    @Override
    public boolean visit(final MethodInvocation node) {
        final IMethodBinding b = node.resolveMethodBinding();
        handleMethodCall(b);
        return true;
    }

    @Override
    public boolean visit(final ClassInstanceCreation node) {
        final IMethodBinding b = node.resolveConstructorBinding();
        handleMethodCall(b);
        return true;
    }

    @Override
    public boolean visit(final SuperConstructorInvocation node) {
        final IMethodBinding b = node.resolveConstructorBinding();
        handleMethodCall(b);
        return true;
    }

    @Override
    public boolean visit(final ConstructorInvocation node) {
        final IMethodBinding b = node.resolveConstructorBinding();
        handleMethodCall(b);
        return true;
    }

    @Override
    public boolean visit(final SuperMethodInvocation node) {
        final IMethodBinding b = node.resolveMethodBinding();
        handleMethodCall(b);
        return true;
    }
    
    protected void handleMethodCall(IMethodBinding methodBinding) {
        //Let callers overwrite and handle methodBinding
    }
}
