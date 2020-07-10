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
public class TestReomveElement {
	@Test
	public void testRemoveGivenElementFromArray() {
		assertEquals(2, RemoveElement.removeGivenElementFromArray(new int[] {3,2,2,3}, 3));
		assertEquals(0, RemoveElement.removeGivenElementFromArray(new int[] {2,2}, 2));
		assertEquals(2, RemoveElement.removeGivenElementFromArray(new int[] {2,2}, 1));
		assertEquals(5, RemoveElement.removeGivenElementFromArray(new int[] {0,1,2,2,3,0,4,2}, 2));
	}
}
