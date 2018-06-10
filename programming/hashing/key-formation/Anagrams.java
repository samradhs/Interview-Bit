// https://www.interviewbit.com/problems/anagrams/

public class Solution {
  // DO NOT MODIFY THE LIST. IT IS READ ONLY
  public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
      
    LinkedHashMap<String, ArrayList<Integer>> map = new LinkedHashMap<>(); 
    
    for (int i = 0; i < A.size(); i++) {
        
      char[] arr = A.get(i).toCharArray();
      Arrays.sort(arr);
      String str = String.valueOf(arr);
      
      ArrayList<Integer> l = map.get(str);
      if (l != null) {
        l.add(i + 1);
      } else {
        l = new ArrayList<>();
        l.add(i + 1);
        map.put(str, l);
      }
    }
    
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    for (ArrayList<Integer> list: map.values()) {
      result.add(list);
    }
    
    return result;
  }
}
