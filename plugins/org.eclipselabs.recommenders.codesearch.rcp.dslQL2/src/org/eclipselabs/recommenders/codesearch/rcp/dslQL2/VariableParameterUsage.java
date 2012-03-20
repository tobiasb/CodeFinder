package org.eclipselabs.recommenders.codesearch.rcp.dslQL2;

public class VariableParameterUsage {
    public VariableUsage targetVariable;
    public String method;

    public VariableParameterUsage(VariableUsage targetVariable, String method) {
        this.targetVariable = targetVariable;
        this.method = method;
    }
}
