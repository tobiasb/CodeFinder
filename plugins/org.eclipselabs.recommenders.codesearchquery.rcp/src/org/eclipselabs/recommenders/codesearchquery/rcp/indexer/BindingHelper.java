package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.IName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

public final class BindingHelper {
    public static String getIdentifier(final MethodDeclaration node) {

        final IMethodBinding b = node.resolveBinding();
        final IMethodName method = BindingUtils.toMethodName(b);

        return getIdentifier(method);
    }

    public static String getIdentifier(final FieldDeclaration node) {

        final ITypeBinding b = node.getType().resolveBinding();
        final ITypeName type = BindingUtils.toTypeName(b);

        return getIdentifier(type);
    }

    public static String getIdentifier(final TypeDeclaration node) {

        final ITypeBinding b = node.resolveBinding();
        final ITypeName type = BindingUtils.toTypeName(b);

        return getIdentifier(type);
    }

    public static String getIdentifier(final VariableDeclarationStatement node) {

        final ITypeBinding b = node.getType().resolveBinding();
        final ITypeName type = BindingUtils.toTypeName(b);

        return getIdentifier(type);
    }

    public static String getIdentifier(final IName name) {
        return name != null ? name.getIdentifier() : null;
    }
}
