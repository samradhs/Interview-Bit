// https://www.interviewbit.com/problems/longest-substring-without-repeat/

public class Solution {
    
  private static final int NUM_OF_CHARS = 256;
  
  public int lengthOfLongestSubstring(String A) {
      
    int curLen = 1;
    int maxLen = 1;
    int prevIndex;
    int i;
    
    int[] visited = new int[NUM_OF_CHARS];
    
    for (i = 0; i < NUM_OF_CHARS; i++) {
      visited[i] = -1;
    }
    
    visited[A.charAt(0)] = 0;
    
    for (i = 1; i < A.length(); i++) {
        
      prevIndex = visited[A.charAt(i)];
      
      if (prevIndex == -1 || prevIndex < i - curLen) {
        curLen++;
      } else {
        if (curLen > maxLen) maxLen = curLen;
        curLen = i - prevIndex;
      }
      
      visited[A.charAt(i)] = i;
    }
    
    if (curLen > maxLen) maxLen = curLen;
    return maxLen;
  }
}
