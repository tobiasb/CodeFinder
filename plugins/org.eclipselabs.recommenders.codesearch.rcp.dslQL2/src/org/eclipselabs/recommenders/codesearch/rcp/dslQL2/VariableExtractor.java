/**
 * Copyright (c) 2010, 2012 Darmstadt University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Tobias Boehm - initial API and implementation.
 */

package org.eclipselabs.recommenders.codesearch.rcp.dslQL2;

import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.recommenders.codesearch.rcp.index.Fields;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.MethodCall;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Model;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.Statement;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.StaticMethodCall;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarAssignment;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclaration;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarDeclarationParam;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarInstanceCreation;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.VarNullLiteral;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.ModelImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.StatementImpl;
import org.eclipselabs.recommenders.codesearch.rcp.dslQL2.qL2.impl.VarDeclarationImpl;

import com.google.common.collect.Maps;

public class VariableExtractor {

    public Map<String, VariableUsage> getVars(EObject model) {
        Map<String, VariableUsage> result = getVariableDeclarations(model);

        if (model == null)
            return result;

        TreeIterator<EObject> iter = model.eAllContents();

        if (!iter.hasNext())
            return result;

        do {
            final EObject o = iter.next();

            if (o instanceof MethodCall) {
                MethodCall m = (MethodCall) o;

                if (m.getNameCallee() != null) {
                    VariableUsage vCallee = result.get(m.getNameCallee().getValue());

                    if (vCallee != null) {
                        vCallee.calledMethodsOnVariable.add(m.getMethod().getValue());
                    }

                    if (m.getNameCaller() != null) {
                        VariableUsage vCaller = result.get(m.getNameCaller().getValue());

                        if (vCaller != null) {
                            VariableParameterUsage parameterUsage = new VariableParameterUsage(vCallee, m.getMethod()
                                    .getValue());

                            vCaller.parameterUsages.add(parameterUsage);
                        }
                    }
                }
            } else if (o instanceof StaticMethodCall) {
                StaticMethodCall m = (StaticMethodCall) o;

                VariableUsage vCaller = result.get(m.getName().getValue());

                if (vCaller != null) {
                    VariableParameterUsage parameterUsage = new VariableParameterUsage(null, m.getMethod());

                    vCaller.parameterUsages.add(parameterUsage);
                }
            }

        } while (iter.hasNext());

        return result;
    }

    private Map<String, VariableUsage> getVariableDeclarations(EObject model) {
        Map<String, VariableUsage> result = Maps.newHashMap();

        if (model == null)
            return result;

        TreeIterator<EObject> iter = model.eAllContents();

        if (!iter.hasNext())
            return result;

        do {
            final EObject o = iter.next();

            if (o instanceof VarDeclaration) {
                VariableUsage v = getVarUsage((VarDeclaration) o);
                result.put(v.name, v);
            } else if (o instanceof VarAssignment) {
                VariableUsage v = getVarUsage((VarAssignment) o);
                result.put(v.name, v);
            } else if (o instanceof VarInstanceCreation) {
                VariableUsage v = getVarUsage((VarInstanceCreation) o);
                result.put(v.name, v);
            } else if (o instanceof VarDeclarationParam) {
                VariableUsage v = getVarUsage((VarDeclarationParam) o);
                result.put(v.name, v);
            } else if (o instanceof VarNullLiteral) {
                VariableUsage v = getVarUsage((VarNullLiteral) o);
                result.put(v.name, v);
            }

        } while (iter.hasNext());

        return result;
    }

    private VariableUsage getVarUsage(VarDeclaration o) {
        VariableUsage v = new VariableUsage(o.getName(), null);
        v.type = o.getType().getValue();
        
        if(o.eContainer() instanceof Statement){//isPartOfStatements((Model)o.eContainer(), o)) {
        	v.origin = Fields.DEFINITION_UNINITIALIZED;
        } else {
        	v.origin = "*"; //Defined outside statement block, so exact variable definition not essential
        }
        return v;
    }
    
//    private boolean isPartOfStatements(Model model, VarDeclaration var){
//    	
//    	if(model.getStatements() != null) {
//    		for(Statement stmt : model.getStatements()) {
//    	        TreeIterator<EObject> iter = stmt.eAllContents();
//    	        do {
//    	            final EObject o = iter.next();
//
//    	            if(o != null && o instanceof VarDeclarationImpl && o == var) {
//    	            	return true;
//    	            }
//    	            
//    	        } while (iter.hasNext());
//    		}
//    	}
//    	
//    	return false;
//    }

    private VariableUsage getVarUsage(VarAssignment o) {
        VariableUsage v = new VariableUsage(o.getName(), null);
        v.type = o.getType().getValue();
        v.origin = Fields.DEFINITION_ASSIGNMENT;
        return v;
    }

    private VariableUsage getVarUsage(VarInstanceCreation o) {
        VariableUsage v = new VariableUsage(o.getName(), null);
        v.type = o.getType().getValue();
        v.origin = Fields.DEFINITION_INSTANCE_CREATION;
        return v;
    }

    private VariableUsage getVarUsage(VarDeclarationParam o) {
        VariableUsage v = new VariableUsage(o.getName(), null);
        v.type = o.getType().getValue();
        v.origin = Fields.DEFINITION_PARAMETER;
        return v;
    }

    private VariableUsage getVarUsage(VarNullLiteral o) {
        VariableUsage v = new VariableUsage(o.getName(), null);
        v.type = o.getType().getValue();
        v.origin = Fields.DEFINITION_NULLLITERAL;
        return v;
    }
}
