package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         Little Johnny has a stick that is 64 centimeters long, but he thinks
 *         it would be more fun to play with a stick that is x centimeters long.
 *         He decides to break the original stick into a number of smaller
 *         sticks, and then glue them together to get a stick that is exactly x
 *         centimeters long.
 * 
 *         The easiest way to break a stick is to break it in half, so Johnny
 *         will use the following procedure:
 * 
 *         Sum the lengths of all the sticks (initially, there is just one 64
 *         centimeter stick). While this sum is greater than x, repeat the
 *         following: Take one of the sticks with the shortest length and break
 *         it in half. If discarding one of the halves would not make the sum of
 *         the remaining sticks' lengths less than x, throw that half away.
 *         Finally, glue the remaining sticks together to form a stick that is x
 *         centimeters long.
 * 
 *         Return the number of sticks Johnny would have to glue together in the
 *         final step if he follows the above procedure. If he has only one
 *         stick when he gets to the final step, return 1 (see example 0).
 * 
 * 
 *         Definition
 * 
 *         Class: Stick Method: pieces Parameters: int Returns: int Method
 *         signature: int pieces(int x) (be sure your method is public)
 * 
 * 
 *         Notes - The algorithm described in the problem statement guarantees
 *         that you will always end up with a total length of exactly x in the
 *         final step.
 * 
 *         Constraints - x will be between 1 and 64, inclusive.
 * 
 *         Examples 0)
 * 
 * 
 *         32
 * 
 *         Returns: 1
 * 
 *         After the first break Johnny gets a stick 32cm long. 1)
 * 
 * 
 *         48
 * 
 *         Returns: 2
 * 
 *         First, he breaks the stick into two 32cm long sticks. Then, he breaks
 *         one of the 32cm sticks in half and discards one of the halves. The
 *         remaining two sticks have a total length of 48cm when glued together.
 *         2)
 * 
 * 
 *         23
 * 
 *         Returns: 4
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 409 Round 1 - Division
 *         II, Level One
 */

public class Stick {
	public static final int STICK = 64;
	public int pieces2(int smallerStick) {
		int n = 0;
		int power;
		int sum = 0;

		if ((smallerStick & smallerStick - 1) == 0) {
			// It is a power of two
			n = 1;
		} else {
			power = (int) (Math.log10(smallerStick) / Math.log10(2));
			while (smallerStick > sum) {
				sum += Math.pow(2, power);
				power = (int) (Math.log10(smallerStick - sum) / Math.log10(2));
				n++;
			}

		}
		return n;
	}
	
	public int pieces(int smallerStick) {
		  return Integer.bitCount(smallerStick);	}
}
