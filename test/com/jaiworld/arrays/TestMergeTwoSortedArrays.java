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
public class TestMergeTwoSortedArrays {

	@Test
	public void testMerge() {
		assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 },
				MergeTwoSortedArrays.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3));
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 },
				MergeTwoSortedArrays.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 4, 5, 6 }, 3));
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 },
				MergeTwoSortedArrays.merge(new int[] { 4, 5, 6, 0, 0, 0 }, 3, new int[] { 1, 2, 3 }, 3));

	}

}
