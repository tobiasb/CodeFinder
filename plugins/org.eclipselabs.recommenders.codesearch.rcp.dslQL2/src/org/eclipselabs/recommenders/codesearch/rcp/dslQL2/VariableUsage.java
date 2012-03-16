package org.eclipselabs.recommenders.codesearch.rcp.dslQL2;

import java.util.List;

import com.google.common.collect.Lists;

public class VariableUsage {
    public String origin;
    public String name;
    public String type;

    public List<String> calledMethodsOnVariable = Lists.newArrayList();
    public List<VariableParameterUsage> parameterUsages = Lists.newArrayList();

    public VariableUsage(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VariableUsage other = (VariableUsage) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public class VariableParameterUsage {
        public VariableUsage targetVariable;
        public String targetType;
        public String method;
    }
}
