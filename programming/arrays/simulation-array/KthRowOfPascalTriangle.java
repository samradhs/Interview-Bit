// https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/

public class Solution {
	public ArrayList<Integer> getRow(int a) {
    
        ArrayList<Integer> prevArray = new ArrayList<Integer>(); 
    
        for (int i = 0; i <= a; i++) {
      
            ArrayList<Integer> curArray = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
        
                if (j == 0 || j == i) {
        	        curArray.add(1);
                } else {    
        	        curArray.add(prevArray.get(j) + prevArray.get(j - 1));
                }
            }
     
            prevArray = curArray;
        }
        
        return prevArray;
    }
}
