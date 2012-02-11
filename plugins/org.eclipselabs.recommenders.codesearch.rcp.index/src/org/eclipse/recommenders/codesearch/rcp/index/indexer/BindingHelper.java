package org.eclipse.recommenders.codesearch.rcp.index.indexer;

import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.of;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.IName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.utils.rcp.ast.BindingUtils;

import com.google.common.base.Optional;

//TODO XXX danger seeker: these methods all may return null!
public final class BindingHelper {

    public static Optional<String> getIdentifier(final MethodDeclaration node) {
        final IMethodBinding b = node.resolveBinding();
        return getIdentifier(b);
    }

    public static Optional<String> getIdentifier(final FieldDeclaration node) {
        final ITypeBinding b = node.getType().resolveBinding();
        return getIdentifier(b);
    }

    public static Optional<String> getIdentifier(final Optional<TypeDeclaration> node) {
        return getIdentifier(node.orNull());
    }

    public static Optional<String> getIdentifier(final Type node) {
        if (node == null) {
            return absent();
        }
        final ITypeBinding b = node.resolveBinding();
        return getIdentifier(b);
    }

    public static Optional<String> getIdentifier(final TypeDeclaration node) {
        if (node == null) {
            return absent();
        }
        final ITypeBinding b = node.resolveBinding();
        return getIdentifier(b);
    }

    public static Optional<String> getIdentifier(final VariableDeclarationStatement node) {
        final ITypeBinding b = node.getType().resolveBinding();
        return getIdentifier(b);
    }

    public static Optional<String> getIdentifier(final ITypeBinding b) {
        if (b == null) {
            return absent();
        }
        final Optional<ITypeName> opt = BindingUtils.toTypeName(b);
        if (!opt.isPresent()) {
            return absent();
        }
        return of(opt.get().getIdentifier());
    }

    public static Optional<String> getIdentifier(final IMethodBinding b) {
        if (b == null) {
            return absent();
        }
        final Optional<IMethodName> opt = BindingUtils.toMethodName(b);
        if (!opt.isPresent()) {
            return absent();
        }
        return of(opt.get().getIdentifier());
    }

    public static String getIdentifier(final IName name) {
        return name != null ? name.getIdentifier() : null;
    }

}
