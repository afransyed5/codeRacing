package com.lam.coder.topCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.lam.mathematics.Histogram;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: EndOfContest
 * 
 *         Method Name: calcEarnings Parameters: String[], int[] Returns:
 *         String[]
 * 
 *         Implement a class EndOfContest, which contains a method calcEarnings:
 * 
 *         The method signature is (be sure your method is public): String[]
 *         calcEarnings(String[] scores, int[] money)
 * 
 *         TopCoder will check the following to be sure input is valid: scores -
 *         a String[] of between 1 and 20 (inclusive) elements of the form
 *         "NAME: SCORE". NAME has length between 1 and 20 (inclusive) and may
 *         only contain letters (a-z and A-Z, inclusive). No duplicate NAMEs can
 *         appear in the String[] scores. SCORE is a floating point value with 2
 *         places after the decimal point. NOTE: SCORE must always have 2 places
 *         after the decimal point. SCORE is between -1000.00 and 10000.00
 *         (inclusive). money - an int[] of between 1 and 20 (inclusive)
 *         elements. The 0th element is the earnings of the first place (highest
 *         score) winner, the 1st element is the earnings of the second place
 *         winner. The elements of money[] are between 1 and 100000 (inclusive).
 * 
 *         The return value is a String[] of the form "NAME: PLACE, EARNINGS"
 *         where PLACE is an int representing the place (final standing) the
 *         person came in and EARNINGS is a floating point value truncated to an
 *         int.
 * 
 *         The PLACE rules are: The person with the highest score comes in 1st
 *         place, second highest score comes in 2nd, et cetera. If p people have
 *         the same score and there are x scores higher than that score, all p
 *         people come in (x+1)th place. The person(s) with the next score less
 *         than the p peoples score, comes in (x+1+p)th place.
 * 
 *         The money winning rules are: If there are no ties, the person with
 *         the highest score gets the first place prize (element 0 of the money
 *         int[]), the person with the second highest score gets the second
 *         place prize (element 1 of the money int[]), et cetera. If p people
 *         are tied for xth place, they equally split the sum of the prize money
 *         of places x through p+x-1, inclusive. All winnings are truncated to
 *         ints. NOTE: The cents are removed, they are not added to any other
 *         winnings. No one with a score less than or equal to zero can earn any
 *         money at all. This rule has first precedence, so even if someone with
 *         0 points comes in first place, they can earn no money.
 * 
 *         The order of names in the returned String[] should be the same as the
 *         order of the names in the scores String[]. If there are more elements
 *         in scores than in money, it should be assumed the earnings are 0 for
 *         places that do not have elements in money.
 * 
 *         Examples: If scores= {"ads: 550.34", "talub: 2102.98",
 *         "romana: 1123.21", "mike: -1000.00", "td: 1123.21", "dok: 1123.21",
 *         "dwarfsleepy: 812.12"} and money= {300, 150, 75} Then talub came in
 *         first place alone and won 300 dollars romana, td, and dok tied for
 *         second so they equally split the sum of 2nd, 3rd, and 4th places (150
 *         + 75 + 0 = 225) so they win 225/3 = 75 dollars. no one else won any
 *         money.
 * 
 *         The returned String[] should be: {"ads: 6, 0", "talub: 1, 300",
 *         "romana: 2, 75", "mike: 7, 0", "td: 2, 75", "dok: 2, 75",
 *         "dwarfsleepy: 5, 0" } If scores= {"buddy: 100.00", "carl: 0.00", }
 *         and money= {10,20,30}
 * 
 *         Then buddy came in first place and won 10 dollars and no one else got
 *         a positive score so no one else won money and the returned String[]
 *         should be: {"buddy: 1, 10", "carl: 2, 0"}
 *         --------------------------------------------------------- If scores=
 *         {"a: 100.00", "b: 100.00", "c: 100.00", "d: 100.00", "e: 100.00",
 *         "f: 100.00", "g: 100.00"} and money= {1000,500} Then everyone tied
 *         for first place, so they all win (1000+500)/7= 214 dollars (remember
 *         to truncate to an int) and the returned String[] should be:
 *         {"a: 1, 214", "b: 1, 214", "c: 1, 214", "d: 1, 214", "e: 1, 214",
 *         "f: 1, 214", "g: 1, 214"}
 * 
 * 
 *         Definition
 * 
 *         Class: EndOfContest Method: calcEarnings Parameters: String[], int[]
 *         Returns: String[] Method signature: String[] calcEarnings(String[]
 *         param0, int[] param1) (be sure your method is public)
 * 
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         This problem was used for: 2001 Invitational Round 2 - Division I,
 *         Level Two
 */

public class EndOfContest {

	public String[] calcEarnings(String[] scores, int[] money) {

		List<Float> points = new ArrayList<Float>();
		String[] out;
		String[] pair = new String[2];

		for (int i = 0; i < scores.length; i++) {
			pair = scores[i].split(":");
			points.add(Float.parseFloat(pair[1]));
		}

		Collections.sort(points, Collections.reverseOrder());

		out = this.getSolution(scores, money, points);

		return out;
	}

	private String[] getSolution(String[] scores, int[] money, List<Float> points) {
		String[] out = new String[scores.length];
		List<Long> positions;
		int index;
		long position;
		String[] pair;
		positions = this.getPositions(points);
		Long value;
        long moneyPaid = 0;
        long sum = 0;

		Map<Long, Long> histogram = Histogram.findHistogram(positions);

		for (int i = 0; i < scores.length; i++) {
			pair = scores[i].split(":");
			index = points.indexOf(Float.parseFloat(pair[1]));
			position = positions.get(index);
			out[i] = pair[0] + ": " + position;

			if (position <= 3 && Float.parseFloat(pair[1]) > 0 ) {
				value = histogram.get(position);
				
				if ( position <= 3 ) {
				   int k = (int) (position -1) ;	
				   while ( k < money.length && k < value  ) {
					   sum += money[k];
					   k++;
				   }
				   moneyPaid = sum / value;  
				}
				sum = 0;
			}
			out[i] += ", " + moneyPaid;
			moneyPaid = 0;
		}
		return out;
	}

	private List<Long> getPositions(List<Float> points) {

		List<Long> positions = new ArrayList<Long>();
		long index = 1;
		long indexOld = 0;
		for (int i = 0; i < points.size(); i++) {
			if (i == 0) {
				positions.add(index);
				indexOld = index;
			} else {
				if (points.get(i).equals(points.get(i - 1))) {
					positions.add(indexOld);
				} else {
					positions.add(index);
					indexOld = index;
				}
			}
			index++;
		}
		return positions;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EndOfContest contest = new EndOfContest();
		contest.calcEarnings(new String[] { "ads: 550.34", "talub: 2102.98",
				"romana: 1123.21", "mike: -1000.00", "td: 1123.21",
				"dok: 1123.21", "dwarfsleepy: 812.12" }, new int[] { 300, 150,
				75 });
		// contest.calcEarnings(new String[] { "ads: 550", "talub: 550",
		// "talub: 550", "talub: 550", "alub: 50", }, new int[] { 300,
		// 150, 75 });
	}

}
