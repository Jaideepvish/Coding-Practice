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
public class TestPlusOne {
	
	@Test
	public void testPlusOne() {
		assertArrayEquals(new int[]{1,0},PlusOne.plusOne(new int[] {9}));
		assertArrayEquals(new int[]{1,2,4},PlusOne.plusOne(new int[] {1,2,3}));
	}

}
