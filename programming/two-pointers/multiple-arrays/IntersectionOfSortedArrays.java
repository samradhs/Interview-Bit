// https://www.interviewbit.com/problems/intersection-of-sorted-arrays/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        
        ArrayList<Integer> C = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while (i < A.size() && j < B.size()) {
            
            if (A.get(i) > B.get(j)) {
                j++;
                
            } else if (A.get(i) < B.get(j)) {
                i++;
                
            } else {
                C.add(A.get(i));
                i++;
                j++;
            }
        }
        
        return C;
    }
}
