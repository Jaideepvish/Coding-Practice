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
public class TestMissingNumber {

	@Test
	public void testMissingNumber() {
		assertEquals(1, MissingNumber.missingNumber(new int[] {0}));
		assertEquals(2, MissingNumber.missingNumber(new int[] {3,0,1}));
		assertEquals(8, MissingNumber.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
		assertEquals(0, MissingNumber.missingNumber(new int[] {1}));
	}
}
