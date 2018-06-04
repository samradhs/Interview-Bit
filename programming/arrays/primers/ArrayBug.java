// https://www.interviewbit.com/problems/arraybug/

public class Solution {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		if (B > A.size()) {
		    B = B % A.size();  
		}
		
		if (B < A.size()) {
    		for (int i = B; i < A.size(); i++) {
    			ret.add(A.get(i));
    		}
		}
		
		for (int i = 0; i < B; i++) {
		    ret.add(A.get(i));
		}
		
		return ret;
	}
}
