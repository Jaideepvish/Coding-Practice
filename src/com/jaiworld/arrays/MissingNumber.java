/**
 * 
 */
package com.jaiworld.arrays;

/**
 * @author jaideepvish
 *
 *         LeetCode : Problem #268
 *
 *         Missing Number
 *
 *         Given an array containing n distinct numbers taken from 0, 1, 2, ...,
 *         n, find the one that is missing from the array.
 * 
 *         Example 1:
 * 
 *         Input: [3,0,1] 
 *         Output: 2 
 *         
 *         Example 2:
 * 
 *         Input: [9,6,4,2,3,5,7,0,1] 
 *         Output: 8 
 *         
 *         Note: Your algorithm should run in linear runtime complexity. Could you implement it using only
 *         constant extra space complexity?
 * 
 * 
 */
public class MissingNumber {
	public static int missingNumber(int[] nums) {

		int[] tempArr = new int[nums.length + 1];

		for (int num : nums) {
			tempArr[num] = 1;
		}

		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] == 0) {
				return i;
			}
		}

		return 0;

	}
}
