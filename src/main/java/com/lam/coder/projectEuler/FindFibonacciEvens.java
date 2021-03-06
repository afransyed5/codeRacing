package com.lam.coder.projectEuler;


public class FindFibonacciEvens {

	/**
	 * Problem 2: Even Fibonacci numbers
	 * 
     * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
     * By starting with 1 and 2, the first 10 terms will be:
     *
     *  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     *
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
     * find the sum of the even-valued terms.	 
*/


    public int calculate(int n) {
        if ( n == 0 || n == 1 ) {
        	return 1;
        };
        
        int result = 0; 
        int a,b;
        a = 0;
        b = 1;
        
        for ( int i = 0; i < n; i++ ) {
        	result = a + b;
        	a = b;
        	b = result;
        };
        return result;
    }
    
    public int calculateSummaEven(int upperLimit) {
 		int result = 0;
		int i = 0;
        int aux = 0;
        int summa = 0;
		while ( (aux = this.calculate(i++)) < upperLimit ) {
			result = aux;
			if ( result % 2 == 0 ) {
	               summa += result;				
			} else {
 			}
		//	System.out.println(i + ": " + result);
		};
		// System.out.println( "Summa: " + summa);
		return summa;
   }
    
    public int calculateSummaEvenImprove(int limit) {
    
    	int aux = 0;
        int a = 1, b = 1;
        int summa = 0;
        
        while ( b < limit ) {
        	if ( b % 2 == 0 ) {
        		summa += b;		
        	} else {
        	}
            aux = a + b;
        	a = b;
        	b = aux;
        };
        return summa;
   }

    public int calculateSummaEvenImproveBest(int limit) {
        int a = 1, b = 1;
        int c = a + b;
        int summa = 0;
        
        while ( c < limit ) {
        	summa += c;
            a = b + c;
        	b = a + c;
        	c = a + b;
        };
        return summa;
   }
   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFibonacciEvens fibonacci = new FindFibonacciEvens();
		// 4613732 for 4000000 4613732
		int limit = 4000000;
		System.out.println(fibonacci.calculateSummaEven(limit));
		System.out.println(fibonacci.calculateSummaEvenImprove(limit));
		System.out.println(fibonacci.calculateSummaEvenImproveBest(limit));
	}

}
