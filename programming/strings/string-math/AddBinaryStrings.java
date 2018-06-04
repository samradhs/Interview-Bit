// https://www.interviewbit.com/problems/add-binary-strings/

public class Solution {
    public String addBinary(String A, String B) {
        
        StringBuilder sb = new StringBuilder();
        
        int l1 = A.length() - 1;
        int l2 = B.length() - 1;
        
        int c = 0;
        
        while (l1 >= 0 && l2 >= 0) {
            
            int x = Character.getNumericValue(A.charAt(l1));
            int y = Character.getNumericValue(B.charAt(l2));
            
            int z = x + y + c;
            
            if (z > 1) {
                z %= 2;
                c = 1;
                
            } else {
                c = 0;
            }
            
            sb.insert(0, z);
            l1--;
            l2--;
        }
        
        while (l1 >= 0) {
            
            int x = Character.getNumericValue(A.charAt(l1));
            int z = x + c;
            
            if (z > 1) {
                z %= 2;
                c = 1;
            } else {
                c = 0;
            }
            
            sb.insert(0, z);
            l1--;
        }
        
        while (l2 >= 0) {
            
            int y = Character.getNumericValue(B.charAt(l2));
            int z = y + c;
            
            if (z > 1) {
                z %= 2;
                c = 1;
            } else {
                c = 0;
            }
            
            sb.insert(0, z);
            l2--;
        }
        
        if (c == 1) sb.insert(0, c);
        return sb.toString();
    }
}
