// https://www.interviewbit.com/problems/square-root-of-integer/

public class Solution {
	public int sqrt(int a) {
	    
	    if (a == 0 || a == 1) return a;
	    
	    int low = 0;
	    int high = a;
	    int mid = 0;
	    
	    while (low <= high) {
	        
	        mid = low + (high - low) / 2;
	        int div = a / mid;
	        if (div == mid) return mid;
	        if (div < mid) high = mid - 1;
	        else low = mid + 1;
	    }
	    
	    return high;
	}
}
