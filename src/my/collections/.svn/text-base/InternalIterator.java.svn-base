package my.collections;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.collections.Closure;
import org.apache.commons.collections.Predicate;

public class InternalIterator {

	@SuppressWarnings("unchecked")
	private final Collection items;

	@SuppressWarnings("unchecked")
	public InternalIterator(Collection items) {
		this.items = items;
	}

	public void apply(Closure aClosure) {
		for (Object eachItem : items) {
			aClosure.execute(eachItem);
		}
	}

	@SuppressWarnings("unchecked")
	public Collection collect(Predicate aPredicate) {
		Collection result = new ArrayList();
		for (Object eachItem : items) {
			if(aPredicate.evaluate(eachItem)){
				result.add(eachItem);
			}
		}
		return result;
	}

}
