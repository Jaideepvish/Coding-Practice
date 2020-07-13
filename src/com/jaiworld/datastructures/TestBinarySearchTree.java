/**
 * 
 */
package com.jaiworld.datastructures;

/**
 * @author jaideepvish
 *
 */
public class TestBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTreeImpl bTree = new BinarySearchTreeImpl();
		BinaryTreeNode bTNode = null;
		bTNode = bTree.addNode(6);
		bTNode = bTree.addNode(4);
		bTNode = bTree.addNode(8);
		bTNode = bTree.addNode(2);
		bTNode = bTree.addNode(7);

		System.out.println(bTree.elementExists(7));

		bTree.DFSInOrderTraversal(bTNode);
		
		System.out.println();
		
		bTree.DFSPreOrderTraversal(bTNode);
		
		System.out.println();
		
		bTree.DFSPostOrderTraversal(bTNode);
		
		System.out.println();
		
		bTree.BFSLevelOrderTraversal();

	}

}
