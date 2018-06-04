// https://www.interviewbit.com/problems/multiply-strings/

public class Solution {
    public String multiply(String A, String B) {
        
        if (A == null || B == null) return "0";
        if (A.equals("0") || B.equals("0")) return "0";
        
        if (A.equals("1")) return B;
        if (B.equals("1")) return A;
        
        int[] res   = new int[A.length() + B.length()];
        int iA      = 0;
        
        for (int i = A.length() - 1; i >= 0; i--) {
            
            int iB      = 0;
            int carry   = 0;
            int n1      = Character.getNumericValue(A.charAt(i));
            
            for (int j = B.length() - 1; j >= 0; j--) {
                
                int n2  = Character.getNumericValue(B.charAt(j));
                int sum = (n1 * n2) + res[iA + iB] + carry;
                
                carry = sum / 10;
                res[iA + iB] = sum % 10;
                
                iB++;
            }
            
            if (carry > 0) {
                res[iA + iB] += carry;
            }
            
            iA++;
        }
        
        int i = res.length - 1;
        while (i >= 0 && res[i] == 0) i--;
        
        if (i == -1) return "0";
        
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            sb.append(res[i]);
            i--;
        }
        
        return sb.toString();
    }
}
