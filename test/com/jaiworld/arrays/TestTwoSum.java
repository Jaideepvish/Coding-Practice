/**
 * 
 */
package com.jaiworld.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author jaideepvish 
 * 		
 */
public class TestTwoSum {
	@Test
	public void testTwoSum() {
		assertArrayEquals(new int[] { 0, 1 }, TwoSum.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		assertArrayEquals(new int[] { 0, 2 }, TwoSum.twoSum(new int[] { 0, 7, 0, 15 }, 0));
		assertArrayEquals(new int[] { 0, 3 }, TwoSum.twoSum(new int[] { 3, 7, 6, -3 }, 0));
	}
}
