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
public class TestFlippingAnImage {

	@Test
	public void testFlipImage() {
		assertArrayEquals(new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } },
				FlippingAnImage.flipAndInvertImage(new int[][] { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } }));
		assertArrayEquals(new int[][] { { 1, 1, 0, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 1, 0 } },
				FlippingAnImage.flipAndInvertImage(
						new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } }));

	}
}
