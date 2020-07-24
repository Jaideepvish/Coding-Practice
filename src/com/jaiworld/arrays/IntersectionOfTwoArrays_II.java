/**
 * 
 */
package com.jaiworld.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author jaideepvish
 * 
 *         LeetCode : problem #350
 * 
 *         Problem Description: Intersection of two arrays II
 * 
 *         Given two arrays, write a function to compute their intersection.
 * 
 *         Example 1:
 * 
 *         Input: nums1 = [1,2,2,1], nums2 = [2,2]  *         
 *         Output: [2,2] 
 *         
 *         Example 2:
 * 
 *         Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] 
 *         Output: [4,9] 
 *         
 *         Note:
 * 
 *         Each element in the result should appear as many times as it shows in
 *         both arrays. The result can be in any order.
 *
 */
public class IntersectionOfTwoArrays_II {
	public static int[] intersect(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> tempMap = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (int num : nums1) {
			if (tempMap.containsKey(num)) {
				tempMap.put(num, tempMap.get(num) + 1);
			} else {
				tempMap.put(num, 0);
			}
		}

		for (int num : nums2) {
			if (tempMap.containsKey(num) && tempMap.get(num) >= 0) {
				list.add(num);
				tempMap.put(num, tempMap.get(num) - 1);
			}
		}

		int[] res = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			res[i] = list.get(i);
		}

		return res;

	}

}
