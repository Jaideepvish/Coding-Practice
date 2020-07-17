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
public class TestAddBinaryStrings {
	
	@Test
	public void testAddBinary() {
		assertEquals("100", AddBinaryStrings.addBinary("11", "1"));
		assertEquals("10", AddBinaryStrings.addBinary("1", "1"));
		assertEquals("1010", AddBinaryStrings.addBinary("101", "101"));
	}
}
