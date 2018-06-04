// https://www.interviewbit.com/problems/largest-coprime-divisor/

public class Solution {
    public int cpFact(int A, int B) {
        
        while (true) {
            int gcd = gcd(A, B);
            A /= gcd;  
            if (gcd == 1) break;
        }
        
        return A;
    }
    
    private int gcd(int a, int b) {
        
        while(a != b)
        {
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        
        return a;
    }
}
