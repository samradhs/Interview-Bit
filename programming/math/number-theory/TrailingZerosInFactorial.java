// https://www.interviewbit.com/problems/trailing-zeros-in-factorial/

public class Solution {
	public int trailingZeroes(int a) {
	    
	    int count = 0;
	    while (a > 0) {
	        a /= 5;
	        count += a;
	    }
	    
	    return count;
	}
}
