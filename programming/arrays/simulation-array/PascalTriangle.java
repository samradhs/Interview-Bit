// https://www.interviewbit.com/problems/pascal-triangle/

public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
    
        ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> prevArray = new ArrayList<Integer>(); 
        
        for (int i = 0; i < a; i++) {
          
            ArrayList<Integer> curArray = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
            
                if (j == 0 || j == i) {
                	curArray.add(1);
                } else {
                	curArray.add(prevArray.get(j) + prevArray.get(j - 1));
                }
            }
          
            prevArray = curArray;
            pascal.add(curArray);
        }
        
        return pascal;
	}
}
