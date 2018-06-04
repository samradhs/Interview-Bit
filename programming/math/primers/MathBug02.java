// https://www.interviewbit.com/problems/mathbug02/

public class Solution {
	public ArrayList<ArrayList<Integer>> squareSum(int A) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

		for (int b = 0; b * b < A; b++) {
			for (int a = 0; a <= b; a++) {
			    
				if (a * a + b * b == A) {
					ArrayList<Integer> newEntry = new ArrayList<Integer>();
					newEntry.add(a);
					newEntry.add(b);
					ans.add(newEntry);
				}
			}
		}
		return ans;
	}
}
