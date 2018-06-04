// https://www.interviewbit.com/problems/find-duplicate-in-array/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    
	    if (a.size() > 1) {
			int slow = a.get(0);
			int fast = a.get(a.get(0));
			
			while (slow != fast) {
			    
				slow = a.get(slow);
				fast = a.get(a.get(fast));
			}

			fast = 0;
			while (fast != slow) {

				slow = a.get(slow);
				fast = a.get(fast);
			}
			
			return slow;
		}

		return -1;
	}
}
