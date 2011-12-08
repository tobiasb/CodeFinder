package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.util.Set;

import org.apache.lucene.document.Document;
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
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex;

import com.google.common.collect.Sets;

public class _MethodVisitor extends _IndexingASTVisitor { 

	private Set<IMethodName> calledMethods = Sets.newHashSet();
	private Set<ITypeName> usedTypes = Sets.newHashSet();
    private Set<ITypeName> parameterTypes = Sets.newHashSet();
    private ITypeName returnType = null;

	public _MethodVisitor(LuceneIndex index, MethodDeclaration method) {
		super(index);

		IMethodBinding b = method.resolveBinding();
		final IMethodName methodName = BindingUtils.toMethodName(b);

		setId(methodName.getIdentifier());
		setName(methodName.getName());

        debugOut("", "");
		
		addMethodParametersToUses(methodName, Fields.PARAMETER_TYPES);
		addMethodReturnTypeToUses(methodName, Fields.RETURN_TYPE);
	}
 
	@Override
	public boolean visit(final MethodInvocation node) {
		final IMethodBinding b = node.resolveMethodBinding();
		addUsedMethod(b, node.getClass().toString());
		return true;
	}

	@Override
	public boolean visit(final ClassInstanceCreation node) {
		final IMethodBinding b = node.resolveConstructorBinding();
		addUsedMethod(b, node.getClass().toString());
		return true;
	}

	@Override
	public boolean visit(final SuperConstructorInvocation node) {
		final IMethodBinding b = node.resolveConstructorBinding();
		addUsedMethod(b, node.getClass().toString());
		return true;
	}

	@Override
	public boolean visit(final ConstructorInvocation node) {
		final IMethodBinding b = node.resolveConstructorBinding();
		addUsedMethod(b, node.getClass().toString());
		return true;
	}

	@Override
	public boolean visit(final SuperMethodInvocation node) {
		final IMethodBinding b = node.resolveMethodBinding();
		addUsedMethod(b, node.getClass().toString());
		return true;
	}

	@Override
	public boolean visit(final SimpleType node) {
		final ITypeBinding b = node.resolveBinding();
		addUsedType(b, node.getClass().toString());

		return true;
	}

	@Override
	public boolean visit(final QualifiedType node) {
		final ITypeBinding b = node.resolveBinding();
		addUsedType(b, node.getClass().toString());

		return true;
	}

	@Override
	public boolean visit(final SimpleName node) {
		final IBinding b = node.resolveBinding();
		if (b instanceof ITypeBinding) {
			addUsedType((ITypeBinding) b, node.getClass().toString());
		} else if (b instanceof IVariableBinding) {
			final IVariableBinding var = (IVariableBinding) b;
			addUsedType(var.getType(), node.getClass().toString());
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

	private void addUsedType(final ITypeBinding b, final String origin) {
		final ITypeName type = BindingUtils.toTypeName(b);
		if (type != null && !isPrimitiveOrArrayOrNullOrObjectOrString(type)) {
		    addUsedType(type, origin);
		}
	}

	private void addUsedMethod(final IMethodBinding b, String origin) {
		final IMethodName method = BindingUtils.toMethodName(b);
		if (method != null) {
		    addUsedMethod(method, origin);
		}
	}

	private void addMethodParametersToUses(final IMethodName IMethodName, final String origin) {
		for (final ITypeName param : IMethodName.getParameterTypes()) {
			if (!isPrimitiveOrArrayOrNullOrObjectOrString(param)) {
				addUsedType(param, origin);
				parameterTypes.add(param);
			}
		}
	}

	private void addMethodReturnTypeToUses(final IMethodName IMethodName, final String origin) {
		final ITypeName type = IMethodName.getReturnType();
		if (!isPrimitiveOrArrayOrNullOrObjectOrString(type)) {
			addUsedType(type, origin);
			returnType = type;
		}
	}
	
	private void addUsedMethod(IMethodName method, String origin) {
        calledMethods.add(method);
        debugOut("uses method [" + method + "]", origin);
	}
	
	private void addUsedType(ITypeName type, String origin) {
	    usedTypes.add(type);
        debugOut("uses type [" + type + "]", origin);
	}

	@Override
	public String getDocumentType() {
		return "method";
	}

	@Override
	protected void populateDocument(Document d) {
        addToDocument(d, Fields.CALLED_METHODS, getNames(calledMethods));
        addToDocument(d, Fields.USED_TYPES, getNames(usedTypes));
        addToDocument(d, Fields.PARAMETER_TYPES, getNames(parameterTypes));
        addToDocument(d, Fields.RETURN_TYPE, getName(returnType));
	}
}
