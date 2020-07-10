/**
 * 
 */
package com.jaiworld.datastructures;

/**
 * @author jaideepvish
 *
 */
public class StackImplUsingArrays {

	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;

	public void push(int val) {
		
		if(size()>=capacity) {
			System.out.println("\nReached max limit. No elements can be added");
		} else {
			stack[top] = val;
			top++;
		}
	}

	public void pop() {
		if(top==0) {
			System.out.println("\nStack is empty. No Elements to delete");
		} else {
			stack[top-1] = 0;
			top--;
		}
	}

	public int peek() {
		if(top==0) {
			System.out.println("\nStack is empty. No elements to display. Returns default value");
			return 0;
		} else {
			return stack[top-1];
		}
		
	}

	public int size() {
		return top;
	}

	public void show() {
		for(var i : stack) {
			System.out.print(i + " ");
		}
	}
}
