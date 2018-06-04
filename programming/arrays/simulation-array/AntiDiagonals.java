// https://www.interviewbit.com/problems/anti-diagonals/

public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
	    
	    int m = a.size();
	    
	    ArrayList<ArrayList<Integer>> antiDiag = new ArrayList<ArrayList<Integer>>();
	    
	    for (int i = 0; i < m; i++) {
	        
	        int y = i;
	        
	        ArrayList<Integer> z = new ArrayList<Integer>();
	        for (int x = 0; x <= i; x++) {
	            z.add(a.get(x).get(y));
	            y--;
	        }
	        
	        antiDiag.add(z);
	    }
	    
	    for (int i = 1; i < m; i++) {
	        
	        int y = m - 1;
	        
	        ArrayList<Integer> z = new ArrayList<Integer>();
	        for (int x = i; x < m; x++) {
	            z.add(a.get(x).get(y));
	            y--;
	        }
	        
	        antiDiag.add(z);
	    }
	    
	    return antiDiag;
	}
}
