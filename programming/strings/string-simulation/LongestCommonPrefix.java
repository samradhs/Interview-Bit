// https://www.interviewbit.com/problems/longest-common-prefix/

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        
        if (A.size() == 0) return "";
        if (A.size() == 1) return A.get(0);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; ; i++) {
            
            if (i >= A.get(0).length()) break;
            char c = A.get(0).charAt(i);
            
            int j = 1;
            for (; j < A.size(); j++) {
                if (i >= A.get(j).length() || A.get(j).charAt(i) != c) break;
            }
            
            if (j == A.size()) sb.append(c);
            else break;
        }
        
        return sb.toString();
    }
}
