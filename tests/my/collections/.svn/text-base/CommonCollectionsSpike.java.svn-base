package my.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.AndPredicate;
import org.junit.Test;


public class CommonCollectionsSpike {
	
	@Test
	public void forEach() throws Exception {
		Counter counter = new Counter();
		CollectionUtils.forAllDo(Arrays.asList("one", "two", "three"), counter);
		assertEquals(3, counter.timesInvoked);
	}
	
	@Test
	public void collectAndReject() throws Exception {
		BeingTrue beingTrue = new BeingTrue();
		assertEquals(Arrays.asList("true"), CollectionUtils.select(Arrays.asList("false", "true"), beingTrue));
		assertEquals(Arrays.asList("false"), CollectionUtils.selectRejected(Arrays.asList("false", "true"), beingTrue));
	}
	
	@Test
	public void transform() throws Exception {
		Transformer transformer = new ToInteger();
		assertEquals(Arrays.asList(1, 2), CollectionUtils.collect(Arrays.asList("1", "2"), transformer));
	}
	
	@Test
	public void combinePredicates() throws Exception {
		GreaterThan greaterThanFive = new GreaterThan(5);
		BeingOdd beingOdd = new BeingOdd();
		
		//guards
		assertTrue(greaterThanFive.evaluate(7));
		assertTrue(beingOdd.evaluate(7));
		assertFalse(greaterThanFive.evaluate(2));
		assertFalse(beingOdd.evaluate(2));
		assertFalse(greaterThanFive.evaluate(3));
		assertTrue(beingOdd.evaluate(3));
		
		assertEquals(Arrays.asList(7), CollectionUtils.select(
				Arrays.asList(2, 7, 3), 
				new AndPredicate(greaterThanFive, beingOdd)
		));
	}
}
