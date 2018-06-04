// https://www.interviewbit.com/problems/valid-number/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    
    private boolean isValid(String a, boolean isExp) {
        
        boolean isPrefix = false;
        boolean isDot    = false;
        boolean isNum    = false;
        
        for (int i = 0; i < a.length(); i++) {
            
            char c = a.charAt(i);
            if (c == ' ') return false;
            
            if (c == '-' || c == '+') {
                if (isPrefix || isDot || isNum) return false;
                isPrefix = true;
                continue;
            }
            
            if (c == '.') {
                if (isExp || i == a.length() - 1) return false;
                isDot = true;
                continue;
            }
            
            if (c >= '0' && c <= '9') {
                isNum = true;
                continue;
            }
            
            return false;
        }
        
        return isNum;
    }
    
    public int isNumber(final String A) {
        
        int i = 0;
        while (i < A.length() && A.charAt(i) == ' ') i++;
        int startIndex = i;
        
        if (startIndex == A.length()) return 0;
        
        i = A.length() - 1;
        while (A.charAt(i) == ' ') i--;
        int lastIndex = i;
        
        String s = A.substring(startIndex, lastIndex + 1);
        
        int indexOfE = s.indexOf('e');
        if (indexOfE == 0) return 0;
        
        if (indexOfE == -1) return isValid(s, false) ? 1 : 0;
        
        if (indexOfE != s.lastIndexOf('e')) return 0;
        
        return (isValid(s.substring(0, indexOfE), false) && isValid(s.substring(indexOfE + 1, s.length()), true)) ? 1 : 0;
    }
}
