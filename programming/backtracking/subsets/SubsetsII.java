// https://www.interviewbit.com/courses/programming/topics/backtracking/

public class Solution {
    
  private ArrayList<ArrayList<Integer>> res = new ArrayList<>();
  
  public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
      
    res.add(new ArrayList<Integer>());
    if (A.isEmpty()) return res;
    
    Collections.sort(A);
    int[] data = new int[A.size()];
    backTrack(data, 0, A);
    
    Collections.sort(res, new Comparator<ArrayList<Integer>>() {
      @Override
      public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
        int an = a.size();
        int bn = b.size();
        for (int i = 0; i < Math.min(an, bn); i++) {
          int cmp = Integer.compare(a.get(i), b.get(i));
          if (cmp != 0)
            return cmp;
        }
        return Integer.compare(a.size(), b.size());
      }
    });
    
    return res;
  }

  public void processSolution(int[] data, ArrayList<Integer> A) {
      
    ArrayList<Integer> temp = new ArrayList<Integer>();
    for (int i = 0; i < A.size(); i++) {
        
      if(data[i] == 1) {
        temp.add(A.get(i));
      }
    }
    
    int j = 0;
    for (; j < res.size(); j++) {
        
      if (res.get(j).size() == temp.size()) {
          
        int k = 0;
        for (; k < temp.size(); k++) {
          if (res.get(j).get(k) != temp.get(k)) break;
        }
        
        if (k == temp.size()) break;
      }
    }
    
    if (j == res.size()) res.add(temp);
  }
    
  public void backTrack(int[] data, int k, ArrayList<Integer> A){
      
    if(k == A.size()){
      processSolution(data, A);
        
    } else {
      for(int i=0; i <= 1; i++) {
          
        data[k] = i;
        backTrack(data, k+1, A);
      }
    }
  }
}
