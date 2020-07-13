/**
 * 
 */
package com.jaiworld.datastructures;

import java.util.Queue;

/**
 * @author jaideepvish
 *
 */
public class BinarySearchTreeImpl {

	private BinaryTreeNode root;

	public BinaryTreeNode addNode(int data) {
		root = addRecursive(root, data);
		return root;
	}

	private BinaryTreeNode addRecursive(BinaryTreeNode current, int value) {
		if (current == null) {
			return new BinaryTreeNode(value);
		}

		if (value < current.data) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.data) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public boolean elementExists(int data) {

		return checkElementExists(root, data);
	}

	private boolean checkElementExists(BinaryTreeNode current, int value) {

		boolean isElementPrsent = false;

		if (current == null) {
			return false;
		}

		if (value == current.data) {
			return true;
		}

		if (value < current.data) {
			isElementPrsent = checkElementExists(current.left, value);
		} else {
			isElementPrsent = checkElementExists(current.right, value);
		}

		return isElementPrsent;
	}

	public void deleteElement(int data) {
		root = deleteRecursive(root, data);
	}

	private BinaryTreeNode deleteRecursive(BinaryTreeNode current, int value) {
		if (current == null) {
			return null;
		}

		if (value == current.data) {
			if (current.left == null && current.right == null) {
				return null;
			}
			if (current.right == null) {
				return current.left;
			}

			if (current.left == null) {
				return current.right;
			}

			int smallestValue = findSmallestValue(current.right);
			current.data = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;

		}
		if (value < current.data) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		current.right = deleteRecursive(current.right, value);
		return current;
	}

	private int findSmallestValue(BinaryTreeNode root) {
		return root.left == null ? root.data : findSmallestValue(root.left);
	}

	public void DFSInOrderTraversal(BinaryTreeNode current) {

		// start from left sub tree --> root --> right sub tree
		if (current != null) {
			DFSInOrderTraversal(current.left);
			System.out.print(current.data + " ");
			DFSInOrderTraversal(current.right);
		}

	}

	public void DFSPreOrderTraversal(BinaryTreeNode current) {

		if (current != null) {
			System.out.print(current.data + " ");
			DFSPreOrderTraversal(current.left);
			DFSPreOrderTraversal(current.right);
		}
	}

	public void DFSPostOrderTraversal(BinaryTreeNode current) {

		if (current != null) {
			DFSPostOrderTraversal(current.left);
			DFSPostOrderTraversal(current.right);
			System.out.print(current.data + " ");
		}
	}

	public void BFSLevelOrderTraversal() {

		if (root == null) {
			return;
		}

		Queue<BinaryTreeNode> nodes =  new java.util.LinkedList<>();
		nodes.add(root);

		while (!nodes.isEmpty()) {

			BinaryTreeNode node = nodes.remove();

			System.out.print(node.data + " ");

			if (node.left != null) {
				nodes.add(node.left);
			}

			if (node.right != null) {
				nodes.add(node.right);
			}
		}

	}

}
