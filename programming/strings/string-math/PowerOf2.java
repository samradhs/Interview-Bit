// https://www.interviewbit.com/problems/power-of-2/

import java.math.BigInteger;
public class Solution {
    public int power(String A) {
        
        if (A == null) return 0;
        
        int lastInt = Character.getNumericValue(A.charAt(A.length() - 1));
        if (lastInt == 0 || lastInt % 2 != 0) return 0;
        
        BigInteger bi = new BigInteger(A);
        for (int i = 0; i < bi.bitLength() - 1; i++) {
            if (bi.testBit(i)) return 0;
        }
        
        return bi.testBit(bi.bitLength() - 1) ? 1 : 0;
    }
}
