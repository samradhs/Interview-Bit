// https://www.interviewbit.com/problems/palindrome-integer/

public class Solution {
	public boolean isPalindrome(int a) {
	    
	    // Assumption is all negative numbers are not palindrome.
	    if (a < 0) return false;
	    
	    int div = 1;
	    while (a / div >= 10) {
	        div *= 10;
	    }
	    
	    while (a != 0) {
	        
	        int leading = a / div;
	        int trailing = a % 10;
	        
	        if (leading != trailing) return false;
	        
	        a = a % div / 10;
	        div /= 100;
	    }
	    
	    return true;
	}
}
