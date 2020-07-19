/**
 * 
 */
package com.jaiworld.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestSingleNumber {
	
	@Test
	public void testSingleNumber() {
		assertEquals(1, SingleNumber.singleNumber(new int[] {2,2,1}));
		assertEquals(4, SingleNumber.singleNumber(new int[] {4,1,2,1,2}));
		assertEquals(2, SingleNumber.singleNumber(new int[] {2}));
	}
}
