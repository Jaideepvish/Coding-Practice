/**
 * 
 */
package com.jaiworld.arrays;

/**
 * @author jaideepvish
 * 
 *         LeetCode : Problem #53  (Kendane's Approach)
 * 
 *         Maximum Sub Array : Given an integer array nums, find the contiguous
 *         subarray (containing at least one number) which has the largest sum
 *         and return its sum.
 * 
 *         Example:
 * 
 *         Input: [-2,1,-3,4,-1,2,1,-5,4], 
 *         Output: 6 
 *         
 *         Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 */
public class MaximumSubArray {

	public static int maxSubArray(int[] nums) {

		if (nums.length == 1) {
			return nums[0];
		}

		int maxSum = Integer.MIN_VALUE;

		if (nums.length == 0) {
			return maxSum;
		}

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			sum = Math.max(sum + nums[i], nums[i]);
			if (maxSum < sum) {
				maxSum = sum;
			}

		}

		return maxSum;
	}
}
