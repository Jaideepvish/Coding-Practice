/**
 * 
 */
package com.jaiworld.arrays;

/**
 * @author jaideepvish
 *
 *
 *         LeetCode : Problem #283
 *
 *         Given an array nums, write a function to move all 0's to the end of
 *         it while maintaining the relative order of the non-zero elements.
 * 
 *         Example:
 * 
 *         Input: [0,1,0,3,12] 
 *         Output: [1,3,12,0,0] 
 *         
 *         Note:
 * 
 *         You must do this in-place without making a copy of the array.
 *         Minimize the total number of operations.
 */
public class MoveZeros {
	public static int[] moveZeroes(int[] nums) {

		if (nums == null || nums.length == 1) {
			return nums;
		}

		int startPosition = 0;
		int nextPosition = 0;
		int temp = 0;

		while (nextPosition < nums.length) {

			if (nums[nextPosition] == 0) {
				nextPosition++;
			} else {
				temp = nums[startPosition];
				nums[startPosition] = nums[nextPosition];
				nums[nextPosition] = temp;
				startPosition++;
				nextPosition++;
			}
		}

		return nums;

	}
}
