/**
 * 
 */
package my.collections;

import org.apache.commons.collections.Predicate;

public class BeingTrue implements Predicate {
	public boolean evaluate(Object obj) {
		return "true".equals(obj);
	}
}