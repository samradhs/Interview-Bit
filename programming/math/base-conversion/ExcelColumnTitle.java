// https://www.interviewbit.com/problems/excel-column-title/

public class Solution {
	public String convertToTitle(int a) {
	    
	    StringBuilder sb = new StringBuilder();
	    
	    while (a > 0) {
	        
	        int m = a % 26;
	        
	        if (m == 0) {
	            a = (a / 26) - 1;
	            sb.insert(0, 'Z');
	            
	        } else {
	            a /= 26;
	            sb.insert(0, (char) ('A' + m - 1));
	        }
	    }
	    
	    return sb.toString();
	}
}
