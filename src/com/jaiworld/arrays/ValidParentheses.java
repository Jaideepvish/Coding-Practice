/**
 * 
 */
package com.jaiworld.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jaideepvish
 * 
 *         LeetCode: Problem #20 
 *         
 *         Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 *         An input string is valid if: Open brackets must be closed by the same type of brackets.
 *         Open rackets must be closed in the correct order. 
 *         
 *         Note that an empty string is also considered valid.
 * 
 *         Example 1:
 * 
 *         Input: "()" 
 *         Output: true 
 *         
 *         Example 2:
 * 
 *         Input: "()[]{}" 
 *         Output: true 
 *         
 *         Example 3:
 * 
 *         Input: "(]" 
 *         Output: false 
 *         
 *         Example 4:
 * 
 *         Input: "([)]" 
 *         Output: false 
 *         
 *         Example 5:
 * 
 *         Input: "{[]}" 
 *         Output: true
 *
 */
public class ValidParentheses {
	public static boolean isValidParentheses(String s) {
		
		if(s.trim().length() == 0) {
			return true;
		}
		
		boolean isVlaid = false;

		List<Character> list = new ArrayList<>();
		for (char c : s.toCharArray()) {
			if (list.size() == 0 || getOpeniningBracket(c) == '0') {
				list.add(c);
			} else if (list.get(list.size() - 1) == getOpeniningBracket(c)) {
				list.remove(list.size() - 1);
			} else {
				break;
			}
		}
		if (list.size() == 0) {
			return true;
		}
		return isVlaid;
	}

	private static char getOpeniningBracket(char c) {
		char openBracket = '0';
		switch (c) {
		case ')':
			openBracket = '(';
			break;
		case '}':
			openBracket = '{';
			break;
		case ']':
			openBracket = '[';
			break;
		}
		return openBracket;
	}
}
