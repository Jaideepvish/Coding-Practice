/**
 * 
 */
package com.jaiworld.datastructures.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestSearchInsertionPosition {
	
	
	@Test
	public void testSearchPosition() {
		assertEquals(2, SearchInsertionPosition.searchInsert(new int[] {1,3,5,6}, 5));
		assertEquals(1, SearchInsertionPosition.searchInsert(new int[] {1,3,5,6}, 2));
		assertEquals(4, SearchInsertionPosition.searchInsert(new int[] {1,3,5,6}, 7));
		assertEquals(0, SearchInsertionPosition.searchInsert(new int[] {1,3,5,6}, 0));
		assertEquals(1, SearchInsertionPosition.searchInsert(new int[] {1}, 2));
		assertEquals(0, SearchInsertionPosition.searchInsert(new int[0], 2));
		assertEquals(1, SearchInsertionPosition.searchInsert(new int[] {1,3}, 2));
	}

}
