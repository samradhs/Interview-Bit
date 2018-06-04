// https://www.interviewbit.com/problems/binary-representation/

public class Solution {
	public String findDigitsInBinary(int a) {
	    
	    if (a == 0) return "0";
	    
	    String b = "";
	    while (a > 1) {
	        b = a % 2 + b;
	        a = a / 2;
	    }
	    
	    b = 1 + b;
	    return b;
	}
}
