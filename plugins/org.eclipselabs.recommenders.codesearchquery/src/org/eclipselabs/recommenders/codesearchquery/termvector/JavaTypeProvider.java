package org.eclipselabs.recommenders.codesearchquery.termvector;

import java.util.List;
import java.util.Set;

import org.eclipselabs.recommenders.codesearchquery.Fields;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class JavaTypeProvider extends AbstractTermVectorProvider implements ITermVectorProvider {

	@Override
	public List<String> getDisjunctTermVector() {
		return getTermVector();
	}

	@Override
	public void load(ITermVectorConsumable consumable) {
		final Set<String> result  = Sets.newHashSet();
		
		for(String fieldName : getFields()) {
			Set<String> types = consumable.getTermVector(fieldName);
			result.addAll(types);
		}

		setTermVector(Lists.newArrayList(result));
		setDone(true);
	}

	@Override
	public boolean doneLoading() {
		return isDone();
	}

	@Override
	protected String[] getFields() {
		return new String[] {
				Fields.USED_TYPES,
				Fields.ALL_EXTENDED_TYPES
				//...
		};
	}

}
