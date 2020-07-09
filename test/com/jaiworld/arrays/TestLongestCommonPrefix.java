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
public class TestLongestCommonPrefix {
	@Test
	public void testLogestPrefix() {
		assertEquals("fl", LongestCommonPrefix.getLongestCommanPrefix(new String[] {"flower","flow","flight"}));
		assertEquals("", LongestCommonPrefix.getLongestCommanPrefix(new String[] {"dog","racecar","car"}));
		assertEquals("", LongestCommonPrefix.getLongestCommanPrefix(new String[0]));
		assertEquals("a", LongestCommonPrefix.getLongestCommanPrefix(new String[]{"a"}));
		assertEquals("a", LongestCommonPrefix.getLongestCommanPrefix(new String[]{"aa", "a"}));
		assertEquals("", LongestCommonPrefix.getLongestCommanPrefix(null));
	}
}
