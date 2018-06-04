// https://www.interviewbit.com/problems/reverse-bits/

public class Solution {
	public long reverse(long a) {
	    
	    if (a == 0) return 0;
	    
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    while (a > 0) {
	        
	        list.add(0, (int) (a % 2));
	        a /= 2;
	    }
	    
	    while (list.size() < 32) {
	        list.add(0, 0);
	    }
	    
	    long num = 0;
	    long counter = 1;
	    
	    for (Integer i: list) {
	        num += i * counter;
	        counter *= 2;
	    }
	    
	    return num;
	}
}
