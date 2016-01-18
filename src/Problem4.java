import java.util.ArrayList;
import java.util.Collections;

/******************************************************************************
 *  Compilation:  javac Problem4.java
 *  Execution:    java Problem4
 *
 *  Project Euler-Title: Largest palindrome product
 *
 *  Solves Problem #4 from Project Euler, which is:
 *  >  A palindromic number reads the same both ways. 
 *  >  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *  >
 *  >  Find the largest palindrome made from the product of two 3-digit numbers.
 *
 ******************************************************************************/

public class Problem4 {
	public static String possiblePalindrome;
	
	public static void main(String[] args) {
		// runTestcases();
		
		// Brute-force way:
		ArrayList<Integer> palindromes = new ArrayList<Integer>();
		
		for(int y=999;y>=100;y--){
			for(int x=999;x>=100;x--){
				int product = x*y;
				if( isPalindrome(Integer.toString(product)) ){
					palindromes.add(product);
					//System.out.println("The product of " + x + " and " + y + " is " + product + " which is a Palindrome");
				}
			}
		}
		
		Collections.sort(palindromes, Collections.reverseOrder());
		System.out.println(palindromes.get(0));
	}
	
	private static boolean isPalindrome(String possiblePalindrome) {
		int length = possiblePalindrome.length();
		
		for (int i=0;i<(length / 2) + 1;++i) {
			if (possiblePalindrome.charAt(i) != possiblePalindrome.charAt(length - i - 1)) {
				return false;
			}
		}

		return true;
	}
	
	private static void runTestcases(){
		// Testcases for my isPalindrome()-method
		possiblePalindrome = "9009";
		System.out.println(possiblePalindrome + " is a Palindrome: " + isPalindrome(possiblePalindrome));
		possiblePalindrome = "1089";
		System.out.println(possiblePalindrome + " is a Palindrome: " + isPalindrome(possiblePalindrome));
	}

}
