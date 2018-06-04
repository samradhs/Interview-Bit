// https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    
	    int size = a.size();
        int maxSoFar = a.get(0), curMax = a.get(0);
 
        for (int i = 1; i < size; i++)
        {
            curMax = Math.max(a.get(i), curMax + a.get(i));
            maxSoFar = Math.max(curMax, maxSoFar);
        }
        
        return maxSoFar;
	}
}
