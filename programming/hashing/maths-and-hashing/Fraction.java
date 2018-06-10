// https://www.interviewbit.com/problems/fraction/

public class Solution {
  public String fractionToDecimal(int A, int B) {
      
    if (A == 0) return "0";
    if (B == 0) return "";
    
    StringBuilder result = new StringBuilder();
    if ((A < 0) ^ (B < 0)) result.append('-');
    
    long num = A, den = B;
    num = Math.abs(num);
    den = Math.abs(den);
    
    long quot = num / den;
    result.append(quot);
    
    long rem = (num % den) * 10;
    if (rem == 0) return result.toString();
    
    HashMap<Long, Integer> map = new HashMap<>();
    result.append('.');
    while (rem != 0) {
        
      if (map.containsKey(rem)) {
        int index       = map.get(rem);
        String nonRec   = result.substring(0, index);
        String rec      = result.substring(index);
        
        result = new StringBuilder();
        result.append(nonRec).append('(');
        result.append(rec).append(')');
        return result.toString();
      }
      
      map.put(rem, result.length());
      quot = rem / den;
      result.append(quot);
      rem = (rem % den) * 10;
    }
    
    return result.toString();
  }
}
