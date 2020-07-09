/**
 * 
 */
package com.jaiworld.arrays;

import java.util.HashMap;

/**
 * @author jaideepvish
 * 
 *         Leet Code : Problem #1 
 *         Given an array of integers, return indices of
 *         the two numbers such that they add up to a specific target.
 * 
 *         You may assume that each input would have exactly one solution, and
 *         you may not use the same element twice.
 * 
 *         Example:
 * 
 *         Given nums = [2, 7, 11, 15], target = 9,
 * 
 *         Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		HashMap<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			var diff = target - nums[i];
			if (tempMap.containsKey(nums[i])) {
				res[0] = tempMap.get(nums[i]);
				res[1] = i;
				break;
			}
			tempMap.put(diff, i);
		}
		return res;
	}
}
