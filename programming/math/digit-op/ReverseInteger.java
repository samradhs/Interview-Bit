// https://www.interviewbit.com/problems/reverse-integer/

public class Solution {
    public int reverse(int A) {
        
        if (A >= 0 && A < 10) return A;
        
        boolean isNeg = A < 0;
        if (isNeg) A  = -A;
        
        int num     = 0;
        int prevNum = 0;
        
        while (A > 0) {
            
            int digit = A % 10;
            num       = num * 10 + digit;
            
            if ((num - digit) / 10 != prevNum) return 0;
            
            prevNum = num;
            A      /= 10;
        }
        
        if (isNeg) num = -num;
        return num;
    }
}
