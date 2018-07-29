// https://www.interviewbit.com/problems/best-time-to-buy-and-sell-stocks-iii/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        
        if (A == null || A.isEmpty() || A.size() == 1) return 0;
        
        int n       = A.size();
        int k       = 2;
        int[][] arr = new int[k + 1][n];
        
        for (int i = 1; i <= k; i++) {
            int maxDiff = arr[i - 1][0] - A.get(0);
            
            for (int j = 1; j < n; j++) {
                arr[i][j]   = Math.max(arr[i][j - 1], A.get(j) + maxDiff);
                maxDiff     = Math.max(maxDiff, arr[i - 1][j] - A.get(j));
            }
        }
        
        return arr[k][n - 1];
    }
}