// https://www.interviewbit.com/problems/single-number/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        
        int x = 0;
        for (Integer i: A) {
            
            x = x ^ i;
        }
        
        return x;
    }
}
