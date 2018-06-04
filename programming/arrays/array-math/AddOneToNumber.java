// https://www.interviewbit.com/problems/add-one-to-number/

public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
    
        ListIterator<Integer> i = a.listIterator(a.size());
        
        while(i.hasPrevious()) {
        
          int index = i.previousIndex();
          int num = i.previous();
          
          num += 1;
          if (num / 10 <= 0) {
            
            a.set(index, num);
            break;
          } else {
            
          	a.set(index, num % 10);
            if (index == 0) {
            	a.add(0, 1);
            }
          }
        }
        
        int maxIndex = -1;
        ListIterator<Integer> it = a.listIterator();
        while(it.hasNext()) {
          int index = it.nextIndex();
          int num = it.next();
          if (num != 0) {
          	break;
          } else {
            maxIndex = index;
          }
        }
        
        if (maxIndex != -1) {
          for (int x = maxIndex ; x >= 0; x--) {
          
            a.remove(x);
          }
        }
        
        return a;
	}
}
