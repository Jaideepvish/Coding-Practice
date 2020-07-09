/**
 * 
 */
package com.jaiworld.arrays;

/**
 * @author jaideepvish
 * 
 *         LeetCode: Problem #14 
 *         
 *         Write a function to find the longest common prefix string amongst an array of strings.
 * 
 *         If there is no common prefix, return an empty string "".
 * 
 *         Example 1:
 * 
 *         Input: ["flower","flow","flight"] 
 *         Output: "fl" 
 *         
 *         Example 2:
 * 
 *         Input: ["dog","racecar","car"] 
 *         Output: "" 
 *         Explanation: There is no common prefix among the input strings. 
 *         
 *         Note: All given inputs are in lowercase letters a-z.
 *
 */
public class LongestCommonPrefix {
	public static String getLongestCommanPrefix(String[] args) {

		if (args == null || args.length == 0) {
			return "";
		}

		if (args.length == 1) {
			return args[0];
		}

		StringBuilder res = new StringBuilder("");
		for (int i = 0; i < args[0].length(); i++) {
			char c = args[0].charAt(i);
			for (int j = 1; j < args.length; j++) {
				if (i >= args[j].length() || args[j].charAt(i) != c) {
					return res.toString();
				}
			}
			res.append(c);
		}
		return res.toString();
	}
}
