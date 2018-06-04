// https://www.interviewbit.com/problems/set-matrix-zeros/

public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    
	    Set<Integer> rows = new HashSet<Integer>();
	    Set<Integer> columns = new HashSet<Integer>();
	    
	    for (int i = 0; i < a.size(); i++) {
	        
	        for(int j = 0; j < a.get(0).size(); j++) {
	                
                if (a.get(i).get(j) == 0) {
                    rows.add(i);
                    columns.add(j);
                }
	        }
	    }
	    
	    for (int i = 0; i < a.size(); i++) {
	        
	        for (int j = 0; j < a.get(0).size(); j++) {
	            
	            if (rows.contains(i) || columns.contains(j)) {
	                a.get(i).set(j, 0); 
	            }
	        }
	    }
	}
}
