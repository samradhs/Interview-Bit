// https://www.interviewbit.com/problems/length-of-last-word/

public class Solution {
	public int lengthOfLastWord(final String a) {
	    
	    int len = 0;
	    
	    for (int i = a.length() - 1; i >= 0; i--) {
	        
	        char c = a.charAt(i);
	       
	        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
	            len++;
	        } else if (c == ' ' && len != 0) {
	            break;
	        }
	    }
	    
	    return len;
	}
}
