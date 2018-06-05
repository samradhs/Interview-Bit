// https://www.interviewbit.com/courses/programming/topics/backtracking/

public class Solution {
    
  private ArrayList<String> list = new ArrayList<>();
  private StringBuilder sb = new StringBuilder();
  
  public ArrayList<String> generateParenthesis(int A) {
      
    if (A >0) genPar(0, A, 0, 0);
    return list;
  }
  
  private void genPar(int pos, int n, int open, int close) {
      
    if (close == n) {
      list.add(0, sb.toString());
      return;
    }
    
    if (open > close) {
      if (sb.length() > pos) {
        sb.setCharAt(pos, ')');
      } else {
        sb.insert(pos, ')');
      }
      genPar(pos + 1, n, open, close + 1);
    }
    
    if (open < n) {
      if (sb.length() > pos) {
        sb.setCharAt(pos, '(');
      } else {
        sb.insert(pos, '(');
      }
      genPar(pos + 1, n, open + 1, close);
    }
  }
}
