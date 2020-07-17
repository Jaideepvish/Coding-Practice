/**
 * 
 */
package com.jaiworld.datastructures.problems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestPathSum {
	
	TreeNode root;
	
	@Test
	public void testHasPathSum() {
		assertTrue(PathSum.hasPathSum(constructBinaryTree(), 22));
	}

	
	private TreeNode constructBinaryTree() {
		root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		
		return root;
	}

}
