// https://www.interviewbit.com/problems/best-time-to-buy-and-sell-stocks-ii/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        
        if (A == null || A.isEmpty() || A.size() == 1) return 0;
        
        int n       = A.size();
        int maxPr   = 0;
        
        for (int i = 0; i < n; i++) {
            
            while (i < n - 1 && A.get(i) >= A.get(i + 1)) i++;
            int buy = A.get(i);
            i++;
            
            if (i == n) break;
            
            while (i < n - 1 && A.get(i) <= A.get(i + 1)) i++;
            int sell = A.get(i);
            
            maxPr += (sell - buy);
        }
        
        return maxPr;
    }
}
