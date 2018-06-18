// https://www.interviewbit.com/problems/substring-concatenation/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findSubstring(String A, final List<String> B) {
        
        ArrayList<Integer> result = new ArrayList<>();
        if (A == null || A.length() == 0 || B == null || B.size() == 0) return result;
        
        HashMap<String, Integer> subStrMap = new HashMap<>();
        for (String subStr: B) {
            if (!subStrMap.containsKey(subStr)) subStrMap.put(subStr, 1);
            else subStrMap.put(subStr, subStrMap.get(subStr) + 1);
        }
        
        int lengthA     = A.length();
        int sizeB       = B.size();
        int wordLength  = B.get(0).length();
        int sizeBTotal  = sizeB * wordLength;
        
        for (int i = 0; i <= lengthA - sizeBTotal; i++) {
            HashMap<String, Integer> tempMap = (HashMap<String, Integer>) subStrMap.clone();
            
            for (int j = i; j < i + sizeBTotal; j += wordLength) {
                
                String subStr = A.substring(j, j + wordLength);
                if (!tempMap.containsKey(subStr)) break;
                
                int count = tempMap.get(subStr);
                if (count > 1) tempMap.put(subStr, count - 1);
                else tempMap.remove(subStr);
            }
            
            if (tempMap.isEmpty()) result.add(i);
        }
        
        return result;
    }
}