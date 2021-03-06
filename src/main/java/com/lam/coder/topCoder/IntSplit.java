package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 * 
 *         Class name: IntSplit Method name: maxSplit Parameters: int,int
 *         Returns: int
 * 
 *         Implement a class IntSplit, which contains a method maxSplit.
 *         maxSplit takes two ints as parameters: a source and a target. The
 *         function should split the source between digits any number of times
 *         so the sum of all the pieces is as close to, without exceeding, the
 *         target as possible and return this sum. If it is impossible to not
 *         exceed the target, the function should return 0.
 * 
 *         For example, if source is 19967 and target is 1000, source should be
 *         split between the 9's: 19 + 967 = 986 and the function should return
 *         986. Note if the integer were split between the 1 & 9 and between the
 *         6 & 7, the result would be 1 + 996 + 7 = 1004, which is greater than
 *         the target, and therefore is not considered.
 * 
 *         The method signature is (be sure your method is public): int
 *         maxSplit(int source, int target)
 * 
 *         TopCoder will ensure the following: - Both source and target are
 *         between 0 and 99999999, inclusive.
 * 
 *         NOTES: The returning value can equal the target, it just cannot be
 *         greater than the target. The digits cannot be rearranged and the
 *         digits must be read from left to right. The solution must run in
 *         under 6 seconds.
 * 
 *         Examples: tosplit = 19967, target = 1000 -> 19 + 967 -> return = 986
 *         tosplit = 19967, target = 100 -> 19 + 9 + 67 -> return = 95 tosplit =
 *         22215, target = 225 -> 2 + 2 + 215 -> return = 219
 * 
 *         Definition
 * 
 *         Class: IntSplit Method: maxSplit Parameters: int, int Returns: int
 *         Method signature: int maxSplit(int param0, int param1) (be sure your
 *         method is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Collegiate Challenge Semifinals - Division
 *         I, Level Two 
 */

public class IntSplit {
//	tosplit = 19967, target = 1000 -> 19 + 967 -> return = 986
//			*tosplit = 19967, target = 100 -> 19 + 9 + 67 -> return = 95
//			*tosplit = 22215, target = 225 -> 2 + 2 + 215 -> return = 219
	
	public int  maxSplit(int source, int target) {
		return 0;
	}
	
	public static int length(long n) {
		if (n == 0) {
			return 0;
		}
		return  (int) Math.log10(n) + 1;
	} 
	

}
