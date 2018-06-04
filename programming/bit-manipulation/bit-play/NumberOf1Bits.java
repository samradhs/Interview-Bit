// https://www.interviewbit.com/problems/number-of-1-bits/

public class Solution {
	public int numSetBits(long a) {
	    
    int count = 0;
    while (a > 1) {
        
        if (a % 2 == 1) count++;
        a /= 2;
    }
    
    if (a == 1) count++;
    return count;
	}
}