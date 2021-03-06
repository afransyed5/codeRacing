package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement      It's winter time! Time to eat a lot of
 *         mandarins with your friends.
 * 
 *         You have several bags with mandarins. You are given an int[] bags.
 *         For each i, the i-th element of bags represents the number of
 *         mandarins in the i-th bag. You are also given an int K. You want to
 *         choose exactly K bags and distribute them among you and your friends.
 *         To be as fair as possible, you want to minimize the difference
 *         between the chosen bag with most mandarins and the chosen bag with
 *         fewest mandarins. Return the smallest difference that can be
 *         achieved.
 * 
 *         Definition      Class: WinterAndMandarins
 * 
 *         Method: getNumber Parameters: int[], int Returns: int Method
 * 
 *         signature: public int getNumber(int[] bags, int K)
 * 
 *         Limits      Time limit (s): 2.000 Memory limit (MB): 256 Constraints
 *         - bags will contain between 2 and 50 elements, inclusive. - Each
 *         element of bags will be between 1 and 1,000,000,000, inclusive. - K
 *         will be between 2 and N, inclusive, where N is the number of elements
 *         in bags. Examples 0)
 * 
 *              {10, 20, 30} 2 Returns: 10 There are three ways to choose two
 *         bags in this case: {10, 20}, {20, 30}, and {10, 30}. Both in the
 *         first case and in the second case the difference between the largest
 *         and the smallest number of mandarins is 10. In the third case the
 *         difference is 20. Thus, the smallest possible difference is 10. 1)
 * 
 *              {4, 7, 4} 3 Returns: 3
 * 
 *         2)
 * 
 *              {4, 1, 2, 3} 3 Returns: 2
 * 
 *         3)
 * 
 *              {5, 4, 6, 1, 9, 4, 2, 7, 5, 6} 4 Returns: 1
 * 
 *         4)
 * 
 *              {47, 1000000000, 1, 74} 2 Returns: 27
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for: Single Round Match 601 Round 1 - Division
 *         II, Level One
 * 
 */

public class WinterAndMandarins {
	public int getNumber(int[] bags, int k) {
		int min = Integer.MAX_VALUE;
	    Arrays.sort(bags);
	    
	    for (int i = 0; i < bags.length - ( k - 1) ; i++) {
		    min = Math.min(min, bags[i+k-1] - bags[i]); 
	    	
	    }
		
		return min;
	}
}
