package my.collections;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


public class OnTest {

	@Test
	public void shouldExecuteClosuerOnAllItems() throws Exception {
		Counter counter = new Counter();
		On.items("one", "two").apply(counter);
		assertEquals(2, counter.timesInvoked);
	}
	
	@Test
	public void shouldExecuteClosureOnCollection() throws Exception {
		Counter counter = new Counter();
		On.items(Arrays.asList("one", "two", "three")).apply(counter);
		assertEquals(3, counter.timesInvoked);
	}
	
	@Test
	public void shouldCollectItemsSatisfyingPredicate() throws Exception {
		BeingTrue beingTrue = new BeingTrue();
		assertEquals(Arrays.asList("true"), On.items("true", "false").collect(beingTrue));
	}
}
