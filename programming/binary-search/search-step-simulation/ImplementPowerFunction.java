// https://www.interviewbit.com/problems/implement-power-function/

public class Solution {
	public int pow(int x, int n, int d) {
	    
	    if (d == 1 || x == 0 || x % d == 0) return 0;
	    if (n == 0) return 1;
	    
	    boolean check = false;
	    long rem = 1;
	    
	    if (x < 0) {
	        x = Math.abs(x);
	        if (n % 2 != 0) check = true;
	    }
	    
	    long temp = x % d;
	    
	    while (n != 0) {
	        
	        if (n % 2 != 0) rem = (rem * temp) % d;
	        temp = temp * temp;
	        temp = temp % d;
	        
	        n /= 2;
	        if (rem > d) rem = rem % d;
	    }
	    
	    if (check) return d - (int) rem;
	    return (int) rem;
	}
}
