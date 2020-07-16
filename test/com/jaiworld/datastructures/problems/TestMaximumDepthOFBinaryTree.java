package com.jaiworld.datastructures.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumDepthOFBinaryTree {
	
	TreeNode root;

	@Test
	public void test() {
		
		assertEquals(3, MaximumDepthOfBinaryTree.maxDepth(constructBinaryTree()));
		
	}
	
	private TreeNode constructBinaryTree() {
		
		root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.left.left = null;
		root.left.right = null;
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		return root;
		
	}

}
