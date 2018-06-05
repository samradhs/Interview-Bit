// https://www.interviewbit.com/problems/permutations/

public class Solution {
    
  ArrayList<ArrayList<Integer>> result = new ArrayList<>();
      
  public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
      
    ArrayList<Integer> data = new ArrayList<>();
    
    for (int i = 0; i < A.size(); i++) {
        
      data = new ArrayList<>();
      data.add(A.get(i));
      combination(A, data, 1);
    }
    
    return result;
  }
  
  private void combination(ArrayList<Integer> arr, ArrayList<Integer> data, int index) {
      
    if (index == arr.size()) {
      ArrayList<Integer> res = new ArrayList<>(data);
      // System.out.println(data);
      result.add(res);
      // System.out.println(result);
      return;
    }
    
    for (int i = 0; i < arr.size(); i++) {
        
      int j = 0;
      for (; j < index; j++) {
        if (data.get(j) == arr.get(i)) break;
      }
      
      if (j < index) continue;
      
      if (data.size() > index) {
        data.set(index, arr.get(i));
      } else {
        data.add(index, arr.get(i));
      }
      
      combination(arr, data, index + 1);
    }
  }
}
