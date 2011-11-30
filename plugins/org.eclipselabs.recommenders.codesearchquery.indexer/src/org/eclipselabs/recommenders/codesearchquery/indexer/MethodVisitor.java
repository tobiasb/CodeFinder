package org.eclipselabs.recommenders.codesearchquery.indexer;

import java.util.Set;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;
import org.eclipselabs.recommenders.codesearchquery.indexer.lucene.LuceneIndex;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;

import com.google.common.collect.Sets;

public class MethodVisitor extends IndexingASTVisitor {

	private Set<IMethodName> calledMethods = Sets.newHashSet();
	private Set<ITypeName> usedTypes = Sets.newHashSet();

	public MethodVisitor(LuceneIndex index, MethodDeclaration method) {
		super(index);

		IMethodBinding b = method.resolveBinding();
		final IMethodName methodName = BindingUtils.toMethodName(b);

		setName(methodName.getIdentifier());
		addMethodParametersToUses(methodName);
		addMethodReturnTypeToUses(methodName);
	}

	@Override
	public boolean visit(final MethodInvocation node) {
		final IMethodBinding b = node.resolveMethodBinding();
		addUsedMethod(b);
		return true;
	}

	@Override
	public boolean visit(final ClassInstanceCreation node) {
		final IMethodBinding b = node.resolveConstructorBinding();
		addUsedMethod(b);
		return true;
	}

	@Override
	public boolean visit(final SuperConstructorInvocation node) {
		final IMethodBinding b = node.resolveConstructorBinding();
		addUsedMethod(b);
		return true;
	}

	@Override
	public boolean visit(final ConstructorInvocation node) {
		final IMethodBinding b = node.resolveConstructorBinding();
		addUsedMethod(b);
		return true;
	}

	@Override
	public boolean visit(final SuperMethodInvocation node) {
		final IMethodBinding b = node.resolveMethodBinding();
		addUsedMethod(b);
		return true;
	}

	@Override
	public boolean visit(final SimpleType node) {
		final ITypeBinding b = node.resolveBinding();
		addUsedType(b);

		return true;
	}

	@Override
	public boolean visit(final QualifiedType node) {
		final ITypeBinding b = node.resolveBinding();
		addUsedType(b);

		return true;
	}

	@Override
	public boolean visit(final SimpleName node) {
		final IBinding b = node.resolveBinding();
		if (b instanceof ITypeBinding) {
			addUsedType((ITypeBinding) b);
		} else if (b instanceof IVariableBinding) {
			final IVariableBinding var = (IVariableBinding) b;
			addUsedType(var.getType());
		} else if (b instanceof IMethodBinding) {
			// covered by several other visit methods: constructor calls, super
			// invocations, method invocation and class
			// instance creation
			// addUsedMethod((IMethodBinding) b);
		} else {
			System.out.println("debug other type: "
					+ (b == null ? null : b.getClass()));
		}
		return true;
	}

	private void addUsedType(final ITypeBinding b) {
		System.out.println("Used: " + b.getName());
		final ITypeName type = BindingUtils.toTypeName(b);
		if (type != null && !isPrimitiveOrArrayOrNullOrObjectOrString(type)) {
			usedTypes.add(type);
		}
	}

	private void addUsedMethod(final IMethodBinding b) {

		System.out.println("Invocation: " + b.getName());
		final IMethodName method = BindingUtils.toMethodName(b);
		if (method != null) {
			calledMethods.add(method);
		}
	}

	private void addMethodParametersToUses(final IMethodName IMethodName) {
		for (final ITypeName param : IMethodName.getParameterTypes()) {
			if (!isPrimitiveOrArrayOrNullOrObjectOrString(param)) {
				usedTypes.add(param);
			}
		}
	}

	private void addMethodReturnTypeToUses(final IMethodName IMethodName) {
		final ITypeName returnType = IMethodName.getReturnType();
		if (!isPrimitiveOrArrayOrNullOrObjectOrString(returnType)) {
			usedTypes.add(returnType);
		}
	}

	@Override
	public String getDocumentType() {
		return "method";
	}

	@Override
	protected void populateDocument(Document d) {
		d.add(new Field("called methods", joiner.join(getNames(calledMethods)),
				Field.Store.YES, Field.Index.ANALYZED));

		d.add(new Field("used types", joiner.join(getNames(usedTypes)),
				Field.Store.YES, Field.Index.ANALYZED));
	}
}
