/**
 * 
 */
package com.jaiworld.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestMajorityElement {
	
	static int nums1[];
	static int nums2[];
	static int nums3[];
	
	@BeforeClass
	public static void setUp(){
		nums1 = new int[]{3,2,3};
		nums2 = new int[]{1};
		nums3 = new int[]{2,2,1,1,1,2,2};
	}
	
	@Test
	public void testMajorityElementApproach2() {
		assertEquals(3, MajorityElement.majorityElement(nums1));
		assertEquals(1, MajorityElement.majorityElement(nums2));
		assertEquals(2, MajorityElement.majorityElement(nums3));
	}
	
	@Test
	public void testMajorityElement() {
		assertEquals(3, MajorityElement.majorityElementApproach2(nums1));
		assertEquals(1, MajorityElement.majorityElementApproach2(nums2));
		assertEquals(2, MajorityElement.majorityElementApproach2(nums3));
	}

}
