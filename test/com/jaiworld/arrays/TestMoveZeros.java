/**
 * 
 */
package com.jaiworld.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author jaideepvish
 *
 */
public class TestMoveZeros {
	
	
	@Test
	public void testMoveZeros() {
		assertArrayEquals(new int[] {1,1,0},MoveZeros.moveZeroes(new int[] {1,0,1}));
		assertArrayEquals(new int[] {2,1},MoveZeros.moveZeroes(new int[] {2,1}));
		assertArrayEquals(new int[] {1,3,12,0,0},MoveZeros.moveZeroes(new int[] {0,1,0,3,12}));
		assertArrayEquals(new int[] {1},MoveZeros.moveZeroes(new int[] {1}));
		assertArrayEquals(null,MoveZeros.moveZeroes(null));
		assertArrayEquals(new int[0],MoveZeros.moveZeroes(new int[0]));
	}

}
