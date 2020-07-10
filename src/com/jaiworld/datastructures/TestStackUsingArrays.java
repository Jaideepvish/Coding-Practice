/**
 * 
 */
package com.jaiworld.datastructures;

/**
 * @author jaideepvish
 *
 */
public class TestStackUsingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StackImplUsingArrays stack = new StackImplUsingArrays();
		
		stack.push(2);
		stack.push(4);
		stack.push(45);
		System.out.println("Size is "+stack.size());
		stack.show();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("\nSize is "+stack.size());
		stack.show();
		stack.push(99);
		stack.push(88);
		System.out.println("\ntop or last element is "+ stack.peek());
	}

}
