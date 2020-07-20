/**
 * 
 */
package com.jaiworld.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestFibonacciNumber {
	
	@Test
	public void testFib() {
		assertEquals(0, FibonacciNumber.fib(0));
		assertEquals(1, FibonacciNumber.fib(1));
		assertEquals(1, FibonacciNumber.fib(2));
		assertEquals(2, FibonacciNumber.fib(3));
		assertEquals(3, FibonacciNumber.fib(4));
		assertEquals(5, FibonacciNumber.fib(5));
	}
	
	@Test
	public void testFibApprorach2() {
		assertEquals(0, FibonacciNumber.fibApproach2(0));
		assertEquals(1, FibonacciNumber.fibApproach2(1));
		assertEquals(1, FibonacciNumber.fibApproach2(2));
		assertEquals(2, FibonacciNumber.fibApproach2(3));
		assertEquals(3, FibonacciNumber.fibApproach2(4));
		assertEquals(5, FibonacciNumber.fibApproach2(5));
	}

}
