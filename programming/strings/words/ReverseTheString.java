// https://www.interviewbit.com/problems/reverse-the-string/

public class Solution {
	public String reverseWords(String a) {
	    
	    StringBuilder res = new StringBuilder();
	    StringBuilder sb  = new StringBuilder();
	    
	    for (int i = a.length() - 1; i >= 0; i--) {
	        
	        char c = a.charAt(i);
	        
	        if (c == ' ') {
	            if (sb.length() == 0) continue;
	            res.append(sb.toString());
	            res.append(c);
	            sb = new StringBuilder();
	            
	        } else {
	            sb.insert(0, c);
	        }
	    }
	    
	    if (sb.length() != 0) res.append(sb.toString());
	    else if (res.length() != 0) res = res.deleteCharAt(res.length() - 1);
	    
	    return res.toString();
	}
}
