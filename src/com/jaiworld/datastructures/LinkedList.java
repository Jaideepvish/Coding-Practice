/**
 * 
 */
package com.jaiworld.datastructures;

/**
 * @author jaideepvish
 *
 */
public class LinkedList {

	LinkedListNode head;

	public void insert(int val) {

		LinkedListNode node = new LinkedListNode();
		node.data = val;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			LinkedListNode n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	public void insertAtStart(int val) {

		LinkedListNode node = new LinkedListNode();
		node.data = val;
		node.next = head;
		head = node;

	}

	public void insertAt(int index, int val) {

		if (index == 0) {
			insertAtStart(val);
		} else {
			LinkedListNode node = new LinkedListNode();
			node.data = val;

			LinkedListNode n = head;
			for (int i = 0; i < index - 1; i++) {
				n = head.next;
			}
			node.next = n.next;
			n.next = node;

		}
	}

	public void deleteAt(int index) {

		LinkedListNode n = head;
		if (n != null) {
			for (int i = 0; i < index - 1; i++) {
				n = head.next;
			}
			n.next = n.next.next;
		}
	}

	public void show() {

		LinkedListNode n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);

	}

}
