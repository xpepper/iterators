package my.collections;

import java.util.Arrays;
import java.util.Collection;

public class On {

	@SuppressWarnings("unchecked")
	public static InternalIterator items(Collection aCollection) {
		return new InternalIterator(aCollection);
	}
	
	public static InternalIterator items(Object... items) {
		return new InternalIterator(Arrays.asList(items));
	}

}
