// https://www.interviewbit.com/problems/container-with-most-water/

public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        
        int l = 0;
        int r = A.size() - 1;
        int area = 0;
        
        while (l < r) {
            
            area = Math.max(area, Math.min(A.get(l), A.get(r)) * (r - l));
            
            if (A.get(l) < A.get(r)) {
                l++;
            } else {
                r--;
            }
        }
        
        return area;
    }
}
