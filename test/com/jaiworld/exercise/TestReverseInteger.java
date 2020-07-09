/**
 * 
 */
package com.jaiworld.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestReverseInteger {
	@Test
	public void test() {
		assertEquals(321, ReverseInteger.reverse(123));
		assertEquals(-321, ReverseInteger.reverse(-123));
		assertEquals(21, ReverseInteger.reverse(120));
		assertEquals(0, ReverseInteger.reverse(Integer.MIN_VALUE));
		assertEquals(0, ReverseInteger.reverse(Integer.MAX_VALUE));
	}
}
