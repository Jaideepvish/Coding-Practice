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
public class TestLengthOfLastWord {
	
	@Test
	public void testLengthOfLastWord() {
		assertEquals(5,LengthOfLastWord.lengthOfLastWord("Hello World"));
		assertEquals(3,LengthOfLastWord.lengthOfLastWord("Jai"));
		assertEquals(0,LengthOfLastWord.lengthOfLastWord(" "));
		assertEquals(0,LengthOfLastWord.lengthOfLastWord(""));
	}

}
