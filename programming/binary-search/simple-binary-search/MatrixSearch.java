// https://www.interviewbit.com/problems/matrix-search/

public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    
	    if (a.isEmpty()) return 0;
	    int m = a.size();
	    int n = a.get(0).size();
	    
	    int i = 0, j = n - 1;
	    
	    while (i < m && j >= 0) {
	       
	        if (a.get(i).get(j) == b) return 1;
	        
	        if (a.get(i).get(j) > b) j--;
	        else i++;
	    }
	    
	    return 0;
	}
}
