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
public class TestThirdMaximumNumber {

	@Test
	public void testThirdMax() {
		assertEquals(1, ThirdMaximumNumber.thirdMax(new int[] { 3, 2, 1 }));
		assertEquals(4, ThirdMaximumNumber.thirdMax(new int[] { 4, 4, 2 }));
		assertEquals(1, ThirdMaximumNumber.thirdMax(new int[] { 2, 2, 3, 1 }));
		assertEquals(3, ThirdMaximumNumber.thirdMax(new int[] { 3 }));
		assertEquals(2, ThirdMaximumNumber.thirdMax(new int[] { 1,2 }));

	}

}
