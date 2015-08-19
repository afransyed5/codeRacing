package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         You are studying for the final exam in a tough course, and want to
 *         know how many points you need to score on the final to pass the
 *         course. You know how many points you earned on each assignment
 *         (pointsEarned), how many points were possible on each assignment
 *         (pointsPossible), and how many points are possible on the final exam
 *         (finalExam). You need to earn a minimum of 65% of the total possible
 *         points to pass the course. Assume your score on the final exam will
 *         be an integral number of points between 0 and finalExam, inclusive.
 *         Return the number of points you need to score on the final to pass
 *         the course, or -1 if it is impossible for you to pass the course.
 * 
 *         Definition
 * 
 *         Class: PassingGrade 
 *         Method: pointsNeeded 
 *         Parameters: int[], int[], int 
 *         Returns: int
 *          
 *         Method signature: 
 *         public int pointsNeeded(int[] pointsEarned, 
 *         int[] pointsPossible, int finalExam)
 * 
 * 
 *         Constraints - pointsEarned contains between 1 and 20 elements,
 *         inclusive. - pointsPossible contains the same number of elements as
 *         pointsEarned. - Each element of pointsPossible is between 1 and 1000,
 *         inclusive. - Element i of pointsEarned is between 0 and element i of
 *         pointsPossible, inclusive. - finalExam is between 1 and 3000,
 *         inclusive.
 * 
 *         Examples 
 *         0)
 *         {55,77,82,60}
 * 
 *         {100,100,100,100}
 * 
 *         300
 * 
 *         Returns: 181
 * 
 *         If you score 181 points on the final, then you will finish the course
 *         with exactly 65% of the possible points. 
 *         
 *         1)
 *         { 1, 2, 3, 4 }
 * 
 *         { 2, 3, 4, 5 }
 * 
 *         7
 * 
 *         Returns: 4
 * 
 *         If you score 4 points on the final, then you pass with 66.7% of the
 *         total possible points, but if you score 3 points on the final, then
 *         you fail with 61.9% of the possible points. 
 *         
 *         2)
 *         { 1, 2, 2, 1 }
 * 
 *         { 9, 9, 9, 9 }
 * 
 *         9
 * 
 *         Returns: -1
 * 
 *         Even if you score 9 points on the final, you still fail with 33.3% of
 *         the possible points. 
 *         
 *         3)
 *         { 7, 8, 7, 6 }
 * 
 *         { 8, 8, 8, 8 }
 * 
 *         9
 * 
 *         Returns: 0 
 *         47.45
 * 
 *         You will pass even if you score 0 points on the final. 
 *         
 *         4)
 *         { 17, 23, 50, 200, 19, 56, 83, 91, 77, 9, 0 }
 * 
 *         { 20, 30, 50, 250, 20, 70, 100, 100, 100, 10, 10 }
 * 
 *         400
 * 
 *         Returns: 129
 * 
 *         5)
 *         {600,600,600,600,600,600,600,600,600,600,
 *         600,600,600,600,600,600,600,600,600,600}
 * 
 *         {1000,1000,1000,1000,1000,1000,1000,1000,
 *         1000,1000,1000,1000,1000,1000,1000,1000, 1000,1000,1000,901}
 * 
 *         3000
 * 
 *         Returns: 2886
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: 
 *         Single Round Match 185 Round 1 - Division II, Level One
 *         
 *         Score: 249.87/250
 *         
 */

public class PassingGrade {
	public int pointsNeeded(int[] pointsEarned, int[] pointsPossible, int finalExam) {
		int pointsNeeded = finalExam;
		int pointsGot = 0;
		int x;
		
		for ( int n : pointsEarned )
			pointsGot += n; 
				
		for (int n : pointsPossible)
			pointsNeeded += n;
		 
		pointsNeeded = (int) Math.ceil(pointsNeeded * 0.65);
		
		return  finalExam < pointsNeeded - pointsGot ?  -1 :  
			(pointsNeeded - pointsGot) > 0 ? pointsNeeded - pointsGot : 0 ; 
	}
}
