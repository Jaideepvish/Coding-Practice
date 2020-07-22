/**
 * 
 */
package com.jaiworld.arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestContainsDuplicate {
	
	@Test
	public void testContainsDuplicate() {
		assertTrue(ContainsDuplicate.containsDuplicate(new int[] {1,2,3,1}));
		assertFalse(ContainsDuplicate.containsDuplicate(new int[] {1,2,3,0}));
	}

}
