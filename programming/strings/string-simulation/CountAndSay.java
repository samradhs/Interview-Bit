// https://www.interviewbit.com/problems/count-and-say/

public class Solution {
	public String countAndSay(int a) {
	    if(a<1) {
	        return "";
	    }
	    String result = "1";
	    for(int i=2;i<=a;i++) {
	        int count =1;
	        StringBuilder temp = new StringBuilder("");
	        char c=result.charAt(0);
	        for(int j=1;j<result.length();j++) {
	            if(c==result.charAt(j)) {
	                count++;
	            } else {
	                temp.append(count);
	                temp.append(c);
	                c = result.charAt(j);
	                count = 1;
	            }
	        }
	        temp.append(count);
	        temp.append(c);
	        result = temp.toString();
	    }
	    return result;
	}
}
