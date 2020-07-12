/**
 * 
 */
package com.jaiworld.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestMergeTwoSortedLists {
	
	@Test
	public void testMergeTwoLists() {
		ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4,null)));
		ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4,null)));
		
		ListNode test1 = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(4,null))))));
		ListNode res1 = MergeTwoSortedLists.mergeTwoLists(l1, l2);		
		
		assertTrue("Test Case 1 Passed ",testListEquals(res1,test1));		
		
		l1 = new ListNode(1,new ListNode(5,new ListNode(6,null)));
		l2 = new ListNode(1,new ListNode(7,new ListNode(8,null)));
		
		test1 = new ListNode(1,new ListNode(1,new ListNode(5,new ListNode(6,new ListNode(7,new ListNode(8,null))))));		
		res1 = MergeTwoSortedLists.mergeTwoLists(l1, l2);
		
		assertTrue("Test Case 2 Passed ",testListEquals(res1,test1));			
		
		
		l1 = new ListNode(1,new ListNode(5,new ListNode(6,null)));
		l2 = new ListNode(1,new ListNode(7,null));
		
		test1 = new ListNode(1,new ListNode(1,new ListNode(5,new ListNode(6,new ListNode(7,null)))));		
		res1 = MergeTwoSortedLists.mergeTwoLists(l1, l2);
		
		assertTrue("Test Case 3 Passed ", testListEquals(res1,test1));	
		
		l1 = new ListNode(1,new ListNode(5,null));
		l2 = new ListNode(1,new ListNode(7,new ListNode(8,null)));
		
		test1 = new ListNode(1,new ListNode(1,new ListNode(5,new ListNode(7,new ListNode(8,null)))));		
		res1 = MergeTwoSortedLists.mergeTwoLists(l1, l2);
		
		assertTrue("Test Case 4 Passed ",testListEquals(res1,test1));	
		
	}
	
	
	private boolean testListEquals(ListNode expected, ListNode result) {
		
		boolean isEqual = false;
		
		while(expected!=null && result!=null) {
			if(expected.val != result.val) {
				isEqual = false;
				break;
			} else {
				isEqual = true;
				expected = expected.next;
				result = result.next;
			}
		}		
		
		return isEqual;
	}

}
