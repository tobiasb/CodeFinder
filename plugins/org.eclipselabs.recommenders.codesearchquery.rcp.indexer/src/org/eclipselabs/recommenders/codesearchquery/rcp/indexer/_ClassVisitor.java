package org.eclipselabs.recommenders.codesearchquery.rcp.indexer;

import java.util.Set;

import org.apache.lucene.document.Document;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.internal.corext.dom.Bindings;
import org.eclipse.recommenders.rcp.utils.ast.BindingUtils;
import org.eclipse.recommenders.utils.names.IMethodName;
import org.eclipse.recommenders.utils.names.ITypeName;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.Fields;
import org.eclipselabs.recommenders.codesearchquery.rcp.indexer.lucene.LuceneIndex;

import com.google.common.collect.Sets;

public class _ClassVisitor extends _IndexingASTVisitor {

	private Set<ITypeName> extendedTypes = Sets.newHashSet();
	private Set<ITypeName> implementedTypes = Sets.newHashSet();
	private Set<IMethodName> methods = Sets.newHashSet();
	private Set<IMethodName> overriddenMethods = Sets.newHashSet();
	private Set<ITypeName> fieldTypes = Sets.newHashSet();

	public _ClassVisitor(LuceneIndex index, TypeDeclaration type) {
		super(index);

		ITypeBinding typeBinding = type.resolveBinding();
		final ITypeName className = BindingUtils.toTypeName(typeBinding);

		setId(className.getIdentifier());
		setName(className.getClassName());

        debugOut("", "");

		setSuperclassNames(type);
		setInterfaceNames(type);
	}
	
	@Override
	public boolean visit(MethodDeclaration node) {
		IMethodBinding b = node.resolveBinding();
		final IMethodName method = BindingUtils.toMethodName(b);

		methods.add(method);
		setOverriddenIMethodName(b);

		_MethodVisitor v = new _MethodVisitor(getIndex(), node);
		v.index(node);

		return false;
	}

	@Override
	public boolean visit(final FieldDeclaration node) {
		final Type fieldType = node.getType();
		addField(fieldType);
		return true;
	}
    
    private void setSuperclassNames(final TypeDeclaration node) {
        final ITypeBinding clazz = node.resolveBinding();
        ITypeBinding superclass = clazz.getSuperclass();
        // add superclass, if not null and not Object
        for (; superclass != null; superclass = superclass.getSuperclass()) {
            final ITypeName superclassName = BindingUtils
                    .toTypeName(superclass);
            if (!isPrimitiveOrArrayOrNullOrObjectOrString(superclassName)) {
                extendedTypes.add(superclassName);
                debugOut("extends type [" + superclassName + "]", node.getClass().toString());
            }
        }
    }

    private void setInterfaceNames(final TypeDeclaration node) {
        for (final ITypeBinding interface_ : node.resolveBinding()
                .getInterfaces()) {
            final ITypeName interfaceName = BindingUtils.toTypeName(interface_);
            if (!isPrimitiveOrArrayOrNullOrObjectOrString(interfaceName)) {
                implementedTypes.add(interfaceName);
                debugOut("implements type [" + interfaceName + "]", node.getClass().toString());
            }
        }
    }

	private void setOverriddenIMethodName(final IMethodBinding b) {
		final IMethodBinding overriddenBinding = Bindings.findOverriddenMethod(b, true);
		final IMethodName overriddenIMethodName = BindingUtils
				.toMethodName(overriddenBinding);
		if (overriddenIMethodName != null) {
			overriddenMethods.add(overriddenIMethodName);
			debugOut("overrides method [" + overriddenIMethodName + "]", Fields.OVERRIDDEN_METHODS);
		}
	}

	private void addField(final Type fieldType) {
		final ITypeBinding fieldTypeBinding = fieldType.resolveBinding();
		final ITypeName ITypeName = BindingUtils.toTypeName(fieldTypeBinding);
		if (!isPrimitiveOrArrayOrNullOrObjectOrString(ITypeName)) {
			fieldTypes.add(ITypeName);
            debugOut("uses type [" + ITypeName + "]", Fields.USED_TYPES);
		}
	}

	@Override
	public String getDocumentType() {
		return "class";
	}

	@Override
	protected void populateDocument(Document d) {
	    addToDocument(d, Fields.EXTENDED_TYPE, joiner.join(getNames(extendedTypes)));
        addToDocument(d, Fields.IMPLEMENTED_TYPES, joiner.join(getNames(implementedTypes)));
        addToDocument(d, Fields.DECLARED_METHODS, joiner.join(getNames(methods)));
        addToDocument(d, Fields.OVERRIDDEN_METHODS, joiner.join(getNames(overriddenMethods)));
        addToDocument(d, Fields.USED_TYPES, joiner.join(getNames(fieldTypes)));
	}
}
