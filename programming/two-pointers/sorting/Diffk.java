// https://www.interviewbit.com/problems/diffk/

public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        
        if (A.isEmpty()) return 0;
        
        if (B == 0) {
            for (Integer i: A) {
                if (A.indexOf(i) != A.lastIndexOf(i)) return 1;
            }
            
        } else if (A.get(A.size() - 1) - A.get(0) < B) {
            return 0;
            
        } else {
            for (int i = A.size() - 1; i >= 0; i--) {
                if (A.contains(A.get(i) - B)) return 1;
            }
        }
        
        return 0;
    }
}
