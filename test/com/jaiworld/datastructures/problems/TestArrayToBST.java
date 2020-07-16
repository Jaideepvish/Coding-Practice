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
public class TestArrayToBST {

	TreeNode root;

	@Test
	public void testSortedArrayToBST() {
		assertTrue(isIdentical(constructBST(), ArrayToBST.sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 })));
	}

	private TreeNode constructBST() {

		root = addNode(root, 0);
		root = addNode(root, -10);
		root = addNode(root, 5);
		root = addNode(root, -3);
		root = addNode(root, 9);
		return root;

	}

	private TreeNode addNode(TreeNode currentNode, int val) {
		if (currentNode == null) {
			currentNode = new TreeNode(val);
		}

		if (val < currentNode.val) {
			currentNode.left = addNode(currentNode.left, val);
		} else if (val > currentNode.val) {
			currentNode.right = addNode(currentNode.right, val);
		} else {
			return currentNode;
		}

		return currentNode;
	}

	private boolean isIdentical(TreeNode expected, TreeNode actual) {
		if (expected == null && actual == null)
			return true;
		else if (expected != null && actual == null)
			return false;
		else if (expected == null && actual != null)
			return false;
		else {
			if (expected.val == actual.val && isIdentical(expected.left, actual.left)
					&& isIdentical(expected.right, actual.right))
				return true;
			else
				return false;
		}

	}

}
