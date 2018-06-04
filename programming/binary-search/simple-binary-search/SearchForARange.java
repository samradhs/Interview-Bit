// https://www.interviewbit.com/problems/search-for-a-range/

public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    
	    ArrayList<Integer> res = new ArrayList<>();
	    res.add(-1);
	    res.add(-1);
	    
	    int leftIdx = extremeInsertIndex(a, b, true);
	    
	    if (leftIdx == a.size() || a.get(leftIdx) != b) {
	        return res;
	    }
	    
	    res.set(0, leftIdx);
	    res.set(1, extremeInsertIndex(a, b, false) - 1);
	    
	    return res;
	}
	
	private int extremeInsertIndex(List<Integer> nums, int target, boolean left) {
	    
	    int lo = 0;
	    int hi = nums.size();
	    
	    while (lo < hi) {
	        
	        int mid = (lo + hi) / 2;
	        if (nums.get(mid) > target || (left && target == nums.get(mid))) {
	            hi = mid;
	        } else {
	            lo = mid + 1;
	        }
	    }
	    
	    return lo;
	}
}
