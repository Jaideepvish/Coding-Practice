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
public class TestValidParentheses {
	
	@Test
	public void testIsValidParentheses() {
		assertTrue(ValidParentheses.isValidParentheses("()"));
		assertTrue(ValidParentheses.isValidParentheses("()[]{}"));
		assertTrue(ValidParentheses.isValidParentheses("({[]})"));
		assertFalse(ValidParentheses.isValidParentheses("({])}"));
		assertFalse(ValidParentheses.isValidParentheses("([)]"));
		assertTrue(ValidParentheses.isValidParentheses(""));
	}
}
