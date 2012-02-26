package my.collections;


public class GreaterThan extends AbstractPredicate {

	private final int amount;

	public GreaterThan(int amount) {
		this.amount = amount;
	}

	public boolean evaluate(Object obj) {
		return (Integer) (obj) > amount;
	}

}
