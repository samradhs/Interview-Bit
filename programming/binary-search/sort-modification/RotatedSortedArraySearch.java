// https://www.interviewbit.com/problems/rotated-sorted-array-search/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	    
    int l = 0;
    int h = a.size() - 1;
    
    while (l <= h) {
        
        int mid = l + (h - l)/2;
        
        if (a.get(mid) == b) return mid;
        
        if (a.get(l) <= a.get(mid)) {
            if (b >= a.get(l) && b <= a.get(mid)) h = mid - 1;
            else l = mid + 1;
        } else {
            if (b >= a.get(mid) && b <= a.get(h)) l = mid + 1;
            else h = mid - 1;
        }
    }
    
    return -1;
	}
}
