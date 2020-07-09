/**
 * 
 */
package com.jaiworld.exercise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestPalindromeInteger {
	
	@Test	
	public void testIsPalindromeInteger() {		
		assertTrue(PalindromeInteger.isPalindromeInteger(121));
		assertFalse(PalindromeInteger.isPalindromeInteger(-121));
		assertFalse(PalindromeInteger.isPalindromeInteger(10));
	}

}
