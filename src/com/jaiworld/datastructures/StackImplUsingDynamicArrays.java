package com.jaiworld.datastructures;

public class StackImplUsingDynamicArrays {

	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;

	public void push(int val) {

		if (size() == capacity) {
			expand();
		}
		stack[top] = val;
		top++;

	}

	private void expand() {
		
		capacity = 2 * capacity;
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, top);
		stack = newStack;

	}

	public void pop() {
		
		if (isEmpty()) {
			System.out.println("\nStack is empty. No Elements to delete");
		} else {
			stack[top - 1] = 0;
			top--;
			shrink();
		}
	}

	private void shrink() {
		
		if(size() == (capacity/2)) {
			capacity /= 2;
			int[] newStack = new int[capacity];
			System.arraycopy(stack, 0, newStack, 0, top);
			stack = newStack;
		}
		
	}

	public int peek() {
		
		if (size() == 0) {
			System.out.println("\nStack is empty. No elements to display. Returns default value");
			return 0;
		} else {
			return stack[top - 1];
		}

	}

	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}

	public void show() {
		for (var i : stack) {
			System.out.print(i + " ");
		}
	}
}
