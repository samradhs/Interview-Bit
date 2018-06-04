// https://www.interviewbit.com/problems/spiral-order-matrix-i/

public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 
		 int t = 0, b = a.size() - 1, l = 0, r = a.get(0).size() - 1;
		 int dir = 0;
		 
		 while (t <= b && l <= r) {
		     
		     if(dir == 0) {
		         for (int i = l; i <= r; i++) result.add(a.get(t).get(i));
	             t++;
	             
		     } else if(dir == 1) {
		         for (int i = t; i <= b; i++) result.add(a.get(i).get(r));
	             r--;
	             
		     } else if(dir == 2) {
		         for (int i = r; i >= l; i--) result.add(a.get(b).get(i));
	             b--;
	             
		     } else if(dir == 3) {
		         for (int i = b; i >= t; i--) result.add(a.get(i).get(l));
	             l++;
		     }
		     
		     dir = (dir + 1) % 4;
		 }
		 
		 return result;
	}
}
