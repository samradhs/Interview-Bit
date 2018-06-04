// https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/

public class Solution {
    public int solve(String A) {
      
        StringBuilder sb = new StringBuilder(A);
        String rA = sb.reverse().toString();
        
        String concat = A + "$" + rA;
        ArrayList<Integer> list = computeLPS(concat);
        
        return A.length() - list.get(list.size() - 1);
    }
    
    private ArrayList<Integer> computeLPS(String s) {
        
        ArrayList<Integer> a = new ArrayList<>();
        int m = s.length();
        
        int len = 0;
        a.add(0);
        
        int i = 1;
        while (i < m) {
            
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                a.add(i, len);
                i++;
                
            } else {
                if (len != 0) {
                    len = a.get(len - 1);
                
                } else {
                    a.add(i, 0);
                    i++;
                }
            }
        }
        
        return a;
    }
}
