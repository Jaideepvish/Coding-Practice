/**
 * 
 */
package com.jaiworld.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestRomanToInteger {
	
	@Test
	public void testRomanToInteger() {
		assertEquals(3, RomanToInteger.romanToInteger("III"));
		assertEquals(4, RomanToInteger.romanToInteger("IV"));
		assertEquals(9, RomanToInteger.romanToInteger("IX"));
		assertEquals(58, RomanToInteger.romanToInteger("LVIII"));
		assertEquals(1994, RomanToInteger.romanToInteger("MCMXCIV"));		
	}

}
