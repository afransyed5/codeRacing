package com.lam.coder.projectEuler;

import java.util.ArrayList;
import java.util.List;

import com.lam.coder.kattis.CollatzConjecture;
import com.lam.mathematics.CollatzSequence;

/**
 * 
 * Problem 14: Longest Collatz sequence
 * 
 * The following iterative sequence is defined for the set of positive Longs:
 * 
 * n → n/2 (n is even) n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence: 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem), it
 * is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * Answer: 837799.
 */

public class LongestCollatzSequence {
	private long LIMIT = 1000000;
	private List<Long> list;

	public long find() {
		long indMax  = -1L;
        long max = 0;

		CollatzConjecture sequence = new CollatzConjecture();

		for (long i = 1; i < LIMIT; i++) {
//			System.out.println(i + " ");
            list = sequence.findCollatzSize(i);
			if (list.size() > indMax) {
                indMax = list.size();
                max = list.get(0);
			}
		}
		return max;
	}

	public static void main(String[] args) {
	}
}
