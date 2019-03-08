package org.raychen518.study.junit4.examples.gettingstarted;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdderTest {

	@Test
	public void test_add() {
		Adder adder = new Adder();

		int result = adder.add(1, 2);

		assertEquals(3, result);
	}

}
