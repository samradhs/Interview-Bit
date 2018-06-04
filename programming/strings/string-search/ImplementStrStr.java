// https://www.interviewbit.com/problems/implement-strstr/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        
        if (A.length() == 0 || B.length() == 0 || A.length() < B.length()) return -1;
        if (A.equals(B)) return 0;
        
        for (int i = 0; i <= (A.length() - B.length()); i++) {
            
            int counter = 0;
            while (A.charAt(i + counter) == B.charAt(counter)) {
                if (++counter == B.length()) return i;
            }
        }
        
        return -1;
    }
}
