// https://www.interviewbit.com/problems/atoi/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int atoi(final String A) {
        
        if (A == null || A.length() == 0) return 0;
        
        int prevNum         = 0;
        int num             = 0;
        boolean numFound    = false;
        boolean isNeg       = false;
        
        for (int i = 0; i < A.length(); i++) {
            
            char c = A.charAt(i);
            if (c == '-') {
                if (numFound) return num;
                else {
                    isNeg = true;
                    continue;
                }
            }
            
            if (c == '+') {
                if (numFound) return num;
                continue;
            }
            
            if (c == ' ' || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (isNeg) num = -num;
                return num;
            }
            
            int cur = Character.getNumericValue(c);
            if (cur < 0 || cur > 9) {
                if (numFound)   continue;
                else            return 0;
            }
            
            numFound = true;
            num = num * 10 + cur;
            
            if ((num - cur) / 10 != prevNum) {
                if (isNeg)  return Integer.MIN_VALUE;
                else        return Integer.MAX_VALUE;
            }
            
            prevNum = num;
        }
        
        if (isNeg) num = -num;
        return num;
    }
}
