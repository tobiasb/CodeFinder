package org.eclipse.recommenders.codesearch.rcp.index.termvector;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class FilteredJavaMethodProvider extends JavaMethodProvider {

    @Override
    public void load(final ITermVectorConsumable consumable, final Map<Integer, Object> argumentsMap) {
        String prefix = (String) argumentsMap.get(0);
        prefix = prefix.toLowerCase();

        final Set<String> result = Sets.newHashSet();
        final Set<String> allItems = consumable.getTermVector(getFields());

        for (String type : allItems) {
            if (type.startsWith(prefix)) {
                result.add(type);
            } else {
                String pattern = prefix.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".\\*") + ".*";

                if (type.matches(pattern))
                    result.add(type);
            }
        }

        setTermVector(Lists.newArrayList(result));
        setDone(true);
    }
}
