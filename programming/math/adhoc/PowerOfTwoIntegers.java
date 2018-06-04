// https://www.interviewbit.com/problems/power-of-two-integers/

public class Solution {
    public boolean isPower(int a) {
        
        if (a == 1) return true;
        
        int sq = (int) Math.sqrt(a);
        
        for (int i = 2; i <= sq; i++) {
            int j = 2;
            int p;
            
            while (true) {
                p = (int) Math.pow(i, j);
                if (p == a) return true;
                if (p > a) break;
                j++;
            }
        }
        
        return false;
    }
}
