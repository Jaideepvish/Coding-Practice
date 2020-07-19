/**
 * 
 */
package com.jaiworld.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jaideepvish
 *
 *         LeetCode : Problem #169
 *
 *         Given an array of size n, find the majority element. The majority
 *         element is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 *         You may assume that the array is non-empty and the majority element
 *         always exist in the array.
 * 
 *         Example 1:
 * 
 *         Input: [3,2,3] 
 *         Output: 3 
 *         
 *         Example 2:
 * 
 *         Input: [2,2,1,1,1,2,2] 
 *         Output: 2
 *
 */
public class MajorityElement {
	public static int majorityElement(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int count = 1;
		int majorityElement = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (count == 0) {
				majorityElement = nums[i];
			}
			if (majorityElement != nums[i]) {
				count--;
			} else {
				count++;
			}
		}

		return majorityElement;
	}

	public static int majorityElementApproach2(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		HashMap<Integer, Integer> temp = new HashMap<>();

		for (int num : nums) {
			if (temp.containsKey(num)) {
				temp.put(num, temp.get(num) + 1);
			} else {
				temp.put(num, 1);
			}
		}

		int majorityCount = 0;
		int majorityKey = 0;

		for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
			if (entry.getValue() > majorityCount) {
				majorityCount = entry.getValue();
				majorityKey = entry.getKey();
			}
		}

		return majorityKey;
	}
}
