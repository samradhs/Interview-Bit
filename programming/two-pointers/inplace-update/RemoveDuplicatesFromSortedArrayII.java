// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array-ii/

public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    
	    int n = a.size();
	    if (n <= 2) return n;
	    
	    int p1 = a.get(n - 1);
	    int p2 = a.get(n - 2);
	    
	    for (int i = n - 3; i >= 0; i--) {
	        
	        if (p1 == p2 && p1 == a.get(i)) {
	            a.remove(i);
	        } else {
	            p1 = p2;
	            p2 = a.get(i);
	        }
	    }
	    
	    return a.size();
	}
}
