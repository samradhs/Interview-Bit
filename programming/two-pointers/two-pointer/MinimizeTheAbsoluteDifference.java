// https://www.interviewbit.com/problems/minimize-the-absolute-difference/

public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        int diff = Integer.MAX_VALUE;
        
        while (i < A.size() && j < B.size() && k < C.size()) {
            
            int min = Math.min(Math.min(A.get(i), B.get(j)), C.get(k));
            int max = Math.max(Math.max(A.get(i), B.get(j)), C.get(k));
            
            if (Math.abs(max - min) < diff) {
                diff = Math.abs(max - min);
            }
            
            if (min == A.get(i)) i++;
            else if (min == B.get(j)) j++;
            else k++;
        }
        
        return diff;
    }
}
