/**
 * 
 */
package com.jaiworld.datastructures.problems;

/**
 * @author jaideepvish
 * 
 *         LeetCode : Problem #35
 * 
 *         Search Insert Position
 * 
 *         Given a sorted array and a target value, return the index if the
 *         target is found. If not, return the index where it would be if it
 *         were inserted in order.
 * 
 *         You may assume no duplicates in the array.
 * 
 *         Example 1:
 * 
 *         Input: [1,3,5,6], 5 
 *         Output: 2 
 *         
 *         Example 2:
 * 
 *         Input: [1,3,5,6], 2 
 *         Output: 1 
 *         
 *         Example 3:
 * 
 *         Input: [1,3,5,6], 7 
 *         Output: 4 
 *         
 *         Example 4:
 * 
 *         Input: [1,3,5,6], 0 
 *         Output: 0
 *
 */
public class SearchInsertionPosition {
	public static int searchInsert(int[] nums, int target) {

		if (nums.length == 0)
			return 0;

		if (nums.length == 1) {
			return nums[0] < target ? 1 : 0;
		}

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target)
				return mid;
			if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return start;

	}
}
