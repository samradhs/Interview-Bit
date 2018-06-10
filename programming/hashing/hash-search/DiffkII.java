// https://www.interviewbit.com/problems/diffk-ii/

public class Solution {
  // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
  public int diffPossible(final int[] A, int B) {
      
    HashMap<Integer, Set<Integer>> hash = new HashMap<>();
    for (int i = 0; i < A.length; i++) {
        
      int val = A[i];
      int addVal = val + B;
      
      Set<Integer> set = hash.get(val);
      if (set == null) set = new HashSet<>();
      set.add(i);
      hash.put(val, set);
      
      Set<Integer> set1 = hash.get(addVal);
      if (set1 == null) set1 = new HashSet<>();
      set1.add(i);
      hash.put(addVal, set);
    }
    
    for (Set<Integer> s: hash.values()) {
      if (s.size() > 1) {
          return 1;
      }
    }
    
    return 0;
  }
}
