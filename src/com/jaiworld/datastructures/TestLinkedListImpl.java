/**
 * 
 */
package com.jaiworld.datastructures;

/**
 * @author jaideepvish
 *
 */
public class TestLinkedListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		
		list.insert(8);
		list.insert(12);
		list.insert(3);
		
		list.insertAtStart(4);
		
		list.insertAt(2, 6);
		list.insertAt(0, 9);
		
		list.deleteAt(2);
		
		list.show();

	}

}
