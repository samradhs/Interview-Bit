// https://www.interviewbit.com/problems/simplify-directory-path/

public class Solution {
    public String simplifyPath(String A) {
        if (A == null || A.length() == 0) {
	        return "/";
	    }
	    
	    String[] s = A.split("[/]");
	    StringBuilder path = new StringBuilder();

	    int i = 0;
	    String[] stack = new String[s.length];
	    for (int j = 0; j < s.length; j++) {
	        if (s[j].equals(".") || s[j].equals("")) {
	            continue;
	        }
	        if (s[j].equals("..")) {
	            if (i > 0) {
	                i--;
	            }
	        }else{
	            stack[i++] = s[j];
	        }
	    }
	    for (int j = 0; j < i; j++){
	        
	        path.append("/" + stack[j]);
	    }
	    return i == 0 ? "/" : path.toString();
    }
}
