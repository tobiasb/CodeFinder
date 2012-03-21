package org.eclipse.recommenders.codesearch.rcp.index.termvector;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class FilteredJavaMethodProvider extends JavaMethodProvider {

    @Override
    public void load(final ITermVectorConsumable consumable, final Map<Integer, Object> argumentsMap) {
        final String prefix = (String) argumentsMap.get(0);

        final Set<String> result = Sets.newHashSet();

        for (String type : consumable.getTermVector(getFields())) {
            if (type.startsWith(prefix)) {
                result.add(type);
            }
        }

        setTermVector(Lists.newArrayList(result));
        setDone(true);
    }
}
