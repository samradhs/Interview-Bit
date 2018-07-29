// https://www.interviewbit.com/problems/best-time-to-buy-and-sell-stocks-i/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
         
        if (A == null || A.isEmpty() || A.size() == 1) return 0;
    
        int min     = A.get(0);
        int maxPr   = 0;
        
        for (int i = 1; i < A.size(); i++) {
            
            int value = A.get(i);
            if (value < min) min = value;
            
            maxPr = Math.max(maxPr, value - min);
        }
        
        return maxPr;
    }
}
