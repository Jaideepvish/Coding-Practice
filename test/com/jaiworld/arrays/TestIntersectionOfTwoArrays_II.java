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
public class TestIntersectionOfTwoArrays_II {
	
	
	@Test
	public void testIntersect() {
		assertArrayEquals(new int[] {2,2}, IntersectionOfTwoArrays_II.intersect(new int[] {1,2,2,1}, new int[] {2,2}));
		assertArrayEquals(new int[] {9,4}, IntersectionOfTwoArrays_II.intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
		assertArrayEquals(new int[] {}, IntersectionOfTwoArrays_II.intersect(new int[] {1,1,1}, new int[] {9,4,9,8,4}));
		assertArrayEquals(new int[] {1}, IntersectionOfTwoArrays_II.intersect(new int[] {1}, new int[] {1}));
		assertArrayEquals(new int[] {1}, IntersectionOfTwoArrays_II.intersect(new int[] {2,1}, new int[] {1,1}));
	}

}
