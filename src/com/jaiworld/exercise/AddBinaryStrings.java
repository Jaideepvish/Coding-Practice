/**
 * 
 */
package com.jaiworld.exercise;

/**
 * @author jaideepvish
 *
 *
 *         LeetCode : Problem #67
 *
 *         Given two binary strings, return their sum (also a binary string).
 * 
 *         The input strings are both non-empty and contains only characters 1 or 0.
 * 
 *         Example 1:
 * 
 *         Input: a = "11", b = "1" 
 *         Output: "100" 
 *         
 *         Example 2:
 * 
 *         Input: a = "1010", b = "1011" 
 *         Output: "10101"
 */

public class AddBinaryStrings {
	public static String addBinary(String a, String b) {

		int maxLength = Math.max(a.length(), b.length());

		StringBuilder res = new StringBuilder("");

		int carryOver = 0;

		for (int i = 0; i < maxLength; i++) {

			int aNum = i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
			int bNum = i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
			int sum = aNum + bNum + carryOver;
			carryOver = sum / 2;
			sum = sum % 2;
			res.append(sum);
		}

		if (carryOver > 0) {
			res.append("1");
		}

		return res.reverse().toString();

	}
}
