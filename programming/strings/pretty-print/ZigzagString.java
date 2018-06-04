// https://www.interviewbit.com/problems/zigzag-string/

public class Solution {
    public String convert(String A, int B) {
        
        if (B == 1) return A;
        
        int sbSize = A.length() < B ? A.length() : B;
        StringBuilder[] sb = new StringBuilder[sbSize];
        
        int row = 0;
        boolean dirDown = true;
        
        for (int i = 0; i < A.length(); i++) {
            
            char c = A.charAt(i);
            
            if (sb[row] == null) sb[row] = new StringBuilder();
            sb[row].append(c);
            
            if (row == 0) {
                dirDown = true;
            } else if (row == B - 1) {
                dirDown = false;
            }
            
            if (dirDown) {
                row++;
            } else {
                row--;
            }
        }
        
        StringBuilder fSB = new StringBuilder();
        for (StringBuilder s: sb) {
            fSB.append(s.toString());
        }
        
        return fSB.toString();
    }
}
