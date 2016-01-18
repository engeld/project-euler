/******************************************************************************
 *  Compilation:  javac Problem1.java
 *  Execution:    java Problem1
 *  
 *  Project Euler-Title: Multiples of 3 and 5
 *
 *  Solves Problem #1 from Project Euler, which is:
 *  >  If we list all the natural numbers below 10 that are multiples 
 *  >  of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *  >
 *  > Find the sum of all the multiples of 3 or 5 below 1000.
 *
 ******************************************************************************/

public class Problem1 {
	final static int STARTING_VALUE = 999;

    public static void main(String[] args) {
    	int sum = 0;
    	
    	for(int i=STARTING_VALUE; i>0; i--){
    		if( (i % 3 == 0) || (i % 5 == 0)){
    			System.out.println(i);
    			sum = sum + i;
    		}
    	}
    	
    	System.out.println("\n" + sum);
    }
}
