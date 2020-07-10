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
public class TestRemoveDuplicatesFromArray {
	
	@Test
	public void testRemoveDuplicates() {
		assertEquals(2, RemoveDuplicatesFromArray.removeDuplicate(new int[] {1,2,2}));
		assertEquals(5, RemoveDuplicatesFromArray.removeDuplicate(new int[] {0,0,1,1,1,2,2,3,3,4}));
		assertEquals(1, RemoveDuplicatesFromArray.removeDuplicate(new int[] {0,0}));
		assertEquals(1, RemoveDuplicatesFromArray.removeDuplicate(new int[] {1}));
	}

}
