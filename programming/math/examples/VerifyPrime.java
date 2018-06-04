// https://www.interviewbit.com/problems/verify-prime/

public class Solution {
	public int isPrime(int a) {
	    
	    if (a == 2) return 1;
	    
	    int i = 2;
	    while (i < a) {
	        
	        if (a % i == 0) break;
	        i++;
	    }
	    
	    if (a == i) return 1;
	    else return 0;
	}
}
