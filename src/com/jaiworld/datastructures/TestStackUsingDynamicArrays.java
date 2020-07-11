/**
 * 
 */
package com.jaiworld.datastructures;

/**
 * @author jaideepvish
 *
 */
public class TestStackUsingDynamicArrays {
	
	public static void main(String[] args) {
		StackImplUsingDynamicArrays dstack = new StackImplUsingDynamicArrays();
		dstack.push(1);
		dstack.push(3);
		dstack.show();
		System.out.println("\nSize is " + dstack.size());
		dstack.push(5);
		dstack.push(7);
		dstack.push(9);
		dstack.push(11);
		dstack.show();
		System.out.println("\nSize is " + dstack.size());
		dstack.pop();
		dstack.show();
		System.out.println("\nSize is " + dstack.size());
		dstack.pop();
		dstack.pop();
		dstack.pop();
		dstack.pop();
		System.out.println("\nSize is " + dstack.size());
		dstack.pop();
	}

}
