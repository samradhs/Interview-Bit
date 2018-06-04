// https://www.interviewbit.com/problems/single-number-ii/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        
        int ones = 0, twos = 0;
        int common;
        
        for (int i = 0; i < A.size(); i++) {
            
            twos = twos | (ones & A.get(i));
            ones = ones ^ A.get(i);
            common = ~(ones & twos);
            ones &= common;
            twos &= common;
        }
        
        return ones;
    }
}
