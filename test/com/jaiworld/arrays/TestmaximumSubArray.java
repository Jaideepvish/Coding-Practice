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
public class TestmaximumSubArray {
	
	@Test
	public void testMaxSubArray() {
		assertEquals(6, MaximumSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		assertEquals(-1, MaximumSubArray.maxSubArray(new int[] {-2,-1,-3,-4,-5,-6}));
		assertEquals(Integer.MIN_VALUE, MaximumSubArray.maxSubArray(new int[0]));
		assertEquals(21, MaximumSubArray.maxSubArray(new int[] {1,2,3,4,5,6}));
		assertEquals(1, MaximumSubArray.maxSubArray(new int[] {1}));
	}
}
