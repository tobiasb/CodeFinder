package org.eclipselabs.recommenders.codesearchquery.rcp.indexer.visitor;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;

public class TypeUseVisitor extends ASTVisitor {
    
    @Override
    public boolean visit(final SimpleType node) {
        final ITypeBinding b = node.resolveBinding();
        handleTypeUse(b);

        return true;
    }

    @Override
    public boolean visit(final QualifiedType node) {
        final ITypeBinding b = node.resolveBinding();
        handleTypeUse(b);

        return true;
    }

    @Override
    public boolean visit(final SimpleName node) {
        final IBinding b = node.resolveBinding();
        if (b instanceof ITypeBinding) {
            handleTypeUse((ITypeBinding)b);
        } else if (b instanceof IVariableBinding) {
            final IVariableBinding var = (IVariableBinding) b;
            handleTypeUse(var.getType());
        }
        
        return true;
    }

    @Override
    public boolean visit(final FieldDeclaration node) {
        final ITypeBinding fieldTypeBinding = node.getType().resolveBinding();
        handleTypeUse(fieldTypeBinding);
        return true;
    }
    
    @Override
    public boolean visit(final MethodInvocation node) {
        return false;
    }

    @Override
    public boolean visit(final ClassInstanceCreation node) {
        return false;
    }

    @Override
    public boolean visit(final SuperConstructorInvocation node) {
        return false;
    }

    @Override
    public boolean visit(final ConstructorInvocation node) {
        return false;
    }

    @Override
    public boolean visit(final SuperMethodInvocation node) {
        return false;
    }
    
    protected void handleTypeUse(ITypeBinding typeBinding) {
        //Let callers overwrite and handle typeBinding
    }
}
