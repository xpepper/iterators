package my.collections;

import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.functors.AndPredicate;
import org.apache.commons.collections.functors.OrPredicate;

public abstract class AbstractPredicate implements Predicate {

	public Predicate and(Predicate anotherPredicate)
	{
		return new AndPredicate(this, anotherPredicate);
	}

	public Predicate or(Predicate anotherPredicate)
	{
		return new OrPredicate(this, anotherPredicate);
	}

}
