// https://www.interviewbit.com/problems/excel-column-number/

public class Solution {
	public int titleToNumber(String a) {
	    
	    int num = 0;
	    for (int i = 0; i < a.length(); i++) {
	        
	        char c = a.charAt(i);
	        num *= 26;
	        num += (c - 'A' + 1);
	    }
	    
	    return num;
	}
}
