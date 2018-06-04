// https://www.interviewbit.com/problems/sort-by-color/

public class Solution {
	public void sortColors(ArrayList<Integer> a) {
	    
    int lo = 0;
    int hi = a.size() - 1;
    int mid = 0, temp = 0;
    
    while (mid <= hi) {
        
        switch(a.get(mid)) {
            
            case 0: {
                temp = a.get(lo);
                a.set(lo, a.get(mid));
                a.set(mid, temp);
                lo++;
                mid++;
                break;
            }
            
            case 1:
                mid++;
                break;
                
              case 2: {
                  temp = a.get(mid);
                  a.set(mid, a.get(hi));
                  a.set(hi, temp);
                  hi--;
                  break;
              }
        }
	    }
	}
}
