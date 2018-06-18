// https://www.interviewbit.com/problems/ways-to-form-max-heap/

public class Solution {
    
    private static final int MAXN = 101;
    private static final int MOD  = 1000000007;
    
    private int dp[]    = new int[MAXN];
    private int nck[][] = new int[MAXN][MAXN];
    private int log2[]  = new int[MAXN]; 
    
    public int solve(int A) {
        
        for (int i = 0; i <= A; i++) {
            dp[i] = -1;
        }
        
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= A; j++) {
                nck[i][j] = -1;
            }
        }
        
        int curLog2   = -1;
        int curPower2 = 1;
        
        for (int i = 1; i <= A; i++) {
            if (curPower2 == i) {
                curLog2++;
                curPower2 *= 2;
            }
            
            log2[i] = curLog2;
        }
        
        return numberOfHeaps(A);
    }
    
    private int numberOfHeaps(int n) {
        
        if (n <= 1) return 1;
        if (dp[n] != -1) return dp[n];
        
        int left        = getLeft(n);
        long choose     = choose(n - 1, left);
        long numLeft    = numberOfHeaps(left);
        long numRight   = numberOfHeaps(n - 1 - left);
        
        if (choose > MOD)       choose %= MOD;
        if (numLeft > MOD)      numLeft %= MOD;
        if (numRight > MOD)     numRight %= MOD;
        
        long ans     = choose * numLeft;
        int finalAns = (int) (ans > MOD ? ans % MOD : ans);
        
        ans      = finalAns * numRight;
        finalAns = (int) (ans > MOD ? ans % MOD : ans);
        
        dp[n] = finalAns;
        return finalAns;
    }
    
    private int getLeft(int n) {
        
        if (n == 1) return 0;
        int h = log2[n];
        
        int numh = (1 << h);
        int last = n - ((1 << h) - 1);
        
        if (last >= numh / 2)   return (1 << h) - 1;
        else                    return (1 << h) - 1 - ((numh / 2) - last);
    }
    
    private int choose(int n, int k) {
        
        if (k > n)              return 0;
        if (n <= 1)             return 1;
        if (k == 0)             return 1;
        if (nck[n][k] != -1)    return nck[n][k];
        
        long answer = choose(n - 1, k - 1) + choose(n - 1, k);
        int ans     = (int) (answer > MOD ? answer % MOD : answer);
        
        nck[n][k] = ans;
        return ans;
    }
}
