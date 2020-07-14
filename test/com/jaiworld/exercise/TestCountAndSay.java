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
public class TestCountAndSay {
	
	@Test
	public void testCountAndSay() {
		assertEquals("1", CountAndSay.countAndSay(1));
		assertEquals("11", CountAndSay.countAndSay(2));
		assertEquals("1211", CountAndSay.countAndSay(4));
	}

}
