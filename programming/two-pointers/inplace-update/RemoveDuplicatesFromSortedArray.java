// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/

public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    
	    int n = a.size();
	    if (n == 0 || n == 1) return n;
	    
	    int prev = a.get(n - 1);
	    for (int i = n - 2; i >= 0; i--) {
	        
	        if (a.get(i) == prev) a.remove(i);
	        else prev = a.get(i);
	    }
	    
	    return a.size();
	}
}
