// https://www.interviewbit.com/problems/palindrome-string/

public class Solution {
	public int isPalindrome(String a) {
	    
	    a = a.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	    
	    return a.equals(new StringBuilder(a).reverse().toString()) ? 1 : 0;
	}
}
