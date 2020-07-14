/**
 * 
 */
package com.jaiworld.exercise;

/**
 * @author jaideepvish
 * 
 *         LeetCode : Problem #58
 * 
 *         Given a string s consists of upper/lower-case alphabets and empty
 *         space characters ' ', return the length of last word (last word means
 *         the last appearing word if we loop from left to right) in the string.
 * 
 *         If the last word does not exist, return 0.
 * 
 *         Note: A word is defined as a maximal substring consisting of
 *         non-space characters only.
 * 
 *         Example:
 * 
 *         Input: "Hello World" 
 *         Output: 5
 *
 */
public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {

		if (s.trim().length() == 0) {
			return 0;
		}

		String[] strArray = s.split(" ");

		return strArray[strArray.length - 1].length();

	}

}
