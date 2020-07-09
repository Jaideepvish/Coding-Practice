/**
 * 
 */
package com.jaiworld.exercise;

import java.util.HashMap;

/**
 * @author jaideepvish
 * 
 *         LeetCode : Problem #13
 * 
 *         Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * 
 *         Example 1:
 * 
 *         Input: "III" 
 *         Output: 3 
 *         
 *         Example 2:
 * 
 *         Input: "IV" 
 *         Output: 4 
 *         
 *         Example 3:
 * 
 *         Input: "IX" 
 *         Output: 9 
 *         
 *         Example 4:
 * 
 *         Input: "LVIII" 
 *         Output: 58  
 *         Explanation: L = 50, V= 5, III = 3. 
 *         
 *         Example 5:
 * 
 *         Input: "MCMXCIV" 
 *         Output: 1994 
 *         Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 */
public class RomanToInteger {
	public static int romanToInteger(String roman) {
		HashMap<Character, Integer> symVal = new HashMap<Character, Integer>();
		symVal.put('I', 1);
		symVal.put('V', 5);
		symVal.put('X', 10);
		symVal.put('L', 50);
		symVal.put('C', 100);
		symVal.put('D', 500);
		symVal.put('M', 1000);

		if (roman.length() == 1) {
			return symVal.get(roman.charAt(0));
		}

		int res = 0;

		for (int i = 0; i < roman.length(); i++) {

			if (i > 0 && symVal.get(roman.charAt(i)) > symVal.get(roman.charAt(i - 1))) {
				res -= 2 * symVal.get(roman.charAt(i - 1));
			}

			res += symVal.get(roman.charAt(i));

		}
		return res;
	}
}
