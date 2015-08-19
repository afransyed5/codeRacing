package com.lam.coder.topCoder;

/**
 * @author Ludoviko Azuaje 
 * 
 * Problem Statement
 * 
 *         Class Name: TriTravel Method Name: bestWayDown Parameters: int[]
 *         Returns: int
 * 
 *         Implement a class TriTravel, which contains a method bestWayDown. The
 *         method analyzes a set of Integers organized as a triangle and finds
 *         the path from the top to the bottom of the triangle with the maximum
 *         possible sum of numbers passed on route (including both the starting
 *         and ending number). The method returns an int that is this maximum
 *         sum. The method is passed an int[] that contains the elements in the
 *         triangle. The elements of the int[] correspond to the triangle as
 *         follows. The numbers in this triangle are the index of the elements
 *         in the int[]: 0 1 2 3 4 5 6 7 8 9 10 11 . . . . . . . . . . . . . .
 *         
 *         For example, the triangle 1 6 7 4 -1 6 5 8 9 0 is represented by the
 *         int[]{1,6,7,4,-1,6,5,8,9,0} The path starts at the element in the top
 *         row. Each step in the path is either diagonally down one row to the
 *         right or diagonally down one row to the left. For instance, given the
 *         triangle above, the maximum sum route down is 1 -> 7 -> 6 -> 9 and
 *         the method returns the sum, 23.
 * 
 *         Here is the method signature: public int bestWayDown(int[]
 *         triValues); triValues is an int[] of elements between -100 and 100,
 *         inclusive. The number of elements in triValues represents a triangle
 *         perfectly. (that is, it has 1 or 3 or 6 or 10 or 15 or ... elements).
 *         triValues has at least 1 element (a 1 row triangle). triValues has at
 *         most 45 elements (a 9 row triangle).
 * 
 *         Examples: If triValues = {5, 4, 1, 2, 8, -1}, the path 5->4->8 yeilds
 *         the maximum sum and the method returns the sum: 17.
 * 
 *         Definition
 * 
 *         Class: TriTravel Method: bestWayDown Parameters: int[] Returns: int
 *         Method signature: int bestWayDown(int[] param0) (be sure your method
 *         is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Collegiate Challenge Semifinals - Division
 *         I, Level Two
 * 
 */

public class TriTravel {
	// XXX TODO use dynamin programming instead
	public int bestWayDown(int[] array) {
		int deep = deep(array);

		int last = array.length;
		int max = 0;

		// Transverse as an upside down piramid
		for (int i = deep; i >= 0; i--) {
			last = last - i;
			for (int j = last; j < last + i; j++) {
				if (j + i < array.length) {
					max = Math.max(array[j + i], array[j + i + 1]);
					array[j] = max + array[j];
				}
				// System.out.print(array[j] + " ");
			}
			// System.out.println();
		}

		return array[0];
	}

	private int deep(int[] array) {
		// XXX TODO formula to find the deep
		int deep = 0;

		switch (array.length) {
		case 1: {
			deep = 1;
			break;
		}
		case 3: {
			deep = 2;
			break;
		}
		case 6: {
			deep = 3;
			break;
		}
		case 10: {
			deep = 4;
			break;
		}
		case 15: {
			deep = 5;
			break;
		}
		case 21: {
			deep = 6;
			break;
		}
		case 28: {
			deep = 7;
			break;
		}
		case 36: {
			deep = 8;
			break;
		}
		case 45: {
			deep = 9;
			break;
		}
		}

		return deep;
	}
}
